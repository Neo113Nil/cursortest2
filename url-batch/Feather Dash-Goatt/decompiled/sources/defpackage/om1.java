package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class om1 extends mu0 {
    public final av0 d = gb0.F(new va1(0));
    public final av0 e = gb0.F(Boolean.FALSE);
    public final jm1 f;
    public final av0 g;
    public float h;

    public om1(q50 q50Var) {
        jm1 jm1Var = new jm1(q50Var);
        jm1Var.f = new ce(13, this);
        this.f = jm1Var;
        this.g = new av0(Unit.a, j50.A);
        this.h = 1.0f;
    }

    @Override // defpackage.mu0
    public final void a(float f) {
        this.h = f;
    }

    @Override // defpackage.mu0
    public final long c() {
        return ((va1) this.d.getValue()).a;
    }

    @Override // defpackage.mu0
    public final void d(hu huVar) {
        jm1 jm1Var = this.f;
        md mdVar = (md) jm1Var.g.getValue();
        if (((Boolean) this.e.getValue()).booleanValue() && huVar.getLayoutDirection() == vc0.e) {
            long N = huVar.N();
            i8 v = huVar.v();
            long i = v.i();
            v.g().k();
            try {
                ((s40) v.e).x(-1.0f, 1.0f, N);
                jm1Var.e(huVar, this.h, mdVar);
            } finally {
                qy0.s(v, i);
            }
        } else {
            jm1Var.e(huVar, this.h, mdVar);
        }
        this.g.getValue();
    }
}
