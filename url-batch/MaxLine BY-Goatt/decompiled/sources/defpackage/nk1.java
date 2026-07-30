package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nk1 implements ActionProvider.VisibilityListener {
    public at0 a;
    public final ActionProvider b;

    public nk1(qk1 qk1Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        at0 at0Var = this.a;
        if (at0Var != null) {
            fk1 fk1Var = ((lk1) at0Var.m).n;
            fk1Var.h = true;
            fk1Var.p(true);
        }
    }
}
