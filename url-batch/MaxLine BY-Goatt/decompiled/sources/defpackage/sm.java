package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sm extends vq1 {
    public final /* synthetic */ iz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(iz izVar, x32 x32Var) {
        super(x32Var, false);
        this.f = izVar;
    }

    @Override // defpackage.vq1
    public final void a() {
        this.f.b();
    }

    @Override // defpackage.vq1
    public final void b() {
        this.f.c();
    }

    @Override // defpackage.vq1
    public final void c(sq1 sq1Var) {
        rm rmVar = new rm(sq1Var);
        lq lqVar = this.f.e;
        if (lqVar != null) {
            lqVar.d(rmVar);
        }
    }

    @Override // defpackage.vq1
    public final void d(sq1 sq1Var) {
        sq1Var.getClass();
        this.f.d();
    }
}
