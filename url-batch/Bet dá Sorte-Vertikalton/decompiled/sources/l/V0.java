package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0155k;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0225n, InterfaceC0155k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2906a;

    public /* synthetic */ V0(Toolbar toolbar) {
        this.f2906a = toolbar;
    }

    @Override // k.InterfaceC0155k
    public void q(MenuC0157m menuC0157m) {
        Toolbar toolbar = this.f2906a;
        C0219k c0219k = toolbar.f1301a.f1262t;
        if (c0219k == null || !c0219k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1290G.f405c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f876a.s();
            }
        }
    }

    @Override // k.InterfaceC0155k
    public boolean s(MenuC0157m menuC0157m, MenuItem menuItem) {
        this.f2906a.getClass();
        return false;
    }
}
