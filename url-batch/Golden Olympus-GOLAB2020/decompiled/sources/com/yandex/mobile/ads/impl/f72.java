package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class f72 {
    public static long a(int i4, int i5, sf1 sf1Var) {
        sf1Var.e(i4);
        if (sf1Var.a() < 5) {
            return -9223372036854775807L;
        }
        int h4 = sf1Var.h();
        if ((8388608 & h4) != 0 || ((2096896 & h4) >> 8) != i5 || (h4 & 32) == 0 || sf1Var.t() < 7 || sf1Var.a() < 7 || (sf1Var.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        sf1Var.a(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }
}
