package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class od1 extends t40 implements m90 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(od1.class, "runningWorkers$volatile");
    public final /* synthetic */ m90 o;
    public final t40 p;
    public final int q;
    public final yf1 r;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public od1(t40 t40Var, int i) {
        m90 m90Var = t40Var instanceof m90 ? (m90) t40Var : null;
        this.o = m90Var == null ? z70.a : m90Var;
        this.p = t40Var;
        this.q = i;
        this.r = new yf1();
        this.s = new Object();
    }

    @Override // defpackage.m90
    public final ec0 A(long j, tx2 tx2Var, CoroutineContext coroutineContext) {
        return this.o.A(j, tx2Var, coroutineContext);
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable R;
        this.r.a(runnable);
        if (t.get(this) >= this.q || !S() || (R = R()) == null) {
            return;
        }
        this.p.N(this, new iu0(10, (Object) this, (Object) R, false));
    }

    @Override // defpackage.t40
    public final void O(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable R;
        this.r.a(runnable);
        if (t.get(this) >= this.q || !S() || (R = R()) == null) {
            return;
        }
        this.p.O(this, new iu0(10, (Object) this, (Object) R, false));
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        l41.u(1);
        return 1 >= this.q ? this : super.Q(1);
    }

    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.r.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean S() {
        synchronized (this.s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
            if (atomicIntegerFieldUpdater.get(this) >= this.q) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.m90
    public final void n(long j, fs fsVar) {
        this.o.n(j, fsVar);
    }

    @Override // defpackage.t40
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        sb.append(".limitedParallelism(");
        return q40.o(sb, this.q, ')');
    }
}
