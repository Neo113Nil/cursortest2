package androidx.compose.animation;

import A.k;
import B.C0022x;
import B.h0;
import F.C0114p0;
import F.K0;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.O0;
import I.W;
import R1.y;
import U.n;
import U.q;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import f2.j;
import l.AbstractC0574B;
import l.C0573A;
import l.C0579e;
import l.C0587m;
import l.C0588n;
import l.C0590p;
import l.G;
import l.H;
import l.P;
import l.r;
import l.t;
import l.v;
import l.x;
import m.C0610F;
import m.f0;
import m.l0;
import m.r0;
import m.s0;
import m.u0;
import m.v0;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:175:0x044f, code lost:
    
        if (r11 == r9) goto L219;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(l0 l0Var, InterfaceC0424c interfaceC0424c, q qVar, G g3, H h3, InterfaceC0426e interfaceC0426e, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        boolean z3;
        Object obj;
        v vVar;
        v vVar2;
        P p3;
        P p4;
        f0 f0Var;
        Object obj2;
        v vVar3;
        f0 f0Var2;
        v vVar4;
        boolean z4;
        P p5;
        boolean z5;
        Object obj3;
        f0 f0Var3;
        Object obj4;
        C0173s0 r3;
        c0167p.S(-891967166);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(l0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0424c) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(g3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.f(h3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 131072 : 65536;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i3) == 0) {
            i5 |= c0167p.h(aVar) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if ((i6 & 4793491) == 4793490 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean booleanValue = ((Boolean) interfaceC0424c.n(l0Var.f6839d.getValue())).booleanValue();
            s0 s0Var = l0Var.f6836a;
            if (booleanValue || ((Boolean) interfaceC0424c.n(s0Var.a())).booleanValue() || l0Var.g() || l0Var.d()) {
                c0167p.Q(1787977937);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z6 = ((i9 ^ 6) > 4 && c0167p.f(l0Var)) || (i8 & 6) == 4;
                Object G3 = c0167p.G();
                Object obj5 = C0159l.f2829a;
                if (z6 || G3 == obj5) {
                    G3 = s0Var.a();
                    c0167p.a0(G3);
                }
                if (l0Var.g()) {
                    G3 = s0Var.a();
                }
                c0167p.Q(-466616829);
                x d3 = d(l0Var, interfaceC0424c, G3, c0167p);
                c0167p.p(false);
                Object value = l0Var.f6839d.getValue();
                c0167p.Q(-466616829);
                x d4 = d(l0Var, interfaceC0424c, value, c0167p);
                c0167p.p(false);
                int i10 = i9 | 3072;
                Object obj6 = r0.f6876a;
                int i11 = (i10 & 14) ^ 6;
                boolean z7 = (i11 > 4 && c0167p.f(l0Var)) || (i10 & 6) == 4;
                Object G4 = c0167p.G();
                if (z7 || G4 == obj5) {
                    G4 = new l0(new C0610F(d3), l0Var, l0Var.f6838c + " > EnterExitTransition");
                    c0167p.a0(G4);
                }
                l0 l0Var2 = (l0) G4;
                boolean f3 = ((i11 > 4 && c0167p.f(l0Var)) || (i10 & 6) == 4) | c0167p.f(l0Var2);
                Object G5 = c0167p.G();
                if (f3 || G5 == obj5) {
                    G5 = new C0022x(l0Var, 22, l0Var2);
                    c0167p.a0(G5);
                }
                C0143d.c(l0Var2, (InterfaceC0424c) G5, c0167p);
                if (l0Var.g()) {
                    l0Var2.l(d3, d4);
                } else {
                    l0Var2.q(d4);
                    l0Var2.f6846k.setValue(Boolean.FALSE);
                }
                InterfaceC0142c0 N3 = C0143d.N(interfaceC0426e, c0167p);
                Object a3 = l0Var2.f6836a.a();
                C0156j0 c0156j0 = l0Var2.f6839d;
                Object h4 = interfaceC0426e.h(a3, c0156j0.getValue());
                boolean f4 = c0167p.f(l0Var2) | c0167p.f(N3);
                Object G6 = c0167p.G();
                if (f4 || G6 == obj5) {
                    G6 = new C0590p(l0Var2, N3, null);
                    c0167p.a0(G6);
                }
                InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) G6;
                Object G7 = c0167p.G();
                W w2 = W.f2783i;
                if (G7 == obj5) {
                    G7 = C0143d.K(h4, w2);
                    c0167p.a0(G7);
                }
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G7;
                y yVar = y.f4171a;
                boolean h5 = c0167p.h(interfaceC0426e2);
                Object G8 = c0167p.G();
                if (h5 || G8 == obj5) {
                    G8 = new O0(interfaceC0426e2, interfaceC0142c0, null);
                    c0167p.a0(G8);
                }
                C0143d.e(c0167p, (InterfaceC0426e) G8, yVar);
                s0 s0Var2 = l0Var2.f6836a;
                Object a4 = s0Var2.a();
                x xVar = x.f6549f;
                if (a4 == xVar && c0156j0.getValue() == xVar && ((Boolean) interfaceC0142c0.getValue()).booleanValue()) {
                    c0167p.Q(1790256282);
                    c0167p.p(false);
                    z3 = false;
                } else {
                    c0167p.Q(1788869559);
                    boolean z8 = i7 == 4;
                    Object G9 = c0167p.G();
                    if (z8 || G9 == obj5) {
                        G9 = new t();
                        c0167p.a0(G9);
                    }
                    t tVar = (t) G9;
                    u0 u0Var = AbstractC0574B.f6428a;
                    C0573A c0573a = C0573A.f6427e;
                    boolean f5 = c0167p.f(l0Var2);
                    Object G10 = c0167p.G();
                    if (f5 || G10 == obj5) {
                        G10 = C0143d.K(g3, w2);
                        c0167p.a0(G10);
                    }
                    InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) G10;
                    Object a5 = s0Var2.a();
                    Object value2 = c0156j0.getValue();
                    x xVar2 = x.f6548e;
                    if (a5 == value2 && s0Var2.a() == xVar2) {
                        if (l0Var2.g()) {
                            interfaceC0142c02.setValue(g3);
                        } else {
                            interfaceC0142c02.setValue(G.f6452b);
                        }
                    } else if (c0156j0.getValue() == xVar2) {
                        interfaceC0142c02.setValue(((G) interfaceC0142c02.getValue()).a(g3));
                    }
                    G g4 = (G) interfaceC0142c02.getValue();
                    boolean f6 = c0167p.f(l0Var2);
                    Object G11 = c0167p.G();
                    if (f6 || G11 == obj5) {
                        G11 = C0143d.K(h3, w2);
                        c0167p.a0(G11);
                    }
                    InterfaceC0142c0 interfaceC0142c03 = (InterfaceC0142c0) G11;
                    if (s0Var2.a() == c0156j0.getValue() && s0Var2.a() == xVar2) {
                        if (l0Var2.g()) {
                            interfaceC0142c03.setValue(h3);
                        } else {
                            interfaceC0142c03.setValue(H.f6454b);
                        }
                    } else if (c0156j0.getValue() != xVar2) {
                        interfaceC0142c03.setValue(((H) interfaceC0142c03.getValue()).a(h3));
                    }
                    H h6 = (H) interfaceC0142c03.getValue();
                    P p6 = g4.f6453a;
                    P p7 = h6.f6456a;
                    v vVar5 = p6.f6469b;
                    v vVar6 = p7.f6469b;
                    boolean z9 = (vVar5 == null && vVar6 == null) ? false : true;
                    c0167p.Q(-821278096);
                    c0167p.p(false);
                    if (z9) {
                        c0167p.Q(-821202177);
                        u0 u0Var2 = v0.f6906h;
                        Object G12 = c0167p.G();
                        if (G12 == obj5) {
                            G12 = "Built-in shrink/expand";
                            c0167p.a0("Built-in shrink/expand");
                        }
                        obj = obj5;
                        vVar = vVar6;
                        vVar2 = vVar5;
                        p3 = p7;
                        p4 = p6;
                        z3 = false;
                        f0 a6 = r0.a(l0Var2, u0Var2, (String) G12, c0167p, 384, 0);
                        c0167p.p(false);
                        f0Var = a6;
                    } else {
                        z3 = false;
                        obj = obj5;
                        vVar = vVar6;
                        vVar2 = vVar5;
                        p3 = p7;
                        p4 = p6;
                        c0167p.Q(-821099041);
                        c0167p.p(false);
                        f0Var = null;
                    }
                    if (z9) {
                        c0167p.Q(-821034002);
                        u0 u0Var3 = v0.f6905g;
                        Object G13 = c0167p.G();
                        Object obj7 = obj;
                        if (G13 == obj7) {
                            G13 = "Built-in InterruptionHandlingOffset";
                            c0167p.a0("Built-in InterruptionHandlingOffset");
                        }
                        obj2 = obj7;
                        f0 a7 = r0.a(l0Var2, u0Var3, (String) G13, c0167p, 384, 0);
                        c0167p.p(z3);
                        f0Var2 = a7;
                        vVar3 = vVar2;
                    } else {
                        obj2 = obj;
                        c0167p.Q(-820883777);
                        c0167p.p(z3);
                        vVar3 = vVar2;
                        f0Var2 = null;
                    }
                    if ((vVar3 == null || vVar3.f6542d) && (((vVar4 = vVar) == null || vVar4.f6542d) && z9)) {
                        z4 = z3;
                        p5 = p4;
                    } else {
                        p5 = p4;
                        z4 = true;
                    }
                    if ((p5.f6468a == null && p3.f6468a == null) ? z3 : true) {
                        c0167p.Q(-675389204);
                        u0 u0Var4 = v0.f6899a;
                        Object G14 = c0167p.G();
                        Object obj8 = obj2;
                        if (G14 == obj8) {
                            G14 = "Built-in alpha";
                            c0167p.a0("Built-in alpha");
                        }
                        String str = (String) G14;
                        obj3 = obj8;
                        z5 = z4;
                        f0Var3 = r0.a(l0Var2, u0Var4, str, c0167p, 384, 0);
                        c0167p.p(z3);
                    } else {
                        z5 = z4;
                        obj3 = obj2;
                        c0167p.Q(-675252433);
                        c0167p.p(z3);
                        f0Var3 = null;
                    }
                    c0167p.Q(-675057009);
                    c0167p.p(z3);
                    c0167p.Q(-674835793);
                    c0167p.p(z3);
                    boolean h7 = c0167p.h(f0Var3) | c0167p.f(g4) | c0167p.f(h6) | c0167p.h(null) | c0167p.f(l0Var2) | c0167p.h(null);
                    Object G15 = c0167p.G();
                    if (h7) {
                        obj4 = obj3;
                    } else {
                        obj4 = obj3;
                    }
                    G15 = new l.y(f0Var3, null, l0Var2, g4, h6, null);
                    c0167p.a0(G15);
                    l.y yVar2 = (l.y) G15;
                    n nVar = n.f4488a;
                    boolean g5 = c0167p.g(z5) | c0167p.f(c0573a);
                    Object G16 = c0167p.G();
                    if (g5 || G16 == obj4) {
                        G16 = new K0(z5, c0573a, 1);
                        c0167p.a0(G16);
                    }
                    q i12 = androidx.compose.ui.graphics.a.a(nVar, (InterfaceC0424c) G16).i(new EnterExitTransitionElement(l0Var2, f0Var, f0Var2, g4, h6, c0573a, yVar2));
                    c0167p.Q(1581766416);
                    c0167p.p(z3);
                    q i13 = qVar.i(i12.i(nVar));
                    Object G17 = c0167p.G();
                    if (G17 == obj4) {
                        G17 = new C0587m(tVar);
                        c0167p.a0(G17);
                    }
                    C0587m c0587m = (C0587m) G17;
                    int i14 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    q d5 = U.a.d(c0167p, i13);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n = C0996i.f8754b;
                    c0167p.U();
                    if (c0167p.f2863O) {
                        c0167p.l(c1001n);
                    } else {
                        c0167p.d0();
                    }
                    C0143d.R(c0167p, C0996i.f8757e, c0587m);
                    C0143d.R(c0167p, C0996i.f8756d, m3);
                    C0995h c0995h = C0996i.f8758f;
                    if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i14))) {
                        k.o(i14, c0167p, i14, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d5);
                    aVar.g(tVar, c0167p, Integer.valueOf((i6 >> 18) & 112));
                    c0167p.p(true);
                    c0167p.p(z3);
                }
                c0167p.p(z3);
                r3 = c0167p.r();
                if (r3 == null) {
                    r3.f2906d = new C0588n(l0Var, interfaceC0424c, qVar, g3, h3, interfaceC0426e, aVar, i3);
                    return;
                }
                return;
            }
            c0167p.Q(1790262234);
            c0167p.p(false);
        }
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    public static final void b(boolean z3, q qVar, G g3, H h3, String str, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        q qVar2;
        String str2;
        c0167p.S(-1741346906);
        if ((i3 & 48) == 0) {
            i4 = (c0167p.g(z3) ? 32 : 16) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4 | 384;
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.f(g3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.f(h3) ? 16384 : 8192;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i3) == 0) {
            i6 |= c0167p.h(aVar) ? 1048576 : 524288;
        }
        if ((599185 & i6) == 599184 && c0167p.x()) {
            c0167p.L();
            qVar2 = qVar;
            str2 = str;
        } else {
            n nVar = n.f4488a;
            int i7 = i6 >> 3;
            c(r0.d(Boolean.valueOf(z3), "AnimatedVisibility", c0167p, (i7 & 14) | ((i6 >> 12) & 112)), nVar, g3, h3, aVar, c0167p, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i7 & 458752));
            qVar2 = nVar;
            str2 = "AnimatedVisibility";
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0114p0(z3, qVar2, g3, h3, str2, aVar, i3);
        }
    }

    public static final void c(l0 l0Var, q qVar, G g3, H h3, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        l.q qVar2 = l.q.f6521f;
        c0167p.S(429978603);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(l0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(qVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(g3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.f(h3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0167p.x()) {
            c0167p.L();
        } else {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z3 = (i5 == 32) | (i6 == 4);
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                G3 = new h0(3, l0Var);
                c0167p.a0(G3);
            }
            a(l0Var, qVar2, androidx.compose.ui.layout.a.b(qVar, (InterfaceC0427f) G3), g3, h3, C0579e.f6487g, aVar, c0167p, 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4) | ((i4 << 6) & 29360128));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new r(l0Var, qVar, g3, h3, aVar, i3);
        }
    }

    public static final x d(l0 l0Var, InterfaceC0424c interfaceC0424c, Object obj, C0167p c0167p) {
        c0167p.M(-902048200, 0, l0Var, null);
        boolean g3 = l0Var.g();
        x xVar = x.f6547d;
        x xVar2 = x.f6549f;
        x xVar3 = x.f6548e;
        s0 s0Var = l0Var.f6836a;
        if (g3) {
            c0167p.Q(2101296683);
            c0167p.p(false);
            if (((Boolean) interfaceC0424c.n(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) interfaceC0424c.n(s0Var.a())).booleanValue()) {
                xVar = xVar2;
            }
        } else {
            c0167p.Q(2101530516);
            Object G3 = c0167p.G();
            if (G3 == C0159l.f2829a) {
                G3 = C0143d.K(Boolean.FALSE, W.f2783i);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
            if (((Boolean) interfaceC0424c.n(s0Var.a())).booleanValue()) {
                interfaceC0142c0.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC0424c.n(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) interfaceC0142c0.getValue()).booleanValue()) {
                xVar = xVar2;
            }
            c0167p.p(false);
        }
        c0167p.p(false);
        return xVar;
    }
}
