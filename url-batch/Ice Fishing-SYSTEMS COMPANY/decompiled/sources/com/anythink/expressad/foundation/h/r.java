package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19844a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19845b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19846c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19847d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19848e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19849f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f19850g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f19851h = false;
    private static final String i = "anythink_";

    static {
        if (com.anythink.expressad.a.f17776a) {
            return;
        }
        f19844a = false;
        f19845b = false;
        f19846c = false;
        f19847d = false;
        f19848e = false;
        f19849f = false;
        f19850g = false;
        f19851h = false;
    }

    private r() {
    }

    private static void a(String str, String str2) {
        if (!f19844a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2);
    }

    private static void b(String str, String str2) {
        if (!f19845b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    private static void c(String str, String str2) {
        if (!f19846c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    private static void d(String str, String str2) {
        if (!f19847d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    private static void e(String str, String str2) {
        if (!f19848e || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!f19848e || str2 == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static void a(String str, String str2, Throwable th) {
        if (!f19844a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2, th);
    }

    private static void b(String str, String str2, Throwable th) {
        if (!f19845b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    private static void c(String str, String str2, Throwable th) {
        if (!f19846c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2, th);
    }

    private static void d(String str, String str2, Throwable th) {
        if (!f19847d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static void a(String str, Throwable th) {
        if (!f19847d || th == null) {
            return;
        }
        Log.w(a(str), th);
    }

    private static void a(Context context, String str) {
        if (f19849f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? i.concat(String.valueOf(str)) : str;
    }
}
