package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0161p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0165t f2654c;

    public ActionProviderVisibilityListenerC0161p(MenuItemC0165t menuItemC0165t, ActionProvider actionProvider) {
        this.f2654c = menuItemC0165t;
        this.f2653b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2652a;
        if (gVar != null) {
            MenuC0158m menuC0158m = ((C0160o) gVar.f64b).f2639n;
            menuC0158m.h = true;
            menuC0158m.p(true);
        }
    }
}
