package d1;

import W0.I;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: g, reason: collision with root package name */
    public b f1833g;

    @Override // W0.AbstractC0078s
    public final void c(G0.i iVar, Runnable runnable) {
        b bVar = this.f1833g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1818l;
        bVar.b(runnable, k.f1844g);
    }
}
