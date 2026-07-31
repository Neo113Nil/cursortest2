package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dk3 {

    /* renamed from: a, reason: collision with root package name */
    private static final dq3<dk3> f4240a = new ck3();

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
        if (i7 == 3) {
            return 5;
        }
        if (i7 != 4) {
            return i7 != 5 ? 0 : 7;
        }
        return 6;
    }
}
