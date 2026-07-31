package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yd4 {
    public static int a(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    public static vd4 b(dr2 dr2Var, boolean z6, boolean z7) {
        if (z6) {
            c(3, dr2Var, false);
        }
        String F = dr2Var.F((int) dr2Var.y(), c43.f3729c);
        long y6 = dr2Var.y();
        String[] strArr = new String[(int) y6];
        int length = F.length() + 15;
        for (int i7 = 0; i7 < y6; i7++) {
            String F2 = dr2Var.F((int) dr2Var.y(), c43.f3729c);
            strArr[i7] = F2;
            length = length + 4 + F2.length();
        }
        if (z7 && (dr2Var.s() & 1) == 0) {
            throw dz.a("framing bit expected to be set", null);
        }
        return new vd4(F, strArr, length + 1);
    }

    public static boolean c(int i7, dr2 dr2Var, boolean z6) {
        if (dr2Var.i() < 7) {
            if (z6) {
                return false;
            }
            int i8 = dr2Var.i();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(i8);
            throw dz.a(sb.toString(), null);
        }
        if (dr2Var.s() != i7) {
            if (z6) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i7));
            throw dz.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        }
        if (dr2Var.s() == 118 && dr2Var.s() == 111 && dr2Var.s() == 114 && dr2Var.s() == 98 && dr2Var.s() == 105 && dr2Var.s() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw dz.a("expected characters 'vorbis'", null);
    }
}
