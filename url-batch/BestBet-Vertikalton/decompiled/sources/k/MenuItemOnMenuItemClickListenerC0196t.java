package k;

import android.view.MenuItem;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0196t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0197u f3221b;

    public MenuItemOnMenuItemClickListenerC0196t(MenuItemC0197u menuItemC0197u, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3221b = menuItemC0197u;
        this.f3220a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3220a.onMenuItemClick(this.f3221b.g(menuItem));
    }
}
