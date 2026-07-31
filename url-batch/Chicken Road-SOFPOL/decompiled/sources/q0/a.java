package q0;

import java.util.ListIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public int f5931d;

    /* renamed from: e, reason: collision with root package name */
    public int f5932e;

    public a(int i, int i8) {
        this.f5931d = i;
        this.f5932e = i8;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5931d < this.f5932e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5931d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5931d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5931d - 1;
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
