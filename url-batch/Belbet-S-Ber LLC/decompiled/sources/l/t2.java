package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t2 implements m, k.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2569f;

    public /* synthetic */ t2(Toolbar toolbar) {
        this.f2569f = toolbar;
    }

    @Override // k.k
    public boolean q(k.m mVar, MenuItem menuItem) {
        this.f2569f.getClass();
        return false;
    }

    @Override // k.k
    public void z(k.m mVar) {
        Toolbar toolbar = this.f2569f;
        j jVar = toolbar.f345f.f331y;
        if (jVar == null || !jVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.f473b).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.d0) it.next()).f530a.t();
            }
        }
    }
}
