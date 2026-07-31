package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class jm {
    public static int a(int i7, int i8, int i9) {
        if (i7 < 0 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void c(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void e(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void f(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException((String) obj);
        }
    }
}
