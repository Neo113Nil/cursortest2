package m6;

import java.util.concurrent.locks.LockSupport;
import m6.a1;

/* loaded from: classes.dex */
public abstract class b1 extends z0 {
    protected abstract Thread a0();

    protected final void b0(long j7, a1.a aVar) {
        if (p0.a()) {
            if (!(this != r0.f19326l)) {
                throw new AssertionError();
            }
        }
        r0.f19326l.n0(j7, aVar);
    }

    protected final void c0() {
        Thread a02 = a0();
        if (Thread.currentThread() != a02) {
            c.a();
            LockSupport.unpark(a02);
        }
    }
}
