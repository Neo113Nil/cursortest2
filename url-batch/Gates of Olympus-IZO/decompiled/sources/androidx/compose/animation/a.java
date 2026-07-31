package androidx.compose.animation;

import F.C0055n0;
import F.D0;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.P0;
import I.X;
import L1.z;
import U.l;
import U.m;
import Y1.c;
import Y1.e;
import Z1.i;
import java.util.LinkedHashMap;
import java.util.Map;
import l.AbstractC0555B;
import l.C0554A;
import l.C0569n;
import l.C0570o;
import l.F;
import l.G;
import l.H;
import l.O;
import l.r;
import l.t;
import l.x;
import l.y;
import m.C0585J;
import m.l0;
import m.s0;
import m.v0;
import m.w0;
import m.y0;
import m.z0;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0417 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(s0 s0Var, c cVar, l lVar, F f3, G g3, e eVar, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        int i5;
        boolean z3;
        Object G3;
        s0 s0Var2;
        boolean f4;
        Object G4;
        C0102j0 c0102j0;
        boolean f5;
        Object G5;
        Object G6;
        X x3;
        InterfaceC0088c0 interfaceC0088c0;
        boolean h3;
        Object G7;
        w0 w0Var;
        Object a3;
        x xVar;
        boolean z4;
        Object G8;
        boolean f6;
        Object G9;
        Object a4;
        Object value;
        x xVar2;
        t tVar;
        boolean f7;
        G g4;
        Object J3;
        O o3;
        O o4;
        boolean z5;
        l0 l0Var;
        boolean h4;
        Object G10;
        boolean f8;
        Object G11;
        Object G12;
        t tVar2;
        int i6;
        C0119s0 r3;
        c0113p.S(-891967166);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(s0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(lVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.f(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0113p.f(g3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0113p.h(eVar) ? 131072 : 65536;
        }
        int i7 = i4 | 1572864;
        if ((12582912 & i3) == 0) {
            i7 |= c0113p.h(aVar) ? 8388608 : 4194304;
        }
        int i8 = i7;
        if ((4793491 & i8) == 4793490 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean booleanValue = ((Boolean) cVar.j(s0Var.f5844d.getValue())).booleanValue();
            w0 w0Var2 = s0Var.f5841a;
            if (booleanValue || ((Boolean) cVar.j(w0Var2.a())).booleanValue() || s0Var.g() || s0Var.d()) {
                c0113p.Q(1787977937);
                int i9 = i8 & 14;
                int i10 = i9 | 48;
                int i11 = i10 & 14;
                boolean z6 = ((i11 ^ 6) > 4 && c0113p.f(s0Var)) || (i10 & 6) == 4;
                Object G13 = c0113p.G();
                Object obj = C0105l.f2272a;
                if (z6 || G13 == obj) {
                    G13 = w0Var2.a();
                    c0113p.a0(G13);
                }
                if (s0Var.g()) {
                    G13 = w0Var2.a();
                }
                c0113p.Q(-466616829);
                x b2 = b(s0Var, cVar, G13, c0113p);
                c0113p.p(false);
                Object value2 = s0Var.f5844d.getValue();
                c0113p.Q(-466616829);
                x b3 = b(s0Var, cVar, value2, c0113p);
                c0113p.p(false);
                int i12 = i11 | 3072;
                Object obj2 = v0.f5874a;
                int i13 = (i12 & 14) ^ 6;
                if (i13 <= 4 || !c0113p.f(s0Var)) {
                    i5 = i8;
                    if ((i12 & 6) != 4) {
                        z3 = false;
                        G3 = c0113p.G();
                        if (!z3 || G3 == obj) {
                            G3 = new s0(new C0585J(b2), s0Var, s0Var.f5843c + " > EnterExitTransition");
                            c0113p.a0(G3);
                        }
                        s0Var2 = (s0) G3;
                        f4 = ((i13 <= 4 && c0113p.f(s0Var)) || (i12 & 6) == 4) | c0113p.f(s0Var2);
                        G4 = c0113p.G();
                        if (!f4 || G4 == obj) {
                            G4 = new D0(s0Var, 16, s0Var2);
                            c0113p.a0(G4);
                        }
                        C0089d.c(s0Var2, (c) G4, c0113p);
                        if (s0Var.g()) {
                            s0Var2.q(b3);
                            s0Var2.f5851k.setValue(Boolean.FALSE);
                        } else {
                            s0Var2.l(b2, b3);
                        }
                        InterfaceC0088c0 M3 = C0089d.M(eVar, c0113p);
                        Object a5 = s0Var2.f5841a.a();
                        c0102j0 = s0Var2.f5844d;
                        Object g5 = eVar.g(a5, c0102j0.getValue());
                        f5 = c0113p.f(s0Var2) | c0113p.f(M3);
                        G5 = c0113p.G();
                        if (!f5 || G5 == obj) {
                            G5 = new r(s0Var2, M3, null);
                            c0113p.a0(G5);
                        }
                        e eVar2 = (e) G5;
                        G6 = c0113p.G();
                        x3 = X.f2228i;
                        if (G6 == obj) {
                            G6 = C0089d.J(g5, x3);
                            c0113p.a0(G6);
                        }
                        interfaceC0088c0 = (InterfaceC0088c0) G6;
                        z zVar = z.f2729a;
                        h3 = c0113p.h(eVar2);
                        G7 = c0113p.G();
                        if (!h3 || G7 == obj) {
                            G7 = new P0(eVar2, interfaceC0088c0, null);
                            c0113p.a0(G7);
                        }
                        C0089d.e(c0113p, (e) G7, zVar);
                        w0Var = s0Var2.f5841a;
                        a3 = w0Var.a();
                        xVar = x.f5516f;
                        if (a3 != xVar && c0102j0.getValue() == xVar && ((Boolean) interfaceC0088c0.getValue()).booleanValue()) {
                            c0113p.Q(1790256282);
                            c0113p.p(false);
                            z5 = false;
                        } else {
                            c0113p.Q(1788869559);
                            z4 = i9 != 4;
                            G8 = c0113p.G();
                            if (!z4 || G8 == obj) {
                                G8 = new t();
                                c0113p.a0(G8);
                            }
                            t tVar3 = (t) G8;
                            y0 y0Var = AbstractC0555B.f5413a;
                            C0554A c0554a = C0554A.f5412e;
                            f6 = c0113p.f(s0Var2);
                            G9 = c0113p.G();
                            if (!f6 || G9 == obj) {
                                G9 = C0089d.J(f3, x3);
                                c0113p.a0(G9);
                            }
                            InterfaceC0088c0 interfaceC0088c02 = (InterfaceC0088c0) G9;
                            a4 = w0Var.a();
                            value = c0102j0.getValue();
                            xVar2 = x.f5515e;
                            if (a4 == value || w0Var.a() != xVar2) {
                                if (c0102j0.getValue() == xVar2) {
                                    F f9 = (F) interfaceC0088c02.getValue();
                                    f9.getClass();
                                    tVar = tVar3;
                                    O o5 = f3.f5432a;
                                    O o6 = f9.f5432a;
                                    H h5 = o5.f5448a;
                                    if (h5 == null) {
                                        h5 = o6.f5448a;
                                    }
                                    H h6 = h5;
                                    Map map = o6.f5450c;
                                    i.f(map, "<this>");
                                    Map map2 = o5.f5450c;
                                    i.f(map2, "map");
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                    linkedHashMap.putAll(map2);
                                    interfaceC0088c02.setValue(new F(new O(h6, null, false, linkedHashMap, 16)));
                                    F f10 = (F) interfaceC0088c02.getValue();
                                    f7 = c0113p.f(s0Var2);
                                    Object G14 = c0113p.G();
                                    if (!f7 || G14 == obj) {
                                        g4 = g3;
                                        J3 = C0089d.J(g4, x3);
                                        c0113p.a0(J3);
                                    } else {
                                        J3 = G14;
                                        g4 = g3;
                                    }
                                    InterfaceC0088c0 interfaceC0088c03 = (InterfaceC0088c0) J3;
                                    if (w0Var.a() == c0102j0.getValue() || w0Var.a() != xVar2) {
                                        if (c0102j0.getValue() != xVar2) {
                                            G g6 = (G) interfaceC0088c03.getValue();
                                            g6.getClass();
                                            O o7 = g4.f5435a;
                                            O o8 = g6.f5435a;
                                            H h7 = o7.f5448a;
                                            if (h7 == null) {
                                                h7 = o8.f5448a;
                                            }
                                            boolean z7 = o7.f5449b || o8.f5449b;
                                            Map map3 = o8.f5450c;
                                            i.f(map3, "<this>");
                                            Map map4 = o7.f5450c;
                                            i.f(map4, "map");
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                            linkedHashMap2.putAll(map4);
                                            interfaceC0088c03.setValue(new G(new O(h7, null, z7, linkedHashMap2)));
                                        }
                                    } else if (s0Var2.g()) {
                                        interfaceC0088c03.setValue(g4);
                                    } else {
                                        interfaceC0088c03.setValue(G.f5433b);
                                    }
                                    G g7 = (G) interfaceC0088c03.getValue();
                                    o3 = f10.f5432a;
                                    o4 = g7.f5435a;
                                    c0113p.Q(-821278096);
                                    c0113p.p(false);
                                    c0113p.Q(-821099041);
                                    c0113p.p(false);
                                    c0113p.Q(-820883777);
                                    c0113p.p(false);
                                    if (o3.f5448a == null || o4.f5448a != null) {
                                        c0113p.Q(-675389204);
                                        y0 y0Var2 = z0.f5885a;
                                        Object G15 = c0113p.G();
                                        if (G15 == obj) {
                                            G15 = "Built-in alpha";
                                            c0113p.a0("Built-in alpha");
                                        }
                                        z5 = false;
                                        l0Var = v0.a(s0Var2, y0Var2, (String) G15, c0113p, 384, 0);
                                        c0113p.p(false);
                                    } else {
                                        z5 = false;
                                        c0113p.Q(-675252433);
                                        c0113p.p(false);
                                        l0Var = null;
                                    }
                                    c0113p.Q(-675057009);
                                    c0113p.p(z5);
                                    c0113p.Q(-674835793);
                                    c0113p.p(z5);
                                    h4 = c0113p.h(l0Var) | c0113p.f(f10) | c0113p.f(g7) | c0113p.h(null) | c0113p.f(s0Var2) | c0113p.h(null);
                                    G10 = c0113p.G();
                                    if (!h4 || G10 == obj) {
                                        G10 = new y(l0Var, null, s0Var2, f10, g7, null);
                                        c0113p.a0(G10);
                                    }
                                    y yVar = (y) G10;
                                    U.i iVar = U.i.f3302a;
                                    f8 = c0113p.f(c0554a) | c0113p.g(true);
                                    G11 = c0113p.G();
                                    if (!f8 || G11 == obj) {
                                        G11 = new C0055n0(true, c0554a, 1);
                                        c0113p.a0(G11);
                                    }
                                    l e3 = androidx.compose.ui.graphics.a.a(iVar, (c) G11).e(new EnterExitTransitionElement(s0Var2, f10, g7, c0554a, yVar));
                                    c0113p.Q(1581766416);
                                    c0113p.p(z5);
                                    l e4 = lVar.e(e3.e(iVar));
                                    G12 = c0113p.G();
                                    if (G12 == obj) {
                                        tVar2 = tVar;
                                        G12 = new C0569n(tVar2);
                                        c0113p.a0(G12);
                                    } else {
                                        tVar2 = tVar;
                                    }
                                    C0569n c0569n = (C0569n) G12;
                                    i6 = c0113p.f2306P;
                                    InterfaceC0110n0 m3 = c0113p.m();
                                    l c3 = m.c(c0113p, e4);
                                    InterfaceC0902j.f7933c.getClass();
                                    C0906n c0906n = C0901i.f7920b;
                                    c0113p.U();
                                    if (c0113p.f2305O) {
                                        c0113p.l(c0906n);
                                    } else {
                                        c0113p.d0();
                                    }
                                    C0089d.Q(c0113p, C0901i.f7923e, c0569n);
                                    C0089d.Q(c0113p, C0901i.f7922d, m3);
                                    C0900h c0900h = C0901i.f7924f;
                                    if (!c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i6))) {
                                        AbstractC0080b.p(i6, c0113p, i6, c0900h);
                                    }
                                    C0089d.Q(c0113p, C0901i.f7921c, c3);
                                    aVar.f(tVar2, c0113p, Integer.valueOf((i5 >> 18) & 112));
                                    c0113p.p(true);
                                    c0113p.p(z5);
                                }
                            } else if (s0Var2.g()) {
                                interfaceC0088c02.setValue(f3);
                            } else {
                                interfaceC0088c02.setValue(F.f5431b);
                            }
                            tVar = tVar3;
                            F f102 = (F) interfaceC0088c02.getValue();
                            f7 = c0113p.f(s0Var2);
                            Object G142 = c0113p.G();
                            if (f7) {
                            }
                            g4 = g3;
                            J3 = C0089d.J(g4, x3);
                            c0113p.a0(J3);
                            InterfaceC0088c0 interfaceC0088c032 = (InterfaceC0088c0) J3;
                            if (w0Var.a() == c0102j0.getValue()) {
                            }
                            if (c0102j0.getValue() != xVar2) {
                            }
                            G g72 = (G) interfaceC0088c032.getValue();
                            o3 = f102.f5432a;
                            o4 = g72.f5435a;
                            c0113p.Q(-821278096);
                            c0113p.p(false);
                            c0113p.Q(-821099041);
                            c0113p.p(false);
                            c0113p.Q(-820883777);
                            c0113p.p(false);
                            if (o3.f5448a == null || o4.f5448a != null) {
                            }
                            c0113p.Q(-675057009);
                            c0113p.p(z5);
                            c0113p.Q(-674835793);
                            c0113p.p(z5);
                            h4 = c0113p.h(l0Var) | c0113p.f(f102) | c0113p.f(g72) | c0113p.h(null) | c0113p.f(s0Var2) | c0113p.h(null);
                            G10 = c0113p.G();
                            if (!h4) {
                            }
                            G10 = new y(l0Var, null, s0Var2, f102, g72, null);
                            c0113p.a0(G10);
                            y yVar2 = (y) G10;
                            U.i iVar2 = U.i.f3302a;
                            f8 = c0113p.f(c0554a) | c0113p.g(true);
                            G11 = c0113p.G();
                            if (!f8) {
                            }
                            G11 = new C0055n0(true, c0554a, 1);
                            c0113p.a0(G11);
                            l e32 = androidx.compose.ui.graphics.a.a(iVar2, (c) G11).e(new EnterExitTransitionElement(s0Var2, f102, g72, c0554a, yVar2));
                            c0113p.Q(1581766416);
                            c0113p.p(z5);
                            l e42 = lVar.e(e32.e(iVar2));
                            G12 = c0113p.G();
                            if (G12 == obj) {
                            }
                            C0569n c0569n2 = (C0569n) G12;
                            i6 = c0113p.f2306P;
                            InterfaceC0110n0 m32 = c0113p.m();
                            l c32 = m.c(c0113p, e42);
                            InterfaceC0902j.f7933c.getClass();
                            C0906n c0906n2 = C0901i.f7920b;
                            c0113p.U();
                            if (c0113p.f2305O) {
                            }
                            C0089d.Q(c0113p, C0901i.f7923e, c0569n2);
                            C0089d.Q(c0113p, C0901i.f7922d, m32);
                            C0900h c0900h2 = C0901i.f7924f;
                            if (!c0113p.f2305O) {
                            }
                            AbstractC0080b.p(i6, c0113p, i6, c0900h2);
                            C0089d.Q(c0113p, C0901i.f7921c, c32);
                            aVar.f(tVar2, c0113p, Integer.valueOf((i5 >> 18) & 112));
                            c0113p.p(true);
                            c0113p.p(z5);
                        }
                        c0113p.p(z5);
                        r3 = c0113p.r();
                        if (r3 != null) {
                            r3.f2347d = new C0570o(s0Var, cVar, lVar, f3, g3, eVar, aVar, i3);
                            return;
                        }
                        return;
                    }
                } else {
                    i5 = i8;
                }
                z3 = true;
                G3 = c0113p.G();
                if (!z3) {
                }
                G3 = new s0(new C0585J(b2), s0Var, s0Var.f5843c + " > EnterExitTransition");
                c0113p.a0(G3);
                s0Var2 = (s0) G3;
                f4 = ((i13 <= 4 && c0113p.f(s0Var)) || (i12 & 6) == 4) | c0113p.f(s0Var2);
                G4 = c0113p.G();
                if (!f4) {
                }
                G4 = new D0(s0Var, 16, s0Var2);
                c0113p.a0(G4);
                C0089d.c(s0Var2, (c) G4, c0113p);
                if (s0Var.g()) {
                }
                InterfaceC0088c0 M32 = C0089d.M(eVar, c0113p);
                Object a52 = s0Var2.f5841a.a();
                c0102j0 = s0Var2.f5844d;
                Object g52 = eVar.g(a52, c0102j0.getValue());
                f5 = c0113p.f(s0Var2) | c0113p.f(M32);
                G5 = c0113p.G();
                if (!f5) {
                }
                G5 = new r(s0Var2, M32, null);
                c0113p.a0(G5);
                e eVar22 = (e) G5;
                G6 = c0113p.G();
                x3 = X.f2228i;
                if (G6 == obj) {
                }
                interfaceC0088c0 = (InterfaceC0088c0) G6;
                z zVar2 = z.f2729a;
                h3 = c0113p.h(eVar22);
                G7 = c0113p.G();
                if (!h3) {
                }
                G7 = new P0(eVar22, interfaceC0088c0, null);
                c0113p.a0(G7);
                C0089d.e(c0113p, (e) G7, zVar2);
                w0Var = s0Var2.f5841a;
                a3 = w0Var.a();
                xVar = x.f5516f;
                if (a3 != xVar) {
                }
                c0113p.Q(1788869559);
                if (i9 != 4) {
                }
                G8 = c0113p.G();
                if (!z4) {
                }
                G8 = new t();
                c0113p.a0(G8);
                t tVar32 = (t) G8;
                y0 y0Var3 = AbstractC0555B.f5413a;
                C0554A c0554a2 = C0554A.f5412e;
                f6 = c0113p.f(s0Var2);
                G9 = c0113p.G();
                if (!f6) {
                }
                G9 = C0089d.J(f3, x3);
                c0113p.a0(G9);
                InterfaceC0088c0 interfaceC0088c022 = (InterfaceC0088c0) G9;
                a4 = w0Var.a();
                value = c0102j0.getValue();
                xVar2 = x.f5515e;
                if (a4 == value) {
                }
                if (c0102j0.getValue() == xVar2) {
                }
                tVar = tVar32;
                F f1022 = (F) interfaceC0088c022.getValue();
                f7 = c0113p.f(s0Var2);
                Object G1422 = c0113p.G();
                if (f7) {
                }
                g4 = g3;
                J3 = C0089d.J(g4, x3);
                c0113p.a0(J3);
                InterfaceC0088c0 interfaceC0088c0322 = (InterfaceC0088c0) J3;
                if (w0Var.a() == c0102j0.getValue()) {
                }
                if (c0102j0.getValue() != xVar2) {
                }
                G g722 = (G) interfaceC0088c0322.getValue();
                o3 = f1022.f5432a;
                o4 = g722.f5435a;
                c0113p.Q(-821278096);
                c0113p.p(false);
                c0113p.Q(-821099041);
                c0113p.p(false);
                c0113p.Q(-820883777);
                c0113p.p(false);
                if (o3.f5448a == null || o4.f5448a != null) {
                }
                c0113p.Q(-675057009);
                c0113p.p(z5);
                c0113p.Q(-674835793);
                c0113p.p(z5);
                h4 = c0113p.h(l0Var) | c0113p.f(f1022) | c0113p.f(g722) | c0113p.h(null) | c0113p.f(s0Var2) | c0113p.h(null);
                G10 = c0113p.G();
                if (!h4) {
                }
                G10 = new y(l0Var, null, s0Var2, f1022, g722, null);
                c0113p.a0(G10);
                y yVar22 = (y) G10;
                U.i iVar22 = U.i.f3302a;
                f8 = c0113p.f(c0554a2) | c0113p.g(true);
                G11 = c0113p.G();
                if (!f8) {
                }
                G11 = new C0055n0(true, c0554a2, 1);
                c0113p.a0(G11);
                l e322 = androidx.compose.ui.graphics.a.a(iVar22, (c) G11).e(new EnterExitTransitionElement(s0Var2, f1022, g722, c0554a2, yVar22));
                c0113p.Q(1581766416);
                c0113p.p(z5);
                l e422 = lVar.e(e322.e(iVar22));
                G12 = c0113p.G();
                if (G12 == obj) {
                }
                C0569n c0569n22 = (C0569n) G12;
                i6 = c0113p.f2306P;
                InterfaceC0110n0 m322 = c0113p.m();
                l c322 = m.c(c0113p, e422);
                InterfaceC0902j.f7933c.getClass();
                C0906n c0906n22 = C0901i.f7920b;
                c0113p.U();
                if (c0113p.f2305O) {
                }
                C0089d.Q(c0113p, C0901i.f7923e, c0569n22);
                C0089d.Q(c0113p, C0901i.f7922d, m322);
                C0900h c0900h22 = C0901i.f7924f;
                if (!c0113p.f2305O) {
                }
                AbstractC0080b.p(i6, c0113p, i6, c0900h22);
                C0089d.Q(c0113p, C0901i.f7921c, c322);
                aVar.f(tVar2, c0113p, Integer.valueOf((i5 >> 18) & 112));
                c0113p.p(true);
                c0113p.p(z5);
                c0113p.p(z5);
                r3 = c0113p.r();
                if (r3 != null) {
                }
            } else {
                c0113p.Q(1790262234);
                c0113p.p(false);
            }
        }
        r3 = c0113p.r();
        if (r3 != null) {
        }
    }

    public static final x b(s0 s0Var, c cVar, Object obj, C0113p c0113p) {
        c0113p.M(-902048200, 0, s0Var, null);
        boolean g3 = s0Var.g();
        x xVar = x.f5514d;
        x xVar2 = x.f5516f;
        x xVar3 = x.f5515e;
        w0 w0Var = s0Var.f5841a;
        if (g3) {
            c0113p.Q(2101296683);
            c0113p.p(false);
            if (((Boolean) cVar.j(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) cVar.j(w0Var.a())).booleanValue()) {
                xVar = xVar2;
            }
        } else {
            c0113p.Q(2101530516);
            Object G3 = c0113p.G();
            if (G3 == C0105l.f2272a) {
                G3 = C0089d.J(Boolean.FALSE, X.f2228i);
                c0113p.a0(G3);
            }
            InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
            if (((Boolean) cVar.j(w0Var.a())).booleanValue()) {
                interfaceC0088c0.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.j(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) interfaceC0088c0.getValue()).booleanValue()) {
                xVar = xVar2;
            }
            c0113p.p(false);
        }
        c0113p.p(false);
        return xVar;
    }
}
