package c7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends b1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1753k = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: j, reason: collision with root package name */
    public final a1 f1754j;

    public w0(a1 a1Var) {
        this.f1754j = a1Var;
    }

    @Override // c7.b1
    public final boolean k() {
        return true;
    }

    @Override // c7.b1
    public final void l(Throwable th) {
        if (f1753k.compareAndSet(this, 0, 1)) {
            this.f1754j.f(th);
        }
    }
}
