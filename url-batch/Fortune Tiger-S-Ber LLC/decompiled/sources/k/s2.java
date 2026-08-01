package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s2 implements n, j.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2649f;

    public /* synthetic */ s2(Toolbar toolbar) {
        this.f2649f = toolbar;
    }

    @Override // j.k
    public void j(j.m mVar) {
        Toolbar toolbar = this.f2649f;
        k kVar = toolbar.f236f.f223y;
        if (kVar == null || !kVar.f()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.d0) it.next()).f414a.s();
            }
        }
    }

    @Override // j.k
    public boolean l(j.m mVar, MenuItem menuItem) {
        this.f2649f.getClass();
        return false;
    }
}
