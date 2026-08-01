package y1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import s1.E;

/* loaded from: classes.dex */
public abstract class g extends E {

    /* renamed from: c, reason: collision with root package name */
    public b f4595c;

    @Override // s1.AbstractC0332o
    public final void r(b1.j jVar, Runnable runnable) {
        b bVar = this.f4595c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.h;
        bVar.d(runnable, k.f4605g, false);
    }
}
