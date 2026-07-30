package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zq0 extends mr0 {
    public final /* synthetic */ fr0 m;

    public zq0(fr0 fr0Var) {
        this.m = fr0Var;
    }

    @Override // defpackage.mr0
    public final View b(int i) {
        fr0 fr0Var = this.m;
        View view = fr0Var.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        lh.g(q40.k("Fragment ", fr0Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.mr0
    public final boolean c() {
        return this.m.mView != null;
    }
}
