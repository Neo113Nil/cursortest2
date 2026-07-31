package j0;

import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u2 f3976a;

    static {
        a.a.r(new c.e(9));
        f3976a = new u2(new c.e(10));
    }

    public static final void a(final b0 b0Var, final d1 d1Var, final g2 g2Var, final o2 o2Var, final u0.c cVar, m0.s sVar, final int i) {
        int i8;
        sVar.W(904511636);
        if ((i & 6) == 0) {
            i8 = (sVar.f(b0Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(d1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(g2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.f(o2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= sVar.h(cVar) ? 16384 : 8192;
        }
        if (sVar.N(i8 & 1, (i8 & 9363) != 9362)) {
            sVar.S();
            if ((i & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            x1 a8 = w1.a();
            long j7 = b0Var.f3555a;
            boolean e8 = sVar.e(j7);
            Object K = sVar.K();
            if (e8 || K == m0.n.f5019a) {
                K = new g0.b(j7, f1.s.b(j7, 0.4f));
                sVar.f0(K);
            }
            m0.b.b(new l.q[]{c0.f3599a.a(b0Var), f3976a.a(d1Var), androidx.compose.foundation.c.f484a.a(a8), h2.f3688a.a(g2Var), g0.c.f2809a.a((g0.b) K), p2.f3856a.a(o2Var)}, u0.h.d(-1750539308, new a0.v(3, o2Var, cVar), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: j0.y0
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z0.a(b0.this, d1Var, g2Var, o2Var, cVar, (m0.s) obj, m0.b.w(i | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void b(b0 b0Var, g2 g2Var, o2 o2Var, u0.c cVar, m0.s sVar, int i) {
        int i8;
        g2 g2Var2;
        int i9;
        sVar.W(-449719819);
        if ((i & 6) == 0) {
            i8 = (sVar.f(b0Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(o2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i8 & 1, (i8 & 1171) != 1170)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                g2Var2 = (g2) sVar.j(h2.f3688a);
                i9 = i8 & (-113);
            } else {
                sVar.Q();
                i9 = i8 & (-113);
                g2Var2 = g2Var;
            }
            sVar.q();
            int i10 = i9 & 14;
            int i11 = i9 << 3;
            a(b0Var, (d1) sVar.j(f3976a), g2Var2, o2Var, cVar, sVar, (i11 & 57344) | i10 | (i11 & 7168));
        } else {
            sVar.Q();
            g2Var2 = g2Var;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.r1(b0Var, g2Var2, o2Var, cVar, i, 2);
        }
    }
}
