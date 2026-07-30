package kotlinx.coroutines.scheduling;

import com.google.common.util.concurrent.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class m {
    private volatile int blockingTasksInBuffer;
    private final AtomicReferenceArray<g> buffer = new AtomicReferenceArray<>(128);
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    public static /* synthetic */ g add$default(m mVar, g gVar, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return mVar.add(gVar, z7);
    }

    private final g addLast(g gVar) {
        if (getBufferSize() == 127) {
            return gVar;
        }
        if (gVar.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i8 = producerIndex$FU.get(this) & 127;
        while (this.buffer.get(i8) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i8, gVar);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(g gVar) {
        if (gVar == null || gVar.taskContext.getTaskMode() != 1) {
            return;
        }
        blockingTasksInBuffer$FU.decrementAndGet(this);
    }

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    private final g pollBuffer() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - producerIndex$FU.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (andSet = this.buffer.getAndSet(i9, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(c cVar) {
        g pollBuffer = pollBuffer();
        if (pollBuffer == null) {
            return false;
        }
        cVar.addLast(pollBuffer);
        return true;
    }

    private final g pollWithExclusiveMode(boolean z7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g gVar;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            gVar = (g) atomicReferenceFieldUpdater.get(this);
            if (gVar != null) {
                if ((gVar.taskContext.getTaskMode() == 1) == z7) {
                }
            }
            int i8 = consumerIndex$FU.get(this);
            int i9 = producerIndex$FU.get(this);
            while (i8 != i9) {
                if (z7 && blockingTasksInBuffer$FU.get(this) == 0) {
                    return null;
                }
                i9--;
                g tryExtractFromTheMiddle = tryExtractFromTheMiddle(i9, z7);
                if (tryExtractFromTheMiddle != null) {
                    return tryExtractFromTheMiddle;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, gVar, null));
        return gVar;
    }

    private final g stealWithExclusiveMode(int i8) {
        int i9 = consumerIndex$FU.get(this);
        int i10 = producerIndex$FU.get(this);
        boolean z7 = i8 == 1;
        while (i9 != i10) {
            if (z7 && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            g tryExtractFromTheMiddle = tryExtractFromTheMiddle(i9, z7);
            if (tryExtractFromTheMiddle != null) {
                return tryExtractFromTheMiddle;
            }
            i9 = i11;
        }
        return null;
    }

    private final g tryExtractFromTheMiddle(int i8, boolean z7) {
        int i9 = i8 & 127;
        g gVar = this.buffer.get(i9);
        if (gVar != null) {
            if ((gVar.taskContext.getTaskMode() == 1) == z7 && s.a(this.buffer, i9, gVar, null)) {
                if (z7) {
                    blockingTasksInBuffer$FU.decrementAndGet(this);
                }
                return gVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.g] */
    private final long tryStealLastScheduled(int i8, Ref$ObjectRef<g> ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            r12 = (g) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.taskContext.getTaskMode() != 1 ? 2 : 1) & i8) == 0) {
                return -2L;
            }
            long nanoTime = k.schedulerTimeSource.nanoTime() - r12.submissionTime;
            long j8 = k.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j8) {
                return j8 - nanoTime;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, r12, null));
        ref$ObjectRef.element = r12;
        return -1L;
    }

    public final g add(g gVar, boolean z7) {
        if (z7) {
            return addLast(gVar);
        }
        g gVar2 = (g) lastScheduledTask$FU.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return addLast(gVar2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(c cVar) {
        g gVar = (g) lastScheduledTask$FU.getAndSet(this, null);
        if (gVar != null) {
            cVar.addLast(gVar);
        }
        while (pollTo(cVar)) {
        }
    }

    public final g poll() {
        g gVar = (g) lastScheduledTask$FU.getAndSet(this, null);
        return gVar == null ? pollBuffer() : gVar;
    }

    public final g pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final g pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i8, Ref$ObjectRef<g> ref$ObjectRef) {
        T pollBuffer = i8 == 3 ? pollBuffer() : stealWithExclusiveMode(i8);
        if (pollBuffer == 0) {
            return tryStealLastScheduled(i8, ref$ObjectRef);
        }
        ref$ObjectRef.element = pollBuffer;
        return -1L;
    }
}
