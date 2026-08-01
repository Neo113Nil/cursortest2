package m;

import android.view.MenuItem;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0235s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0236t f3405b;

    public MenuItemOnMenuItemClickListenerC0235s(MenuItemC0236t menuItemC0236t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3405b = menuItemC0236t;
        this.f3404a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3404a.onMenuItemClick(this.f3405b.g(menuItem));
    }
}
