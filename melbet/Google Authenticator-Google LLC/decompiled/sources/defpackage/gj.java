package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gj implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ gk a;
    private final MenuItem.OnMenuItemClickListener b;

    public gj(gk gkVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = gkVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
