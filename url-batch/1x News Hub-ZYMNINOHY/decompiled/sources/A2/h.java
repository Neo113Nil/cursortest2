package A2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import t2.K;

/* loaded from: classes.dex */
public abstract class h extends K {

    /* renamed from: c, reason: collision with root package name */
    public c f56c;

    @Override // t2.AbstractC1208s
    public final void c(d2.h hVar, Runnable runnable) {
        c cVar = this.f56c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f42h;
        cVar.b(runnable, l.f66g);
    }
}
