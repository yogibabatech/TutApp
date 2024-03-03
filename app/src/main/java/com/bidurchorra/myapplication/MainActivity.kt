package com.bidurchorra.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonReading = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.Linearlayout)
        val nextScreen = findViewById<Button>(R.id.nextScreen)


        buttonReading.setOnClickListener {
            layout.setBackgroundColor(R.color.yellow)

        }

        buttonDark.setOnClickListener {
            layout.setBackgroundColor(R.color.black)

        }

        nextScreen.setOnClickListener {
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

    }

}