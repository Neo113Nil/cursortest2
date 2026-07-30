package b3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements ListIterator, Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f5527n;

    /* renamed from: u, reason: collision with root package name */
    public int f5528u;

    /* renamed from: v, reason: collision with root package name */
    public final e f5529v;

    public b(e eVar, int i) {
        int size = eVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(com.bumptech.glide.g.X(i, size, "index"));
        }
        this.f5527n = size;
        this.f5528u = i;
        this.f5529v = eVar;
    }

    public final Object a(int i) {
        return this.f5529v.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5528u < this.f5527n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5528u > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5528u;
        this.f5528u = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5528u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5528u - 1;
        this.f5528u = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5528u - 1;
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
