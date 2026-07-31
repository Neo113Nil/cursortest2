package t;

import a0.z0;
import w1.d1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 extends q6.g implements p6.e {
    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        boolean a8;
        d0 v02;
        d1.m mVar = (d1.m) obj;
        d1.m mVar2 = (d1.m) obj2;
        c0 c0Var = (c0) this.f6189e;
        if (c0Var.f8718q && (a8 = mVar2.a()) != mVar.a()) {
            a7.v0 v0Var = c0Var.f6752u;
            if (v0Var != null) {
                v0Var.i(Boolean.valueOf(a8));
            }
            if (a8) {
                a7.x.n(c0Var.f0(), null, new a0.p0(c0Var, (g6.c) null, 6), 3);
                q6.s sVar = new q6.s();
                w1.f.r(c0Var, new z0(9, sVar, c0Var));
                a0.i0 i0Var = (a0.i0) sVar.f6205d;
                if (i0Var != null) {
                    i0Var.a();
                } else {
                    i0Var = null;
                }
                c0Var.f6754w = i0Var;
                d1 d1Var = c0Var.f6755x;
                if (d1Var != null && d1Var.E0().f8718q && (v02 = c0Var.v0()) != null) {
                    v02.r0(c0Var.f6755x);
                }
            } else {
                a0.i0 i0Var2 = c0Var.f6754w;
                if (i0Var2 != null) {
                    i0Var2.b();
                }
                c0Var.f6754w = null;
                d0 v03 = c0Var.v0();
                if (v03 != null) {
                    v03.r0(null);
                }
            }
            w1.f.n(c0Var);
            v.j jVar = c0Var.f6751t;
            if (jVar != null) {
                if (a8) {
                    v.d dVar = c0Var.f6753v;
                    if (dVar != null) {
                        c0Var.u0(jVar, new v.e(dVar));
                        c0Var.f6753v = null;
                    }
                    v.d dVar2 = new v.d();
                    c0Var.u0(jVar, dVar2);
                    c0Var.f6753v = dVar2;
                } else {
                    v.d dVar3 = c0Var.f6753v;
                    if (dVar3 != null) {
                        c0Var.u0(jVar, new v.e(dVar3));
                        c0Var.f6753v = null;
                    }
                }
            }
        }
        return c6.m.f1757a;
    }
}
