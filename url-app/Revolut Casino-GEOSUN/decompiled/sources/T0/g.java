package T0;

import M0.I;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: g, reason: collision with root package name */
    public final b f973g;

    public g(int i2, int i3, long j2, String str) {
        this.f973g = new b(i2, i3, j2, str);
    }

    @Override // M0.AbstractC0060s
    public final void c(w0.i iVar, Runnable runnable) {
        b bVar = this.f973g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f958l;
        bVar.b(runnable, k.f984g, false);
    }
}
