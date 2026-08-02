package org.jctools.queues;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeRefArrayAccess;

/* loaded from: classes10.dex */
public final class MpscBlockingConsumerArrayQueue extends MpscBlockingConsumerArrayQueueConsumerFields implements MessagePassingQueue, BlockingQueue {
    public MpscBlockingConsumerArrayQueue(int i) {
        super((Pow2.roundToPowerOfTwo(i) - 1) << 1, UnsafeRefArrayAccess.allocateRefArray(Pow2.roundToPowerOfTwo(i)));
        RangeUtil.checkGreaterThanOrEqual(i, 1, "capacity");
        soProducerLimit((Pow2.roundToPowerOfTwo(i) - 1) << 1);
    }

    private boolean offerAndWakeup(Object[] objArr, long j, long j2, Object obj) {
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j);
        Thread lvBlocked = lvBlocked();
        if (lvBlocked == null || !casProducerIndex(j2, 1 + j2)) {
            return false;
        }
        UnsafeRefArrayAccess.soRefElement(objArr, modifiedCalcCircularRefElementOffset, obj);
        LockSupport.unpark(lvBlocked);
        return true;
    }

    private Object parkUntilNext(Object[] objArr, long j, long j2, long j3) {
        long lvProducerIndex = lvProducerIndex();
        if (j == lvProducerIndex) {
            long j4 = lvProducerIndex + 1;
            if (casProducerIndex(lvProducerIndex, j4)) {
                soBlocked(Thread.currentThread());
                long nanoTime = j3 == Long.MAX_VALUE ? 0L : System.nanoTime() + j3;
                long j5 = j3;
                while (true) {
                    try {
                        LockSupport.parkNanos(this, j5);
                        if (!Thread.interrupted()) {
                            if ((lvProducerIndex() & 1) == 0) {
                                break;
                            }
                            j5 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : nanoTime - System.nanoTime();
                            if (j5 <= 0) {
                                if (casProducerIndex(j4, lvProducerIndex)) {
                                    return null;
                                }
                            }
                        } else {
                            casProducerIndex(j4, lvProducerIndex);
                            throw new InterruptedException();
                        }
                    } finally {
                        soBlocked(null);
                    }
                }
            }
        }
        Object spinWaitForElement = spinWaitForElement(objArr, j2);
        UnsafeRefArrayAccess.soRefElement(objArr, j2, null);
        soConsumerIndex(j + 2);
        return spinWaitForElement;
    }

    private boolean recalculateProducerLimit(long j, long j2, long j3, long j4, long j5) {
        long j6 = j3 + j4;
        if (j6 > j) {
            casProducerLimit(j2, j6);
        }
        long j7 = j - j3;
        return j7 < j5 && j7 < j4;
    }

    private static <E> E spinWaitForElement(E[] eArr, long j) {
        E e;
        do {
            e = (E) UnsafeRefArrayAccess.lvRefElement(eArr, j);
        } while (e == null);
        return e;
    }

    public int capacity() {
        return (int) ((this.consumerMask + 2) >> 1);
    }

    public int drain(MessagePassingQueue.Consumer consumer) {
        return drain(consumer, capacity());
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return lvConsumerIndex() / 2 == lvProducerIndex() / 2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        MpscBlockingConsumerArrayQueue mpscBlockingConsumerArrayQueue;
        Object[] objArr;
        if (obj == null) {
            throw null;
        }
        long j = this.producerMask;
        Object[] objArr2 = this.producerBuffer;
        while (true) {
            long lvProducerIndex = this.lvProducerIndex();
            if ((lvProducerIndex & 1) == 1) {
                mpscBlockingConsumerArrayQueue = this;
                objArr = objArr2;
                if (mpscBlockingConsumerArrayQueue.offerAndWakeup(objArr2, j, lvProducerIndex, obj)) {
                    return true;
                }
            } else {
                mpscBlockingConsumerArrayQueue = this;
                objArr = objArr2;
                long lvProducerLimit = mpscBlockingConsumerArrayQueue.lvProducerLimit();
                if (lvProducerLimit <= lvProducerIndex) {
                    long j2 = j;
                    boolean recalculateProducerLimit = mpscBlockingConsumerArrayQueue.recalculateProducerLimit(j2, lvProducerIndex, lvProducerLimit);
                    lvProducerIndex = lvProducerIndex;
                    j = j2;
                    if (!recalculateProducerLimit) {
                        return false;
                    }
                }
                if (mpscBlockingConsumerArrayQueue.casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                    UnsafeRefArrayAccess.soRefElement(objArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lvProducerIndex, j), obj);
                    return true;
                }
            }
            this = mpscBlockingConsumerArrayQueue;
            objArr2 = objArr;
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        Object[] objArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        return (lvRefElement != null || lpConsumerIndex == lvProducerIndex()) ? lvRefElement : spinWaitForElement(objArr, modifiedCalcCircularRefElementOffset);
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object poll(long j, TimeUnit timeUnit) {
        Object[] objArr = this.consumerBuffer;
        long j2 = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j2);
        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement != null) {
            UnsafeRefArrayAccess.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
            soConsumerIndex(lpConsumerIndex + 2);
            return lvRefElement;
        }
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 0) {
            return null;
        }
        return parkUntilNext(objArr, lpConsumerIndex, modifiedCalcCircularRefElementOffset, nanos);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(Object obj) {
        if (offer(obj)) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m();
    }

    public Object relaxedPoll() {
        Object[] objArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, this.consumerMask);
        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            return null;
        }
        UnsafeRefArrayAccess.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return capacity() - size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            lvProducerIndex = lvProducerIndex();
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j = (lvProducerIndex - lvConsumerIndex) >> 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.util.concurrent.BlockingQueue
    public Object take() {
        Object[] objArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            return parkUntilNext(objArr, lpConsumerIndex, modifiedCalcCircularRefElementOffset, Long.MAX_VALUE);
        }
        UnsafeRefArrayAccess.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return MpscBlockingConsumerArrayQueue.class.getName();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<Object> collection, int i) {
        throw new UnsupportedOperationException();
    }

    public int drain(MessagePassingQueue.Consumer consumer, int i) {
        return MessagePassingQueueUtil.drain(this, consumer, i);
    }

    private boolean recalculateProducerLimit(long j, long j2, long j3) {
        long j4 = j + 2;
        return recalculateProducerLimit(j2, j3, lvConsumerIndex(), j4, j4);
    }

    @Override // java.util.Queue
    public Object poll() {
        Object[] objArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        Object lvRefElement = UnsafeRefArrayAccess.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            lvRefElement = spinWaitForElement(objArr, modifiedCalcCircularRefElementOffset);
        }
        UnsafeRefArrayAccess.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(Object obj, long j, TimeUnit timeUnit) {
        if (offer(obj)) {
            return true;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m();
        return false;
    }
}
