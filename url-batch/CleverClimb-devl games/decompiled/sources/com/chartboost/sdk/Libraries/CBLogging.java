package com.chartboost.sdk.Libraries;

import android.util.Log;

/* loaded from: classes.dex */
public final class CBLogging {

    /* renamed from: a, reason: collision with root package name */
    public static Level f3567a = Level.INTEGRATION;

    public enum Level {
        NONE,
        INTEGRATION,
        ALL
    }

    public static void a(String str, String str2) {
        if (f3567a == Level.ALL) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f3567a == Level.ALL) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f3567a == Level.ALL) {
            Log.e(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        if (f3567a == Level.ALL) {
            Log.v(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f3567a == Level.ALL) {
            Log.v(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (f3567a == Level.ALL) {
            Log.w(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f3567a == Level.ALL) {
            Log.w(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f3567a == Level.ALL) {
            Log.i(str, str2);
        }
    }
}
