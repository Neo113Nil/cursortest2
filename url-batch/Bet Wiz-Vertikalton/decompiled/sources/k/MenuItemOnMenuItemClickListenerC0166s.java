package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0166s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0167t f2718b;

    public MenuItemOnMenuItemClickListenerC0166s(MenuItemC0167t menuItemC0167t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2718b = menuItemC0167t;
        this.f2717a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2717a.onMenuItemClick(this.f2718b.g(menuItem));
    }
}
