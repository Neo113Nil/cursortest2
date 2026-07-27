package p0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class a0 implements Collection, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Set f9032d = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f9032d.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f9032d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9032d.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f9032d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f9032d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f9032d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f9032d.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f9032d.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f9032d.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f9032d.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return M2.o.b(this, objArr);
    }
}
