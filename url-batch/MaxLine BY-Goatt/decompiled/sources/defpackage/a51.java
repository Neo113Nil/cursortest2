package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a51 extends j61 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(a51.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final rk t;

    public a51(rk rkVar) {
        this.t = rkVar;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return true;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        if (u.compareAndSet(this, 0, 1)) {
            this.t.invoke(th);
        }
    }
}
