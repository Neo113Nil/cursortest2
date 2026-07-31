package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import b0.C0352v;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import r.AbstractC0868o;
import r.C0850L;
import r.InterfaceC0849K;
import r0.AbstractC0893O;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1459a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1460b;

    static {
        long j3 = H.u.f2543l;
        if (O2.l.k0(j3)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        f1460b = O2.l.q0(1095216660480L & j3, O0.m.c(j3) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, InterfaceC0424c interfaceC0424c, U.q qVar, boolean z3, boolean z4, C0.K k3, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, InterfaceC0426e interfaceC0426e5, InterfaceC0426e interfaceC0426e6, InterfaceC0426e interfaceC0426e7, boolean z5, B.r rVar, x.P p3, x.O o3, boolean z6, int i3, int i4, q.k kVar, b0.Q q3, s1 s1Var, C0167p c0167p, int i5, int i6, int i7, int i8) {
        int i9;
        U.q qVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC0426e interfaceC0426e8;
        int i14;
        int i15;
        s1 s1Var2;
        B.r rVar2;
        boolean z7;
        C0.K k4;
        x.P p4;
        InterfaceC0426e interfaceC0426e9;
        b0.Q q4;
        boolean z8;
        B.r rVar3;
        C0.K k5;
        x.P p5;
        s1 s1Var3;
        x.O o4;
        boolean z9;
        int i16;
        InterfaceC0426e interfaceC0426e10;
        InterfaceC0426e interfaceC0426e11;
        InterfaceC0426e interfaceC0426e12;
        InterfaceC0426e interfaceC0426e13;
        InterfaceC0426e interfaceC0426e14;
        boolean z10;
        int i17;
        q.k kVar2;
        boolean z11;
        q.k kVar3;
        long b3;
        InterfaceC0426e interfaceC0426e15;
        s1 s1Var4;
        InterfaceC0426e interfaceC0426e16;
        boolean z12;
        x.P p6;
        x.O o5;
        boolean z13;
        int i18;
        int i19;
        q.k kVar4;
        b0.Q q5;
        InterfaceC0426e interfaceC0426e17;
        InterfaceC0426e interfaceC0426e18;
        boolean z14;
        C0.K k6;
        U.q qVar3;
        InterfaceC0426e interfaceC0426e19;
        InterfaceC0426e interfaceC0426e20;
        boolean z15;
        C0173s0 r3;
        c0167p.S(-1922450045);
        if ((i5 & 6) == 0) {
            i9 = (c0167p.f(str) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= c0167p.h(interfaceC0424c) ? 32 : 16;
        }
        int i20 = 4 & i8;
        if (i20 != 0) {
            i9 |= 384;
        } else if ((i5 & 384) == 0) {
            qVar2 = qVar;
            i9 |= c0167p.f(qVar2) ? 256 : 128;
            i10 = i8 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i9 |= c0167p.g(z3) ? 2048 : 1024;
                i11 = 16 & i8;
                if (i11 != 0) {
                    i9 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    i9 |= c0167p.g(z4) ? 16384 : 8192;
                    if ((i5 & 196608) == 0) {
                        i9 |= 65536;
                    }
                    if ((i5 & 1572864) == 0) {
                        i9 |= c0167p.h(interfaceC0426e) ? 1048576 : 524288;
                    }
                    i12 = i9 | 113246208;
                    i13 = i8 & 512;
                    if (i13 == 0) {
                        i12 = i9 | 918552576;
                    } else if ((i5 & 805306368) == 0) {
                        interfaceC0426e8 = interfaceC0426e4;
                        i12 |= c0167p.h(interfaceC0426e8) ? 536870912 : 268435456;
                        int i21 = i6 | 28086;
                        i14 = i8 & 32768;
                        if (i14 != 0) {
                            i21 = 224694 | i6;
                        } else if ((i6 & 196608) == 0) {
                            i21 |= c0167p.f(p3) ? 131072 : 65536;
                        }
                        int i22 = i21 | 1572864;
                        i15 = i8 & 131072;
                        if (i15 != 0) {
                            i22 = i21 | 14155776;
                        } else if ((12582912 & i6) == 0) {
                            i22 |= c0167p.g(z6) ? 8388608 : 4194304;
                            if ((i6 & 100663296) == 0) {
                                i22 |= 33554432;
                            }
                            int i23 = i22 | 805306368;
                            int i24 = i7 | 6;
                            if ((i7 & 48) == 0) {
                                i24 = i7 | 22;
                            }
                            int i25 = i24;
                            if ((i7 & 384) == 0) {
                                i25 |= 128;
                            }
                            if ((i12 & 306783379) != 306783378 && (i23 & 306783379) == 306783378 && (i25 & 147) == 146 && c0167p.x()) {
                                c0167p.L();
                                z15 = z3;
                                z14 = z4;
                                k6 = k3;
                                interfaceC0426e17 = interfaceC0426e3;
                                interfaceC0426e18 = interfaceC0426e5;
                                interfaceC0426e15 = interfaceC0426e6;
                                interfaceC0426e16 = interfaceC0426e7;
                                z12 = z5;
                                rVar3 = rVar;
                                p6 = p3;
                                o5 = o3;
                                z13 = z6;
                                i18 = i3;
                                i19 = i4;
                                kVar4 = kVar;
                                q5 = q3;
                                s1Var4 = s1Var;
                                qVar3 = qVar2;
                                interfaceC0426e19 = interfaceC0426e8;
                                interfaceC0426e20 = interfaceC0426e2;
                            } else {
                                c0167p.N();
                                if ((i5 & 1) != 0 || c0167p.w()) {
                                    if (i20 != 0) {
                                        qVar2 = U.n.f4488a;
                                    }
                                    boolean z16 = i10 == 0 ? true : z3;
                                    boolean z17 = i11 == 0 ? false : z4;
                                    C0.K k7 = (C0.K) c0167p.k(x1.f1884a);
                                    if (i13 != 0) {
                                        interfaceC0426e8 = null;
                                    }
                                    B.r rVar4 = I0.H.f3033a;
                                    x.P p7 = i14 == 0 ? x.P.f9968g : p3;
                                    x.O o6 = x.O.f9961g;
                                    boolean z18 = i15 == 0 ? false : z6;
                                    int i26 = !z18 ? 1 : Integer.MAX_VALUE;
                                    S0 s02 = S0.f1353a;
                                    b0.Q a3 = n1.a(3, c0167p);
                                    M m3 = (M) c0167p.k(O.f1301a);
                                    s1Var2 = m3.f1237Q;
                                    boolean z19 = z16;
                                    c0167p.Q(1540400102);
                                    if (s1Var2 != null) {
                                        long c2 = O.c(m3, 18);
                                        long c3 = O.c(m3, 18);
                                        rVar2 = rVar4;
                                        z7 = z17;
                                        k4 = k7;
                                        long b4 = C0352v.b(O.c(m3, 18), 0.38f);
                                        long c4 = O.c(m3, 18);
                                        long j3 = C0352v.f5438f;
                                        p4 = p7;
                                        interfaceC0426e9 = interfaceC0426e8;
                                        s1Var2 = new s1(c2, c3, b4, c4, j3, j3, j3, j3, O.c(m3, 26), O.c(m3, 2), (B.j0) c0167p.k(B.k0.f418a), O.c(m3, 26), O.c(m3, 24), C0352v.b(O.c(m3, 18), 0.12f), O.c(m3, 2), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 18), 0.38f), O.c(m3, 19), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 18), 0.38f), O.c(m3, 2), O.c(m3, 26), O.c(m3, 19), C0352v.b(O.c(m3, 18), 0.38f), O.c(m3, 2), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 18), 0.38f), O.c(m3, 19), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 18), 0.38f), O.c(m3, 2), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 19), 0.38f), O.c(m3, 19), O.c(m3, 19), O.c(m3, 19), C0352v.b(O.c(m3, 19), 0.38f), O.c(m3, 19));
                                        m3.f1237Q = s1Var2;
                                    } else {
                                        rVar2 = rVar4;
                                        z7 = z17;
                                        k4 = k7;
                                        p4 = p7;
                                        interfaceC0426e9 = interfaceC0426e8;
                                    }
                                    c0167p.p(false);
                                    q4 = a3;
                                    z8 = z7;
                                    rVar3 = rVar2;
                                    k5 = k4;
                                    interfaceC0426e8 = interfaceC0426e9;
                                    p5 = p4;
                                    s1Var3 = s1Var2;
                                    o4 = o6;
                                    z9 = z18;
                                    i16 = i26;
                                    interfaceC0426e10 = null;
                                    interfaceC0426e11 = null;
                                    interfaceC0426e12 = null;
                                    interfaceC0426e13 = null;
                                    interfaceC0426e14 = null;
                                    z10 = false;
                                    i17 = 1;
                                    kVar2 = null;
                                    z11 = z19;
                                } else {
                                    c0167p.L();
                                    z11 = z3;
                                    z8 = z4;
                                    k5 = k3;
                                    interfaceC0426e10 = interfaceC0426e2;
                                    interfaceC0426e11 = interfaceC0426e3;
                                    interfaceC0426e12 = interfaceC0426e5;
                                    interfaceC0426e13 = interfaceC0426e6;
                                    interfaceC0426e14 = interfaceC0426e7;
                                    z10 = z5;
                                    rVar3 = rVar;
                                    p5 = p3;
                                    o4 = o3;
                                    z9 = z6;
                                    i16 = i3;
                                    i17 = i4;
                                    kVar2 = kVar;
                                    q4 = q3;
                                    s1Var3 = s1Var;
                                }
                                c0167p.q();
                                c0167p.Q(30062948);
                                if (kVar2 != null) {
                                    Object G3 = c0167p.G();
                                    if (G3 == C0159l.f2829a) {
                                        G3 = new q.k();
                                        c0167p.a0(G3);
                                    }
                                    kVar3 = (q.k) G3;
                                } else {
                                    kVar3 = kVar2;
                                }
                                c0167p.p(false);
                                c0167p.Q(30069058);
                                b3 = k5.b();
                                if (b3 == 16) {
                                    b3 = !z11 ? s1Var3.f1792c : z10 ? s1Var3.f1793d : ((Boolean) n.t0.f(kVar3, c0167p, 0).getValue()).booleanValue() ? s1Var3.f1790a : s1Var3.f1791b;
                                }
                                c0167p.p(false);
                                C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
                                interfaceC0426e15 = interfaceC0426e13;
                                s1Var4 = s1Var3;
                                interfaceC0426e16 = interfaceC0426e14;
                                z12 = z10;
                                p6 = p5;
                                o5 = o4;
                                z13 = z9;
                                i18 = i16;
                                i19 = i17;
                                kVar4 = kVar2;
                                q5 = q4;
                                interfaceC0426e17 = interfaceC0426e11;
                                interfaceC0426e18 = interfaceC0426e12;
                                z14 = z8;
                                k6 = k5;
                                qVar3 = qVar2;
                                interfaceC0426e19 = interfaceC0426e8;
                                interfaceC0426e20 = interfaceC0426e10;
                                z15 = z11;
                            }
                            r3 = c0167p.r();
                            if (r3 == null) {
                                r3.f2906d = new W0(str, interfaceC0424c, qVar3, z15, z14, k6, interfaceC0426e, interfaceC0426e20, interfaceC0426e17, interfaceC0426e19, interfaceC0426e18, interfaceC0426e15, interfaceC0426e16, z12, rVar3, p6, o5, z13, i18, i19, kVar4, q5, s1Var4, i5, i6, i7, i8);
                                return;
                            }
                            return;
                        }
                        if ((i6 & 100663296) == 0) {
                        }
                        int i232 = i22 | 805306368;
                        int i242 = i7 | 6;
                        if ((i7 & 48) == 0) {
                        }
                        int i252 = i242;
                        if ((i7 & 384) == 0) {
                        }
                        if ((i12 & 306783379) != 306783378) {
                        }
                        c0167p.N();
                        if ((i5 & 1) != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        C0.K k72 = (C0.K) c0167p.k(x1.f1884a);
                        if (i13 != 0) {
                        }
                        B.r rVar42 = I0.H.f3033a;
                        if (i14 == 0) {
                        }
                        x.O o62 = x.O.f9961g;
                        if (i15 == 0) {
                        }
                        if (!z18) {
                        }
                        S0 s022 = S0.f1353a;
                        b0.Q a32 = n1.a(3, c0167p);
                        M m32 = (M) c0167p.k(O.f1301a);
                        s1Var2 = m32.f1237Q;
                        boolean z192 = z16;
                        c0167p.Q(1540400102);
                        if (s1Var2 != null) {
                        }
                        c0167p.p(false);
                        q4 = a32;
                        z8 = z7;
                        rVar3 = rVar2;
                        k5 = k4;
                        interfaceC0426e8 = interfaceC0426e9;
                        p5 = p4;
                        s1Var3 = s1Var2;
                        o4 = o62;
                        z9 = z18;
                        i16 = i26;
                        interfaceC0426e10 = null;
                        interfaceC0426e11 = null;
                        interfaceC0426e12 = null;
                        interfaceC0426e13 = null;
                        interfaceC0426e14 = null;
                        z10 = false;
                        i17 = 1;
                        kVar2 = null;
                        z11 = z192;
                        c0167p.q();
                        c0167p.Q(30062948);
                        if (kVar2 != null) {
                        }
                        c0167p.p(false);
                        c0167p.Q(30069058);
                        b3 = k5.b();
                        if (b3 == 16) {
                        }
                        c0167p.p(false);
                        C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
                        interfaceC0426e15 = interfaceC0426e13;
                        s1Var4 = s1Var3;
                        interfaceC0426e16 = interfaceC0426e14;
                        z12 = z10;
                        p6 = p5;
                        o5 = o4;
                        z13 = z9;
                        i18 = i16;
                        i19 = i17;
                        kVar4 = kVar2;
                        q5 = q4;
                        interfaceC0426e17 = interfaceC0426e11;
                        interfaceC0426e18 = interfaceC0426e12;
                        z14 = z8;
                        k6 = k5;
                        qVar3 = qVar2;
                        interfaceC0426e19 = interfaceC0426e8;
                        interfaceC0426e20 = interfaceC0426e10;
                        z15 = z11;
                        r3 = c0167p.r();
                        if (r3 == null) {
                        }
                    }
                    interfaceC0426e8 = interfaceC0426e4;
                    int i212 = i6 | 28086;
                    i14 = i8 & 32768;
                    if (i14 != 0) {
                    }
                    int i222 = i212 | 1572864;
                    i15 = i8 & 131072;
                    if (i15 != 0) {
                    }
                    if ((i6 & 100663296) == 0) {
                    }
                    int i2322 = i222 | 805306368;
                    int i2422 = i7 | 6;
                    if ((i7 & 48) == 0) {
                    }
                    int i2522 = i2422;
                    if ((i7 & 384) == 0) {
                    }
                    if ((i12 & 306783379) != 306783378) {
                    }
                    c0167p.N();
                    if ((i5 & 1) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    C0.K k722 = (C0.K) c0167p.k(x1.f1884a);
                    if (i13 != 0) {
                    }
                    B.r rVar422 = I0.H.f3033a;
                    if (i14 == 0) {
                    }
                    x.O o622 = x.O.f9961g;
                    if (i15 == 0) {
                    }
                    if (!z18) {
                    }
                    S0 s0222 = S0.f1353a;
                    b0.Q a322 = n1.a(3, c0167p);
                    M m322 = (M) c0167p.k(O.f1301a);
                    s1Var2 = m322.f1237Q;
                    boolean z1922 = z16;
                    c0167p.Q(1540400102);
                    if (s1Var2 != null) {
                    }
                    c0167p.p(false);
                    q4 = a322;
                    z8 = z7;
                    rVar3 = rVar2;
                    k5 = k4;
                    interfaceC0426e8 = interfaceC0426e9;
                    p5 = p4;
                    s1Var3 = s1Var2;
                    o4 = o622;
                    z9 = z18;
                    i16 = i26;
                    interfaceC0426e10 = null;
                    interfaceC0426e11 = null;
                    interfaceC0426e12 = null;
                    interfaceC0426e13 = null;
                    interfaceC0426e14 = null;
                    z10 = false;
                    i17 = 1;
                    kVar2 = null;
                    z11 = z1922;
                    c0167p.q();
                    c0167p.Q(30062948);
                    if (kVar2 != null) {
                    }
                    c0167p.p(false);
                    c0167p.Q(30069058);
                    b3 = k5.b();
                    if (b3 == 16) {
                    }
                    c0167p.p(false);
                    C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
                    interfaceC0426e15 = interfaceC0426e13;
                    s1Var4 = s1Var3;
                    interfaceC0426e16 = interfaceC0426e14;
                    z12 = z10;
                    p6 = p5;
                    o5 = o4;
                    z13 = z9;
                    i18 = i16;
                    i19 = i17;
                    kVar4 = kVar2;
                    q5 = q4;
                    interfaceC0426e17 = interfaceC0426e11;
                    interfaceC0426e18 = interfaceC0426e12;
                    z14 = z8;
                    k6 = k5;
                    qVar3 = qVar2;
                    interfaceC0426e19 = interfaceC0426e8;
                    interfaceC0426e20 = interfaceC0426e10;
                    z15 = z11;
                    r3 = c0167p.r();
                    if (r3 == null) {
                    }
                }
                if ((i5 & 196608) == 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                i12 = i9 | 113246208;
                i13 = i8 & 512;
                if (i13 == 0) {
                }
                interfaceC0426e8 = interfaceC0426e4;
                int i2122 = i6 | 28086;
                i14 = i8 & 32768;
                if (i14 != 0) {
                }
                int i2222 = i2122 | 1572864;
                i15 = i8 & 131072;
                if (i15 != 0) {
                }
                if ((i6 & 100663296) == 0) {
                }
                int i23222 = i2222 | 805306368;
                int i24222 = i7 | 6;
                if ((i7 & 48) == 0) {
                }
                int i25222 = i24222;
                if ((i7 & 384) == 0) {
                }
                if ((i12 & 306783379) != 306783378) {
                }
                c0167p.N();
                if ((i5 & 1) != 0) {
                }
                if (i20 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                C0.K k7222 = (C0.K) c0167p.k(x1.f1884a);
                if (i13 != 0) {
                }
                B.r rVar4222 = I0.H.f3033a;
                if (i14 == 0) {
                }
                x.O o6222 = x.O.f9961g;
                if (i15 == 0) {
                }
                if (!z18) {
                }
                S0 s02222 = S0.f1353a;
                b0.Q a3222 = n1.a(3, c0167p);
                M m3222 = (M) c0167p.k(O.f1301a);
                s1Var2 = m3222.f1237Q;
                boolean z19222 = z16;
                c0167p.Q(1540400102);
                if (s1Var2 != null) {
                }
                c0167p.p(false);
                q4 = a3222;
                z8 = z7;
                rVar3 = rVar2;
                k5 = k4;
                interfaceC0426e8 = interfaceC0426e9;
                p5 = p4;
                s1Var3 = s1Var2;
                o4 = o6222;
                z9 = z18;
                i16 = i26;
                interfaceC0426e10 = null;
                interfaceC0426e11 = null;
                interfaceC0426e12 = null;
                interfaceC0426e13 = null;
                interfaceC0426e14 = null;
                z10 = false;
                i17 = 1;
                kVar2 = null;
                z11 = z19222;
                c0167p.q();
                c0167p.Q(30062948);
                if (kVar2 != null) {
                }
                c0167p.p(false);
                c0167p.Q(30069058);
                b3 = k5.b();
                if (b3 == 16) {
                }
                c0167p.p(false);
                C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
                interfaceC0426e15 = interfaceC0426e13;
                s1Var4 = s1Var3;
                interfaceC0426e16 = interfaceC0426e14;
                z12 = z10;
                p6 = p5;
                o5 = o4;
                z13 = z9;
                i18 = i16;
                i19 = i17;
                kVar4 = kVar2;
                q5 = q4;
                interfaceC0426e17 = interfaceC0426e11;
                interfaceC0426e18 = interfaceC0426e12;
                z14 = z8;
                k6 = k5;
                qVar3 = qVar2;
                interfaceC0426e19 = interfaceC0426e8;
                interfaceC0426e20 = interfaceC0426e10;
                z15 = z11;
                r3 = c0167p.r();
                if (r3 == null) {
                }
            }
            i11 = 16 & i8;
            if (i11 != 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            i12 = i9 | 113246208;
            i13 = i8 & 512;
            if (i13 == 0) {
            }
            interfaceC0426e8 = interfaceC0426e4;
            int i21222 = i6 | 28086;
            i14 = i8 & 32768;
            if (i14 != 0) {
            }
            int i22222 = i21222 | 1572864;
            i15 = i8 & 131072;
            if (i15 != 0) {
            }
            if ((i6 & 100663296) == 0) {
            }
            int i232222 = i22222 | 805306368;
            int i242222 = i7 | 6;
            if ((i7 & 48) == 0) {
            }
            int i252222 = i242222;
            if ((i7 & 384) == 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            c0167p.N();
            if ((i5 & 1) != 0) {
            }
            if (i20 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            C0.K k72222 = (C0.K) c0167p.k(x1.f1884a);
            if (i13 != 0) {
            }
            B.r rVar42222 = I0.H.f3033a;
            if (i14 == 0) {
            }
            x.O o62222 = x.O.f9961g;
            if (i15 == 0) {
            }
            if (!z18) {
            }
            S0 s022222 = S0.f1353a;
            b0.Q a32222 = n1.a(3, c0167p);
            M m32222 = (M) c0167p.k(O.f1301a);
            s1Var2 = m32222.f1237Q;
            boolean z192222 = z16;
            c0167p.Q(1540400102);
            if (s1Var2 != null) {
            }
            c0167p.p(false);
            q4 = a32222;
            z8 = z7;
            rVar3 = rVar2;
            k5 = k4;
            interfaceC0426e8 = interfaceC0426e9;
            p5 = p4;
            s1Var3 = s1Var2;
            o4 = o62222;
            z9 = z18;
            i16 = i26;
            interfaceC0426e10 = null;
            interfaceC0426e11 = null;
            interfaceC0426e12 = null;
            interfaceC0426e13 = null;
            interfaceC0426e14 = null;
            z10 = false;
            i17 = 1;
            kVar2 = null;
            z11 = z192222;
            c0167p.q();
            c0167p.Q(30062948);
            if (kVar2 != null) {
            }
            c0167p.p(false);
            c0167p.Q(30069058);
            b3 = k5.b();
            if (b3 == 16) {
            }
            c0167p.p(false);
            C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
            interfaceC0426e15 = interfaceC0426e13;
            s1Var4 = s1Var3;
            interfaceC0426e16 = interfaceC0426e14;
            z12 = z10;
            p6 = p5;
            o5 = o4;
            z13 = z9;
            i18 = i16;
            i19 = i17;
            kVar4 = kVar2;
            q5 = q4;
            interfaceC0426e17 = interfaceC0426e11;
            interfaceC0426e18 = interfaceC0426e12;
            z14 = z8;
            k6 = k5;
            qVar3 = qVar2;
            interfaceC0426e19 = interfaceC0426e8;
            interfaceC0426e20 = interfaceC0426e10;
            z15 = z11;
            r3 = c0167p.r();
            if (r3 == null) {
            }
        }
        qVar2 = qVar;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        i11 = 16 & i8;
        if (i11 != 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        i12 = i9 | 113246208;
        i13 = i8 & 512;
        if (i13 == 0) {
        }
        interfaceC0426e8 = interfaceC0426e4;
        int i212222 = i6 | 28086;
        i14 = i8 & 32768;
        if (i14 != 0) {
        }
        int i222222 = i212222 | 1572864;
        i15 = i8 & 131072;
        if (i15 != 0) {
        }
        if ((i6 & 100663296) == 0) {
        }
        int i2322222 = i222222 | 805306368;
        int i2422222 = i7 | 6;
        if ((i7 & 48) == 0) {
        }
        int i2522222 = i2422222;
        if ((i7 & 384) == 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        c0167p.N();
        if ((i5 & 1) != 0) {
        }
        if (i20 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        C0.K k722222 = (C0.K) c0167p.k(x1.f1884a);
        if (i13 != 0) {
        }
        B.r rVar422222 = I0.H.f3033a;
        if (i14 == 0) {
        }
        x.O o622222 = x.O.f9961g;
        if (i15 == 0) {
        }
        if (!z18) {
        }
        S0 s0222222 = S0.f1353a;
        b0.Q a322222 = n1.a(3, c0167p);
        M m322222 = (M) c0167p.k(O.f1301a);
        s1Var2 = m322222.f1237Q;
        boolean z1922222 = z16;
        c0167p.Q(1540400102);
        if (s1Var2 != null) {
        }
        c0167p.p(false);
        q4 = a322222;
        z8 = z7;
        rVar3 = rVar2;
        k5 = k4;
        interfaceC0426e8 = interfaceC0426e9;
        p5 = p4;
        s1Var3 = s1Var2;
        o4 = o622222;
        z9 = z18;
        i16 = i26;
        interfaceC0426e10 = null;
        interfaceC0426e11 = null;
        interfaceC0426e12 = null;
        interfaceC0426e13 = null;
        interfaceC0426e14 = null;
        z10 = false;
        i17 = 1;
        kVar2 = null;
        z11 = z1922222;
        c0167p.q();
        c0167p.Q(30062948);
        if (kVar2 != null) {
        }
        c0167p.p(false);
        c0167p.Q(30069058);
        b3 = k5.b();
        if (b3 == 16) {
        }
        c0167p.p(false);
        C0143d.a(B.k0.f418a.a(s1Var3.f1800k), Q.f.b(-1886965181, new V0(qVar2, interfaceC0426e, (O0.b) c0167p.k(AbstractC1101g0.f9354f), z10, s1Var3, str, interfaceC0424c, z11, z8, k5.d(new C0.K(b3, 0L, null, 0L, 0, 0L, 16777214)), p5, o4, z9, i16, i17, rVar3, kVar3, interfaceC0426e10, interfaceC0426e11, interfaceC0426e8, interfaceC0426e12, interfaceC0426e13, interfaceC0426e14, q4), c0167p), c0167p, 56);
        interfaceC0426e15 = interfaceC0426e13;
        s1Var4 = s1Var3;
        interfaceC0426e16 = interfaceC0426e14;
        z12 = z10;
        p6 = p5;
        o5 = o4;
        z13 = z9;
        i18 = i16;
        i19 = i17;
        kVar4 = kVar2;
        q5 = q4;
        interfaceC0426e17 = interfaceC0426e11;
        interfaceC0426e18 = interfaceC0426e12;
        z14 = z8;
        k6 = k5;
        qVar3 = qVar2;
        interfaceC0426e19 = interfaceC0426e8;
        interfaceC0426e20 = interfaceC0426e10;
        z15 = z11;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c7, code lost:
    
        if (f2.j.a(r40.G(), java.lang.Integer.valueOf(r3)) == false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(InterfaceC0426e interfaceC0426e, Q.a aVar, Q.a aVar2, Q.a aVar3, Q.a aVar4, Q.a aVar5, Q.a aVar6, boolean z3, float f3, InterfaceC0424c interfaceC0424c, Q.a aVar7, Q.a aVar8, InterfaceC0849K interfaceC0849K, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        InterfaceC0849K interfaceC0849K2;
        U.n nVar;
        O0.k kVar;
        int i7;
        ?? r3;
        float f4;
        float f5;
        C1001n c1001n;
        boolean z4;
        U.n nVar2 = U.n.f4488a;
        c0167p.S(1408290209);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(nVar2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.h(aVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.h(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= c0167p.h(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= c0167p.h(aVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= c0167p.h(aVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= c0167p.g(z3) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= c0167p.c(f3) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (c0167p.h(interfaceC0424c) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.h(aVar7) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.h(aVar8) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            interfaceC0849K2 = interfaceC0849K;
            nVar = nVar2;
            i6 |= c0167p.f(interfaceC0849K2) ? 2048 : 1024;
        } else {
            interfaceC0849K2 = interfaceC0849K;
            nVar = nVar2;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z5 = ((i6 & 14) == 4) | ((234881024 & i5) == 67108864) | ((1879048192 & i5) == 536870912) | ((i6 & 7168) == 2048);
            Object G3 = c0167p.G();
            if (z5 || G3 == C0159l.f2829a) {
                G3 = new C0086b1(interfaceC0424c, z3, f3, interfaceC0849K2);
                c0167p.a0(G3);
            }
            C0086b1 c0086b1 = (C0086b1) G3;
            O0.k kVar2 = (O0.k) c0167p.k(AbstractC1101g0.f9360l);
            int i8 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, nVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n2 = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n2);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, c0086b1);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O) {
                kVar = kVar2;
            } else {
                kVar = kVar2;
            }
            A.k.o(i8, c0167p, i8, c0995h3);
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            aVar7.h(c0167p, Integer.valueOf((i6 >> 3) & 14));
            c0167p.Q(250370369);
            U.i iVar = U.b.f4465h;
            if (aVar3 != null) {
                U.q i9 = androidx.compose.ui.layout.a.c(nVar, "Leading").i(G.z.f2071i);
                InterfaceC0885G e3 = AbstractC0868o.e(iVar, false);
                int i10 = c0167p.f2864P;
                i7 = i6;
                InterfaceC0164n0 m4 = c0167p.m();
                U.q d4 = U.a.d(c0167p, i9);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n2);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e3);
                C0143d.R(c0167p, c0995h2, m4);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i10))) {
                    A.k.o(i10, c0167p, i10, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d4);
                aVar3.h(c0167p, Integer.valueOf((i5 >> 12) & 14));
                c0167p.p(true);
            } else {
                i7 = i6;
            }
            c0167p.p(false);
            c0167p.Q(250379492);
            if (aVar4 != null) {
                U.q i11 = androidx.compose.ui.layout.a.c(nVar, "Trailing").i(G.z.f2071i);
                InterfaceC0885G e4 = AbstractC0868o.e(iVar, false);
                int i12 = c0167p.f2864P;
                InterfaceC0164n0 m5 = c0167p.m();
                U.q d5 = U.a.d(c0167p, i11);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n2);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e4);
                C0143d.R(c0167p, c0995h2, m5);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i12))) {
                    A.k.o(i12, c0167p, i12, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d5);
                aVar4.h(c0167p, Integer.valueOf((i5 >> 15) & 14));
                c0167p.p(true);
                r3 = 0;
            } else {
                r3 = 0;
            }
            c0167p.p(r3);
            O0.k kVar3 = kVar;
            float d6 = androidx.compose.foundation.layout.b.d(interfaceC0849K, kVar3);
            float c2 = androidx.compose.foundation.layout.b.c(interfaceC0849K, kVar3);
            if (aVar3 != null) {
                d6 = O2.d.u(d6 - G.z.f2065c, (float) r3);
            }
            if (aVar4 != null) {
                c2 = O2.d.u(c2 - G.z.f2065c, (float) r3);
            }
            c0167p.Q(250410106);
            U.i iVar2 = U.b.f4461d;
            if (aVar5 != null) {
                U.q i13 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(nVar, "Prefix"), G.z.f2068f, 0.0f, 2)), d6, 0.0f, G.z.f2067e, 10);
                InterfaceC0885G e5 = AbstractC0868o.e(iVar2, false);
                int i14 = c0167p.f2864P;
                InterfaceC0164n0 m6 = c0167p.m();
                U.q d7 = U.a.d(c0167p, i13);
                c0167p.U();
                f4 = d6;
                if (c0167p.f2863O) {
                    c0167p.l(c1001n2);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e5);
                C0143d.R(c0167p, c0995h2, m6);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i14))) {
                    A.k.o(i14, c0167p, i14, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d7);
                aVar5.h(c0167p, Integer.valueOf((i5 >> 18) & 14));
                c0167p.p(true);
            } else {
                f4 = d6;
            }
            c0167p.p(false);
            c0167p.Q(250422072);
            if (aVar6 != null) {
                U.q i15 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(nVar, "Suffix"), G.z.f2068f, 0.0f, 2)), G.z.f2067e, 0.0f, c2, 10);
                InterfaceC0885G e6 = AbstractC0868o.e(iVar2, false);
                int i16 = c0167p.f2864P;
                InterfaceC0164n0 m7 = c0167p.m();
                U.q d8 = U.a.d(c0167p, i15);
                c0167p.U();
                f5 = c2;
                if (c0167p.f2863O) {
                    c0167p.l(c1001n2);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e6);
                C0143d.R(c0167p, c0995h2, m7);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i16))) {
                    A.k.o(i16, c0167p, i16, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d8);
                aVar6.h(c0167p, Integer.valueOf((i5 >> 21) & 14));
                c0167p.p(true);
            } else {
                f5 = c2;
            }
            c0167p.p(false);
            float f6 = G.z.f2068f;
            U.q i17 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.f(nVar, f6, 0.0f, 2)), aVar5 == null ? f4 : 0, 0.0f, aVar6 == null ? f5 : 0, 10);
            c0167p.Q(250444361);
            if (aVar != null) {
                aVar.g(androidx.compose.ui.layout.a.c(nVar, "Hint").i(i17), c0167p, Integer.valueOf((i5 >> 3) & 112));
            }
            c0167p.p(false);
            U.q i18 = androidx.compose.ui.layout.a.c(nVar, "TextField").i(i17);
            InterfaceC0885G e7 = AbstractC0868o.e(iVar2, true);
            int i19 = c0167p.f2864P;
            InterfaceC0164n0 m8 = c0167p.m();
            U.q d9 = U.a.d(c0167p, i18);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n2);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e7);
            C0143d.R(c0167p, c0995h2, m8);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i19))) {
                A.k.o(i19, c0167p, i19, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d9);
            interfaceC0426e.h(c0167p, Integer.valueOf((i5 >> 3) & 14));
            c0167p.p(true);
            c0167p.Q(250455481);
            if (aVar2 != null) {
                c1001n = c1001n2;
                U.q c3 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.f(nVar, l0.c.G(f6, G.z.f2069g, f3), 0.0f, 2)), "Label");
                InterfaceC0885G e8 = AbstractC0868o.e(iVar2, false);
                int i20 = c0167p.f2864P;
                InterfaceC0164n0 m9 = c0167p.m();
                U.q d10 = U.a.d(c0167p, c3);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e8);
                C0143d.R(c0167p, c0995h2, m9);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i20))) {
                    A.k.o(i20, c0167p, i20, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d10);
                aVar2.h(c0167p, Integer.valueOf((i5 >> 9) & 14));
                c0167p.p(true);
            } else {
                c1001n = c1001n2;
            }
            c0167p.p(false);
            c0167p.Q(250473414);
            if (aVar8 != null) {
                U.q m10 = androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.f(androidx.compose.ui.layout.a.c(nVar, "Supporting"), G.z.f2070h, 0.0f, 2));
                float f7 = G.z.f2064b;
                U.q e9 = androidx.compose.foundation.layout.b.e(m10, new C0850L(f7, G.z.f2066d, f7, 0));
                InterfaceC0885G e10 = AbstractC0868o.e(iVar2, false);
                int i21 = c0167p.f2864P;
                InterfaceC0164n0 m11 = c0167p.m();
                U.q d11 = U.a.d(c0167p, e9);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e10);
                C0143d.R(c0167p, c0995h2, m11);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i21))) {
                    A.k.o(i21, c0167p, i21, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d11);
                aVar8.h(c0167p, Integer.valueOf((i7 >> 6) & 14));
                z4 = true;
                c0167p.p(true);
            } else {
                z4 = true;
            }
            c0167p.p(false);
            c0167p.p(z4);
        }
        C0173s0 r4 = c0167p.r();
        if (r4 != null) {
            r4.f2906d = new X0(interfaceC0426e, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, z3, f3, interfaceC0424c, aVar7, aVar8, interfaceC0849K, i3, i4);
        }
    }

    public static final int c(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f3, long j3, float f4, InterfaceC0849K interfaceC0849K) {
        int[] iArr = {i9, i5, i6, l0.c.H(f3, i8, 0)};
        for (int i11 = 0; i11 < 4; i11++) {
            i7 = Math.max(i7, iArr[i11]);
        }
        float d3 = interfaceC0849K.d() * f4;
        return Math.max(O0.a.i(j3), Math.max(i3, Math.max(i4, AbstractC0508a.Q(l0.c.G(d3, Math.max(d3, i8 / 2.0f), f3) + i7 + (interfaceC0849K.c() * f4)))) + i10);
    }

    public static final int d(int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f3, long j3, float f4, InterfaceC0849K interfaceC0849K) {
        int i10 = i5 + i6;
        int max = Math.max(i7 + i10, Math.max(i9 + i10, l0.c.H(f3, i8, 0))) + i3 + i4;
        O0.k kVar = O0.k.f3741d;
        return Math.max(max, Math.max(AbstractC0508a.Q((i8 + ((interfaceC0849K.a(kVar) + interfaceC0849K.b(kVar)) * f4)) * f3), O0.a.j(j3)));
    }

    public static final int e(boolean z3, int i3, int i4, AbstractC0893O abstractC0893O, AbstractC0893O abstractC0893O2) {
        if (z3) {
            i4 = Math.round((1 + 0.0f) * ((i3 - abstractC0893O2.f8127e) / 2.0f));
        }
        return Math.max(i4, G.z.e(abstractC0893O) / 2);
    }
}
