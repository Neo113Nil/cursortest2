package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gi implements MenuItem.OnActionExpandListener {
    final /* synthetic */ gk a;
    private final MenuItem.OnActionExpandListener b;

    public gi(gk gkVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = gkVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
