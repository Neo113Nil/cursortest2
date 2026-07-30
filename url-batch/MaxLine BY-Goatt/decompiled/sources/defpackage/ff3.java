package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ff3 extends uf3 {
    public final /* synthetic */ dg3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff3(dg3 dg3Var) {
        super(dg3Var, true);
        Objects.requireNonNull(dg3Var);
        this.q = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        he3 he3Var = this.q.f;
        ll3.v(he3Var);
        he3Var.resetAnalyticsData(this.m);
    }
}
