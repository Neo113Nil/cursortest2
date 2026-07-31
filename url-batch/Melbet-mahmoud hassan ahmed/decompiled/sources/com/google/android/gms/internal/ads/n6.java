package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8943a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8944b = Log.isLoggable(f8943a, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f8945c = n6.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d(f8943a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f8943a, e(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(f8943a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        if (f8944b) {
            Log.v(f8943a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i7 = 2;
        while (true) {
            if (i7 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i7].getClassName().equals(f8945c)) {
                String className = stackTrace[i7].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i7].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            }
            i7++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
