package com.yandex.mobile.ads.impl;

import android.media.AudioManager;
import android.text.TextUtils;

/* renamed from: com.yandex.mobile.ads.impl.tf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2253tf {
    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T a(T t4) {
        t4.getClass();
        return t4;
    }

    public static Object a(AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager;
        }
        throw new IllegalStateException();
    }
}
