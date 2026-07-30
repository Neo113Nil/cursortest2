package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.z0;

/* loaded from: classes3.dex */
public abstract class a1 extends y0 {
    protected abstract Thread getThread();

    protected void reschedule(long j8, z0.c cVar) {
        l0.INSTANCE.schedule(j8, cVar);
    }

    protected final void unpark() {
        y5.w wVar;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            b timeSource = c.getTimeSource();
            if (timeSource != null) {
                timeSource.unpark(thread);
                wVar = y5.w.INSTANCE;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}
