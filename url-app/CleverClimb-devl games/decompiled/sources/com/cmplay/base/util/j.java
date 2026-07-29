package com.cmplay.base.util;

import android.text.TextUtils;

/* compiled from: Configure.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static int f4023a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static int f4024b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static String f4025c = "cmplaysdk";

    /* renamed from: d, reason: collision with root package name */
    private static String f4026d = "";
    private static boolean e;

    public static String a() {
        if (TextUtils.isEmpty(f4025c)) {
            throw new RuntimeException("PRODUCT_TABLE_NAME_PREFIX must not be null!");
        }
        return f4025c;
    }

    public static void a(String str) {
        f4025c = str;
    }

    public static void b(String str) {
        f4026d = str;
    }

    public static String b() {
        if (TextUtils.isEmpty(f4026d)) {
            throw new RuntimeException("UNITY_RECEIVER must not be null!");
        }
        return f4026d;
    }

    public static void a(int i) {
        f4023a = i;
        h.a("internal_push", "setCloudFunctionType  CLOUD_FUNCTION_TYPE:" + f4023a);
    }

    public static int c() {
        return f4023a;
    }

    public static void b(int i) {
        f4024b = i;
    }

    public static int d() {
        return f4024b;
    }

    public static void a(boolean z) {
        e = z;
    }

    public static boolean e() {
        return e;
    }
}
