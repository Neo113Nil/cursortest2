package m;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.InterfaceC0167k;
import l.MenuC0169m;

/* loaded from: classes.dex */
public final class c1 implements InterfaceC0227n, InterfaceC0167k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3076a;

    public /* synthetic */ c1(Toolbar toolbar) {
        this.f3076a = toolbar;
    }

    @Override // l.InterfaceC0167k
    public boolean o(MenuC0169m menuC0169m, MenuItem menuItem) {
        this.f3076a.getClass();
        return false;
    }

    @Override // l.InterfaceC0167k
    public void q(MenuC0169m menuC0169m) {
        Toolbar toolbar = this.f3076a;
        C0221k c0221k = toolbar.f1429a.f1392t;
        if (c0221k == null || !c0221k.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.f543b).iterator();
            while (it.hasNext()) {
                ((Z.B) it.next()).f992a.s();
            }
        }
    }
}
