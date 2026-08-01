package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class px extends tg implements fj {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(px.class, "runningWorkers$volatile");
    public final /* synthetic */ fj h;
    public final tg i;
    public final int j;
    public final az k;
    public final Object l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public px(tg tgVar, int i) {
        fj fjVar = tgVar instanceof fj ? (fj) tgVar : null;
        this.h = fjVar == null ? gi.a : fjVar;
        this.i = tgVar;
        this.j = i;
        this.k = new az();
        this.l = new Object();
    }

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        this.k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
        if (atomicIntegerFieldUpdater.get(this) < this.j) {
            synchronized (this.l) {
                if (atomicIntegerFieldUpdater.get(this) >= this.j) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable R = R();
                if (R == null) {
                    return;
                }
                this.i.O(this, new j1(this, R, 8));
            }
        }
    }

    @Override // defpackage.tg
    public final tg Q(int i) {
        mv.g(1);
        return 1 >= this.j ? this : super.Q(1);
    }

    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.fj
    public final nk i(long j, ii0 ii0Var, qg qgVar) {
        return this.h.i(j, ii0Var, qgVar);
    }

    @Override // defpackage.tg
    public final String toString() {
        return this.i + ".limitedParallelism(" + this.j + ')';
    }
}
