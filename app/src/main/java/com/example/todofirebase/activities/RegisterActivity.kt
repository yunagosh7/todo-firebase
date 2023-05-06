package com.example.todofirebase.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todofirebase.R
import com.example.todofirebase.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            finish()
        }



    }
}