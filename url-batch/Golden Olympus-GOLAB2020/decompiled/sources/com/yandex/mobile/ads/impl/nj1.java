package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class nj1 {
    private static String a(int i4, int i5, String str) {
        if (i4 < 0) {
            return x22.a("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return x22.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(C1877de.a("negative size: ", i5));
    }

    public static void b(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(a(i4, i5, FirebaseAnalytics.Param.INDEX));
        }
    }

    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i4, int i5) {
        String a4;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                a4 = x22.a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i4));
            } else if (i5 >= 0) {
                a4 = x22.a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i4), Integer.valueOf(i5));
            } else {
                throw new IllegalArgumentException(C1877de.a("negative size: ", i5));
            }
            throw new IndexOutOfBoundsException(a4);
        }
    }

    public static <T> T a(T t4) {
        t4.getClass();
        return t4;
    }

    public static void a(int i4, int i5, int i6) {
        String a4;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                a4 = a(i4, i6, "start index");
            } else if (i5 >= 0 && i5 <= i6) {
                a4 = x22.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                a4 = a(i5, i6, "end index");
            }
            throw new IndexOutOfBoundsException(a4);
        }
    }
}
