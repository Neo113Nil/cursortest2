package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class oc implements i20 {
    public final AtomicReference a;

    public oc(df dfVar) {
        this.a = new AtomicReference(dfVar);
    }

    @Override // defpackage.i20
    public final Iterator iterator() {
        i20 i20Var = (i20) this.a.getAndSet(null);
        if (i20Var != null) {
            return i20Var.iterator();
        }
        o8.t("This sequence can be consumed only once.");
        return null;
    }
}
