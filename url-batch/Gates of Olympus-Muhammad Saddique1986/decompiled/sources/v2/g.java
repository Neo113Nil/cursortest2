package v2;

import c1.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.AbstractC0813A;
import q2.AbstractC0831s;
import q2.B;
import q2.C0821h;
import q2.G;
import q2.r0;

/* loaded from: classes.dex */
public final class g extends AbstractC0831s implements B {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9799l = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f9800f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0831s f9801g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9802h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9803i;

    /* renamed from: j, reason: collision with root package name */
    public final j f9804j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9805k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0831s abstractC0831s, int i3, String str) {
        B b3 = abstractC0831s instanceof B ? (B) abstractC0831s : null;
        this.f9800f = b3 == null ? AbstractC0813A.f7848a : b3;
        this.f9801g = abstractC0831s;
        this.f9802h = i3;
        this.f9803i = str;
        this.f9804j = new j();
        this.f9805k = new Object();
    }

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        Runnable H3;
        this.f9804j.a(runnable);
        if (f9799l.get(this) >= this.f9802h || !I() || (H3 = H()) == null) {
            return;
        }
        this.f9801g.D(this, new z(this, H3));
    }

    @Override // q2.AbstractC0831s
    public final void E(V1.i iVar, Runnable runnable) {
        Runnable H3;
        this.f9804j.a(runnable);
        if (f9799l.get(this) >= this.f9802h || !I() || (H3 = H()) == null) {
            return;
        }
        this.f9801g.E(this, new z(this, H3));
    }

    public final Runnable H() {
        while (true) {
            Runnable runnable = (Runnable) this.f9804j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9805k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9799l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9804j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean I() {
        synchronized (this.f9805k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9799l;
            if (atomicIntegerFieldUpdater.get(this) >= this.f9802h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // q2.B
    public final void q(long j3, C0821h c0821h) {
        this.f9800f.q(j3, c0821h);
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        String str = this.f9803i;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9801g);
        sb.append(".limitedParallelism(");
        return A.k.j(sb, this.f9802h, ')');
    }

    @Override // q2.B
    public final G u(long j3, r0 r0Var, V1.i iVar) {
        return this.f9800f.u(j3, r0Var, iVar);
    }
}
