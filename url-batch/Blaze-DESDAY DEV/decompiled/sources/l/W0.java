package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0164k;
import k.MenuC0166m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0225n, InterfaceC0164k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2891a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2891a = toolbar;
    }

    @Override // k.InterfaceC0164k
    public void p(MenuC0166m menuC0166m) {
        Toolbar toolbar = this.f2891a;
        C0219k c0219k = toolbar.f1374a.f1338t;
        if (c0219k == null || !c0219k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1363G.f492b).iterator();
            while (it.hasNext()) {
                ((Y.B) it.next()).f949a.s();
            }
        }
    }

    @Override // k.InterfaceC0164k
    public boolean r(MenuC0166m menuC0166m, MenuItem menuItem) {
        this.f2891a.getClass();
        return false;
    }
}
