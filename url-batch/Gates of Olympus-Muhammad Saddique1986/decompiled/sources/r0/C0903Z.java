package r0;

import g2.InterfaceC0439a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: r0.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903Z implements Collection, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final Set f8147d = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f8147d.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8147d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8147d.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8147d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8147d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8147d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8147d.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8147d.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f8147d.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8147d.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f2.i.b(this, objArr);
    }
}
