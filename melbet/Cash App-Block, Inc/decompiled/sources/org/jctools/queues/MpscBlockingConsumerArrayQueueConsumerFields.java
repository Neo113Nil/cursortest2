package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* loaded from: classes10.dex */
public abstract class MpscBlockingConsumerArrayQueueConsumerFields extends MpscBlockingConsumerArrayQueuePad3 {
    private volatile Thread blocked;
    protected final Object[] consumerBuffer;
    private volatile long consumerIndex;
    protected final long consumerMask;
    private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueConsumerFields.class, "consumerIndex");
    private static final long BLOCKED_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueConsumerFields.class, "blocked");

    public MpscBlockingConsumerArrayQueueConsumerFields(long j, Object[] objArr) {
        super(j, objArr);
        this.consumerMask = j;
        this.consumerBuffer = objArr;
    }

    public final long lpConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    public final Thread lvBlocked() {
        return this.blocked;
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    public final void soBlocked(Thread thread) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, BLOCKED_OFFSET, thread);
    }

    public final void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}
