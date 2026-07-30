package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3828r4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33948b;

    /* renamed from: c, reason: collision with root package name */
    public final Lr f33949c;

    /* renamed from: d, reason: collision with root package name */
    public final Er f33950d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3448k1 f33951e;

    /* renamed from: f, reason: collision with root package name */
    public String f33952f;

    /* renamed from: g, reason: collision with root package name */
    public TP f33953g;

    /* renamed from: h, reason: collision with root package name */
    public int f33954h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f33955j;

    /* renamed from: k, reason: collision with root package name */
    public int f33956k;

    /* renamed from: l, reason: collision with root package name */
    public long f33957l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33958m;

    /* renamed from: n, reason: collision with root package name */
    public int f33959n;

    /* renamed from: o, reason: collision with root package name */
    public int f33960o;

    /* renamed from: p, reason: collision with root package name */
    public int f33961p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33962q;

    /* renamed from: r, reason: collision with root package name */
    public long f33963r;

    /* renamed from: s, reason: collision with root package name */
    public int f33964s;

    /* renamed from: t, reason: collision with root package name */
    public long f33965t;

    /* renamed from: u, reason: collision with root package name */
    public int f33966u;

    /* renamed from: v, reason: collision with root package name */
    public String f33967v;

    public C3828r4(String str, int i) {
        this.f33947a = str;
        this.f33948b = i;
        Lr lr = new Lr(1024);
        this.f33949c = lr;
        byte[] bArr = lr.f26233a;
        this.f33950d = new Er(bArr, bArr.length);
        this.f33957l = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f33954h = 0;
        this.f33957l = com.anythink.basead.exoplayer.b.f6539b;
        this.f33958m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x019b, code lost:
    
        if (r23.f33958m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        int h9;
        int i;
        int i4;
        boolean g9;
        int i9;
        this.f33951e.getClass();
        while (lr.B() > 0) {
            int i10 = this.f33954h;
            if (i10 != 0) {
                if (i10 != 1) {
                    Er er = this.f33950d;
                    Lr lr2 = this.f33949c;
                    if (i10 != 2) {
                        int min = Math.min(lr.B(), this.f33955j - this.i);
                        lr.H(er.f24829a, this.i, min);
                        int i11 = this.i + min;
                        this.i = i11;
                        if (i11 == this.f33955j) {
                            er.d(0);
                            if (!er.g()) {
                                this.f33958m = true;
                                int h10 = er.h(1);
                                if (h10 == 1) {
                                    i4 = er.h(1);
                                    i = 1;
                                } else {
                                    i = h10;
                                    i4 = 0;
                                }
                                this.f33959n = i4;
                                if (i4 != 0) {
                                    throw W4.a(null, null);
                                }
                                if (i == 1) {
                                    er.h((er.h(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!er.g()) {
                                    throw W4.a(null, null);
                                }
                                this.f33960o = er.h(6);
                                int h11 = er.h(4);
                                int h12 = er.h(3);
                                if (h11 != 0 || h12 != 0) {
                                    throw W4.a(null, null);
                                }
                                if (i == 0) {
                                    int i12 = (er.f24830b * 8) + er.f24831c;
                                    int b9 = er.b();
                                    C4202y0 m8 = AbstractC2720Pd.m(er, true);
                                    this.f33967v = m8.f35296a;
                                    this.f33964s = m8.f35297b;
                                    this.f33966u = m8.f35298c;
                                    int b10 = b9 - er.b();
                                    er.d(i12);
                                    byte[] bArr = new byte[(b10 + 7) / 8];
                                    er.j(b10, bArr);
                                    C4065vP c4065vP = new C4065vP();
                                    c4065vP.f34773a = this.f33952f;
                                    c4065vP.d("video/mp2t");
                                    c4065vP.e(com.anythink.basead.exoplayer.k.o.f8617r);
                                    c4065vP.f34781j = this.f33967v;
                                    c4065vP.f34765F = this.f33966u;
                                    c4065vP.f34767H = this.f33964s;
                                    c4065vP.f34788q = Collections.singletonList(bArr);
                                    c4065vP.f34776d = this.f33947a;
                                    c4065vP.f34778f = this.f33948b;
                                    TP tp = new TP(c4065vP);
                                    if (!tp.equals(this.f33953g)) {
                                        this.f33953g = tp;
                                        this.f33965t = 1024000000 / tp.f27756I;
                                        this.f33951e.e(tp);
                                    }
                                } else {
                                    int b11 = er.b();
                                    C4202y0 m9 = AbstractC2720Pd.m(er, true);
                                    this.f33967v = m9.f35296a;
                                    this.f33964s = m9.f35297b;
                                    this.f33966u = m9.f35298c;
                                    er.f(er.h((er.h(2) + 1) * 8) - (b11 - er.b()));
                                }
                                int h13 = er.h(3);
                                this.f33961p = h13;
                                if (h13 == 0) {
                                    er.f(8);
                                } else if (h13 == 1) {
                                    er.f(9);
                                } else if (h13 == 3 || h13 == 4 || h13 == 5) {
                                    er.f(6);
                                } else {
                                    if (h13 != 6 && h13 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    er.f(1);
                                }
                                boolean g10 = er.g();
                                this.f33962q = g10;
                                this.f33963r = 0L;
                                if (g10) {
                                    if (i != 1) {
                                        do {
                                            g9 = er.g();
                                            this.f33963r = (this.f33963r << 8) + er.h(8);
                                        } while (g9);
                                    } else {
                                        this.f33963r = er.h((er.h(2) + 1) * 8);
                                    }
                                }
                                if (er.g()) {
                                    er.f(8);
                                }
                            }
                            if (this.f33959n != 0) {
                                throw W4.a(null, null);
                            }
                            if (this.f33960o != 0) {
                                throw W4.a(null, null);
                            }
                            if (this.f33961p != 0) {
                                throw W4.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                h9 = er.h(8);
                                i13 += h9;
                            } while (h9 == 255);
                            int i14 = (er.f24830b * 8) + er.f24831c;
                            if ((i14 & 7) == 0) {
                                lr2.E(i14 >> 3);
                            } else {
                                er.j(i13 * 8, lr2.f26233a);
                                lr2.E(0);
                            }
                            this.f33951e.a(i13, lr2);
                            PA.T(this.f33957l != com.anythink.basead.exoplayer.b.f6539b);
                            this.f33951e.b(this.f33957l, 1, i13, 0, null);
                            this.f33957l += this.f33965t;
                            if (this.f33962q) {
                                er.f((int) this.f33963r);
                            }
                            this.f33954h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int K8 = ((this.f33956k & (-225)) << 8) | lr.K();
                        this.f33955j = K8;
                        if (K8 > lr2.f26233a.length) {
                            lr2.y(K8);
                            byte[] bArr2 = lr2.f26233a;
                            int length = bArr2.length;
                            er.f24829a = bArr2;
                            i9 = 0;
                            er.f24830b = 0;
                            er.f24831c = 0;
                            er.f24832d = length;
                        } else {
                            i9 = 0;
                        }
                        this.i = i9;
                        this.f33954h = 3;
                    }
                } else {
                    int K9 = lr.K();
                    if ((K9 & 224) == 224) {
                        this.f33956k = K9;
                        this.f33954h = 2;
                    } else if (K9 != 86) {
                        this.f33954h = 0;
                    }
                }
            } else if (lr.K() == 86) {
                this.f33954h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f33957l = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f33951e = q02.x(d42.f24337d, 1);
        d42.b();
        this.f33952f = d42.f24338e;
    }
}
