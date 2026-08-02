package f1;

import Y0.I;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: g, reason: collision with root package name */
    public b f2203g;

    @Override // Y0.AbstractC0124s
    public final void c(H0.i iVar, Runnable runnable) {
        b bVar = this.f2203g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f2188l;
        bVar.b(runnable, k.f2214g, false);
    }
}
