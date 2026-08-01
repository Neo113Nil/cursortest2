package l;

import android.view.ActionProvider;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0172p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public D.g f2867a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0176t f2869c;

    public ActionProviderVisibilityListenerC0172p(MenuItemC0176t menuItemC0176t, ActionProvider actionProvider) {
        this.f2869c = menuItemC0176t;
        this.f2868b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        D.g gVar = this.f2867a;
        if (gVar != null) {
            MenuC0169m menuC0169m = ((C0171o) gVar.f122b).f2854n;
            menuC0169m.f2821h = true;
            menuC0169m.p(true);
        }
    }
}
