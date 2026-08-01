package le;

import f8.j0;
import ge.c0;
import ge.f0;
import ge.m0;
import ge.w1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends ge.t implements f0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5977v = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f5978i;

    /* renamed from: r, reason: collision with root package name */
    public final ge.t f5979r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: s, reason: collision with root package name */
    public final int f5980s;

    /* renamed from: t, reason: collision with root package name */
    public final l f5981t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5982u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(ge.t tVar, int i3) {
        f0 f0Var = tVar instanceof f0 ? (f0) tVar : null;
        this.f5978i = f0Var == null ? c0.f4340a : f0Var;
        this.f5979r = tVar;
        this.f5980s = i3;
        this.f5981t = new l();
        this.f5982u = new Object();
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable P;
        this.f5981t.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5977v;
        if (atomicIntegerFieldUpdater.get(this) >= this.f5980s || !Q() || (P = P()) == null) {
            return;
        }
        try {
            b.h(this.f5979r, this, new j0(11, this, P, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // ge.t
    public final void M(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable P;
        this.f5981t.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5977v;
        if (atomicIntegerFieldUpdater.get(this) >= this.f5980s || !Q() || (P = P()) == null) {
            return;
        }
        try {
            this.f5979r.M(this, new j0(11, this, P, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable P() {
        while (true) {
            Runnable runnable = (Runnable) this.f5981t.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5982u) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5977v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5981t.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean Q() {
        synchronized (this.f5982u) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5977v;
            if (atomicIntegerFieldUpdater.get(this) >= this.f5980s) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // ge.f0
    public final void h(long j, ge.h hVar) {
        this.f5978i.h(j, hVar);
    }

    @Override // ge.f0
    public final m0 i(long j, w1 w1Var, CoroutineContext coroutineContext) {
        return this.f5978i.i(j, w1Var, coroutineContext);
    }

    @Override // ge.t
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5979r);
        sb2.append(".limitedParallelism(");
        return v4.a.m(sb2, this.f5980s, ')');
    }
}
