package k2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class W extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5334i = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f5335h;

    public W(a0 a0Var) {
        this.f5335h = a0Var;
    }

    @Override // k2.b0
    public final boolean k() {
        return true;
    }

    @Override // k2.b0
    public final void l(Throwable th) {
        if (f5334i.compareAndSet(this, 0, 1)) {
            this.f5335h.j(th);
        }
    }
}
