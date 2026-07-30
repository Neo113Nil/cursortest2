package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ya0 extends mb0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(ya0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final e l;

    public ya0(e eVar) {
        this.l = eVar;
    }

    @Override // defpackage.mb0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.mb0
    public final void s(Throwable th) {
        if (m.compareAndSet(this, 0, 1)) {
            this.l.invoke(th);
        }
    }
}
