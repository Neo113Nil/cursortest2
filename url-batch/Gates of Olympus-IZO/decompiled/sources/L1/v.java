package L1;

import a2.InterfaceC0184a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v implements Collection, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2725d;

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
        if (!(obj instanceof u)) {
            return false;
        }
        return M1.k.U(this.f2725d, ((u) obj).f2724d);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Z1.i.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof u) {
                if (M1.k.U(this.f2725d, ((u) obj).f2724d)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Z1.i.a(this.f2725d, ((v) obj).f2725d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f2725d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2725d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new q(2, this.f2725d);
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
        return this.f2725d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f2725d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Z1.i.f(objArr, "array");
        return Z1.h.b(this, objArr);
    }
}
