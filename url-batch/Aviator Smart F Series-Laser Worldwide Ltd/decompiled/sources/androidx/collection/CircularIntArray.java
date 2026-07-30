package androidx.collection;

import kotlin.collections.k;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CircularIntArray {
    private int capacityBitmask;
    private int[] elements;
    private int head;
    private int tail;

    public CircularIntArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i8 = this.head;
        int i9 = length - i8;
        int i10 = length << 1;
        if (i10 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i10];
        k.copyInto(iArr, iArr2, 0, i8, length);
        k.copyInto(this.elements, iArr2, i9, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i10 - 1;
    }

    public final void addFirst(int i8) {
        int i9 = (this.head - 1) & this.capacityBitmask;
        this.head = i9;
        this.elements[i9] = i8;
        if (i9 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(int i8) {
        int[] iArr = this.elements;
        int i9 = this.tail;
        iArr[i9] = i8;
        int i10 = this.capacityBitmask & (i9 + 1);
        this.tail = i10;
        if (i10 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        this.tail = this.head;
    }

    public final int get(int i8) {
        if (i8 < 0 || i8 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elements[this.capacityBitmask & (this.head + i8)];
    }

    public final int getFirst() {
        int i8 = this.head;
        if (i8 != this.tail) {
            return this.elements[i8];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i8 = this.head;
        int i9 = this.tail;
        if (i8 != i9) {
            return this.elements[(i9 - 1) & this.capacityBitmask];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final int popFirst() {
        int i8 = this.head;
        if (i8 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = this.elements[i8];
        this.head = (i8 + 1) & this.capacityBitmask;
        return i9;
    }

    public final int popLast() {
        int i8 = this.head;
        int i9 = this.tail;
        if (i8 == i9) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = this.capacityBitmask & (i9 - 1);
        int i11 = this.elements[i10];
        this.tail = i10;
        return i11;
    }

    public final void removeFromEnd(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.tail = this.capacityBitmask & (this.tail - i8);
    }

    public final void removeFromStart(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.head = this.capacityBitmask & (this.head + i8);
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularIntArray(int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i8 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i8 = Integer.bitCount(i8) != 1 ? Integer.highestOneBit(i8 - 1) << 1 : i8;
        this.capacityBitmask = i8 - 1;
        this.elements = new int[i8];
    }

    public /* synthetic */ CircularIntArray(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 8 : i8);
    }
}
