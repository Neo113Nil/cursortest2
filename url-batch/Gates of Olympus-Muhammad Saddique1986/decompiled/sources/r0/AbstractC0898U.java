package r0;

import B.C0000a;
import F.v1;
import I.C0143d;
import I.C0159l;
import I.C0163n;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import n.z0;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t0.b0;

/* renamed from: r0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898U {

    /* renamed from: a, reason: collision with root package name */
    public static final C0888J f8139a = new C0888J(4);

    public static final long a(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = AbstractC0897T.f8138b;
        return floatToRawIntBits;
    }

    public static final void b(U.q qVar, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        c0167p.S(-1298353104);
        int i4 = i3 | 6;
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            qVar = U.n.f4488a;
            Object G3 = c0167p.G();
            if (G3 == C0159l.f2829a) {
                G3 = new C0901X(C0888J.f8119e);
                c0167p.a0(G3);
            }
            c((C0901X) G3, qVar, interfaceC0426e, c0167p, (i4 << 3) & 1008);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 6, qVar, interfaceC0426e);
        }
    }

    public static final void c(C0901X c0901x, U.q qVar, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-511989831);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(c0901x) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            int i5 = c0167p.f2864P;
            C0163n M3 = C0143d.M(c0167p);
            U.q d3 = U.a.d(c0167p, qVar);
            InterfaceC0164n0 m3 = c0167p.m();
            C1001n c1001n = C1001n.f8773g;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0901x.f8144c, c0901x);
            C0143d.R(c0167p, c0901x.f8145d, M3);
            C0143d.R(c0167p, c0901x.f8146e, interfaceC0426e);
            InterfaceC0997j.f8759c.getClass();
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0143d.R(c0167p, C0996i.f8755c, d3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            c0167p.p(true);
            if (c0167p.x()) {
                c0167p.Q(-26502501);
                c0167p.p(false);
            } else {
                c0167p.Q(-26580342);
                boolean h3 = c0167p.h(c0901x);
                Object G3 = c0167p.G();
                if (h3 || G3 == C0159l.f2829a) {
                    G3 = new A.h(27, c0901x);
                    c0167p.a0(G3);
                }
                C0143d.g((InterfaceC0422a) G3, c0167p);
                c0167p.p(false);
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(c0901x, qVar, interfaceC0426e, i3, 5);
        }
    }

    public static final C0239d d(InterfaceC0919p interfaceC0919p) {
        InterfaceC0919p v3 = interfaceC0919p.v();
        return v3 != null ? v3.B(interfaceC0919p, true) : new C0239d(0.0f, 0.0f, (int) (interfaceC0919p.I() >> 32), (int) (interfaceC0919p.I() & 4294967295L));
    }

    public static final C0239d e(InterfaceC0919p interfaceC0919p) {
        InterfaceC0919p g3 = g(interfaceC0919p);
        float I3 = (int) (g3.I() >> 32);
        float I4 = (int) (g3.I() & 4294967295L);
        C0239d B3 = g(interfaceC0919p).B(interfaceC0919p, true);
        float f3 = B3.f4724a;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > I3) {
            f3 = I3;
        }
        float f4 = B3.f4725b;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > I4) {
            f4 = I4;
        }
        float f5 = B3.f4726c;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= I3) {
            I3 = f5;
        }
        float f6 = B3.f4727d;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 <= I4) {
            I4 = f7;
        }
        if (f3 == I3 || f4 == I4) {
            return C0239d.f4723e;
        }
        long m3 = g3.m(l0.c.e(f3, f4));
        long m4 = g3.m(l0.c.e(I3, f4));
        long m5 = g3.m(l0.c.e(I3, I4));
        long m6 = g3.m(l0.c.e(f3, I4));
        float d3 = C0238c.d(m3);
        float d4 = C0238c.d(m4);
        float d5 = C0238c.d(m6);
        float d6 = C0238c.d(m5);
        float min = Math.min(d3, Math.min(d4, Math.min(d5, d6)));
        float max = Math.max(d3, Math.max(d4, Math.max(d5, d6)));
        float e3 = C0238c.e(m3);
        float e4 = C0238c.e(m4);
        float e5 = C0238c.e(m6);
        float e6 = C0238c.e(m5);
        return new C0239d(min, Math.min(e3, Math.min(e4, Math.min(e5, e6))), max, Math.max(e3, Math.max(e4, Math.max(e5, e6))));
    }

    public static final boolean f(int i3, int i4) {
        return i3 == i4;
    }

    public static final InterfaceC0919p g(InterfaceC0919p interfaceC0919p) {
        InterfaceC0919p interfaceC0919p2;
        InterfaceC0919p v3 = interfaceC0919p.v();
        while (true) {
            InterfaceC0919p interfaceC0919p3 = v3;
            interfaceC0919p2 = interfaceC0919p;
            interfaceC0919p = interfaceC0919p3;
            if (interfaceC0919p == null) {
                break;
            }
            v3 = interfaceC0919p.v();
        }
        b0 b0Var = interfaceC0919p2 instanceof b0 ? (b0) interfaceC0919p2 : null;
        if (b0Var == null) {
            return interfaceC0919p2;
        }
        b0 b0Var2 = b0Var.f8713q;
        while (true) {
            b0 b0Var3 = b0Var2;
            b0 b0Var4 = b0Var;
            b0Var = b0Var3;
            if (b0Var == null) {
                return b0Var4;
            }
            b0Var2 = b0Var.f8713q;
        }
    }

    public static final t0.Q h(t0.Q q3) {
        t0.E e3 = q3.f8658o.f8711o;
        while (true) {
            t0.E s3 = e3.s();
            t0.E e4 = null;
            if ((s3 != null ? s3.f8542f : null) == null) {
                t0.Q I02 = ((b0) e3.f8561y.f2913d).I0();
                f2.j.c(I02);
                return I02;
            }
            t0.E s4 = e3.s();
            if (s4 != null) {
                e4 = s4.f8542f;
            }
            f2.j.c(e4);
            t0.E s5 = e3.s();
            f2.j.c(s5);
            e3 = s5.f8542f;
            f2.j.c(e3);
        }
    }

    public static final long i(long j3, long j4) {
        float d3 = C0241f.d(j3);
        long j5 = AbstractC0897T.f8137a;
        if (j4 == j5) {
            z0.o("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * d3;
        float b3 = C0241f.b(j3);
        if (j4 != j5) {
            return AbstractC0235a.e(intBitsToFloat, Float.intBitsToFloat((int) (j4 & 4294967295L)) * b3);
        }
        z0.o("ScaleFactor is unspecified");
        throw null;
    }
}
