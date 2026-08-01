package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 extends g1 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4336t = AtomicIntegerFieldUpdater.newUpdater(b1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: s, reason: collision with root package name */
    public final f1 f4337s;

    public b1(f1 f1Var) {
        this.f4337s = f1Var;
    }

    @Override // ge.g1
    public final boolean k() {
        return true;
    }

    @Override // ge.g1
    public final void l(Throwable th) {
        if (f4336t.compareAndSet(this, 0, 1)) {
            this.f4337s.invoke(th);
        }
    }
}
