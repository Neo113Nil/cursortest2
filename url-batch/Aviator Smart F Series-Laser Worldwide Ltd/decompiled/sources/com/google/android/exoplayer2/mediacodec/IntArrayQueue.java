package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

@Deprecated
/* loaded from: classes3.dex */
final class IntArrayQueue {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int wrapAroundMask;
    private int headIndex = 0;
    private int tailIndex = -1;
    private int size = 0;
    private int[] data = new int[16];

    public IntArrayQueue() {
        this.wrapAroundMask = r0.length - 1;
    }

    private void doubleArraySize() {
        int[] iArr = this.data;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i8 = this.headIndex;
        int i9 = length2 - i8;
        System.arraycopy(iArr, i8, iArr2, 0, i9);
        System.arraycopy(this.data, 0, iArr2, i9, i8);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = iArr2;
        this.wrapAroundMask = iArr2.length - 1;
    }

    public void add(int i8) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i9 = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i9;
        this.data[i9] = i8;
        this.size++;
    }

    public int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int remove() {
        int i8 = this.size;
        if (i8 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.data;
        int i9 = this.headIndex;
        int i10 = iArr[i9];
        this.headIndex = (i9 + 1) & this.wrapAroundMask;
        this.size = i8 - 1;
        return i10;
    }

    public int size() {
        return this.size;
    }
}
