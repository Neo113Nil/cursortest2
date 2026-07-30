package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class W extends b0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7033n = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: m, reason: collision with root package name */
    public final a0 f7034m;

    public W(a0 a0Var) {
        this.f7034m = a0Var;
    }

    @Override // n6.b0
    public final boolean j() {
        return true;
    }

    @Override // n6.b0
    public final void k(Throwable th) {
        if (f7033n.compareAndSet(this, 0, 1)) {
            this.f7034m.invoke(th);
        }
    }
}
