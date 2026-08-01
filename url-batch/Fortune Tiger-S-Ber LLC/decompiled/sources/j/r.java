package j;

import android.view.MenuItem;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2238b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2238b = tVar;
        this.f2237a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2237a.onMenuItemActionCollapse(this.f2238b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2237a.onMenuItemActionExpand(this.f2238b.g(menuItem));
    }
}
