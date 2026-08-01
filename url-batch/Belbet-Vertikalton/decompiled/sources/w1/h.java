package w1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r1.AbstractC0366p;
import r1.AbstractC0371v;
import r1.InterfaceC0372w;

/* loaded from: classes.dex */
public final class h extends AbstractC0366p implements InterfaceC0372w {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4477g = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final y1.l f4478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4479d;
    public final k e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4480f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public h(y1.l lVar, int i) {
        this.f4478c = lVar;
        this.f4479d = i;
        if ((lVar instanceof InterfaceC0372w ? (InterfaceC0372w) lVar : null) == null) {
            int i2 = AbstractC0371v.f4098a;
        }
        this.e = new k();
        this.f4480f = new Object();
    }

    @Override // r1.AbstractC0366p
    public final void D(a1.i iVar, Runnable runnable) {
        this.e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4477g;
        if (atomicIntegerFieldUpdater.get(this) < this.f4479d) {
            synchronized (this.f4480f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f4479d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable F2 = F();
                if (F2 == null) {
                    return;
                }
                this.f4478c.D(this, new B.a(this, F2, 6, false));
            }
        }
    }

    public final Runnable F() {
        while (true) {
            Runnable runnable = (Runnable) this.e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4480f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4477g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
