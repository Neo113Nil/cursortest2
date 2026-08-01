package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0163p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0167t f2713c;

    public ActionProviderVisibilityListenerC0163p(MenuItemC0167t menuItemC0167t, ActionProvider actionProvider) {
        this.f2713c = menuItemC0167t;
        this.f2712b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2711a;
        if (gVar != null) {
            MenuC0160m menuC0160m = ((C0162o) gVar.f67b).f2698n;
            menuC0160m.h = true;
            menuC0160m.p(true);
        }
    }
}
