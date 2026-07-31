package k0;

import c6.m;
import g2.i0;
import g2.t;
import g2.u;
import j0.g0;
import j0.n2;
import l.q;
import m0.b0;
import m0.s;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final u f4153a = new u(new t());

    public static final void a(final long j7, final i0 i0Var, final p6.e eVar, s sVar, final int i) {
        sVar.W(-684938728);
        int i8 = (sVar.e(j7) ? 4 : 2) | i | (sVar.f(i0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i8 |= sVar.h(eVar) ? 256 : 128;
        }
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            b0 b0Var = n2.f3804a;
            m0.b.b(new q[]{g0.f3652a.a(new f1.s(j7)), b0Var.a(((i0) sVar.j(b0Var)).c(i0Var))}, eVar, sVar, ((i8 >> 3) & 112) | 8);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: k0.j
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.a(j7, i0Var, eVar, (s) obj, m0.b.w(i | 1));
                    return m.f1757a;
                }
            };
        }
    }
}
