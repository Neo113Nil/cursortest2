package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0163r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0165t f2724b;

    public MenuItemOnActionExpandListenerC0163r(MenuItemC0165t menuItemC0165t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2724b = menuItemC0165t;
        this.f2723a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2723a.onMenuItemActionCollapse(this.f2724b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2723a.onMenuItemActionExpand(this.f2724b.g(menuItem));
    }
}
