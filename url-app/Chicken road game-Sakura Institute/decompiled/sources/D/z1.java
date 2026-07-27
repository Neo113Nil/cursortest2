package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import Z.C0323u;
import a0.AbstractC0348c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.AbstractC0798y;
import p.C0935k;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2126a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2127b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2128c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2129d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2130e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2131f;

    static {
        float f4 = F.r.f2498a;
        f2126a = F.r.f2499b;
        f2127b = 72;
        f2128c = 16;
        f2129d = 14;
        f2130e = 6;
        f2131f = u3.l.k0(20);
    }

    public static final void a(boolean z4, Function0 function0, S.o oVar, boolean z5, long j4, long j5, C0935k c0935k, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-202735880);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.g(z5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.e(j4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.e(j5) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= c0216p.f(c0935k) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= c0216p.h(aVar) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if ((i5 & 4793491) == 4793490 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) != 0 && !c0216p.y()) {
                c0216p.N();
            }
            c0216p.r();
            int i6 = i5 >> 12;
            c(j4, j5, z4, O.f.b(-551896140, new C0172t1(oVar, z4, c0935k, X0.a(true, 0.0f, j4, c0216p, ((i5 >> 6) & 896) | 6, 2), z5, function0, aVar), c0216p), c0216p, (i6 & 112) | (i6 & 14) | 3072 | ((i5 << 6) & 896));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0175u1(z4, function0, oVar, z5, j4, j5, c0935k, aVar, i2);
        }
    }

    public static final void b(boolean z4, Function0 function0, S.o oVar, boolean z5, Function2 function2, Function2 function22, long j4, long j5, C0935k c0935k, C0216p c0216p, int i2) {
        int i4;
        int i5;
        S.o oVar2;
        boolean z6;
        Function2 function23;
        C0935k c0935k2;
        long j6;
        long j7;
        Function2 function24;
        long j8;
        long j9;
        C0935k c0935k3;
        c0216p.U(-350627181);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i6 = i4 | 3456;
        if ((i2 & 24576) == 0) {
            i6 |= c0216p.h(function2) ? 16384 : 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i2) == 0) {
            i7 = 720896 | i6;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= 4194304;
        }
        int i8 = i7 | 100663296;
        if ((38347923 & i8) == 38347922 && c0216p.z()) {
            c0216p.N();
            oVar2 = oVar;
            z6 = z5;
            function24 = function22;
            j8 = j4;
            j9 = j5;
            c0935k3 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                i5 = i8 & (-33030145);
                oVar2 = S.l.f3977a;
                z6 = true;
                function23 = null;
                c0935k2 = null;
                j6 = ((C0323u) c0216p.k(S.f1616a)).f4549a;
                j7 = j6;
            } else {
                c0216p.N();
                i5 = i8 & (-33030145);
                oVar2 = oVar;
                z6 = z5;
                function23 = function22;
                j6 = j4;
                j7 = j5;
                c0935k2 = c0935k;
            }
            c0216p.r();
            c0216p.S(79583089);
            O.a b4 = function2 != null ? O.f.b(708874428, new C0117b(function2, 3), c0216p) : null;
            c0216p.q(false);
            a(z4, function0, oVar2, z6, j6, j7, c0935k2, O.f.b(1540996038, new A.J(b4, 1, function23), c0216p), c0216p, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i5 >> 6) & 3670016));
            function24 = function23;
            j8 = j6;
            j9 = j7;
            c0935k3 = c0935k2;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0169s1(z4, function0, oVar2, z6, function2, function24, j8, j9, c0935k3, i2);
        }
    }

    public static final void c(long j4, long j5, boolean z4, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        long j6;
        boolean z5;
        boolean z6;
        l.u0 j7;
        c0216p.U(735731848);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.e(j4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.e(j5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.g(z4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            int i5 = i4 >> 6;
            l.m0 c4 = l.s0.c(Boolean.valueOf(z4), null, c0216p, i5 & 14, 2);
            C0205j0 c0205j0 = c4.f7803d;
            boolean booleanValue = ((Boolean) c0205j0.getValue()).booleanValue();
            c0216p.S(-1997025499);
            long j8 = booleanValue ? j4 : j5;
            c0216p.q(false);
            AbstractC0348c f4 = C0323u.f(j8);
            boolean f5 = c0216p.f(f4);
            Object I3 = c0216p.I();
            if (f5 || I3 == C0208l.f2826a) {
                k.u uVar = k.u.f7326e;
                A.g0 g0Var = new A.g0(15, f4);
                l.v0 v0Var = l.w0.f7856a;
                l.v0 v0Var2 = new l.v0(uVar, g0Var);
                c0216p.c0(v0Var2);
                I3 = v0Var2;
            }
            l.v0 v0Var3 = (l.v0) I3;
            boolean booleanValue2 = ((Boolean) c4.f7800a.l()).booleanValue();
            c0216p.S(-1997025499);
            if (booleanValue2) {
                z5 = false;
                j6 = j4;
            } else {
                j6 = j5;
                z5 = false;
            }
            c0216p.q(z5);
            C0323u c0323u = new C0323u(j6);
            boolean booleanValue3 = ((Boolean) c0205j0.getValue()).booleanValue();
            c0216p.S(-1997025499);
            long j9 = booleanValue3 ? j4 : j5;
            c0216p.q(false);
            C0323u c0323u2 = new C0323u(j9);
            l.h0 f6 = c4.f();
            c0216p.S(-899623535);
            if (f6.a(Boolean.FALSE, Boolean.TRUE)) {
                j7 = new l.u0(150, 100, AbstractC0798y.f7866b);
                z6 = false;
            } else {
                z6 = false;
                j7 = AbstractC0779e.j(100, 0, AbstractC0798y.f7866b, 2);
            }
            c0216p.q(z6);
            C0192d.a(S.f1616a.a(new C0323u(((C0323u) l.s0.b(c4, c0323u, c0323u2, j7, v0Var3, c0216p, 0).f7778p.getValue()).f4549a)), aVar, c0216p, (i5 & 112) | 8);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new y1(j4, j5, z4, aVar, i2);
        }
    }

    public static final void d(O.a aVar, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        int i5;
        boolean z4;
        c0216p.U(514131524);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            int i6 = i4 & 14;
            boolean z5 = (i6 == 4) | ((i4 & 112) == 32);
            Object I3 = c0216p.I();
            if (z5 || I3 == C0208l.f2826a) {
                I3 = new w1(aVar, 0, function2);
                c0216p.c0(I3);
            }
            InterfaceC0945F interfaceC0945F = (InterfaceC0945F) I3;
            S.l lVar = S.l.f3977a;
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, lVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, interfaceC0945F, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            c0216p.S(871566271);
            S.g gVar = S.b.f3952d;
            if (aVar != null) {
                S.o j4 = androidx.compose.foundation.layout.b.j(androidx.compose.ui.layout.a.c(lVar, "text"), f2128c, 0.0f, 2);
                InterfaceC0945F e4 = AbstractC1035n.e(gVar, false);
                int i8 = c0216p.f2861P;
                InterfaceC0213n0 m5 = c0216p.m();
                S.o d5 = S.a.d(c0216p, j4);
                c0216p.W();
                i5 = i4;
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e4, c1067h);
                C0192d.R(c0216p, m5, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                    AbstractC0017m.r(i8, c0216p, i8, c1067h3);
                }
                C0192d.R(c0216p, d5, c1067h4);
                aVar.h(c0216p, Integer.valueOf(i6));
                c0216p.q(true);
            } else {
                i5 = i4;
            }
            c0216p.q(false);
            c0216p.S(871570579);
            if (function2 != null) {
                S.o c4 = androidx.compose.ui.layout.a.c(lVar, "icon");
                InterfaceC0945F e5 = AbstractC1035n.e(gVar, false);
                int i9 = c0216p.f2861P;
                InterfaceC0213n0 m6 = c0216p.m();
                S.o d6 = S.a.d(c0216p, c4);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e5, c1067h);
                C0192d.R(c0216p, m6, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                    AbstractC0017m.r(i9, c0216p, i9, c1067h3);
                }
                C0192d.R(c0216p, d6, c1067h4);
                function2.h(c0216p, Integer.valueOf((i5 >> 3) & 14));
                z4 = true;
                c0216p.q(true);
            } else {
                z4 = true;
            }
            c0216p.q(false);
            c0216p.q(z4);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 0, aVar, function2);
        }
    }
}
