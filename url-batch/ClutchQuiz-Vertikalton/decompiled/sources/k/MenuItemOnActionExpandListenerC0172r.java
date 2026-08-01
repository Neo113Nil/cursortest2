package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0172r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0174t f2801b;

    public MenuItemOnActionExpandListenerC0172r(MenuItemC0174t menuItemC0174t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2801b = menuItemC0174t;
        this.f2800a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2800a.onMenuItemActionCollapse(this.f2801b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2800a.onMenuItemActionExpand(this.f2801b.g(menuItem));
    }
}
