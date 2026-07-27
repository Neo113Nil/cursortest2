package H0;

import M2.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;
import z2.C1405I;

/* loaded from: classes.dex */
public final class b implements Collection, N2.a {

    /* renamed from: i, reason: collision with root package name */
    public static final b f3225i = new b(C1405I.f11931d);

    /* renamed from: d, reason: collision with root package name */
    public final List f3226d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3227e;

    public b(List list) {
        this.f3226d = list;
        this.f3227e = list.size();
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
        return this.f3226d.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3226d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.a(this.f3226d, ((b) obj).f3226d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f3226d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3226d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f3226d.iterator();
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
        return this.f3227e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return o.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f3226d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return o.b(this, objArr);
    }
}
