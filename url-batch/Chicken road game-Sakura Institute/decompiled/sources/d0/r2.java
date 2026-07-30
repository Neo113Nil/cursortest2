package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2358a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2359b;

    static {
        long j8 = f0.t.f3031l;
        if (r4.a.L(j8)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        f2359b = r4.a.O(1095216660480L & j8, m2.m.c(j8) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, q6.c cVar, s0.o oVar, boolean z8, a2.k0 k0Var, q6.e eVar, a0.s sVar, w.i0 i0Var, w.h0 h0Var, boolean z9, int i7, int i8, z0.p0 p0Var, t3 t3Var, g0.p pVar, int i9, int i10, int i11) {
        boolean z10;
        a2.k0 k0Var2;
        t3 t3Var2;
        boolean z11;
        s0.o oVar2;
        boolean z12;
        a0.s sVar2;
        w.i0 i0Var2;
        int i12;
        z0.p0 p0Var2;
        w.h0 h0Var2;
        boolean z13;
        int i13;
        Object G;
        long b9;
        t3 t3Var3;
        boolean z14;
        a0.s sVar3;
        a2.k0 k0Var3;
        s0.o oVar3;
        w.i0 i0Var3;
        w.h0 h0Var3;
        boolean z15;
        int i14;
        int i15;
        z0.p0 p0Var3;
        g0.p1 r8;
        pVar.S(-1922450045);
        int i16 = i9 | (pVar.f(str) ? 4 : 2) | 918646144;
        int i17 = i10 | 1797558;
        int i18 = i11 & 131072;
        if (i18 != 0) {
            i17 = 14380470;
        } else if ((i10 & 12582912) == 0) {
            z10 = z9;
            i17 |= pVar.g(z10) ? 8388608 : 4194304;
            int i19 = i17 | 838860800;
            if ((i16 & 306783379) != 306783378 && (i19 & 306783379) == 306783378 && pVar.x()) {
                pVar.L();
                oVar3 = oVar;
                k0Var3 = k0Var;
                sVar3 = sVar;
                i0Var3 = i0Var;
                h0Var3 = h0Var;
                i14 = i7;
                i15 = i8;
                p0Var3 = p0Var;
                t3Var3 = t3Var;
                z15 = z10;
                z14 = z8;
            } else {
                pVar.N();
                if ((i9 & 1) != 0 || pVar.w()) {
                    k0Var2 = (a2.k0) pVar.k(x3.f2526a);
                    if (i18 != 0) {
                        z10 = false;
                    }
                    int i20 = !z10 ? 1 : Integer.MAX_VALUE;
                    k2 k2Var = k2.f2128a;
                    z0.p0 a3 = o3.a(3, pVar);
                    q0 q0Var = (q0) pVar.k(s0.f2378a);
                    t3Var2 = q0Var.Q;
                    pVar.Q(1540400102);
                    if (t3Var2 != null) {
                        long c4 = s0.c(q0Var, 18);
                        long c6 = s0.c(q0Var, 18);
                        z11 = z10;
                        long b10 = z0.u.b(s0.c(q0Var, 18), 0.38f);
                        long c9 = s0.c(q0Var, 18);
                        long j8 = z0.u.f10056f;
                        t3 t3Var4 = new t3(c4, c6, b10, c9, j8, j8, j8, j8, s0.c(q0Var, 26), s0.c(q0Var, 2), (a0.g1) pVar.k(a0.h1.f83a), s0.c(q0Var, 26), s0.c(q0Var, 24), z0.u.b(s0.c(q0Var, 18), 0.12f), s0.c(q0Var, 2), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 18), 0.38f), s0.c(q0Var, 19), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 18), 0.38f), s0.c(q0Var, 2), s0.c(q0Var, 26), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 18), 0.38f), s0.c(q0Var, 2), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 18), 0.38f), s0.c(q0Var, 19), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 18), 0.38f), s0.c(q0Var, 2), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 19), 0.38f), s0.c(q0Var, 19), s0.c(q0Var, 19), s0.c(q0Var, 19), z0.u.b(s0.c(q0Var, 19), 0.38f), s0.c(q0Var, 19));
                        q0Var.Q = t3Var4;
                        t3Var2 = t3Var4;
                    } else {
                        z11 = z10;
                    }
                    pVar.p(false);
                    oVar2 = s0.l.f8103a;
                    z12 = z11;
                    sVar2 = g2.e0.f4030a;
                    i0Var2 = w.i0.f9252a;
                    i12 = i20;
                    p0Var2 = a3;
                    h0Var2 = w.h0.f9250a;
                    z13 = true;
                    i13 = 1;
                } else {
                    pVar.L();
                    oVar2 = oVar;
                    z13 = z8;
                    k0Var2 = k0Var;
                    sVar2 = sVar;
                    i0Var2 = i0Var;
                    h0Var2 = h0Var;
                    i12 = i7;
                    i13 = i8;
                    p0Var2 = p0Var;
                    t3Var2 = t3Var;
                    z12 = z10;
                }
                pVar.q();
                pVar.Q(30062948);
                G = pVar.G();
                if (G == g0.l.f3784a) {
                    G = new p.j();
                    pVar.a0(G);
                }
                p.j jVar = (p.j) G;
                boolean z16 = false;
                pVar.p(false);
                pVar.Q(30069058);
                b9 = k0Var2.b();
                if (b9 == 16) {
                    b9 = !z13 ? t3Var2.f2408c : ((Boolean) t6.a.v(jVar, pVar, 0).getValue()).booleanValue() ? t3Var2.f2406a : t3Var2.f2407b;
                    z16 = false;
                }
                long j9 = b9;
                pVar.p(z16);
                s0.o oVar4 = oVar2;
                t3 t3Var5 = t3Var2;
                g0.d.a(a0.h1.f83a.a(t3Var2.f2416k), o0.f.b(-1886965181, new n2(oVar4, eVar, (m2.b) pVar.k(s1.f1.f8217f), t3Var5, str, cVar, z13, k0Var2.d(new a2.k0(j9, 0L, null, 0L, 0, 0L, 16777214)), i0Var2, h0Var2, z12, i12, i13, sVar2, jVar, p0Var2), pVar), pVar, 56);
                a0.s sVar4 = sVar2;
                t3Var3 = t3Var5;
                z14 = z13;
                sVar3 = sVar4;
                k0Var3 = k0Var2;
                oVar3 = oVar4;
                i0Var3 = i0Var2;
                h0Var3 = h0Var2;
                z15 = z12;
                i14 = i12;
                i15 = i13;
                p0Var3 = p0Var2;
            }
            r8 = pVar.r();
            if (r8 == null) {
                r8.f3853d = new o2(str, cVar, oVar3, z14, k0Var3, eVar, sVar3, i0Var3, h0Var3, z15, i14, i15, p0Var3, t3Var3, i9, i10, i11);
                return;
            }
            return;
        }
        z10 = z9;
        int i192 = i17 | 838860800;
        if ((i16 & 306783379) != 306783378) {
        }
        pVar.N();
        if ((i9 & 1) != 0) {
        }
        k0Var2 = (a2.k0) pVar.k(x3.f2526a);
        if (i18 != 0) {
        }
        if (!z10) {
        }
        k2 k2Var2 = k2.f2128a;
        z0.p0 a32 = o3.a(3, pVar);
        q0 q0Var2 = (q0) pVar.k(s0.f2378a);
        t3Var2 = q0Var2.Q;
        pVar.Q(1540400102);
        if (t3Var2 != null) {
        }
        pVar.p(false);
        oVar2 = s0.l.f8103a;
        z12 = z11;
        sVar2 = g2.e0.f4030a;
        i0Var2 = w.i0.f9252a;
        i12 = i20;
        p0Var2 = a32;
        h0Var2 = w.h0.f9250a;
        z13 = true;
        i13 = 1;
        pVar.q();
        pVar.Q(30062948);
        G = pVar.G();
        if (G == g0.l.f3784a) {
        }
        p.j jVar2 = (p.j) G;
        boolean z162 = false;
        pVar.p(false);
        pVar.Q(30069058);
        b9 = k0Var2.b();
        if (b9 == 16) {
        }
        long j92 = b9;
        pVar.p(z162);
        s0.o oVar42 = oVar2;
        t3 t3Var52 = t3Var2;
        g0.d.a(a0.h1.f83a.a(t3Var2.f2416k), o0.f.b(-1886965181, new n2(oVar42, eVar, (m2.b) pVar.k(s1.f1.f8217f), t3Var52, str, cVar, z13, k0Var2.d(new a2.k0(j92, 0L, null, 0L, 0, 0L, 16777214)), i0Var2, h0Var2, z12, i12, i13, sVar2, jVar2, p0Var2), pVar), pVar, 56);
        a0.s sVar42 = sVar2;
        t3Var3 = t3Var52;
        z14 = z13;
        sVar3 = sVar42;
        k0Var3 = k0Var2;
        oVar3 = oVar42;
        i0Var3 = i0Var2;
        h0Var3 = h0Var2;
        z15 = z12;
        i14 = i12;
        i15 = i13;
        p0Var3 = p0Var2;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    public static final void b(q6.e eVar, q6.f fVar, q6.e eVar2, q6.e eVar3, q6.e eVar4, q6.e eVar5, q6.e eVar6, boolean z8, float f9, q6.c cVar, o0.a aVar, q6.e eVar7, q.h0 h0Var, g0.p pVar, int i7, int i8) {
        int i9;
        int i10;
        q.h0 h0Var2;
        s0.g gVar;
        m2.k kVar;
        q6.e eVar8;
        float f10;
        s0.g gVar2;
        q6.e eVar9;
        float f11;
        q6.e eVar10;
        boolean z9;
        q6.e eVar11 = eVar6;
        s0.g gVar3 = s0.b.f8082j;
        s0.g gVar4 = s0.b.f8078f;
        pVar.S(1408290209);
        int i11 = i7 & 6;
        s0.l lVar = s0.l.f8103a;
        if (i11 == 0) {
            i9 = i7 | (pVar.f(lVar) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= pVar.h(eVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= pVar.h(fVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= pVar.h(eVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= pVar.h(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= pVar.h(eVar4) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i9 |= pVar.h(eVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i9 |= pVar.h(eVar11) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i9 |= pVar.g(z8) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= pVar.c(f9) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (pVar.h(cVar) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= pVar.h(eVar7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            h0Var2 = h0Var;
            i10 |= pVar.f(h0Var2) ? 2048 : 1024;
        } else {
            h0Var2 = h0Var;
        }
        int i12 = i10;
        if ((i9 & 306783379) == 306783378 && (i12 & 1171) == 1170 && pVar.x()) {
            pVar.L();
            eVar9 = eVar2;
            eVar10 = eVar7;
            f11 = f9;
        } else {
            boolean z10 = ((i12 & 14) == 4) | ((i9 & 234881024) == 67108864) | ((i9 & 1879048192) == 536870912) | ((i12 & 7168) == 2048);
            Object G = pVar.G();
            if (z10 || G == g0.l.f3784a) {
                G = new t2(cVar, z8, f9, h0Var2);
                pVar.a0(G);
            }
            t2 t2Var = (t2) G;
            m2.k kVar2 = (m2.k) pVar.k(s1.f1.f8223l);
            int i13 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, lVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            r1.h hVar = r1.i.f7784e;
            g0.d.Q(pVar, t2Var, hVar);
            r1.h hVar2 = r1.i.f7783d;
            g0.d.Q(pVar, m8, hVar2);
            r1.h hVar3 = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i13))) {
                a0.m.q(i13, pVar, i13, hVar3);
            }
            r1.h hVar4 = r1.i.f7782c;
            g0.d.Q(pVar, c4, hVar4);
            aVar.d(pVar, Integer.valueOf((i12 >> 3) & 14));
            pVar.Q(250370369);
            if (eVar3 != null) {
                s0.o j8 = androidx.compose.ui.layout.a.c(lVar, "Leading").j(e0.o.f2721i);
                gVar = gVar3;
                p1.f0 e9 = q.n.e(gVar, false);
                int i14 = pVar.P;
                g0.k1 m9 = pVar.m();
                s0.o c6 = s0.a.c(pVar, j8);
                pVar.U();
                kVar = kVar2;
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e9, hVar);
                g0.d.Q(pVar, m9, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i14))) {
                    a0.m.q(i14, pVar, i14, hVar3);
                }
                g0.d.Q(pVar, c6, hVar4);
                eVar3.d(pVar, Integer.valueOf((i9 >> 12) & 14));
                pVar.p(true);
            } else {
                gVar = gVar3;
                kVar = kVar2;
            }
            ?? r15 = 0;
            pVar.p(false);
            pVar.Q(250379492);
            if (eVar4 != null) {
                s0.o j9 = androidx.compose.ui.layout.a.c(lVar, "Trailing").j(e0.o.f2721i);
                p1.f0 e10 = q.n.e(gVar, false);
                int i15 = pVar.P;
                g0.k1 m10 = pVar.m();
                s0.o c9 = s0.a.c(pVar, j9);
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e10, hVar);
                g0.d.Q(pVar, m10, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i15))) {
                    a0.m.q(i15, pVar, i15, hVar3);
                }
                g0.d.Q(pVar, c9, hVar4);
                eVar4.d(pVar, Integer.valueOf((i9 >> 15) & 14));
                pVar.p(true);
                r15 = 0;
            }
            pVar.p(r15);
            m2.k kVar3 = kVar;
            float c10 = androidx.compose.foundation.layout.b.c(h0Var2, kVar3);
            float c11 = kVar3 == m2.k.f6322f ? h0Var2.c(kVar3) : h0Var2.b(kVar3);
            if (eVar3 != null) {
                c10 -= e0.o.f2715c;
                float f12 = (float) r15;
                if (c10 < f12) {
                    c10 = f12;
                }
            }
            float f13 = c10;
            if (eVar4 != null) {
                c11 -= e0.o.f2715c;
                float f14 = (float) r15;
                if (c11 < f14) {
                    c11 = f14;
                }
            }
            pVar.Q(250410106);
            if (eVar5 != null) {
                s0.o h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.e(androidx.compose.ui.layout.a.c(lVar, "Prefix"), e0.o.f2718f, 0.0f, 2)), f13, 0.0f, e0.o.f2717e, 0.0f, 10);
                gVar2 = gVar4;
                p1.f0 e11 = q.n.e(gVar2, false);
                int i16 = pVar.P;
                g0.k1 m11 = pVar.m();
                s0.o c12 = s0.a.c(pVar, h3);
                pVar.U();
                f10 = c11;
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e11, hVar);
                g0.d.Q(pVar, m11, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i16))) {
                    a0.m.q(i16, pVar, i16, hVar3);
                }
                g0.d.Q(pVar, c12, hVar4);
                eVar8 = eVar5;
                eVar8.d(pVar, Integer.valueOf((i9 >> 18) & 14));
                pVar.p(true);
            } else {
                eVar8 = eVar5;
                f10 = c11;
                gVar2 = gVar4;
            }
            pVar.p(false);
            pVar.Q(250422072);
            if (eVar6 != null) {
                s0.o h8 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.e(androidx.compose.ui.layout.a.c(lVar, "Suffix"), e0.o.f2718f, 0.0f, 2)), e0.o.f2717e, 0.0f, f10, 0.0f, 10);
                p1.f0 e12 = q.n.e(gVar2, false);
                int i17 = pVar.P;
                g0.k1 m12 = pVar.m();
                s0.o c13 = s0.a.c(pVar, h8);
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e12, hVar);
                g0.d.Q(pVar, m12, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i17))) {
                    a0.m.q(i17, pVar, i17, hVar3);
                }
                g0.d.Q(pVar, c13, hVar4);
                eVar11 = eVar6;
                eVar11.d(pVar, Integer.valueOf((i9 >> 21) & 14));
                pVar.p(true);
            } else {
                eVar11 = eVar6;
            }
            pVar.p(false);
            float f15 = e0.o.f2718f;
            s0.o h9 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.e(lVar, f15, 0.0f, 2)), eVar8 == null ? f13 : 0, 0.0f, eVar11 == null ? f10 : 0, 0.0f, 10);
            pVar.Q(250444361);
            if (fVar != null) {
                fVar.c(androidx.compose.ui.layout.a.c(lVar, "Hint").j(h9), pVar, Integer.valueOf((i9 >> 3) & 112));
            }
            pVar.p(false);
            s0.o j10 = androidx.compose.ui.layout.a.c(lVar, "TextField").j(h9);
            p1.f0 e13 = q.n.e(gVar2, true);
            int i18 = pVar.P;
            g0.k1 m13 = pVar.m();
            s0.o c14 = s0.a.c(pVar, j10);
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e13, hVar);
            g0.d.Q(pVar, m13, hVar2);
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i18))) {
                a0.m.q(i18, pVar, i18, hVar3);
            }
            g0.d.Q(pVar, c14, hVar4);
            eVar.d(pVar, Integer.valueOf((i9 >> 3) & 14));
            pVar.p(true);
            pVar.Q(250455481);
            if (eVar2 != null) {
                f11 = f9;
                s0.o c15 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.e(lVar, a8.m.D(f15, e0.o.f2719g, f11), 0.0f, 2)), "Label");
                p1.f0 e14 = q.n.e(gVar2, false);
                int i19 = pVar.P;
                g0.k1 m14 = pVar.m();
                s0.o c16 = s0.a.c(pVar, c15);
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e14, hVar);
                g0.d.Q(pVar, m14, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i19))) {
                    a0.m.q(i19, pVar, i19, hVar3);
                }
                g0.d.Q(pVar, c16, hVar4);
                eVar9 = eVar2;
                eVar9.d(pVar, Integer.valueOf((i9 >> 9) & 14));
                pVar.p(true);
            } else {
                eVar9 = eVar2;
                f11 = f9;
            }
            pVar.p(false);
            pVar.Q(250473414);
            if (eVar7 != null) {
                s0.o m15 = androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.e(androidx.compose.ui.layout.a.c(lVar, "Supporting"), e0.o.f2720h, 0.0f, 2));
                float f16 = e0.o.f2714b;
                s0.o d8 = androidx.compose.foundation.layout.b.d(m15, new q.h0(f16, e0.o.f2716d, f16, 0));
                p1.f0 e15 = q.n.e(gVar2, false);
                int i20 = pVar.P;
                g0.k1 m16 = pVar.m();
                s0.o c17 = s0.a.c(pVar, d8);
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, e15, hVar);
                g0.d.Q(pVar, m16, hVar2);
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i20))) {
                    a0.m.q(i20, pVar, i20, hVar3);
                }
                g0.d.Q(pVar, c17, hVar4);
                eVar10 = eVar7;
                eVar10.d(pVar, Integer.valueOf((i12 >> 6) & 14));
                z9 = true;
                pVar.p(true);
            } else {
                eVar10 = eVar7;
                z9 = true;
            }
            pVar.p(false);
            pVar.p(z9);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new p2(eVar, fVar, eVar9, eVar3, eVar4, eVar5, eVar11, z8, f11, cVar, aVar, eVar10, h0Var2, i7, i8);
        }
    }

    public static final int c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f9, long j8, float f10, q.h0 h0Var) {
        int[] iArr = {i13, i9, i10, a8.m.E(f9, i12, 0)};
        for (int i15 = 0; i15 < 4; i15++) {
            i11 = Math.max(i11, iArr[i15]);
        }
        float d8 = h0Var.d() * f10;
        return Math.max(m2.a.i(j8), Math.max(i7, Math.max(i8, t6.a.O(a8.m.D(d8, Math.max(d8, i12 / 2.0f), f9) + i11 + (h0Var.a() * f10)))) + i14);
    }

    public static final int d(int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f9, long j8, float f10, q.h0 h0Var) {
        int i14 = i9 + i10;
        int max = Math.max(i11 + i14, Math.max(i13 + i14, a8.m.E(f9, i12, 0))) + i7 + i8;
        m2.k kVar = m2.k.f6322f;
        return Math.max(max, Math.max(t6.a.O((i12 + ((h0Var.c(kVar) + h0Var.b(kVar)) * f10)) * f9), m2.a.j(j8)));
    }

    public static final int e(boolean z8, int i7, int i8, p1.n0 n0Var, p1.n0 n0Var2) {
        if (z8) {
            i8 = Math.round((1 + 0.0f) * ((i7 - n0Var2.f7064g) / 2.0f));
        }
        float f9 = e0.o.f2714b;
        return Math.max(i8, (n0Var != null ? n0Var.f7064g : 0) / 2);
    }
}
