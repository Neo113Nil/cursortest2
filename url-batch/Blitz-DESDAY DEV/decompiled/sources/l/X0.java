package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0201n, k.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2945a;

    public /* synthetic */ X0(Toolbar toolbar) {
        this.f2945a = toolbar;
    }

    @Override // k.k
    public void o(k.m mVar) {
        Toolbar toolbar = this.f2945a;
        C0195k c0195k = toolbar.f1431a.f1395t;
        if (c0195k == null || !c0195k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1421G.f81c).iterator();
            while (it.hasNext()) {
                ((Z.B) it.next()).f1011a.s();
            }
        }
    }

    @Override // k.k
    public boolean q(k.m mVar, MenuItem menuItem) {
        this.f2945a.getClass();
        return false;
    }
}
