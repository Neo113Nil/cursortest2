package d0;

import androidx.compose.material3.MinimumInteractiveModifier;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2268a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2269b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2270c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2271d;

    static {
        float f9 = 2;
        f2268a = f9;
        f2270c = f9;
        f2271d = f9;
    }

    public static final void a(boolean z8, q6.c cVar, s0.o oVar, boolean z9, j0 j0Var, g0.p pVar, int i7) {
        int i8;
        int i9;
        s0.o oVar2;
        j0 j0Var2;
        boolean z10;
        q6.a aVar;
        s0.o oVar3;
        boolean z11;
        j0 j0Var3;
        pVar.S(-1406741137);
        int i10 = i7 | (pVar.g(z8) ? 4 : 2) | (pVar.h(cVar) ? 32 : 16) | 208256;
        if ((74899 & i10) == 74898 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            z11 = z9;
            j0Var3 = j0Var;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                q0 q0Var = (q0) pVar.k(s0.f2378a);
                j0 j0Var4 = q0Var.N;
                if (j0Var4 == null) {
                    long c4 = s0.c(q0Var, f0.a.f2896d);
                    long j8 = z0.u.f10056f;
                    int i11 = f0.a.f2894b;
                    long c6 = s0.c(q0Var, i11);
                    i8 = -57345;
                    int i12 = f0.a.f2895c;
                    j0 j0Var5 = new j0(c4, j8, c6, j8, z0.u.b(s0.c(q0Var, i12), 0.38f), j8, z0.u.b(s0.c(q0Var, i12), 0.38f), s0.c(q0Var, i11), s0.c(q0Var, f0.a.f2898f), z0.u.b(s0.c(q0Var, i12), 0.38f), z0.u.b(s0.c(q0Var, f0.a.f2897e), 0.38f), z0.u.b(s0.c(q0Var, i12), 0.38f));
                    q0Var.N = j0Var5;
                    j0Var4 = j0Var5;
                } else {
                    i8 = -57345;
                }
                i9 = i10 & i8;
                oVar2 = s0.l.f8103a;
                j0Var2 = j0Var4;
                z10 = true;
            } else {
                pVar.L();
                i9 = i10 & (-57345);
                oVar2 = oVar;
                z10 = z9;
                j0Var2 = j0Var;
            }
            pVar.q();
            z1.a aVar2 = z8 ? z1.a.f10064f : z1.a.f10065g;
            pVar.Q(1046936362);
            if (cVar != null) {
                boolean z12 = ((i9 & 112) == 32) | ((i9 & 14) == 4);
                Object G = pVar.G();
                if (z12 || G == g0.l.f3784a) {
                    G = new k0(cVar, z8);
                    pVar.a0(G);
                }
                aVar = (q6.a) G;
            } else {
                aVar = null;
            }
            pVar.p(false);
            q6.a aVar3 = aVar;
            s0.o oVar4 = oVar2;
            c(aVar2, aVar3, oVar4, z10, j0Var2, pVar, 200064);
            oVar3 = oVar4;
            z11 = z10;
            j0Var3 = j0Var2;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new l0(z8, cVar, oVar3, z11, j0Var3, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z8, z1.a aVar, s0.o oVar, j0 j0Var, g0.p pVar, int i7) {
        int i8;
        float f9;
        int ordinal;
        float f10;
        z1.a aVar2;
        int ordinal2;
        float f11;
        int ordinal3;
        l.l1 f12;
        l.y yVar;
        l.a0 l8;
        Object G;
        g0.t0 t0Var;
        long j8;
        Object M;
        long j9;
        Object M2;
        boolean f13;
        Object G2;
        pVar.S(2007131616);
        if ((i7 & 6) == 0) {
            i8 = (pVar.g(z8) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.f(j0Var) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            l.p1 c4 = l.t1.c(aVar, pVar, (i8 >> 3) & 14, 2);
            g0.g1 g1Var = c4.f5613d;
            l.u1 u1Var = c4.f5610a;
            l.w1 w1Var = l.x1.f5722a;
            z1.a aVar3 = (z1.a) u1Var.a();
            pVar.Q(1800065638);
            int ordinal4 = aVar3.ordinal();
            float f14 = 0.0f;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f9 = 0.0f;
                    pVar.p(false);
                    Float valueOf = Float.valueOf(f9);
                    z1.a aVar4 = (z1.a) g1Var.getValue();
                    pVar.Q(1800065638);
                    ordinal = aVar4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f10 = 0.0f;
                            pVar.p(false);
                            Float valueOf2 = Float.valueOf(f10);
                            l.l1 f15 = c4.f();
                            pVar.Q(1373301606);
                            Object b9 = f15.b();
                            aVar2 = z1.a.f10065g;
                            l.a0 l9 = b9 == aVar2 ? l.e.l(100, 6, null) : f15.c() == aVar2 ? new l.y0(100) : l.e.k(7, null);
                            pVar.p(false);
                            l.n1 b10 = l.t1.b(c4, valueOf, valueOf2, l9, w1Var, pVar, 0);
                            z1.a aVar5 = (z1.a) u1Var.a();
                            pVar.Q(-1426969489);
                            ordinal2 = aVar5.ordinal();
                            if (ordinal2 != 0 || ordinal2 == 1) {
                                f11 = 0.0f;
                            } else {
                                if (ordinal2 != 2) {
                                    throw new b4.c();
                                }
                                f11 = 1.0f;
                            }
                            pVar.p(false);
                            Float valueOf3 = Float.valueOf(f11);
                            z1.a aVar6 = (z1.a) g1Var.getValue();
                            pVar.Q(-1426969489);
                            ordinal3 = aVar6.ordinal();
                            if (ordinal3 != 0 && ordinal3 != 1) {
                                if (ordinal3 == 2) {
                                    throw new b4.c();
                                }
                                f14 = 1.0f;
                            }
                            pVar.p(false);
                            Float valueOf4 = Float.valueOf(f14);
                            f12 = c4.f();
                            pVar.Q(-1324481169);
                            if (f12.b() == aVar2) {
                                l8 = new l.y0(0);
                                yVar = null;
                            } else if (f12.c() == aVar2) {
                                l8 = new l.y0(100);
                                yVar = null;
                            } else {
                                yVar = null;
                                l8 = l.e.l(100, 6, null);
                            }
                            pVar.p(false);
                            l.n1 b11 = l.t1.b(c4, valueOf3, valueOf4, l8, w1Var, pVar, 0);
                            G = pVar.G();
                            t0Var = g0.l.f3784a;
                            if (G == t0Var) {
                                G = new i0();
                                pVar.a0(G);
                            }
                            i0 i0Var = (i0) G;
                            g0.m2 a3 = k.n0.a(aVar == aVar2 ? j0Var.f2082b : j0Var.f2081a, l.e.l(aVar == aVar2 ? 100 : 50, 6, yVar), pVar, 0);
                            if (z8) {
                                int ordinal5 = aVar.ordinal();
                                if (ordinal5 != 0) {
                                    if (ordinal5 == 1) {
                                        j8 = j0Var.f2084d;
                                    } else if (ordinal5 != 2) {
                                        throw new b4.c();
                                    }
                                }
                                j8 = j0Var.f2083c;
                            } else {
                                int ordinal6 = aVar.ordinal();
                                if (ordinal6 == 0) {
                                    j8 = j0Var.f2085e;
                                } else if (ordinal6 == 1) {
                                    j8 = j0Var.f2086f;
                                } else {
                                    if (ordinal6 != 2) {
                                        throw new b4.c();
                                    }
                                    j8 = j0Var.f2087g;
                                }
                            }
                            if (z8) {
                                pVar.Q(-392211906);
                                M = k.n0.a(j8, l.e.l(aVar == aVar2 ? 100 : 50, 6, yVar), pVar, 0);
                                pVar.p(false);
                            } else {
                                pVar.Q(-392031362);
                                M = g0.d.M(new z0.u(j8), pVar);
                                pVar.p(false);
                            }
                            if (z8) {
                                int ordinal7 = aVar.ordinal();
                                if (ordinal7 != 0) {
                                    if (ordinal7 == 1) {
                                        j9 = j0Var.f2089i;
                                    } else if (ordinal7 != 2) {
                                        throw new b4.c();
                                    }
                                }
                                j9 = j0Var.f2088h;
                            } else {
                                int ordinal8 = aVar.ordinal();
                                if (ordinal8 == 0) {
                                    j9 = j0Var.f2090j;
                                } else if (ordinal8 == 1) {
                                    j9 = j0Var.f2091k;
                                } else {
                                    if (ordinal8 != 2) {
                                        throw new b4.c();
                                    }
                                    j9 = j0Var.f2092l;
                                }
                            }
                            if (z8) {
                                pVar.Q(-1725816497);
                                M2 = k.n0.a(j9, l.e.l(aVar == aVar2 ? 100 : 50, 6, yVar), pVar, 0);
                                pVar.p(false);
                            } else {
                                pVar.Q(-1725635953);
                                M2 = g0.d.M(new z0.u(j9), pVar);
                                pVar.p(false);
                            }
                            s0.o f16 = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.n(oVar));
                            f13 = pVar.f(M) | pVar.f(M2) | pVar.f(a3) | pVar.f(b10) | pVar.f(b11);
                            G2 = pVar.G();
                            if (!f13 || G2 == t0Var) {
                                G2 = new m0(M, M2, a3, b10, b11, i0Var, 0);
                                pVar.a0(G2);
                            }
                            j1.c.B(f16, (q6.c) G2, pVar, 0);
                        } else if (ordinal != 2) {
                            throw new b4.c();
                        }
                    }
                    f10 = 1.0f;
                    pVar.p(false);
                    Float valueOf22 = Float.valueOf(f10);
                    l.l1 f152 = c4.f();
                    pVar.Q(1373301606);
                    Object b92 = f152.b();
                    aVar2 = z1.a.f10065g;
                    if (b92 == aVar2) {
                    }
                    pVar.p(false);
                    l.n1 b102 = l.t1.b(c4, valueOf, valueOf22, l9, w1Var, pVar, 0);
                    z1.a aVar52 = (z1.a) u1Var.a();
                    pVar.Q(-1426969489);
                    ordinal2 = aVar52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f11 = 0.0f;
                    pVar.p(false);
                    Float valueOf32 = Float.valueOf(f11);
                    z1.a aVar62 = (z1.a) g1Var.getValue();
                    pVar.Q(-1426969489);
                    ordinal3 = aVar62.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 2) {
                        }
                    }
                    pVar.p(false);
                    Float valueOf42 = Float.valueOf(f14);
                    f12 = c4.f();
                    pVar.Q(-1324481169);
                    if (f12.b() == aVar2) {
                    }
                    pVar.p(false);
                    l.n1 b112 = l.t1.b(c4, valueOf32, valueOf42, l8, w1Var, pVar, 0);
                    G = pVar.G();
                    t0Var = g0.l.f3784a;
                    if (G == t0Var) {
                    }
                    i0 i0Var2 = (i0) G;
                    g0.m2 a32 = k.n0.a(aVar == aVar2 ? j0Var.f2082b : j0Var.f2081a, l.e.l(aVar == aVar2 ? 100 : 50, 6, yVar), pVar, 0);
                    if (z8) {
                    }
                    if (z8) {
                    }
                    if (z8) {
                    }
                    if (z8) {
                    }
                    s0.o f162 = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.n(oVar));
                    f13 = pVar.f(M) | pVar.f(M2) | pVar.f(a32) | pVar.f(b102) | pVar.f(b112);
                    G2 = pVar.G();
                    if (!f13) {
                    }
                    G2 = new m0(M, M2, a32, b102, b112, i0Var2, 0);
                    pVar.a0(G2);
                    j1.c.B(f162, (q6.c) G2, pVar, 0);
                } else if (ordinal4 != 2) {
                    throw new b4.c();
                }
            }
            f9 = 1.0f;
            pVar.p(false);
            Float valueOf5 = Float.valueOf(f9);
            z1.a aVar42 = (z1.a) g1Var.getValue();
            pVar.Q(1800065638);
            ordinal = aVar42.ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            pVar.p(false);
            Float valueOf222 = Float.valueOf(f10);
            l.l1 f1522 = c4.f();
            pVar.Q(1373301606);
            Object b922 = f1522.b();
            aVar2 = z1.a.f10065g;
            if (b922 == aVar2) {
            }
            pVar.p(false);
            l.n1 b1022 = l.t1.b(c4, valueOf5, valueOf222, l9, w1Var, pVar, 0);
            z1.a aVar522 = (z1.a) u1Var.a();
            pVar.Q(-1426969489);
            ordinal2 = aVar522.ordinal();
            if (ordinal2 != 0) {
            }
            f11 = 0.0f;
            pVar.p(false);
            Float valueOf322 = Float.valueOf(f11);
            z1.a aVar622 = (z1.a) g1Var.getValue();
            pVar.Q(-1426969489);
            ordinal3 = aVar622.ordinal();
            if (ordinal3 != 0) {
            }
            pVar.p(false);
            Float valueOf422 = Float.valueOf(f14);
            f12 = c4.f();
            pVar.Q(-1324481169);
            if (f12.b() == aVar2) {
            }
            pVar.p(false);
            l.n1 b1122 = l.t1.b(c4, valueOf322, valueOf422, l8, w1Var, pVar, 0);
            G = pVar.G();
            t0Var = g0.l.f3784a;
            if (G == t0Var) {
            }
            i0 i0Var22 = (i0) G;
            g0.m2 a322 = k.n0.a(aVar == aVar2 ? j0Var.f2082b : j0Var.f2081a, l.e.l(aVar == aVar2 ? 100 : 50, 6, yVar), pVar, 0);
            if (z8) {
            }
            if (z8) {
            }
            if (z8) {
            }
            if (z8) {
            }
            s0.o f1622 = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.n(oVar));
            f13 = pVar.f(M) | pVar.f(M2) | pVar.f(a322) | pVar.f(b1022) | pVar.f(b1122);
            G2 = pVar.G();
            if (!f13) {
            }
            G2 = new m0(M, M2, a322, b1022, b1122, i0Var22, 0);
            pVar.a0(G2);
            j1.c.B(f1622, (q6.c) G2, pVar, 0);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new n0(z8, aVar, oVar, j0Var, i7);
        }
    }

    public static final void c(z1.a aVar, q6.a aVar2, s0.o oVar, boolean z8, j0 j0Var, g0.p pVar, int i7) {
        int i8;
        z1.a aVar3;
        g0.p pVar2;
        boolean z9;
        j0 j0Var2;
        pVar.S(-1608358065);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.g(z8) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.f(j0Var) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.f(null) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && pVar.x()) {
            pVar.L();
            aVar3 = aVar;
            pVar2 = pVar;
            j0Var2 = j0Var;
            z9 = z8;
        } else {
            pVar.N();
            if ((i7 & 1) != 0 && !pVar.w()) {
                pVar.L();
            }
            pVar.q();
            pVar.Q(-97239746);
            s0.o oVar2 = s0.l.f8103a;
            s0.o b9 = aVar2 != null ? androidx.compose.foundation.selection.a.b(e3.a(f0.a.f2893a / 2, pVar, 54, 4), aVar2, new y1.f(1), aVar, z8) : oVar2;
            pVar.p(false);
            if (aVar2 != null) {
                g0.n2 n2Var = r1.f2357a;
                oVar2 = MinimumInteractiveModifier.f694a;
            }
            aVar3 = aVar;
            pVar2 = pVar;
            b(z8, aVar3, androidx.compose.foundation.layout.b.e(oVar.j(oVar2).j(b9), f2268a), j0Var, pVar2, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 7168));
            z9 = z8;
            j0Var2 = j0Var;
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new o0(aVar3, aVar2, oVar, z9, j0Var2, i7);
        }
    }
}
