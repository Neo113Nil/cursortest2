package k;

import android.view.ActionProvider;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0193q implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C0191o f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0197u f3216c;

    public ActionProviderVisibilityListenerC0193q(MenuItemC0197u menuItemC0197u, ActionProvider actionProvider) {
        this.f3216c = menuItemC0197u;
        this.f3215b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0191o c0191o = this.f3214a;
        if (c0191o != null) {
            MenuC0189m menuC0189m = ((C0192p) c0191o.f3187a).f3201n;
            menuC0189m.h = true;
            menuC0189m.p(true);
        }
    }
}
