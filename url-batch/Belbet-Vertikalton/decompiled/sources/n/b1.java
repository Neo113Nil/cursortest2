package n;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.InterfaceC0227k;
import m.MenuC0229m;

/* loaded from: classes.dex */
public final class b1 implements InterfaceC0290o, InterfaceC0227k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3601a;

    public /* synthetic */ b1(Toolbar toolbar) {
        this.f3601a = toolbar;
    }

    @Override // m.InterfaceC0227k
    public boolean c(MenuC0229m menuC0229m, MenuItem menuItem) {
        this.f3601a.getClass();
        return false;
    }

    @Override // m.InterfaceC0227k
    public void f(MenuC0229m menuC0229m) {
        Toolbar toolbar = this.f3601a;
        C0282k c0282k = toolbar.f1793a.f1757t;
        if (c0282k == null || !c0282k.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1783G.f592c).iterator();
            while (it.hasNext()) {
                ((Z.B) it.next()).f1424a.s();
            }
        }
    }
}
