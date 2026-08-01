package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0163s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2720b;

    public MenuItemOnMenuItemClickListenerC0163s(MenuItemC0164t menuItemC0164t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2720b = menuItemC0164t;
        this.f2719a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2719a.onMenuItemClick(this.f2720b.g(menuItem));
    }
}
