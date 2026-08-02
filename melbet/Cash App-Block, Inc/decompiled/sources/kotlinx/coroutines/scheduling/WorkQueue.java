package kotlinx.coroutines.scheduling;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class WorkQueue {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public final AtomicReferenceArray buffer = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long lastScheduledTask$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(WorkQueue.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater producerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater consumerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    public final Task add(Task task, boolean z) {
        if (z) {
            return addLast(task);
        }
        lastScheduledTask$volatile$FU.getClass();
        Task task2 = (Task) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getAndSetObject(this, lastScheduledTask$volatile$FU$offset, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final Task addLast(Task task) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = producerIndex$volatile$FU;
        if (atomicIntegerFieldUpdater.get(this) - consumerIndex$volatile$FU.get(this) == 127) {
            return task;
        }
        if (task.taskContext) {
            blockingTasksInBuffer$volatile$FU.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.buffer;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, task);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int getSize$kotlinx_coroutines_core() {
        lastScheduledTask$volatile$FU.getClass();
        Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, lastScheduledTask$volatile$FU$offset);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$volatile$FU;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = producerIndex$volatile$FU;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        lastScheduledTask$volatile$FU.getClass();
        Task task = (Task) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getAndSetObject(this, lastScheduledTask$volatile$FU$offset, (Object) null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (true) {
            Task pollBuffer = pollBuffer();
            if (pollBuffer == null) {
                return;
            } else {
                globalQueue.addLast(pollBuffer);
            }
        }
    }

    public final Task poll() {
        lastScheduledTask$volatile$FU.getClass();
        Task task = (Task) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getAndSetObject(this, lastScheduledTask$volatile$FU$offset, (Object) null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBuffer() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$volatile$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - producerIndex$volatile$FU.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (task = (Task) this.buffer.getAndSet(i2, null)) != null) {
                if (task.taskContext) {
                    blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
                }
                return task;
            }
        }
    }

    public final Task pollWithExclusiveMode() {
        WorkQueue workQueue;
        while (true) {
            lastScheduledTask$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = lastScheduledTask$volatile$FU$offset;
            Task task = (Task) unsafe.getObjectVolatile(this, j);
            if (task != null && task.taskContext) {
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    workQueue = this;
                    if (unsafe2.compareAndSwapObject(workQueue, lastScheduledTask$volatile$FU$offset, task, (Object) null)) {
                        return task;
                    }
                    if (unsafe2.getObjectVolatile(workQueue, j) != task) {
                        break;
                    }
                    this = workQueue;
                }
            }
            this = workQueue;
        }
        WorkQueue workQueue2 = this;
        int i = consumerIndex$volatile$FU.get(workQueue2);
        int i2 = producerIndex$volatile$FU.get(workQueue2);
        while (i != i2 && blockingTasksInBuffer$volatile$FU.get(workQueue2) != 0) {
            i2--;
            Task tryExtractFromTheMiddle = workQueue2.tryExtractFromTheMiddle(i2, true);
            if (tryExtractFromTheMiddle != null) {
                return tryExtractFromTheMiddle;
            }
        }
        return null;
    }

    public final Task tryExtractFromTheMiddle(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.buffer;
        Task task = (Task) atomicReferenceArray.get(i2);
        if (task != null && task.taskContext == z) {
            while (!atomicReferenceArray.compareAndSet(i2, task, null)) {
                if (atomicReferenceArray.get(i2) != task) {
                }
            }
            if (z) {
                blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
            }
            return task;
        }
        return null;
    }

    public final long tryStealLastScheduled(int i, Ref$ObjectRef ref$ObjectRef) {
        WorkQueue workQueue;
        while (true) {
            lastScheduledTask$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = lastScheduledTask$volatile$FU$offset;
            Task task = (Task) unsafe.getObjectVolatile(this, j);
            if (task == null) {
                return -2L;
            }
            if (((task.taskContext ? 1 : 2) & i) == 0) {
                return -2L;
            }
            TasksKt.schedulerTimeSource.getClass();
            long nanoTime = System.nanoTime() - task.submissionTime;
            long j2 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                workQueue = this;
                if (unsafe2.compareAndSwapObject(workQueue, lastScheduledTask$volatile$FU$offset, task, (Object) null)) {
                    ref$ObjectRef.element = task;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(workQueue, j) != task) {
                    break;
                }
                this = workQueue;
            }
            this = workQueue;
        }
    }
}
