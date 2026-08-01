package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pi0 implements o1, p10 {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ pi0(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.p10
    public boolean g(r10 r10Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.p10
    public void o(r10 r10Var) {
        Toolbar toolbar = this.f;
        l1 l1Var = toolbar.f.y;
        if (l1Var == null || !l1Var.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.d).iterator();
            while (it.hasNext()) {
                ((eq) it.next()).a.s();
            }
        }
        vi0 vi0Var = toolbar.T;
        if (vi0Var != null) {
            vi0Var.o(r10Var);
        }
    }
}
