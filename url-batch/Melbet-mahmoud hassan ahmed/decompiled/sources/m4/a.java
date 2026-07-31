package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class a<E> extends t0<E> {

    /* renamed from: f, reason: collision with root package name */
    private final int f19097f;

    /* renamed from: g, reason: collision with root package name */
    private int f19098g;

    protected a(int i7, int i8) {
        l4.j.k(i8, i7);
        this.f19097f = i7;
        this.f19098g = i8;
    }

    protected abstract E a(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19098g < this.f19097f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19098g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f19098g;
        this.f19098g = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19098g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f19098g - 1;
        this.f19098g = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19098g - 1;
    }
}
