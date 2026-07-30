package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1981a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1982b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1983c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1984d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1985e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f1986f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f1987g;

    static {
        float f9 = 4;
        f1981a = f9;
        float f10 = f0.l.f2958a;
        f1982b = f0.l.f2960c;
        float f11 = f0.l.f2962e;
        f1983c = f11;
        f1984d = f9;
        float f12 = f0.l.f2959b;
        float f13 = f0.l.f2961d;
        float f14 = 2;
        f1985e = (f12 - f13) / f14;
        f1986f = (f0.l.f2958a - f13) / f14;
        f1987g = (f11 - f13) / f14;
    }

    public static final void a(s0.o oVar, long j8, long j9, q.s0 s0Var, o0.a aVar, g0.p pVar, int i7) {
        s0.o oVar2;
        long j10;
        long j11;
        q.s0 s0Var2;
        o0.a aVar2;
        s0.o oVar3;
        q.s0 s0Var3;
        pVar.S(118552648);
        if (((i7 | 11414) & 74899) == 74898 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            j11 = j8;
            j10 = j9;
            s0Var3 = s0Var;
            aVar2 = aVar;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                float f9 = f0.l.f2958a;
                long d8 = s0.d(35, pVar);
                long b9 = s0.b(d8, pVar);
                q.f0 f0Var = new q.f0(e0.a.b(pVar), q.c.f7264h | q.c.f7259c);
                oVar2 = s0.l.f8103a;
                j10 = b9;
                j11 = d8;
                s0Var2 = f0Var;
            } else {
                pVar.L();
                oVar2 = oVar;
                j11 = j8;
                j10 = j9;
                s0Var2 = s0Var;
            }
            pVar.q();
            aVar2 = aVar;
            s3.a(oVar2, null, j11, j10, 0.0f, 0.0f, o0.f.b(-2092683357, new b0(s0Var2, 2, aVar2), pVar), pVar, 12582918, 114);
            oVar3 = oVar2;
            s0Var3 = s0Var2;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new w1(oVar3, j11, j10, s0Var3, aVar2, i7);
        }
    }

    public static final void b(boolean z8, q6.a aVar, o0.a aVar2, s0.o oVar, boolean z9, q6.e eVar, boolean z10, v1 v1Var, g0.p pVar, int i7) {
        v1 v1Var2;
        boolean z11;
        boolean z12;
        v1 v1Var3;
        s0.o oVar2;
        g0.p pVar2;
        z0.p0 a3;
        s0.o oVar3;
        v1 v1Var4;
        boolean z13;
        boolean z14;
        pVar.S(-1533971045);
        if (((i7 | (pVar.g(z8) ? 4 : 2) | (pVar.h(aVar) ? 32 : 16) | 106458112) & 38347923) == 38347922 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            z13 = z9;
            v1Var4 = v1Var;
            pVar2 = pVar;
            z14 = z10;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                q0 q0Var = (q0) pVar.k(s0.f2378a);
                v1 v1Var5 = q0Var.P;
                if (v1Var5 == null) {
                    float f9 = f0.l.f2958a;
                    long c4 = s0.c(q0Var, 15);
                    long c6 = s0.c(q0Var, 18);
                    long c9 = s0.c(q0Var, 32);
                    int i8 = f0.l.f2963f;
                    long c10 = s0.c(q0Var, i8);
                    int i9 = f0.l.f2964g;
                    v1Var2 = new v1(c4, c6, c9, c10, s0.c(q0Var, i9), z0.u.b(s0.c(q0Var, i8), 0.38f), z0.u.b(s0.c(q0Var, i9), 0.38f));
                    q0Var.P = v1Var2;
                } else {
                    v1Var2 = v1Var5;
                }
                z11 = true;
                z12 = true;
                v1Var3 = v1Var2;
                oVar2 = s0.l.f8103a;
            } else {
                pVar.L();
                oVar2 = oVar;
                z11 = z9;
                z12 = z10;
                v1Var3 = v1Var;
            }
            pVar.q();
            pVar.Q(-782588008);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (G == t0Var) {
                G = new p.j();
                pVar.a0(G);
            }
            p.j jVar = (p.j) G;
            int i10 = 0;
            pVar.p(false);
            boolean z15 = z12;
            v1 v1Var6 = v1Var3;
            o0.a b9 = o0.f.b(-1023357515, new z1(v1Var3, z8, z11, eVar, z15, aVar2), pVar);
            pVar.Q(-782561860);
            o0.a b10 = eVar == null ? null : o0.f.b(-105269599, new a2(v1Var6, z8, z11, eVar), pVar);
            pVar.p(false);
            s0.o oVar4 = oVar2;
            s0.o a9 = androidx.compose.foundation.selection.a.a(oVar4, z8, jVar, z11, new y1.f(4), aVar);
            boolean z16 = z11;
            s0.o l8 = androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.a(a9, Float.NaN, f1983c), f1982b);
            p1.f0 e9 = q.n.e(s0.b.f8082j, true);
            int i11 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c11 = s0.a.c(pVar, l8);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e9, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i11))) {
                a0.m.q(i11, pVar, i11, hVar);
            }
            g0.d.Q(pVar, c11, r1.i.f7782c);
            float f10 = z8 ? 1.0f : 0.0f;
            l.k l9 = l.e.l(150, 6, null);
            if (l9 == l.f.f5472a) {
                pVar.Q(1125598679);
                boolean c12 = pVar.c(0.01f);
                Object G2 = pVar.G();
                if (c12 || G2 == t0Var) {
                    G2 = l.e.k(3, Float.valueOf(0.01f));
                    pVar.a0(G2);
                }
                l9 = (l.a1) G2;
                pVar.p(false);
            } else {
                pVar.Q(1125708605);
                pVar.p(false);
            }
            g0.m2 a10 = l.f.a(Float.valueOf(f10), l.x1.f5722a, l9, Float.valueOf(0.01f), "FloatAnimation", pVar, 0, 0);
            pVar2 = pVar;
            m2.b bVar = (m2.b) pVar2.k(s1.f1.f8217f);
            long a11 = u3.r.a((bVar.K(r1) - bVar.K(f0.l.f2959b)) / 2, 0.0f);
            boolean f11 = pVar2.f(jVar) | pVar2.e(a11);
            Object G3 = pVar2.G();
            if (f11 || G3 == t0Var) {
                G3 = new e0.f(jVar, a11);
                pVar2.a0(G3);
            }
            e0.f fVar = (e0.f) G3;
            if (eVar != null) {
                pVar2.Q(585295320);
                a3 = o3.a(5, pVar2);
                pVar2.p(false);
            } else {
                pVar2.Q(585379857);
                a3 = o3.a(f0.l.f2966i, pVar2);
                pVar2.p(false);
            }
            o0.a b11 = o0.f.b(211026382, new b0(a3, 3, fVar), pVar2);
            o0.a b12 = o0.f.b(-1862011490, new x1(a10, v1Var6, a3, i10), pVar2);
            boolean f12 = pVar2.f(a10);
            Object G4 = pVar2.G();
            if (f12 || G4 == t0Var) {
                G4 = new a0.i0(a10, 2);
                pVar2.a0(G4);
            }
            c(b11, b12, b9, b10, z15, (q6.a) G4, pVar2, 25014);
            pVar2.p(true);
            oVar3 = oVar4;
            v1Var4 = v1Var6;
            z13 = z16;
            z14 = z15;
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new y1(z8, aVar, aVar2, oVar3, z13, eVar, z14, v1Var4, i7);
        }
    }

    public static final void c(o0.a aVar, o0.a aVar2, o0.a aVar3, q6.e eVar, boolean z8, q6.a aVar4, g0.p pVar, int i7) {
        int i8;
        boolean z9;
        q6.a aVar5;
        boolean z10;
        q6.e eVar2 = eVar;
        pVar.S(1498399348);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(aVar3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.h(eVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.g(z8) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.h(aVar4) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && pVar.x()) {
            pVar.L();
            z9 = z8;
            aVar5 = aVar4;
        } else {
            int i9 = 458752 & i8;
            int i10 = 57344 & i8;
            boolean z11 = ((i8 & 7168) == 2048) | (i9 == 131072) | (i10 == 16384);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (z11 || G == t0Var) {
                G = new c2(aVar4, eVar2, z8);
                pVar.a0(G);
            }
            p1.f0 f0Var = (p1.f0) G;
            int i11 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.l lVar = s0.l.f8103a;
            s0.o c4 = s0.a.c(pVar, lVar);
            r1.j.f7810d.getClass();
            int i12 = i8;
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            r1.h hVar = r1.i.f7784e;
            g0.d.Q(pVar, f0Var, hVar);
            r1.h hVar2 = r1.i.f7783d;
            g0.d.Q(pVar, m8, hVar2);
            r1.h hVar3 = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i11))) {
                a0.m.q(i11, pVar, i11, hVar3);
            }
            r1.h hVar4 = r1.i.f7782c;
            g0.d.Q(pVar, c4, hVar4);
            aVar.d(pVar, Integer.valueOf(i12 & 14));
            aVar2.d(pVar, Integer.valueOf((i12 >> 3) & 14));
            s0.o c6 = androidx.compose.ui.layout.a.c(lVar, "icon");
            s0.g gVar = s0.b.f8078f;
            p1.f0 e9 = q.n.e(gVar, false);
            int i13 = pVar.P;
            g0.k1 m9 = pVar.m();
            s0.o c9 = s0.a.c(pVar, c6);
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e9, hVar);
            g0.d.Q(pVar, m9, hVar2);
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i13))) {
                a0.m.q(i13, pVar, i13, hVar3);
            }
            g0.d.Q(pVar, c9, hVar4);
            aVar3.d(pVar, Integer.valueOf((i12 >> 6) & 14));
            pVar.p(true);
            pVar.Q(2145400941);
            if (eVar != null) {
                s0.o c10 = androidx.compose.ui.layout.a.c(lVar, "label");
                boolean z12 = (i10 == 16384) | (i9 == 131072);
                Object G2 = pVar.G();
                if (z12 || G2 == t0Var) {
                    z9 = z8;
                    aVar5 = aVar4;
                    G2 = new b2(z9, aVar5, 0);
                    pVar.a0(G2);
                } else {
                    z9 = z8;
                    aVar5 = aVar4;
                }
                s0.o a3 = androidx.compose.ui.graphics.a.a(c10, (q6.c) G2);
                p1.f0 e10 = q.n.e(gVar, false);
                int i14 = pVar.P;
                g0.k1 m10 = pVar.m();
                s0.o c11 = s0.a.c(pVar, a3);
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e10, hVar);
                g0.d.Q(pVar, m10, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i14))) {
                    a0.m.q(i14, pVar, i14, hVar3);
                }
                g0.d.Q(pVar, c11, hVar4);
                eVar2 = eVar;
                eVar2.d(pVar, Integer.valueOf((i12 >> 9) & 14));
                z10 = true;
                pVar.p(true);
            } else {
                eVar2 = eVar;
                z9 = z8;
                aVar5 = aVar4;
                z10 = true;
            }
            pVar.p(false);
            pVar.p(z10);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d2(aVar, aVar2, aVar3, eVar2, z9, aVar5, i7);
        }
    }
}
