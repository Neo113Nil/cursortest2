package M0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f630j = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i, reason: collision with root package name */
    public final E0.l f631i;

    public N(E0.l lVar) {
        this.f631i = lVar;
    }

    @Override // E0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0247g.f3005a;
    }

    @Override // M0.U
    public final void o(Throwable th) {
        if (f630j.compareAndSet(this, 0, 1)) {
            this.f631i.i(th);
        }
    }
}
