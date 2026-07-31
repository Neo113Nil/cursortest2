package a7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 extends w0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f298h;

    public r0(v0 v0Var) {
        this.f298h = v0Var;
    }

    @Override // a7.w0
    public final boolean k() {
        return true;
    }

    @Override // a7.w0
    public final void l(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.f298h.i(th);
        }
    }
}
