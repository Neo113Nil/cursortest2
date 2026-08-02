package x3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class Q extends V {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16004f = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final P f16005e;

    public Q(P p2) {
        this.f16005e = p2;
    }

    @Override // x3.P
    public final void d(Throwable th) {
        if (f16004f.compareAndSet(this, 0, 1)) {
            this.f16005e.d(th);
        }
    }
}
