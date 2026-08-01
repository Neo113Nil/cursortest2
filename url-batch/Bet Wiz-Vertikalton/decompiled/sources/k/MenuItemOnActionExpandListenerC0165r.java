package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0165r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0167t f2716b;

    public MenuItemOnActionExpandListenerC0165r(MenuItemC0167t menuItemC0167t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2716b = menuItemC0167t;
        this.f2715a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2715a.onMenuItemActionCollapse(this.f2716b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2715a.onMenuItemActionExpand(this.f2716b.g(menuItem));
    }
}
