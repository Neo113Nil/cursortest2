package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0162r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2718b;

    public MenuItemOnActionExpandListenerC0162r(MenuItemC0164t menuItemC0164t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2718b = menuItemC0164t;
        this.f2717a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2717a.onMenuItemActionCollapse(this.f2718b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2717a.onMenuItemActionExpand(this.f2718b.g(menuItem));
    }
}
