package q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class W extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7873i = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f7874h;

    public W(a0 a0Var) {
        this.f7874h = a0Var;
    }

    @Override // q2.b0
    public final boolean k() {
        return true;
    }

    @Override // q2.b0
    public final void l(Throwable th) {
        if (f7873i.compareAndSet(this, 0, 1)) {
            this.f7874h.n(th);
        }
    }
}
