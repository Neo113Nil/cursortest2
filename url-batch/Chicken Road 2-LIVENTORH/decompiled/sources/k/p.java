package k;

import android.view.ActionProvider;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public a0.a f2109a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2110b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2110b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        a0.a aVar = this.f2109a;
        if (aVar != null) {
            m mVar = ((o) aVar.f81g).f2096n;
            mVar.f2066h = true;
            mVar.p(true);
        }
    }
}
