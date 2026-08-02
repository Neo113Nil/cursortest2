package v2;

import a.AbstractC0124a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class G extends p0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f15565a;

    /* renamed from: b, reason: collision with root package name */
    public int f15566b;

    /* renamed from: c, reason: collision with root package name */
    public final I f15567c;

    public G(I i4, int i5) {
        int size = i4.size();
        AbstractC0124a.q(i5, size);
        this.f15565a = size;
        this.f15566b = i5;
        this.f15567c = i4;
    }

    public final Object a(int i4) {
        return this.f15567c.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15566b < this.f15565a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15566b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f15566b;
        this.f15566b = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15566b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f15566b - 1;
        this.f15566b = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15566b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
