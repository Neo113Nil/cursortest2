package com.baidu.mshield.b.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f8314a = -1;

    static {
        new ThreadLocal();
    }

    public static void a(int i8, String str) {
    }

    public static void b(String str) {
        int i8 = f8314a;
        if (i8 == -1 || i8 == 0 || i8 == 1) {
            a(1, str);
        }
    }

    public static void c(String str) {
        int i8 = f8314a;
        if (i8 == -1 || i8 == 0 || i8 == 1 || i8 == 2) {
            a(2, str);
        }
    }

    public static void a(Throwable th) {
    }

    public static void a(String str) {
        b(str);
    }
}
