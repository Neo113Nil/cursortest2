package com.liulishuo.filedownloader.util;

import android.util.Log;

/* loaded from: classes4.dex */
public class d {
    public static boolean NEED_LOG = false;
    private static final String TAG = "FileDownloader.";

    public static void d(Object obj, String str, Object... objArr) {
        log(3, obj, str, objArr);
    }

    public static void e(Object obj, Throwable th, String str, Object... objArr) {
        log(6, obj, th, str, objArr);
    }

    private static String getTag(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
        return sb.toString();
    }

    public static void i(Object obj, String str, Object... objArr) {
        log(4, obj, str, objArr);
    }

    private static void log(int i8, Object obj, String str, Object... objArr) {
        log(i8, obj, null, str, objArr);
    }

    public static void v(Object obj, String str, Object... objArr) {
        log(2, obj, str, objArr);
    }

    public static void w(Object obj, String str, Object... objArr) {
        log(5, obj, str, objArr);
    }

    public static void e(Object obj, String str, Object... objArr) {
        log(6, obj, str, objArr);
    }

    private static void log(int i8, Object obj, Throwable th, String str, Object... objArr) {
        if (i8 < 5 && !NEED_LOG) {
            return;
        }
        Log.println(i8, getTag(obj), f.formatString(str, objArr));
        if (th != null) {
            th.printStackTrace();
        }
    }
}
