package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0156k;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0231o, InterfaceC0156k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3019a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f3019a = toolbar;
    }

    @Override // k.InterfaceC0156k
    public void e(MenuC0158m menuC0158m) {
        Toolbar toolbar = this.f3019a;
        C0223k c0223k = toolbar.f1259a.f1223t;
        if (c0223k == null || !c0223k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1248G.f416c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f833a.s();
            }
        }
    }

    @Override // k.InterfaceC0156k
    public boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        this.f3019a.getClass();
        return false;
    }
}
