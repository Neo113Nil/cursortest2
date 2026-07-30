package com.anythink.core.common.v;

import android.util.Log;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f16994a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16995b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16996c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f16997d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f16998e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f16999f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f17000g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f17001h = false;

    private n() {
    }

    private static void a(String str, String str2, Throwable th) {
        if (f16996c) {
            Log.v(str, str2, th);
        }
    }

    private static void b(String str, String str2) {
        if (f16996c) {
            Log.v(str, str2);
        }
    }

    private static void c(String str, String str2) {
        if (f16997d) {
            Log.d(str, str2);
        }
    }

    private static void d(String str, String str2) {
        if (f16998e) {
            Log.i(str, str2);
        }
    }

    private static void e(String str, String str2) {
        if (f16999f) {
            Log.w(str, str2);
        }
    }

    private static void f(String str, String str2) {
        if (f17000g) {
            Log.e(str, str2);
        }
    }

    private static void a(String str, Throwable th) {
        if (f16999f) {
            Log.w(str, th);
        }
    }

    private static void b(String str, String str2, Throwable th) {
        if (f16997d) {
            Log.d(str, str2, th);
        }
    }

    private static void c(String str, String str2, Throwable th) {
        if (f16998e) {
            Log.i(str, str2, th);
        }
    }

    private static void d(String str, String str2, Throwable th) {
        if (f16999f) {
            Log.w(str, str2, th);
        }
    }

    private static void e(String str, String str2, Throwable th) {
        if (f17000g) {
            Log.e(str, str2, th);
        }
    }

    public static void a(String str, String str2) {
        if (f16998e) {
            int length = 2001 - str.length();
            while (str2.length() > length) {
                Log.d(str, str2.substring(0, length));
                str2 = str2.substring(length);
            }
            Log.d(str, str2);
        }
    }

    private static void b(String str, String str2, Object... objArr) {
        if (f16997d) {
            try {
                Log.i(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    private static void c(String str, String str2, Object... objArr) {
        if (f16997d) {
            try {
                Log.w(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    private static void d(String str, String str2, Object... objArr) {
        if (f17000g) {
            try {
                Log.e(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    private static void a(String str, String str2, Object... objArr) {
        if (f16997d) {
            try {
                Log.d(str, String.format(str2, objArr) + " threadId=" + Thread.currentThread().getId());
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
