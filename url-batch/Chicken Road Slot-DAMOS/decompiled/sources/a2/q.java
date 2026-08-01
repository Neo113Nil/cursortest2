package a2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final g f139a = new g(5);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f140b = new Object();

    public static final void a(z0 z0Var, d1.l lVar, Function2 function2, n0.i0 i0Var, int i3) {
        int i10;
        i0Var.X(-511989831);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.h(z0Var) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.h(function2) ? 256 : 128;
        }
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            int hashCode = Long.hashCode(i0Var.T);
            n0.h0 u2 = n0.h.u(i0Var);
            d1.l C = z4.w.C(lVar, i0Var);
            x0.h l10 = i0Var.l();
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(c2.z.f1704d);
            } else {
                i0Var.j0();
            }
            n0.h.y(z0Var, z0Var.f188b, i0Var);
            n0.h.y(u2, z0Var.f189c, i0Var);
            n0.h.y(function2, z0Var.f190d, i0Var);
            c2.g.f1541a.getClass();
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            i0Var.p(true);
            if (i0Var.A()) {
                i0Var.W(-1259187287);
                i0Var.p(false);
            } else {
                i0Var.W(-1259245908);
                boolean h10 = i0Var.h(z0Var);
                Object L = i0Var.L();
                if (h10 || L == n0.k.f6729a) {
                    L = new a0(1, z0Var);
                    i0Var.g0(L);
                }
                n0.h.g((Function0) L, i0Var);
                i0Var.p(false);
            }
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new w0(z0Var, lVar, function2, i3);
        }
    }

    public static final void b(d1.l lVar, Function2 function2, n0.i0 i0Var, int i3) {
        int i10;
        i0Var.X(-1298353104);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(lVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function2) ? 32 : 16;
        }
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = new z0();
                i0Var.g0(L);
            }
            a((z0) L, lVar, function2, i0Var, (i10 << 3) & 1008);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new v0(lVar, function2, i3, 0);
        }
    }

    public static final float c(long j, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float d(n0 n0Var, boolean z10, k[] kVarArr, float f3) {
        float f10 = Float.NaN;
        for (k kVar : kVarArr) {
            float b10 = n0Var.b(kVar);
            if (!Float.isNaN(f10)) {
                int i3 = z10 != (b10 > f10) ? i3 + 1 : 0;
            }
            f10 = b10;
        }
        return Float.isNaN(f10) ? f3 : f10;
    }

    public static final j1.c e(n nVar) {
        n k10 = nVar.k();
        return k10 != null ? k10.p(nVar, true) : new j1.c(0.0f, 0.0f, (int) (nVar.J() >> 32), (int) (nVar.J() & 4294967295L));
    }

    public static final j1.c f(n nVar, boolean z10) {
        n h10 = h(nVar);
        float J = (int) (h10.J() >> 32);
        float J2 = (int) (h10.J() & 4294967295L);
        j1.c p4 = h10.p(nVar, z10);
        float f3 = p4.f4916a;
        if (z10) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > J) {
                f3 = J;
            }
        }
        float f10 = p4.f4917b;
        if (z10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 > J2) {
                f10 = J2;
            }
        }
        float f11 = p4.f4918c;
        if (z10) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 <= J) {
                J = f11;
            }
            f11 = J;
        }
        float f12 = p4.f4919d;
        if (z10) {
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            if (f13 <= J2) {
                J2 = f13;
            }
            f12 = J2;
        }
        if (f3 == f11 || f10 == f12) {
            return j1.c.f4915e;
        }
        long e2 = h10.e((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        long e9 = h10.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        long e10 = h10.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long e11 = h10.e((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e9 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e11 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (e10 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (e9 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (e11 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (e10 & 4294967295L));
        return new j1.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean g(long j, long j3) {
        return j == j3;
    }

    public static final n h(n nVar) {
        n nVar2;
        n k10 = nVar.k();
        while (true) {
            n nVar3 = k10;
            nVar2 = nVar;
            nVar = nVar3;
            if (nVar == null) {
                break;
            }
            k10 = nVar.k();
        }
        c2.i1 i1Var = nVar2 instanceof c2.i1 ? (c2.i1) nVar2 : null;
        if (i1Var == null) {
            return nVar2;
        }
        c2.i1 i1Var2 = i1Var.D;
        while (true) {
            c2.i1 i1Var3 = i1Var2;
            c2.i1 i1Var4 = i1Var;
            i1Var = i1Var3;
            if (i1Var == null) {
                return i1Var4;
            }
            i1Var2 = i1Var.D;
        }
    }

    public static final c2.p0 i(c2.p0 p0Var) {
        c2.g0 g0Var = p0Var.B.B;
        while (true) {
            c2.g0 s3 = g0Var.s();
            c2.g0 g0Var2 = null;
            if ((s3 != null ? s3.f1556v : null) == null) {
                c2.p0 B0 = ((c2.i1) g0Var.S.f1494e).B0();
                B0.getClass();
                return B0;
            }
            c2.g0 s10 = g0Var.s();
            if (s10 != null) {
                g0Var2 = s10.f1556v;
            }
            g0Var2.getClass();
            c2.g0 s11 = g0Var.s();
            s11.getClass();
            g0Var = s11.f1556v;
            g0Var.getClass();
        }
    }

    public static final d1.l j(vd.n nVar) {
        return new o(nVar);
    }

    public static final d1.l k(d1.l lVar, a3.f fVar) {
        return lVar.c(new j0(fVar));
    }

    public static final long l(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
