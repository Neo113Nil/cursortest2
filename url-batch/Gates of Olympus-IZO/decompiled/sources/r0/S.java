package r0;

import a2.InterfaceC0184a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class S implements Collection, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final Set f7135d = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f7135d.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7135d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7135d.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7135d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7135d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7135d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7135d.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7135d.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f7135d.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7135d.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return Z1.h.b(this, objArr);
    }
}
