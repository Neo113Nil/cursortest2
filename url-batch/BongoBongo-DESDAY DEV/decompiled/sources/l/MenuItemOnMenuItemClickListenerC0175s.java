package l;

import android.view.MenuItem;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0175s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0176t f2874b;

    public MenuItemOnMenuItemClickListenerC0175s(MenuItemC0176t menuItemC0176t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2874b = menuItemC0176t;
        this.f2873a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2873a.onMenuItemClick(this.f2874b.g(menuItem));
    }
}
