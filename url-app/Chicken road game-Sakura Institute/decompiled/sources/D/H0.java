package D;

import A.AbstractC0017m;
import A0.C0030a;
import G.C0192d;
import G.C0199g0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.AbstractC0782h;
import l.InterfaceC0799z;
import p.C0935k;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1035n;
import q.C1018W;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;

/* loaded from: classes.dex */
public abstract class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1307a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1308b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1309c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1310d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1311e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f1312f;

    static {
        float f4 = F.o.f2446a;
        f1307a = F.o.f2448c;
        f1308b = 8;
        f1309c = 4;
        float f5 = F.o.f2447b;
        float f6 = F.o.f2449d;
        float f7 = 2;
        f1310d = (f5 - f6) / f7;
        f1311e = (F.o.f2446a - f6) / f7;
        f1312f = 12;
    }

    public static final void a(S.o oVar, long j4, long j5, float f4, q.m0 m0Var, O.a aVar, C0216p c0216p, int i2) {
        S.o oVar2;
        int i4;
        float f5;
        q.m0 c1018w;
        float f6;
        q.m0 m0Var2;
        c0216p.U(1596802123);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 |= c0216p.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.e(j5) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        if ((i2 & 24576) == 0) {
            i6 = i5 | 11264;
        }
        if ((196608 & i2) == 0) {
            i6 |= c0216p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && c0216p.z()) {
            c0216p.N();
            oVar2 = oVar;
            f6 = f4;
            m0Var2 = m0Var;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                oVar2 = S.l.f3977a;
                i4 = i6 & (-57345);
                f5 = AbstractC0179w0.f2076a;
                c1018w = new C1018W(E.a.b(c0216p), 32 | AbstractC1024c.f9246g);
            } else {
                c0216p.N();
                int i7 = i6 & (-57345);
                f5 = f4;
                c1018w = m0Var;
                i4 = i7;
                oVar2 = oVar;
            }
            c0216p.r();
            int i8 = (i4 & 14) | 12582912;
            int i9 = i4 << 3;
            AbstractC0161p1.a(oVar2, null, j4, j5, f5, 0.0f, null, O.f.b(105663120, new C0120c(c1018w, 4, aVar), c0216p), c0216p, i8 | (i9 & 896) | (i9 & 7168) | (i9 & 57344), 98);
            f6 = f5;
            m0Var2 = c1018w;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0183y0(oVar2, j4, j5, f6, m0Var2, aVar, i2);
        }
    }

    public static final void b(q.g0 g0Var, boolean z4, Function0 function0, O.a aVar, S.o oVar, boolean z5, Function2 function2, boolean z6, C0181x0 c0181x0, C0935k c0935k, C0216p c0216p, int i2) {
        int i4;
        S.o oVar2;
        C0935k c0935k2;
        boolean z7;
        boolean z8;
        C0935k c0935k3;
        boolean z9;
        O.a b4;
        boolean z10;
        S.o oVar3;
        boolean z11;
        c0216p.U(-663510974);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(g0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(aVar) ? 2048 : 1024;
        }
        int i5 = i4 | 221184;
        if ((1572864 & i2) == 0) {
            i5 |= c0216p.h(function2) ? 1048576 : 524288;
        }
        int i6 = i5 | 12582912;
        if ((100663296 & i2) == 0) {
            i6 |= c0216p.f(c0181x0) ? 67108864 : 33554432;
        }
        int i7 = i6 | 805306368;
        if ((i7 & 306783379) == 306783378 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            z10 = z5;
            z11 = z6;
            c0935k2 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                oVar2 = S.l.f3977a;
                c0935k2 = null;
                z7 = true;
                z8 = true;
            } else {
                c0216p.N();
                oVar2 = oVar;
                z7 = z5;
                z8 = z6;
                c0935k2 = c0935k;
            }
            c0216p.r();
            c0216p.S(-103235253);
            Object obj = C0208l.f2826a;
            if (c0935k2 == null) {
                Object I3 = c0216p.I();
                if (I3 == obj) {
                    I3 = new C0935k();
                    c0216p.c0(I3);
                }
                c0935k3 = (C0935k) I3;
            } else {
                c0935k3 = c0935k2;
            }
            c0216p.q(false);
            C0935k c0935k4 = c0935k3;
            boolean z12 = z7;
            O.a b5 = O.f.b(-1419576100, new B0(c0181x0, z4, z12, function2, z8, aVar), c0216p);
            c0216p.S(-103209106);
            if (function2 == null) {
                z9 = z12;
                b4 = null;
            } else {
                z9 = z12;
                b4 = O.f.b(1644987592, new C0(c0181x0, z4, z9, function2), c0216p);
            }
            c0216p.q(false);
            Object I4 = c0216p.I();
            if (I4 == obj) {
                I4 = C0192d.J(0);
                c0216p.c0(I4);
            }
            C0199g0 c0199g0 = (C0199g0) I4;
            int i8 = 1;
            S.o a4 = g0Var.a(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.selection.b.a(oVar2, z4, c0935k4, null, z9, new y0.f(4), function0), Float.NaN, f1307a), true);
            Object I5 = c0216p.I();
            if (I5 == obj) {
                I5 = new A.g0(i8, c0199g0);
                c0216p.c0(I5);
            }
            S.o e4 = androidx.compose.ui.layout.a.e(a4, (Function1) I5);
            InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3956k, true);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, e4);
            InterfaceC1070k.f9822h.getClass();
            Function0 function02 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e5, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            float f4 = z4 ? 1.0f : 0.0f;
            InterfaceC0799z j4 = AbstractC0779e.j(100, 0, null, 6);
            if (j4 == AbstractC0782h.f7765a) {
                c0216p.S(1125598679);
                boolean c4 = c0216p.c(0.01f);
                Object I6 = c0216p.I();
                if (c4 || I6 == obj) {
                    I6 = AbstractC0779e.i(0.0f, Float.valueOf(0.01f), 3);
                    c0216p.c0(I6);
                }
                c0216p.q(false);
                j4 = (l.X) I6;
            } else {
                c0216p.S(1125708605);
                c0216p.q(false);
            }
            boolean z13 = z9;
            G.X0 b6 = AbstractC0782h.b(Float.valueOf(f4), l.w0.f7856a, j4, Float.valueOf(0.01f), "FloatAnimation", null, c0216p, 0, 0);
            long c5 = AbstractC0345a.c((c0199g0.d() - r6.l(F.o.f2447b)) / 2, ((M0.b) c0216p.k(AbstractC1144g0.f10218f)).L(f1312f));
            Unit unit = Unit.f7487a;
            boolean f5 = c0216p.f(c0935k4) | c0216p.e(c5);
            Object I7 = c0216p.I();
            if (f5 || I7 == obj) {
                I7 = new E.f(c0935k4, c5);
                c0216p.c0(I7);
            }
            O.a b7 = O.f.b(691730997, new C0030a(i8, (E.f) I7), c0216p);
            O.a b8 = O.f.b(-474426875, new C0120c(b6, 5, c0181x0), c0216p);
            boolean f6 = c0216p.f(b6);
            Object I8 = c0216p.I();
            if (f6 || I8 == obj) {
                I8 = new A.K(b6, 1);
                c0216p.c0(I8);
            }
            c(b7, b8, b5, b4, z8, (Function0) I8, c0216p, ((i7 >> 9) & 57344) | 438);
            c0216p.q(true);
            z10 = z13;
            oVar3 = oVar2;
            z11 = z8;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new A0(g0Var, z4, function0, aVar, oVar3, z10, function2, z11, c0181x0, c0935k2, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r26.I(), java.lang.Integer.valueOf(r15)) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4, boolean z4, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        int i5;
        boolean z5;
        C1068i c1068i;
        c0216p.U(-1427075886);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(aVar4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.g(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(function0) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            int i6 = 458752 & i4;
            int i7 = 57344 & i4;
            boolean z6 = (i6 == 131072) | ((i4 & 7168) == 2048) | (i7 == 16384);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            if (z6 || I3 == w4) {
                I3 = new E0(function0, aVar4, z4);
                c0216p.c0(I3);
            }
            InterfaceC0945F interfaceC0945F = (InterfaceC0945F) I3;
            S.l lVar = S.l.f3977a;
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, lVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i2 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, interfaceC0945F, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O) {
                i5 = i6;
            } else {
                i5 = i6;
            }
            AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            aVar.h(c0216p, Integer.valueOf(i4 & 14));
            aVar2.h(c0216p, Integer.valueOf((i4 >> 3) & 14));
            S.o c4 = androidx.compose.ui.layout.a.c(lVar, "icon");
            S.g gVar = S.b.f3952d;
            InterfaceC0945F e4 = AbstractC1035n.e(gVar, false);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, c4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            aVar3.h(c0216p, Integer.valueOf((i4 >> 6) & 14));
            c0216p.q(true);
            c0216p.S(1087198243);
            if (aVar4 != null) {
                S.o c5 = androidx.compose.ui.layout.a.c(lVar, "label");
                boolean z7 = (i7 == 16384) | (i5 == 131072);
                Object I4 = c0216p.I();
                if (z7 || I4 == w4) {
                    c1068i = c1068i2;
                    I4 = new D0(z4, function0, 0);
                    c0216p.c0(I4);
                } else {
                    c1068i = c1068i2;
                }
                S.o j4 = androidx.compose.foundation.layout.b.j(androidx.compose.ui.graphics.a.a(c5, (Function1) I4), f1308b / 2, 0.0f, 2);
                InterfaceC0945F e5 = AbstractC1035n.e(gVar, false);
                int i10 = c0216p.f2861P;
                InterfaceC0213n0 m6 = c0216p.m();
                S.o d6 = S.a.d(c0216p, j4);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e5, c1067h);
                C0192d.R(c0216p, m6, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i10))) {
                    AbstractC0017m.r(i10, c0216p, i10, c1067h3);
                }
                C0192d.R(c0216p, d6, c1067h4);
                aVar4.h(c0216p, Integer.valueOf((i4 >> 9) & 14));
                z5 = true;
                c0216p.q(true);
            } else {
                z5 = true;
            }
            c0216p.q(false);
            c0216p.q(z5);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0157o0(aVar, aVar2, aVar3, aVar4, z4, function0, i2);
        }
    }
}
