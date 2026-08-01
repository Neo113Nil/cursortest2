package t0;

import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f9196d;

    /* renamed from: e, reason: collision with root package name */
    public int f9197e;

    public a(int i3, int i10) {
        this.f9196d = i3;
        this.f9197e = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9196d < this.f9197e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9196d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9196d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9196d - 1;
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
