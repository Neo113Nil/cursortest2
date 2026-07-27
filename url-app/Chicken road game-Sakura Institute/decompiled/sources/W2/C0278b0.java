package W2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278b0 extends g0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4249l = AtomicIntegerFieldUpdater.newUpdater(C0278b0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: k, reason: collision with root package name */
    public final f0 f4250k;

    public C0278b0(f0 f0Var) {
        this.f4250k = f0Var;
    }

    @Override // W2.g0
    public final boolean k() {
        return true;
    }

    @Override // W2.g0
    public final void l(Throwable th) {
        if (f4249l.compareAndSet(this, 0, 1)) {
            this.f4250k.invoke(th);
        }
    }
}
