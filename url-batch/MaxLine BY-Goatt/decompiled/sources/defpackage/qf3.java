package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qf3 extends uf3 {
    public final /* synthetic */ ee3 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ dg3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf3(dg3 dg3Var, ee3 ee3Var, int i) {
        super(dg3Var, true);
        this.q = ee3Var;
        this.r = i;
        Objects.requireNonNull(dg3Var);
        this.s = dg3Var;
    }

    @Override // defpackage.uf3
    public final void a() {
        he3 he3Var = this.s.f;
        ll3.v(he3Var);
        he3Var.getTestFlag(this.q, this.r);
    }

    @Override // defpackage.uf3
    public final void b() {
        this.q.m(null);
    }
}
