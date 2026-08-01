package k;

import android.view.MenuItem;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0205r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0207t f3114b;

    public MenuItemOnActionExpandListenerC0205r(MenuItemC0207t menuItemC0207t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3114b = menuItemC0207t;
        this.f3113a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3113a.onMenuItemActionCollapse(this.f3114b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3113a.onMenuItemActionExpand(this.f3114b.g(menuItem));
    }
}
