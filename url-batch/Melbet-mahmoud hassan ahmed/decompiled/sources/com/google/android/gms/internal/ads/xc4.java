package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xc4 {
    public static int a(dr2 dr2Var, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return dr2Var.s() + 1;
            case c4.w0.f2149o /* 7 */:
                return dr2Var.w() + 1;
            case c4.w0.f2150p /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static long b(pc4 pc4Var, dd4 dd4Var) {
        pc4Var.i();
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.o(1, false);
        byte[] bArr = new byte[1];
        jc4Var.n(bArr, 0, 1, false);
        int i7 = bArr[0] & 1;
        jc4Var.o(2, false);
        int i8 = 1 != i7 ? 6 : 7;
        dr2 dr2Var = new dr2(i8);
        dr2Var.e(sc4.a(pc4Var, dr2Var.h(), 0, i8));
        pc4Var.i();
        wc4 wc4Var = new wc4();
        if (d(dr2Var, dd4Var, 1 == i7, wc4Var)) {
            return wc4Var.f13793a;
        }
        throw dz.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r7 != r18.f4176f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if ((r17.s() * 1000) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r4 == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(dr2 dr2Var, dd4 dd4Var, int i7, wc4 wc4Var) {
        int a7;
        int k7 = dr2Var.k();
        long A = dr2Var.A();
        long j7 = A >>> 16;
        if (j7 != i7) {
            return false;
        }
        boolean z6 = (j7 & 1) == 1;
        int i8 = (int) ((A >> 12) & 15);
        int i9 = (int) ((A >> 8) & 15);
        int i10 = (int) (15 & (A >> 4));
        int i11 = (int) ((A >> 1) & 7);
        long j8 = A & 1;
        if (i10 > 7 ? !(i10 > 10 || dd4Var.f4177g != 2) : i10 == dd4Var.f4177g - 1) {
            if ((i11 == 0 || i11 == dd4Var.f4179i) && j8 != 1 && d(dr2Var, dd4Var, z6, wc4Var) && (a7 = a(dr2Var, i8)) != -1 && a7 <= dd4Var.f4172b) {
                int i12 = dd4Var.f4175e;
                if (i9 != 0) {
                    if (i9 > 11) {
                        if (i9 != 12) {
                            if (i9 <= 14) {
                                int w6 = dr2Var.w();
                                if (i9 == 14) {
                                    w6 *= 10;
                                }
                            }
                        }
                    }
                }
                if (dr2Var.s() == n13.N(dr2Var.h(), k7, dr2Var.k() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean d(dr2 dr2Var, dd4 dd4Var, boolean z6, wc4 wc4Var) {
        try {
            long C = dr2Var.C();
            if (!z6) {
                C *= dd4Var.f4172b;
            }
            wc4Var.f13793a = C;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
