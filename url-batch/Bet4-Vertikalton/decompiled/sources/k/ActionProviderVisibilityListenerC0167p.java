package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0167p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2735a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0171t f2737c;

    public ActionProviderVisibilityListenerC0167p(MenuItemC0171t menuItemC0171t, ActionProvider actionProvider) {
        this.f2737c = menuItemC0171t;
        this.f2736b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2735a;
        if (gVar != null) {
            MenuC0164m menuC0164m = ((C0166o) gVar.f115b).f2722n;
            menuC0164m.h = true;
            menuC0164m.p(true);
        }
    }
}
