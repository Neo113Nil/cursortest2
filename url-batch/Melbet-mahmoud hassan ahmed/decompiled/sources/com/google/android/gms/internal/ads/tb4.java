package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12168a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f12169b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f12170c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f12171d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f12172e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f12173f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f12174g = 0;

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b7 = bArr[4];
            return e((b7 & 192) >> 6, b7 & 63);
        }
        int i7 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i7 + i7;
    }

    public static c0 b(dr2 dr2Var, String str, String str2, u74 u74Var) {
        int i7 = f12169b[(dr2Var.s() & 192) >> 6];
        int s7 = dr2Var.s();
        int i8 = f12171d[(s7 & 56) >> 3];
        if ((s7 & 4) != 0) {
            i8++;
        }
        bf4 bf4Var = new bf4();
        bf4Var.h(str);
        bf4Var.s("audio/ac3");
        bf4Var.e0(i8);
        bf4Var.t(i7);
        bf4Var.b(u74Var);
        bf4Var.k(str2);
        return bf4Var.y();
    }

    public static c0 c(dr2 dr2Var, String str, String str2, u74 u74Var) {
        dr2Var.g(2);
        int i7 = f12169b[(dr2Var.s() & 192) >> 6];
        int s7 = dr2Var.s();
        int i8 = f12171d[(s7 & 14) >> 1];
        if ((s7 & 1) != 0) {
            i8++;
        }
        if (((dr2Var.s() & 30) >> 1) > 0 && (2 & dr2Var.s()) != 0) {
            i8 += 2;
        }
        String str3 = (dr2Var.i() <= 0 || (dr2Var.s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        bf4 bf4Var = new bf4();
        bf4Var.h(str);
        bf4Var.s(str3);
        bf4Var.e0(i8);
        bf4Var.t(i7);
        bf4Var.b(u74Var);
        bf4Var.k(str2);
        return bf4Var.y();
    }

    public static sb4 d(cq2 cq2Var) {
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int c7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b7 = cq2Var.b();
        cq2Var.j(40);
        int c8 = cq2Var.c(5);
        cq2Var.h(b7);
        int i17 = -1;
        if (c8 > 10) {
            cq2Var.j(16);
            int c9 = cq2Var.c(2);
            if (c9 == 0) {
                i17 = 0;
            } else if (c9 == 1) {
                i17 = 1;
            } else if (c9 == 2) {
                i17 = 2;
            }
            cq2Var.j(3);
            int c10 = cq2Var.c(11) + 1;
            int i18 = c10 + c10;
            int c11 = cq2Var.c(2);
            if (c11 == 3) {
                i13 = f12170c[cq2Var.c(2)];
                c7 = 3;
                i12 = 6;
            } else {
                c7 = cq2Var.c(2);
                i12 = f12168a[c7];
                i13 = f12169b[c11];
            }
            int i19 = i12 * 256;
            int c12 = cq2Var.c(3);
            boolean l7 = cq2Var.l();
            int i20 = f12171d[c12] + (l7 ? 1 : 0);
            cq2Var.j(10);
            if (cq2Var.l()) {
                cq2Var.j(8);
            }
            if (c12 == 0) {
                cq2Var.j(5);
                if (cq2Var.l()) {
                    cq2Var.j(8);
                }
                i14 = 0;
                c12 = 0;
            } else {
                i14 = c12;
            }
            if (i17 == 1) {
                if (cq2Var.l()) {
                    cq2Var.j(16);
                }
                i15 = 1;
            } else {
                i15 = i17;
            }
            if (cq2Var.l()) {
                if (i14 > 2) {
                    cq2Var.j(2);
                }
                if ((i14 & 1) != 0 && i14 > 2) {
                    cq2Var.j(6);
                }
                if ((i14 & 4) != 0) {
                    cq2Var.j(6);
                }
                if (l7 && cq2Var.l()) {
                    cq2Var.j(5);
                }
                if (i15 == 0) {
                    if (cq2Var.l()) {
                        cq2Var.j(6);
                    }
                    if (i14 == 0 && cq2Var.l()) {
                        cq2Var.j(6);
                    }
                    if (cq2Var.l()) {
                        cq2Var.j(6);
                    }
                    int c13 = cq2Var.c(2);
                    if (c13 == 1) {
                        cq2Var.j(5);
                    } else if (c13 == 2) {
                        cq2Var.j(12);
                    } else if (c13 == 3) {
                        int c14 = cq2Var.c(5);
                        if (cq2Var.l()) {
                            cq2Var.j(5);
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                cq2Var.j(4);
                            }
                            if (cq2Var.l()) {
                                if (cq2Var.l()) {
                                    cq2Var.j(4);
                                }
                                if (cq2Var.l()) {
                                    cq2Var.j(4);
                                }
                            }
                        }
                        if (cq2Var.l()) {
                            cq2Var.j(5);
                            if (cq2Var.l()) {
                                cq2Var.j(7);
                                if (cq2Var.l()) {
                                    cq2Var.j(8);
                                    cq2Var.j((c14 + 2) * 8);
                                    cq2Var.d();
                                }
                            }
                        }
                        cq2Var.j((c14 + 2) * 8);
                        cq2Var.d();
                    }
                    if (i14 < 2) {
                        if (cq2Var.l()) {
                            cq2Var.j(14);
                        }
                        if (c12 == 0 && cq2Var.l()) {
                            cq2Var.j(14);
                        }
                    }
                    if (cq2Var.l()) {
                        if (c7 == 0) {
                            cq2Var.j(5);
                            i15 = 0;
                            c7 = 0;
                        } else {
                            for (int i21 = 0; i21 < i12; i21++) {
                                if (cq2Var.l()) {
                                    cq2Var.j(5);
                                }
                            }
                        }
                    }
                    i15 = 0;
                }
            }
            if (cq2Var.l()) {
                cq2Var.j(5);
                if (i14 == 2) {
                    cq2Var.j(4);
                    i14 = 2;
                }
                if (i14 >= 6) {
                    cq2Var.j(2);
                }
                if (cq2Var.l()) {
                    i16 = 8;
                    cq2Var.j(8);
                } else {
                    i16 = 8;
                }
                if (i14 == 0 && cq2Var.l()) {
                    cq2Var.j(i16);
                }
                if (c11 < 3) {
                    cq2Var.i();
                }
            }
            if (i15 == 0 && c7 != 3) {
                cq2Var.i();
            }
            if (i15 == 2 && (c7 == 3 || cq2Var.l())) {
                cq2Var.j(6);
            }
            str = (cq2Var.l() && cq2Var.c(6) == 1 && cq2Var.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i17;
            i7 = i18;
            i11 = i19;
            i8 = i13;
            i9 = i20;
        } else {
            cq2Var.j(32);
            int c15 = cq2Var.c(2);
            String str2 = c15 == 3 ? null : "audio/ac3";
            int e7 = e(c15, cq2Var.c(6));
            cq2Var.j(8);
            int c16 = cq2Var.c(3);
            if ((c16 & 1) != 0 && c16 != 1) {
                cq2Var.j(2);
            }
            if ((c16 & 4) != 0) {
                cq2Var.j(2);
            }
            if (c16 == 2) {
                cq2Var.j(2);
            }
            str = str2;
            i7 = e7;
            i8 = c15 < 3 ? f12169b[c15] : -1;
            i9 = f12171d[c16] + (cq2Var.l() ? 1 : 0);
            i10 = -1;
            i11 = 1536;
        }
        return new sb4(str, i10, i9, i8, i7, i11, null);
    }

    private static int e(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || i9 >= 19) {
            return -1;
        }
        int i10 = f12169b[i7];
        if (i10 == 44100) {
            int i11 = f12173f[i9] + (i8 & 1);
            return i11 + i11;
        }
        int i12 = f12172e[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }
}
