package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1859a;

    /* renamed from: b, reason: collision with root package name */
    public static final s0.o f1860b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1861c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1862d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1863e;

    /* renamed from: f, reason: collision with root package name */
    public static final l.u f1864f;

    static {
        float f9 = 10;
        f1859a = f9;
        f1860b = androidx.compose.foundation.layout.b.g(y1.k.a(androidx.compose.ui.layout.a.b(v0.f2464i), true, a0.f1815l), 0.0f, f9, 1);
        float f10 = f0.n.f2995c;
        f1862d = f10;
        f1863e = f0.n.f2996d - (f10 * 2);
        new l.u(0.2f, 0.0f, 0.8f, 1.0f);
        new l.u(0.4f, 0.0f, 1.0f, 1.0f);
        new l.u(0.0f, 0.0f, 0.65f, 1.0f);
        new l.u(0.1f, 0.0f, 0.45f, 1.0f);
        f1864f = new l.u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void a(s0.o oVar, long j8, float f9, long j9, int i7, g0.p pVar, int i8) {
        float f10;
        long j10;
        int i9;
        long j11;
        float f11;
        int i10;
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        pVar.S(-115871647);
        if (((i8 | (pVar.f(oVar) ? 4 : 2) | 25984) & 9363) == 9362 && pVar.x()) {
            pVar.L();
            f11 = f9;
            j11 = j9;
            i10 = i7;
        } else {
            pVar.N();
            if ((i8 & 1) == 0 || pVar.w()) {
                f10 = u2.f2455a;
                j10 = z0.u.f10056f;
                i9 = u2.f2457c;
            } else {
                pVar.L();
                f10 = f9;
                j10 = j9;
                i9 = i7;
            }
            pVar.q();
            b1.i iVar = new b1.i(((m2.b) pVar.k(s1.f1.f8217f)).y(f10), 0.0f, i9, 0, 26);
            int i11 = i9;
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (G == obj) {
                G = new l.h0();
                pVar.a0(G);
            }
            l.h0 h0Var = (l.h0) G;
            h0Var.a(0, pVar);
            l.w1 w1Var = l.x1.f5723b;
            a0.s sVar = l.z.f5734c;
            l.f0 f12 = l.e.f(h0Var, 0, 5, w1Var, l.e.j(l.e.l(6660, 2, sVar)), pVar, 33208, 16);
            l.f0 d8 = l.e.d(h0Var, 286.0f, l.e.j(l.e.l(1332, 2, sVar)), pVar);
            l.i iVar2 = new l.i(1, (byte) 0);
            iVar2.f5525b = 1332;
            l.k0 b9 = iVar2.b(valueOf2, 0);
            l.u uVar = f1864f;
            b9.f5558b = uVar;
            iVar2.b(valueOf, 666);
            l.f0 d9 = l.e.d(h0Var, 290.0f, l.e.j(new l.l0(iVar2)), pVar);
            float f13 = f10;
            l.i iVar3 = new l.i(1, (byte) 0);
            iVar3.f5525b = 1332;
            iVar3.b(valueOf2, 666).f5558b = uVar;
            iVar3.b(valueOf, iVar3.f5525b);
            l.f0 d10 = l.e.d(h0Var, 290.0f, l.e.j(new l.l0(iVar3)), pVar);
            s0.o h3 = androidx.compose.foundation.layout.c.h(y1.k.a(oVar, true, m.k.f6190k), f1863e);
            boolean e9 = pVar.e(j10) | pVar.h(iVar) | pVar.f(f12) | pVar.f(d9) | pVar.f(d10) | pVar.f(d8);
            Object G2 = pVar.G();
            if (e9 || G2 == obj) {
                Object v2Var = new v2(j10, iVar, f12, d9, d10, d8, f13, j8);
                pVar.a0(v2Var);
                G2 = v2Var;
            }
            j1.c.B(h3, (q6.c) G2, pVar, 0);
            j11 = j10;
            f11 = f13;
            i10 = i11;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new w2(oVar, j8, f11, j11, i10, i8);
        }
    }

    public static final void b(q6.a aVar, s0.o oVar, long j8, long j9, int i7, float f9, q6.c cVar, g0.p pVar, int i8) {
        long d8;
        long d9;
        q6.c cVar2;
        int i9;
        int i10;
        float f10;
        s0.o oVar2;
        long j10;
        long j11;
        q6.c cVar3;
        int i11;
        float f11;
        long j12;
        q6.c cVar4;
        pVar.S(-339970038);
        int i12 = 4;
        int i13 = i8 | (pVar.h(aVar) ? 4 : 2) | 746624;
        if ((599187 & i13) == 599186 && pVar.x()) {
            pVar.L();
            oVar2 = oVar;
            j10 = j8;
            j12 = j9;
            i11 = i7;
            f11 = f9;
            cVar4 = cVar;
        } else {
            pVar.N();
            int i14 = i8 & 1;
            Object obj = g0.l.f3784a;
            if (i14 == 0 || pVar.w()) {
                float f12 = u2.f2455a;
                float f13 = f0.n.f2993a;
                d8 = s0.d(26, pVar);
                d9 = s0.d(32, pVar);
                int i15 = u2.f2456b;
                float f14 = u2.f2459e;
                boolean e9 = pVar.e(d8);
                Object G = pVar.G();
                if (e9 || G == obj) {
                    G = new y2(d8, i15);
                    pVar.a0(G);
                }
                cVar2 = (q6.c) G;
                i9 = i13 & (-3678081);
                i10 = i15;
                f10 = f14;
            } else {
                pVar.L();
                i9 = i13 & (-3678081);
                d8 = j8;
                d9 = j9;
                i10 = i7;
                f10 = f9;
                cVar2 = cVar;
            }
            pVar.q();
            int i16 = 1;
            boolean z8 = (i9 & 14) == 4;
            Object G2 = pVar.G();
            if (z8 || G2 == obj) {
                G2 = new androidx.lifecycle.r0(i12, aVar);
                pVar.a0(G2);
            }
            q6.a aVar2 = (q6.a) G2;
            oVar2 = oVar;
            s0.o j13 = oVar2.j(f1860b);
            boolean f15 = pVar.f(aVar2);
            Object G3 = pVar.G();
            if (f15 || G3 == obj) {
                G3 = new a0.c1(aVar2, i16);
                pVar.a0(G3);
            }
            s0.o i17 = androidx.compose.foundation.layout.c.i(y1.k.a(j13, true, (q6.c) G3), f1861c, f1862d);
            boolean f16 = pVar.f(aVar2) | pVar.e(d9) | pVar.e(d8) | pVar.f(cVar2);
            Object G4 = pVar.G();
            if (f16 || G4 == obj) {
                j10 = d8;
                j11 = d9;
                cVar3 = cVar2;
                Object z2Var = new z2(i10, f10, aVar2, j11, j10, cVar3);
                pVar.a0(z2Var);
                G4 = z2Var;
            } else {
                j10 = d8;
                j11 = d9;
                cVar3 = cVar2;
            }
            j1.c.B(i17, (q6.c) G4, pVar, 0);
            i11 = i10;
            f11 = f10;
            j12 = j11;
            cVar4 = cVar3;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a3(aVar, oVar2, j10, j12, i11, f11, cVar4, i8);
        }
    }

    public static final void c(b1.e eVar, float f9, float f10, long j8, float f11, int i7) {
        float d8 = y0.f.d(eVar.d());
        float b9 = y0.f.b(eVar.d());
        float f12 = 2;
        float f13 = b9 / f12;
        boolean z8 = eVar.getLayoutDirection() == m2.k.f6322f;
        float f14 = (z8 ? f9 : 1.0f - f10) * d8;
        float f15 = (z8 ? f10 : 1.0f - f9) * d8;
        if (i7 == 0 || b9 > d8) {
            eVar.P(j8, u3.r.a(f14, f13), u3.r.a(f15, f13), f11, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f16 = f11 / f12;
        w6.a aVar = new w6.a(f16, d8 - f16);
        float floatValue = ((Number) v1.g.g(Float.valueOf(f14), aVar)).floatValue();
        float floatValue2 = ((Number) v1.g.g(Float.valueOf(f15), aVar)).floatValue();
        if (Math.abs(f10 - f9) > 0.0f) {
            eVar.P(j8, u3.r.a(floatValue, f13), u3.r.a(floatValue2, f13), f11, (r19 & 16) != 0 ? 0 : i7);
        }
    }

    public static final void d(b1.e eVar, float f9, float f10, long j8, b1.i iVar) {
        float f11 = 2;
        float f12 = iVar.f1239a / f11;
        float d8 = y0.f.d(eVar.d()) - (f11 * f12);
        eVar.T(j8, f9, f10, u3.r.a(f12, f12), v0.d.a(d8, d8), iVar);
    }
}
