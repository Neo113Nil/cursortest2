package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0156k;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0251o, InterfaceC0156k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2924a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2924a = toolbar;
    }

    @Override // k.InterfaceC0156k
    public void e(MenuC0158m menuC0158m) {
        Toolbar toolbar = this.f2924a;
        C0243k c0243k = toolbar.f1226a.f1190t;
        if (c0243k == null || !c0243k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1215G.f432c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f793a.s();
            }
        }
    }

    @Override // k.InterfaceC0156k
    public boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        this.f2924a.getClass();
        return false;
    }
}
