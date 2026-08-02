package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* loaded from: classes10.dex */
public abstract class MpscBlockingConsumerArrayQueueProducerFields extends MpscBlockingConsumerArrayQueuePad2 {
    private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    public MpscBlockingConsumerArrayQueueProducerFields(long j, Object[] objArr) {
        super(j, objArr);
    }

    public final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
