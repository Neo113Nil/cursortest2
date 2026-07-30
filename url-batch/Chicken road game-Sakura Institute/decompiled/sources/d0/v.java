package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2461a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2462b;

    static {
        new l.u(0.8f, 0.0f, 0.8f, 0.15f);
        float f9 = 4;
        f2461a = f9;
        f2462b = 16 - f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(o0.a aVar, s0.o oVar, q6.e eVar, q6.f fVar, float f9, q.s0 s0Var, y3 y3Var, g0.p pVar, int i7, int i8) {
        q6.f fVar2;
        int i9;
        q6.e eVar2;
        y3 y3Var2;
        int i10;
        s0.o oVar2;
        q6.f fVar3;
        y3 y3Var3;
        q.s0 s0Var2;
        float f10;
        s0.o oVar3;
        float f11;
        g0.p1 r8;
        pVar.S(1952988048);
        int i11 = i7 | 432;
        int i12 = i8 & 8;
        if (i12 != 0) {
            i11 = i7 | 3504;
        } else if ((i7 & 3072) == 0) {
            fVar2 = fVar;
            i11 |= pVar.h(fVar2) ? 2048 : 1024;
            i9 = i11 | 13197312;
            if ((4793491 & i9) == 4793490 || !pVar.x()) {
                pVar.N();
                if ((i7 & 1) != 0 || pVar.w()) {
                    eVar2 = w0.f2485a;
                    q6.f fVar4 = i12 == 0 ? w0.f2486b : fVar2;
                    float f12 = z3.f2563a;
                    q.f0 f0Var = new q.f0(e0.a.b(pVar), q.c.f7263g | 16);
                    q0 q0Var = (q0) pVar.k(s0.f2378a);
                    y3Var2 = q0Var.M;
                    if (y3Var2 == null) {
                        int i13 = f0.r.f3004a;
                        y3 y3Var4 = new y3(s0.c(q0Var, 35), s0.c(q0Var, f0.r.f3006c), s0.c(q0Var, f0.r.f3005b), s0.c(q0Var, f0.r.f3004a), s0.c(q0Var, f0.r.f3007d));
                        q0Var.M = y3Var4;
                        y3Var2 = y3Var4;
                    }
                    q6.f fVar5 = fVar4;
                    i10 = i9 & (-4128769);
                    oVar2 = s0.l.f8103a;
                    fVar3 = fVar5;
                    y3Var3 = y3Var2;
                    s0Var2 = f0Var;
                    f10 = f12;
                } else {
                    pVar.L();
                    eVar2 = eVar;
                    f10 = f9;
                    s0Var2 = s0Var;
                    y3Var3 = y3Var;
                    i10 = i9 & (-4128769);
                    fVar3 = fVar2;
                    oVar2 = oVar;
                }
                pVar.q();
                b(oVar2, aVar, b4.a(f0.s.f3009b, pVar), eVar2, fVar3, (!m2.e.a(f10, Float.NaN) || m2.e.a(f10, Float.POSITIVE_INFINITY)) ? z3.f2563a : f10, s0Var2, y3Var3, pVar, 805334070 | ((i10 << 6) & 458752));
                oVar3 = oVar2;
                f11 = f10;
            } else {
                pVar.L();
                eVar2 = eVar;
                f11 = f9;
                s0Var2 = s0Var;
                y3Var3 = y3Var;
                fVar3 = fVar2;
                oVar3 = oVar;
            }
            r8 = pVar.r();
            if (r8 == null) {
                r8.f3853d = new o(aVar, oVar3, eVar2, fVar3, f11, s0Var2, y3Var3, i7, i8);
                return;
            }
            return;
        }
        fVar2 = fVar;
        i9 = i11 | 13197312;
        if ((4793491 & i9) == 4793490) {
        }
        pVar.N();
        if ((i7 & 1) != 0) {
        }
        eVar2 = w0.f2485a;
        if (i12 == 0) {
        }
        float f122 = z3.f2563a;
        q.f0 f0Var2 = new q.f0(e0.a.b(pVar), q.c.f7263g | 16);
        q0 q0Var2 = (q0) pVar.k(s0.f2378a);
        y3Var2 = q0Var2.M;
        if (y3Var2 == null) {
        }
        q6.f fVar52 = fVar4;
        i10 = i9 & (-4128769);
        oVar2 = s0.l.f8103a;
        fVar3 = fVar52;
        y3Var3 = y3Var2;
        s0Var2 = f0Var2;
        f10 = f122;
        pVar.q();
        b(oVar2, aVar, b4.a(f0.s.f3009b, pVar), eVar2, fVar3, (!m2.e.a(f10, Float.NaN) || m2.e.a(f10, Float.POSITIVE_INFINITY)) ? z3.f2563a : f10, s0Var2, y3Var3, pVar, 805334070 | ((i10 << 6) & 458752));
        oVar3 = oVar2;
        f11 = f10;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    public static final void b(s0.o oVar, o0.a aVar, a2.k0 k0Var, q6.e eVar, q6.f fVar, float f9, q.s0 s0Var, y3 y3Var, g0.p pVar, int i7) {
        int i8;
        pVar.S(-342194911);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(k0Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.g(true) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.h(eVar) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.h(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= pVar.c(f9) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i8 |= pVar.f(s0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i8 |= pVar.f(y3Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i7) == 0) {
            i8 |= pVar.f(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && pVar.x()) {
            pVar.L();
        } else {
            if (Float.isNaN(f9) || f9 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float y4 = ((m2.b) pVar.k(s1.f1.f8217f)).y(f9);
            if (y4 < 0.0f) {
                y4 = 0.0f;
            }
            int i9 = i8 & 1879048192;
            boolean c4 = (i9 == 536870912) | pVar.c(y4);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (c4 || G == t0Var) {
                G = new r0(0, 12);
                pVar.a0(G);
            }
            g0.d.g((q6.a) G, pVar);
            boolean z8 = i9 == 536870912;
            Object G2 = pVar.G();
            if (z8 || G2 == t0Var) {
                G2 = g0.d.C(new r0(0, 13));
                pVar.a0(G2);
            }
            g0.m2 a3 = k.n0.a(z0.l0.o(l.z.f5733b.c(((Number) ((g0.m2) G2).getValue()).floatValue()), y3Var.f2540a, y3Var.f2541b), l.e.k(5, null), pVar, 48);
            o0.a b9 = o0.f.b(1370231018, new a2.a(1, fVar), pVar);
            pVar.Q(-1193605157);
            pVar.p(false);
            s3.a(oVar.j(s0.l.f8103a), null, ((z0.u) a3.getValue()).f10059a, 0L, 0.0f, 0.0f, o0.f.b(-1943739546, new q(s0Var, f9, y3Var, aVar, k0Var, eVar, b9), pVar), pVar, 12582912, 122);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new r(oVar, aVar, k0Var, eVar, fVar, f9, s0Var, y3Var, i7);
        }
    }

    public static final void c(s0.o oVar, p pVar, long j8, long j9, long j10, o0.a aVar, a2.k0 k0Var, q.h hVar, q.f fVar, q6.e eVar, o0.a aVar2, g0.p pVar2, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        long j11 = j10;
        o0.a aVar3 = aVar2;
        pVar2.S(-742442296);
        if ((i7 & 6) == 0) {
            i9 = (pVar2.f(oVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= (i7 & 64) == 0 ? pVar2.f(pVar) : pVar2.h(pVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= pVar2.e(j8) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= pVar2.e(j9) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= pVar2.e(j11) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= pVar2.h(aVar) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= pVar2.f(k0Var) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= pVar2.c(1.0f) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= pVar2.f(hVar) ? 67108864 : 33554432;
        }
        int i12 = i9;
        if ((i7 & 805306368) == 0) {
            i10 = i12 | (pVar2.f(fVar) ? 536870912 : 268435456);
        } else {
            i10 = i12;
        }
        if ((i8 & 6) == 0) {
            i11 = i8 | (pVar2.d(0) ? 4 : 2);
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            i11 |= pVar2.g(false) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i11 |= pVar2.h(eVar) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i11 |= pVar2.h(aVar3) ? 2048 : 1024;
        }
        int i13 = i11;
        if ((i10 & 306783379) == 306783378 && (i13 & 1171) == 1170 && pVar2.x()) {
            pVar2.L();
        } else {
            boolean z8 = ((i10 & 112) == 32 || ((i10 & 64) != 0 && pVar2.h(pVar))) | ((i10 & 1879048192) == 536870912) | ((i10 & 234881024) == 67108864) | ((i13 & 14) == 4);
            Object G = pVar2.G();
            if (z8 || G == g0.l.f3784a) {
                G = new t(pVar, fVar, hVar);
                pVar2.a0(G);
            }
            p1.f0 f0Var = (p1.f0) G;
            int i14 = pVar2.P;
            g0.k1 m8 = pVar2.m();
            s0.o c4 = s0.a.c(pVar2, oVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            r1.h hVar2 = r1.i.f7784e;
            g0.d.Q(pVar2, f0Var, hVar2);
            r1.h hVar3 = r1.i.f7783d;
            g0.d.Q(pVar2, m8, hVar3);
            r1.h hVar4 = r1.i.f7785f;
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i14))) {
                a0.m.q(i14, pVar2, i14, hVar4);
            }
            r1.h hVar5 = r1.i.f7782c;
            g0.d.Q(pVar2, c4, hVar5);
            s0.l lVar = s0.l.f8103a;
            s0.o c6 = androidx.compose.ui.layout.a.c(lVar, "navigationIcon");
            float f9 = f2461a;
            s0.o h3 = androidx.compose.foundation.layout.b.h(c6, f9, 0.0f, 0.0f, 0.0f, 14);
            s0.g gVar = s0.b.f8078f;
            p1.f0 e9 = q.n.e(gVar, false);
            int i15 = pVar2.P;
            g0.k1 m9 = pVar2.m();
            s0.o c9 = s0.a.c(pVar2, h3);
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, e9, hVar2);
            g0.d.Q(pVar2, m9, hVar3);
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i15))) {
                a0.m.q(i15, pVar2, i15, hVar4);
            }
            g0.d.Q(pVar2, c9, hVar5);
            g0.z zVar = y0.f2529a;
            g0.d.a(zVar.a(new z0.u(j8)), eVar, pVar2, ((i13 >> 3) & 112) | 8);
            pVar2.p(true);
            s0.o b9 = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.b.g(androidx.compose.ui.layout.a.c(lVar, "title"), f9, 0.0f, 2).j(lVar), 1.0f, 0.0f, null, false, 131067);
            p1.f0 e10 = q.n.e(gVar, false);
            int i16 = pVar2.P;
            g0.k1 m10 = pVar2.m();
            s0.o c10 = s0.a.c(pVar2, b9);
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, e10, hVar2);
            g0.d.Q(pVar2, m10, hVar3);
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i16))) {
                a0.m.q(i16, pVar2, i16, hVar4);
            }
            g0.d.Q(pVar2, c10, hVar5);
            int i17 = i10 >> 9;
            e0.a.a(j9, k0Var, aVar, pVar2, (i17 & 14) | ((i10 >> 15) & 112) | (i17 & 896));
            pVar2.p(true);
            s0.o h8 = androidx.compose.foundation.layout.b.h(androidx.compose.ui.layout.a.c(lVar, "actionIcons"), 0.0f, 0.0f, f9, 0.0f, 11);
            p1.f0 e11 = q.n.e(gVar, false);
            int i18 = pVar2.P;
            g0.k1 m11 = pVar2.m();
            s0.o c11 = s0.a.c(pVar2, h8);
            pVar2.U();
            if (pVar2.O) {
                pVar2.l(nVar);
            } else {
                pVar2.d0();
            }
            g0.d.Q(pVar2, e11, hVar2);
            g0.d.Q(pVar2, m11, hVar3);
            if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i18))) {
                a0.m.q(i18, pVar2, i18, hVar4);
            }
            g0.d.Q(pVar2, c11, hVar5);
            j11 = j10;
            aVar3 = aVar2;
            g0.d.a(zVar.a(new z0.u(j11)), aVar3, pVar2, 8 | ((i13 >> 6) & 112));
            pVar2.p(true);
            pVar2.p(true);
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new u(oVar, pVar, j8, j9, j11, aVar, k0Var, hVar, fVar, eVar, aVar3, i7, i8);
        }
    }
}
