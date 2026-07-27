package D;

import A.AbstractC0017m;
import A.C0022s;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p.C0935k;
import p0.AbstractC0954O;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import q.InterfaceC1021Z;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;

/* loaded from: classes.dex */
public abstract class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1617a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1618b;

    static {
        long j4 = F.u.f2560l;
        if (u3.l.m0(j4)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        f1618b = u3.l.p0(M0.m.c(j4) / 2, 1095216660480L & j4);
    }

    public static final void a(String str, Function1 function1, S.o oVar, boolean z4, boolean z5, A0.L l4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z6, C0022s c0022s, w.O o4, w.N n2, boolean z7, int i2, int i4, C0935k c0935k, Z.P p4, K1 k12, C0216p c0216p, int i5, int i6, int i7, int i8) {
        int i9;
        A0.L l5;
        boolean z8;
        Z.P a4;
        boolean z9;
        boolean z10;
        C0022s c0022s2;
        boolean z11;
        w.O o5;
        int i10;
        w.N n4;
        Function2 function28;
        Function2 function29;
        Function2 function210;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        C0935k c0935k2;
        boolean z12;
        int i11;
        A0.L l6;
        C0935k c0935k3;
        boolean z13;
        boolean z14;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        Function2 function217;
        Function2 function218;
        Function2 function219;
        boolean z15;
        C0022s c0022s3;
        w.O o6;
        w.N n5;
        boolean z16;
        int i12;
        int i13;
        C0935k c0935k4;
        Z.P p5;
        A0.L l7;
        int i14;
        c0216p.U(-1922450045);
        if ((i5 & 6) == 0) {
            i9 = (c0216p.f(str) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= c0216p.h(function1) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i9 |= c0216p.f(oVar) ? 256 : 128;
        }
        int i15 = i9 | 27648;
        if ((196608 & i5) == 0) {
            if ((i8 & 32) == 0) {
                l5 = l4;
                if (c0216p.f(l5)) {
                    i14 = 131072;
                    i15 |= i14;
                }
            } else {
                l5 = l4;
            }
            i14 = 65536;
            i15 |= i14;
        } else {
            l5 = l4;
        }
        if ((1572864 & i5) == 0) {
            i15 |= c0216p.h(function2) ? 1048576 : 524288;
        }
        int i16 = i15 | 918552576;
        int i17 = i6 | 1797558;
        int i18 = i8 & 131072;
        if (i18 != 0) {
            i17 = i6 | 14380470;
            z8 = z7;
        } else {
            z8 = z7;
            if ((i6 & 12582912) == 0) {
                i17 |= c0216p.g(z8) ? 8388608 : 4194304;
            }
        }
        if ((i6 & 100663296) == 0) {
            i17 |= 33554432;
        }
        int i19 = i17 | 805306368;
        int i20 = i7 | 6;
        if ((i7 & 48) == 0) {
            i20 = i7 | 22;
        }
        if ((i7 & 384) == 0) {
            i20 |= c0216p.f(k12) ? 256 : 128;
        }
        int i21 = i20;
        if ((i16 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i21 & 147) == 146 && c0216p.z()) {
            c0216p.N();
            z14 = z5;
            function214 = function22;
            function215 = function23;
            function216 = function24;
            function217 = function25;
            function218 = function26;
            function219 = function27;
            c0022s3 = c0022s;
            o6 = o4;
            n5 = n2;
            i12 = i2;
            i13 = i4;
            c0935k4 = c0935k;
            p5 = p4;
            l7 = l5;
            z16 = z8;
            z13 = z4;
            z15 = z6;
        } else {
            c0216p.P();
            if ((i5 & 1) == 0 || c0216p.y()) {
                A0.L l8 = (i8 & 32) != 0 ? (A0.L) c0216p.k(N1.f1524a) : l5;
                C0022s c0022s4 = G0.G.f3029a;
                w.O o7 = w.O.f11047g;
                w.N n6 = w.N.f11040g;
                if (i18 != 0) {
                    z8 = false;
                }
                int i22 = z8 ? 1 : Integer.MAX_VALUE;
                L0 l02 = L0.f1475a;
                a4 = AbstractC0146k1.a(3, c0216p);
                z9 = false;
                z10 = false;
                c0022s2 = c0022s4;
                z11 = z8;
                o5 = o7;
                i10 = i22;
                n4 = n6;
                function28 = null;
                function29 = null;
                function210 = null;
                function211 = null;
                function212 = null;
                function213 = null;
                c0935k2 = null;
                z12 = true;
                i11 = 1;
                l6 = l8;
            } else {
                c0216p.N();
                z12 = z4;
                z9 = z5;
                function28 = function22;
                function29 = function23;
                function210 = function24;
                function211 = function25;
                function212 = function26;
                function213 = function27;
                z10 = z6;
                c0022s2 = c0022s;
                o5 = o4;
                n4 = n2;
                i10 = i2;
                i11 = i4;
                c0935k2 = c0935k;
                a4 = p4;
                l6 = l5;
                z11 = z8;
            }
            c0216p.r();
            c0216p.S(30062948);
            if (c0935k2 == null) {
                Object I3 = c0216p.I();
                if (I3 == C0208l.f2826a) {
                    I3 = new C0935k();
                    c0216p.c0(I3);
                }
                c0935k3 = (C0935k) I3;
            } else {
                c0935k3 = c0935k2;
            }
            c0216p.q(false);
            c0216p.S(30069058);
            long b4 = l6.b();
            if (b4 == 16) {
                b4 = !z12 ? k12.f1438c : z10 ? k12.f1439d : ((Boolean) m3.u.e(c0935k3, c0216p, 0).getValue()).booleanValue() ? k12.f1436a : k12.f1437b;
            }
            c0216p.q(false);
            C0192d.a(A.l0.f166a.a(k12.f1446k), O.f.b(-1886965181, new O0(oVar, function2, (M0.b) c0216p.k(AbstractC1144g0.f10218f), z10, k12, str, function1, z12, z9, l6.d(new A0.L(b4, 0L, null, null, 0L, 0, 0L, 16777214)), o5, n4, z11, i10, i11, c0022s2, c0935k3, function28, function29, function210, function211, function212, function213, a4), c0216p), c0216p, 56);
            z13 = z12;
            z14 = z9;
            function214 = function28;
            function215 = function29;
            function216 = function210;
            function217 = function211;
            function218 = function212;
            function219 = function213;
            z15 = z10;
            c0022s3 = c0022s2;
            o6 = o5;
            n5 = n4;
            z16 = z11;
            i12 = i10;
            i13 = i11;
            c0935k4 = c0935k2;
            p5 = a4;
            l7 = l6;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0(str, function1, oVar, z13, z14, l7, function2, function214, function215, function216, function217, function218, function219, z15, c0022s3, o6, n5, z16, i12, i13, c0935k4, p5, k12, i5, i6, i7, i8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r40.I(), java.lang.Integer.valueOf(r3)) == false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function2 function2, O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4, O.a aVar5, O.a aVar6, boolean z4, float f4, Function1 function1, O.a aVar7, O.a aVar8, InterfaceC1021Z interfaceC1021Z, C0216p c0216p, int i2, int i4) {
        int i5;
        int i6;
        InterfaceC1021Z interfaceC1021Z2;
        S.l lVar;
        M0.k kVar;
        int i7;
        ?? r32;
        float f5;
        float f6;
        C1068i c1068i;
        boolean z5;
        S.l lVar2 = S.l.f3977a;
        c0216p.U(1408290209);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(lVar2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c0216p.h(aVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= c0216p.h(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= c0216p.h(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= c0216p.h(aVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= c0216p.h(aVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= c0216p.g(z4) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= c0216p.c(f4) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (c0216p.h(function1) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p.h(aVar7) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0216p.h(aVar8) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            interfaceC1021Z2 = interfaceC1021Z;
            lVar = lVar2;
            i6 |= c0216p.f(interfaceC1021Z2) ? 2048 : 1024;
        } else {
            interfaceC1021Z2 = interfaceC1021Z;
            lVar = lVar2;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean z6 = ((i6 & 14) == 4) | ((234881024 & i5) == 67108864) | ((1879048192 & i5) == 536870912) | ((i6 & 7168) == 2048);
            Object I3 = c0216p.I();
            if (z6 || I3 == C0208l.f2826a) {
                I3 = new U0(function1, z4, f4, interfaceC1021Z2);
                c0216p.c0(I3);
            }
            U0 u02 = (U0) I3;
            M0.k kVar2 = (M0.k) c0216p.k(AbstractC1144g0.f10224l);
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
            C0192d.R(c0216p, u02, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O) {
                kVar = kVar2;
            } else {
                kVar = kVar2;
            }
            AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            aVar7.h(c0216p, Integer.valueOf((i6 >> 3) & 14));
            c0216p.S(250370369);
            S.g gVar = S.b.f3956k;
            if (aVar3 != null) {
                S.o h4 = androidx.compose.ui.layout.a.c(lVar, "Leading").h(E.v.f2259i);
                InterfaceC0945F e4 = AbstractC1035n.e(gVar, false);
                int i9 = c0216p.f2861P;
                i7 = i6;
                InterfaceC0213n0 m5 = c0216p.m();
                S.o d5 = S.a.d(c0216p, h4);
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
                aVar3.h(c0216p, Integer.valueOf((i5 >> 12) & 14));
                c0216p.q(true);
            } else {
                i7 = i6;
            }
            c0216p.q(false);
            c0216p.S(250379492);
            if (aVar4 != null) {
                S.o h5 = androidx.compose.ui.layout.a.c(lVar, "Trailing").h(E.v.f2259i);
                InterfaceC0945F e5 = AbstractC1035n.e(gVar, false);
                int i10 = c0216p.f2861P;
                InterfaceC0213n0 m6 = c0216p.m();
                S.o d6 = S.a.d(c0216p, h5);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i2);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e5, c1067h);
                C0192d.R(c0216p, m6, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i10))) {
                    AbstractC0017m.r(i10, c0216p, i10, c1067h3);
                }
                C0192d.R(c0216p, d6, c1067h4);
                aVar4.h(c0216p, Integer.valueOf((i5 >> 15) & 14));
                c0216p.q(true);
                r32 = 0;
            } else {
                r32 = 0;
            }
            c0216p.q(r32);
            M0.k kVar3 = kVar;
            float e6 = androidx.compose.foundation.layout.b.e(interfaceC1021Z, kVar3);
            float d7 = androidx.compose.foundation.layout.b.d(interfaceC1021Z, kVar3);
            if (aVar3 != null) {
                e6 = kotlin.ranges.b.a(e6 - E.v.f2253c, (float) r32);
            }
            if (aVar4 != null) {
                d7 = kotlin.ranges.b.a(d7 - E.v.f2253c, (float) r32);
            }
            c0216p.S(250410106);
            S.g gVar2 = S.b.f3952d;
            if (aVar5 != null) {
                S.o k4 = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Prefix"), E.v.f2256f, 0.0f, 2)), e6, 0.0f, E.v.f2255e, 10);
                InterfaceC0945F e7 = AbstractC1035n.e(gVar2, false);
                int i11 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                S.o d8 = S.a.d(c0216p, k4);
                c0216p.W();
                f5 = e6;
                if (c0216p.f2860O) {
                    c0216p.l(c1068i2);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e7, c1067h);
                C0192d.R(c0216p, m7, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                    AbstractC0017m.r(i11, c0216p, i11, c1067h3);
                }
                C0192d.R(c0216p, d8, c1067h4);
                aVar5.h(c0216p, Integer.valueOf((i5 >> 18) & 14));
                c0216p.q(true);
            } else {
                f5 = e6;
            }
            c0216p.q(false);
            c0216p.S(250422072);
            if (aVar6 != null) {
                S.o k5 = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Suffix"), E.v.f2256f, 0.0f, 2)), E.v.f2255e, 0.0f, d7, 10);
                InterfaceC0945F e8 = AbstractC1035n.e(gVar2, false);
                int i12 = c0216p.f2861P;
                InterfaceC0213n0 m8 = c0216p.m();
                S.o d9 = S.a.d(c0216p, k5);
                c0216p.W();
                f6 = d7;
                if (c0216p.f2860O) {
                    c0216p.l(c1068i2);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e8, c1067h);
                C0192d.R(c0216p, m8, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i12))) {
                    AbstractC0017m.r(i12, c0216p, i12, c1067h3);
                }
                C0192d.R(c0216p, d9, c1067h4);
                aVar6.h(c0216p, Integer.valueOf((i5 >> 21) & 14));
                c0216p.q(true);
            } else {
                f6 = d7;
            }
            c0216p.q(false);
            float f7 = E.v.f2256f;
            S.o k6 = androidx.compose.foundation.layout.b.k(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.d(lVar, f7, 0.0f, 2)), aVar5 == null ? f5 : 0, 0.0f, aVar6 == null ? f6 : 0, 10);
            c0216p.S(250444361);
            if (aVar != null) {
                aVar.g(androidx.compose.ui.layout.a.c(lVar, "Hint").h(k6), c0216p, Integer.valueOf((i5 >> 3) & 112));
            }
            c0216p.q(false);
            S.o h6 = androidx.compose.ui.layout.a.c(lVar, "TextField").h(k6);
            InterfaceC0945F e9 = AbstractC1035n.e(gVar2, true);
            int i13 = c0216p.f2861P;
            InterfaceC0213n0 m9 = c0216p.m();
            S.o d10 = S.a.d(c0216p, h6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e9, c1067h);
            C0192d.R(c0216p, m9, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i13))) {
                AbstractC0017m.r(i13, c0216p, i13, c1067h3);
            }
            C0192d.R(c0216p, d10, c1067h4);
            function2.h(c0216p, Integer.valueOf((i5 >> 3) & 14));
            c0216p.q(true);
            c0216p.S(250455481);
            if (aVar2 != null) {
                c1068i = c1068i2;
                S.o c4 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.d(lVar, u3.d.N(f7, E.v.f2257g, f4), 0.0f, 2)), "Label");
                InterfaceC0945F e10 = AbstractC1035n.e(gVar2, false);
                int i14 = c0216p.f2861P;
                InterfaceC0213n0 m10 = c0216p.m();
                S.o d11 = S.a.d(c0216p, c4);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e10, c1067h);
                C0192d.R(c0216p, m10, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i14))) {
                    AbstractC0017m.r(i14, c0216p, i14, c1067h3);
                }
                C0192d.R(c0216p, d11, c1067h4);
                aVar2.h(c0216p, Integer.valueOf((i5 >> 9) & 14));
                c0216p.q(true);
            } else {
                c1068i = c1068i2;
            }
            c0216p.q(false);
            c0216p.S(250473414);
            if (aVar8 != null) {
                S.o g4 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Supporting"), E.v.f2258h, 0.0f, 2)), C1.b());
                InterfaceC0945F e11 = AbstractC1035n.e(gVar2, false);
                int i15 = c0216p.f2861P;
                InterfaceC0213n0 m11 = c0216p.m();
                S.o d12 = S.a.d(c0216p, g4);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e11, c1067h);
                C0192d.R(c0216p, m11, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i15))) {
                    AbstractC0017m.r(i15, c0216p, i15, c1067h3);
                }
                C0192d.R(c0216p, d12, c1067h4);
                aVar8.h(c0216p, Integer.valueOf((i7 >> 6) & 14));
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
            s4.f2903d = new Q0(function2, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, z4, f4, function1, aVar7, aVar8, interfaceC1021Z, i2, i4);
        }
    }

    public static final int c(int i2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4, long j4, float f5, InterfaceC1021Z interfaceC1021Z) {
        int[] other = {i9, i5, i6, u3.d.O(f4, i8, 0)};
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 = 0; i11 < 4; i11++) {
            i7 = Math.max(i7, other[i11]);
        }
        float d4 = interfaceC1021Z.d() * f5;
        return Math.max(M0.a.j(j4), Math.max(i2, Math.max(i4, O2.c.a(u3.d.N(d4, Math.max(d4, i8 / 2.0f), f4) + i7 + (interfaceC1021Z.c() * f5)))) + i10);
    }

    public static final int d(int i2, int i4, int i5, int i6, int i7, int i8, int i9, float f4, long j4, float f5, InterfaceC1021Z interfaceC1021Z) {
        int i10 = i5 + i6;
        int max = Math.max(i7 + i10, Math.max(i9 + i10, u3.d.O(f4, i8, 0))) + i2 + i4;
        M0.k kVar = M0.k.f3555d;
        return Math.max(max, Math.max(O2.c.a((i8 + ((interfaceC1021Z.a(kVar) + interfaceC1021Z.b(kVar)) * f5)) * f4), M0.a.k(j4)));
    }

    public static final int e(boolean z4, int i2, int i4, AbstractC0954O abstractC0954O, AbstractC0954O abstractC0954O2) {
        if (z4) {
            i4 = Math.round((1 + 0.0f) * ((i2 - abstractC0954O2.f9006e) / 2.0f));
        }
        return Math.max(i4, E.v.e(abstractC0954O) / 2);
    }
}
