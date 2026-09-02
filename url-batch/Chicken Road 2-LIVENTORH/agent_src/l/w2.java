package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w2 implements o, k.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2489f;

    public /* synthetic */ w2(Toolbar toolbar) {
        this.f2489f = toolbar;
    }

    @Override // k.k
    public boolean k(k.m mVar, MenuItem menuItem) {
        this.f2489f.getClass();
        return false;
    }

    @Override // k.k
    public void v(k.m mVar) {
        Toolbar toolbar = this.f2489f;
        l lVar = toolbar.f218f.f202y;
        if (lVar == null || !lVar.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.f356c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.d0) it.next()).f416a.s();
            }
        }
    }
}
