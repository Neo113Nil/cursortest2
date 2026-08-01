package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0158k;
import k.MenuC0160m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0231n, InterfaceC0158k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2927a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2927a = toolbar;
    }

    @Override // k.InterfaceC0158k
    public void q(MenuC0160m menuC0160m) {
        Toolbar toolbar = this.f2927a;
        C0225k c0225k = toolbar.f1329a.f1293t;
        if (c0225k == null || !c0225k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1318G.f476c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f902a.s();
            }
        }
    }

    @Override // k.InterfaceC0158k
    public boolean s(MenuC0160m menuC0160m, MenuItem menuItem) {
        this.f2927a.getClass();
        return false;
    }
}
