package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sf1 implements Collection, k71 {
    public static final sf1 o = new sf1(ah0.m);
    public final List m;
    public final int n;

    public sf1(List list) {
        this.m = list;
        this.n = list.size();
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
        if (!(obj instanceof rf1)) {
            return false;
        }
        return this.m.contains((rf1) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.m.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sf1) {
            return Intrinsics.b(this.m, ((sf1) obj).m);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
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
        return this.n;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ll3.W(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.m + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ll3.X(this, objArr);
    }
}
