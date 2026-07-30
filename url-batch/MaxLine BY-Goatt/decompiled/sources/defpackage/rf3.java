package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rf3 extends uf3 {
    public final /* synthetic */ boolean q;
    public final /* synthetic */ dg3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf3(dg3 dg3Var, boolean z) {
        super(dg3Var, true);
        this.q = z;
        this.r = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        he3 he3Var = this.r.f;
        ll3.v(he3Var);
        he3Var.setDataCollectionEnabled(this.q);
    }
}
