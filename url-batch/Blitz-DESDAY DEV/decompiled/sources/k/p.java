package k;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public E.g f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f2817c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2817c = tVar;
        this.f2816b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        E.g gVar = this.f2815a;
        if (gVar != null) {
            m mVar = ((o) gVar.f170b).f2802n;
            mVar.h = true;
            mVar.p(true);
        }
    }
}
