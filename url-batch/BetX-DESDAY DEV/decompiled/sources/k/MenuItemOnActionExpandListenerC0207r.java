package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0207r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0209t f3118b;

    public MenuItemOnActionExpandListenerC0207r(MenuItemC0209t menuItemC0209t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3118b = menuItemC0209t;
        this.f3117a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3117a.onMenuItemActionCollapse(this.f3118b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3117a.onMenuItemActionExpand(this.f3118b.g(menuItem));
    }
}
