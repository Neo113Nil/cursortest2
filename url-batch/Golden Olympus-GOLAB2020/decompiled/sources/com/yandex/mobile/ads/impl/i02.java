package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class i02 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f27041a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(lz lzVar) {
        return a(lzVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(q70 q70Var, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        long b4 = q70Var.b();
        long j4 = -1;
        int i6 = (b4 > (-1L) ? 1 : (b4 == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i6 != 0 && b4 <= 4096) {
            j5 = b4;
        }
        int i7 = (int) j5;
        sf1 sf1Var = new sf1(64);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < i7) {
            sf1Var.c(8);
            if (!q70Var.b(sf1Var.c(), i8, 8, true)) {
                break;
            }
            long v4 = sf1Var.v();
            int h4 = sf1Var.h();
            if (v4 == 1) {
                q70Var.a(sf1Var.c(), 8, 8);
                sf1Var.d(16);
                z7 = i8;
                i4 = i9;
                i5 = 16;
                v4 = sf1Var.p();
            } else {
                if (v4 == 0) {
                    long b5 = q70Var.b();
                    if (b5 != j4) {
                        v4 = (b5 - q70Var.d()) + 8;
                    }
                }
                z7 = i8;
                i4 = i9;
                i5 = 8;
            }
            long j6 = i5;
            if (v4 < j6) {
                return z7;
            }
            int i10 = i4 + i5;
            boolean z9 = z7;
            if (h4 == 1836019574) {
                i7 += (int) v4;
                if (i6 != 0 && i7 > b4) {
                    i7 = (int) b4;
                }
                i9 = i10;
                i8 = z9 ? 1 : 0;
                j4 = -1;
            } else {
                if (h4 == 1836019558 || h4 == 1836475768) {
                    z6 = true;
                    break;
                }
                int i11 = i6;
                if ((i10 + v4) - j6 >= i7) {
                    break;
                }
                int i12 = (int) (v4 - j6);
                i9 = i10 + i12;
                if (h4 == 1718909296) {
                    if (i12 < 8) {
                        return z9;
                    }
                    sf1Var.c(i12);
                    q70Var.a(sf1Var.c(), z9 ? 1 : 0, i12);
                    int i13 = i12 / 4;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (i14 != 1) {
                            int h5 = sf1Var.h();
                            if ((h5 >>> 8) != 3368816 && (h5 != 1751476579 || !z5)) {
                                int[] iArr = f27041a;
                                for (int i15 = 0; i15 < 29; i15++) {
                                    if (iArr[i15] != h5) {
                                    }
                                }
                            }
                            z8 = true;
                            break;
                        }
                        sf1Var.f(4);
                    }
                    if (!z8) {
                        return false;
                    }
                } else if (i12 != 0) {
                    q70Var.b(i12);
                }
                i6 = i11;
                j4 = -1;
                i8 = 0;
            }
        }
        z6 = false;
        return z8 && z4 == z6;
    }

    public static boolean a(q70 q70Var, boolean z4) {
        return a(q70Var, false, z4);
    }
}
