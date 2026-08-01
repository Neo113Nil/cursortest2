package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y8 extends i {
    public final Thread i;
    public final ln j;

    public y8(qg qgVar, Thread thread, ln lnVar) {
        super(qgVar, true);
        this.i = thread;
        this.j = lnVar;
    }

    @Override // defpackage.mw
    public final void a(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.i;
        if (mv.c(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
