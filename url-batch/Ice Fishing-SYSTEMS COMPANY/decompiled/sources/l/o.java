package l;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public h8.d f39000a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f39001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f39002c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f39002c = sVar;
        this.f39001b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z8) {
        h8.d dVar = this.f39000a;
        if (dVar != null) {
            l lVar = ((n) dVar.f38261u).f38978G;
            lVar.f38946A = true;
            lVar.p(true);
        }
    }
}
