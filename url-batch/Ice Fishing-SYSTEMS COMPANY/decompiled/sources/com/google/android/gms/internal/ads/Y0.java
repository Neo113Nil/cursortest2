package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f28757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28763g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28764h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28765j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28766k;

    /* renamed from: l, reason: collision with root package name */
    public final float f28767l;

    /* renamed from: m, reason: collision with root package name */
    public final int f28768m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28769n;

    /* renamed from: o, reason: collision with root package name */
    public final C2518Df f28770o;

    public Y0(List list, int i, int i4, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f6, int i17, String str, C2518Df c2518Df) {
        this.f28757a = list;
        this.f28758b = i;
        this.f28759c = i4;
        this.f28760d = i9;
        this.f28761e = i10;
        this.f28762f = i11;
        this.f28763g = i12;
        this.f28764h = i13;
        this.i = i14;
        this.f28765j = i15;
        this.f28766k = i16;
        this.f28767l = f6;
        this.f28768m = i17;
        this.f28769n = str;
        this.f28770o = c2518Df;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Y0 a(Lr lr, boolean z8, C2518Df c2518Df) {
        boolean z9;
        boolean z10;
        int i;
        int i4;
        char c4;
        J6.i iVar;
        int i9;
        int i10;
        int i11;
        int i12 = 4;
        boolean z11 = true;
        if (z8) {
            try {
                lr.G(4);
            } catch (ArrayIndexOutOfBoundsException e6) {
                e = e6;
                z10 = true;
                throw W4.a(e, "Error parsing".concat(z10 != z8 ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                lr.G(21);
            } catch (ArrayIndexOutOfBoundsException e9) {
                e = e9;
                z9 = z11;
                z10 = z9;
                throw W4.a(e, "Error parsing".concat(z10 != z8 ? "HEVC config" : "L-HEVC config"));
            }
        }
        int K8 = lr.K() & 3;
        int K9 = lr.K();
        int i13 = lr.f26234b;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < K9; i16++) {
            lr.G(1);
            int L8 = lr.L();
            for (int i17 = 0; i17 < L8; i17++) {
                int L9 = lr.L();
                i15 += L9 + 4;
                lr.G(L9);
            }
        }
        lr.E(i13);
        byte[] bArr = new byte[i15];
        C2518Df c2518Df2 = c2518Df;
        int i18 = 0;
        float f6 = 1.0f;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        String str = null;
        int i29 = 0;
        while (i29 < K9) {
            int K10 = lr.K() & 63;
            int L10 = lr.L();
            z9 = z11;
            int i30 = i14;
            C2518Df c2518Df3 = c2518Df2;
            while (i30 < L10) {
                try {
                    int L11 = lr.L();
                    int i31 = i30;
                    System.arraycopy(PA.f26862N, i14, bArr, i18, i12);
                    int i32 = i18 + 4;
                    System.arraycopy(lr.f26233a, lr.f26234b, bArr, i32, L11);
                    int i33 = 32;
                    if (K10 != 32) {
                        i33 = K10;
                    } else if (i31 == 0) {
                        c2518Df3 = PA.L(bArr, i32, i32 + L11);
                        i4 = i32;
                        i = K8;
                        i10 = 0;
                        i9 = 0;
                        c4 = '?';
                        i18 = i4 + L11;
                        lr.G(L11);
                        i30 = i10 + 1;
                        i12 = 4;
                        i14 = i9;
                        K8 = i;
                    }
                    i = K8;
                    if (i33 != 33) {
                        i4 = i32;
                        int i34 = 8;
                        if (i33 == 39 && i31 == 0) {
                            int i35 = i18 + 6;
                            int i36 = (i4 + L11) - 1;
                            while (true) {
                                byte b9 = bArr[i36];
                                if (b9 != 0) {
                                    if (b9 != 0) {
                                        if (i36 > i35) {
                                            B0 b02 = new B0(bArr, i35, i36 + 1);
                                            while (b02.j(16)) {
                                                int i37 = i34;
                                                int l9 = b02.l(i37);
                                                int i38 = 0;
                                                while (l9 == 255) {
                                                    i38 += com.anythink.basead.exoplayer.k.p.f8630b;
                                                    l9 = b02.l(i37);
                                                }
                                                int i39 = i38 + l9;
                                                int l10 = b02.l(i37);
                                                int i40 = 0;
                                                while (l10 == 255) {
                                                    i40 += com.anythink.basead.exoplayer.k.p.f8630b;
                                                    l10 = b02.l(8);
                                                }
                                                i34 = 8;
                                                int i41 = i40 + l10;
                                                if (i41 == 0) {
                                                    break;
                                                }
                                                if (b02.j(i41)) {
                                                    if (i39 == 176) {
                                                        int n9 = b02.n();
                                                        boolean k6 = b02.k();
                                                        int n10 = k6 ? b02.n() : 0;
                                                        int n11 = b02.n();
                                                        int i42 = -1;
                                                        int i43 = 0;
                                                        while (i43 <= n11) {
                                                            int n12 = b02.n();
                                                            b02.n();
                                                            int i44 = i43;
                                                            int l11 = b02.l(6);
                                                            if (l11 == 63) {
                                                                c4 = '?';
                                                            } else {
                                                                b02.l(l11 == 0 ? Math.max(0, n9 - 30) : Math.max(0, (l11 + n9) - 31));
                                                                if (k6) {
                                                                    int l12 = b02.l(6);
                                                                    if (l12 == 63) {
                                                                        c4 = '?';
                                                                    } else {
                                                                        b02.l(l12 == 0 ? Math.max(0, n10 - 30) : Math.max(0, (l12 + n10) - 31));
                                                                    }
                                                                }
                                                                if (b02.k()) {
                                                                    b02.h(10);
                                                                }
                                                                i43 = i44 + 1;
                                                                i42 = n12;
                                                            }
                                                            iVar = null;
                                                            break;
                                                        }
                                                        c4 = '?';
                                                        iVar = new J6.i(i42, 7);
                                                    } else {
                                                        b02.h(i41 * 8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c4 = '?';
                                    iVar = null;
                                    break;
                                } else {
                                    if (i36 <= i35) {
                                        break;
                                    }
                                    i36--;
                                }
                            }
                            iVar = null;
                            c4 = '?';
                            if (iVar == null || c2518Df3 == null) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                                if (iVar.f1421u == ((C3230fy) ((UB) c2518Df3.f24453u).get(0)).f30923b) {
                                    i10 = i31;
                                    i27 = 4;
                                    i18 = i4 + L11;
                                    lr.G(L11);
                                    i30 = i10 + 1;
                                    i12 = 4;
                                    i14 = i9;
                                    K8 = i;
                                } else {
                                    i27 = 5;
                                }
                            }
                            i10 = i31;
                            i18 = i4 + L11;
                            lr.G(L11);
                            i30 = i10 + 1;
                            i12 = 4;
                            i14 = i9;
                            K8 = i;
                        }
                    } else if (i31 == 0) {
                        Fz O8 = PA.O(bArr, i32, i32 + L11, c2518Df3);
                        int i45 = O8.f25066a + 1;
                        int i46 = O8.f25072g;
                        int i47 = O8.f25073h;
                        int i48 = O8.f25068c + 8;
                        i4 = i32;
                        int i49 = O8.f25069d + 8;
                        int i50 = O8.f25075k;
                        int i51 = O8.f25076l;
                        int i52 = O8.f25077m;
                        float f9 = O8.i;
                        int i53 = O8.f25074j;
                        Ky ky = O8.f25067b;
                        if (ky != null) {
                            i11 = i53;
                            str = AbstractC4295zm.a(ky.f26069a, ky.f26070b, ky.f26071c, ky.f26072d, ky.f26073e, ky.f26074f);
                        } else {
                            i11 = i53;
                        }
                        i26 = i52;
                        f6 = f9;
                        i28 = i11;
                        i10 = i31;
                        i23 = i49;
                        i24 = i50;
                        i25 = i51;
                        i22 = i48;
                        i20 = i46;
                        i21 = i47;
                        i9 = 0;
                        i19 = i45;
                        c4 = '?';
                        i18 = i4 + L11;
                        lr.G(L11);
                        i30 = i10 + 1;
                        i12 = 4;
                        i14 = i9;
                        K8 = i;
                    } else {
                        i4 = i32;
                    }
                    i9 = 0;
                    c4 = '?';
                    i10 = i31;
                    i18 = i4 + L11;
                    lr.G(L11);
                    i30 = i10 + 1;
                    i12 = 4;
                    i14 = i9;
                    K8 = i;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    e = e10;
                    z10 = z9;
                    throw W4.a(e, "Error parsing".concat(z10 != z8 ? "HEVC config" : "L-HEVC config"));
                }
            }
            i29++;
            c2518Df2 = c2518Df3;
            z11 = z9;
            K8 = K8;
            i12 = 4;
        }
        z9 = z11;
        return new Y0(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), K8 + 1, i19, i20, i21, i22, i23, i24, i25, i26, i27, f6, i28, str, c2518Df2);
    }
}
