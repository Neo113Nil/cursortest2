package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.u0;

/* loaded from: classes5.dex */
public final class p extends CoroutineDispatcher implements p0 {
    private static final AtomicIntegerFieldUpdater runningWorkers$FU = AtomicIntegerFieldUpdater.newUpdater(p.class, "runningWorkers");
    private final /* synthetic */ p0 $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final t queue;
    private volatile int runningWorkers;
    private final Object workerAllocationLock;

    private final class a implements Runnable {
        private Runnable currentTask;

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    kotlinx.coroutines.h0.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable obtainTaskOrDeallocateWorker = p.this.obtainTaskOrDeallocateWorker();
                if (obtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.currentTask = obtainTaskOrDeallocateWorker;
                i8++;
                if (i8 >= 16 && p.this.dispatcher.isDispatchNeeded(p.this)) {
                    p.this.dispatcher.mo1293dispatch(p.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(CoroutineDispatcher coroutineDispatcher, int i8) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i8;
        p0 p0Var = coroutineDispatcher instanceof p0 ? (p0) coroutineDispatcher : null;
        this.$$delegate_0 = p0Var == null ? kotlinx.coroutines.m0.getDefaultDelay() : p0Var;
        this.queue = new t(false);
        this.workerAllocationLock = new Object();
    }

    private final void dispatchInternal(Runnable runnable, f6.l lVar) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$FU.get(this) < this.parallelism && tryAllocateWorker() && (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            lVar.invoke(new a(obtainTaskOrDeallocateWorker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnable = (Runnable) this.queue.removeFirstOrNull();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.workerAllocationLock) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
            if (atomicIntegerFieldUpdater.get(this) >= this.parallelism) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.p0
    public Object delay(long j8, kotlin.coroutines.c cVar) {
        return this.$$delegate_0.delay(j8, cVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.mo1293dispatch(this, new a(obtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new a(obtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.p0
    public u0 invokeOnTimeout(long j8, Runnable runnable, CoroutineContext coroutineContext) {
        return this.$$delegate_0.invokeOnTimeout(j8, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i8) {
        q.checkParallelism(i8);
        return i8 >= this.parallelism ? this : super.limitedParallelism(i8);
    }

    @Override // kotlinx.coroutines.p0
    /* renamed from: scheduleResumeAfterDelay */
    public void mo1294scheduleResumeAfterDelay(long j8, kotlinx.coroutines.n nVar) {
        this.$$delegate_0.mo1294scheduleResumeAfterDelay(j8, nVar);
    }
}
