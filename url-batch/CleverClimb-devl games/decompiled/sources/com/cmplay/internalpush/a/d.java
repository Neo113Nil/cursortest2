package com.cmplay.internalpush.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: SharePreferenceHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Context f4176a;

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f4177b;

    public static void a(Context context) {
        f4176a = context.getApplicationContext();
        a();
    }

    private static SharedPreferences a() {
        if (f4176a == null) {
            return null;
        }
        if (f4177b == null) {
            f4177b = f4176a.getSharedPreferences("openscreen_save_data", 0);
        }
        return f4177b;
    }

    public static String a(String str, String str2) {
        SharedPreferences a2 = a();
        return a2 == null ? str2 : a2.getString(str, str2);
    }

    public static void b(String str, String str2) {
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str, str2);
        a(edit);
    }

    public static int a(String str, int i) {
        SharedPreferences a2 = a();
        return a2 == null ? i : a2.getInt(str, i);
    }

    public static void b(String str, int i) {
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putInt(str, i);
        a(edit);
    }

    public static long a(String str, long j) {
        SharedPreferences a2 = a();
        return a2 == null ? j : a2.getLong(str, j);
    }

    public static void b(String str, long j) {
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putLong(str, j);
        a(edit);
    }

    @SuppressLint({"NewApi"})
    private static void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
