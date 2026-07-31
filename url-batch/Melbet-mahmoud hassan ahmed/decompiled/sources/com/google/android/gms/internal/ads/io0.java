package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public class io0 {

    /* renamed from: a, reason: collision with root package name */
    protected static final z43 f6719a = z43.b(4000);

    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void b(String str) {
        if (j(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z6 = true;
            for (String str2 : f6719a.d(str)) {
                if (z6) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z6 = false;
            }
        }
    }

    public static void c(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z6 = true;
            for (String str2 : f6719a.d(str)) {
                if (z6) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z6 = false;
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z6 = true;
            for (String str2 : f6719a.d(str)) {
                if (z6) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z6 = false;
            }
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z6 = true;
            for (String str2 : f6719a.d(str)) {
                if (z6) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z6 = false;
            }
        }
    }

    public static void h(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void i(String str, Throwable th) {
        if (j(5)) {
            String a7 = a(str);
            if (th != null) {
                h(a7, th);
            } else {
                g(a7);
            }
        }
    }

    public static boolean j(int i7) {
        return i7 >= 5 || Log.isLoggable("Ads", i7);
    }
}
