package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import r.C0850L;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0107m {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1658a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1659b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1660c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1661d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final C0850L f1662e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0850L f1663f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0850L f1664g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0850L f1665h;

    static {
        float f3 = 24;
        f1662e = new C0850L(f3, f3, f3, f3);
        float f4 = 16;
        f1663f = androidx.compose.foundation.layout.b.b(f4);
        f1664g = androidx.compose.foundation.layout.b.b(f4);
        f1665h = androidx.compose.foundation.layout.b.b(f3);
    }

    public static final void a(Q.a aVar, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, b0.Q q3, long j3, float f3, long j4, long j5, long j6, long j7, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        U.q qVar2;
        c0167p.S(1522575799);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.h(aVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i5 | 48;
        if ((i3 & 384) == 0) {
            i7 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= c0167p.h(interfaceC0426e2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= c0167p.h(interfaceC0426e3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= c0167p.f(q3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= c0167p.e(j3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= c0167p.c(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= c0167p.e(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i7 |= c0167p.e(j5) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0167p.e(j6) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.e(j7) ? 32 : 16;
        }
        if ((306783379 & i7) == 306783378 && (i6 & 19) == 18 && c0167p.x()) {
            c0167p.L();
            qVar2 = qVar;
        } else {
            U.n nVar = U.n.f4488a;
            int i8 = i7 >> 12;
            r1.a(nVar, q3, j3, 0L, f3, 0.0f, null, Q.f.b(-2126308228, new C0089d(interfaceC0426e, interfaceC0426e2, interfaceC0426e3, j5, j6, j7, j4, aVar), c0167p), c0167p, ((i7 >> 3) & 14) | 12582912 | (i8 & 112) | (i8 & 896) | ((i7 >> 9) & 57344), 104);
            qVar2 = nVar;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0091e(aVar, qVar2, interfaceC0426e, interfaceC0426e2, interfaceC0426e3, q3, j3, f3, j4, j5, j6, j7, i3, i4);
        }
    }

    public static final void b(Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(586821353);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.c(f1660c) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.c(f1661d) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                G3 = new C0095g();
                c0167p.a0(G3);
            }
            InterfaceC0885G interfaceC0885G = (InterfaceC0885G) G3;
            U.n nVar = U.n.f4488a;
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, nVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            int i6 = ((((i4 >> 6) & 14) << 6) & 896) | 6;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, interfaceC0885G);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            aVar.h(c0167p, Integer.valueOf((i6 >> 6) & 14));
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0097h(aVar, i3, 0);
        }
    }

    public static final void c(InterfaceC0422a interfaceC0422a, Q.a aVar, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, b0.Q q3, long j3, long j4, long j5, long j6, float f3, R0.v vVar, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        c0167p.S(-919826268);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.h(interfaceC0426e) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.h(interfaceC0426e2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c0167p.h(interfaceC0426e3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0167p.h(interfaceC0426e4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0167p.f(q3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0167p.e(j3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0167p.e(j4) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0167p.e(j5) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.e(j6) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.c(f3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0167p.f(vVar) ? 2048 : 1024;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            d(interfaceC0422a, qVar, vVar, Q.f.b(-1852840226, new C0101j(interfaceC0426e2, interfaceC0426e3, interfaceC0426e4, q3, j3, f3, j4, j5, j6, interfaceC0426e, aVar), c0167p), c0167p, ((i5 >> 3) & 112) | (i5 & 14) | 3072 | ((i6 >> 3) & 896));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0103k(interfaceC0422a, aVar, qVar, interfaceC0426e, interfaceC0426e2, interfaceC0426e3, interfaceC0426e4, q3, j3, j4, j5, j6, f3, vVar, i3, i4, 0);
        }
    }

    public static final void d(InterfaceC0422a interfaceC0422a, U.q qVar, R0.v vVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1922902937);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(vVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            AbstractC0235a.c(interfaceC0422a, vVar, Q.f.b(905289008, new C0087c(qVar, 1, aVar), c0167p), c0167p, ((i4 >> 3) & 112) | (i4 & 14) | 384);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0105l(interfaceC0422a, qVar, vVar, aVar, i3, 0);
        }
    }
}
