package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0162r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2719b;

    public MenuItemOnActionExpandListenerC0162r(MenuItemC0164t menuItemC0164t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2719b = menuItemC0164t;
        this.f2718a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2718a.onMenuItemActionCollapse(this.f2719b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2718a.onMenuItemActionExpand(this.f2719b.g(menuItem));
    }
}
