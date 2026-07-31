package r0;

import F.V0;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0109n;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0110n0;
import e2.AbstractC0381e;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import t0.a0;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final D f7127a = new D(4);

    public static final long a(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = L.f7126b;
        return floatToRawIntBits;
    }

    public static final void b(U.l lVar, Y1.e eVar, C0113p c0113p, int i3) {
        c0113p.S(-1298353104);
        int i4 = i3 | 6;
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            lVar = U.i.f3302a;
            Object G3 = c0113p.G();
            if (G3 == C0105l.f2272a) {
                G3 = new P(D.f7108e);
                c0113p.a0(G3);
            }
            c((P) G3, lVar, eVar, c0113p, (i4 << 3) & 1008);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 7, lVar, eVar);
        }
    }

    public static final void c(P p, U.l lVar, Y1.e eVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-511989831);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(p) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(eVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            int i5 = c0113p.f2306P;
            C0109n L2 = C0089d.L(c0113p);
            U.l c3 = U.m.c(c0113p, lVar);
            InterfaceC0110n0 m3 = c0113p.m();
            C0906n c0906n = C0906n.f7939g;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, p.f7132c, p);
            C0089d.Q(c0113p, p.f7133d, L2);
            C0089d.Q(c0113p, p.f7134e, eVar);
            InterfaceC0902j.f7933c.getClass();
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                AbstractC0080b.p(i5, c0113p, i5, c0900h);
            }
            c0113p.p(true);
            if (c0113p.x()) {
                c0113p.Q(-26502501);
                c0113p.p(false);
            } else {
                c0113p.Q(-26580342);
                boolean h3 = c0113p.h(p);
                Object G3 = c0113p.G();
                if (h3 || G3 == C0105l.f2272a) {
                    G3 = new A2.l(29, p);
                    c0113p.a0(G3);
                }
                C0089d.g((Y1.a) G3, c0113p);
                c0113p.p(false);
            }
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(p, lVar, eVar, i3, 3);
        }
    }

    public static final a0.d d(InterfaceC0838k interfaceC0838k) {
        InterfaceC0838k t3 = interfaceC0838k.t();
        return t3 != null ? t3.u(interfaceC0838k, true) : new a0.d(0.0f, 0.0f, (int) (interfaceC0838k.y() >> 32), (int) (interfaceC0838k.y() & 4294967295L));
    }

    public static final a0.d e(a0 a0Var) {
        InterfaceC0838k g3 = g(a0Var);
        float y3 = (int) (g3.y() >> 32);
        float y4 = (int) (g3.y() & 4294967295L);
        a0.d u3 = g(a0Var).u(a0Var, true);
        float f3 = u3.f3491a;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > y3) {
            f3 = y3;
        }
        float f4 = u3.f3492b;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > y4) {
            f4 = y4;
        }
        float f5 = u3.f3493c;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= y3) {
            y3 = f5;
        }
        float f6 = u3.f3494d;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 <= y4) {
            y4 = f7;
        }
        if (f3 == y3 || f4 == y4) {
            return a0.d.f3490e;
        }
        long m3 = g3.m(I2.l.f(f3, f4));
        long m4 = g3.m(I2.l.f(y3, f4));
        long m5 = g3.m(I2.l.f(y3, y4));
        long m6 = g3.m(I2.l.f(f3, y4));
        float d3 = a0.c.d(m3);
        float d4 = a0.c.d(m4);
        float d5 = a0.c.d(m6);
        float d6 = a0.c.d(m5);
        float min = Math.min(d3, Math.min(d4, Math.min(d5, d6)));
        float max = Math.max(d3, Math.max(d4, Math.max(d5, d6)));
        float e3 = a0.c.e(m3);
        float e4 = a0.c.e(m4);
        float e5 = a0.c.e(m6);
        float e6 = a0.c.e(m5);
        return new a0.d(min, Math.min(e3, Math.min(e4, Math.min(e5, e6))), max, Math.max(e3, Math.max(e4, Math.max(e5, e6))));
    }

    public static final boolean f(int i3, int i4) {
        return i3 == i4;
    }

    public static final InterfaceC0838k g(InterfaceC0838k interfaceC0838k) {
        InterfaceC0838k interfaceC0838k2;
        InterfaceC0838k t3 = interfaceC0838k.t();
        while (true) {
            InterfaceC0838k interfaceC0838k3 = t3;
            interfaceC0838k2 = interfaceC0838k;
            interfaceC0838k = interfaceC0838k3;
            if (interfaceC0838k == null) {
                break;
            }
            t3 = interfaceC0838k.t();
        }
        a0 a0Var = interfaceC0838k2 instanceof a0 ? (a0) interfaceC0838k2 : null;
        if (a0Var == null) {
            return interfaceC0838k2;
        }
        a0 a0Var2 = a0Var.f7878q;
        while (true) {
            a0 a0Var3 = a0Var2;
            a0 a0Var4 = a0Var;
            a0Var = a0Var3;
            if (a0Var == null) {
                return a0Var4;
            }
            a0Var2 = a0Var.f7878q;
        }
    }

    public static final t0.P h(t0.P p) {
        t0.D d3 = p.f7829o.f7877o;
        while (true) {
            t0.D q2 = d3.q();
            t0.D d4 = null;
            if ((q2 != null ? q2.f7718f : null) == null) {
                t0.P z02 = ((a0) d3.f7735x.f2354d).z0();
                Z1.i.c(z02);
                return z02;
            }
            t0.D q3 = d3.q();
            if (q3 != null) {
                d4 = q3.f7718f;
            }
            Z1.i.c(d4);
            t0.D q4 = d3.q();
            Z1.i.c(q4);
            d3 = q4.f7718f;
            Z1.i.c(d3);
        }
    }

    public static final long i(long j3, long j4) {
        float d3 = a0.f.d(j3);
        long j5 = L.f7125a;
        if (j4 == j5) {
            AbstractC0381e.N("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * d3;
        float b2 = a0.f.b(j3);
        if (j4 != j5) {
            return I2.d.h(intBitsToFloat, Float.intBitsToFloat((int) (j4 & 4294967295L)) * b2);
        }
        AbstractC0381e.N("ScaleFactor is unspecified");
        throw null;
    }
}
