package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dh0 extends ln implements xq {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(dh0.class, "runningWorkers$volatile");
    public final /* synthetic */ xq g;
    public final ln h;
    public final int i;
    public final qi0 j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public dh0(ln lnVar, int i) {
        xq xqVar = lnVar instanceof xq ? (xq) lnVar : null;
        this.g = xqVar == null ? vp.a : xqVar;
        this.h = lnVar;
        this.i = i;
        this.j = new qi0();
        this.k = new Object();
    }

    @Override // defpackage.xq
    public final void c(long j, tf tfVar) {
        this.g.c(j, tfVar);
    }

    @Override // defpackage.xq
    public final rs e(long j, ni1 ni1Var, CoroutineContext coroutineContext) {
        return this.g.e(j, ni1Var, coroutineContext);
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable n;
        this.j.a(runnable);
        if (l.get(this) >= this.i || !q() || (n = n()) == null) {
            return;
        }
        this.h.f(this, new lf(2, this, n, false));
    }

    @Override // defpackage.ln
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable n;
        this.j.a(runnable);
        if (l.get(this) >= this.i || !q() || (n = n()) == null) {
            return;
        }
        this.h.g(this, new lf(2, this, n, false));
    }

    public final Runnable n() {
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

    public final boolean q() {
        synchronized (this.k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
            if (atomicIntegerFieldUpdater.get(this) >= this.i) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.ln
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append(".limitedParallelism(");
        return qy0.m(sb, this.i, ')');
    }
}
