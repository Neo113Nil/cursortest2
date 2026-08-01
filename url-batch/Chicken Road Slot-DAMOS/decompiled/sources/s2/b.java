package s2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import wd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Collection, xd.a {

    /* renamed from: i, reason: collision with root package name */
    public static final b f8409i = new b(j0.f5574d);

    /* renamed from: d, reason: collision with root package name */
    public final List f8410d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8411e;

    public b(List list) {
        this.f8410d = list;
        this.f8411e = list.size();
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
        return this.f8410d.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8410d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.a(this.f8410d, ((b) obj).f8410d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f8410d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8410d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8410d.iterator();
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
        return this.f8411e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f8410d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }
}
