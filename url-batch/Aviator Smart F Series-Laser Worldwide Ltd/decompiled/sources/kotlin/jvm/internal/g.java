package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class g implements Iterator, g6.a {
    private final Object[] array;
    private int index;

    public g(Object[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    public final Object[] getArray() {
        return this.array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
