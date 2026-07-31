package p0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k0.AbstractC0057p;
import k0.AbstractC0062v;
import k0.InterfaceC0063w;

/* loaded from: classes.dex */
public final class j extends AbstractC0057p implements InterfaceC0063w {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1146h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: d, reason: collision with root package name */
    public final q0.k f1147d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1148e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1149f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1150g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(q0.k kVar, int i2) {
        this.f1147d = kVar;
        this.f1148e = i2;
        if ((kVar instanceof InterfaceC0063w ? (InterfaceC0063w) kVar : null) == null) {
            int i3 = AbstractC0062v.f895a;
        }
        this.f1149f = new m();
        this.f1150g = new Object();
    }

    @Override // k0.AbstractC0057p
    public final void d(W.i iVar, Runnable runnable) {
        this.f1149f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1146h;
        if (atomicIntegerFieldUpdater.get(this) < this.f1148e) {
            synchronized (this.f1150g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1148e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable h2 = h();
                if (h2 == null) {
                    return;
                }
                this.f1147d.d(this, new i(this, h2));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.f1149f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1150g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1146h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1149f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
