package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vv extends iw {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(vv.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final tv j;

    public vv(tv tvVar) {
        this.j = tvVar;
    }

    @Override // defpackage.iw
    public final boolean k() {
        return true;
    }

    @Override // defpackage.iw
    public final void l(Throwable th) {
        if (k.compareAndSet(this, 0, 1)) {
            this.j.h(th);
        }
    }
}
