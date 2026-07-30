package E1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements ListIterator, Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f659d;

    /* renamed from: e, reason: collision with root package name */
    public int f660e;

    /* renamed from: i, reason: collision with root package name */
    public final e f661i;

    public b(e eVar, int i2) {
        int size = eVar.size();
        if (i2 < 0 || i2 > size) {
            throw new IndexOutOfBoundsException(d4.c.R("index", i2, size));
        }
        this.f659d = size;
        this.f660e = i2;
        this.f661i = eVar;
    }

    public final Object a(int i2) {
        return this.f661i.get(i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f660e < this.f659d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f660e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f660e;
        this.f660e = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f660e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f660e - 1;
        this.f660e = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f660e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
