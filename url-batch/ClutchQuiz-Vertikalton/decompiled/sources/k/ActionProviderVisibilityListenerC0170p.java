package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0170p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public A0.h f2796a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0174t f2798c;

    public ActionProviderVisibilityListenerC0170p(MenuItemC0174t menuItemC0174t, ActionProvider actionProvider) {
        this.f2798c = menuItemC0174t;
        this.f2797b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        A0.h hVar = this.f2796a;
        if (hVar != null) {
            MenuC0167m menuC0167m = ((C0169o) hVar.f30b).f2783n;
            menuC0167m.h = true;
            menuC0167m.p(true);
        }
    }
}
