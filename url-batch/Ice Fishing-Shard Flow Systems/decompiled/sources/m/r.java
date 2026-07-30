package m;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f6468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6469b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6469b = tVar;
        this.f6468a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f6468a.onMenuItemActionCollapse(this.f6469b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f6468a.onMenuItemActionExpand(this.f6469b.f(menuItem));
    }
}
