package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2964b4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29387a;

    /* renamed from: b, reason: collision with root package name */
    public final Er f29388b;

    /* renamed from: c, reason: collision with root package name */
    public final Lr f29389c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29390d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29391e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29392f;

    /* renamed from: g, reason: collision with root package name */
    public String f29393g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3448k1 f29394h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f29395j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29396k;

    /* renamed from: l, reason: collision with root package name */
    public long f29397l;

    /* renamed from: m, reason: collision with root package name */
    public TP f29398m;

    /* renamed from: n, reason: collision with root package name */
    public int f29399n;

    /* renamed from: o, reason: collision with root package name */
    public long f29400o;

    public C2964b4(int i, int i4, String str, String str2) {
        this.f29387a = i4;
        switch (i4) {
            case 1:
                Er er = new Er(new byte[16], 16);
                this.f29388b = er;
                this.f29389c = new Lr(er.f24829a);
                this.i = 0;
                this.f29395j = 0;
                this.f29396k = false;
                this.f29400o = com.anythink.basead.exoplayer.b.f6539b;
                this.f29390d = str;
                this.f29391e = i;
                this.f29392f = str2;
                break;
            default:
                Er er2 = new Er(new byte[128], 128);
                this.f29388b = er2;
                this.f29389c = new Lr(er2.f24829a);
                this.i = 0;
                this.f29400o = com.anythink.basead.exoplayer.b.f6539b;
                this.f29390d = str;
                this.f29391e = i;
                this.f29392f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        switch (this.f29387a) {
            case 0:
                this.i = 0;
                this.f29395j = 0;
                this.f29396k = false;
                this.f29400o = com.anythink.basead.exoplayer.b.f6539b;
                break;
            default:
                this.i = 0;
                this.f29395j = 0;
                this.f29396k = false;
                this.f29400o = com.anythink.basead.exoplayer.b.f6539b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        int i = this.f29387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        int i;
        int y6;
        int i4;
        int i9;
        int i10;
        String str;
        int i11;
        int h9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object[] objArr;
        switch (this.f29387a) {
            case 0:
                this.f29394h.getClass();
                while (lr.B() > 0) {
                    int i21 = this.i;
                    Lr lr2 = this.f29389c;
                    if (i21 == 0) {
                        while (true) {
                            if (lr.B() <= 0) {
                                break;
                            }
                            if (this.f29396k) {
                                int K8 = lr.K();
                                if (K8 == 119) {
                                    this.f29396k = false;
                                    this.i = 1;
                                    byte[] bArr = lr2.f26233a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f29395j = 2;
                                } else {
                                    this.f29396k = K8 == 11;
                                }
                            } else {
                                this.f29396k = lr.K() == 11;
                            }
                        }
                    } else if (i21 != 1) {
                        int min = Math.min(lr.B(), this.f29399n - this.f29395j);
                        this.f29394h.a(min, lr);
                        int i22 = this.f29395j + min;
                        this.f29395j = i22;
                        if (i22 == this.f29399n) {
                            PA.T(this.f29400o != com.anythink.basead.exoplayer.b.f6539b);
                            this.f29394h.b(this.f29400o, 1, this.f29399n, 0, null);
                            this.f29400o += this.f29397l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr2 = lr2.f26233a;
                        int min2 = Math.min(lr.B(), 128 - this.f29395j);
                        lr.H(bArr2, this.f29395j, min2);
                        int i23 = this.f29395j + min2;
                        this.f29395j = i23;
                        if (i23 == 128) {
                            Er er = this.f29388b;
                            er.d(0);
                            int i24 = (er.f24830b * 8) + er.f24831c;
                            er.f(40);
                            int h10 = er.h(5);
                            er.d(i24);
                            int[] iArr = AbstractC2655Lg.f26187x;
                            int[] iArr2 = AbstractC2655Lg.f26185v;
                            if (h10 > 10) {
                                er.f(16);
                                int h11 = er.h(2);
                                char c4 = h11 != 0 ? h11 != 1 ? h11 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                er.f(3);
                                int h12 = er.h(11) + 1;
                                int h13 = er.h(2);
                                if (h13 == 3) {
                                    i11 = AbstractC2655Lg.f26186w[er.h(2)];
                                    h9 = 3;
                                    i12 = 6;
                                } else {
                                    h9 = er.h(2);
                                    int i25 = AbstractC2655Lg.f26184u[h9];
                                    i11 = iArr2[h13];
                                    i12 = i25;
                                }
                                y6 = h12 + h12;
                                int i26 = (y6 * i11) / (i12 * 32);
                                int h14 = er.h(3);
                                boolean g9 = er.g();
                                i9 = iArr[h14] + (g9 ? 1 : 0);
                                er.f(10);
                                if (er.g()) {
                                    er.f(8);
                                }
                                if (h14 == 0) {
                                    er.f(5);
                                    if (er.g()) {
                                        er.f(8);
                                    }
                                    i13 = 0;
                                    h14 = 0;
                                } else {
                                    i13 = h14;
                                }
                                if (c4 == 1) {
                                    if (er.g()) {
                                        er.f(16);
                                    }
                                    c4 = 1;
                                }
                                if (er.g()) {
                                    if (i13 > 2) {
                                        er.f(2);
                                    }
                                    if ((i13 & 1) == 0 || i13 <= 2) {
                                        i17 = 6;
                                    } else {
                                        i17 = 6;
                                        er.f(6);
                                    }
                                    if ((i13 & 4) != 0) {
                                        er.f(i17);
                                    }
                                    if (g9 && er.g()) {
                                        er.f(5);
                                    }
                                    if (c4 == 0) {
                                        if (er.g()) {
                                            i18 = 6;
                                            er.f(6);
                                        } else {
                                            i18 = 6;
                                        }
                                        if (i13 == 0 && er.g()) {
                                            er.f(i18);
                                        }
                                        if (er.g()) {
                                            er.f(i18);
                                        }
                                        int h15 = er.h(2);
                                        if (h15 == 1) {
                                            er.f(5);
                                            i19 = 2;
                                        } else {
                                            if (h15 == 2) {
                                                er.f(12);
                                            } else if (h15 == 3) {
                                                int h16 = er.h(5);
                                                if (er.g()) {
                                                    er.f(5);
                                                    if (er.g()) {
                                                        i20 = 4;
                                                        er.f(4);
                                                    } else {
                                                        i20 = 4;
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        er.f(i20);
                                                    }
                                                    if (er.g()) {
                                                        if (er.g()) {
                                                            er.f(i20);
                                                        }
                                                        if (er.g()) {
                                                            er.f(i20);
                                                        }
                                                    }
                                                }
                                                if (er.g()) {
                                                    er.f(5);
                                                    if (er.g()) {
                                                        er.f(7);
                                                        if (er.g()) {
                                                            er.f(8);
                                                            i19 = 2;
                                                            er.f((h16 + i19) * 8);
                                                            er.k();
                                                        }
                                                    }
                                                }
                                                i19 = 2;
                                                er.f((h16 + i19) * 8);
                                                er.k();
                                            }
                                            i19 = 2;
                                        }
                                        if (i13 < i19) {
                                            if (er.g()) {
                                                er.f(14);
                                            }
                                            if (h14 == 0 && er.g()) {
                                                er.f(14);
                                            }
                                        }
                                        if (er.g()) {
                                            if (h9 == 0) {
                                                er.f(5);
                                                i14 = 0;
                                                c4 = 0;
                                                if (er.g()) {
                                                    er.f(5);
                                                    if (i13 == 2) {
                                                        er.f(4);
                                                        i13 = 2;
                                                    }
                                                    if (i13 >= 6) {
                                                        er.f(2);
                                                    }
                                                    if (er.g()) {
                                                        i16 = 8;
                                                        er.f(8);
                                                    } else {
                                                        i16 = 8;
                                                    }
                                                    if (i13 == 0 && er.g()) {
                                                        er.f(i16);
                                                    }
                                                    if (h13 < 3) {
                                                        er.e();
                                                    }
                                                }
                                                if (c4 == 0 && i14 != 3) {
                                                    er.e();
                                                }
                                                if (c4 == 2 || !(i14 == 3 || er.g())) {
                                                    i15 = 6;
                                                } else {
                                                    i15 = 6;
                                                    er.f(6);
                                                }
                                                str = (!er.g() && er.h(i15) == 1 && er.h(8) == 1) ? com.anythink.basead.exoplayer.k.o.f8578B : com.anythink.basead.exoplayer.k.o.f8577A;
                                                i10 = i12 * 256;
                                                i = i26;
                                            } else {
                                                for (int i27 = 0; i27 < i12; i27++) {
                                                    if (er.g()) {
                                                        er.f(5);
                                                    }
                                                }
                                            }
                                        }
                                        i14 = h9;
                                        c4 = 0;
                                        if (er.g()) {
                                        }
                                        if (c4 == 0) {
                                            er.e();
                                        }
                                        if (c4 == 2) {
                                        }
                                        i15 = 6;
                                        if (!er.g()) {
                                        }
                                        i10 = i12 * 256;
                                        i = i26;
                                    }
                                }
                                i14 = h9;
                                if (er.g()) {
                                }
                                if (c4 == 0) {
                                }
                                if (c4 == 2) {
                                }
                                i15 = 6;
                                if (!er.g()) {
                                }
                                i10 = i12 * 256;
                                i = i26;
                            } else {
                                er.f(32);
                                int h17 = er.h(2);
                                String str2 = h17 == 3 ? null : com.anythink.basead.exoplayer.k.o.f8625z;
                                int h18 = er.h(6);
                                i = AbstractC2655Lg.f26188y[h18 / 2] * 1000;
                                y6 = AbstractC2655Lg.y(h17, h18);
                                er.f(8);
                                int h19 = er.h(3);
                                if ((h19 & 1) == 0 || h19 == 1) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                    er.f(2);
                                }
                                if ((h19 & 4) != 0) {
                                    er.f(i4);
                                }
                                if (h19 == i4) {
                                    er.f(i4);
                                }
                                int i28 = h17 < 3 ? iArr2[h17] : -1;
                                i9 = iArr[h19] + (er.g() ? 1 : 0);
                                i10 = 1536;
                                str = str2;
                                i11 = i28;
                            }
                            TP tp = this.f29398m;
                            if (tp == null || i9 != tp.f27754G || i11 != tp.f27756I || !Objects.equals(str, tp.f27776o)) {
                                C4065vP c4065vP = new C4065vP();
                                c4065vP.f34773a = this.f29393g;
                                c4065vP.d(this.f29392f);
                                c4065vP.e(str);
                                c4065vP.f34765F = i9;
                                c4065vP.f34767H = i11;
                                c4065vP.f34776d = this.f29390d;
                                c4065vP.f34778f = this.f29391e;
                                c4065vP.i = i;
                                if (com.anythink.basead.exoplayer.k.o.f8625z.equals(str)) {
                                    c4065vP.f34780h = i;
                                }
                                TP tp2 = new TP(c4065vP);
                                this.f29398m = tp2;
                                this.f29394h.e(tp2);
                            }
                            this.f29399n = y6;
                            this.f29397l = (i10 * 1000000) / this.f29398m.f27756I;
                            lr2.E(0);
                            this.f29394h.a(128, lr2);
                            this.i = 2;
                        }
                    }
                }
                break;
            default:
                this.f29394h.getClass();
                while (lr.B() > 0) {
                    int i29 = this.i;
                    Lr lr3 = this.f29389c;
                    if (i29 == 0) {
                        while (lr.B() > 0) {
                            if (this.f29396k) {
                                int K9 = lr.K();
                                this.f29396k = K9 == 172;
                                byte b9 = com.anythink.core.common.s.a.c.f16475b;
                                if (K9 != 64) {
                                    if (K9 == 65) {
                                    }
                                } else if (K9 != 65) {
                                    objArr = false;
                                    this.i = 1;
                                    byte[] bArr3 = lr3.f26233a;
                                    bArr3[0] = -84;
                                    if (true == objArr) {
                                        b9 = 65;
                                    }
                                    bArr3[1] = b9;
                                    this.f29395j = 2;
                                }
                                objArr = true;
                                this.i = 1;
                                byte[] bArr32 = lr3.f26233a;
                                bArr32[0] = -84;
                                if (true == objArr) {
                                }
                                bArr32[1] = b9;
                                this.f29395j = 2;
                            } else {
                                this.f29396k = lr.K() == 172;
                            }
                        }
                    } else if (i29 != 1) {
                        int min3 = Math.min(lr.B(), this.f29399n - this.f29395j);
                        this.f29394h.a(min3, lr);
                        int i30 = this.f29395j + min3;
                        this.f29395j = i30;
                        if (i30 == this.f29399n) {
                            PA.T(this.f29400o != com.anythink.basead.exoplayer.b.f6539b);
                            this.f29394h.b(this.f29400o, 1, this.f29399n, 0, null);
                            this.f29400o += this.f29397l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr4 = lr3.f26233a;
                        int min4 = Math.min(lr.B(), 16 - this.f29395j);
                        lr.H(bArr4, this.f29395j, min4);
                        int i31 = this.f29395j + min4;
                        this.f29395j = i31;
                        if (i31 == 16) {
                            Er er2 = this.f29388b;
                            er2.d(0);
                            W2.b v6 = AbstractC3217fl.v(er2);
                            TP tp3 = this.f29398m;
                            int i32 = v6.f3423a;
                            if (tp3 == null || tp3.f27754G != 2 || i32 != tp3.f27756I || !"audio/ac4".equals(tp3.f27776o)) {
                                C4065vP c4065vP2 = new C4065vP();
                                c4065vP2.f34773a = this.f29393g;
                                c4065vP2.d(this.f29392f);
                                c4065vP2.e("audio/ac4");
                                c4065vP2.f34765F = 2;
                                c4065vP2.f34767H = i32;
                                c4065vP2.f34776d = this.f29390d;
                                c4065vP2.f34778f = this.f29391e;
                                TP tp4 = new TP(c4065vP2);
                                this.f29398m = tp4;
                                this.f29394h.e(tp4);
                            }
                            this.f29399n = v6.f3424b;
                            this.f29397l = (v6.f3425c * 1000000) / this.f29398m.f27756I;
                            lr3.E(0);
                            this.f29394h.a(16, lr3);
                            this.i = 2;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        switch (this.f29387a) {
            case 0:
                this.f29400o = j9;
                break;
            default:
                this.f29400o = j9;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        switch (this.f29387a) {
            case 0:
                d42.a();
                d42.b();
                this.f29393g = d42.f24338e;
                d42.b();
                this.f29394h = q02.x(d42.f24337d, 1);
                break;
            default:
                d42.a();
                d42.b();
                this.f29393g = d42.f24338e;
                d42.b();
                this.f29394h = q02.x(d42.f24337d, 1);
                break;
        }
    }

    private final void f(boolean z8) {
    }

    private final void g(boolean z8) {
    }
}
