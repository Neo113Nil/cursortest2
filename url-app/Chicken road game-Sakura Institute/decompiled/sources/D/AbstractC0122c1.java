package D;

import A.C0028y;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p0.AbstractC0960V;
import q0.C1055h;
import s0.C1157n;

/* renamed from: D.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0122c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1731a = 16;

    public static final void a(S.o oVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i2, long j4, long j5, q.m0 m0Var, O.a aVar, C0216p c0216p, int i4) {
        S.o oVar2;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        long j6;
        long b4;
        q.m0 b5;
        int i5;
        Function2 function28;
        Function2 function29;
        Function2 function210;
        int i6;
        long j7;
        long j8;
        q.m0 m0Var2;
        S.o oVar3;
        c0216p.U(-1219521777);
        int i7 = i4 | 54;
        if ((i4 & 384) == 0) {
            i7 |= c0216p.h(function22) ? 256 : 128;
        }
        int i8 = 224256 | i7;
        if ((1572864 & i4) == 0) {
            i8 = 748544 | i7;
        }
        if ((12582912 & i4) == 0) {
            i8 |= 4194304;
        }
        if ((100663296 & i4) == 0) {
            i8 |= 33554432;
        }
        if ((805306368 & i4) == 0) {
            i8 |= c0216p.h(aVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            function28 = function2;
            function29 = function23;
            function210 = function24;
            i6 = i2;
            j7 = j4;
            j8 = j5;
            m0Var2 = m0Var;
        } else {
            c0216p.P();
            if ((i4 & 1) == 0 || c0216p.y()) {
                S.l lVar = S.l.f3977a;
                O.a aVar2 = P.f1561a;
                O.a aVar3 = P.f1562b;
                O.a aVar4 = P.f1563c;
                long j9 = ((K) c0216p.k(M.f1481a)).f1387n;
                oVar2 = lVar;
                function25 = aVar2;
                function26 = aVar3;
                function27 = aVar4;
                j6 = j9;
                b4 = M.b(j9, c0216p);
                b5 = E.a.b(c0216p);
                i5 = 2;
            } else {
                c0216p.N();
                oVar2 = oVar;
                function25 = function2;
                function26 = function23;
                function27 = function24;
                i5 = i2;
                j6 = j4;
                b4 = j5;
                b5 = m0Var;
            }
            c0216p.r();
            boolean f4 = c0216p.f(b5);
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            if (f4 || I3 == obj) {
                I3 = new E.g(b5);
                c0216p.c0(I3);
            }
            E.g gVar = (E.g) I3;
            boolean f5 = c0216p.f(gVar) | c0216p.f(b5);
            Object I4 = c0216p.I();
            if (f5 || I4 == obj) {
                I4 = new C0028y(gVar, 3, b5);
                c0216p.c0(I4);
            }
            C1055h c1055h = q.q0.f9327a;
            S.o oVar4 = oVar2;
            AbstractC0161p1.a(S.a.b(oVar2, C1157n.f10272m, new A.i0(4, (Function1) I4)), null, j6, b4, 0.0f, 0.0f, null, O.f.b(-1979205334, new B(i5, function25, aVar, function26, function27, gVar, function22), c0216p), c0216p, 12582912, 114);
            function28 = function25;
            function29 = function26;
            function210 = function27;
            i6 = i5;
            j7 = j6;
            j8 = b4;
            m0Var2 = b5;
            oVar3 = oVar4;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new Z0(oVar3, function28, function22, function29, function210, i6, j7, j8, m0Var2, aVar, i4);
        }
    }

    public static final void b(int i2, Function2 function2, O.a aVar, Function2 function22, Function2 function23, q.m0 m0Var, Function2 function24, C0216p c0216p, int i4) {
        int i5;
        c0216p.U(-975511942);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0216p.h(function22) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0216p.h(function23) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0216p.f(m0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0216p.h(function24) ? 1048576 : 524288;
        }
        if ((i5 & 599187) == 599186 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean z4 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((3670016 & i5) == 1048576) | ((i5 & 896) == 256);
            Object I3 = c0216p.I();
            if (z4 || I3 == C0208l.f2826a) {
                I3 = new B(function2, function22, function23, i2, m0Var, function24, aVar, 3);
                c0216p.c0(I3);
            }
            AbstractC0960V.b(null, (Function2) I3, c0216p, 0, 1);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0119b1(i2, function2, aVar, function22, function23, m0Var, function24, i4);
        }
    }
}
