package com.yandex.mobile.ads.impl;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
class dq<E> extends AbstractCollection<E> {

    /* renamed from: b, reason: collision with root package name */
    final Collection<E> f24732b;

    /* renamed from: c, reason: collision with root package name */
    final oj1<? super E> f24733c;

    dq(Collection<E> collection, oj1<? super E> oj1Var) {
        this.f24732b = collection;
        this.f24733c = oj1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e4) {
        if (this.f24733c.apply(e4)) {
            return this.f24732b.add(e4);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f24733c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f24732b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        rp0.a(this.f24732b, this.f24733c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection<E> collection = this.f24732b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f24733c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.f24732b;
        oj1<? super E> oj1Var = this.f24733c;
        Iterator<T> it = collection.iterator();
        if (oj1Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!oj1Var.apply((Object) it.next())) {
                i4++;
            } else if (i4 != -1) {
                z4 = true;
            }
        }
        return !z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f24732b.iterator();
        oj1<? super E> oj1Var = this.f24733c;
        it.getClass();
        oj1Var.getClass();
        return new sp0(it, oj1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f24732b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f24732b.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f24733c.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f24732b.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f24733c.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f24732b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f24733c.apply(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC1934g abstractC1934g = (AbstractC1934g) it;
            if (!abstractC1934g.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC1934g.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC1934g abstractC1934g = (AbstractC1934g) it;
            if (abstractC1934g.hasNext()) {
                arrayList.add(abstractC1934g.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
