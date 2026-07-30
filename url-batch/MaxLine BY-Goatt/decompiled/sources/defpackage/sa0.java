package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sa0 extends mr0 {
    public final /* synthetic */ mr0 m;
    public final /* synthetic */ ta0 n;

    public sa0(ta0 ta0Var, mr0 mr0Var) {
        this.n = ta0Var;
        this.m = mr0Var;
    }

    @Override // defpackage.mr0
    public final View b(int i) {
        mr0 mr0Var = this.m;
        return mr0Var.c() ? mr0Var.b(i) : this.n.onFindViewById(i);
    }

    @Override // defpackage.mr0
    public final boolean c() {
        return this.m.c() || this.n.onHasView();
    }
}
