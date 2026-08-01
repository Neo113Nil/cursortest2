package g;

import android.view.MenuItem;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.a1;

/* renamed from: g.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148I implements a1, InterfaceC0200k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2500a;

    public /* synthetic */ C0148I(J j2) {
        this.f2500a = j2;
    }

    @Override // k.InterfaceC0200k
    public void p(MenuC0202m menuC0202m) {
        J j2 = this.f2500a;
        boolean p2 = j2.f2501a.f3352a.p();
        x xVar = j2.f2502b;
        if (p2) {
            xVar.onPanelClosed(108, menuC0202m);
        } else if (xVar.onPreparePanel(0, null, menuC0202m)) {
            xVar.onMenuOpened(108, menuC0202m);
        }
    }

    @Override // k.InterfaceC0200k
    public boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        return false;
    }
}
