package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import b0.C0352v;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import m.C0610F;
import n.C0694u;
import r.InterfaceC0849K;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final R0.E f1759a = new R0.E(14, true);

    public static final void a(boolean z3, InterfaceC0422a interfaceC0422a, U.q qVar, long j3, n.y0 y0Var, R0.E e3, b0.Q q3, long j4, float f3, float f4, C0694u c0694u, Q.a aVar, C0167p c0167p, int i3, int i4) {
        int i5;
        U.q qVar2;
        long floatToRawIntBits;
        n.y0 t3;
        R0.E e4;
        b0.Q a3;
        float f5;
        float f6;
        int i6;
        long j5;
        C0694u c0694u2;
        R0.E e5;
        U.q qVar3;
        float f7;
        b0.Q q4;
        float f8;
        R0.E e6;
        C0694u c0694u3;
        long j6;
        long j7;
        c0167p.S(1431928300);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.g(z3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        int i7 = i5 | 3456;
        if ((i3 & 24576) == 0) {
            i7 = i5 | 11648;
        }
        int i8 = 196608 | i7;
        if ((1572864 & i3) == 0) {
            i8 = 720896 | i7;
        }
        if ((12582912 & i3) == 0) {
            i8 |= 4194304;
        }
        int i9 = i8 | 905969664;
        int i10 = i4 | 6;
        if ((i4 & 48) == 0) {
            i10 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((306783379 & i9) == 306783378 && (i10 & 19) == 18 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            j6 = j3;
            t3 = y0Var;
            e6 = e3;
            q4 = q3;
            j7 = j4;
            f7 = f3;
            f8 = f4;
            c0694u3 = c0694u;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                qVar2 = U.n.f4488a;
                float f9 = 0;
                floatToRawIntBits = (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
                t3 = n.t0.t(c0167p);
                e4 = f1759a;
                float f10 = AbstractC0125v0.f1834a;
                a3 = n1.a(H.l.f2426b, c0167p);
                long d3 = O.d(37, c0167p);
                f5 = AbstractC0125v0.f1834a;
                f6 = AbstractC0125v0.f1835b;
                i6 = i9 & (-33087489);
                j5 = d3;
                c0694u2 = null;
            } else {
                c0167p.L();
                qVar2 = qVar;
                floatToRawIntBits = j3;
                t3 = y0Var;
                e4 = e3;
                a3 = q3;
                j5 = j4;
                f5 = f3;
                f6 = f4;
                i6 = i9 & (-33087489);
                c0694u2 = c0694u;
            }
            c0167p.q();
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            if (G3 == obj) {
                G3 = new C0610F(Boolean.FALSE);
                c0167p.a0(G3);
            }
            C0610F c0610f = (C0610F) G3;
            c0610f.f6607c.setValue(Boolean.valueOf(z3));
            if (((Boolean) c0610f.f6606b.getValue()).booleanValue() || ((Boolean) c0610f.f6607c.getValue()).booleanValue()) {
                Object G4 = c0167p.G();
                if (G4 == obj) {
                    G4 = C0143d.K(new b0.U(b0.U.f5400b), I.W.f2783i);
                    c0167p.a0(G4);
                }
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G4;
                O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
                e5 = e4;
                boolean f11 = ((i6 & 7168) == 2048) | c0167p.f(bVar);
                Object G5 = c0167p.G();
                if (f11 || G5 == obj) {
                    G5 = new G.d(floatToRawIntBits, bVar, new C0113p(interfaceC0142c0, 0));
                    c0167p.a0(G5);
                }
                R0.n.a((G.d) G5, interfaceC0422a, e5, Q.f.b(2126968933, new C0109n(qVar2, c0610f, interfaceC0142c0, t3, a3, j5, f5, f6, c0694u2, aVar), c0167p), c0167p, ((i6 >> 9) & 896) | (i6 & 112) | 3072, 0);
            } else {
                e5 = e4;
            }
            qVar3 = qVar2;
            f7 = f5;
            q4 = a3;
            f8 = f6;
            e6 = e5;
            c0694u3 = c0694u2;
            j6 = floatToRawIntBits;
            j7 = j5;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0111o(z3, interfaceC0422a, qVar3, j6, t3, e6, q4, j7, f7, f8, c0694u3, aVar, i3, i4);
        }
    }

    public static final void b(Q.a aVar, InterfaceC0422a interfaceC0422a, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, boolean z3, C0127w0 c0127w0, InterfaceC0849K interfaceC0849K, q.k kVar, C0167p c0167p, int i3) {
        int i4;
        boolean z4;
        int i5;
        U.q qVar2;
        InterfaceC0849K interfaceC0849K2;
        InterfaceC0426e interfaceC0426e3;
        InterfaceC0426e interfaceC0426e4;
        q.k kVar2;
        C0127w0 c0127w02;
        U.q qVar3;
        InterfaceC0426e interfaceC0426e5;
        InterfaceC0426e interfaceC0426e6;
        boolean z5;
        C0127w0 c0127w03;
        InterfaceC0849K interfaceC0849K3;
        q.k kVar3;
        c0167p.S(1826340448);
        if ((i3 & 6) == 0) {
            i4 = i3 | (c0167p.h(aVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        int i6 = 224640 | i4;
        if ((i3 & 1572864) == 0) {
            i6 = 748928 | i4;
        }
        int i7 = 113246208 | i6;
        if ((38347923 & i7) == 38347922 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            interfaceC0426e5 = interfaceC0426e;
            interfaceC0426e6 = interfaceC0426e2;
            z5 = z3;
            c0127w03 = c0127w0;
            interfaceC0849K3 = interfaceC0849K;
            kVar3 = kVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                float f3 = AbstractC0125v0.f1834a;
                M m3 = (M) c0167p.k(O.f1301a);
                C0127w0 c0127w04 = m3.f1235O;
                if (c0127w04 == null) {
                    c0127w04 = new C0127w0(O.c(m3, H.k.f2422i), O.c(m3, H.k.f2423j), O.c(m3, H.k.f2424k), C0352v.b(O.c(m3, H.k.f2419f), H.k.f2414a), C0352v.b(O.c(m3, H.k.f2420g), H.k.f2415b), C0352v.b(O.c(m3, H.k.f2421h), H.k.f2416c));
                    m3.f1235O = c0127w04;
                }
                z4 = true;
                i5 = i7 & (-3670017);
                qVar2 = nVar;
                interfaceC0849K2 = AbstractC0125v0.f1836c;
                interfaceC0426e3 = null;
                interfaceC0426e4 = null;
                kVar2 = null;
                c0127w02 = c0127w04;
            } else {
                c0167p.L();
                i5 = i7 & (-3670017);
                qVar2 = qVar;
                interfaceC0426e3 = interfaceC0426e;
                interfaceC0426e4 = interfaceC0426e2;
                z4 = z3;
                c0127w02 = c0127w0;
                interfaceC0849K2 = interfaceC0849K;
                kVar2 = kVar;
            }
            c0167p.q();
            B0.b(aVar, interfaceC0422a, qVar2, interfaceC0426e3, interfaceC0426e4, z4, c0127w02, interfaceC0849K2, kVar2, c0167p, i5 & 268435454);
            qVar3 = qVar2;
            interfaceC0426e5 = interfaceC0426e3;
            interfaceC0426e6 = interfaceC0426e4;
            z5 = z4;
            c0127w03 = c0127w02;
            interfaceC0849K3 = interfaceC0849K2;
            kVar3 = kVar2;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0115q(aVar, interfaceC0422a, qVar3, interfaceC0426e5, interfaceC0426e6, z5, c0127w03, interfaceC0849K3, kVar3, i3, 0);
        }
    }
}
