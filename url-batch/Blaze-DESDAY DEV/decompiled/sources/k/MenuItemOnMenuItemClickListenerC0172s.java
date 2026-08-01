package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0172s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0173t f2770b;

    public MenuItemOnMenuItemClickListenerC0172s(MenuItemC0173t menuItemC0173t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2770b = menuItemC0173t;
        this.f2769a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2769a.onMenuItemClick(this.f2770b.g(menuItem));
    }
}
