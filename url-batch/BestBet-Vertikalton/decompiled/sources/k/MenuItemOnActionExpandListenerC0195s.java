package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0195s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0197u f3219b;

    public MenuItemOnActionExpandListenerC0195s(MenuItemC0197u menuItemC0197u, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3219b = menuItemC0197u;
        this.f3218a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3218a.onMenuItemActionCollapse(this.f3219b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3218a.onMenuItemActionExpand(this.f3219b.g(menuItem));
    }
}
