package kotlinx.serialization.json;

import defpackage.cs0;
import defpackage.fu0;
import defpackage.h42;
import defpackage.jt0;
import defpackage.mm2;
import defpackage.zk;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42(with = jt0.class)
/* loaded from: classes.dex */
public final class PxuCJdSBwIXG extends lS5Rgt96tfkO implements List<lS5Rgt96tfkO>, fu0 {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();
    public final List rtx2ld2ELZv4;

    public PxuCJdSBwIXG(List list) {
        list.getClass();
        this.rtx2ld2ELZv4 = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, lS5Rgt96tfkO ls5rgt96tfko) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends lS5Rgt96tfkO> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof lS5Rgt96tfkO)) {
            return false;
        }
        return this.rtx2ld2ELZv4.contains((lS5Rgt96tfkO) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.rtx2ld2ELZv4.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, obj);
    }

    @Override // java.util.List
    public final lS5Rgt96tfkO get(int i) {
        return (lS5Rgt96tfkO) this.rtx2ld2ELZv4.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof lS5Rgt96tfkO)) {
            return -1;
        }
        return this.rtx2ld2ELZv4.indexOf((lS5Rgt96tfkO) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.rtx2ld2ELZv4.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof lS5Rgt96tfkO)) {
            return -1;
        }
        return this.rtx2ld2ELZv4.lastIndexOf((lS5Rgt96tfkO) obj);
    }

    @Override // java.util.List
    public final ListIterator<lS5Rgt96tfkO> listIterator() {
        return this.rtx2ld2ELZv4.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<lS5Rgt96tfkO> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO set(int i, lS5Rgt96tfkO ls5rgt96tfko) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.rtx2ld2ELZv4.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super lS5Rgt96tfkO> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<lS5Rgt96tfkO> subList(int i, int i2) {
        return this.rtx2ld2ELZv4.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return mm2.KUoIVIumpKat(this, objArr);
    }

    public final String toString() {
        return zk.ctD2u3GUHhtA(this.rtx2ld2ELZv4, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<lS5Rgt96tfkO> listIterator(int i) {
        return this.rtx2ld2ELZv4.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }
}
