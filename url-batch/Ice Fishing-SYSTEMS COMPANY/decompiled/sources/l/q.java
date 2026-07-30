package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f39004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f39005b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f39005b = sVar;
        this.f39004a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f39004a.onMenuItemActionCollapse(this.f39005b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f39004a.onMenuItemActionExpand(this.f39005b.g(menuItem));
    }
}
