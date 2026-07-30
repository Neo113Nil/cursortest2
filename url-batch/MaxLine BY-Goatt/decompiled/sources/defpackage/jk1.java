package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jk1 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public jk1(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ur0) ((al1) it.next())).a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(al1 al1Var) {
        this.b.remove(al1Var);
        ik1 ik1Var = (ik1) this.c.remove(al1Var);
        if (ik1Var != null) {
            ik1Var.a.c(ik1Var.b);
            ik1Var.b = null;
        }
        this.a.run();
    }
}
