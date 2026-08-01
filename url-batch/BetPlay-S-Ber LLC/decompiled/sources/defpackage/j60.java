package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j60 implements n1, yt {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ j60(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.yt
    public boolean f(au auVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.yt
    public void m(au auVar) {
        Toolbar toolbar = this.f;
        k1 k1Var = toolbar.f.y;
        if (k1Var == null || !k1Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.d).iterator();
            while (it.hasNext()) {
                ((rk) it.next()).a.s(auVar);
            }
        }
    }
}
