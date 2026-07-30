package d0;

import androidx.compose.material3.MinimumInteractiveModifier;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.f f1911a = new c0.f(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(q6.a aVar, o0.a aVar2, s0.o oVar, q6.e eVar, q6.e eVar2, q6.e eVar3, z0.p0 p0Var, long j8, long j9, long j10, long j11, float f9, p2.r rVar, g0.p pVar, int i7) {
        int i8;
        o0.a aVar3;
        q6.e eVar4;
        int i9;
        s0.o oVar2;
        z0.p0 p0Var2;
        long j12;
        float f10;
        long j13;
        long j14;
        long j15;
        p2.r rVar2;
        s0.o oVar3;
        p2.r rVar3;
        float f11;
        long j16;
        long j17;
        long j18;
        long j19;
        z0.p0 p0Var3;
        pVar.S(-2081346864);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            aVar3 = aVar2;
            i8 |= pVar.h(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar2;
        }
        int i10 = i8 | 384;
        if ((i7 & 3072) == 0) {
            eVar4 = eVar;
            i10 |= pVar.h(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        int i11 = i10 | 24576;
        if ((196608 & i7) == 0) {
            i11 |= pVar.h(eVar2) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i11 |= pVar.h(eVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i11 |= 4194304;
        }
        if ((100663296 & i7) == 0) {
            i11 |= 33554432;
        }
        if ((805306368 & i7) == 0) {
            i11 |= 268435456;
        }
        if ((306783379 & i11) == 306783378 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            p0Var3 = p0Var;
            j19 = j8;
            j18 = j9;
            j17 = j10;
            j16 = j11;
            f11 = f9;
            rVar3 = rVar;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                float f12 = a.f1810a;
                z0.p0 a3 = o3.a(f0.c.f2925a, pVar);
                long d8 = s0.d(38, pVar);
                long d9 = s0.d(f0.c.f2930f, pVar);
                i9 = i11 & (-2143289345);
                long d10 = s0.d(f0.c.f2926b, pVar);
                long d11 = s0.d(f0.c.f2928d, pVar);
                float f13 = a.f1810a;
                p2.r rVar4 = new p2.r();
                oVar2 = s0.l.f8103a;
                p0Var2 = a3;
                j12 = d8;
                f10 = f13;
                j13 = d9;
                j14 = d10;
                j15 = d11;
                rVar2 = rVar4;
            } else {
                pVar.L();
                i9 = i11 & (-2143289345);
                oVar2 = oVar;
                p0Var2 = p0Var;
                j12 = j8;
                j13 = j9;
                j14 = j10;
                j15 = j11;
                f10 = f9;
                rVar2 = rVar;
            }
            pVar.q();
            s0.o oVar4 = oVar2;
            m.c(aVar, aVar3, oVar4, eVar4, eVar2, eVar3, p0Var2, j12, j13, j14, j15, f10, rVar2, pVar, i9 & 2147483646, 3456);
            oVar3 = oVar4;
            rVar3 = rVar2;
            f11 = f10;
            j16 = j15;
            j17 = j14;
            j18 = j13;
            j19 = j12;
            p0Var3 = p0Var2;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new n(aVar, aVar2, oVar3, eVar, eVar2, eVar3, p0Var3, j19, j18, j17, j16, f11, rVar3, i7);
        }
    }

    public static final void b(q6.a aVar, s0.o oVar, boolean z8, z0.p0 p0Var, w wVar, d3 d3Var, q.h0 h0Var, o0.a aVar2, g0.p pVar, int i7) {
        q6.a aVar3;
        int i8;
        pVar.S(650121315);
        if ((i7 & 6) == 0) {
            aVar3 = aVar;
            i8 = (pVar.h(aVar3) ? 4 : 2) | i7;
        } else {
            aVar3 = aVar;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(oVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.g(z8) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.f(p0Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.f(wVar) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.f(d3Var) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= pVar.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i8 |= pVar.f(h0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i8 |= pVar.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i7) == 0) {
            i8 |= pVar.h(aVar2) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && pVar.x()) {
            pVar.L();
        } else {
            pVar.N();
            if ((i7 & 1) != 0 && !pVar.w()) {
                pVar.L();
            }
            pVar.q();
            pVar.Q(-239156623);
            Object G = pVar.G();
            if (G == g0.l.f3784a) {
                G = new p.j();
                pVar.a0(G);
            }
            p.j jVar = (p.j) G;
            pVar.p(false);
            long j8 = z8 ? wVar.f2481a : wVar.f2483c;
            long j9 = z8 ? wVar.f2482b : wVar.f2484d;
            pVar.Q(-239150048);
            pVar.p(false);
            s3.b(aVar3, y1.k.a(oVar, false, a0.f1811h), z8, p0Var, j8, j9, 0.0f, 0, jVar, o0.f.b(956488494, new c0(j9, h0Var, aVar2), pVar), pVar, (i8 & 8078) | ((i8 << 6) & 234881024), 64);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d0(aVar, oVar, z8, p0Var, wVar, d3Var, h0Var, aVar2, i7);
        }
    }

    public static final void c(s0.o oVar, z0.p0 p0Var, f0 f0Var, g0 g0Var, o0.a aVar, g0.p pVar, int i7) {
        s0.o oVar2;
        int i8;
        z0.p0 p0Var2;
        g0 g0Var2;
        int i9;
        f0 f0Var2;
        g0 g0Var3;
        f0 f0Var3;
        z0.p0 p0Var3;
        pVar.S(1179621553);
        if ((i7 & 6) == 0) {
            oVar2 = oVar;
            i8 = (pVar.f(oVar2) ? 4 : 2) | i7;
        } else {
            oVar2 = oVar;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= 1024;
        }
        int i10 = i8 | 24576;
        if ((196608 & i7) == 0) {
            i10 |= pVar.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && pVar.x()) {
            pVar.L();
            p0Var3 = p0Var;
            f0Var3 = f0Var;
            g0Var3 = g0Var;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                z0.p0 a3 = o3.a(f0.i.f2946b, pVar);
                q0 q0Var = (q0) pVar.k(s0.f2378a);
                f0 f0Var4 = q0Var.L;
                if (f0Var4 == null) {
                    f0Var4 = new f0(s0.c(q0Var, 39), s0.a(q0Var, s0.c(q0Var, 39)), z0.l0.l(z0.u.b(s0.c(q0Var, f0.i.f2947c), f0.i.f2949e), s0.c(q0Var, 39)), z0.u.b(s0.a(q0Var, s0.c(q0Var, 39)), 0.38f));
                    q0Var.L = f0Var4;
                }
                p0Var2 = a3;
                g0Var2 = new g0(f0.i.f2945a, f0.i.f2953i, f0.i.f2951g, f0.i.f2952h, f0.i.f2950f, f0.i.f2948d);
                i9 = i10 & (-8177);
                f0Var2 = f0Var4;
            } else {
                pVar.L();
                p0Var2 = p0Var;
                g0Var2 = g0Var;
                i9 = i10 & (-8177);
                f0Var2 = f0Var;
            }
            pVar.q();
            long j8 = f0Var2.f1943a;
            long j9 = f0Var2.f1944b;
            float f9 = g0Var2.f1971a;
            pVar.Q(-1763481333);
            pVar.Q(-734838460);
            Object G = pVar.G();
            if (G == g0.l.f3784a) {
                G = g0.d.J(new m2.e(f9), g0.t0.f3903k);
                pVar.a0(G);
            }
            pVar.p(false);
            pVar.p(false);
            s3.a(oVar2, p0Var2, j8, j9, 0.0f, ((m2.e) ((g0.z0) G).getValue()).f6312f, o0.f.b(664103990, new g(aVar, 1, (byte) 0), pVar), pVar, (i9 & 14) | 12582912 | ((i9 << 6) & 3670016), 16);
            g0Var3 = g0Var2;
            f0Var3 = f0Var2;
            p0Var3 = p0Var2;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new h0(oVar, p0Var3, f0Var3, g0Var3, aVar, i7);
        }
    }

    public static final void d(q6.a aVar, s0.o oVar, boolean z8, m1 m1Var, o0.a aVar2, g0.p pVar, int i7) {
        m1 m1Var2;
        s0.o oVar2;
        m1 m1Var3;
        boolean z9;
        o0.a aVar3;
        s0.o oVar3;
        m1 m1Var4;
        pVar.S(-1142896114);
        if (((i7 | (pVar.h(aVar) ? 4 : 2) | 26032) & 74899) == 74898 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            z9 = z8;
            m1Var4 = m1Var;
            aVar3 = aVar2;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                pVar.Q(-1519621781);
                long j8 = ((z0.u) pVar.k(y0.f2529a)).f10059a;
                q0 q0Var = (q0) pVar.k(s0.f2378a);
                m1 m1Var5 = q0Var.O;
                if (m1Var5 == null) {
                    long j9 = z0.u.f10056f;
                    m1 m1Var6 = new m1(j9, j8, j9, z0.u.b(j8, 0.38f));
                    q0Var.O = m1Var6;
                    m1Var5 = m1Var6;
                }
                long j10 = m1Var5.f2170b;
                if (z0.u.c(j10, j8)) {
                    pVar.p(false);
                    m1Var2 = m1Var5;
                } else {
                    long b9 = z0.u.b(j8, 0.38f);
                    m1Var2 = new m1(m1Var5.f2169a, j8 != 16 ? j8 : j10, m1Var5.f2171c, b9 != 16 ? b9 : m1Var5.f2172d);
                    pVar.p(false);
                }
                oVar2 = s0.l.f8103a;
                m1Var3 = m1Var2;
                z9 = true;
            } else {
                pVar.L();
                oVar2 = oVar;
                z9 = z8;
                m1Var3 = m1Var;
            }
            pVar.q();
            g0.n2 n2Var = r1.f2357a;
            s0.o j11 = oVar2.j(MinimumInteractiveModifier.f694a);
            float f9 = f0.j.f2955b;
            s0.o c4 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.a(v0.d.d(androidx.compose.foundation.layout.c.h(j11, f9), o3.a(5, pVar)), z9 ? m1Var3.f2169a : m1Var3.f2171c, z0.l0.f10006a), null, e3.a(f9 / 2, pVar, 54, 4), z9, new y1.f(0), aVar, 8);
            p1.f0 e9 = q.n.e(s0.b.f8082j, false);
            int i8 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c6 = s0.a.c(pVar, c4);
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
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar);
            }
            g0.d.Q(pVar, c6, r1.i.f7782c);
            aVar3 = aVar2;
            g0.d.a(y0.f2529a.a(new z0.u(z9 ? m1Var3.f2170b : m1Var3.f2172d)), aVar3, pVar, 56);
            pVar.p(true);
            oVar3 = oVar2;
            m1Var4 = m1Var3;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new n1(aVar, oVar3, z9, m1Var4, aVar3, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(q6.a aVar, s0.o oVar, boolean z8, z0.p0 p0Var, w wVar, q.h0 h0Var, o0.a aVar2, g0.p pVar, int i7, int i8) {
        q6.a aVar3;
        int i9;
        s0.o oVar2;
        int i10;
        boolean z9;
        int i11;
        int i12;
        w wVar2;
        int i13;
        s0.o oVar3;
        boolean z10;
        z0.p0 p0Var2;
        w wVar3;
        q.h0 h0Var2;
        z0.p0 p0Var3;
        q.h0 h0Var3;
        w wVar4;
        boolean z11;
        g0.p1 r8;
        pVar.S(-2106428362);
        if ((i7 & 6) == 0) {
            aVar3 = aVar;
            i9 = i7 | (pVar.h(aVar3) ? 4 : 2);
        } else {
            aVar3 = aVar;
            i9 = i7;
        }
        int i14 = i8 & 2;
        if (i14 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            oVar2 = oVar;
            i9 |= pVar.f(oVar2) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i11 = i9 | 384;
                z9 = z8;
            } else {
                z9 = z8;
                i11 = i9 | (pVar.g(z9) ? 256 : 128);
            }
            i12 = i11 | 115024896;
            if ((306783379 & i12) == 306783378 || !pVar.x()) {
                pVar.N();
                if ((i7 & 1) != 0 || pVar.w()) {
                    s0.o oVar4 = i14 == 0 ? s0.l.f8103a : oVar2;
                    boolean z12 = i10 == 0 ? true : z9;
                    q.h0 h0Var4 = x.f2513a;
                    z0.p0 a3 = o3.a(5, pVar);
                    q0 q0Var = (q0) pVar.k(s0.f2378a);
                    wVar2 = q0Var.K;
                    if (wVar2 == null) {
                        long j8 = z0.u.f10056f;
                        w wVar5 = new w(j8, s0.c(q0Var, 26), j8, z0.u.b(s0.c(q0Var, 18), 0.38f));
                        q0Var.K = wVar5;
                        wVar2 = wVar5;
                    }
                    i13 = i12 & (-64513);
                    oVar3 = oVar4;
                    z10 = z12;
                    p0Var2 = a3;
                    wVar3 = wVar2;
                    h0Var2 = x.f2513a;
                } else {
                    pVar.L();
                    wVar3 = wVar;
                    h0Var2 = h0Var;
                    z10 = z9;
                    i13 = i12 & (-64513);
                    oVar3 = oVar2;
                    p0Var2 = p0Var;
                }
                pVar.q();
                b(aVar3, oVar3, z10, p0Var2, wVar3, null, h0Var2, aVar2, pVar, i13 & 2147483646);
                p0Var3 = p0Var2;
                h0Var3 = h0Var2;
                oVar2 = oVar3;
                wVar4 = wVar3;
                z11 = z10;
            } else {
                pVar.L();
                wVar4 = wVar;
                h0Var3 = h0Var;
                z11 = z9;
                p0Var3 = p0Var;
            }
            r8 = pVar.r();
            if (r8 == null) {
                r8.f3853d = new e0(aVar, oVar2, z11, p0Var3, wVar4, h0Var3, aVar2, i7, i8);
                return;
            }
            return;
        }
        oVar2 = oVar;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i12 = i11 | 115024896;
        if ((306783379 & i12) == 306783378) {
        }
        pVar.N();
        if ((i7 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i10 == 0) {
        }
        q.h0 h0Var42 = x.f2513a;
        z0.p0 a32 = o3.a(5, pVar);
        q0 q0Var2 = (q0) pVar.k(s0.f2378a);
        wVar2 = q0Var2.K;
        if (wVar2 == null) {
        }
        i13 = i12 & (-64513);
        oVar3 = oVar4;
        z10 = z12;
        p0Var2 = a32;
        wVar3 = wVar2;
        h0Var2 = x.f2513a;
        pVar.q();
        b(aVar3, oVar3, z10, p0Var2, wVar3, null, h0Var2, aVar2, pVar, i13 & 2147483646);
        p0Var3 = p0Var2;
        h0Var3 = h0Var2;
        oVar2 = oVar3;
        wVar4 = wVar3;
        z11 = z10;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }
}
