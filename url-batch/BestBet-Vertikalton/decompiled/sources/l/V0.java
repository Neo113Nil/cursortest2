package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0187k;
import k.MenuC0189m;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0248n, InterfaceC0187k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3341a;

    public /* synthetic */ V0(Toolbar toolbar) {
        this.f3341a = toolbar;
    }

    @Override // k.InterfaceC0187k
    public void f(MenuC0189m menuC0189m) {
        Toolbar toolbar = this.f3341a;
        C0242k c0242k = toolbar.f1747a.f1711t;
        if (c0242k == null || !c0242k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1736G.f4191b).iterator();
            while (it.hasNext()) {
                ((Y.B) it.next()).f1282a.s();
            }
        }
    }

    @Override // k.InterfaceC0187k
    public boolean g(MenuC0189m menuC0189m, MenuItem menuItem) {
        this.f3341a.getClass();
        return false;
    }
}
