package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;

/* loaded from: classes.dex */
public final class i3 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final y3 f6502a;

    /* renamed from: b, reason: collision with root package name */
    private String f6503b;

    /* renamed from: c, reason: collision with root package name */
    private td4 f6504c;

    /* renamed from: d, reason: collision with root package name */
    private h3 f6505d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6506e;

    /* renamed from: l, reason: collision with root package name */
    private long f6513l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f6507f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final m3 f6508g = new m3(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final m3 f6509h = new m3(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final m3 f6510i = new m3(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final m3 f6511j = new m3(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final m3 f6512k = new m3(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f6514m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final dr2 f6515n = new dr2();

    public i3(y3 y3Var) {
        this.f6502a = y3Var;
    }

    private final void f(byte[] bArr, int i7, int i8) {
        this.f6505d.b(bArr, i7, i8);
        if (!this.f6506e) {
            this.f6508g.a(bArr, i7, i8);
            this.f6509h.a(bArr, i7, i8);
            this.f6510i.a(bArr, i7, i8);
        }
        this.f6511j.a(bArr, i7, i8);
        this.f6512k.a(bArr, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036f  */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        long j7;
        int i10;
        long j8;
        long j9;
        int i11;
        int i12;
        long j10;
        int i13;
        wu1.b(this.f6504c);
        int i14 = n13.f8865a;
        while (dr2Var.i() > 0) {
            int k7 = dr2Var.k();
            int l7 = dr2Var.l();
            byte[] h7 = dr2Var.h();
            this.f6513l += dr2Var.i();
            rd4.b(this.f6504c, dr2Var, dr2Var.i());
            while (k7 < l7) {
                int a7 = th2.a(h7, k7, l7, this.f6507f);
                if (a7 == l7) {
                    f(h7, k7, l7);
                    return;
                }
                int i15 = a7 + 3;
                int i16 = (h7[i15] & 126) >> 1;
                int i17 = a7 - k7;
                if (i17 > 0) {
                    f(h7, k7, a7);
                }
                int i18 = l7 - a7;
                long j11 = this.f6513l - i18;
                int i19 = i17 < 0 ? -i17 : 0;
                long j12 = this.f6514m;
                this.f6505d.a(j11, i18, this.f6506e);
                if (!this.f6506e) {
                    this.f6508g.d(i19);
                    this.f6509h.d(i19);
                    this.f6510i.d(i19);
                    if (this.f6508g.e() && this.f6509h.e() && this.f6510i.e()) {
                        td4 td4Var = this.f6504c;
                        String str = this.f6503b;
                        m3 m3Var = this.f6508g;
                        m3 m3Var2 = this.f6509h;
                        i8 = i15;
                        m3 m3Var3 = this.f6510i;
                        int i20 = m3Var.f8390e;
                        i7 = l7;
                        bArr = h7;
                        byte[] bArr2 = new byte[m3Var2.f8390e + i20 + m3Var3.f8390e];
                        i9 = i16;
                        System.arraycopy(m3Var.f8389d, 0, bArr2, 0, i20);
                        i10 = i18;
                        System.arraycopy(m3Var2.f8389d, 0, bArr2, m3Var.f8390e, m3Var2.f8390e);
                        System.arraycopy(m3Var3.f8389d, 0, bArr2, m3Var.f8390e + m3Var2.f8390e, m3Var3.f8390e);
                        es2 es2Var = new es2(m3Var2.f8389d, 0, m3Var2.f8390e);
                        es2Var.e(44);
                        int a8 = es2Var.a(3);
                        es2Var.d();
                        int a9 = es2Var.a(2);
                        boolean f7 = es2Var.f();
                        int a10 = es2Var.a(5);
                        int i21 = 0;
                        for (int i22 = 0; i22 < 32; i22++) {
                            if (es2Var.f()) {
                                i21 |= 1 << i22;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i23 = 0; i23 < 6; i23++) {
                            iArr[i23] = es2Var.a(8);
                        }
                        int a11 = es2Var.a(8);
                        int i24 = 0;
                        for (int i25 = 0; i25 < a8; i25++) {
                            if (es2Var.f()) {
                                i24 += 89;
                            }
                            if (es2Var.f()) {
                                i24 += 8;
                            }
                        }
                        es2Var.e(i24);
                        if (a8 > 0) {
                            int i26 = 8 - a8;
                            es2Var.e(i26 + i26);
                        }
                        es2Var.c();
                        int c7 = es2Var.c();
                        if (c7 == 3) {
                            es2Var.d();
                            c7 = 3;
                        }
                        int c8 = es2Var.c();
                        int c9 = es2Var.c();
                        if (es2Var.f()) {
                            int c10 = es2Var.c();
                            int c11 = es2Var.c();
                            int c12 = es2Var.c();
                            int c13 = es2Var.c();
                            if (c7 != 1) {
                                j7 = j11;
                                if (c7 == 2) {
                                    i13 = 2;
                                    c7 = 2;
                                } else {
                                    i13 = 1;
                                }
                            } else {
                                j7 = j11;
                                i13 = 2;
                            }
                            c8 -= i13 * (c10 + c11);
                            c9 -= (c7 == 1 ? 2 : 1) * (c12 + c13);
                        } else {
                            j7 = j11;
                        }
                        es2Var.c();
                        es2Var.c();
                        int c14 = es2Var.c();
                        int i27 = true != es2Var.f() ? a8 : 0;
                        while (true) {
                            es2Var.c();
                            es2Var.c();
                            es2Var.c();
                            if (i27 > a8) {
                                break;
                            } else {
                                i27++;
                            }
                        }
                        es2Var.c();
                        es2Var.c();
                        es2Var.c();
                        if (es2Var.f() && es2Var.f()) {
                            int i28 = 0;
                            for (int i29 = 4; i28 < i29; i29 = 4) {
                                int i30 = 0;
                                while (i30 < 6) {
                                    if (es2Var.f()) {
                                        j10 = j12;
                                        int min = Math.min(64, 1 << ((i28 + i28) + 4));
                                        if (i28 > 1) {
                                            es2Var.b();
                                        }
                                        for (int i31 = 0; i31 < min; i31++) {
                                            es2Var.b();
                                        }
                                    } else {
                                        es2Var.c();
                                        j10 = j12;
                                    }
                                    i30 += i28 == 3 ? 3 : 1;
                                    j12 = j10;
                                }
                                i28++;
                            }
                        }
                        j8 = j12;
                        es2Var.e(2);
                        if (es2Var.f()) {
                            es2Var.e(8);
                            es2Var.c();
                            es2Var.c();
                            es2Var.d();
                        }
                        int c15 = es2Var.c();
                        int i32 = 0;
                        boolean z6 = false;
                        int i33 = 0;
                        while (i32 < c15) {
                            if (i32 != 0) {
                                z6 = es2Var.f();
                            }
                            if (z6) {
                                es2Var.d();
                                es2Var.c();
                                for (int i34 = 0; i34 <= i33; i34++) {
                                    if (es2Var.f()) {
                                        es2Var.d();
                                    }
                                }
                                i12 = c15;
                            } else {
                                int c16 = es2Var.c();
                                int c17 = es2Var.c();
                                int i35 = c16 + c17;
                                i12 = c15;
                                for (int i36 = 0; i36 < c16; i36++) {
                                    es2Var.c();
                                    es2Var.d();
                                }
                                for (int i37 = 0; i37 < c17; i37++) {
                                    es2Var.c();
                                    es2Var.d();
                                }
                                i33 = i35;
                            }
                            i32++;
                            c15 = i12;
                        }
                        if (es2Var.f()) {
                            for (int i38 = 0; i38 < es2Var.c(); i38++) {
                                es2Var.e(c14 + 5);
                            }
                        }
                        es2Var.e(2);
                        float f8 = 1.0f;
                        if (es2Var.f()) {
                            if (es2Var.f()) {
                                int a12 = es2Var.a(8);
                                if (a12 == 255) {
                                    int a13 = es2Var.a(16);
                                    int a14 = es2Var.a(16);
                                    if (a13 != 0 && a14 != 0) {
                                        f8 = a13 / a14;
                                    }
                                } else if (a12 < 17) {
                                    f8 = th2.f12218b[a12];
                                } else {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Unexpected aspect_ratio_idc value: ");
                                    sb.append(a12);
                                    Log.w("H265Reader", sb.toString());
                                }
                            }
                            if (es2Var.f()) {
                                es2Var.d();
                            }
                            if (es2Var.f()) {
                                es2Var.e(4);
                                if (es2Var.f()) {
                                    es2Var.e(24);
                                }
                            }
                            if (es2Var.f()) {
                                es2Var.c();
                                es2Var.c();
                            }
                            es2Var.d();
                            if (es2Var.f()) {
                                c9 += c9;
                            }
                        }
                        String b7 = zw1.b(a9, f7, a10, i21, iArr, a11);
                        bf4 bf4Var = new bf4();
                        bf4Var.h(str);
                        bf4Var.s("video/hevc");
                        bf4Var.f0(b7);
                        bf4Var.x(c8);
                        bf4Var.f(c9);
                        bf4Var.p(f8);
                        bf4Var.i(Collections.singletonList(bArr2));
                        td4Var.b(bf4Var.y());
                        this.f6506e = true;
                        if (this.f6511j.d(i19)) {
                            j9 = j8;
                        } else {
                            m3 m3Var4 = this.f6511j;
                            this.f6515n.d(this.f6511j.f8389d, th2.b(m3Var4.f8389d, m3Var4.f8390e));
                            this.f6515n.g(5);
                            j9 = j8;
                            this.f6502a.a(j9, this.f6515n);
                        }
                        if (this.f6512k.d(i19)) {
                            m3 m3Var5 = this.f6512k;
                            this.f6515n.d(this.f6512k.f8389d, th2.b(m3Var5.f8389d, m3Var5.f8390e));
                            this.f6515n.g(5);
                            this.f6502a.a(j9, this.f6515n);
                        }
                        this.f6505d.d(j7, i10, i9, this.f6514m, this.f6506e);
                        if (this.f6506e) {
                            i11 = i9;
                            this.f6508g.c(i11);
                            this.f6509h.c(i11);
                            this.f6510i.c(i11);
                        } else {
                            i11 = i9;
                        }
                        this.f6511j.c(i11);
                        this.f6512k.c(i11);
                        k7 = i8;
                        l7 = i7;
                        h7 = bArr;
                    }
                }
                i7 = l7;
                bArr = h7;
                i8 = i15;
                i9 = i16;
                j7 = j11;
                i10 = i18;
                j8 = j12;
                if (this.f6511j.d(i19)) {
                }
                if (this.f6512k.d(i19)) {
                }
                this.f6505d.d(j7, i10, i9, this.f6514m, this.f6506e);
                if (this.f6506e) {
                }
                this.f6511j.c(i11);
                this.f6512k.c(i11);
                k7 = i8;
                l7 = i7;
                h7 = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f6513l = 0L;
        this.f6514m = -9223372036854775807L;
        th2.e(this.f6507f);
        this.f6508g.b();
        this.f6509h.b();
        this.f6510i.b();
        this.f6511j.b();
        this.f6512k.b();
        h3 h3Var = this.f6505d;
        if (h3Var != null) {
            h3Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f6503b = k4Var.b();
        td4 r7 = rc4Var.r(k4Var.a(), 2);
        this.f6504c = r7;
        this.f6505d = new h3(r7);
        this.f6502a.b(rc4Var, k4Var);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f6514m = j7;
        }
    }
}
