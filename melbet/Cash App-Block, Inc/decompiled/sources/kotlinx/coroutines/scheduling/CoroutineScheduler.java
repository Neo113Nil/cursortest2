package kotlinx.coroutines.scheduling;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String schedulerName;
    public final ResizableAtomicArray workers;
    public static final /* synthetic */ AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater controlState$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _isTerminated$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol NOT_IN_STACK = new Symbol("NOT_IN_STACK", 0);

    public final class Worker extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater workerCtl$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        public long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        public int rngState;
        public WorkerState state;
        public final Ref$ObjectRef stolenTask;
        public long terminationDeadline;
        private volatile /* synthetic */ int workerCtl$volatile;

        public Worker(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.class.getClassLoader());
            this.localQueue = new WorkQueue();
            this.stolenTask = new Ref$ObjectRef();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            int nanoTime = (int) System.nanoTime();
            this.rngState = nanoTime == 0 ? 42 : nanoTime;
            setIndexInArray(i);
        }

        public final Task findTask(boolean z) {
            Task pollGlobalQueues;
            Task pollGlobalQueues2;
            long j;
            WorkerState workerState = this.state;
            WorkerState workerState2 = WorkerState.CPU_ACQUIRED;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            WorkQueue workQueue = this.localQueue;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$volatile$FU;
                do {
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        Task pollWithExclusiveMode = workQueue.pollWithExclusiveMode();
                        return (pollWithExclusiveMode == null && (pollWithExclusiveMode = (Task) coroutineScheduler.globalBlockingQueue.removeFirstOrNull()) == null) ? trySteal(1) : pollWithExclusiveMode;
                    }
                } while (!CoroutineScheduler.controlState$volatile$FU.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.state = WorkerState.CPU_ACQUIRED;
            }
            if (z) {
                boolean z2 = nextInt(coroutineScheduler.corePoolSize * 2) == 0;
                if (z2 && (pollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return pollGlobalQueues2;
                }
                Task poll = workQueue.poll();
                if (poll != null) {
                    return poll;
                }
                if (!z2 && (pollGlobalQueues = pollGlobalQueues()) != null) {
                    return pollGlobalQueues;
                }
            } else {
                Task pollGlobalQueues3 = pollGlobalQueues();
                if (pollGlobalQueues3 != null) {
                    return pollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int nextInt(int i) {
            int i2 = this.rngState;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.rngState = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
        }

        public final Task pollGlobalQueues() {
            int nextInt = nextInt(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            GlobalQueue globalQueue = coroutineScheduler.globalBlockingQueue;
            GlobalQueue globalQueue2 = coroutineScheduler.globalCpuQueue;
            if (nextInt == 0) {
                Task task = (Task) globalQueue2.removeFirstOrNull();
                return task != null ? task : (Task) globalQueue.removeFirstOrNull();
            }
            Task task2 = (Task) globalQueue.removeFirstOrNull();
            return task2 != null ? task2 : (Task) globalQueue2.removeFirstOrNull();
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j;
            loop0: while (true) {
                boolean z = false;
                while (CoroutineScheduler._isTerminated$volatile$FU.get(CoroutineScheduler.this) != 1) {
                    WorkerState workerState = this.state;
                    WorkerState workerState2 = WorkerState.TERMINATED;
                    if (workerState == workerState2) {
                        break loop0;
                    }
                    Task findTask = findTask(this.mayHaveLocalTasks);
                    if (findTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                        this.terminationDeadline = 0L;
                        if (this.state == WorkerState.PARKING) {
                            this.state = WorkerState.BLOCKING;
                        }
                        if (findTask.taskContext) {
                            if (tryReleaseCpu(WorkerState.BLOCKING) && !coroutineScheduler.tryUnpark() && !coroutineScheduler.tryCreateWorker(CoroutineScheduler.controlState$volatile$FU.get(coroutineScheduler))) {
                                coroutineScheduler.tryUnpark();
                            }
                            try {
                                findTask.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            CoroutineScheduler.controlState$volatile$FU.addAndGet(coroutineScheduler, -2097152L);
                            if (this.state != workerState2) {
                                this.state = WorkerState.DORMANT;
                            }
                        } else {
                            try {
                                findTask.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            Object obj = this.nextParkedWorker;
                            Symbol symbol = CoroutineScheduler.NOT_IN_STACK;
                            if (obj != symbol) {
                                workerCtl$volatile$FU.set(this, -1);
                                while (this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = workerCtl$volatile$FU;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler._isTerminated$volatile$FU;
                                        if (atomicIntegerFieldUpdater2.get(coroutineScheduler2) == 1) {
                                            break;
                                        }
                                        WorkerState workerState3 = this.state;
                                        WorkerState workerState4 = WorkerState.TERMINATED;
                                        if (workerState3 == workerState4) {
                                            break;
                                        }
                                        tryReleaseCpu(WorkerState.PARKING);
                                        Thread.interrupted();
                                        if (this.terminationDeadline == 0) {
                                            j = 2097151;
                                            this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
                                        } else {
                                            j = 2097151;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
                                        if (System.nanoTime() - this.terminationDeadline >= 0) {
                                            this.terminationDeadline = 0L;
                                            CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler3.workers) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler3) == 1)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$volatile$FU;
                                                        if (((int) (atomicLongFieldUpdater.get(coroutineScheduler3) & j)) > coroutineScheduler3.corePoolSize && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            setIndexInArray(0);
                                                            coroutineScheduler3.parkedWorkersStackTopUpdate(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(coroutineScheduler3) & j);
                                                            if (andDecrement != i) {
                                                                Object obj2 = coroutineScheduler3.workers.get(andDecrement);
                                                                obj2.getClass();
                                                                Worker worker = (Worker) obj2;
                                                                coroutineScheduler3.workers.setSynchronized(i, worker);
                                                                worker.setIndexInArray(i);
                                                                coroutineScheduler3.parkedWorkersStackTopUpdate(worker, andDecrement, i);
                                                            }
                                                            coroutineScheduler3.workers.setSynchronized(andDecrement, null);
                                                            this.state = workerState4;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                if (this.nextParkedWorker == symbol) {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.parkedWorkersStack$volatile$FU;
                                    while (true) {
                                        long j2 = atomicLongFieldUpdater2.get(coroutineScheduler4);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = coroutineScheduler4.workers.get((int) (j2 & 2097151));
                                        CoroutineScheduler coroutineScheduler5 = coroutineScheduler4;
                                        if (CoroutineScheduler.parkedWorkersStack$volatile$FU.compareAndSet(coroutineScheduler5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                            break;
                                        } else {
                                            coroutineScheduler4 = coroutineScheduler5;
                                        }
                                    }
                                }
                            }
                        } else if (z) {
                            tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        public final void setIndexInArray(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(WorkerState workerState) {
            WorkerState workerState2 = this.state;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.controlState$volatile$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z;
        }

        public final Task trySteal(int i) {
            Task task;
            long tryStealLastScheduled;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$volatile$FU;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i2 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int nextInt = nextInt(i2);
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                nextInt++;
                if (nextInt > i2) {
                    nextInt = 1;
                }
                Worker worker = (Worker) coroutineScheduler.workers.get(nextInt);
                if (worker != null && worker != this) {
                    WorkQueue workQueue = worker.localQueue;
                    workQueue.getClass();
                    if (i == 3) {
                        task = workQueue.pollBuffer();
                    } else {
                        boolean z = i == 1;
                        int i4 = WorkQueue.consumerIndex$volatile$FU.get(workQueue);
                        int i5 = WorkQueue.producerIndex$volatile$FU.get(workQueue);
                        while (i4 != i5 && (!z || WorkQueue.blockingTasksInBuffer$volatile$FU.get(workQueue) != 0)) {
                            int i6 = i4 + 1;
                            task = workQueue.tryExtractFromTheMiddle(i4, z);
                            if (task != null) {
                                break;
                            }
                            i4 = i6;
                        }
                        task = null;
                    }
                    Ref$ObjectRef ref$ObjectRef = this.stolenTask;
                    if (task != null) {
                        ref$ObjectRef.element = task;
                        tryStealLastScheduled = -1;
                    } else {
                        tryStealLastScheduled = workQueue.tryStealLastScheduled(i, ref$ObjectRef);
                    }
                    if (tryStealLastScheduled == -1) {
                        Task task2 = (Task) ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return task2;
                    }
                    if (tryStealLastScheduled > 0) {
                        j = Math.min(j, tryStealLastScheduled);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.minDelayUntilStealableTaskNs = j;
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class WorkerState {
        public static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState BLOCKING;
        public static final WorkerState CPU_ACQUIRED;
        public static final WorkerState DORMANT;
        public static final WorkerState PARKING;
        public static final WorkerState TERMINATED;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            CPU_ACQUIRED = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            BLOCKING = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            PARKING = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            DORMANT = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            TERMINATED = workerState5;
            $VALUES = new WorkerState[]{workerState, workerState2, workerState3, workerState4, workerState5};
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    public CoroutineScheduler(long j, String str, int i, int i2) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i < 1) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, int i) {
        coroutineScheduler.dispatch(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        Task task;
        if (_isTerminated$volatile$FU.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            Worker worker = null;
            Worker worker2 = currentThread instanceof Worker ? (Worker) currentThread : null;
            if (worker2 != null && CoroutineScheduler.this == this) {
                worker = worker2;
            }
            synchronized (this.workers) {
                i = (int) (controlState$volatile$FU.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object obj = this.workers.get(i2);
                    obj.getClass();
                    Worker worker3 = (Worker) obj;
                    if (worker3 != worker) {
                        while (worker3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker3);
                            worker3.join(10000L);
                        }
                        worker3.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (worker != null) {
                    task = worker.findTask(true);
                }
                task = (Task) this.globalCpuQueue.removeFirstOrNull();
                if (task == null && (task = (Task) this.globalBlockingQueue.removeFirstOrNull()) == null) {
                    break;
                }
                try {
                    task.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (worker != null) {
                worker.tryReleaseCpu(WorkerState.TERMINATED);
            }
            parkedWorkersStack$volatile$FU.set(this, 0L);
            controlState$volatile$FU.set(this, 0L);
        }
    }

    public final int createNewWorker() {
        synchronized (this.workers) {
            try {
                if (_isTerminated$volatile$FU.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$volatile$FU;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.corePoolSize) {
                    return 0;
                }
                if (i >= this.maxPoolSize) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.workers.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(i3);
                this.workers.setSynchronized(i3, worker);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                worker.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dispatch(Runnable runnable, boolean z, boolean z2) {
        Task taskImpl;
        WorkerState workerState;
        TasksKt.schedulerTimeSource.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof Task) {
            taskImpl = (Task) runnable;
            taskImpl.submissionTime = nanoTime;
            taskImpl.taskContext = z;
        } else {
            taskImpl = new TaskImpl(runnable, nanoTime, z);
        }
        boolean z3 = taskImpl.taskContext;
        AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$volatile$FU;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        Worker worker = null;
        Worker worker2 = currentThread instanceof Worker ? (Worker) currentThread : null;
        if (worker2 != null && CoroutineScheduler.this == this) {
            worker = worker2;
        }
        if (worker != null && (workerState = worker.state) != WorkerState.TERMINATED && (taskImpl.taskContext || workerState != WorkerState.BLOCKING)) {
            worker.mayHaveLocalTasks = true;
            taskImpl = worker.localQueue.add(taskImpl, z2);
        }
        if (taskImpl != null) {
            if (!(taskImpl.taskContext ? this.globalBlockingQueue.addLast(taskImpl) : this.globalCpuQueue.addLast(taskImpl))) {
                throw new RejectedExecutionException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.schedulerName, " was terminated"));
            }
        }
        if (z3) {
            if (tryUnpark() || tryCreateWorker(addAndGet)) {
                return;
            }
            tryUnpark();
            return;
        }
        if (tryUnpark() || tryCreateWorker(atomicLongFieldUpdater.get(this))) {
            return;
        }
        tryUnpark();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch$default(this, runnable, 6);
    }

    public final void parkedWorkersStackTopUpdate(Worker worker, int i, int i2) {
        while (true) {
            long j = parkedWorkersStack$volatile$FU.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object nextParkedWorker = worker.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == NOT_IN_STACK) {
                            i3 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i3 = 0;
                            break;
                        }
                        Worker worker2 = (Worker) nextParkedWorker;
                        int indexInArray = worker2.getIndexInArray();
                        if (indexInArray != 0) {
                            i3 = indexInArray;
                            break;
                        }
                        nextParkedWorker = worker2.getNextParkedWorker();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                CoroutineScheduler coroutineScheduler = this;
                if (parkedWorkersStack$volatile$FU.compareAndSet(coroutineScheduler, j, i3 | j2)) {
                    return;
                } else {
                    this = coroutineScheduler;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.workers;
        int currentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < currentLength; i6++) {
            Worker worker = (Worker) resizableAtomicArray.get(i6);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int ordinal = worker.state.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(size$kotlinx_coroutines_core);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(size$kotlinx_coroutines_core);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = controlState$volatile$FU.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.schedulerName);
        sb4.append('@');
        sb4.append(JobKt.getHexAddress(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.corePoolSize;
        sb4.append(i7);
        sb4.append(", max = ");
        Recorder$$ExternalSyntheticOutline1.m105m(this.maxPoolSize, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        Recorder$$ExternalSyntheticOutline1.m105m(i2, i3, ", parked = ", ", dormant = ", sb4);
        Recorder$$ExternalSyntheticOutline1.m105m(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.globalCpuQueue.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.globalBlockingQueue.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean tryCreateWorker(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.corePoolSize;
        if (i < i2) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1 && i2 > 1) {
                createNewWorker();
            }
            if (createNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean tryUnpark() {
        CoroutineScheduler coroutineScheduler;
        Symbol symbol;
        int i;
        while (true) {
            long j = parkedWorkersStack$volatile$FU.get(this);
            Worker worker = (Worker) this.workers.get((int) (2097151 & j));
            if (worker == null) {
                worker = null;
                coroutineScheduler = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object nextParkedWorker = worker.getNextParkedWorker();
                while (true) {
                    symbol = NOT_IN_STACK;
                    if (nextParkedWorker == symbol) {
                        i = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        i = 0;
                        break;
                    }
                    Worker worker2 = (Worker) nextParkedWorker;
                    i = worker2.getIndexInArray();
                    if (i != 0) {
                        break;
                    }
                    nextParkedWorker = worker2.getNextParkedWorker();
                    j = j;
                }
                if (i >= 0) {
                    CoroutineScheduler coroutineScheduler2 = this;
                    boolean compareAndSet = parkedWorkersStack$volatile$FU.compareAndSet(coroutineScheduler2, j, i | j2);
                    coroutineScheduler = coroutineScheduler2;
                    if (compareAndSet) {
                        worker.setNextParkedWorker(symbol);
                    }
                    this = coroutineScheduler;
                } else {
                    continue;
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.workerCtl$volatile$FU.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
            this = coroutineScheduler;
        }
    }
}
