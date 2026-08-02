package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* loaded from: classes10.dex */
public abstract class MpscBlockingConsumerArrayQueueColdProducerFields extends MpscBlockingConsumerArrayQueuePad1 {
    private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueColdProducerFields.class, "producerLimit");
    protected final Object[] producerBuffer;
    private volatile long producerLimit;
    protected final long producerMask;

    public MpscBlockingConsumerArrayQueueColdProducerFields(long j, Object[] objArr) {
        this.producerMask = j;
        this.producerBuffer = objArr;
    }

    public final boolean casProducerLimit(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j, j2);
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}
