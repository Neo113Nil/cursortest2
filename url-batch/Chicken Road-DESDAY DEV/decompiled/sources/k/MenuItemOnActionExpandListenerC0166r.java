package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0166r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0168t f2667b;

    public MenuItemOnActionExpandListenerC0166r(MenuItemC0168t menuItemC0168t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2667b = menuItemC0168t;
        this.f2666a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2666a.onMenuItemActionCollapse(this.f2667b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2666a.onMenuItemActionExpand(this.f2667b.g(menuItem));
    }
}
