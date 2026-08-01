package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rw implements ActionProvider.VisibilityListener {
    public pw a;
    public final ActionProvider b;

    public rw(uw uwVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        pw pwVar = this.a;
        if (pwVar != null) {
            mw mwVar = ((qw) pwVar.f).n;
            mwVar.h = true;
            mwVar.p(true);
        }
    }
}
