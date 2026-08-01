package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0169r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0171t f2740b;

    public MenuItemOnActionExpandListenerC0169r(MenuItemC0171t menuItemC0171t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2740b = menuItemC0171t;
        this.f2739a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2739a.onMenuItemActionCollapse(this.f2740b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2739a.onMenuItemActionExpand(this.f2740b.g(menuItem));
    }
}
