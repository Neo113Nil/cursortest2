package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
        this(10);
    }

    private void addUnchecked(long j8, V v7) {
        int i8 = this.first;
        int i9 = this.size;
        V[] vArr = this.values;
        int length = (i8 + i9) % vArr.length;
        this.timestamps[length] = j8;
        vArr[length] = v7;
        this.size = i9 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j8) {
        if (this.size > 0) {
            if (j8 <= this.timestamps[((this.first + r0) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i8 = length * 2;
        long[] jArr = new long[i8];
        V[] vArr = (V[]) newArray(i8);
        int i9 = this.first;
        int i10 = length - i9;
        System.arraycopy(this.timestamps, i9, jArr, 0, i10);
        System.arraycopy(this.values, this.first, vArr, 0, i10);
        int i11 = this.first;
        if (i11 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i10, i11);
            System.arraycopy(this.values, 0, vArr, i10, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private static <V> V[] newArray(int i8) {
        return (V[]) new Object[i8];
    }

    @Nullable
    private V popFirst() {
        Assertions.checkState(this.size > 0);
        V[] vArr = this.values;
        int i8 = this.first;
        V v7 = vArr[i8];
        vArr[i8] = null;
        this.first = (i8 + 1) % vArr.length;
        this.size--;
        return v7;
    }

    public synchronized void add(long j8, V v7) {
        clearBufferOnTimeDiscontinuity(j8);
        doubleCapacityIfFull();
        addUnchecked(j8, v7);
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill(this.values, (Object) null);
    }

    @Nullable
    public synchronized V poll(long j8) {
        return poll(j8, false);
    }

    @Nullable
    public synchronized V pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    @Nullable
    public synchronized V pollFloor(long j8) {
        return poll(j8, true);
    }

    public synchronized int size() {
        return this.size;
    }

    public TimedValueQueue(int i8) {
        this.timestamps = new long[i8];
        this.values = (V[]) newArray(i8);
    }

    @Nullable
    private V poll(long j8, boolean z7) {
        V v7 = null;
        long j9 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j10 = j8 - this.timestamps[this.first];
            if (j10 < 0 && (z7 || (-j10) >= j9)) {
                break;
            }
            v7 = popFirst();
            j9 = j10;
        }
        return v7;
    }
}
