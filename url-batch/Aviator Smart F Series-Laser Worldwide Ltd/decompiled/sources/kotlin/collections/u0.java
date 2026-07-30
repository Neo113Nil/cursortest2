package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class u0 extends b implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public static final class a extends kotlin.collections.a {
        private int count;
        private int index;

        a() {
            this.count = u0.this.size();
            this.index = u0.this.startIndex;
        }

        @Override // kotlin.collections.a
        protected void computeNext() {
            if (this.count == 0) {
                done();
                return;
            }
            setNext(u0.this.buffer[this.index]);
            this.index = (this.index + 1) % u0.this.capacity;
            this.count--;
        }
    }

    public u0(Object[] buffer, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i8 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i8).toString());
        }
        if (i8 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i8;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i8 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    private final int forward(int i8, int i9) {
        return (i8 + i9) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(Object obj) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = obj;
        this.size = size() + 1;
    }

    public final u0 expanded(int i8) {
        int coerceAtMost;
        Object[] array;
        int i9 = this.capacity;
        coerceAtMost = j6.v.coerceAtMost(i9 + (i9 >> 1) + 1, i8);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, coerceAtMost);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new u0(array, size());
    }

    @Override // kotlin.collections.b, java.util.List
    public Object get(int i8) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        return this.buffer[(this.startIndex + i8) % this.capacity];
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new a();
    }

    public final void removeFirst(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i8).toString());
        }
        if (i8 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i8 + ", size = " + size()).toString());
        }
        if (i8 > 0) {
            int i9 = this.startIndex;
            int i10 = (i9 + i8) % this.capacity;
            if (i9 > i10) {
                k.fill(this.buffer, (Object) null, i9, this.capacity);
                k.fill(this.buffer, (Object) null, 0, i10);
            } else {
                k.fill(this.buffer, (Object) null, i9, i10);
            }
            this.startIndex = i10;
            this.size = size() - i8;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.s.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = this.startIndex; i9 < size && i10 < this.capacity; i10++) {
            array[i9] = this.buffer[i10];
            i9++;
        }
        while (i9 < size) {
            array[i9] = this.buffer[i8];
            i9++;
            i8++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public u0(int i8) {
        this(new Object[i8], 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
