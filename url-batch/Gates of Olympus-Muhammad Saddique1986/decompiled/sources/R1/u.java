package R1;

import g2.InterfaceC0439a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements Collection, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f4167d;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        return S1.k.i0(this.f4167d, ((t) obj).f4166d);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        f2.j.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof t) {
                if (S1.k.i0(this.f4167d, ((t) obj).f4166d)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return f2.j.a(this.f4167d, ((u) obj).f4167d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4167d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4167d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this.f4167d);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4167d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f4167d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f2.j.f(objArr, "array");
        return f2.i.b(this, objArr);
    }
}
