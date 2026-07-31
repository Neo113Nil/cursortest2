package a0;

import m0.r1;
import m0.t1;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f82a = new a(1);

    public static final void a(p6.a aVar, y0.m mVar, n0 n0Var, z.j jVar, m0.s sVar, int i) {
        sVar.W(1055276397);
        int i8 = (sVar.h(aVar) ? 4 : 2) | i | (sVar.f(mVar) ? 32 : 16) | (sVar.f(n0Var) ? 256 : 128) | (sVar.f(jVar) ? 2048 : 1024);
        if (sVar.N(i8 & 1, (i8 & 1171) != 1170)) {
            c(u0.h.d(-933153643, new androidx.compose.foundation.lazy.layout.c(n0Var, mVar, jVar, m0.b.t(aVar, sVar)), sVar), sVar, 6);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b0(aVar, mVar, n0Var, jVar, i);
        }
    }

    public static final void b(final Object obj, final int i, final k0 k0Var, final u0.c cVar, m0.s sVar, final int i8) {
        int i9;
        sVar.W(872548579);
        if ((i8 & 6) == 0) {
            i9 = (sVar.h(obj) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= sVar.d(i) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= sVar.h(k0Var) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i9 & 1, (i9 & 1171) != 1170)) {
            boolean f6 = sVar.f(obj) | sVar.f(k0Var);
            Object K = sVar.K();
            Object obj2 = m0.n.f5019a;
            if (f6 || K == obj2) {
                K = new i0(obj, k0Var);
                sVar.f0(K);
            }
            i0 i0Var = (i0) K;
            i0Var.f93c = i;
            m0.h1 h1Var = i0Var.f97g;
            r1 r1Var = u1.j0.f7226a;
            i0 i0Var2 = (i0) sVar.j(r1Var);
            w0.f e8 = w0.q.e();
            p6.c e9 = e8 != null ? e8.e() : null;
            w0.f h8 = w0.q.h(e8);
            try {
                if (i0Var2 != ((i0) h1Var.getValue())) {
                    h1Var.setValue(i0Var2);
                    if (i0Var.f94d > 0) {
                        i0 i0Var3 = i0Var.f95e;
                        if (i0Var3 != null) {
                            i0Var3.b();
                        }
                        if (i0Var2 != null) {
                            i0Var2.a();
                        } else {
                            i0Var2 = null;
                        }
                        i0Var.f95e = i0Var2;
                    }
                }
                w0.q.k(e8, h8, e9);
                boolean f8 = sVar.f(i0Var);
                Object K2 = sVar.K();
                if (f8 || K2 == obj2) {
                    K2 = new t(1, i0Var);
                    sVar.f0(K2);
                }
                m0.b.d(i0Var, (p6.c) K2, sVar);
                m0.b.a(r1Var.a(i0Var), cVar, sVar, ((i9 >> 6) & 112) | 8);
            } catch (Throwable th) {
                w0.q.k(e8, h8, e9);
                throw th;
            }
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: a0.j0
                @Override // p6.e
                public final Object g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    g0.b(obj, i, k0Var, cVar, (m0.s) obj3, m0.b.w(i8 | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void c(u0.c cVar, m0.s sVar, int i) {
        sVar.W(-709502251);
        if (sVar.N(i & 1, (i & 3) != 2)) {
            u2 u2Var = v0.g.f7442a;
            v0.e eVar = (v0.e) sVar.j(u2Var);
            v0.d d8 = v0.j.d(sVar);
            Object[] objArr = {eVar};
            a0 a0Var = new a0(21, new w0(0), new v0(1, eVar, d8));
            boolean h8 = sVar.h(eVar) | sVar.h(d8);
            Object K = sVar.K();
            if (h8 || K == m0.n.f5019a) {
                K = new z0(0, eVar, d8);
                sVar.f0(K);
            }
            y0 y0Var = (y0) v0.j.b(objArr, a0Var, (p6.a) K, sVar, 0);
            m0.b.a(u2Var.a(y0Var), u0.h.d(-412824043, new v(1, cVar, y0Var), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a1(cVar, i, 0);
        }
    }

    public static final void d(z.h hVar, Object obj, int i, Object obj2, m0.s sVar, int i8) {
        sVar.W(1439843069);
        int i9 = (sVar.f(hVar) ? 4 : 2) | i8 | (sVar.f(obj) ? 32 : 16) | (sVar.d(i) ? 256 : 128) | (sVar.f(obj2) ? 2048 : 1024);
        if (sVar.N(i9 & 1, (i9 & 1171) != 1170)) {
            ((v0.c) obj).b(obj2, u0.h.d(980966366, new z(i, obj2, hVar), sVar), sVar, 48);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new y(hVar, obj, i, obj2, i8);
        }
    }

    public static final int e(int i, o0.e eVar) {
        int i8 = eVar.f5580f - 1;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = ((i8 - i9) / 2) + i9;
            Object[] objArr = eVar.f5578d;
            int i11 = ((j) objArr[i10]).f98a;
            if (i11 != i) {
                if (i11 < i) {
                    i9 = i10 + 1;
                    if (i < ((j) objArr[i9]).f98a) {
                    }
                } else {
                    i8 = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }

    public static final int f(int i, Object obj, z.h hVar) {
        int c8;
        return (obj == null || hVar.c() == 0 || (i < hVar.c() && obj.equals(hVar.d(i))) || (c8 = hVar.f9021d.c(obj)) == -1) ? i : c8;
    }
}
