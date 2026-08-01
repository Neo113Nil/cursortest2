package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0163s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0164t f2738b;

    public MenuItemOnMenuItemClickListenerC0163s(MenuItemC0164t menuItemC0164t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2738b = menuItemC0164t;
        this.f2737a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2737a.onMenuItemClick(this.f2738b.g(menuItem));
    }
}
