package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8862a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(pc4 pc4Var) {
        return c(pc4Var, true, false);
    }

    public static boolean b(pc4 pc4Var, boolean z6) {
        return c(pc4Var, false, false);
    }

    private static boolean c(pc4 pc4Var, boolean z6, boolean z7) {
        boolean z8;
        long c7 = pc4Var.c();
        long j7 = 4096;
        long j8 = -1;
        if (c7 != -1 && c7 <= 4096) {
            j7 = c7;
        }
        int i7 = (int) j7;
        dr2 dr2Var = new dr2(64);
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = false;
        while (i8 < i7) {
            dr2Var.c(8);
            if (!pc4Var.n(dr2Var.h(), z9 ? 1 : 0, 8, true)) {
                break;
            }
            long A = dr2Var.A();
            int m7 = dr2Var.m();
            int i9 = 16;
            if (A == 1) {
                pc4Var.f(dr2Var.h(), 8, 8);
                dr2Var.e(16);
                A = dr2Var.z();
            } else {
                if (A == 0) {
                    long c8 = pc4Var.c();
                    if (c8 != j8) {
                        A = 8 + (c8 - pc4Var.g());
                    }
                }
                i9 = 8;
            }
            long j9 = i9;
            if (A < j9) {
                return z9;
            }
            i8 += i9;
            if (m7 == 1836019574) {
                i7 += (int) A;
                if (c7 != -1 && i7 > c7) {
                    i7 = (int) c7;
                }
                j8 = -1;
            } else {
                if (m7 == 1836019558 || m7 == 1836475768) {
                    z8 = true;
                    break;
                }
                long j10 = c7;
                if ((i8 + A) - j9 >= i7) {
                    break;
                }
                int i10 = (int) (A - j9);
                i8 += i10;
                if (m7 == 1718909296) {
                    if (i10 < 8) {
                        return false;
                    }
                    dr2Var.c(i10);
                    pc4Var.f(dr2Var.h(), 0, i10);
                    int i11 = i10 >> 2;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (i12 != 1) {
                            int m8 = dr2Var.m();
                            if ((m8 >>> 8) != 3368816) {
                                if (m8 == 1751476579) {
                                    m8 = 1751476579;
                                }
                                int[] iArr = f8862a;
                                for (int i13 = 0; i13 < 29; i13++) {
                                    if (iArr[i13] != m8) {
                                    }
                                }
                            }
                            z10 = true;
                            break;
                        }
                        dr2Var.g(4);
                    }
                    if (!z10) {
                        return false;
                    }
                } else if (i10 != 0) {
                    pc4Var.E(i10);
                }
                j8 = -1;
                c7 = j10;
                z9 = false;
            }
        }
        z8 = false;
        return z10 && z6 == z8;
    }
}
