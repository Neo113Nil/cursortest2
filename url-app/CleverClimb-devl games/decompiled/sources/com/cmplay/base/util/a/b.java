package com.cmplay.base.util.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.cmplay.base.util.f;

/* compiled from: SharePreferenceHelper.java */
/* loaded from: classes.dex */
public class b extends f {
    public static void a(Context context) {
        f4012a = context.getApplicationContext();
        a();
    }

    protected static SharedPreferences a() {
        if (f4013b == null) {
            f4013b = f4012a.getSharedPreferences("apk_download_save_data", 0);
        }
        return f4013b;
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

    @SuppressLint({"NewApi"})
    private static void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
