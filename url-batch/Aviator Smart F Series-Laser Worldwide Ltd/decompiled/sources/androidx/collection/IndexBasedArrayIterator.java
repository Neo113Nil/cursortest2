package androidx.collection;

import g6.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, d {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i8) {
        this.size = i8;
    }

    protected abstract T elementAt(int i8);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T elementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i8 = this.index - 1;
        this.index = i8;
        removeAt(i8);
        this.size--;
        this.canRemove = false;
    }

    protected abstract void removeAt(int i8);
}
