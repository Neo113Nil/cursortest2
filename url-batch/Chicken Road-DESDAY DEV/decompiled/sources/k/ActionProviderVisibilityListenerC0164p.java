package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0164p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0168t f2664c;

    public ActionProviderVisibilityListenerC0164p(MenuItemC0168t menuItemC0168t, ActionProvider actionProvider) {
        this.f2664c = menuItemC0168t;
        this.f2663b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2662a;
        if (gVar != null) {
            MenuC0161m menuC0161m = ((C0163o) gVar.f66b).f2649n;
            menuC0161m.h = true;
            menuC0161m.p(true);
        }
    }
}
