package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kc implements y10 {
    public final AtomicReference a;

    public kc(ef efVar) {
        this.a = new AtomicReference(efVar);
    }

    @Override // defpackage.y10
    public final Iterator iterator() {
        y10 y10Var = (y10) this.a.getAndSet(null);
        if (y10Var != null) {
            return y10Var.iterator();
        }
        t8.t("This sequence can be consumed only once.");
        return null;
    }
}
