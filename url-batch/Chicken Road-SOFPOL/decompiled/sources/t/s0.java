package t;

import m0.e1;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends y0.l implements w1.v, s1 {

    /* renamed from: r, reason: collision with root package name */
    public u0 f6854r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6855s;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        r2.o.q(j7, this.f6855s ? u.j0.f7027d : u.j0.f7028e);
        u1.l0 e8 = d0Var.e(r2.a.a(j7, 0, this.f6855s ? r2.a.h(j7) : Integer.MAX_VALUE, 0, this.f6855s ? Integer.MAX_VALUE : r2.a.g(j7), 5));
        int i = e8.f7230d;
        int h8 = r2.a.h(j7);
        if (i > h8) {
            i = h8;
        }
        int i8 = e8.f7231e;
        int g3 = r2.a.g(j7);
        if (i8 > g3) {
            i8 = g3;
        }
        int i9 = e8.f7231e - i8;
        int i10 = e8.f7230d - i;
        if (!this.f6855s) {
            i9 = i10;
        }
        u0 u0Var = this.f6854r;
        e1 e1Var = u0Var.f6870d;
        e1 e1Var2 = u0Var.f6867a;
        e1Var.h(i9);
        w0.f e9 = w0.q.e();
        p6.c e10 = e9 != null ? e9.e() : null;
        w0.f h9 = w0.q.h(e9);
        try {
            if (e1Var2.g() > i9) {
                e1Var2.h(i9);
            }
            w0.q.k(e9, h9, e10);
            this.f6854r.f6868b.h(this.f6855s ? i8 : i);
            return n0Var.e0(i, i8, d6.v.f2327d, new m0.s1(i9, 1, this, e8));
        } catch (Throwable th) {
            w0.q.k(e9, h9, e10);
            throw th;
        }
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        w6.d[] dVarArr = d2.u.f2215a;
        d2.v vVar = d2.s.f2199m;
        w6.d[] dVarArr2 = d2.u.f2215a;
        w6.d dVar = dVarArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        final int i = 0;
        final int i8 = 1;
        d2.h hVar = new d2.h(new p6.a(this) { // from class: t.r0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ s0 f6848e;

            {
                this.f6848e = this;
            }

            @Override // p6.a
            public final Object b() {
                int g3;
                switch (i) {
                    case 0:
                        g3 = this.f6848e.f6854r.f6867a.g();
                        break;
                    default:
                        g3 = this.f6848e.f6854r.f6870d.g();
                        break;
                }
                return Float.valueOf(g3);
            }
        }, new p6.a(this) { // from class: t.r0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ s0 f6848e;

            {
                this.f6848e = this;
            }

            @Override // p6.a
            public final Object b() {
                int g3;
                switch (i8) {
                    case 0:
                        g3 = this.f6848e.f6854r.f6867a.g();
                        break;
                    default:
                        g3 = this.f6848e.f6854r.f6870d.g();
                        break;
                }
                return Float.valueOf(g3);
            }
        });
        if (this.f6855s) {
            d2.v vVar2 = d2.s.f2207u;
            w6.d dVar2 = dVarArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            d2.v vVar3 = d2.s.f2206t;
            w6.d dVar3 = dVarArr2[11];
            vVar3.a(jVar, hVar);
        }
    }
}
