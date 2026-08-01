package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o1.AbstractC0296o;
import o1.AbstractC0301u;
import o1.InterfaceC0302v;

/* loaded from: classes.dex */
public final class g extends AbstractC0296o implements InterfaceC0302v {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3650g = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final u1.l f3651c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3652e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3653f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(u1.l lVar, int i) {
        this.f3651c = lVar;
        this.d = i;
        if ((lVar instanceof InterfaceC0302v ? (InterfaceC0302v) lVar : null) == null) {
            int i2 = AbstractC0301u.f3366a;
        }
        this.f3652e = new j();
        this.f3653f = new Object();
    }

    public final Runnable A() {
        while (true) {
            Runnable runnable = (Runnable) this.f3652e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3653f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3650g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3652e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o1.AbstractC0296o
    public final void y(X0.i iVar, Runnable runnable) {
        this.f3652e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3650g;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.f3653f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable A2 = A();
                if (A2 == null) {
                    return;
                }
                this.f3651c.y(this, new H.a(this, A2));
            }
        }
    }
}
