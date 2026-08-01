package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0173s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0174t f2803b;

    public MenuItemOnMenuItemClickListenerC0173s(MenuItemC0174t menuItemC0174t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2803b = menuItemC0174t;
        this.f2802a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2802a.onMenuItemClick(this.f2803b.g(menuItem));
    }
}
