package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pb0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mb0 {
    public static pb0.a a(sf1 sf1Var) {
        sf1Var.f(1);
        int w4 = sf1Var.w();
        long d4 = sf1Var.d() + w4;
        int i4 = w4 / 18;
        long[] jArr = new long[i4];
        long[] jArr2 = new long[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long p4 = sf1Var.p();
            if (p4 == -1) {
                jArr = Arrays.copyOf(jArr, i5);
                jArr2 = Arrays.copyOf(jArr2, i5);
                break;
            }
            jArr[i5] = p4;
            jArr2[i5] = sf1Var.p();
            sf1Var.f(2);
            i5++;
        }
        sf1Var.f((int) (d4 - sf1Var.d()));
        return new pb0.a(jArr, jArr2);
    }
}
