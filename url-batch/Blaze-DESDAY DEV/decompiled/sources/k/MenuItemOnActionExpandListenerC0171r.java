package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0171r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0173t f2768b;

    public MenuItemOnActionExpandListenerC0171r(MenuItemC0173t menuItemC0173t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2768b = menuItemC0173t;
        this.f2767a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2767a.onMenuItemActionCollapse(this.f2768b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2767a.onMenuItemActionExpand(this.f2768b.g(menuItem));
    }
}
