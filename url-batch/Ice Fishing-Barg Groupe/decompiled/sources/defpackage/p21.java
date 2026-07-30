package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p21 implements Collection, fu0 {
    public static final o21 Companion = new o21();
    public static final p21 wdg6QnbFHrFF = new p21(p50.rtx2ld2ELZv4);
    public final int OPXfSBeufaJ8;
    public final List rtx2ld2ELZv4;

    public p21(List list) {
        this.rtx2ld2ELZv4 = list;
        this.OPXfSBeufaJ8 = list.size();
    }

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
        if (!(obj instanceof n21)) {
            return false;
        }
        return this.rtx2ld2ELZv4.contains((n21) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.rtx2ld2ELZv4.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p21) {
            return this.rtx2ld2ELZv4.equals(((p21) obj).rtx2ld2ELZv4);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.rtx2ld2ELZv4.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.rtx2ld2ELZv4 + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mm2.KUoIVIumpKat(this, objArr);
    }
}
