package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0169p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2763a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0173t f2765c;

    public ActionProviderVisibilityListenerC0169p(MenuItemC0173t menuItemC0173t, ActionProvider actionProvider) {
        this.f2765c = menuItemC0173t;
        this.f2764b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2763a;
        if (gVar != null) {
            MenuC0166m menuC0166m = ((C0168o) gVar.f80b).f2750n;
            menuC0166m.h = true;
            menuC0166m.p(true);
        }
    }
}
