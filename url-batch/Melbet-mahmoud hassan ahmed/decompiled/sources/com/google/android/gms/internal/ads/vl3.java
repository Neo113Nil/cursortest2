package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vl3 {

    /* renamed from: a, reason: collision with root package name */
    private static final dq3<vl3> f13441a = new ul3();

    public static int a(int i7) {
        if (i7 != 1) {
            return i7 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 4;
        }
        if (i7 != 3) {
            return i7 != 4 ? 0 : 6;
        }
        return 5;
    }
}
