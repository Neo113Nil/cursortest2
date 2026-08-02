package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.UIntArray;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class ULongArray implements Collection, KMappedMarker {
    public final long[] storage;

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
        if (!(obj instanceof ULong)) {
            return false;
        }
        return ArraysKt___ArraysKt.contains(this.storage, ((ULong) obj).data);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof ULong)) {
                return false;
            }
            if (!ArraysKt___ArraysKt.contains(this.storage, ((ULong) obj).data)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof ULongArray) {
            return Intrinsics.areEqual(this.storage, ((ULongArray) obj).storage);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.storage);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.storage.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new UIntArray.Iterator(this.storage);
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
        return this.storage.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.storage) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }
}
