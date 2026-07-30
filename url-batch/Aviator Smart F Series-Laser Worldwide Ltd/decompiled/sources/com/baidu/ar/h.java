package com.baidu.ar;

import android.util.Log;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f2345a = 2;

    public static String a() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(stackTraceElement.getFileName());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getLineNumber());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getMethodName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void b(String str) {
        b("ARLOG", a() + cn.hutool.core.text.l.SPACE + str);
    }

    public static void c(String str) {
        c("ARLOG", a() + cn.hutool.core.text.l.SPACE + str);
    }

    public static void d(String str) {
        d("ARLOG", a() + cn.hutool.core.text.l.SPACE + str);
    }

    public static void e(String str, String str2) {
        if (f2345a > 5) {
            return;
        }
        Log.w(str, str2);
    }

    public static void a(String str) {
        a("ARLOG", a() + cn.hutool.core.text.l.SPACE + str);
    }

    public static void b(String str, String str2) {
        if (f2345a > 6) {
            return;
        }
        Log.e(str, str2);
    }

    public static void c(String str, String str2) {
        if (f2345a > 4) {
            return;
        }
        Log.i(str, str2);
    }

    public static void d(String str, String str2) {
        if (f2345a > 2) {
            return;
        }
        Log.v(str, str2);
    }

    public static void a(String str, String str2) {
        if (f2345a > 3) {
            return;
        }
        Log.d(str, str2);
    }

    public static void a(boolean z7) {
        f2345a = z7 ? 2 : 6;
    }
}
