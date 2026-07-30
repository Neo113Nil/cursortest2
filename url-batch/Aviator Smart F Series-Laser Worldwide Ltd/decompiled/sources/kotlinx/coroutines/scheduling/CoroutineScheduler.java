package kotlinx.coroutines.scheduling;

import j6.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.random.Random;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.k0;
import y5.w;

/* loaded from: classes5.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.c globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.c globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    public final String schedulerName;
    public final b0 workers;
    public static final a Companion = new a(null);
    private static final AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private static final AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    public static final g0 NOT_IN_STACK = new g0("NOT_IN_STACK");

    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoroutineScheduler(int i8, int i9, long j8, String str) {
        this.corePoolSize = i8;
        this.maxPoolSize = i9;
        this.idleWorkerKeepAliveNs = j8;
        this.schedulerName = str;
        if (i8 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.globalCpuQueue = new kotlinx.coroutines.scheduling.c();
        this.globalBlockingQueue = new kotlinx.coroutines.scheduling.c();
        this.workers = new b0((i8 + 1) * 2);
        this.controlState = i8 << 42;
        this._isTerminated = 0;
    }

    private final boolean addToGlobalQueue(g gVar) {
        return gVar.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.addLast(gVar) : this.globalCpuQueue.addLast(gVar);
    }

    private final int blockingTasks(long j8) {
        return (int) ((j8 & BLOCKING_MASK) >> 21);
    }

    private final int createNewWorker() {
        int coerceAtLeast;
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                coerceAtLeast = v.coerceAtLeast(i8 - ((int) ((j8 & BLOCKING_MASK) >> 21)), 0);
                if (coerceAtLeast >= this.corePoolSize) {
                    return 0;
                }
                if (i8 >= this.maxPoolSize) {
                    return 0;
                }
                int i9 = ((int) (controlState$FU.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.workers.get(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i9);
                this.workers.setSynchronized(i9, cVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i10 = coerceAtLeast + 1;
                cVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final int createdWorkers(long j8) {
        return (int) (j8 & 2097151);
    }

    private final c currentWorker() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !s.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, PARKED_VERSION_MASK);
    }

    private final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, h hVar, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            hVar = k.NonBlockingContext;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        coroutineScheduler.dispatch(runnable, hVar, z7);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$FU.get(this) & CPU_PERMITS_MASK) >> 42);
    }

    private final int getCreatedWorkers() {
        return (int) (controlState$FU.get(this) & 2097151);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152L);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int parkedWorkersStackNextIndex(c cVar) {
        Object nextParkedWorker = cVar.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar2 = (c) nextParkedWorker;
            int indexInArray = cVar2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar2.getNextParkedWorker();
        }
        return -1;
    }

    private final c parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.workers.get((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (2097152 + j8) & PARKED_VERSION_MASK;
            int parkedWorkersStackNextIndex = parkedWorkersStackNextIndex(cVar);
            if (parkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j8, parkedWorkersStackNextIndex | j9)) {
                cVar.setNextParkedWorker(NOT_IN_STACK);
                return cVar;
            }
        }
    }

    private final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    private final void signalBlockingWork(long j8, boolean z7) {
        if (z7 || tryUnpark() || tryCreateWorker(j8)) {
            return;
        }
        tryUnpark();
    }

    private final g submitToLocalQueue(c cVar, g gVar, boolean z7) {
        if (cVar == null) {
            return gVar;
        }
        if (cVar.state == WorkerState.TERMINATED) {
            return gVar;
        }
        if (gVar.taskContext.getTaskMode() == 0 && cVar.state == WorkerState.BLOCKING) {
            return gVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.add(gVar, z7);
    }

    private final boolean tryAcquireCpuPermit() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) ((CPU_PERMITS_MASK & j8) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j8, j8 - 4398046511104L));
        return true;
    }

    private final boolean tryCreateWorker(long j8) {
        int coerceAtLeast;
        coerceAtLeast = v.coerceAtLeast(((int) (2097151 & j8)) - ((int) ((j8 & BLOCKING_MASK) >> 21)), 0);
        if (coerceAtLeast < this.corePoolSize) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (createNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = controlState$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j8);
    }

    private final boolean tryUnpark() {
        c parkedWorkersStackPop;
        do {
            parkedWorkersStackPop = parkedWorkersStackPop();
            if (parkedWorkersStackPop == null) {
                return false;
            }
        } while (!c.workerCtl$FU.compareAndSet(parkedWorkersStackPop, -1, 0));
        LockSupport.unpark(parkedWorkersStackPop);
        return true;
    }

    public final int availableCpuPermits(long j8) {
        return (int) ((j8 & CPU_PERMITS_MASK) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    public final g createTask(Runnable runnable, h hVar) {
        long nanoTime = k.schedulerTimeSource.nanoTime();
        if (!(runnable instanceof g)) {
            return new j(runnable, nanoTime, hVar);
        }
        g gVar = (g) runnable;
        gVar.submissionTime = nanoTime;
        gVar.taskContext = hVar;
        return gVar;
    }

    public final void dispatch(Runnable runnable, h hVar, boolean z7) {
        kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
        if (timeSource != null) {
            timeSource.trackTask();
        }
        g createTask = createTask(runnable, hVar);
        boolean z8 = false;
        boolean z9 = createTask.taskContext.getTaskMode() == 1;
        long addAndGet = z9 ? controlState$FU.addAndGet(this, 2097152L) : 0L;
        c currentWorker = currentWorker();
        g submitToLocalQueue = submitToLocalQueue(currentWorker, createTask, z7);
        if (submitToLocalQueue != null && !addToGlobalQueue(submitToLocalQueue)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z7 && currentWorker != null) {
            z8 = true;
        }
        if (z9) {
            signalBlockingWork(addAndGet, z8);
        } else {
            if (z8) {
                return;
            }
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return _isTerminated$FU.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(c cVar) {
        long j8;
        long j9;
        int indexInArray;
        if (cVar.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = (2097152 + j8) & PARKED_VERSION_MASK;
            indexInArray = cVar.getIndexInArray();
            cVar.setNextParkedWorker(this.workers.get((int) (2097151 & j8)));
        } while (!parkedWorkersStack$FU.compareAndSet(this, j8, j9 | indexInArray));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & PARKED_VERSION_MASK;
            if (i10 == i8) {
                i10 = i9 == 0 ? parkedWorkersStackNextIndex(cVar) : i9;
            }
            if (i10 >= 0 && parkedWorkersStack$FU.compareAndSet(this, j8, j9 | i10)) {
                return;
            }
        }
    }

    public final void runSafely(g gVar) {
        try {
            gVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
                if (timeSource == null) {
                }
            } finally {
                kotlinx.coroutines.b timeSource2 = kotlinx.coroutines.c.getTimeSource();
                if (timeSource2 != null) {
                    timeSource2.unTrackTask();
                }
            }
        }
    }

    public final void shutdown(long j8) {
        int i8;
        g gVar;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            c currentWorker = currentWorker();
            synchronized (this.workers) {
                i8 = (int) (controlState$FU.get(this) & 2097151);
            }
            if (1 <= i8) {
                int i9 = 1;
                while (true) {
                    Object obj = this.workers.get(i9);
                    s.checkNotNull(obj);
                    c cVar = (c) obj;
                    if (cVar != currentWorker) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j8);
                        }
                        cVar.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                    }
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (currentWorker != null) {
                    gVar = currentWorker.findTask(true);
                    if (gVar != null) {
                        continue;
                        runSafely(gVar);
                    }
                }
                gVar = (g) this.globalCpuQueue.removeFirstOrNull();
                if (gVar == null && (gVar = (g) this.globalBlockingQueue.removeFirstOrNull()) == null) {
                    break;
                }
                runSafely(gVar);
            }
            if (currentWorker != null) {
                currentWorker.tryReleaseCpu(WorkerState.TERMINATED);
            }
            parkedWorkersStack$FU.set(this, 0L);
            controlState$FU.set(this, 0L);
        }
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int currentLength = this.workers.currentLength();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < currentLength; i13++) {
            c cVar = (c) this.workers.get(i13);
            if (cVar != null) {
                int size$kotlinx_coroutines_core = cVar.localQueue.getSize$kotlinx_coroutines_core();
                int i14 = b.$EnumSwitchMapping$0[cVar.state.ordinal()];
                if (i14 == 1) {
                    i10++;
                } else if (i14 == 2) {
                    i9++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(size$kotlinx_coroutines_core);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i14 == 3) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i14 == 4) {
                    i11++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(size$kotlinx_coroutines_core);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i14 == 5) {
                    i12++;
                }
            }
        }
        long j8 = controlState$FU.get(this);
        return this.schedulerName + '@' + k0.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.getSize() + ", global blocking queue size = " + this.globalBlockingQueue.getSize() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((BLOCKING_MASK & j8) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((CPU_PERMITS_MASK & j8) >> 42))) + "}]";
    }

    public final class c extends Thread {
        private static final AtomicIntegerFieldUpdater workerCtl$FU = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        public final m localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        private int rngState;
        public WorkerState state;
        private final Ref$ObjectRef<g> stolenTask;
        private long terminationDeadline;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.localQueue = new m();
            this.stolenTask = new Ref$ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.rngState = Random.Default.nextInt();
        }

        private final void afterTask(int i8) {
            if (i8 == 0) {
                return;
            }
            CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        private final void beforeTask(int i8) {
            if (i8 != 0 && tryReleaseCpu(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.signalCpuWork();
            }
        }

        private final void executeTask(g gVar) {
            int taskMode = gVar.taskContext.getTaskMode();
            idleReset(taskMode);
            beforeTask(taskMode);
            CoroutineScheduler.this.runSafely(gVar);
            afterTask(taskMode);
        }

        private final g findAnyTask(boolean z7) {
            g pollGlobalQueues;
            g pollGlobalQueues2;
            if (z7) {
                boolean z8 = nextInt(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z8 && (pollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return pollGlobalQueues2;
                }
                g poll = this.localQueue.poll();
                if (poll != null) {
                    return poll;
                }
                if (!z8 && (pollGlobalQueues = pollGlobalQueues()) != null) {
                    return pollGlobalQueues;
                }
            } else {
                g pollGlobalQueues3 = pollGlobalQueues();
                if (pollGlobalQueues3 != null) {
                    return pollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final g findBlockingTask() {
            g pollBlocking = this.localQueue.pollBlocking();
            if (pollBlocking != null) {
                return pollBlocking;
            }
            g gVar = (g) CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return gVar == null ? trySteal(1) : gVar;
        }

        private final g findCpuTask() {
            g pollCpu = this.localQueue.pollCpu();
            if (pollCpu != null) {
                return pollCpu;
            }
            g gVar = (g) CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return gVar == null ? trySteal(2) : gVar;
        }

        private final void idleReset(int i8) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        private final boolean inStack() {
            return this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final g pollGlobalQueues() {
            if (nextInt(2) == 0) {
                g gVar = (g) CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return gVar != null ? gVar : (g) CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            g gVar2 = (g) CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return gVar2 != null ? gVar2 : (g) CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z7 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                    g findTask = findTask(this.mayHaveLocalTasks);
                    if (findTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(findTask);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            tryPark();
                        } else if (z7) {
                            tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z7 = true;
                        }
                    }
                }
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        private final boolean tryAcquireCpuPermit() {
            long j8;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$FU;
            do {
                j8 = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((CoroutineScheduler.CPU_PERMITS_MASK & j8) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j8, j8 - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void tryPark() {
            if (!inStack()) {
                CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$FU.set(this, -1);
            while (inStack() && workerCtl$FU.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                park();
            }
        }

        private final g trySteal(int i8) {
            int i9 = (int) (CoroutineScheduler.controlState$FU.get(CoroutineScheduler.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int nextInt = nextInt(i9);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j8 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                nextInt++;
                if (nextInt > i9) {
                    nextInt = 1;
                }
                c cVar = (c) coroutineScheduler.workers.get(nextInt);
                if (cVar != null && cVar != this) {
                    long trySteal = cVar.localQueue.trySteal(i8, this.stolenTask);
                    if (trySteal == -1) {
                        Ref$ObjectRef<g> ref$ObjectRef = this.stolenTask;
                        g gVar = ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return gVar;
                    }
                    if (trySteal > 0) {
                        j8 = Math.min(j8, trySteal);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.minDelayUntilStealableTaskNs = j8;
            return null;
        }

        private final void tryTerminateWorker() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.controlState$FU.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (workerCtl$FU.compareAndSet(this, -1, 1)) {
                        int i8 = this.indexInArray;
                        setIndexInArray(0);
                        coroutineScheduler.parkedWorkersStackTopUpdate(this, i8, 0);
                        int andDecrement = (int) (CoroutineScheduler.controlState$FU.getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i8) {
                            Object obj = coroutineScheduler.workers.get(andDecrement);
                            s.checkNotNull(obj);
                            c cVar = (c) obj;
                            coroutineScheduler.workers.setSynchronized(i8, cVar);
                            cVar.setIndexInArray(i8);
                            coroutineScheduler.parkedWorkersStackTopUpdate(cVar, andDecrement, i8);
                        }
                        coroutineScheduler.workers.setSynchronized(andDecrement, null);
                        w wVar = w.INSTANCE;
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g findTask(boolean z7) {
            return tryAcquireCpuPermit() ? findAnyTask(z7) : findBlockingTask();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        public final boolean isIo() {
            return this.state == WorkerState.BLOCKING;
        }

        public final int nextInt(int i8) {
            int i9 = this.rngState;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.rngState = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i8;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        public final long runSingleTask() {
            boolean z7 = this.state == WorkerState.CPU_ACQUIRED;
            g findCpuTask = z7 ? findCpuTask() : findBlockingTask();
            if (findCpuTask == null) {
                long j8 = this.minDelayUntilStealableTaskNs;
                if (j8 == 0) {
                    return -1L;
                }
                return j8;
            }
            CoroutineScheduler.this.runSafely(findCpuTask);
            if (!z7) {
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            }
            return 0L;
        }

        public final void setIndexInArray(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(WorkerState workerState) {
            WorkerState workerState2 = this.state;
            boolean z7 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z7) {
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z7;
        }

        public c(CoroutineScheduler coroutineScheduler, int i8) {
            this();
            setIndexInArray(i8);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i8, int i9, long j8, String str, int i10, o oVar) {
        this(i8, i9, (i10 & 4) != 0 ? k.IDLE_WORKER_KEEP_ALIVE_NS : j8, (i10 & 8) != 0 ? k.DEFAULT_SCHEDULER_NAME : str);
    }
}
