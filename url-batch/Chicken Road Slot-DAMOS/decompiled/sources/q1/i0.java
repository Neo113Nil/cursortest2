package q1;

import kotlin.Unit;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends p1.b {

    /* renamed from: e, reason: collision with root package name */
    public final j1 f7894e = n0.h.r(new j1.e(0));

    /* renamed from: f, reason: collision with root package name */
    public final j1 f7895f = n0.h.r(Boolean.FALSE);
    public final e0 g;

    /* renamed from: h, reason: collision with root package name */
    public final j1 f7896h;

    /* renamed from: i, reason: collision with root package name */
    public float f7897i;
    public k1.j j;

    public i0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f7840f = new a2.a0(9, this);
        this.g = e0Var;
        this.f7896h = new j1(Unit.f5554a, n0.e.f6660r);
        this.f7897i = 1.0f;
    }

    @Override // p1.b
    public final void a(float f3) {
        this.f7897i = f3;
    }

    @Override // p1.b
    public final void b(k1.j jVar) {
        this.j = jVar;
    }

    @Override // p1.b
    public final long d() {
        return ((j1.e) this.f7894e.getValue()).f4927a;
    }

    @Override // p1.b
    public final void e(m1.d dVar) {
        k1.j jVar = this.j;
        e0 e0Var = this.g;
        if (jVar == null) {
            jVar = (k1.j) e0Var.g.getValue();
        }
        if (((Boolean) this.f7895f.getValue()).booleanValue() && dVar.getLayoutDirection() == x2.l.f10331e) {
            long E = dVar.E();
            a1.n s3 = dVar.s();
            long u2 = s3.u();
            s3.p().h();
            try {
                ((l.d) s3.f41i).z(-1.0f, 1.0f, E);
                e0Var.e(dVar, this.f7897i, jVar);
            } finally {
                s3.p().f();
                s3.K(u2);
            }
        } else {
            e0Var.e(dVar, this.f7897i, jVar);
        }
        this.f7896h.getValue();
    }
}
