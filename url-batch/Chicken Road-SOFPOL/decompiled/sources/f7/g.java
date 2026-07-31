package f7;

import a7.a0;
import a7.e0;
import a7.n1;
import a7.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends a7.q implements a0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2776k = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f2777f;

    /* renamed from: g, reason: collision with root package name */
    public final a7.q f2778g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2779h;
    public final k i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2780j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(a7.q qVar, int i) {
        a0 a0Var = qVar instanceof a0 ? (a0) qVar : null;
        this.f2777f = a0Var == null ? z.f325a : a0Var;
        this.f2778g = qVar;
        this.f2779h = i;
        this.i = new k();
        this.f2780j = new Object();
    }

    @Override // a7.a0
    public final e0 e(long j7, n1 n1Var, g6.h hVar) {
        return this.f2777f.e(j7, n1Var, hVar);
    }

    @Override // a7.a0
    public final void f(long j7, a7.h hVar) {
        this.f2777f.f(j7, hVar);
    }

    @Override // a7.q
    public final void h(g6.h hVar, Runnable runnable) {
        boolean z3;
        Runnable m7;
        this.i.a(runnable);
        if (f2776k.get(this) < this.f2779h) {
            synchronized (this.f2780j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2776k;
                if (atomicIntegerFieldUpdater.get(this) >= this.f2779h) {
                    z3 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z3 = true;
                }
            }
            if (!z3 || (m7 = m()) == null) {
                return;
            }
            this.f2778g.h(this, new b7.d(1, this, m7, false));
        }
    }

    public final Runnable m() {
        while (true) {
            Runnable runnable = (Runnable) this.i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2780j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2776k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // a7.q
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2778g);
        sb.append(".limitedParallelism(");
        return a0.q.k(sb, this.f2779h, ')');
    }
}
