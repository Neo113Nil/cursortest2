package kotlin.collections;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class RingBuffer extends AbstractList implements RandomAccess {
    public final Object[] buffer;
    public final int capacity;
    public int size;
    public int startIndex;

    public RingBuffer(int i, Object[] objArr) {
        this.buffer = objArr;
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.capacity = objArr.length;
            this.size = i;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1(objArr.length, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.size;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        return this.buffer[(this.startIndex + i) % this.capacity];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new RingBuffer$iterator$1(this);
    }

    public final void removeFirst(int i) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.size) {
            Path$$ExternalSyntheticBUOutline0.m$1(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.startIndex;
            int i3 = this.capacity;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.buffer;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.startIndex = i4;
            this.size -= i;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.size;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.size;
        int i3 = this.startIndex;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.buffer;
            if (i5 >= i2 || i3 >= this.capacity) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }
}
