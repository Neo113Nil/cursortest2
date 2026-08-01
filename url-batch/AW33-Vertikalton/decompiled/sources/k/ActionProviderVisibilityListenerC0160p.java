package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0160p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public B0.d f2731a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2733c;

    public ActionProviderVisibilityListenerC0160p(MenuItemC0164t menuItemC0164t, ActionProvider actionProvider) {
        this.f2733c = menuItemC0164t;
        this.f2732b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        B0.d dVar = this.f2731a;
        if (dVar != null) {
            MenuC0157m menuC0157m = ((C0159o) dVar.f59b).f2718n;
            menuC0157m.h = true;
            menuC0157m.p(true);
        }
    }
}
