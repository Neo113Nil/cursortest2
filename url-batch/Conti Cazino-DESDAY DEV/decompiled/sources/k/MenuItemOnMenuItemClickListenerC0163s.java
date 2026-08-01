package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0163s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2742b;

    public MenuItemOnMenuItemClickListenerC0163s(MenuItemC0164t menuItemC0164t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2742b = menuItemC0164t;
        this.f2741a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2741a.onMenuItemClick(this.f2742b.g(menuItem));
    }
}
