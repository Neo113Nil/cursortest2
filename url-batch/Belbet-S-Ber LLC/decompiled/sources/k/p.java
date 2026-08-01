package k;

import android.view.ActionProvider;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public a0.a f2257a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2258b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2258b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        a0.a aVar = this.f2257a;
        if (aVar != null) {
            m mVar = ((o) aVar.f79g).f2244n;
            mVar.h = true;
            mVar.p(true);
        }
    }
}
