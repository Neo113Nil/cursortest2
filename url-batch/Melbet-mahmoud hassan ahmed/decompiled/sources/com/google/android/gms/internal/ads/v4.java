package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class v4 {
    public static t4 a(pc4 pc4Var) {
        u4 a7;
        byte[] bArr;
        dr2 dr2Var = new dr2(16);
        if (u4.a(pc4Var, dr2Var).f12625a != 1380533830) {
            return null;
        }
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.n(dr2Var.h(), 0, 4, false);
        dr2Var.f(0);
        int m7 = dr2Var.m();
        if (m7 != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m7);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            a7 = u4.a(pc4Var, dr2Var);
            if (a7.f12625a == 1718449184) {
                break;
            }
            jc4Var.o((int) a7.f12626b, false);
        }
        wu1.f(a7.f12626b >= 16);
        jc4Var.n(dr2Var.h(), 0, 16, false);
        dr2Var.f(0);
        int q7 = dr2Var.q();
        int q8 = dr2Var.q();
        int p7 = dr2Var.p();
        int p8 = dr2Var.p();
        int q9 = dr2Var.q();
        int q10 = dr2Var.q();
        int i7 = ((int) a7.f12626b) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            jc4Var.n(bArr2, 0, i7, false);
            bArr = bArr2;
        } else {
            bArr = n13.f8870f;
        }
        return new t4(q7, q8, p7, p8, q9, q10, bArr);
    }
}
