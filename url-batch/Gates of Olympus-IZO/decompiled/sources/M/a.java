package M;

import a2.InterfaceC0184a;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public int f2730d;

    /* renamed from: e, reason: collision with root package name */
    public int f2731e;

    public a(int i3, int i4) {
        this.f2730d = i3;
        this.f2731e = i4;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2730d < this.f2731e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2730d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2730d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2730d - 1;
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
