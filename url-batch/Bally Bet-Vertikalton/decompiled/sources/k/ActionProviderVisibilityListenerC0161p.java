package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0161p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public B0.d f2719a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0165t f2721c;

    public ActionProviderVisibilityListenerC0161p(MenuItemC0165t menuItemC0165t, ActionProvider actionProvider) {
        this.f2721c = menuItemC0165t;
        this.f2720b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        B0.d dVar = this.f2719a;
        if (dVar != null) {
            MenuC0158m menuC0158m = ((C0160o) dVar.f59b).f2706n;
            menuC0158m.h = true;
            menuC0158m.p(true);
        }
    }
}
