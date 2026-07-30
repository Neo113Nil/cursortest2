package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();
    final AtomicLong producerIndex = new AtomicLong();
    final AtomicLong consumerIndex = new AtomicLong();

    public SpscLinkedArrayQueue(int i8) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i8));
        int i9 = roundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i9;
        adjustLookAheadStep(roundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i9;
        this.producerLookAhead = roundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i8) {
        this.producerLookAheadStep = Math.min(i8 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i8) {
        return i8;
    }

    private static int calcWrappedOffset(long j8, int i8) {
        return calcDirectOffset(((int) j8) & i8);
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i8) {
        return atomicReferenceArray.get(i8);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i8) {
        int calcDirectOffset = calcDirectOffset(i8);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, calcDirectOffset);
        soElement(atomicReferenceArray, calcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j8, int i8) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j8, i8));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j8, int i8) {
        this.consumerBuffer = atomicReferenceArray;
        int calcWrappedOffset = calcWrappedOffset(j8, i8);
        T t7 = (T) lvElement(atomicReferenceArray, calcWrappedOffset);
        if (t7 != null) {
            soElement(atomicReferenceArray, calcWrappedOffset, null);
            soConsumerIndex(j8 + 1);
        }
        return t7;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j8, int i8, T t7, long j9) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j9 + j8) - 1;
        soElement(atomicReferenceArray2, i8, t7);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i8, HAS_NEXT);
        soProducerIndex(j8 + 1);
    }

    private void soConsumerIndex(long j8) {
        this.consumerIndex.lazySet(j8);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i8, Object obj) {
        atomicReferenceArray.lazySet(i8, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j8) {
        this.producerIndex.lazySet(j8);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t7, long j8, int i8) {
        soElement(atomicReferenceArray, i8, t7);
        soProducerIndex(j8 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t7) {
        if (t7 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long lpProducerIndex = lpProducerIndex();
        int i8 = this.producerMask;
        int calcWrappedOffset = calcWrappedOffset(lpProducerIndex, i8);
        if (lpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t7, lpProducerIndex, calcWrappedOffset);
        }
        long j8 = this.producerLookAheadStep + lpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j8, i8)) == null) {
            this.producerLookAhead = j8 - 1;
            return writeToQueue(atomicReferenceArray, t7, lpProducerIndex, calcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + lpProducerIndex, i8)) == null) {
            return writeToQueue(atomicReferenceArray, t7, lpProducerIndex, calcWrappedOffset);
        }
        resize(atomicReferenceArray, lpProducerIndex, calcWrappedOffset, t7, i8);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i8 = this.consumerMask;
        T t7 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(lpConsumerIndex, i8));
        return t7 == HAS_NEXT ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i8 + 1), lpConsumerIndex, i8) : t7;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i8 = this.consumerMask;
        int calcWrappedOffset = calcWrappedOffset(lpConsumerIndex, i8);
        T t7 = (T) lvElement(atomicReferenceArray, calcWrappedOffset);
        boolean z7 = t7 == HAS_NEXT;
        if (t7 == null || z7) {
            if (z7) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i8 + 1), lpConsumerIndex, i8);
            }
            return null;
        }
        soElement(atomicReferenceArray, calcWrappedOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return t7;
    }

    public int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t7, T t8) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long lvProducerIndex = lvProducerIndex();
        int i8 = this.producerMask;
        long j8 = 2 + lvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j8, i8)) == null) {
            int calcWrappedOffset = calcWrappedOffset(lvProducerIndex, i8);
            soElement(atomicReferenceArray, calcWrappedOffset + 1, t8);
            soElement(atomicReferenceArray, calcWrappedOffset, t7);
            soProducerIndex(j8);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int calcWrappedOffset2 = calcWrappedOffset(lvProducerIndex, i8);
        soElement(atomicReferenceArray2, calcWrappedOffset2 + 1, t8);
        soElement(atomicReferenceArray2, calcWrappedOffset2, t7);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, calcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j8);
        return true;
    }
}
