package p1;

import g0.k1;
import g0.p1;
import r1.a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f7080a = new i0(4);

    public static final long a(float f9, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
        int i7 = r0.f7078b;
        return floatToRawIntBits;
    }

    public static final void b(v0 v0Var, s0.o oVar, q6.e eVar, g0.p pVar, int i7) {
        int i8;
        pVar.S(-511989831);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(v0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(oVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(eVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            int i9 = pVar.P;
            g0.n L = g0.d.L(pVar);
            s0.o c4 = s0.a.c(pVar, oVar);
            k1 m8 = pVar.m();
            r1.n nVar = r1.n.f7860i;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, v0Var, v0Var.f7099c);
            g0.d.Q(pVar, L, v0Var.f7100d);
            g0.d.Q(pVar, eVar, v0Var.f7101e);
            r1.j.f7810d.getClass();
            g0.d.Q(pVar, m8, r1.i.f7783d);
            g0.d.Q(pVar, c4, r1.i.f7782c);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i9))) {
                a0.m.q(i9, pVar, i9, hVar);
            }
            pVar.p(true);
            if (pVar.x()) {
                pVar.Q(-26502501);
                pVar.p(false);
            } else {
                pVar.Q(-26580342);
                boolean h3 = pVar.h(v0Var);
                Object G = pVar.G();
                if (h3 || G == g0.l.f3784a) {
                    G = new androidx.lifecycle.r0(22, v0Var);
                    pVar.a0(G);
                }
                g0.d.g((q6.a) G, pVar);
                pVar.p(false);
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(v0Var, oVar, eVar, i7, 5);
        }
    }

    public static final void c(s0.o oVar, q6.e eVar, g0.p pVar, int i7) {
        pVar.S(-1298353104);
        int i8 = i7 | 6 | (pVar.h(eVar) ? 32 : 16);
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            Object G = pVar.G();
            if (G == g0.l.f3784a) {
                G = new v0(i0.f7047g);
                pVar.a0(G);
            }
            s0.l lVar = s0.l.f8103a;
            b((v0) G, lVar, eVar, pVar, (i8 << 3) & 1008);
            oVar = lVar;
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d0.b0(i7, 11, oVar, eVar);
        }
    }

    public static final y0.d d(p pVar) {
        p i7 = pVar.i();
        return i7 != null ? i7.h(pVar, true) : new y0.d(0.0f, 0.0f, (int) (pVar.V() >> 32), (int) (pVar.V() & 4294967295L));
    }

    public static final y0.d e(p pVar) {
        p f9 = f(pVar);
        float V = (int) (f9.V() >> 32);
        float V2 = (int) (f9.V() & 4294967295L);
        y0.d h3 = f(pVar).h(pVar, true);
        float f10 = h3.f9780a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > V) {
            f10 = V;
        }
        float f11 = h3.f9781b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > V2) {
            f11 = V2;
        }
        float f12 = h3.f9782c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= V) {
            V = f12;
        }
        float f13 = h3.f9783d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= V2) {
            V2 = f14;
        }
        if (f10 == V || f11 == V2) {
            return y0.d.f9779e;
        }
        long f15 = f9.f(u3.r.a(f10, f11));
        long f16 = f9.f(u3.r.a(V, f11));
        long f17 = f9.f(u3.r.a(V, V2));
        long f18 = f9.f(u3.r.a(f10, V2));
        float d8 = y0.c.d(f15);
        float d9 = y0.c.d(f16);
        float d10 = y0.c.d(f18);
        float d11 = y0.c.d(f17);
        float min = Math.min(d8, Math.min(d9, Math.min(d10, d11)));
        float max = Math.max(d8, Math.max(d9, Math.max(d10, d11)));
        float e9 = y0.c.e(f15);
        float e10 = y0.c.e(f16);
        float e11 = y0.c.e(f18);
        float e12 = y0.c.e(f17);
        return new y0.d(min, Math.min(e9, Math.min(e10, Math.min(e11, e12))), max, Math.max(e9, Math.max(e10, Math.max(e11, e12))));
    }

    public static final p f(p pVar) {
        p pVar2;
        p i7 = pVar.i();
        while (true) {
            p pVar3 = i7;
            pVar2 = pVar;
            pVar = pVar3;
            if (pVar == null) {
                break;
            }
            i7 = pVar.i();
        }
        a1 a1Var = pVar2 instanceof a1 ? (a1) pVar2 : null;
        if (a1Var == null) {
            return pVar2;
        }
        a1 a1Var2 = a1Var.f7702s;
        while (true) {
            a1 a1Var3 = a1Var2;
            a1 a1Var4 = a1Var;
            a1Var = a1Var3;
            if (a1Var == null) {
                return a1Var4;
            }
            a1Var2 = a1Var.f7702s;
        }
    }

    public static final r1.p0 g(r1.p0 p0Var) {
        r1.d0 d0Var = p0Var.f7870q.f7700q;
        while (true) {
            r1.d0 s5 = d0Var.s();
            r1.d0 d0Var2 = null;
            if ((s5 != null ? s5.f7721h : null) == null) {
                r1.p0 K0 = ((a1) d0Var.A.f3893d).K0();
                r6.k.c(K0);
                return K0;
            }
            r1.d0 s8 = d0Var.s();
            if (s8 != null) {
                d0Var2 = s8.f7721h;
            }
            r6.k.c(d0Var2);
            r1.d0 s9 = d0Var.s();
            r6.k.c(s9);
            d0Var = s9.f7721h;
            r6.k.c(d0Var);
        }
    }

    public static final long h(long j8, long j9) {
        float d8 = y0.f.d(j8);
        long j10 = r0.f7077a;
        if (j9 == j10) {
            a.a.M("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * d8;
        float b9 = y0.f.b(j8);
        if (j9 != j10) {
            return v0.d.a(intBitsToFloat, Float.intBitsToFloat((int) (j9 & 4294967295L)) * b9);
        }
        a.a.M("ScaleFactor is unspecified");
        throw null;
    }
}
