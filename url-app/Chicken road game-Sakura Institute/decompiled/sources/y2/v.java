package y2;

import M2.C0249a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import z2.C1439w;

/* loaded from: classes.dex */
public final class v implements Collection, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11684d;

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
        if (obj instanceof u) {
            return C1439w.o(((u) obj).f11683d, this.f11684d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof u) || !C1439w.o(((u) obj).f11683d, this.f11684d)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Intrinsics.a(this.f11684d, ((v) obj).f11684d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f11684d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f11684d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0249a(this.f11684d);
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
        return this.f11684d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f11684d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return M2.o.b(this, array);
    }
}
