package m6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class s0<T> extends kotlinx.coroutines.internal.w<T> {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19329i = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean y0() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f19329i.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.w, m6.v1
    protected void p(Object obj) {
        t0(obj);
    }

    @Override // kotlinx.coroutines.internal.w, m6.a
    protected void t0(Object obj) {
        y5.d b7;
        if (y0()) {
            return;
        }
        b7 = z5.c.b(this.f18380h);
        kotlinx.coroutines.internal.g.c(b7, c0.a(obj, this.f18380h), null, 2, null);
    }
}
