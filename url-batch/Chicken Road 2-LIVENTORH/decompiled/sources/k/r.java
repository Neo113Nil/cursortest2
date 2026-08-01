package k;

import android.view.MenuItem;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2113b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2113b = tVar;
        this.f2112a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2112a.onMenuItemActionCollapse(this.f2113b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2112a.onMenuItemActionExpand(this.f2113b.g(menuItem));
    }
}
