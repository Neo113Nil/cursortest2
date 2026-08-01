package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0160p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.h f2698a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2700c;

    public ActionProviderVisibilityListenerC0160p(MenuItemC0164t menuItemC0164t, ActionProvider actionProvider) {
        this.f2700c = menuItemC0164t;
        this.f2699b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.h hVar = this.f2698a;
        if (hVar != null) {
            MenuC0157m menuC0157m = ((C0159o) hVar.f150b).f2685n;
            menuC0157m.h = true;
            menuC0157m.p(true);
        }
    }
}
