package p2;

import H2.AbstractC0080b;
import a1.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k2.AbstractC0528A;
import k2.AbstractC0546s;
import k2.B;
import k2.C0536h;
import k2.G;
import k2.r0;

/* loaded from: classes.dex */
public final class g extends AbstractC0546s implements B {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6778l = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f6779f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0546s f6780g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6781h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6782i;

    /* renamed from: j, reason: collision with root package name */
    public final k f6783j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f6784k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0546s abstractC0546s, int i3, String str) {
        B b2 = abstractC0546s instanceof B ? (B) abstractC0546s : null;
        this.f6779f = b2 == null ? AbstractC0528A.f5309a : b2;
        this.f6780g = abstractC0546s;
        this.f6781h = i3;
        this.f6782i = str;
        this.f6783j = new k();
        this.f6784k = new Object();
    }

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        boolean z3;
        Runnable S2;
        this.f6783j.a(runnable);
        if (f6778l.get(this) < this.f6781h) {
            synchronized (this.f6784k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6778l;
                if (atomicIntegerFieldUpdater.get(this) >= this.f6781h) {
                    z3 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z3 = true;
                }
            }
            if (!z3 || (S2 = S()) == null) {
                return;
            }
            this.f6780g.P(this, new x(this, S2));
        }
    }

    public final Runnable S() {
        while (true) {
            Runnable runnable = (Runnable) this.f6783j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6784k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6778l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6783j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // k2.B
    public final G i(long j3, r0 r0Var, P1.i iVar) {
        return this.f6779f.i(j3, r0Var, iVar);
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        String str = this.f6782i;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6780g);
        sb.append(".limitedParallelism(");
        return AbstractC0080b.k(sb, this.f6781h, ')');
    }

    @Override // k2.B
    public final void u(long j3, C0536h c0536h) {
        this.f6779f.u(j3, c0536h);
    }
}
