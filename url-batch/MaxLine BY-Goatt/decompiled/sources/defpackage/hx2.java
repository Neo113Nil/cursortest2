package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hx2 extends j61 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(hx2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread t = Thread.currentThread();
    public ec0 u;

    public static void u(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.j61
    public final boolean r() {
        return true;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = v;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                u(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.t.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void t() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        u(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                ec0 ec0Var = this.u;
                if (ec0Var != null) {
                    ec0Var.a();
                    return;
                }
                return;
            }
        }
    }
}
