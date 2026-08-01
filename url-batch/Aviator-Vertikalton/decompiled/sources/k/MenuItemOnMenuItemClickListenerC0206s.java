package k;

import android.view.MenuItem;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0206s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0207t f3116b;

    public MenuItemOnMenuItemClickListenerC0206s(MenuItemC0207t menuItemC0207t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3116b = menuItemC0207t;
        this.f3115a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3115a.onMenuItemClick(this.f3116b.g(menuItem));
    }
}
