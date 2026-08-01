package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0205p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public B0.d f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0209t f3115c;

    public ActionProviderVisibilityListenerC0205p(MenuItemC0209t menuItemC0209t, ActionProvider actionProvider) {
        this.f3115c = menuItemC0209t;
        this.f3114b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        B0.d dVar = this.f3113a;
        if (dVar != null) {
            MenuC0202m menuC0202m = ((C0204o) dVar.f66b).f3100n;
            menuC0202m.h = true;
            menuC0202m.p(true);
        }
    }
}
