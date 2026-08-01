package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class L extends O {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3315f = AtomicIntegerFieldUpdater.newUpdater(L.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final P f3316e;

    public L(P p2) {
        this.f3316e = p2;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f864a;
    }

    @Override // o1.P
    public final void o(Throwable th) {
        if (f3315f.compareAndSet(this, 0, 1)) {
            this.f3316e.g(th);
        }
    }
}
