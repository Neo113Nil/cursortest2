package g;

import android.view.MenuItem;
import k.InterfaceC0198k;
import k.MenuC0200m;
import l.b1;

/* renamed from: g.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147I implements b1, InterfaceC0198k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2496a;

    public /* synthetic */ C0147I(J j2) {
        this.f2496a = j2;
    }

    @Override // k.InterfaceC0198k
    public void e(MenuC0200m menuC0200m) {
        J j2 = this.f2496a;
        boolean p2 = j2.f2497a.f3352a.p();
        x xVar = j2.f2498b;
        if (p2) {
            xVar.onPanelClosed(108, menuC0200m);
        } else if (xVar.onPreparePanel(0, null, menuC0200m)) {
            xVar.onMenuOpened(108, menuC0200m);
        }
    }

    @Override // k.InterfaceC0198k
    public boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        return false;
    }
}
