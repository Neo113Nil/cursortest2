package p0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k0.AbstractC0055p;
import k0.AbstractC0060v;
import k0.InterfaceC0061w;

/* loaded from: classes.dex */
public final class j extends AbstractC0055p implements InterfaceC0061w {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1154h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: d, reason: collision with root package name */
    public final q0.k f1155d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1156e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1157f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1158g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(q0.k kVar, int i2) {
        this.f1155d = kVar;
        this.f1156e = i2;
        if ((kVar instanceof InterfaceC0061w ? (InterfaceC0061w) kVar : null) == null) {
            int i3 = AbstractC0060v.f948a;
        }
        this.f1157f = new m();
        this.f1158g = new Object();
    }

    @Override // k0.AbstractC0055p
    public final void d(W.i iVar, Runnable runnable) {
        this.f1157f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1154h;
        if (atomicIntegerFieldUpdater.get(this) < this.f1156e) {
            synchronized (this.f1158g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1156e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable h2 = h();
                if (h2 == null) {
                    return;
                }
                this.f1155d.d(this, new i(this, h2));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.f1157f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1158g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1154h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1157f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
