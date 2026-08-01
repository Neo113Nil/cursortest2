package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0159k;
import k.MenuC0161m;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0232n, InterfaceC0159k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2872a;

    public /* synthetic */ X0(Toolbar toolbar) {
        this.f2872a = toolbar;
    }

    @Override // k.InterfaceC0159k
    public void o(MenuC0161m menuC0161m) {
        Toolbar toolbar = this.f2872a;
        C0226k c0226k = toolbar.f1284a.f1248t;
        if (c0226k == null || !c0226k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1273G.f423c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f862a.s();
            }
        }
    }

    @Override // k.InterfaceC0159k
    public boolean q(MenuC0161m menuC0161m, MenuItem menuItem) {
        this.f2872a.getClass();
        return false;
    }
}
