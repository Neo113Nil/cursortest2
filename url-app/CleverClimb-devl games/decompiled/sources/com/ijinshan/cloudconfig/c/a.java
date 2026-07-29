package com.ijinshan.cloudconfig.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* compiled from: CloudConfigEnv.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f6683a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f6684b = "";

    /* renamed from: c, reason: collision with root package name */
    private static int f6685c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6686d = true;
    private static volatile boolean e = true;
    private static volatile boolean f;
    private static String g;
    private static boolean h;
    private static boolean i;

    public static void a(String str, String str2, boolean z, boolean z2) {
        b(str);
        a(str2);
        h = z;
        i = z2;
    }

    public static String a() {
        return g;
    }

    public static void a(String str) {
        g = str;
    }

    public static boolean b() {
        return h;
    }

    public static boolean c() {
        return i;
    }

    public static void a(Context context) {
        if (f6683a == null) {
            f6683a = context;
        }
    }

    public static Context d() {
        return f6683a;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(f6684b)) {
            f6684b = str;
        }
    }

    public static String e() {
        return f6684b;
    }

    public static void f() {
        f = true;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                if (connectivityManager.getActiveNetworkInfo().isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        NetworkInfo networkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) {
                return false;
            }
            return networkInfo.getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception unused) {
            return false;
        }
    }
}
