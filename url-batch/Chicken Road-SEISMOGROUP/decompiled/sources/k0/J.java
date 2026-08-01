package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f886g = AtomicIntegerFieldUpdater.newUpdater(J.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final d0.l f887f;

    public J(d0.l lVar) {
        this.f887f = lVar;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f433a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        if (f886g.compareAndSet(this, 0, 1)) {
            this.f887f.h(th);
        }
    }
}
