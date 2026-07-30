package f1;

import androidx.lifecycle.r0;
import g0.d1;
import g0.g1;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends e1.b {

    /* renamed from: e, reason: collision with root package name */
    public final g1 f3197e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f3198f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f3199g;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f3200h;

    /* renamed from: i, reason: collision with root package name */
    public float f3201i;

    /* renamed from: j, reason: collision with root package name */
    public z0.m f3202j;

    /* renamed from: k, reason: collision with root package name */
    public int f3203k;

    public k0(c cVar) {
        y0.f fVar = new y0.f(0L);
        t0 t0Var = t0.f3903k;
        this.f3197e = g0.d.J(fVar, t0Var);
        this.f3198f = g0.d.J(Boolean.FALSE, t0Var);
        f0 f0Var = new f0(cVar);
        f0Var.f3145f = new r0(6, this);
        this.f3199g = f0Var;
        this.f3200h = g0.d.I(0);
        this.f3201i = 1.0f;
        this.f3203k = -1;
    }

    @Override // e1.b
    public final void a(float f9) {
        this.f3201i = f9;
    }

    @Override // e1.b
    public final void b(z0.m mVar) {
        this.f3202j = mVar;
    }

    @Override // e1.b
    public final long d() {
        return ((y0.f) this.f3197e.getValue()).f9792a;
    }

    @Override // e1.b
    public final void e(r1.f0 f0Var) {
        b1.c cVar = f0Var.f7767f;
        z0.m mVar = this.f3202j;
        f0 f0Var2 = this.f3199g;
        if (mVar == null) {
            mVar = (z0.m) f0Var2.f3146g.getValue();
        }
        if (((Boolean) this.f3198f.getValue()).booleanValue() && f0Var.getLayoutDirection() == m2.k.f6323g) {
            long Q = cVar.Q();
            b1.b bVar = cVar.f1234g;
            long p6 = bVar.p();
            bVar.k().o();
            try {
                ((b6.c) bVar.f1230g).y(-1.0f, 1.0f, Q);
                f0Var2.e(f0Var, this.f3201i, mVar);
            } finally {
                a0.m.s(bVar, p6);
            }
        } else {
            f0Var2.e(f0Var, this.f3201i, mVar);
        }
        this.f3203k = this.f3200h.e();
    }
}
