package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qb0 extends we2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(qb0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.we2, defpackage.n61
    public final void k(Object obj) {
        r(obj);
    }

    @Override // defpackage.we2, defpackage.n61
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = s;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    j8.U(q41.b(this.r), ix.a(obj));
                    return;
                } else {
                    lh.g("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
