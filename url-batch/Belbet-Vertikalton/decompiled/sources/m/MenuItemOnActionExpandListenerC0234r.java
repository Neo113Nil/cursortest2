package m;

import android.view.MenuItem;

/* renamed from: m.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0234r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0236t f3403b;

    public MenuItemOnActionExpandListenerC0234r(MenuItemC0236t menuItemC0236t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3403b = menuItemC0236t;
        this.f3402a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3402a.onMenuItemActionCollapse(this.f3403b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3402a.onMenuItemActionExpand(this.f3403b.g(menuItem));
    }
}
