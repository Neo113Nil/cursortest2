package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qn2 implements Collection, fu0 {
    public final int[] rtx2ld2ELZv4;

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
        if (!(obj instanceof pn2)) {
            return false;
        }
        return na.jJwa0q7P5wHq(this.rtx2ld2ELZv4, ((pn2) obj).rtx2ld2ELZv4);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof pn2)) {
                return false;
            }
            if (!na.jJwa0q7P5wHq(this.rtx2ld2ELZv4, ((pn2) obj).rtx2ld2ELZv4)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof qn2) {
            return this.rtx2ld2ELZv4.equals(((qn2) obj).rtx2ld2ELZv4);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.rtx2ld2ELZv4);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ZbWwgt3aGe7A(5, this.rtx2ld2ELZv4);
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
        return this.rtx2ld2ELZv4.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return mm2.KUoIVIumpKat(this, objArr);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.rtx2ld2ELZv4) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }
}
