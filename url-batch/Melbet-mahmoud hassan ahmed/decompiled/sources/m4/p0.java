package m4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import m4.i;

/* loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends e<E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set f19190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set f19191g;

        /* renamed from: m4.p0$a$a, reason: collision with other inner class name */
        class C0103a extends m4.b<E> {

            /* renamed from: h, reason: collision with root package name */
            final Iterator<E> f19192h;

            C0103a() {
                this.f19192h = a.this.f19190f.iterator();
            }

            @Override // m4.b
            protected E a() {
                while (this.f19192h.hasNext()) {
                    E next = this.f19192h.next();
                    if (a.this.f19191g.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f19190f = set;
            this.f19191g = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f19190f.contains(obj) && this.f19191g.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f19190f.containsAll(collection) && this.f19191g.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public s0<E> iterator() {
            return new C0103a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f19191g, this.f19190f);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f19190f.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f19191g.contains(it.next())) {
                    i7++;
                }
            }
            return i7;
        }
    }

    private static class b<E> extends i.a<E> implements Set<E> {
        b(Set<E> set, l4.k<? super E> kVar) {
            super(set, kVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return p0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return p0.d(this);
        }
    }

    private static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, l4.k<? super E> kVar) {
            super(sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f19151f).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) u.h(this.f19151f.iterator(), this.f19152g);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e7) {
            return new c(((SortedSet) this.f19151f).headSet(e7), this.f19152g);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f19151f;
            while (true) {
                E e7 = (Object) sortedSet.last();
                if (this.f19152g.apply(e7)) {
                    return e7;
                }
                sortedSet = sortedSet.headSet(e7);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e7, E e8) {
            return new c(((SortedSet) this.f19151f).subSet(e7, e8), this.f19152g);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e7) {
            return new c(((SortedSet) this.f19151f).tailSet(e7), this.f19152g);
        }
    }

    static abstract class d<E> extends AbstractSet<E> {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return p0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) l4.j.i(collection));
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        private e() {
        }

        /* synthetic */ e(o0 o0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e7) {
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
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, l4.k<? super E> kVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, kVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) l4.j.i(set), (l4.k) l4.j.i(kVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f19151f, l4.l.b(bVar.f19152g, kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, l4.k<? super E> kVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) l4.j.i(sortedSet), (l4.k) l4.j.i(kVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f19151f, l4.l.b(bVar.f19152g, kVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ((i7 + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return i7;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        l4.j.j(set, "set1");
        l4.j.j(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i7) {
        return new HashSet<>(y.a(i7));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(y.e());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        l4.j.i(collection);
        if (collection instanceof d0) {
            collection = ((d0) collection).g();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : u.n(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= set.remove(it.next());
        }
        return z6;
    }
}
