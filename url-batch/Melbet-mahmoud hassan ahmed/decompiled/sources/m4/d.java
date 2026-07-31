package m4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import m4.f;
import m4.y;

/* loaded from: classes.dex */
abstract class d<K, V> extends m4.f<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private transient Map<K, Collection<V>> f19112i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f19113j;

    class a extends d<K, V>.c<V> {
        a(d dVar) {
            super();
        }

        @Override // m4.d.c
        V a(K k7, V v6) {
            return v6;
        }
    }

    private class b extends y.f<K, Collection<V>> {

        /* renamed from: h, reason: collision with root package name */
        final transient Map<K, Collection<V>> f19114h;

        class a extends y.c<K, Collection<V>> {
            a() {
            }

            @Override // m4.y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return m4.i.c(b.this.f19114h.entrySet(), obj);
            }

            @Override // m4.y.c
            Map<K, Collection<V>> i() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return b.this.new C0100b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.t(entry.getKey());
                return true;
            }
        }

        /* renamed from: m4.d$b$b, reason: collision with other inner class name */
        class C0100b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: f, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f19117f;

            /* renamed from: g, reason: collision with root package name */
            Collection<V> f19118g;

            C0100b() {
                this.f19117f = b.this.f19114h.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f19117f.next();
                this.f19118g = next.getValue();
                return b.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19117f.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                l4.j.o(this.f19118g != null, "no calls to next() since the last call to remove()");
                this.f19117f.remove();
                d.m(d.this, this.f19118g.size());
                this.f19118g.clear();
                this.f19118g = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f19114h = map;
        }

        @Override // m4.y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) y.g(this.f19114h, obj);
            if (collection == null) {
                return null;
            }
            return d.this.v(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f19114h == d.this.f19112i) {
                d.this.clear();
            } else {
                u.c(new C0100b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return y.f(this.f19114h, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f19114h.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o7 = d.this.o();
            o7.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return o7;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return y.d(key, d.this.v(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f19114h.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f19114h.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f19114h.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f19114h.toString();
        }
    }

    private abstract class c<T> implements Iterator<T> {

        /* renamed from: f, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f19120f;

        /* renamed from: g, reason: collision with root package name */
        K f19121g = null;

        /* renamed from: h, reason: collision with root package name */
        Collection<V> f19122h = null;

        /* renamed from: i, reason: collision with root package name */
        Iterator<V> f19123i = u.f();

        c() {
            this.f19120f = d.this.f19112i.entrySet().iterator();
        }

        abstract T a(K k7, V v6);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19120f.hasNext() || this.f19123i.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f19123i.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f19120f.next();
                this.f19121g = next.getKey();
                Collection<V> value = next.getValue();
                this.f19122h = value;
                this.f19123i = value.iterator();
            }
            return a(f0.a(this.f19121g), this.f19123i.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f19123i.remove();
            Collection<V> collection = this.f19122h;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f19120f.remove();
            }
            d.k(d.this);
        }
    }

    /* renamed from: m4.d$d, reason: collision with other inner class name */
    private class C0101d extends y.d<K, Collection<V>> {

        /* renamed from: m4.d$d$a */
        class a implements Iterator<K> {

            /* renamed from: f, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f19126f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Iterator f19127g;

            a(Iterator it) {
                this.f19127g = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19127g.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f19127g.next();
                this.f19126f = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                l4.j.o(this.f19126f != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f19126f.getValue();
                this.f19127g.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f19126f = null;
            }
        }

        C0101d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || i().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return i().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(i().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i7;
            Collection<V> remove = i().remove(obj);
            if (remove != null) {
                i7 = remove.size();
                remove.clear();
                d.m(d.this, i7);
            } else {
                i7 = 0;
            }
            return i7 > 0;
        }
    }

    class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k7) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k7);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k7) {
            return h().ceilingKey(k7);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k7) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k7);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k7) {
            return h().floorKey(k7);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k7, boolean z6) {
            return new e(h().headMap(k7, z6));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k7) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k7);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k7) {
            return h().higherKey(k7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m4.d.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> f() {
            return new f(h());
        }

        @Override // m4.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k7) {
            return headMap(k7, false);
        }

        @Override // m4.d.h, m4.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> o7 = d.this.o();
            o7.addAll(next.getValue());
            it.remove();
            return y.d(next.getKey(), d.this.u(o7));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k7) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k7);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k7) {
            return h().lowerKey(k7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m4.d.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // m4.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k7, K k8) {
            return subMap(k7, true, k8, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g();
        }

        @Override // m4.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k7) {
            return tailMap(k7, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k7, boolean z6, K k8, boolean z7) {
            return new e(h().subMap(k7, z6, k8, z7));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k7, boolean z6) {
            return new e(h().tailMap(k7, z6));
        }
    }

    class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k7) {
            return j().ceilingKey(k7);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k7) {
            return j().floorKey(k7);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k7, boolean z6) {
            return new f(j().headMap(k7, z6));
        }

        @Override // java.util.NavigableSet
        public K higher(K k7) {
            return j().higherKey(k7);
        }

        @Override // m4.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k7) {
            return headSet(k7, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m4.d.i
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableSet
        public K lower(K k7) {
            return j().lowerKey(k7);
        }

        @Override // m4.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k7, K k8) {
            return subSet(k7, true, k8, false);
        }

        @Override // m4.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k7) {
            return tailSet(k7, true);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) u.m(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) u.m(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k7, boolean z6, K k8, boolean z7) {
            return new f(j().subMap(k7, z6, k8, z7));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k7, boolean z6) {
            return new f(j().tailMap(k7, z6));
        }
    }

    private class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k7, List<V> list, d<K, V>.j jVar) {
            super(k7, list, jVar);
        }
    }

    private class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: j, reason: collision with root package name */
        SortedSet<K> f19131j;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        SortedSet<K> f() {
            return new i(h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return h().firstKey();
        }

        @Override // m4.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f19131j;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f7 = f();
            this.f19131j = f7;
            return f7;
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f19114h;
        }

        public SortedMap<K, Collection<V>> headMap(K k7) {
            return new h(h().headMap(k7));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k7, K k8) {
            return new h(h().subMap(k7, k8));
        }

        public SortedMap<K, Collection<V>> tailMap(K k7) {
            return new h(h().tailMap(k7));
        }
    }

    private class i extends d<K, V>.C0101d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return j().firstKey();
        }

        public SortedSet<K> headSet(K k7) {
            return new i(j().headMap(k7));
        }

        SortedMap<K, Collection<V>> j() {
            return (SortedMap) super.i();
        }

        @Override // java.util.SortedSet
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(K k7, K k8) {
            return new i(j().subMap(k7, k8));
        }

        public SortedSet<K> tailSet(K k7) {
            return new i(j().tailMap(k7));
        }
    }

    class j extends AbstractCollection<V> {

        /* renamed from: f, reason: collision with root package name */
        final K f19134f;

        /* renamed from: g, reason: collision with root package name */
        Collection<V> f19135g;

        /* renamed from: h, reason: collision with root package name */
        final d<K, V>.j f19136h;

        /* renamed from: i, reason: collision with root package name */
        final Collection<V> f19137i;

        class a implements Iterator<V> {

            /* renamed from: f, reason: collision with root package name */
            final Iterator<V> f19139f;

            /* renamed from: g, reason: collision with root package name */
            final Collection<V> f19140g;

            a() {
                Collection<V> collection = j.this.f19135g;
                this.f19140g = collection;
                this.f19139f = d.s(collection);
            }

            a(Iterator<V> it) {
                this.f19140g = j.this.f19135g;
                this.f19139f = it;
            }

            Iterator<V> a() {
                b();
                return this.f19139f;
            }

            void b() {
                j.this.m();
                if (j.this.f19135g != this.f19140g) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f19139f.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f19139f.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f19139f.remove();
                d.k(d.this);
                j.this.n();
            }
        }

        j(K k7, Collection<V> collection, d<K, V>.j jVar) {
            this.f19134f = k7;
            this.f19135g = collection;
            this.f19136h = jVar;
            this.f19137i = jVar == null ? null : jVar.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v6) {
            m();
            boolean isEmpty = this.f19135g.isEmpty();
            boolean add = this.f19135g.add(v6);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    i();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f19135g.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f19135g.size() - size);
                if (size == 0) {
                    i();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f19135g.clear();
            d.m(d.this, size);
            n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m();
            return this.f19135g.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m();
            return this.f19135g.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m();
            return this.f19135g.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            m();
            return this.f19135g.hashCode();
        }

        void i() {
            d<K, V>.j jVar = this.f19136h;
            if (jVar != null) {
                jVar.i();
            } else {
                d.this.f19112i.put(this.f19134f, this.f19135g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m();
            return new a();
        }

        d<K, V>.j j() {
            return this.f19136h;
        }

        Collection<V> k() {
            return this.f19135g;
        }

        K l() {
            return this.f19134f;
        }

        void m() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f19136h;
            if (jVar != null) {
                jVar.m();
                if (this.f19136h.k() != this.f19137i) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f19135g.isEmpty() || (collection = (Collection) d.this.f19112i.get(this.f19134f)) == null) {
                    return;
                }
                this.f19135g = collection;
            }
        }

        void n() {
            d<K, V>.j jVar = this.f19136h;
            if (jVar != null) {
                jVar.n();
            } else if (this.f19135g.isEmpty()) {
                d.this.f19112i.remove(this.f19134f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m();
            boolean remove = this.f19135g.remove(obj);
            if (remove) {
                d.k(d.this);
                n();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f19135g.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f19135g.size() - size);
                n();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            l4.j.i(collection);
            int size = size();
            boolean retainAll = this.f19135g.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f19135g.size() - size);
                n();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m();
            return this.f19135g.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m();
            return this.f19135g.toString();
        }
    }

    class k extends d<K, V>.j implements List<V> {

        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i7) {
                super(k.this.o().listIterator(i7));
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v6) {
                boolean isEmpty = k.this.isEmpty();
                c().add(v6);
                d.j(d.this);
                if (isEmpty) {
                    k.this.i();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v6) {
                c().set(v6);
            }
        }

        k(K k7, List<V> list, d<K, V>.j jVar) {
            super(k7, list, jVar);
        }

        @Override // java.util.List
        public void add(int i7, V v6) {
            m();
            boolean isEmpty = k().isEmpty();
            o().add(i7, v6);
            d.j(d.this);
            if (isEmpty) {
                i();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i7, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = o().addAll(i7, collection);
            if (addAll) {
                d.l(d.this, k().size() - size);
                if (size == 0) {
                    i();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i7) {
            m();
            return o().get(i7);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m();
            return o().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m();
            return o().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i7) {
            m();
            return new a(i7);
        }

        List<V> o() {
            return (List) k();
        }

        @Override // java.util.List
        public V remove(int i7) {
            m();
            V remove = o().remove(i7);
            d.k(d.this);
            n();
            return remove;
        }

        @Override // java.util.List
        public V set(int i7, V v6) {
            m();
            return o().set(i7, v6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i7, int i8) {
            m();
            return d.this.w(l(), o().subList(i7, i8), j() == null ? this : j());
        }
    }

    protected d(Map<K, Collection<V>> map) {
        l4.j.d(map.isEmpty());
        this.f19112i = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i7 = dVar.f19113j;
        dVar.f19113j = i7 + 1;
        return i7;
    }

    static /* synthetic */ int k(d dVar) {
        int i7 = dVar.f19113j;
        dVar.f19113j = i7 - 1;
        return i7;
    }

    static /* synthetic */ int l(d dVar, int i7) {
        int i8 = dVar.f19113j + i7;
        dVar.f19113j = i8;
        return i8;
    }

    static /* synthetic */ int m(d dVar, int i7) {
        int i8 = dVar.f19113j - i7;
        dVar.f19113j = i8;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> s(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Object obj) {
        Collection collection = (Collection) y.h(this.f19112i, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f19113j -= size;
        }
    }

    @Override // m4.z
    public void clear() {
        Iterator<Collection<V>> it = this.f19112i.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f19112i.clear();
        this.f19113j = 0;
    }

    @Override // m4.f
    Collection<V> e() {
        return new f.a();
    }

    @Override // m4.f
    Iterator<V> g() {
        return new a(this);
    }

    abstract Collection<V> o();

    Collection<V> p(K k7) {
        return o();
    }

    @Override // m4.z
    public boolean put(K k7, V v6) {
        Collection<V> collection = this.f19112i.get(k7);
        if (collection != null) {
            if (!collection.add(v6)) {
                return false;
            }
            this.f19113j++;
            return true;
        }
        Collection<V> p7 = p(k7);
        if (!p7.add(v6)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f19113j++;
        this.f19112i.put(k7, p7);
        return true;
    }

    final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.f19112i;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f19112i) : map instanceof SortedMap ? new h((SortedMap) this.f19112i) : new b(this.f19112i);
    }

    final Set<K> r() {
        Map<K, Collection<V>> map = this.f19112i;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f19112i) : map instanceof SortedMap ? new i((SortedMap) this.f19112i) : new C0101d(this.f19112i);
    }

    @Override // m4.z
    public int size() {
        return this.f19113j;
    }

    abstract <E> Collection<E> u(Collection<E> collection);

    abstract Collection<V> v(K k7, Collection<V> collection);

    @Override // m4.f, m4.z
    public Collection<V> values() {
        return super.values();
    }

    final List<V> w(K k7, List<V> list, d<K, V>.j jVar) {
        return list instanceof RandomAccess ? new g(this, k7, list, jVar) : new k(k7, list, jVar);
    }
}
