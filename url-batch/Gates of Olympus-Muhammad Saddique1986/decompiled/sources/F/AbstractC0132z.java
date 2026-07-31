package F;

import C0.C0025a;
import G.AbstractC0136c;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0186z;
import I.InterfaceC0164n0;
import b0.C0352v;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.C0635u;
import r.AbstractC0856c;
import r.AbstractC0868o;
import r.C0847I;
import r.InterfaceC0859f;
import r.InterfaceC0860g;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0132z {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1907a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1908b;

    static {
        new C0635u(0.8f, 0.0f, 0.8f, 0.15f);
        float f3 = 4;
        f1907a = f3;
        f1908b = 16 - f3;
    }

    public static final void a(Q.a aVar, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0427f interfaceC0427f, float f3, r.X x3, y1 y1Var, C0167p c0167p, int i3) {
        int i4;
        int i5;
        U.q qVar2;
        InterfaceC0426e interfaceC0426e2;
        InterfaceC0427f interfaceC0427f2;
        float f4;
        r.X c0847i;
        U.q qVar3;
        InterfaceC0426e interfaceC0426e3;
        InterfaceC0427f interfaceC0427f3;
        r.X x4;
        float f5;
        c0167p.S(1952988048);
        if ((i3 & 6) == 0) {
            i4 = i3 | (c0167p.h(aVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i6 = i4 | 28080;
        if ((i3 & 196608) == 0) {
            i6 = 93616 | i4;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= c0167p.f(y1Var) ? 1048576 : 524288;
        }
        int i7 = 12582912 | i6;
        if ((4793491 & i7) == 4793490 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            interfaceC0426e3 = interfaceC0426e;
            interfaceC0427f3 = interfaceC0427f;
            f5 = f3;
            x4 = x3;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                Q.a aVar2 = T.f1358a;
                i5 = i7 & (-458753);
                qVar2 = nVar;
                interfaceC0426e2 = aVar2;
                interfaceC0427f2 = T.f1359b;
                f4 = z1.f1920a;
                c0847i = new C0847I(AbstractC0136c.b(c0167p), AbstractC0856c.f8041g | 16);
            } else {
                c0167p.L();
                i5 = i7 & (-458753);
                qVar2 = qVar;
                interfaceC0426e2 = interfaceC0426e;
                interfaceC0427f2 = interfaceC0427f;
                f4 = f3;
                c0847i = x3;
            }
            c0167p.q();
            int i8 = ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112);
            int i9 = i5 << 6;
            b(qVar2, aVar, B1.a(H.t.f2496b, c0167p), interfaceC0426e2, interfaceC0427f2, (O0.e.a(f4, Float.NaN) || O0.e.a(f4, Float.POSITIVE_INFINITY)) ? z1.f1920a : f4, c0847i, y1Var, c0167p, i8 | (57344 & i9) | (458752 & i9) | (234881024 & i9) | (i9 & 1879048192));
            qVar3 = qVar2;
            interfaceC0426e3 = interfaceC0426e2;
            interfaceC0427f3 = interfaceC0427f2;
            x4 = c0847i;
            f5 = f4;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0118s(aVar, qVar3, interfaceC0426e3, interfaceC0427f3, f5, x4, y1Var, i3);
        }
    }

    public static final void b(U.q qVar, Q.a aVar, C0.K k3, InterfaceC0426e interfaceC0426e, InterfaceC0427f interfaceC0427f, float f3, r.X x3, y1 y1Var, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-342194911);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(k3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.g(true) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.h(interfaceC0427f) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0167p.c(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0167p.f(x3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0167p.f(y1Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= c0167p.f(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i4) == 306783378 && c0167p.x()) {
            c0167p.L();
        } else {
            if (Float.isNaN(f3) || f3 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            int i5 = i4 & 1879048192;
            boolean c2 = (i5 == 536870912) | c0167p.c(O2.d.u(((O0.b) c0167p.k(AbstractC1101g0.f9354f)).J(f3), 0.0f));
            Object G3 = c0167p.G();
            I.W w2 = C0159l.f2829a;
            if (c2 || G3 == w2) {
                G3 = new N(0, 12);
                c0167p.a0(G3);
            }
            C0143d.g((InterfaceC0422a) G3, c0167p);
            boolean z3 = i5 == 536870912;
            Object G4 = c0167p.G();
            if (z3 || G4 == w2) {
                G4 = C0143d.D(new N(0, 13));
                c0167p.a0(G4);
            }
            float floatValue = ((Number) ((I.W0) G4).getValue()).floatValue();
            y1Var.getClass();
            I.W0 a3 = l.M.a(b0.M.v(y1Var.f1902a, y1Var.f1903b, AbstractC0639y.f6911c.a(floatValue)), AbstractC0620e.i(400.0f, null, 5), c0167p);
            Q.a b3 = Q.f.b(1370231018, new C0025a(1, interfaceC0427f), c0167p);
            c0167p.Q(-1193605157);
            U.n nVar = U.n.f4488a;
            c0167p.p(false);
            r1.a(qVar.i(nVar), null, ((C0352v) a3.getValue()).f5441a, 0L, 0.0f, 0.0f, null, Q.f.b(-1943739546, new C0122u(x3, f3, y1Var, aVar, k3, interfaceC0426e, b3), c0167p), c0167p, 12582912, 122);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0124v(qVar, aVar, k3, interfaceC0426e, interfaceC0427f, f3, x3, y1Var, i3);
        }
    }

    public static final void c(U.q qVar, C0120t c0120t, long j3, long j4, long j5, Q.a aVar, C0.K k3, InterfaceC0860g interfaceC0860g, InterfaceC0859f interfaceC0859f, InterfaceC0426e interfaceC0426e, Q.a aVar2, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        c0167p.S(-742442296);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? c0167p.f(c0120t) : c0167p.h(c0120t) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.e(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.e(j4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.e(j5) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0167p.f(k3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0167p.c(1.0f) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0167p.f(interfaceC0860g) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0167p.f(interfaceC0859f) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0167p.d(0) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.g(false) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0167p.h(aVar2) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i5 & 306783379) == 306783378 && (i7 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && c0167p.h(c0120t))) | ((1879048192 & i5) == 536870912) | ((234881024 & i5) == 67108864) | ((i7 & 14) == 4);
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                G3 = new C0128x(c0120t, interfaceC0859f, interfaceC0860g);
                c0167p.a0(G3);
            }
            InterfaceC0885G interfaceC0885G = (InterfaceC0885G) G3;
            int i8 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, qVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, interfaceC0885G);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i8))) {
                A.k.o(i8, c0167p, i8, c0995h3);
            }
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            U.n nVar = U.n.f4488a;
            U.q c2 = androidx.compose.ui.layout.a.c(nVar, "navigationIcon");
            float f3 = f1907a;
            U.q i9 = androidx.compose.foundation.layout.b.i(c2, f3, 0.0f, 0.0f, 14);
            U.i iVar = U.b.f4461d;
            int i10 = i5;
            InterfaceC0885G e3 = AbstractC0868o.e(iVar, false);
            int i11 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d4 = U.a.d(c0167p, i9);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e3);
            C0143d.R(c0167p, c0995h2, m4);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i11))) {
                A.k.o(i11, c0167p, i11, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d4);
            C0186z c0186z = V.f1382a;
            C0143d.a(c0186z.a(new C0352v(j3)), interfaceC0426e, c0167p, ((i7 >> 3) & 112) | 8);
            c0167p.p(true);
            U.q b3 = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.b.h(androidx.compose.ui.layout.a.c(nVar, "title"), f3, 0.0f, 2).i(nVar), 1.0f, 0.0f, null, false, 131067);
            InterfaceC0885G e4 = AbstractC0868o.e(iVar, false);
            int i12 = c0167p.f2864P;
            InterfaceC0164n0 m5 = c0167p.m();
            U.q d5 = U.a.d(c0167p, b3);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e4);
            C0143d.R(c0167p, c0995h2, m5);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i12))) {
                A.k.o(i12, c0167p, i12, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d5);
            int i13 = i10 >> 9;
            AbstractC0136c.a(j4, k3, aVar, c0167p, (i13 & 14) | ((i10 >> 15) & 112) | (i13 & 896));
            c0167p.p(true);
            U.q i14 = androidx.compose.foundation.layout.b.i(androidx.compose.ui.layout.a.c(nVar, "actionIcons"), 0.0f, 0.0f, f3, 11);
            InterfaceC0885G e5 = AbstractC0868o.e(iVar, false);
            int i15 = c0167p.f2864P;
            InterfaceC0164n0 m6 = c0167p.m();
            U.q d6 = U.a.d(c0167p, i14);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e5);
            C0143d.R(c0167p, c0995h2, m6);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i15))) {
                A.k.o(i15, c0167p, i15, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d6);
            C0143d.a(c0186z.a(new C0352v(j5)), aVar2, c0167p, ((i7 >> 6) & 112) | 8);
            c0167p.p(true);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0130y(qVar, c0120t, j3, j4, j5, aVar, k3, interfaceC0860g, interfaceC0859f, interfaceC0426e, aVar2, i3, i4);
        }
    }
}
