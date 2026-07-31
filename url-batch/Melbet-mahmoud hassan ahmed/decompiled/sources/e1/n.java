package e1;

import o2.a0;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15969a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i7, boolean z6) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z6) {
            return true;
        }
        for (int i8 : f15969a) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(w0.m mVar) {
        return c(mVar, true, false);
    }

    private static boolean c(w0.m mVar, boolean z6, boolean z7) {
        boolean z8;
        long a7 = mVar.a();
        long j7 = 4096;
        long j8 = -1;
        if (a7 != -1 && a7 <= 4096) {
            j7 = a7;
        }
        int i7 = (int) j7;
        a0 a0Var = new a0(64);
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = false;
        while (i8 < i7) {
            a0Var.K(8);
            if (!mVar.l(a0Var.d(), z9 ? 1 : 0, 8, true)) {
                break;
            }
            long E = a0Var.E();
            int m7 = a0Var.m();
            int i9 = 16;
            if (E == 1) {
                mVar.n(a0Var.d(), 8, 8);
                a0Var.N(16);
                E = a0Var.v();
            } else {
                if (E == 0) {
                    long a8 = mVar.a();
                    if (a8 != j8) {
                        E = 8 + (a8 - mVar.m());
                    }
                }
                i9 = 8;
            }
            long j9 = i9;
            if (E < j9) {
                return z9;
            }
            i8 += i9;
            if (m7 == 1836019574) {
                i7 += (int) E;
                if (a7 != -1 && i7 > a7) {
                    i7 = (int) a7;
                }
                j8 = -1;
            } else {
                if (m7 == 1836019558 || m7 == 1836475768) {
                    z8 = true;
                    break;
                }
                long j10 = a7;
                if ((i8 + E) - j9 >= i7) {
                    break;
                }
                int i10 = (int) (E - j9);
                i8 += i10;
                if (m7 == 1718909296) {
                    if (i10 < 8) {
                        return false;
                    }
                    a0Var.K(i10);
                    mVar.n(a0Var.d(), 0, i10);
                    int i11 = i10 / 4;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        }
                        if (i12 == 1) {
                            a0Var.P(4);
                        } else if (a(a0Var.m(), z7)) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (!z10) {
                        return false;
                    }
                } else if (i10 != 0) {
                    mVar.o(i10);
                }
                j8 = -1;
                a7 = j10;
                z9 = false;
            }
        }
        z8 = false;
        return z10 && z6 == z8;
    }

    public static boolean d(w0.m mVar, boolean z6) {
        return c(mVar, false, z6);
    }
}
