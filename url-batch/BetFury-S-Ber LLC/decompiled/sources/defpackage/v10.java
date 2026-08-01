package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v10 implements ActionProvider.VisibilityListener {
    public kz a;
    public final ActionProvider b;

    public v10(y10 y10Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        kz kzVar = this.a;
        if (kzVar != null) {
            r10 r10Var = ((u10) kzVar.f).n;
            r10Var.h = true;
            r10Var.p(true);
        }
    }
}
