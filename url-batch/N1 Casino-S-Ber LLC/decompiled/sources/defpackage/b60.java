package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class b60 implements k1, kt {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ b60(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.kt
    public boolean i(mt mtVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.kt
    public void r(mt mtVar) {
        Toolbar toolbar = this.f;
        h1 h1Var = toolbar.f.y;
        if (h1Var == null || !h1Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.d).iterator();
            while (it.hasNext()) {
                ((vk) it.next()).a.s();
            }
        }
        h60 h60Var = toolbar.T;
        if (h60Var != null) {
            h60Var.r(mtVar);
        }
    }
}
