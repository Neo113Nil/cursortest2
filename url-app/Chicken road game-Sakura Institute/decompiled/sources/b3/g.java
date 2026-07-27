package b3;

import A.AbstractC0017m;
import W2.AbstractC0298u;
import W2.C0286h;
import W2.D;
import W2.E;
import W2.L;
import W2.w0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class g extends AbstractC0298u implements E {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5659o = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f5660i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0298u f5661j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5662k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5663l;

    /* renamed from: m, reason: collision with root package name */
    public final j f5664m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5665n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0298u abstractC0298u, int i2, String str) {
        E e4 = abstractC0298u instanceof E ? (E) abstractC0298u : null;
        this.f5660i = e4 == null ? D.f4221a : e4;
        this.f5661j = abstractC0298u;
        this.f5662k = i2;
        this.f5663l = str;
        this.f5664m = new j();
        this.f5665n = new Object();
    }

    public final Runnable A() {
        while (true) {
            Runnable runnable = (Runnable) this.f5664m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5665n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5659o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5664m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // W2.E
    public final void n(long j4, C0286h c0286h) {
        this.f5660i.n(j4, c0286h);
    }

    @Override // W2.E
    public final L p(long j4, w0 w0Var, CoroutineContext coroutineContext) {
        return this.f5660i.p(j4, w0Var, coroutineContext);
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z4;
        Runnable A4;
        this.f5664m.a(runnable);
        if (f5659o.get(this) < this.f5662k) {
            synchronized (this.f5665n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5659o;
                if (atomicIntegerFieldUpdater.get(this) >= this.f5662k) {
                    z4 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z4 = true;
                }
            }
            if (!z4 || (A4 = A()) == null) {
                return;
            }
            this.f5661j.t(this, new G1.n(this, 8, A4));
        }
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        String str = this.f5663l;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5661j);
        sb.append(".limitedParallelism(");
        return AbstractC0017m.l(sb, this.f5662k, ')');
    }
}
