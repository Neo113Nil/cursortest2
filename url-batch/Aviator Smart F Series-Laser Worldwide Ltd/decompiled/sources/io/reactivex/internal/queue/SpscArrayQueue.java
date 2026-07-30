package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i8) {
        super(Pow2.roundToPowerOfTwo(i8));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i8 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    int calcElementOffset(long j8) {
        return this.mask & ((int) j8);
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
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    E lvElement(int i8) {
        return get(i8);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e8) {
        if (e8 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i8 = this.mask;
        long j8 = this.producerIndex.get();
        int calcElementOffset = calcElementOffset(j8, i8);
        if (j8 >= this.producerLookAhead) {
            long j9 = this.lookAheadStep + j8;
            if (lvElement(calcElementOffset(j9, i8)) == null) {
                this.producerLookAhead = j9;
            } else if (lvElement(calcElementOffset) != null) {
                return false;
            }
        }
        soElement(calcElementOffset, e8);
        soProducerIndex(j8 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j8 = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j8);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j8 + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    void soConsumerIndex(long j8) {
        this.consumerIndex.lazySet(j8);
    }

    void soElement(int i8, E e8) {
        lazySet(i8, e8);
    }

    void soProducerIndex(long j8) {
        this.producerIndex.lazySet(j8);
    }

    int calcElementOffset(long j8, int i8) {
        return ((int) j8) & i8;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e8, E e9) {
        return offer(e8) && offer(e9);
    }
}
