package l;

import K.InterfaceC0021q;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import g.C0148I;
import java.util.Iterator;
import k.InterfaceC0200k;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0276n, InterfaceC0200k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3316a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f3316a = toolbar;
    }

    @Override // k.InterfaceC0200k
    public void p(MenuC0202m menuC0202m) {
        Toolbar toolbar = this.f3316a;
        C0270k c0270k = toolbar.f1081a.f1041t;
        if (c0270k == null || !c0270k.i()) {
            Iterator it = toolbar.f1067G.f481b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1199a.s();
            }
        }
        C0148I c0148i = toolbar.f1075O;
        if (c0148i != null) {
            c0148i.p(menuC0202m);
        }
    }

    @Override // k.InterfaceC0200k
    public boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        C0148I c0148i = this.f3316a.f1075O;
        return false;
    }
}
