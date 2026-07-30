package com.anythink.basead.exoplayer.k;

import android.os.Looper;
import android.text.TextUtils;

/* renamed from: com.anythink.basead.exoplayer.k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544a {
    private C0544a() {
    }

    public static void a(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i, int i4) {
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static <T> T a(T t9) {
        t9.getClass();
        return t9;
    }

    private static <T> T a(T t9, Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    private static String a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    private static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }
}
