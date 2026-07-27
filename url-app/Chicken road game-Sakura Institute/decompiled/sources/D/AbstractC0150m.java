package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import a.AbstractC0345a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0150m {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1888a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1889b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1890c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1891d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final q.a0 f1892e;

    /* renamed from: f, reason: collision with root package name */
    public static final q.a0 f1893f;

    /* renamed from: g, reason: collision with root package name */
    public static final q.a0 f1894g;

    /* renamed from: h, reason: collision with root package name */
    public static final q.a0 f1895h;

    static {
        float f4 = 24;
        f1892e = new q.a0(f4, f4, f4, f4);
        float f5 = 16;
        f1893f = androidx.compose.foundation.layout.b.c(f5);
        f1894g = androidx.compose.foundation.layout.b.c(f5);
        f1895h = androidx.compose.foundation.layout.b.c(f4);
    }

    public static final void a(O.a aVar, S.o oVar, Function2 function2, Function2 function22, Function2 function23, Z.P p4, long j4, float f4, long j5, long j6, long j7, long j8, C0216p c0216p, int i2, int i4) {
        int i5;
        int i6;
        S.o oVar2;
        c0216p.U(1522575799);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(aVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i5 | 48;
        if ((i2 & 384) == 0) {
            i7 |= c0216p.h(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= c0216p.h(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= c0216p.h(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i7 |= c0216p.f(p4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i7 |= c0216p.e(j4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= c0216p.c(f4) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i7 |= c0216p.e(j5) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i7 |= c0216p.e(j6) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0216p.e(j7) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p.e(j8) ? 32 : 16;
        }
        if ((306783379 & i7) == 306783378 && (i6 & 19) == 18 && c0216p.z()) {
            c0216p.N();
            oVar2 = oVar;
        } else {
            S.l lVar = S.l.f3977a;
            int i8 = i7 >> 12;
            AbstractC0161p1.a(lVar, p4, j4, 0L, f4, 0.0f, null, O.f.b(-2126308228, new C0123d(function2, function22, function23, j6, j7, j8, j5, aVar), c0216p), c0216p, ((i7 >> 3) & 14) | 12582912 | (i8 & 112) | (i8 & 896) | ((i7 >> 9) & 57344), 104);
            oVar2 = lVar;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0126e(aVar, oVar2, function2, function22, function23, p4, j4, f4, j5, j6, j7, j8, i2, i4);
        }
    }

    public static final void b(O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(586821353);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.c(f1890c) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.c(f1891d) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean z4 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object I3 = c0216p.I();
            if (z4 || I3 == C0208l.f2826a) {
                I3 = new D(1);
                c0216p.c0(I3);
            }
            InterfaceC0945F interfaceC0945F = (InterfaceC0945F) I3;
            S.l lVar = S.l.f3977a;
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, lVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            int i6 = ((((i4 >> 6) & 14) << 6) & 896) | 6;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, interfaceC0945F, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            aVar.h(c0216p, Integer.valueOf((i6 >> 6) & 14));
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0132g(aVar, i2, 0);
        }
    }

    public static final void c(Function0 function0, O.a aVar, S.o oVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Z.P p4, long j4, long j5, long j6, long j7, float f4, P0.w wVar, C0216p c0216p, int i2, int i4) {
        int i5;
        int i6;
        c0216p.U(-919826268);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c0216p.h(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= c0216p.h(function22) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= c0216p.h(function23) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= c0216p.h(function24) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= c0216p.f(p4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= c0216p.e(j4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= c0216p.e(j5) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0216p.e(j6) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p.e(j7) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0216p.c(f4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0216p.f(wVar) ? 2048 : 1024;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            d(function0, oVar, wVar, O.f.b(-1852840226, new C0138i(function22, function23, function24, p4, j4, f4, j5, j6, j7, function2, aVar), c0216p), c0216p, ((i5 >> 3) & 112) | (i5 & 14) | 3072 | ((i6 >> 3) & 896));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0141j(function0, aVar, oVar, function2, function22, function23, function24, p4, j4, j5, j6, j7, f4, wVar, i2, i4);
        }
    }

    public static final void d(Function0 function0, S.o oVar, P0.w wVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1922902937);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(wVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC0345a.a(function0, wVar, O.f.b(905289008, new C0120c(oVar, 1, aVar), c0216p), c0216p, ((i4 >> 3) & 112) | (i4 & 14) | 384);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0147l(function0, oVar, wVar, aVar, i2, 0);
        }
    }
}
