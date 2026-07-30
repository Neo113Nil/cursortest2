package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class D1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final Lr f24301a = new Lr(4);

    /* renamed from: b, reason: collision with root package name */
    public final Lr f24302b = new Lr(9);

    /* renamed from: c, reason: collision with root package name */
    public final Lr f24303c = new Lr(11);

    /* renamed from: d, reason: collision with root package name */
    public final Lr f24304d = new Lr();

    /* renamed from: e, reason: collision with root package name */
    public final E1 f24305e;

    /* renamed from: f, reason: collision with root package name */
    public PQ f24306f;

    /* renamed from: g, reason: collision with root package name */
    public int f24307g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24308h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f24309j;

    /* renamed from: k, reason: collision with root package name */
    public int f24310k;

    /* renamed from: l, reason: collision with root package name */
    public int f24311l;

    /* renamed from: m, reason: collision with root package name */
    public long f24312m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24313n;

    /* renamed from: o, reason: collision with root package name */
    public C1 f24314o;

    /* renamed from: p, reason: collision with root package name */
    public G1 f24315p;

    static {
        int i = AbstractC3194fG.f30672t0;
    }

    public D1() {
        E1 e12 = new E1(new M0());
        e12.f24629v = com.anythink.basead.exoplayer.b.f6539b;
        e12.f24630w = new long[0];
        e12.f24631x = new long[0];
        this.f24305e = e12;
        this.f24307g = 1;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f24306f = (PQ) q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        Lr lr = this.f24301a;
        J0 j02 = (J0) p02;
        j02.I(lr.f26233a, 0, 3, false);
        lr.E(0);
        if (lr.O() == 4607062) {
            j02.I(lr.f26233a, 0, 2, false);
            lr.E(0);
            if ((lr.L() & 250) == 0) {
                j02.I(lr.f26233a, 0, 4, false);
                lr.E(0);
                int b9 = lr.b();
                j02.f25677y = 0;
                j02.d(b9, false);
                j02.I(lr.f26233a, 0, 4, false);
                lr.E(0);
                if (lr.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        if (j9 == 0) {
            this.f24307g = 1;
            this.f24308h = false;
        } else {
            this.f24307g = 3;
        }
        this.f24309j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0007 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        long j9;
        boolean z8;
        boolean z9;
        int i;
        boolean z10;
        this.f24306f.getClass();
        while (true) {
            int i4 = this.f24307g;
            int i9 = 8;
            if (i4 == 1) {
                Lr lr = this.f24302b;
                if (!((J0) p02).E(lr.f26233a, 0, 9, true)) {
                    return -1;
                }
                lr.E(0);
                lr.G(4);
                int K8 = lr.K();
                int i10 = K8 & 4;
                int i11 = K8 & 1;
                if (i10 != 0 && this.f24314o == null) {
                    this.f24314o = new C1(this.f24306f.x(8, 1));
                }
                if (i11 != 0 && this.f24315p == null) {
                    this.f24315p = new G1(this.f24306f.x(9, 2));
                }
                this.f24306f.v();
                this.f24309j = lr.b() - 5;
                this.f24307g = 2;
            } else if (i4 == 2) {
                ((J0) p02).b(this.f24309j, false);
                this.f24309j = 0;
                this.f24307g = 3;
            } else if (i4 == 3) {
                Lr lr2 = this.f24303c;
                if (!((J0) p02).E(lr2.f26233a, 0, 11, true)) {
                    return -1;
                }
                lr2.E(0);
                this.f24310k = lr2.K();
                this.f24311l = lr2.O();
                this.f24312m = lr2.O();
                this.f24312m = ((lr2.K() << 24) | this.f24312m) * 1000;
                lr2.G(3);
                this.f24307g = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                boolean z11 = this.f24308h;
                E1 e12 = this.f24305e;
                long j10 = z11 ? this.i + this.f24312m : e12.f24629v == com.anythink.basead.exoplayer.b.f6539b ? 0L : this.f24312m;
                int i12 = this.f24310k;
                if (i12 != 8) {
                    i9 = i12;
                } else if (this.f24314o != null) {
                    if (!this.f24313n) {
                        this.f24306f.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
                        this.f24313n = true;
                    }
                    C1 c12 = this.f24314o;
                    Lr g9 = g((J0) p02);
                    if (c12.f24125v) {
                        g9.G(1);
                    } else {
                        int K9 = g9.K();
                        int i13 = K9 >> 4;
                        c12.f24127x = i13;
                        InterfaceC3448k1 interfaceC3448k1 = (InterfaceC3448k1) c12.f29483n;
                        if (i13 == 2) {
                            int i14 = C1.f24124y[(K9 >> 2) & 3];
                            C4065vP c4065vP = new C4065vP();
                            c4065vP.d("video/x-flv");
                            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8619t);
                            c4065vP.f34765F = 1;
                            c4065vP.f34767H = i14;
                            interfaceC3448k1.e(new TP(c4065vP));
                            c12.f24126w = true;
                        } else if (i13 == 7 || i13 == 8) {
                            C4065vP c4065vP2 = new C4065vP();
                            c4065vP2.d("video/x-flv");
                            c4065vP2.e(i13 == 7 ? com.anythink.basead.exoplayer.k.o.f8623x : com.anythink.basead.exoplayer.k.o.f8624y);
                            c4065vP2.f34765F = 1;
                            c4065vP2.f34767H = 8000;
                            interfaceC3448k1.e(new TP(c4065vP2));
                            c12.f24126w = true;
                        } else if (i13 != 10) {
                            throw new F1(D.y.j(i13, "Audio format not supported: ", new StringBuilder(String.valueOf(i13).length() + 28)));
                        }
                        c12.f24125v = true;
                    }
                    int i15 = c12.f24127x;
                    InterfaceC3448k1 interfaceC3448k12 = (InterfaceC3448k1) c12.f29483n;
                    if (i15 == 2) {
                        int B8 = g9.B();
                        interfaceC3448k12.a(B8, g9);
                        interfaceC3448k12.b(j10, 1, B8, 0, null);
                    } else {
                        int K10 = g9.K();
                        z10 = false;
                        if (K10 == 0 && !c12.f24126w) {
                            int B9 = g9.B();
                            byte[] bArr = new byte[B9];
                            g9.H(bArr, 0, B9);
                            C4202y0 m8 = AbstractC2720Pd.m(new Er(bArr, B9), false);
                            C4065vP c4065vP3 = new C4065vP();
                            c4065vP3.d("video/x-flv");
                            c4065vP3.e(com.anythink.basead.exoplayer.k.o.f8617r);
                            c4065vP3.f34781j = m8.f35296a;
                            c4065vP3.f34765F = m8.f35298c;
                            c4065vP3.f34767H = m8.f35297b;
                            c4065vP3.f34788q = Collections.singletonList(bArr);
                            interfaceC3448k12.e(new TP(c4065vP3));
                            c12.f24126w = true;
                        } else if (c12.f24127x != 10 || K10 == 1) {
                            int B10 = g9.B();
                            interfaceC3448k12.a(B10, g9);
                            interfaceC3448k12.b(j10, 1, B10, 0, null);
                        }
                        z8 = true;
                        z9 = z10;
                        j9 = -9223372036854775807L;
                        if (!this.f24308h && z9) {
                            this.f24308h = true;
                            this.i = e12.f24629v != j9 ? -this.f24312m : 0L;
                        }
                        this.f24309j = 4;
                        this.f24307g = 2;
                        if (z8) {
                            return 0;
                        }
                    }
                    z10 = true;
                    z8 = true;
                    z9 = z10;
                    j9 = -9223372036854775807L;
                    if (!this.f24308h) {
                        this.f24308h = true;
                        this.i = e12.f24629v != j9 ? -this.f24312m : 0L;
                    }
                    this.f24309j = 4;
                    this.f24307g = 2;
                    if (z8) {
                    }
                }
                if (i9 != 9) {
                    j9 = -9223372036854775807L;
                    if (i9 == 18 && !this.f24313n) {
                        Lr g10 = g((J0) p02);
                        e12.getClass();
                        e12.getClass();
                        if (g10.K() == 2 && "onMetaData".equals(E1.v1(g10)) && g10.B() != 0 && g10.K() == 8) {
                            HashMap w12 = E1.w1(g10);
                            Object obj = w12.get("duration");
                            if (obj instanceof Double) {
                                double doubleValue = ((Double) obj).doubleValue();
                                if (doubleValue > 0.0d) {
                                    e12.f24629v = (long) (doubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = w12.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    e12.f24630w = new long[size];
                                    e12.f24631x = new long[size];
                                    for (int i16 = 0; i16 < size; i16++) {
                                        Object obj5 = list.get(i16);
                                        Object obj6 = list2.get(i16);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            e12.f24630w = new long[0];
                                            e12.f24631x = new long[0];
                                            break;
                                        }
                                        e12.f24630w[i16] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        e12.f24631x[i16] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j11 = e12.f24629v;
                        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                            this.f24306f.w(new Z0(j11, e12.f24631x, e12.f24630w));
                            this.f24313n = true;
                        }
                        z8 = true;
                        z9 = false;
                        if (!this.f24308h) {
                        }
                        this.f24309j = 4;
                        this.f24307g = 2;
                        if (z8) {
                        }
                    }
                    ((J0) p02).b(this.f24311l, false);
                    z9 = false;
                    z8 = false;
                    if (!this.f24308h) {
                    }
                    this.f24309j = 4;
                    this.f24307g = 2;
                    if (z8) {
                    }
                } else if (this.f24315p != null) {
                    if (!this.f24313n) {
                        this.f24306f.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
                        this.f24313n = true;
                    }
                    G1 g12 = this.f24315p;
                    Lr g11 = g((J0) p02);
                    g12.getClass();
                    int K11 = g11.K();
                    int i17 = K11 >> 4;
                    int i18 = K11 & 15;
                    if (i18 != 7) {
                        throw new F1(D.y.j(i18, "Video format not supported: ", new StringBuilder(String.valueOf(i18).length() + 28)));
                    }
                    g12.f25085A = i17;
                    if (i17 != 5) {
                        int K12 = g11.K();
                        g11.v(3);
                        byte[] bArr2 = g11.f26233a;
                        int i19 = g11.f26234b;
                        int i20 = i19 + 1;
                        g11.f26234b = i20;
                        int i21 = bArr2[i19] & 255;
                        int i22 = i19 + 2;
                        g11.f26234b = i22;
                        int i23 = bArr2[i20] & 255;
                        g11.f26234b = i19 + 3;
                        long j12 = (bArr2[i22] & 255) | ((i21 << 24) >> 8) | (i23 << 8);
                        boolean z12 = true;
                        InterfaceC3448k1 interfaceC3448k13 = (InterfaceC3448k1) g12.f29483n;
                        if (K12 == 0) {
                            if (!g12.f25089y) {
                                byte[] bArr3 = new byte[g11.B()];
                                Lr lr3 = new Lr(bArr3);
                                g11.H(bArr3, 0, g11.B());
                                C0 a9 = C0.a(lr3);
                                g12.f25088x = a9.f24114b;
                                C4065vP c4065vP4 = new C4065vP();
                                c4065vP4.d("video/x-flv");
                                c4065vP4.e(com.anythink.basead.exoplayer.k.o.f8608h);
                                c4065vP4.f34781j = a9.f24123l;
                                c4065vP4.f34792u = a9.f24115c;
                                c4065vP4.f34793v = a9.f24116d;
                                c4065vP4.f34760A = a9.f24122k;
                                c4065vP4.f34788q = a9.f24113a;
                                interfaceC3448k13.e(new TP(c4065vP4));
                                g12.f25089y = true;
                            }
                        } else if (K12 == 1 && g12.f25089y) {
                            int i24 = g12.f25085A == 1 ? 1 : 0;
                            j9 = -9223372036854775807L;
                            if (g12.f25090z) {
                                i = i24;
                            } else {
                                if (i24 != 0) {
                                    i = 1;
                                }
                                z12 = false;
                                if (z12) {
                                    z9 = true;
                                    z8 = true;
                                    if (!this.f24308h) {
                                    }
                                    this.f24309j = 4;
                                    this.f24307g = 2;
                                    if (z8) {
                                    }
                                }
                            }
                            Lr lr4 = g12.f25087w;
                            byte[] bArr4 = lr4.f26233a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i25 = 4 - g12.f25088x;
                            int i26 = 0;
                            while (g11.B() > 0) {
                                g11.H(lr4.f26233a, i25, g12.f25088x);
                                lr4.E(0);
                                int h9 = lr4.h();
                                Lr lr5 = g12.f25086v;
                                lr5.E(0);
                                interfaceC3448k13.a(4, lr5);
                                interfaceC3448k13.a(h9, g11);
                                i26 = i26 + 4 + h9;
                            }
                            ((InterfaceC3448k1) g12.f29483n).b((j12 * 1000) + j10, i, i26, 0, null);
                            g12.f25090z = true;
                            if (z12) {
                            }
                        }
                        j9 = -9223372036854775807L;
                        z12 = false;
                        if (z12) {
                        }
                    } else {
                        j9 = -9223372036854775807L;
                    }
                    z9 = false;
                    z8 = true;
                    if (!this.f24308h) {
                    }
                    this.f24309j = 4;
                    this.f24307g = 2;
                    if (z8) {
                    }
                } else {
                    j9 = -9223372036854775807L;
                    ((J0) p02).b(this.f24311l, false);
                    z9 = false;
                    z8 = false;
                    if (!this.f24308h) {
                    }
                    this.f24309j = 4;
                    this.f24307g = 2;
                    if (z8) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final Lr g(J0 j02) {
        int i = this.f24311l;
        Lr lr = this.f24304d;
        byte[] bArr = lr.f26233a;
        if (i > bArr.length) {
            int length = bArr.length;
            lr.z(0, new byte[Math.max(length + length, i)]);
        } else {
            lr.E(0);
        }
        lr.C(this.f24311l);
        j02.E(lr.f26233a, 0, this.f24311l, false);
        return lr;
    }
}
