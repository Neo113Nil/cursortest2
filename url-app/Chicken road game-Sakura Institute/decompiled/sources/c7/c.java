package c7;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Thread f1675i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f1676j;

    public c(h6.i iVar, Thread thread, q0 q0Var) {
        super(iVar, true);
        this.f1675i = thread;
        this.f1676j = q0Var;
    }

    @Override // c7.f1
    public final void i(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1675i;
        if (r6.k.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
