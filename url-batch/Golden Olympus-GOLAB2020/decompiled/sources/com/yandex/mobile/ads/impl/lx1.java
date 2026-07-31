package com.yandex.mobile.ads.impl;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class lx1 {

    /* JADX INFO: Access modifiers changed from: private */
    static class a<E> extends dq<E> implements Set<E> {
        a(Set<E> set, oj1<? super E> oj1Var) {
            super(set, oj1Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return lx1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return lx1.a(this);
        }
    }

    private static class b<E> extends a<E> implements SortedSet<E> {
        b(SortedSet<E> sortedSet, oj1<? super E> oj1Var) {
            super(sortedSet, oj1Var);
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f24732b).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f24732b.iterator();
            oj1<? super E> oj1Var = this.f24733c;
            it.getClass();
            oj1Var.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (oj1Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e4) {
            return new b(((SortedSet) this.f24732b).headSet(e4), this.f24733c);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f24732b;
            while (true) {
                E e4 = (Object) sortedSet.last();
                if (this.f24733c.apply(e4)) {
                    return e4;
                }
                sortedSet = sortedSet.headSet(e4);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e4, E e5) {
            return new b(((SortedSet) this.f24732b).subSet(e4, e5), this.f24733c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e4) {
            return new b(((SortedSet) this.f24732b).tailSet(e4), this.f24733c);
        }
    }

    static abstract class c<E> extends AbstractSet<E> {
        c() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof l31) {
                collection = ((l31) collection).a();
            }
            boolean z4 = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    z4 |= remove(it.next());
                }
                return z4;
            }
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private d() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Set<E> a(Set<E> set, oj1<? super E> oj1Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof a) {
                a aVar = (a) sortedSet;
                return new b((SortedSet) aVar.f24732b, pj1.a(aVar.f24733c, oj1Var));
            }
            sortedSet.getClass();
            oj1Var.getClass();
            return new b(sortedSet, oj1Var);
        }
        if (set instanceof a) {
            a aVar2 = (a) set;
            return new a((Set) aVar2.f24732b, pj1.a(aVar2.f24733c, oj1Var));
        }
        set.getClass();
        oj1Var.getClass();
        return new a(set, oj1Var);
    }

    static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    public static d a(uj0 uj0Var, uj0 uj0Var2) {
        if (uj0Var == null) {
            throw new NullPointerException("set1");
        }
        if (uj0Var2 != null) {
            return new kx1(uj0Var, uj0Var2);
        }
        throw new NullPointerException("set2");
    }

    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }
}
