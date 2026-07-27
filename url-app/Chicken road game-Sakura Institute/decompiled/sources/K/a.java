package K;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f3418d;

    /* renamed from: e, reason: collision with root package name */
    public int f3419e;

    public a(int i2, int i4) {
        this.f3418d = i2;
        this.f3419e = i4;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3418d < this.f3419e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3418d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3418d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3418d - 1;
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
