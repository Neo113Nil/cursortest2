package w1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s1.AbstractC0332o;
import s1.AbstractC0337u;
import s1.InterfaceC0338v;

/* loaded from: classes.dex */
public final class g extends AbstractC0332o implements InterfaceC0338v {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4499g = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final y1.l f4500c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4501e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4502f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(y1.l lVar, int i) {
        this.f4500c = lVar;
        this.d = i;
        if ((lVar instanceof InterfaceC0338v ? (InterfaceC0338v) lVar : null) == null) {
            int i2 = AbstractC0337u.f4069a;
        }
        this.f4501e = new j();
        this.f4502f = new Object();
    }

    @Override // s1.AbstractC0332o
    public final void r(b1.j jVar, Runnable runnable) {
        this.f4501e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4499g;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.f4502f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable t2 = t();
                if (t2 == null) {
                    return;
                }
                this.f4500c.r(this, new H.a(this, t2));
            }
        }
    }

    public final Runnable t() {
        while (true) {
            Runnable runnable = (Runnable) this.f4501e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4502f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4499g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4501e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
