package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3182f4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final Lr f30608a;

    /* renamed from: c, reason: collision with root package name */
    public final String f30610c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30611d;

    /* renamed from: f, reason: collision with root package name */
    public String f30613f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3448k1 f30614g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f30616j;

    /* renamed from: k, reason: collision with root package name */
    public long f30617k;

    /* renamed from: l, reason: collision with root package name */
    public TP f30618l;

    /* renamed from: m, reason: collision with root package name */
    public int f30619m;

    /* renamed from: n, reason: collision with root package name */
    public int f30620n;

    /* renamed from: h, reason: collision with root package name */
    public int f30615h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f30623q = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f30609b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f30621o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f30622p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f30612e = "video/mp2t";

    public C3182f4(String str, int i, int i4) {
        this.f30608a = new Lr(new byte[i4]);
        this.f30610c = str;
        this.f30611d = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f30615h = 0;
        this.i = 0;
        this.f30616j = 0;
        this.f30623q = com.anythink.basead.exoplayer.b.f6539b;
        this.f30609b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void c(Lr lr) {
        int i;
        byte b9;
        int i4;
        byte b10;
        int i9;
        long j9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17 = 4;
        this.f30614g.getClass();
        while (lr.B() > 0) {
            int i18 = this.f30615h;
            Lr lr2 = this.f30608a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        int i19 = -2147483647;
                        if (i18 != 3) {
                            if (i18 == i17) {
                                i9 = i17;
                                if (f(lr, lr2.f26233a, 6)) {
                                    Er S8 = PA.S(lr2.f26233a);
                                    S8.f(32);
                                    int P8 = PA.P(S8, PA.f26852C) + 1;
                                    this.f30622p = P8;
                                    int i20 = this.i;
                                    if (i20 > P8) {
                                        int i21 = i20 - P8;
                                        this.i = i20 - i21;
                                        lr.E(lr.f26234b - i21);
                                    }
                                    this.f30615h = 5;
                                }
                            } else if (i18 != 5) {
                                int min = Math.min(lr.B(), this.f30619m - this.i);
                                this.f30614g.a(min, lr);
                                int i22 = this.i + min;
                                this.i = i22;
                                if (i22 == this.f30619m) {
                                    PA.T(this.f30623q != com.anythink.basead.exoplayer.b.f6539b);
                                    this.f30614g.b(this.f30623q, this.f30620n == i17 ? 0 : 1, this.f30619m, 0, null);
                                    this.f30623q += this.f30617k;
                                    this.f30615h = 0;
                                }
                            } else if (f(lr, lr2.f26233a, this.f30622p)) {
                                AtomicInteger atomicInteger = this.f30609b;
                                byte[] bArr = lr2.f26233a;
                                i9 = i17;
                                Er S9 = PA.S(bArr);
                                int h9 = S9.h(32);
                                int P9 = PA.P(S9, PA.f26873y);
                                int i23 = P9 + 1;
                                char c4 = h9 == 1078008818 ? (char) 1 : (char) 0;
                                if (c4 == 0) {
                                    j9 = -9223372036854775807L;
                                } else {
                                    if (!S9.g()) {
                                        throw W4.c("Only supports full channel mask-based audio presentation");
                                    }
                                    int i24 = P9 - 1;
                                    int i25 = bArr[i24] << 8;
                                    int i26 = bArr[P9] & 255;
                                    String str = AbstractC3548lu.f32613a;
                                    char c9 = 65535;
                                    for (int i27 = 0; i27 < i24; i27++) {
                                        byte b11 = bArr[i27];
                                        int i28 = ((c9 >> '\f') ^ ((b11 & 255) >> 4)) & com.anythink.basead.exoplayer.k.p.f8630b;
                                        int[] iArr = AbstractC3548lu.f32620h;
                                        char c10 = (char) (((char) (c9 << 4)) ^ iArr[i28]);
                                        c9 = (char) (iArr[((b11 & 15) ^ (c10 >> '\f')) & com.anythink.basead.exoplayer.k.p.f8630b] ^ ((char) (c10 << 4)));
                                    }
                                    if ((((char) i25) | i26) != c9) {
                                        throw W4.a(null, "CRC check failed");
                                    }
                                    int h10 = S9.h(2);
                                    if (h10 != 0) {
                                        if (h10 == 1) {
                                            i11 = 480;
                                        } else {
                                            if (h10 != 2) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 51);
                                                sb.append("Unsupported base duration index in DTS UHD header: ");
                                                sb.append(h10);
                                                throw W4.a(null, sb.toString());
                                            }
                                            i11 = 384;
                                        }
                                        i10 = 3;
                                    } else {
                                        i10 = 3;
                                        i11 = 512;
                                    }
                                    int h11 = S9.h(i10) + 1;
                                    int h12 = S9.h(2);
                                    if (h12 == 0) {
                                        i12 = 32000;
                                    } else if (h12 == 1) {
                                        i12 = 44100;
                                    } else {
                                        if (h12 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(h12).length() + 48);
                                            sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb2.append(h12);
                                            throw W4.a(null, sb2.toString());
                                        }
                                        i12 = 48000;
                                    }
                                    if (S9.g()) {
                                        S9.f(36);
                                    }
                                    i19 = i12 * (1 << S9.h(2));
                                    j9 = AbstractC3548lu.w(i11 * h11, 1000000L, i12, RoundingMode.DOWN);
                                }
                                int i29 = i19;
                                int i30 = 0;
                                for (char c11 = 0; c11 < c4; c11 = 1) {
                                    i30 += PA.P(S9, PA.f26874z);
                                }
                                for (int i31 = 0; i31 <= 0; i31++) {
                                    if (c4 != 0) {
                                        atomicInteger.set(PA.P(S9, PA.f26850A));
                                    }
                                    i30 += atomicInteger.get() != 0 ? PA.P(S9, PA.f26851B) : 0;
                                }
                                int i32 = i23 + i30;
                                C4202y0 c4202y0 = new C4202y0("audio/vnd.dts.uhd;profile=p2", 2, i29, i32, j9);
                                if (this.f30620n == 3) {
                                    g(c4202y0);
                                }
                                this.f30619m = i32;
                                this.f30617k = j9 == com.anythink.basead.exoplayer.b.f6539b ? 0L : j9;
                                lr2.E(0);
                                this.f30614g.a(this.f30622p, lr2);
                                this.f30615h = 6;
                            } else {
                                continue;
                            }
                            i17 = i9;
                        } else {
                            int i33 = i17;
                            int i34 = 8;
                            if (f(lr, lr2.f26233a, this.f30621o)) {
                                Er S10 = PA.S(lr2.f26233a);
                                S10.f(40);
                                int h13 = S10.h(2);
                                boolean g9 = S10.g();
                                int i35 = true != g9 ? 16 : 20;
                                S10.f(true != g9 ? 8 : 12);
                                int h14 = S10.h(i35) + 1;
                                boolean g10 = S10.g();
                                if (g10) {
                                    i13 = S10.h(2);
                                    int h15 = S10.h(3) + 1;
                                    if (S10.g()) {
                                        S10.f(36);
                                    }
                                    int h16 = S10.h(3) + 1;
                                    int h17 = S10.h(3) + 1;
                                    if (h16 != 1 || h17 != 1) {
                                        throw W4.c("Multiple audio presentations or assets not supported");
                                    }
                                    int i36 = h13 + 1;
                                    int h18 = S10.h(i36);
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if (((h18 >> i37) & 1) == 1) {
                                            S10.f(i34);
                                        }
                                        i37++;
                                        i34 = 8;
                                    }
                                    i14 = h15 * 512;
                                    if (S10.g()) {
                                        S10.f(2);
                                        int h19 = (S10.h(2) + 1) << 2;
                                        int h20 = S10.h(2) + 1;
                                        for (int i38 = 0; i38 < h20; i38++) {
                                            S10.f(h19);
                                        }
                                    }
                                } else {
                                    i13 = -1;
                                    i14 = 0;
                                }
                                S10.f(i35);
                                S10.f(12);
                                if (g10) {
                                    if (S10.g()) {
                                        S10.f(i33);
                                    }
                                    if (S10.g()) {
                                        S10.f(24);
                                    }
                                    if (S10.g()) {
                                        S10.l(S10.h(10) + 1);
                                    }
                                    S10.f(5);
                                    i19 = PA.f26872x[S10.h(4)];
                                    i15 = S10.h(8) + 1;
                                } else {
                                    i15 = -1;
                                }
                                int i39 = i19;
                                if (g10) {
                                    if (i13 == 0) {
                                        i16 = 32000;
                                    } else if (i13 == 1) {
                                        i16 = 44100;
                                    } else {
                                        if (i13 != 2) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 51);
                                            sb3.append("Unsupported reference clock code in DTS HD header: ");
                                            sb3.append(i13);
                                            throw W4.a(null, sb3.toString());
                                        }
                                        i16 = 48000;
                                    }
                                    j10 = AbstractC3548lu.w(i14, 1000000L, i16, RoundingMode.DOWN);
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                g(new C4202y0(com.anythink.basead.exoplayer.k.o.f8582F, i15, i39, h14, j10));
                                this.f30619m = h14;
                                this.f30617k = j10 == com.anythink.basead.exoplayer.b.f6539b ? 0L : j10;
                                lr2.E(0);
                                this.f30614g.a(this.f30621o, lr2);
                                this.f30615h = 6;
                            }
                        }
                    } else if (f(lr, lr2.f26233a, 7)) {
                        Er S11 = PA.S(lr2.f26233a);
                        S11.f(42);
                        this.f30621o = S11.h(true != S11.g() ? 8 : 12) + 1;
                        this.f30615h = 3;
                    }
                } else if (f(lr, lr2.f26233a, 18)) {
                    byte[] bArr2 = lr2.f26233a;
                    if (this.f30618l == null) {
                        String str2 = this.f30613f;
                        Er S12 = PA.S(bArr2);
                        S12.f(60);
                        int i40 = PA.f26869u[S12.h(6)];
                        int i41 = PA.f26870v[S12.h(4)];
                        int h21 = S12.h(5);
                        int i42 = h21 >= 29 ? -1 : (PA.f26871w[h21] * 1000) / 2;
                        S12.f(10);
                        int i43 = i40 + (S12.h(2) > 0 ? 1 : 0);
                        C4065vP c4065vP = new C4065vP();
                        c4065vP.f34773a = str2;
                        c4065vP.d("video/mp2t");
                        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8580D);
                        c4065vP.f34780h = i42;
                        c4065vP.f34765F = i43;
                        c4065vP.f34767H = i41;
                        c4065vP.f34789r = null;
                        c4065vP.f34776d = this.f30610c;
                        c4065vP.f34778f = this.f30611d;
                        TP tp = new TP(c4065vP);
                        this.f30618l = tp;
                        this.f30614g.e(tp);
                    }
                    this.f30619m = PA.z(bArr2);
                    byte b12 = bArr2[0];
                    if (b12 != -2) {
                        if (b12 == -1) {
                            i = (bArr2[4] & 7) << 4;
                            b10 = bArr2[7];
                        } else if (b12 != 31) {
                            i = (bArr2[4] & 1) << 6;
                            b9 = bArr2[5];
                        } else {
                            i = (bArr2[5] & 7) << 4;
                            b10 = bArr2[6];
                        }
                        i4 = b10 & 60;
                        this.f30617k = AbstractC3194fG.c(AbstractC3548lu.v(this.f30618l.f27756I, (((i4 >> 2) | i) + 1) * 32));
                        lr2.E(0);
                        this.f30614g.a(18, lr2);
                        this.f30615h = 6;
                    } else {
                        i = (bArr2[5] & 1) << 6;
                        b9 = bArr2[4];
                    }
                    i4 = b9 & 252;
                    this.f30617k = AbstractC3194fG.c(AbstractC3548lu.v(this.f30618l.f27756I, (((i4 >> 2) | i) + 1) * 32));
                    lr2.E(0);
                    this.f30614g.a(18, lr2);
                    this.f30615h = 6;
                }
                i17 = 4;
            } else {
                while (lr.B() > 0) {
                    int i44 = this.f30616j << 8;
                    this.f30616j = i44;
                    int K8 = i44 | lr.K();
                    this.f30616j = K8;
                    int e6 = PA.e(K8);
                    this.f30620n = e6;
                    if (e6 != 0) {
                        byte[] bArr3 = lr2.f26233a;
                        int i45 = this.f30616j;
                        bArr3[0] = (byte) ((i45 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
                        bArr3[1] = (byte) ((i45 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
                        bArr3[2] = (byte) ((i45 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
                        bArr3[3] = (byte) (i45 & com.anythink.basead.exoplayer.k.p.f8630b);
                        this.i = 4;
                        this.f30616j = 0;
                        if (e6 == 3 || e6 == 4) {
                            this.f30615h = 4;
                        } else if (e6 == 1) {
                            this.f30615h = 1;
                        } else {
                            this.f30615h = 2;
                        }
                        i17 = 4;
                    }
                }
                i17 = 4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f30623q = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f30613f = d42.f24338e;
        d42.b();
        this.f30614g = q02.x(d42.f24337d, 1);
    }

    public final boolean f(Lr lr, byte[] bArr, int i) {
        int min = Math.min(lr.B(), i - this.i);
        lr.H(bArr, this.i, min);
        int i4 = this.i + min;
        this.i = i4;
        return i4 == i;
    }

    public final void g(C4202y0 c4202y0) {
        int i;
        int i4 = c4202y0.f35297b;
        if (i4 == -2147483647 || (i = c4202y0.f35298c) == -1) {
            return;
        }
        TP tp = this.f30618l;
        String str = c4202y0.f35296a;
        if (tp != null && i == tp.f27754G && i4 == tp.f27756I && str.equals(tp.f27776o)) {
            return;
        }
        TP tp2 = this.f30618l;
        C4065vP c4065vP = tp2 == null ? new C4065vP() : new C4065vP(tp2);
        c4065vP.f34773a = this.f30613f;
        c4065vP.d(this.f30612e);
        c4065vP.e(str);
        c4065vP.f34765F = i;
        c4065vP.f34767H = i4;
        c4065vP.f34776d = this.f30610c;
        c4065vP.f34778f = this.f30611d;
        TP tp3 = new TP(c4065vP);
        this.f30618l = tp3;
        this.f30614g.e(tp3);
    }
}
