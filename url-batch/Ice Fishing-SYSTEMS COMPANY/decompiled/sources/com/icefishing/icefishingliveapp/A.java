package com.icefishing.icefishingliveapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences.Editor f36498b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f36499a;

    public A(SplashActivity splashActivity) {
        SharedPreferences sharedPreferences = splashActivity.getSharedPreferences("HeartRate", 0);
        this.f36499a = sharedPreferences;
        f36498b = sharedPreferences.edit();
    }

    public A(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f36499a = sharedPreferences;
        File file = new File(E.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e6) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
            }
        }
    }
}
