package io.reactivex.rxjava3.operators;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes9.dex */
public final class SpscArrayQueue extends AtomicReferenceArray implements SimplePlainQueue {
    public static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final AtomicLong consumerIndex;
    public final int lookAheadStep;
    public final int mask;
    public final AtomicLong producerIndex;
    public long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.producerIndex;
        long j = atomicLong.get();
        int i = this.mask;
        int i2 = ((int) j) & i;
        if (j >= this.producerLookAhead) {
            long j2 = this.lookAheadStep + j;
            if (get(i & ((int) j2)) == null) {
                this.producerLookAhead = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.consumerIndex;
        long j = atomicLong.get();
        int i = ((int) j) & this.mask;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
