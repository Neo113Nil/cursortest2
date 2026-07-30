package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cy2 implements h3, dk1 {
    public final /* synthetic */ Toolbar m;

    public /* synthetic */ cy2(Toolbar toolbar) {
        this.m = toolbar;
    }

    @Override // defpackage.dk1
    public boolean e(fk1 fk1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.dk1
    public void k(fk1 fk1Var) {
        Toolbar toolbar = this.m;
        e3 e3Var = toolbar.m.F;
        if (e3Var == null || !e3Var.h()) {
            Iterator it = toolbar.S.b.iterator();
            while (it.hasNext()) {
                ((ur0) ((al1) it.next())).a.s(fk1Var);
            }
        }
    }
}
