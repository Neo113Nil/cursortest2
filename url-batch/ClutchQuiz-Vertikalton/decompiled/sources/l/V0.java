package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0165k;
import k.MenuC0167m;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0227n, InterfaceC0165k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2921a;

    public /* synthetic */ V0(Toolbar toolbar) {
        this.f2921a = toolbar;
    }

    @Override // k.InterfaceC0165k
    public void p(MenuC0167m menuC0167m) {
        Toolbar toolbar = this.f2921a;
        C0221k c0221k = toolbar.f1366a.f1327t;
        if (c0221k == null || !c0221k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1355G.f423c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f928a.s();
            }
        }
    }

    @Override // k.InterfaceC0165k
    public boolean q(MenuC0167m menuC0167m, MenuItem menuItem) {
        this.f2921a.getClass();
        return false;
    }
}
