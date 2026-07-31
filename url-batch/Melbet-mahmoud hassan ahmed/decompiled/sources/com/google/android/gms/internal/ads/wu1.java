package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class wu1 {
    public static int a(int i7, int i8, int i9) {
        if (i7 < 0 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return i7;
    }

    public static <T> T b(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException();
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }
}
