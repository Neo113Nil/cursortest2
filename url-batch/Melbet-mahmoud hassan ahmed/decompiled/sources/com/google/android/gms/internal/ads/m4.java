package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m4 {
    public static int a(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static long b(dr2 dr2Var, int i7, int i8) {
        dr2Var.f(i7);
        if (dr2Var.i() < 5) {
            return -9223372036854775807L;
        }
        int m7 = dr2Var.m();
        if ((8388608 & m7) != 0 || ((m7 >> 8) & 8191) != i8 || (m7 & 32) == 0 || dr2Var.s() < 7 || dr2Var.i() < 7 || (dr2Var.s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        dr2Var.b(bArr, 0, 6);
        byte b7 = bArr[0];
        long j7 = bArr[3] & 255;
        return ((bArr[1] & 255) << 17) | ((b7 & 255) << 25) | ((bArr[2] & 255) << 9) | (j7 + j7) | ((bArr[4] & 255) >> 7);
    }
}
