package R0;

import M0.AbstractC0060s;
import M0.AbstractC0065x;
import M0.InterfaceC0066y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class j extends AbstractC0060s implements InterfaceC0066y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f914k = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: g, reason: collision with root package name */
    public final T0.l f915g;

    /* renamed from: h, reason: collision with root package name */
    public final int f916h;

    /* renamed from: i, reason: collision with root package name */
    public final m f917i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f918j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(T0.l lVar, int i2) {
        this.f915g = lVar;
        this.f916h = i2;
        if ((lVar instanceof InterfaceC0066y ? (InterfaceC0066y) lVar : null) == null) {
            int i3 = AbstractC0065x.f699a;
        }
        this.f917i = new m();
        this.f918j = new Object();
    }

    @Override // M0.AbstractC0060s
    public final void c(w0.i iVar, Runnable runnable) {
        this.f917i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f914k;
        if (atomicIntegerFieldUpdater.get(this) < this.f916h) {
            synchronized (this.f918j) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f916h) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e2 = e();
                if (e2 == null) {
                    return;
                }
                this.f915g.c(this, new i(0, this, e2));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f917i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f918j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f914k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f917i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
