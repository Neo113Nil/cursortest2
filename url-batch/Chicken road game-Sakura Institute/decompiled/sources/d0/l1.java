package d0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l1 {
    static {
        s0.g gVar = s0.b.f8082j;
        s0.g gVar2 = s0.b.f8083k;
        s0.e eVar = s0.b.f8091s;
        s0.g gVar3 = s0.b.f8081i;
        l.u uVar = f0.k.f2957b;
        k.i0 b9 = k.b0.b(l.e.l(100, 2, uVar));
        l.u uVar2 = f0.k.f2956a;
        l.v1 l8 = l.e.l(500, 2, uVar2);
        s0.e eVar2 = s0.b.f8089q;
        b9.a(new k.i0(new k.q0((k.j0) null, new k.t(r6.k.a(eVar2, eVar2) ? gVar3 : r6.k.a(eVar2, eVar) ? gVar2 : gVar, new k.a0(k.u.f5271m, 1), l8), (a8.m) null, (LinkedHashMap) null, 59)));
        k.h0 a3 = k.b0.a(new l.v1(200, 100, uVar));
        l.v1 l9 = l.e.l(500, 2, uVar2);
        k.u uVar3 = k.u.f5270l;
        if (r6.k.a(eVar2, eVar2)) {
            gVar = gVar3;
        } else if (r6.k.a(eVar2, eVar)) {
            gVar = gVar2;
        }
        a3.a(new k.h0(new k.q0((k.j0) null, new k.t(gVar, new k.a0(uVar3, 0), l9), (a8.m) null, (LinkedHashMap) null, 59)));
    }

    public static final void a(q6.a aVar, s0.o oVar, z0.p0 p0Var, long j8, long j9, f1 f1Var, o0.a aVar2, g0.p pVar, int i7) {
        long j10;
        s0.o oVar2;
        z0.p0 p0Var2;
        long j11;
        f1 f1Var2;
        z0.p0 p0Var3;
        z0.p0 p0Var4;
        long j12;
        long j13;
        s0.o oVar3;
        f1 f1Var3;
        pVar.S(-731723913);
        if (((i7 | 1647792) & 4793491) == 4793490 && pVar.x()) {
            pVar.L();
            oVar3 = oVar;
            p0Var4 = p0Var;
            j12 = j8;
            j13 = j9;
            f1Var3 = f1Var;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                int i8 = d1.f1902a;
                z0.p0 a3 = o3.a(f0.g.f2939c, pVar);
                long d8 = s0.d(27, pVar);
                long b9 = s0.b(d8, pVar);
                f1 f1Var4 = new f1(f0.g.f2937a, f0.g.f2943g, f0.g.f2941e, f0.g.f2942f);
                j10 = b9;
                oVar2 = s0.l.f8103a;
                p0Var2 = a3;
                j11 = d8;
                f1Var2 = f1Var4;
            } else {
                pVar.L();
                oVar2 = oVar;
                p0Var2 = p0Var;
                j11 = j8;
                j10 = j9;
                f1Var2 = f1Var;
            }
            pVar.q();
            pVar.Q(519755085);
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (G == obj) {
                G = new p.j();
                pVar.a0(G);
            }
            p.j jVar = (p.j) G;
            pVar.p(false);
            s0.o a9 = y1.k.a(oVar2, false, a0.f1812i);
            float f9 = f1Var2.f1947a;
            boolean f10 = pVar.f(jVar);
            Object G2 = pVar.G();
            if (f10 || G2 == obj) {
                p0Var3 = p0Var2;
                G2 = new i1(f1Var2.f1947a, f1Var2.f1948b, f1Var2.f1950d, f1Var2.f1949c);
                pVar.a0(G2);
            } else {
                p0Var3 = p0Var2;
            }
            i1 i1Var = (i1) G2;
            boolean h3 = pVar.h(i1Var) | pVar.f(f1Var2);
            Object G3 = pVar.G();
            h6.d dVar = null;
            if (h3 || G3 == obj) {
                G3 = new a0.e0(i1Var, f1Var2, null, 6);
                pVar.a0(G3);
            }
            g0.d.e(pVar, f1Var2, (q6.e) G3);
            boolean f11 = pVar.f(jVar) | pVar.h(i1Var);
            Object G4 = pVar.G();
            if (f11 || G4 == obj) {
                G4 = new a0.a0(jVar, i1Var, dVar, 4);
                pVar.a0(G4);
            }
            g0.d.e(pVar, jVar, (q6.e) G4);
            z0.p0 p0Var5 = p0Var3;
            s3.b(aVar, a9, false, p0Var5, j11, j10, f9, ((m2.e) i1Var.f2039e.f5427c.f5563g.getValue()).f6312f, jVar, o0.f.b(1249316354, new j1(0, j10, aVar2), pVar), pVar, 6, 260);
            p0Var4 = p0Var5;
            j12 = j11;
            j13 = j10;
            oVar3 = oVar2;
            f1Var3 = f1Var2;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new k1(aVar, oVar3, p0Var4, j12, j13, f1Var3, aVar2, i7);
        }
    }
}
