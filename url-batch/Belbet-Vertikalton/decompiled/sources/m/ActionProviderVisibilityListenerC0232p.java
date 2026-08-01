package m;

import android.view.ActionProvider;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0232p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C1.d f3398a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0236t f3400c;

    public ActionProviderVisibilityListenerC0232p(MenuItemC0236t menuItemC0236t, ActionProvider actionProvider) {
        this.f3400c = menuItemC0236t;
        this.f3399b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C1.d dVar = this.f3398a;
        if (dVar != null) {
            MenuC0229m menuC0229m = ((C0231o) dVar.f145b).f3385n;
            menuC0229m.f3354h = true;
            menuC0229m.p(true);
        }
    }
}
