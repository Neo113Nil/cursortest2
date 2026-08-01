package f8;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final q0 f4164d;

    public p0(q0 q0Var) {
        this.f4164d = q0Var;
    }

    public static void a(p0 p0Var, Thread thread) {
        p0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f4164d.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
