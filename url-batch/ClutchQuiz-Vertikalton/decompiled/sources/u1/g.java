package u1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o1.E;

/* loaded from: classes.dex */
public abstract class g extends E {

    /* renamed from: c, reason: collision with root package name */
    public b f3767c;

    @Override // o1.AbstractC0296o
    public final void y(X0.i iVar, Runnable runnable) {
        b bVar = this.f3767c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.h;
        bVar.j(runnable, k.f3777g, false);
    }
}
