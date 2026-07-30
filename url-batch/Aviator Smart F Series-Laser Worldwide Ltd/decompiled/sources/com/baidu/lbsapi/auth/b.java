package com.baidu.lbsapi.auth;

import android.util.Log;

/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4311a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f4312b = "BaiduApiAuth";

    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return stackTraceElement.getFileName() + "[" + stackTraceElement.getLineNumber() + "]";
    }

    public static void b(String str) {
        if (!f4311a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.e(f4312b, a() + ";" + str);
    }

    public static void c(String str) {
        if (Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.i(f4312b, str);
    }

    public static void a(String str) {
        if (!f4311a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.d(f4312b, a() + ";" + str);
    }
}
