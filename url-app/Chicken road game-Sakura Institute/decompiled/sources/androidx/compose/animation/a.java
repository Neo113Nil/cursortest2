package androidx.compose.animation;

import a0.a0;
import a0.m;
import a0.y;
import d0.b2;
import d6.z;
import g0.d;
import g0.g1;
import g0.h2;
import g0.l;
import g0.p;
import g0.t0;
import g0.z0;
import k.b0;
import k.h0;
import k.i0;
import k.n;
import k.q0;
import k.r;
import k.w;
import k.x;
import l.k1;
import l.m0;
import l.p1;
import l.t1;
import l.u1;
import l.w1;
import l.x1;
import q6.c;
import q6.e;
import r1.h;
import r1.i;
import r1.j;
import r6.k;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:27:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(p1 p1Var, c cVar, o oVar, h0 h0Var, i0 i0Var, e eVar, o0.a aVar, p pVar, int i7) {
        int i8;
        q0 q0Var;
        p1 p1Var2;
        k1 k1Var;
        k1 k1Var2;
        boolean z8;
        boolean z9;
        k1 k1Var3;
        i0 i0Var2;
        h0 h0Var2;
        o oVar2;
        o0.a aVar2;
        boolean z10;
        g0.p1 r8;
        t0 t0Var = t0.f3903k;
        pVar.S(-891967166);
        int i9 = i7 | (pVar.f(p1Var) ? 4 : 2) | (pVar.h(cVar) ? 32 : 16) | (pVar.f(oVar) ? 256 : 128) | (pVar.f(h0Var) ? 2048 : 1024) | (pVar.f(i0Var) ? 16384 : 8192) | (pVar.h(eVar) ? 131072 : 65536) | 1572864;
        if ((4793491 & i9) == 4793490 && pVar.x()) {
            pVar.L();
        } else {
            g1 g1Var = p1Var.f5613d;
            u1 u1Var = p1Var.f5610a;
            if (((Boolean) cVar.f(g1Var.getValue())).booleanValue() || ((Boolean) cVar.f(u1Var.a())).booleanValue() || p1Var.g() || p1Var.d()) {
                pVar.Q(1787977937);
                int i10 = i9 & 14;
                int i11 = i10 | 48;
                int i12 = i11 & 14;
                boolean z11 = ((i12 ^ 6) > 4 && pVar.f(p1Var)) || (i11 & 6) == 4;
                Object G = pVar.G();
                Object obj = l.f3784a;
                if (z11 || G == obj) {
                    G = u1Var.a();
                    pVar.a0(G);
                }
                if (p1Var.g()) {
                    G = u1Var.a();
                }
                pVar.Q(-466616829);
                w b9 = b(p1Var, cVar, G, pVar);
                pVar.p(false);
                Object value = p1Var.f5613d.getValue();
                pVar.Q(-466616829);
                w b10 = b(p1Var, cVar, value, pVar);
                pVar.p(false);
                int i13 = i12 | 3072;
                Object obj2 = t1.f5666a;
                int i14 = (i13 & 14) ^ 6;
                boolean z12 = (i14 > 4 && pVar.f(p1Var)) || (i13 & 6) == 4;
                Object G2 = pVar.G();
                if (z12 || G2 == obj) {
                    i8 = i13;
                    G2 = new p1(new m0(b9), p1Var, m.m(new StringBuilder(), p1Var.f5612c, " > EnterExitTransition"));
                    pVar.a0(G2);
                } else {
                    i8 = i13;
                }
                p1 p1Var3 = (p1) G2;
                boolean f9 = ((i14 > 4 && pVar.f(p1Var)) || (i8 & 6) == 4) | pVar.f(p1Var3);
                Object G3 = pVar.G();
                if (f9 || G3 == obj) {
                    G3 = new y(p1Var, 19, p1Var3);
                    pVar.a0(G3);
                }
                d.d(p1Var3, (c) G3, pVar);
                if (p1Var.g()) {
                    p1Var3.l(b9, b10);
                } else {
                    p1Var3.q(b10);
                    p1Var3.f5620k.setValue(Boolean.FALSE);
                }
                Object M = d.M(eVar, pVar);
                u1 u1Var2 = p1Var3.f5610a;
                u1 u1Var3 = p1Var3.f5610a;
                g1 g1Var2 = p1Var3.f5613d;
                Object d8 = eVar.d(u1Var2.a(), g1Var2.getValue());
                boolean f10 = pVar.f(p1Var3) | pVar.f(M);
                Object G4 = pVar.G();
                h6.d dVar = null;
                if (f10 || G4 == obj) {
                    G4 = new a0(p1Var3, M, dVar, 11);
                    pVar.a0(G4);
                }
                e eVar2 = (e) G4;
                Object G5 = pVar.G();
                if (G5 == obj) {
                    G5 = d.J(d8, t0Var);
                    pVar.a0(G5);
                }
                z0 z0Var = (z0) G5;
                boolean h3 = pVar.h(eVar2);
                Object G6 = pVar.G();
                if (h3 || G6 == obj) {
                    G6 = new h2(eVar2, z0Var, null, 0);
                    pVar.a0(G6);
                }
                d.e(pVar, z.f2639a, (e) G6);
                Object a3 = u1Var3.a();
                w wVar = w.f5280h;
                if (a3 == wVar && g1Var2.getValue() == wVar && ((Boolean) z0Var.getValue()).booleanValue()) {
                    pVar.Q(1790256282);
                    pVar.p(false);
                    oVar2 = oVar;
                    aVar2 = aVar;
                    z10 = false;
                } else {
                    pVar.Q(1788869559);
                    boolean z13 = i10 == 4;
                    Object G7 = pVar.G();
                    if (z13 || G7 == obj) {
                        G7 = new r();
                        pVar.a0(G7);
                    }
                    r rVar = (r) G7;
                    w1 w1Var = b0.f5176a;
                    boolean f11 = pVar.f(p1Var3);
                    Object G8 = pVar.G();
                    if (f11 || G8 == obj) {
                        G8 = d.J(h0Var, t0Var);
                        pVar.a0(G8);
                    }
                    z0 z0Var2 = (z0) G8;
                    Object a9 = u1Var3.a();
                    Object value2 = g1Var2.getValue();
                    w wVar2 = w.f5279g;
                    if (a9 == value2 && u1Var3.a() == wVar2) {
                        if (p1Var3.g()) {
                            z0Var2.setValue(h0Var);
                        } else {
                            z0Var2.setValue(h0.f5221b);
                        }
                    } else if (g1Var2.getValue() == wVar2) {
                        z0Var2.setValue(((h0) z0Var2.getValue()).a(h0Var));
                    }
                    h0 h0Var3 = (h0) z0Var2.getValue();
                    boolean f12 = pVar.f(p1Var3);
                    Object G9 = pVar.G();
                    if (f12 || G9 == obj) {
                        G9 = d.J(i0Var, t0Var);
                        pVar.a0(G9);
                    }
                    z0 z0Var3 = (z0) G9;
                    if (u1Var3.a() == g1Var2.getValue() && u1Var3.a() == wVar2) {
                        if (p1Var3.g()) {
                            z0Var3.setValue(i0Var);
                        } else {
                            z0Var3.setValue(i0.f5223b);
                        }
                    } else if (g1Var2.getValue() != wVar2) {
                        z0Var3.setValue(((i0) z0Var3.getValue()).a(i0Var));
                    }
                    i0 i0Var3 = (i0) z0Var3.getValue();
                    q0 q0Var2 = h0Var3.f5222a;
                    q0 q0Var3 = i0Var3.f5225a;
                    boolean z14 = (q0Var2.f5258b == null && q0Var3.f5258b == null) ? false : true;
                    pVar.Q(-821278096);
                    pVar.p(false);
                    if (z14) {
                        pVar.Q(-821202177);
                        w1 w1Var2 = x1.f5729h;
                        Object G10 = pVar.G();
                        if (G10 == obj) {
                            G10 = "Built-in shrink/expand";
                            pVar.a0("Built-in shrink/expand");
                        }
                        q0Var = q0Var3;
                        p1Var2 = p1Var3;
                        k1 a10 = t1.a(p1Var2, w1Var2, (String) G10, pVar, 384, 0);
                        pVar.p(false);
                        k1Var = a10;
                    } else {
                        q0Var = q0Var3;
                        p1Var2 = p1Var3;
                        pVar.Q(-821099041);
                        pVar.p(false);
                        k1Var = null;
                    }
                    if (z14) {
                        pVar.Q(-821034002);
                        w1 w1Var3 = x1.f5728g;
                        Object G11 = pVar.G();
                        if (G11 == obj) {
                            G11 = "Built-in InterruptionHandlingOffset";
                            pVar.a0("Built-in InterruptionHandlingOffset");
                        }
                        k1 a11 = t1.a(p1Var2, w1Var3, (String) G11, pVar, 384, 0);
                        pVar.p(false);
                        k1Var2 = a11;
                    } else {
                        pVar.Q(-820883777);
                        pVar.p(false);
                        k1Var2 = null;
                    }
                    boolean z15 = !z14;
                    if ((q0Var2.f5257a == null && q0Var.f5257a == null) ? false : true) {
                        pVar.Q(-675389204);
                        w1 w1Var4 = x1.f5722a;
                        Object G12 = pVar.G();
                        if (G12 == obj) {
                            G12 = "Built-in alpha";
                            pVar.a0("Built-in alpha");
                        }
                        z8 = z15;
                        k1Var3 = t1.a(p1Var2, w1Var4, (String) G12, pVar, 384, 0);
                        z9 = false;
                        pVar.p(false);
                    } else {
                        z8 = z15;
                        z9 = false;
                        pVar.Q(-675252433);
                        pVar.p(false);
                        k1Var3 = null;
                    }
                    pVar.Q(-675057009);
                    pVar.p(z9);
                    pVar.Q(-674835793);
                    pVar.p(z9);
                    boolean h8 = pVar.h(k1Var3) | pVar.f(h0Var3) | pVar.f(i0Var3) | pVar.h(null) | pVar.f(p1Var2) | pVar.h(null);
                    Object G13 = pVar.G();
                    if (h8 || G13 == obj) {
                        i0Var2 = i0Var3;
                        h0Var2 = h0Var3;
                        G13 = new x(k1Var3, null, p1Var2, h0Var2, i0Var2, null);
                        pVar.a0(G13);
                    } else {
                        i0Var2 = i0Var3;
                        h0Var2 = h0Var3;
                    }
                    x xVar = (x) G13;
                    boolean g9 = pVar.g(z8);
                    k.z zVar = k.z.f5291g;
                    boolean f13 = g9 | pVar.f(zVar);
                    Object G14 = pVar.G();
                    if (f13 || G14 == obj) {
                        G14 = new b2(z8, zVar, 1);
                        pVar.a0(G14);
                    }
                    s0.l lVar = s0.l.f8103a;
                    o j8 = androidx.compose.ui.graphics.a.a(lVar, (c) G14).j(new EnterExitTransitionElement(p1Var2, k1Var, k1Var2, h0Var2, i0Var2, zVar, xVar));
                    pVar.Q(1581766416);
                    pVar.p(false);
                    o j9 = j8.j(lVar);
                    oVar2 = oVar;
                    o j10 = oVar2.j(j9);
                    Object G15 = pVar.G();
                    if (G15 == obj) {
                        G15 = new n(rVar);
                        pVar.a0(G15);
                    }
                    n nVar = (n) G15;
                    int i15 = pVar.P;
                    g0.k1 m8 = pVar.m();
                    o c4 = s0.a.c(pVar, j10);
                    j.f7810d.getClass();
                    q6.a aVar3 = i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(aVar3);
                    } else {
                        pVar.d0();
                    }
                    d.Q(pVar, nVar, i.f7784e);
                    d.Q(pVar, m8, i.f7783d);
                    h hVar = i.f7785f;
                    if (pVar.O || !k.a(pVar.G(), Integer.valueOf(i15))) {
                        m.q(i15, pVar, i15, hVar);
                    }
                    d.Q(pVar, c4, i.f7782c);
                    aVar2 = aVar;
                    aVar2.c(rVar, pVar, 48);
                    pVar.p(true);
                    z10 = false;
                    pVar.p(false);
                }
                pVar.p(z10);
                r8 = pVar.r();
                if (r8 == null) {
                    r8.f3853d = new k.o(p1Var, cVar, oVar2, h0Var, i0Var, eVar, aVar2, i7);
                    return;
                }
                return;
            }
            pVar.Q(1790262234);
            pVar.p(false);
        }
        aVar2 = aVar;
        oVar2 = oVar;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    public static final w b(p1 p1Var, c cVar, Object obj, p pVar) {
        pVar.M(-902048200, 0, p1Var, null);
        boolean g9 = p1Var.g();
        u1 u1Var = p1Var.f5610a;
        w wVar = w.f5278f;
        w wVar2 = w.f5280h;
        w wVar3 = w.f5279g;
        if (g9) {
            pVar.Q(2101296683);
            pVar.p(false);
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                wVar = wVar3;
            } else if (((Boolean) cVar.f(u1Var.a())).booleanValue()) {
                wVar = wVar2;
            }
        } else {
            pVar.Q(2101530516);
            Object G = pVar.G();
            if (G == l.f3784a) {
                G = d.J(Boolean.FALSE, t0.f3903k);
                pVar.a0(G);
            }
            z0 z0Var = (z0) G;
            if (((Boolean) cVar.f(u1Var.a())).booleanValue()) {
                z0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                wVar = wVar3;
            } else if (((Boolean) z0Var.getValue()).booleanValue()) {
                wVar = wVar2;
            }
            pVar.p(false);
        }
        pVar.p(false);
        return wVar;
    }
}
