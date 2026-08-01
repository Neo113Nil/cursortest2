package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0162k;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0222n, InterfaceC0162k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2864a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2864a = toolbar;
    }

    @Override // k.InterfaceC0162k
    public void o(MenuC0164m menuC0164m) {
        Toolbar toolbar = this.f2864a;
        C0216k c0216k = toolbar.f1343a.f1307t;
        if (c0216k == null || !c0216k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1332G.f475b).iterator();
            while (it.hasNext()) {
                ((Y.B) it.next()).f922a.s();
            }
        }
    }

    @Override // k.InterfaceC0162k
    public boolean p(MenuC0164m menuC0164m, MenuItem menuItem) {
        this.f2864a.getClass();
        return false;
    }
}
