package com.baidu.ar;

/* loaded from: classes.dex */
public class o9 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o6 f2909a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile n6 f2910b;

    public static n6 a() {
        if (f2910b != null) {
            return f2910b;
        }
        if (c() && f2910b == null) {
            f2910b = (n6) ab.a("com.baidu.ar.obr.OBRCache");
        }
        return f2910b;
    }

    public static o6 b() {
        if (f2909a != null) {
            return f2909a;
        }
        if (d() && f2909a == null) {
            f2909a = (o6) ab.a("com.baidu.ar.obr.OBRDownloader");
        }
        return f2909a;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static void e() {
        if (f2909a != null) {
            f2909a.release();
            f2909a = null;
        }
        if (f2910b != null) {
            f2910b.release();
            f2910b = null;
        }
    }
}
