package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kd implements x40 {
    public final AtomicReference a;

    public kd(x40 x40Var) {
        this.a = new AtomicReference(x40Var);
    }

    @Override // defpackage.x40
    public final Iterator iterator() {
        x40 x40Var = (x40) this.a.getAndSet(null);
        if (x40Var != null) {
            return x40Var.iterator();
        }
        g9.s("This sequence can be consumed only once.");
        return null;
    }
}
