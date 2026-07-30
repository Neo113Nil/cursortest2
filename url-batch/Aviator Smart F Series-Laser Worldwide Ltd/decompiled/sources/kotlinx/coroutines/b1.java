package kotlinx.coroutines;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes3.dex */
public abstract class b1 {
    public static final y0 createEventLoop() {
        return new f(Thread.currentThread());
    }

    public static final boolean isIoDispatcherThread(Thread thread) {
        if (thread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(f6.a aVar) {
        aVar.invoke();
    }

    public static final long processNextEventInCurrentThread() {
        y0 currentOrNull$kotlinx_coroutines_core = h2.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (currentOrNull$kotlinx_coroutines_core != null) {
            return currentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) currentThread).runSingleTask();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
