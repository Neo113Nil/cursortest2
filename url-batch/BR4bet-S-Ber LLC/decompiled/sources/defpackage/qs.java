package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qs extends bf implements ah {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(qs.class, "runningWorkers$volatile");
    public final bf h;
    public final int i;
    public final au j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public qs(bf bfVar, int i) {
        if ((bfVar instanceof ah ? (ah) bfVar : null) == null) {
            int i2 = cg.a;
        }
        this.h = bfVar;
        this.i = i;
        this.j = new au();
        this.k = new Object();
    }

    @Override // defpackage.bf
    public final void q(ye yeVar, Runnable runnable) {
        this.j.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
        if (atomicIntegerFieldUpdater.get(this) < this.i) {
            synchronized (this.k) {
                if (atomicIntegerFieldUpdater.get(this) >= this.i) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable t = t();
                if (t == null) {
                    return;
                }
                this.h.q(this, new g1(this, t, 7));
            }
        }
    }

    public final Runnable t() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.bf
    public final String toString() {
        return this.h + ".limitedParallelism(" + this.i + ')';
    }
}
