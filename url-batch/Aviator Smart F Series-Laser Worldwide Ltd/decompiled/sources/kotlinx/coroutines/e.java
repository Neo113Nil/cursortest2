package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class e extends a {
    private final Thread blockedThread;
    private final y0 eventLoop;

    public e(CoroutineContext coroutineContext, Thread thread, y0 y0Var) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = y0Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(Object obj) {
        y5.w wVar;
        if (kotlin.jvm.internal.s.areEqual(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
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

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
        return true;
    }

    public final Object joinBlocking() {
        y5.w wVar;
        b timeSource = c.getTimeSource();
        if (timeSource != null) {
            timeSource.registerTimeLoopThread();
        }
        try {
            y0 y0Var = this.eventLoop;
            if (y0Var != null) {
                y0.incrementUseCount$default(y0Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    y0 y0Var2 = this.eventLoop;
                    long processNextEvent = y0Var2 != null ? y0Var2.processNextEvent() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        y0 y0Var3 = this.eventLoop;
                        if (y0Var3 != null) {
                            y0.decrementUseCount$default(y0Var3, false, 1, null);
                        }
                        Object unboxState = s1.unboxState(getState$kotlinx_coroutines_core());
                        b0 b0Var = unboxState instanceof b0 ? (b0) unboxState : null;
                        if (b0Var == null) {
                            return unboxState;
                        }
                        throw b0Var.cause;
                    }
                    b timeSource2 = c.getTimeSource();
                    if (timeSource2 != null) {
                        timeSource2.parkNanos(this, processNextEvent);
                        wVar = y5.w.INSTANCE;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        LockSupport.parkNanos(this, processNextEvent);
                    }
                } catch (Throwable th) {
                    y0 y0Var4 = this.eventLoop;
                    if (y0Var4 != null) {
                        y0.decrementUseCount$default(y0Var4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            cancelCoroutine(interruptedException);
            throw interruptedException;
        } finally {
            b timeSource3 = c.getTimeSource();
            if (timeSource3 != null) {
                timeSource3.unregisterTimeLoopThread();
            }
        }
    }
}
