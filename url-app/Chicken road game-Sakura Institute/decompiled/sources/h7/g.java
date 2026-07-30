package h7;

import b3.z;
import c7.c0;
import c7.d0;
import c7.i0;
import c7.r1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends c7.t implements d0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4681m = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f4682h;

    /* renamed from: i, reason: collision with root package name */
    public final c7.t f4683i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4684j;

    /* renamed from: k, reason: collision with root package name */
    public final j f4685k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4686l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(c7.t tVar, int i7) {
        d0 d0Var = tVar instanceof d0 ? (d0) tVar : null;
        this.f4682h = d0Var == null ? c0.f1677a : d0Var;
        this.f4683i = tVar;
        this.f4684j = i7;
        this.f4685k = new j();
        this.f4686l = new Object();
    }

    @Override // c7.d0
    public final i0 U(long j8, r1 r1Var, h6.i iVar) {
        return this.f4682h.U(j8, r1Var, iVar);
    }

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        Runnable Z;
        this.f4685k.a(runnable);
        if (f4681m.get(this) >= this.f4684j || !a0() || (Z = Z()) == null) {
            return;
        }
        this.f4683i.V(this, new z(4, (Object) this, (Object) Z, false));
    }

    @Override // c7.t
    public final void W(h6.i iVar, Runnable runnable) {
        Runnable Z;
        this.f4685k.a(runnable);
        if (f4681m.get(this) >= this.f4684j || !a0() || (Z = Z()) == null) {
            return;
        }
        this.f4683i.W(this, new z(4, (Object) this, (Object) Z, false));
    }

    public final Runnable Z() {
        while (true) {
            Runnable runnable = (Runnable) this.f4685k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4686l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4681m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4685k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean a0() {
        synchronized (this.f4686l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4681m;
            if (atomicIntegerFieldUpdater.get(this) >= this.f4684j) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // c7.d0
    public final void k(long j8, c7.h hVar) {
        this.f4682h.k(j8, hVar);
    }

    @Override // c7.t
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4683i);
        sb.append(".limitedParallelism(");
        return a0.m.l(sb, this.f4684j, ')');
    }
}
