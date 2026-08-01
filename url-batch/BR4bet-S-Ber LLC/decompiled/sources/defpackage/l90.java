package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l90 implements l1, kw {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ l90(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.kw
    public boolean g(mw mwVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.kw
    public void q(mw mwVar) {
        Toolbar toolbar = this.f;
        i1 i1Var = toolbar.f.y;
        if (i1Var == null || !i1Var.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.i).iterator();
            while (it.hasNext()) {
                ((ym) it.next()).a.s();
            }
        }
    }
}
