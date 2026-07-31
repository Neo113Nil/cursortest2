package com.my.tracker.obfuscated;

import android.util.Log;

/* renamed from: com.my.tracker.obfuscated.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1708y2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f21578a = false;

    public static void a(String str) {
        if (f21578a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    public static void b(String str) {
        if (f21578a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTracker]", str);
    }

    public static void a(String str, Throwable th) {
        if (f21578a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th);
        }
    }

    public static void b(String str, Throwable th) {
        if (f21578a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }

    public static boolean a() {
        return f21578a;
    }

    public static void a(boolean z4) {
        f21578a = z4;
    }
}
