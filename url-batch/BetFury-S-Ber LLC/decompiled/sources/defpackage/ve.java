package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ve implements vc0 {
    public final AtomicReference a;

    public ve(vc0 vc0Var) {
        this.a = new AtomicReference(vc0Var);
    }

    @Override // defpackage.vc0
    public final Iterator iterator() {
        vc0 vc0Var = (vc0) this.a.getAndSet(null);
        if (vc0Var != null) {
            return vc0Var.iterator();
        }
        s9.u("This sequence can be consumed only once.");
        return null;
    }
}
