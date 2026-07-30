package com.google.android.exoplayer2.util;

import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j8) {
        int i8 = this.size;
        long[] jArr = this.values;
        if (i8 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i8 * 2);
        }
        long[] jArr2 = this.values;
        int i9 = this.size;
        this.size = i9 + 1;
        jArr2[i9] = j8;
    }

    public long get(int i8) {
        if (i8 >= 0 && i8 < this.size) {
            return this.values[i8];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i8 + ", size is " + this.size);
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i8) {
        this.values = new long[i8];
    }
}
