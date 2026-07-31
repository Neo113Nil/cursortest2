package io.opentelemetry.sdk.internal;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DynamicPrimitiveLongList extends AbstractList<Long> {
    private static final int DEFAULT_SUBARRAY_CAPACITY = 10;
    private int arrayCount;
    private long[][] arrays;
    private int size;
    private final int subarrayCapacity;

    public static DynamicPrimitiveLongList of(long... jArr) {
        DynamicPrimitiveLongList dynamicPrimitiveLongList = new DynamicPrimitiveLongList();
        dynamicPrimitiveLongList.resizeAndClear(jArr.length);
        for (int i = 0; i < jArr.length; i++) {
            dynamicPrimitiveLongList.setLong(i, jArr[i]);
        }
        return dynamicPrimitiveLongList;
    }

    public static DynamicPrimitiveLongList ofSubArrayCapacity(int i) {
        return new DynamicPrimitiveLongList(i);
    }

    public static DynamicPrimitiveLongList empty() {
        return new DynamicPrimitiveLongList();
    }

    DynamicPrimitiveLongList() {
        this(10);
    }

    DynamicPrimitiveLongList(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Subarray capacity must be positive");
        }
        this.subarrayCapacity = i;
        this.arrays = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 0, i);
        this.arrayCount = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    public long getLong(int i) {
        rangeCheck(i);
        long[][] jArr = this.arrays;
        int i2 = this.subarrayCapacity;
        return jArr[i / i2][i % i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    public long setLong(int i, long j) {
        rangeCheck(i);
        long[][] jArr = this.arrays;
        int i2 = this.subarrayCapacity;
        long j2 = jArr[i / i2][i % i2];
        jArr[i / i2][i % i2] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    public void resizeAndClear(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("New size must be non-negative");
        }
        ensureCapacity(i);
        this.size = i;
        for (int i2 = 0; i2 < i; i2++) {
            setLong(i2, 0L);
        }
    }

    private void ensureCapacity(int i) {
        int i2 = ((i + r0) - 1) / this.subarrayCapacity;
        if (i2 > this.arrayCount) {
            this.arrays = (long[][]) Arrays.copyOf(this.arrays, i2);
            for (int i3 = this.arrayCount; i3 < i2; i3++) {
                this.arrays[i3] = new long[this.subarrayCapacity];
            }
            this.arrayCount = i2;
        }
    }

    private void rangeCheck(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(i));
        }
    }

    private String outOfBoundsMsg(int i) {
        return "Index: " + i + ", Size: " + this.size;
    }
}
