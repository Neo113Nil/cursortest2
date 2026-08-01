package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qt implements ActionProvider.VisibilityListener {
    public mr a;
    public final ActionProvider b;

    public qt(tt ttVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        mr mrVar = this.a;
        if (mrVar != null) {
            mt mtVar = ((pt) mrVar.f).n;
            mtVar.h = true;
            mtVar.p(true);
        }
    }
}
