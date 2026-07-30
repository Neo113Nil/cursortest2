package k0;

import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public int f5292f;

    /* renamed from: g, reason: collision with root package name */
    public int f5293g;

    public a(int i7, int i8) {
        this.f5292f = i7;
        this.f5293g = i8;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5292f < this.f5293g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5292f > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5292f;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5292f - 1;
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
