package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mu1 extends vq1 {
    public final tm f;
    public boolean g;

    public mu1(tm tmVar, nu1 nu1Var) {
        super(nu1Var, tmVar.b);
        this.f = tmVar;
        this.g = true;
    }

    @Override // defpackage.vq1
    public final void a() {
        tm tmVar = this.f;
        switch (tmVar.d) {
            case 0:
                ((iz) tmVar.e).b();
                break;
        }
    }

    @Override // defpackage.vq1
    public final void b() {
        tm tmVar = this.f;
        switch (tmVar.d) {
            case 0:
                ((iz) tmVar.e).c();
                break;
            case 1:
                as0 as0Var = (as0) tmVar.e;
                as0Var.x(true);
                if (!as0Var.h.b) {
                    as0Var.g.b().a();
                    break;
                } else {
                    as0Var.M();
                    break;
                }
            case 2:
                ((up1) tmVar.e).l();
                break;
            default:
                ((g9) tmVar.e).invoke(tmVar);
                break;
        }
    }

    @Override // defpackage.vq1
    public final void c(sq1 sq1Var) {
        rm rmVar = new rm(sq1Var);
        tm tmVar = this.f;
        switch (tmVar.d) {
            case 0:
                lq lqVar = ((iz) tmVar.e).e;
                if (lqVar != null) {
                    lqVar.d(rmVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vq1
    public final void d(sq1 sq1Var) {
        sq1Var.getClass();
        new rm(sq1Var);
        tm tmVar = this.f;
        switch (tmVar.d) {
            case 0:
                ((iz) tmVar.e).d();
                break;
        }
    }

    public final void g(boolean z) {
        this.g = z;
        f(z && this.f.b);
    }
}
