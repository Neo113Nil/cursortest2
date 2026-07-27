package androidx.compose.animation;

import A.AbstractC0017m;
import A.C0028y;
import D.D0;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.O0;
import G.W;
import S.l;
import S.o;
import k.AbstractC0725A;
import k.C0730F;
import k.C0731G;
import k.C0747m;
import k.C0748n;
import k.O;
import k.p;
import k.r;
import k.t;
import k.w;
import k.x;
import k.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0761F;
import l.g0;
import l.m0;
import l.s0;
import l.t0;
import l.v0;
import l.w0;
import r0.C1067h;
import r0.C1069j;
import r0.InterfaceC1070k;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:57:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(m0 m0Var, Function1 function1, o oVar, C0730F c0730f, C0731G c0731g, Function2 function2, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        boolean z4;
        Object obj;
        t tVar;
        t tVar2;
        O o4;
        C0730F c0730f2;
        g0 g0Var;
        Object obj2;
        t tVar3;
        g0 g0Var2;
        t tVar4;
        boolean z5;
        Object obj3;
        g0 g0Var3;
        C0222s0 s4;
        c0216p.U(-891967166);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(m0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(c0730f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.f(c0731g) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(function2) ? 131072 : 65536;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i5 |= c0216p.h(aVar) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if ((i6 & 4793491) == 4793490 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean booleanValue = ((Boolean) function1.invoke(m0Var.f7803d.getValue())).booleanValue();
            t0 t0Var = m0Var.f7800a;
            if (booleanValue || ((Boolean) function1.invoke(t0Var.l())).booleanValue() || m0Var.g() || m0Var.d()) {
                c0216p.S(1787977937);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z6 = ((i9 ^ 6) > 4 && c0216p.f(m0Var)) || (i8 & 6) == 4;
                Object I3 = c0216p.I();
                Object obj4 = C0208l.f2826a;
                if (z6 || I3 == obj4) {
                    I3 = t0Var.l();
                    c0216p.c0(I3);
                }
                if (m0Var.g()) {
                    I3 = t0Var.l();
                }
                c0216p.S(-466616829);
                w b4 = b(m0Var, function1, I3, c0216p);
                c0216p.q(false);
                Object value = m0Var.f7803d.getValue();
                c0216p.S(-466616829);
                w b5 = b(m0Var, function1, value, c0216p);
                c0216p.q(false);
                int i10 = i9 | 3072;
                Object obj5 = s0.f7840a;
                int i11 = (i10 & 14) ^ 6;
                boolean z7 = (i11 > 4 && c0216p.f(m0Var)) || (i10 & 6) == 4;
                Object I4 = c0216p.I();
                if (z7 || I4 == obj4) {
                    I4 = new m0(new C0761F(b4), m0Var, AbstractC0017m.n(new StringBuilder(), m0Var.f7802c, " > EnterExitTransition"));
                    c0216p.c0(I4);
                }
                m0 m0Var2 = (m0) I4;
                boolean f4 = ((i11 > 4 && c0216p.f(m0Var)) || (i10 & 6) == 4) | c0216p.f(m0Var2);
                Object I5 = c0216p.I();
                if (f4 || I5 == obj4) {
                    I5 = new C0028y(m0Var, 20, m0Var2);
                    c0216p.c0(I5);
                }
                C0192d.d(m0Var2, (Function1) I5, c0216p);
                if (m0Var.g()) {
                    m0Var2.l(b4, b5);
                } else {
                    m0Var2.q(b5);
                    m0Var2.f7810k.setValue(Boolean.FALSE);
                }
                InterfaceC0191c0 N3 = C0192d.N(function2, c0216p);
                Object l4 = m0Var2.f7800a.l();
                C0205j0 c0205j0 = m0Var2.f7803d;
                Object h4 = function2.h(l4, c0205j0.getValue());
                boolean f5 = c0216p.f(m0Var2) | c0216p.f(N3);
                Object I6 = c0216p.I();
                if (f5 || I6 == obj4) {
                    I6 = new p(m0Var2, N3, null);
                    c0216p.c0(I6);
                }
                Function2 function22 = (Function2) I6;
                Object I7 = c0216p.I();
                W w4 = W.f2779l;
                if (I7 == obj4) {
                    I7 = C0192d.K(h4, w4);
                    c0216p.c0(I7);
                }
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I7;
                Unit unit = Unit.f7487a;
                boolean h5 = c0216p.h(function22);
                Object I8 = c0216p.I();
                if (h5 || I8 == obj4) {
                    I8 = new O0(function22, interfaceC0191c0, null);
                    c0216p.c0(I8);
                }
                C0192d.e(c0216p, unit, (Function2) I8);
                t0 t0Var2 = m0Var2.f7800a;
                Object l5 = t0Var2.l();
                w wVar = w.f7340i;
                if (l5 == wVar && c0205j0.getValue() == wVar && ((Boolean) interfaceC0191c0.getValue()).booleanValue()) {
                    c0216p.S(1790256282);
                    c0216p.q(false);
                    z4 = false;
                } else {
                    c0216p.S(1788869559);
                    boolean z8 = i7 == 4;
                    Object I9 = c0216p.I();
                    if (z8 || I9 == obj4) {
                        I9 = new r();
                        c0216p.c0(I9);
                    }
                    r rVar = (r) I9;
                    v0 v0Var = AbstractC0725A.f7229a;
                    z zVar = z.f7351d;
                    boolean f6 = c0216p.f(m0Var2);
                    Object I10 = c0216p.I();
                    if (f6 || I10 == obj4) {
                        I10 = C0192d.K(c0730f, w4);
                        c0216p.c0(I10);
                    }
                    InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) I10;
                    Object l6 = t0Var2.l();
                    Object value2 = c0205j0.getValue();
                    w wVar2 = w.f7339e;
                    if (l6 == value2 && t0Var2.l() == wVar2) {
                        if (m0Var2.g()) {
                            interfaceC0191c02.setValue(c0730f);
                        } else {
                            interfaceC0191c02.setValue(C0730F.f7252b);
                        }
                    } else if (c0205j0.getValue() == wVar2) {
                        interfaceC0191c02.setValue(((C0730F) interfaceC0191c02.getValue()).a(c0730f));
                    }
                    C0730F c0730f3 = (C0730F) interfaceC0191c02.getValue();
                    boolean f7 = c0216p.f(m0Var2);
                    Object I11 = c0216p.I();
                    if (f7 || I11 == obj4) {
                        I11 = C0192d.K(c0731g, w4);
                        c0216p.c0(I11);
                    }
                    InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) I11;
                    if (t0Var2.l() == c0205j0.getValue() && t0Var2.l() == wVar2) {
                        if (m0Var2.g()) {
                            interfaceC0191c03.setValue(c0731g);
                        } else {
                            interfaceC0191c03.setValue(C0731G.f7254b);
                        }
                    } else if (c0205j0.getValue() != wVar2) {
                        interfaceC0191c03.setValue(((C0731G) interfaceC0191c03.getValue()).a(c0731g));
                    }
                    C0731G c0731g2 = (C0731G) interfaceC0191c03.getValue();
                    O o5 = c0730f3.f7253a;
                    O o6 = c0731g2.f7256a;
                    t tVar5 = o5.f7269b;
                    t tVar6 = o6.f7269b;
                    boolean z9 = (tVar5 == null && tVar6 == null) ? false : true;
                    c0216p.S(-821278096);
                    c0216p.q(false);
                    if (z9) {
                        c0216p.S(-821202177);
                        v0 v0Var2 = w0.f7863h;
                        Object I12 = c0216p.I();
                        if (I12 == obj4) {
                            I12 = "Built-in shrink/expand";
                            c0216p.c0("Built-in shrink/expand");
                        }
                        obj = obj4;
                        tVar = tVar6;
                        tVar2 = tVar5;
                        o4 = o6;
                        c0730f2 = c0730f3;
                        z4 = false;
                        g0 a4 = s0.a(m0Var2, v0Var2, (String) I12, c0216p, 384, 0);
                        c0216p.q(false);
                        g0Var = a4;
                    } else {
                        z4 = false;
                        obj = obj4;
                        tVar = tVar6;
                        tVar2 = tVar5;
                        o4 = o6;
                        c0730f2 = c0730f3;
                        c0216p.S(-821099041);
                        c0216p.q(false);
                        g0Var = null;
                    }
                    if (z9) {
                        c0216p.S(-821034002);
                        v0 v0Var3 = w0.f7862g;
                        Object I13 = c0216p.I();
                        Object obj6 = obj;
                        if (I13 == obj6) {
                            I13 = "Built-in InterruptionHandlingOffset";
                            c0216p.c0("Built-in InterruptionHandlingOffset");
                        }
                        obj2 = obj6;
                        g0 a5 = s0.a(m0Var2, v0Var3, (String) I13, c0216p, 384, 0);
                        c0216p.q(z4);
                        g0Var2 = a5;
                        tVar3 = tVar2;
                    } else {
                        obj2 = obj;
                        c0216p.S(-820883777);
                        c0216p.q(z4);
                        tVar3 = tVar2;
                        g0Var2 = null;
                    }
                    boolean z10 = ((tVar3 == null || tVar3.f7325d) && ((tVar4 = tVar) == null || tVar4.f7325d) && z9) ? z4 : true;
                    if ((o5.f7268a == null && o4.f7268a == null) ? z4 : true) {
                        c0216p.S(-675389204);
                        v0 v0Var4 = w0.f7856a;
                        Object I14 = c0216p.I();
                        obj3 = obj2;
                        if (I14 == obj3) {
                            I14 = "Built-in alpha";
                            c0216p.c0("Built-in alpha");
                        }
                        z5 = z10;
                        g0Var3 = s0.a(m0Var2, v0Var4, (String) I14, c0216p, 384, 0);
                        c0216p.q(z4);
                    } else {
                        z5 = z10;
                        obj3 = obj2;
                        c0216p.S(-675252433);
                        c0216p.q(z4);
                        g0Var3 = null;
                    }
                    c0216p.S(-675057009);
                    c0216p.q(z4);
                    c0216p.S(-674835793);
                    c0216p.q(z4);
                    C0730F c0730f4 = c0730f2;
                    boolean h6 = c0216p.h(g0Var3) | c0216p.f(c0730f4) | c0216p.f(c0731g2) | c0216p.h(null) | c0216p.f(m0Var2) | c0216p.h(null);
                    Object I15 = c0216p.I();
                    if (h6 || I15 == obj3) {
                        I15 = new x(g0Var3, null, m0Var2, c0730f4, c0731g2, null);
                        c0216p.c0(I15);
                    }
                    x xVar = (x) I15;
                    l lVar = l.f3977a;
                    boolean z11 = z5;
                    boolean g4 = c0216p.g(z11) | c0216p.f(zVar);
                    Object I16 = c0216p.I();
                    if (g4 || I16 == obj3) {
                        I16 = new D0(z11, zVar, 1);
                        c0216p.c0(I16);
                    }
                    o h7 = androidx.compose.ui.graphics.a.a(lVar, (Function1) I16).h(new EnterExitTransitionElement(m0Var2, g0Var, g0Var2, c0730f4, c0731g2, zVar, xVar));
                    c0216p.S(1581766416);
                    c0216p.q(z4);
                    o h8 = oVar.h(h7.h(lVar));
                    Object I17 = c0216p.I();
                    if (I17 == obj3) {
                        I17 = new C0747m(rVar);
                        c0216p.c0(I17);
                    }
                    C0747m c0747m = (C0747m) I17;
                    int i12 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    o d4 = S.a.d(c0216p, h8);
                    InterfaceC1070k.f9822h.getClass();
                    Function0 function0 = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(function0);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, c0747m, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i12))) {
                        AbstractC0017m.r(i12, c0216p, i12, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    aVar.g(rVar, c0216p, Integer.valueOf((i6 >> 18) & 112));
                    c0216p.q(true);
                    c0216p.q(z4);
                }
                c0216p.q(z4);
                s4 = c0216p.s();
                if (s4 == null) {
                    s4.f2903d = new C0748n(m0Var, function1, oVar, c0730f, c0731g, function2, aVar, i2);
                    return;
                }
                return;
            }
            c0216p.S(1790262234);
            c0216p.q(false);
        }
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final w b(m0 m0Var, Function1 function1, Object obj, C0216p c0216p) {
        c0216p.O(-902048200, 0, m0Var, null);
        boolean g4 = m0Var.g();
        w wVar = w.f7338d;
        w wVar2 = w.f7340i;
        w wVar3 = w.f7339e;
        t0 t0Var = m0Var.f7800a;
        if (g4) {
            c0216p.S(2101296683);
            c0216p.q(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                wVar = wVar3;
            } else if (((Boolean) function1.invoke(t0Var.l())).booleanValue()) {
                wVar = wVar2;
            }
        } else {
            c0216p.S(2101530516);
            Object I3 = c0216p.I();
            if (I3 == C0208l.f2826a) {
                I3 = C0192d.K(Boolean.FALSE, W.f2779l);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            if (((Boolean) function1.invoke(t0Var.l())).booleanValue()) {
                interfaceC0191c0.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                wVar = wVar3;
            } else if (((Boolean) interfaceC0191c0.getValue()).booleanValue()) {
                wVar = wVar2;
            }
            c0216p.q(false);
        }
        c0216p.q(false);
        return wVar;
    }
}
