package y2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t2.A;
import t2.AbstractC1208s;
import t2.AbstractC1214y;

/* loaded from: classes.dex */
public final class i extends AbstractC1208s implements A {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10847g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final A2.m f10848c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10849d;

    /* renamed from: e, reason: collision with root package name */
    public final l f10850e;
    public final Object f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(A2.m mVar, int i3) {
        this.f10848c = mVar;
        this.f10849d = i3;
        if ((mVar instanceof A ? (A) mVar : null) == null) {
            int i4 = AbstractC1214y.f10455a;
        }
        this.f10850e = new l();
        this.f = new Object();
    }

    @Override // t2.AbstractC1208s
    public final void c(d2.h hVar, Runnable runnable) {
        this.f10850e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10847g;
        if (atomicIntegerFieldUpdater.get(this) < this.f10849d) {
            synchronized (this.f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f10849d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e3 = e();
                if (e3 == null) {
                    return;
                }
                this.f10848c.c(this, new B.a(this, e3, 21, false));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f10850e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10847g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10850e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
