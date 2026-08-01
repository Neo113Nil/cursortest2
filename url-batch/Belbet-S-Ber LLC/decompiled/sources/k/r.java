package k;

import android.view.MenuItem;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2261b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2261b = tVar;
        this.f2260a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2260a.onMenuItemActionCollapse(this.f2261b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2260a.onMenuItemActionExpand(this.f2261b.g(menuItem));
    }
}
