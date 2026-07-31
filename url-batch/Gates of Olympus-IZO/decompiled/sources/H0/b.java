package H0;

import M1.u;
import Z1.h;
import Z1.i;
import a2.InterfaceC0184a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class b implements Collection, InterfaceC0184a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f1848f = new b(u.f2803d);

    /* renamed from: d, reason: collision with root package name */
    public final List f1849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1850e;

    public b(List list) {
        this.f1849d = list;
        this.f1850e = list.size();
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
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f1849d.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f1849d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return i.a(this.f1849d, ((b) obj).f1849d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f1849d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1849d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f1849d.iterator();
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
        return this.f1850e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return h.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f1849d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return h.b(this, objArr);
    }
}
