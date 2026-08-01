package j;

import android.view.ActionProvider;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public a2.e f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2235b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2235b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        a2.e eVar = this.f2234a;
        if (eVar != null) {
            m mVar = ((o) eVar.g).f2221n;
            mVar.h = true;
            mVar.p(true);
        }
    }
}
