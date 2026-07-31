package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.fh;

/* loaded from: classes2.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19553a;

    public static void d(String str, String str2) {
        if (f19553a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f19553a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i4) {
        f19553a = fh.d.MODE_0.a() != i4;
    }

    public static void i(String str, String str2) {
        if (f19553a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f19553a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f19553a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f19553a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f19553a) {
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f19553a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        if (f19553a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f19553a) {
            Log.w(str, str2, th);
        }
    }
}
