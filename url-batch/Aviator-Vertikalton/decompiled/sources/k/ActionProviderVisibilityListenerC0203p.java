package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0203p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public B0.d f3109a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0207t f3111c;

    public ActionProviderVisibilityListenerC0203p(MenuItemC0207t menuItemC0207t, ActionProvider actionProvider) {
        this.f3111c = menuItemC0207t;
        this.f3110b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        B0.d dVar = this.f3109a;
        if (dVar != null) {
            MenuC0200m menuC0200m = ((C0202o) dVar.f67b).f3096n;
            menuC0200m.h = true;
            menuC0200m.p(true);
        }
    }
}
