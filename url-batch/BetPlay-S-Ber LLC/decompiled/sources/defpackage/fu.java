package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fu implements ActionProvider.VisibilityListener {
    public j1 a;
    public final ActionProvider b;

    public fu(iu iuVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        j1 j1Var = this.a;
        if (j1Var != null) {
            au auVar = ((eu) j1Var.g).n;
            auVar.h = true;
            auVar.p(true);
        }
    }
}
