package y1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import r1.F;

/* loaded from: classes.dex */
public abstract class g extends F {

    /* renamed from: c, reason: collision with root package name */
    public b f4750c;

    @Override // r1.AbstractC0366p
    public final void D(a1.i iVar, Runnable runnable) {
        b bVar = this.f4750c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4738h;
        bVar.d(runnable, k.f4760g, false);
    }
}
