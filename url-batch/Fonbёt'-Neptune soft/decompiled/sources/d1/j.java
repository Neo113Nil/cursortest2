package d1;

import Y0.AbstractC0124s;
import Y0.AbstractC0129x;
import Y0.InterfaceC0130y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class j extends AbstractC0124s implements InterfaceC0130y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2083k = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: g, reason: collision with root package name */
    public final f1.l f2084g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2085h;

    /* renamed from: i, reason: collision with root package name */
    public final m f2086i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2087j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(f1.l lVar, int i2) {
        this.f2084g = lVar;
        this.f2085h = i2;
        if ((lVar instanceof InterfaceC0130y ? (InterfaceC0130y) lVar : null) == null) {
            int i3 = AbstractC0129x.f1242a;
        }
        this.f2086i = new m();
        this.f2087j = new Object();
    }

    @Override // Y0.AbstractC0124s
    public final void c(H0.i iVar, Runnable runnable) {
        this.f2086i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2083k;
        if (atomicIntegerFieldUpdater.get(this) < this.f2085h) {
            synchronized (this.f2087j) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f2085h) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f2 = f();
                if (f2 == null) {
                    return;
                }
                this.f2084g.c(this, new i(0, this, f2));
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f2086i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2087j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2083k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2086i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
