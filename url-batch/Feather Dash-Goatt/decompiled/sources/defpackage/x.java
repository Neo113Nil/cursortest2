package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class x implements ListIterator, yb0 {
    public int d;
    public int e;

    public x(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
