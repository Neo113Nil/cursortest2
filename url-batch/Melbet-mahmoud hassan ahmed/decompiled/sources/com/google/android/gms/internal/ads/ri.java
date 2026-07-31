package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ri {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f11165a = {zm.g("isom"), zm.g("iso2"), zm.g("iso3"), zm.g("iso4"), zm.g("iso5"), zm.g("iso6"), zm.g("avc1"), zm.g("hvc1"), zm.g("hev1"), zm.g("mp41"), zm.g("mp42"), zm.g("3g2a"), zm.g("3g2b"), zm.g("3gr6"), zm.g("3gs6"), zm.g("3ge6"), zm.g("3gg6"), zm.g("M4V "), zm.g("M4A "), zm.g("f4v "), zm.g("kddi"), zm.g("M4VP"), zm.g("qt  "), zm.g("MSNV")};

    public static boolean a(bh bhVar) {
        return c(bhVar, true);
    }

    public static boolean b(bh bhVar) {
        return c(bhVar, false);
    }

    private static boolean c(bh bhVar, boolean z6) {
        boolean z7;
        long c7 = bhVar.c();
        if (c7 == -1 || c7 > 4096) {
            c7 = 4096;
        }
        int i7 = (int) c7;
        rm rmVar = new rm(64);
        int i8 = 0;
        boolean z8 = false;
        while (i8 < i7) {
            rmVar.s(8);
            bhVar.g(rmVar.f11225a, 0, 8, false);
            long m7 = rmVar.m();
            int e7 = rmVar.e();
            int i9 = 16;
            if (m7 == 1) {
                bhVar.g(rmVar.f11225a, 8, 8, false);
                rmVar.u(16);
                m7 = rmVar.n();
            } else {
                i9 = 8;
            }
            long j7 = i9;
            if (m7 < j7) {
                return false;
            }
            i8 += i9;
            if (e7 != ai.C) {
                if (e7 == ai.L || e7 == ai.N) {
                    z7 = true;
                    break;
                }
                if ((i8 + m7) - j7 >= i7) {
                    break;
                }
                int i10 = (int) (m7 - j7);
                i8 += i10;
                if (e7 == ai.f2775b) {
                    if (i10 < 8) {
                        return false;
                    }
                    rmVar.s(i10);
                    bhVar.g(rmVar.f11225a, 0, i10, false);
                    int i11 = i10 >> 2;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (i12 != 1) {
                            int e8 = rmVar.e();
                            if ((e8 >>> 8) != zm.g("3gp")) {
                                int[] iArr = f11165a;
                                int length = iArr.length;
                                for (int i13 = 0; i13 < 24; i13++) {
                                    if (iArr[i13] != e8) {
                                    }
                                }
                            }
                            z8 = true;
                            break;
                        }
                        rmVar.w(4);
                    }
                    if (!z8) {
                        return false;
                    }
                } else if (i10 != 0) {
                    bhVar.f(i10, false);
                }
            }
        }
        z7 = false;
        return z8 && z6 == z7;
    }
}
