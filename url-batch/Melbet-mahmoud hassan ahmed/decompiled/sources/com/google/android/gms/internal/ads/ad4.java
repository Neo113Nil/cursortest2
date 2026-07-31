package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ad4 {
    public static c91 a(pc4 pc4Var, boolean z6) {
        c91 a7 = new hd4().a(pc4Var, z6 ? null : vf4.f13338a);
        if (a7 == null || a7.a() == 0) {
            return null;
        }
        return a7;
    }

    public static cd4 b(dr2 dr2Var) {
        dr2Var.g(1);
        int u6 = dr2Var.u();
        long k7 = dr2Var.k() + u6;
        int i7 = u6 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long z6 = dr2Var.z();
            if (z6 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = z6;
            jArr2[i8] = dr2Var.z();
            dr2Var.g(2);
            i8++;
        }
        dr2Var.g((int) (k7 - dr2Var.k()));
        return new cd4(jArr, jArr2);
    }
}
