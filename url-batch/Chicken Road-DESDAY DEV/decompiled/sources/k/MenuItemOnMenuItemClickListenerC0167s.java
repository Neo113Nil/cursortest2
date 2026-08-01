package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0167s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0168t f2669b;

    public MenuItemOnMenuItemClickListenerC0167s(MenuItemC0168t menuItemC0168t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2669b = menuItemC0168t;
        this.f2668a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2668a.onMenuItemClick(this.f2669b.g(menuItem));
    }
}
