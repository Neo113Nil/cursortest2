package u1;

import m0.o1;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f7266a = new h0(3);

    public static final void a(w0 w0Var, y0.m mVar, p6.e eVar, m0.s sVar, int i) {
        int i8;
        sVar.W(-511989831);
        if ((i & 6) == 0) {
            i8 = (sVar.h(w0Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(eVar) ? 256 : 128;
        }
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            int hashCode = Long.hashCode(sVar.T);
            m0.q s5 = m0.b.s(sVar);
            y0.m a02 = r2.o.a0(sVar, mVar);
            o1 l3 = sVar.l();
            sVar.Y();
            if (sVar.S) {
                sVar.k(w1.y.f7821e);
            } else {
                sVar.i0();
            }
            m0.b.u(w0Var, sVar, w0Var.f7295c);
            m0.b.u(s5, sVar, w0Var.f7296d);
            m0.b.u(eVar, sVar, w0Var.f7297e);
            w1.i.f7684c.getClass();
            m0.b.u(l3, sVar, w1.h.f7677d);
            m0.b.u(a02, sVar, w1.h.f7676c);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            sVar.p(true);
            if (sVar.z()) {
                sVar.V(-1259216055);
                sVar.p(false);
            } else {
                sVar.V(-1259274676);
                boolean h8 = sVar.h(w0Var);
                Object K = sVar.K();
                if (h8 || K == m0.n.f5019a) {
                    K = new d1.o(9, w0Var);
                    sVar.f0(K);
                }
                m0.b.g((p6.a) K, sVar);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new r0(w0Var, mVar, eVar, i);
        }
    }

    public static final void b(y0.m mVar, p6.e eVar, m0.s sVar, int i) {
        sVar.W(-1298353104);
        int i8 = i | 6 | (sVar.h(eVar) ? 32 : 16);
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = new w0(h0.f7220e);
                sVar.f0(K);
            }
            y0.j jVar = y0.j.f8705a;
            a((w0) K, jVar, eVar, sVar, (i8 << 3) & 1008);
            mVar = jVar;
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a1.g(mVar, eVar, i, 2);
        }
    }

    public static final float c(k0 k0Var, boolean z3, m[] mVarArr, float f6) {
        float f8 = Float.NaN;
        for (m mVar : mVarArr) {
            float d8 = k0Var.d(mVar);
            if (!Float.isNaN(f8)) {
                int i = z3 != (d8 > f8) ? i + 1 : 0;
            }
            f8 = d8;
        }
        return Float.isNaN(f8) ? f6 : f8;
    }

    public static final e1.c d(p pVar) {
        p h8 = pVar.h();
        return h8 != null ? h8.K(pVar, true) : new e1.c(0.0f, 0.0f, (int) (pVar.G() >> 32), (int) (pVar.G() & 4294967295L));
    }

    public static final e1.c e(w1.d1 d1Var) {
        p g3 = g(d1Var);
        float G = (int) (g3.G() >> 32);
        float G2 = (int) (g3.G() & 4294967295L);
        e1.c K = g3.K(d1Var, true);
        float f6 = K.f2457a;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > G) {
            f6 = G;
        }
        float f8 = K.f2458b;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > G2) {
            f8 = G2;
        }
        float f9 = K.f2459c;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 <= G) {
            G = f9;
        }
        float f10 = K.f2460d;
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 <= G2) {
            G2 = f11;
        }
        if (f6 == G || f8 == G2) {
            return e1.c.f2456e;
        }
        long f12 = g3.f((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        long f13 = g3.f((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(G) << 32));
        long f14 = g3.f((Float.floatToRawIntBits(G) << 32) | (Float.floatToRawIntBits(G2) & 4294967295L));
        long f15 = g3.f((Float.floatToRawIntBits(G2) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (f12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f13 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (f15 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (f14 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (f12 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (f13 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (f15 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (f14 & 4294967295L));
        return new e1.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean f(long j7, long j8) {
        return j7 == j8;
    }

    public static final p g(p pVar) {
        p pVar2;
        p h8 = pVar.h();
        while (true) {
            p pVar3 = h8;
            pVar2 = pVar;
            pVar = pVar3;
            if (pVar == null) {
                break;
            }
            h8 = pVar.h();
        }
        w1.d1 d1Var = pVar2 instanceof w1.d1 ? (w1.d1) pVar2 : null;
        if (d1Var == null) {
            return pVar2;
        }
        w1.d1 d1Var2 = d1Var.f7616t;
        while (true) {
            w1.d1 d1Var3 = d1Var2;
            w1.d1 d1Var4 = d1Var;
            d1Var = d1Var3;
            if (d1Var == null) {
                return d1Var4;
            }
            d1Var2 = d1Var.f7616t;
        }
    }

    public static final w1.o0 h(w1.o0 o0Var) {
        w1.f0 f0Var = o0Var.f7737r.f7614r;
        while (true) {
            w1.f0 s5 = f0Var.s();
            w1.f0 f0Var2 = null;
            if ((s5 != null ? s5.f7644j : null) == null) {
                w1.o0 C0 = f0Var.F.f7598d.C0();
                q6.i.b(C0);
                return C0;
            }
            w1.f0 s7 = f0Var.s();
            if (s7 != null) {
                f0Var2 = s7.f7644j;
            }
            q6.i.b(f0Var2);
            w1.f0 s8 = f0Var.s();
            q6.i.b(s8);
            f0Var = s8.f7644j;
            q6.i.b(f0Var);
        }
    }

    public static final long i(long j7, long j8) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
