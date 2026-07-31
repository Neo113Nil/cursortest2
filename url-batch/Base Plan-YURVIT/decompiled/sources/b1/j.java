package b1;

import W0.AbstractC0078s;
import W0.AbstractC0083x;
import W0.InterfaceC0084y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class j extends AbstractC0078s implements InterfaceC0084y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1756k = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0078s f1757g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1758h;

    /* renamed from: i, reason: collision with root package name */
    public final m f1759i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1760j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(AbstractC0078s abstractC0078s, int i2) {
        this.f1757g = abstractC0078s;
        this.f1758h = i2;
        if ((abstractC0078s instanceof InterfaceC0084y ? (InterfaceC0084y) abstractC0078s : null) == null) {
            int i3 = AbstractC0083x.f986a;
        }
        this.f1759i = new m();
        this.f1760j = new Object();
    }

    @Override // W0.AbstractC0078s
    public final void c(G0.i iVar, Runnable runnable) {
        this.f1759i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1756k;
        if (atomicIntegerFieldUpdater.get(this) < this.f1758h) {
            synchronized (this.f1760j) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1758h) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e2 = e();
                if (e2 == null) {
                    return;
                }
                this.f1757g.c(this, new i(0, this, e2));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f1759i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1760j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1756k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1759i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
