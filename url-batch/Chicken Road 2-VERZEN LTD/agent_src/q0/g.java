package q0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import k0.E;

/* loaded from: classes.dex */
public abstract class g extends E {

    /* renamed from: d, reason: collision with root package name */
    public final b f1214d;

    public g(int i2, int i3, long j2, String str) {
        this.f1214d = new b(i2, i3, j2, str);
    }

    @Override // k0.AbstractC0057p
    public final void d(W.i iVar, Runnable runnable) {
        b bVar = this.f1214d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1199i;
        bVar.b(runnable, j.f1224g, false);
    }
}
