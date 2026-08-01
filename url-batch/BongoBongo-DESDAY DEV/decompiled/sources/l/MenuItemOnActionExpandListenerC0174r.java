package l;

import android.view.MenuItem;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0174r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0176t f2872b;

    public MenuItemOnActionExpandListenerC0174r(MenuItemC0176t menuItemC0176t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2872b = menuItemC0176t;
        this.f2871a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2871a.onMenuItemActionCollapse(this.f2872b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2871a.onMenuItemActionExpand(this.f2872b.g(menuItem));
    }
}
