package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
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

/* renamed from: com.yandex.mobile.ads.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2029k<K, V> extends AbstractC2077m<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f27911e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f27912f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.k$a */
    class a extends pt0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        final transient Map<K, Collection<V>> f27913d;

        /* renamed from: com.yandex.mobile.ads.impl.k$a$a, reason: collision with other inner class name */
        class C0196a extends mt0<K, Collection<V>> {
            C0196a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.f27913d.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object obj2;
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.f27913d.entrySet();
                entrySet.getClass();
                try {
                    if (!entrySet.contains(obj)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    AbstractC2029k abstractC2029k = AbstractC2029k.this;
                    Object key = entry.getKey();
                    Map map = abstractC2029k.f27911e;
                    map.getClass();
                    try {
                        obj2 = map.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        obj2 = null;
                    }
                    Collection collection = (Collection) obj2;
                    if (collection == null) {
                        return true;
                    }
                    int size = collection.size();
                    collection.clear();
                    abstractC2029k.f27912f -= size;
                    return true;
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.k$a$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f27916b;

            /* renamed from: c, reason: collision with root package name */
            Collection<V> f27917c;

            b() {
                this.f27916b = a.this.f27913d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f27916b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f27916b.next();
                this.f27917c = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!(this.f27917c != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f27916b.remove();
                AbstractC2029k.this.f27912f -= this.f27917c.size();
                this.f27917c.clear();
                this.f27917c = null;
            }
        }

        a(Map<K, Collection<V>> map) {
            this.f27913d = map;
        }

        final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            AbstractC2029k abstractC2029k = AbstractC2029k.this;
            Collection<V> value = entry.getValue();
            AbstractC1982i abstractC1982i = (AbstractC1982i) abstractC2029k;
            abstractC1982i.getClass();
            List list = (List) value;
            return new rj0(key, list instanceof RandomAccess ? new f(abstractC1982i, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.f27913d;
            AbstractC2029k abstractC2029k = AbstractC2029k.this;
            if (map == abstractC2029k.f27911e) {
                abstractC2029k.d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f27913d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f27913d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f27913d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractC1982i abstractC1982i = (AbstractC1982i) AbstractC2029k.this;
            abstractC1982i.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(abstractC1982i, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f27913d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC2029k.this.b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f27913d.remove(obj);
            if (remove == null) {
                return null;
            }
            List<V> list = ((k31) AbstractC2029k.this).f27995g.get();
            list.addAll(remove);
            AbstractC2029k.this.f27912f -= remove.size();
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f27913d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f27913d.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.k$b */
    abstract class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f27919b;

        /* renamed from: c, reason: collision with root package name */
        K f27920c = null;

        /* renamed from: d, reason: collision with root package name */
        Collection<V> f27921d = null;

        /* renamed from: e, reason: collision with root package name */
        Iterator<V> f27922e = up0.f33226b;

        b() {
            this.f27919b = AbstractC2029k.this.f27911e.entrySet().iterator();
        }

        abstract T a(K k4, V v4);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27919b.hasNext() || this.f27922e.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f27922e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f27919b.next();
                this.f27920c = next.getKey();
                Collection<V> value = next.getValue();
                this.f27921d = value;
                this.f27922e = value.iterator();
            }
            return a(this.f27920c, this.f27922e.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f27922e.remove();
            Collection<V> collection = this.f27921d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f27919b.remove();
            }
            AbstractC2029k abstractC2029k = AbstractC2029k.this;
            abstractC2029k.f27912f--;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$c */
    private class c extends nt0<K, Collection<V>> {

        /* renamed from: com.yandex.mobile.ads.impl.k$c$a */
        final class a implements Iterator<K> {

            /* renamed from: b, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f27925b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f27926c;

            a(Iterator it) {
                this.f27926c = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f27926c.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f27926c.next();
                this.f27925b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                Map.Entry<K, Collection<V>> entry = this.f27925b;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection<V> value = entry.getValue();
                this.f27926c.remove();
                AbstractC2029k.this.f27912f -= value.size();
                value.clear();
                this.f27925b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f29755b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f29755b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f29755b.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f29755b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Collection collection = (Collection) this.f29755b.remove(obj);
            if (collection == null) {
                return false;
            }
            int size = collection.size();
            collection.clear();
            AbstractC2029k.this.f27912f -= size;
            return size > 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$d */
    class d extends AbstractC2029k<K, V>.g implements NavigableMap<K, Collection<V>> {
        d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g
        final SortedSet a() {
            return new e(b());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f27913d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k4) {
            Map.Entry<K, Collection<V>> ceilingEntry = b().ceilingEntry(k4);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k4) {
            return b().ceilingKey(k4);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((d) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(b().descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = b().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k4) {
            Map.Entry<K, Collection<V>> floorEntry = b().floorEntry(k4);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k4) {
            return b().floorKey(k4);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k4) {
            Map.Entry<K, Collection<V>> higherEntry = b().higherEntry(k4);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k4) {
            return b().higherKey(k4);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g, com.yandex.mobile.ads.impl.AbstractC2029k.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = b().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k4) {
            Map.Entry<K, Collection<V>> lowerEntry = b().lowerEntry(k4);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k4) {
            return b().lowerKey(k4);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((k31) AbstractC2029k.this).f27995g.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC1982i) AbstractC2029k.this).getClass();
            return new rj0(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((pt0) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((k31) AbstractC2029k.this).f27995g.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC1982i) AbstractC2029k.this).getClass();
            return new rj0(key, Collections.unmodifiableList(list));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k4, boolean z4) {
            return new d(b().headMap(k4, z4));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.g, com.yandex.mobile.ads.impl.AbstractC2029k.a, java.util.AbstractMap, java.util.Map
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k4, boolean z4, K k5, boolean z5) {
            return new d(b().subMap(k4, z4, k5, z5));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k4, boolean z4) {
            return new d(b().tailMap(k4, z4));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$e */
    class e extends AbstractC2029k<K, V>.h implements NavigableSet<K> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f29755b);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k4) {
            return b().ceilingKey(k4);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k4) {
            return b().floorKey(k4);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k4) {
            return b().higherKey(k4);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k4) {
            return b().lowerKey(k4);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k4 = (K) aVar.next();
            aVar.remove();
            return k4;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            c.a aVar = (c.a) ((c) descendingSet()).iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k4 = (K) aVar.next();
            aVar.remove();
            return k4;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k4, boolean z4) {
            return new e(b().headMap(k4, z4));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k4, boolean z4, K k5, boolean z5) {
            return new e(b().subMap(k4, z4, k5, z5));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k4, boolean z4) {
            return new e(b().tailMap(k4, z4));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$f */
    private class f extends AbstractC2029k<K, V>.j implements RandomAccess {
        f(AbstractC2029k abstractC2029k, K k4, List<V> list, AbstractC2029k<K, V>.i iVar) {
            super(k4, list, iVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$g */
    private class g extends AbstractC2029k<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: f, reason: collision with root package name */
        SortedSet<K> f27930f;

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedSet<K> a() {
            return new h(b());
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f27913d;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k4) {
            return new g(b().headMap(k4));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k4, K k5) {
            return new g(b().subMap(k4, k5));
        }

        public SortedMap<K, Collection<V>> tailMap(K k4) {
            return new g(b().tailMap(k4));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2029k.a, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f27930f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> a4 = a();
            this.f27930f = a4;
            return a4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$h */
    private class h extends AbstractC2029k<K, V>.c implements SortedSet<K> {
        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f29755b;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k4) {
            return new h(b().headMap(k4));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k4, K k5) {
            return new h(b().subMap(k4, k5));
        }

        public SortedSet<K> tailSet(K k4) {
            return new h(b().tailMap(k4));
        }
    }

    protected AbstractC2029k(Map<K, Collection<V>> map) {
        nj1.a(map.isEmpty());
        this.f27911e = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> a(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final int g() {
        return this.f27912f;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    public boolean put(K k4, V v4) {
        Collection<V> collection = this.f27911e.get(k4);
        if (collection != null) {
            if (!collection.add(v4)) {
                return false;
            }
            this.f27912f++;
            return true;
        }
        List<V> list = ((k31) this).f27995g.get();
        if (!list.add(v4)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f27912f++;
        this.f27911e.put(k4, list);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2077m, com.yandex.mobile.ads.impl.g31
    public final Collection<V> values() {
        return super.values();
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$i */
    class i extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        final K f27933b;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f27934c;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC2029k<K, V>.i f27935d;

        /* renamed from: e, reason: collision with root package name */
        final Collection<V> f27936e;

        i(K k4, Collection<V> collection, AbstractC2029k<K, V>.i iVar) {
            this.f27933b = k4;
            this.f27934c = collection;
            this.f27935d = iVar;
            this.f27936e = iVar == null ? null : iVar.c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v4) {
            d();
            boolean isEmpty = this.f27934c.isEmpty();
            boolean add = this.f27934c.add(v4);
            if (add) {
                AbstractC2029k.this.f27912f++;
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f27934c.size();
            boolean addAll = this.f27934c.addAll(collection);
            if (addAll) {
                int size2 = this.f27934c.size();
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f = (size2 - size) + abstractC2029k.f27912f;
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        final void b() {
            AbstractC2029k<K, V>.i iVar = this.f27935d;
            if (iVar != null) {
                iVar.b();
            } else {
                AbstractC2029k.this.f27911e.put(this.f27933b, this.f27934c);
            }
        }

        final Collection<V> c() {
            return this.f27934c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            d();
            int size = this.f27934c.size();
            if (size == 0) {
                return;
            }
            this.f27934c.clear();
            AbstractC2029k.this.f27912f -= size;
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            d();
            return this.f27934c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.f27934c.containsAll(collection);
        }

        final void d() {
            Collection<V> collection;
            AbstractC2029k<K, V>.i iVar = this.f27935d;
            if (iVar != null) {
                iVar.d();
                if (this.f27935d.f27934c != this.f27936e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f27934c.isEmpty() || (collection = (Collection) AbstractC2029k.this.f27911e.get(this.f27933b)) == null) {
                    return;
                }
                this.f27934c = collection;
            }
        }

        final void e() {
            AbstractC2029k<K, V>.i iVar = this.f27935d;
            if (iVar != null) {
                iVar.e();
            } else if (this.f27934c.isEmpty()) {
                AbstractC2029k.this.f27911e.remove(this.f27933b);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f27934c.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f27934c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            d();
            boolean remove = this.f27934c.remove(obj);
            if (remove) {
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f--;
                e();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f27934c.size();
            boolean removeAll = this.f27934c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f27934c.size();
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f = (size2 - size) + abstractC2029k.f27912f;
                e();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            d();
            int size = this.f27934c.size();
            boolean retainAll = this.f27934c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f27934c.size();
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f = (size2 - size) + abstractC2029k.f27912f;
                e();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f27934c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f27934c.toString();
        }

        /* renamed from: com.yandex.mobile.ads.impl.k$i$a */
        class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<V> f27938b;

            /* renamed from: c, reason: collision with root package name */
            final Collection<V> f27939c;

            a() {
                Collection<V> collection = i.this.f27934c;
                this.f27939c = collection;
                this.f27938b = AbstractC2029k.a(collection);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                i.this.d();
                if (i.this.f27934c == this.f27939c) {
                    return this.f27938b.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                i.this.d();
                if (i.this.f27934c == this.f27939c) {
                    return this.f27938b.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f27938b.remove();
                i iVar = i.this;
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f--;
                iVar.e();
            }

            a(ListIterator listIterator) {
                this.f27939c = i.this.f27934c;
                this.f27938b = listIterator;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$j */
    class j extends AbstractC2029k<K, V>.i implements List<V> {

        /* renamed from: com.yandex.mobile.ads.impl.k$j$a */
        private class a extends AbstractC2029k<K, V>.i.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> a() {
                i.this.d();
                if (i.this.f27934c == this.f27939c) {
                    return (ListIterator) this.f27938b;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v4) {
                boolean isEmpty = j.this.isEmpty();
                a().add(v4);
                j jVar = j.this;
                AbstractC2029k.this.f27912f++;
                if (isEmpty) {
                    jVar.b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v4) {
                a().set(v4);
            }

            public a(int i4) {
                super(j.this.f().listIterator(i4));
            }
        }

        j(K k4, List<V> list, AbstractC2029k<K, V>.i iVar) {
            super(k4, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i4, V v4) {
            d();
            boolean isEmpty = this.f27934c.isEmpty();
            ((List) this.f27934c).add(i4, v4);
            AbstractC2029k.this.f27912f++;
            if (isEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i4, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f27934c.size();
            boolean addAll = ((List) this.f27934c).addAll(i4, collection);
            if (addAll) {
                int size2 = this.f27934c.size();
                AbstractC2029k abstractC2029k = AbstractC2029k.this;
                abstractC2029k.f27912f = (size2 - size) + abstractC2029k.f27912f;
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        final List<V> f() {
            return (List) this.f27934c;
        }

        @Override // java.util.List
        public final V get(int i4) {
            d();
            return (V) ((List) this.f27934c).get(i4);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            d();
            return ((List) this.f27934c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            d();
            return ((List) this.f27934c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i4) {
            d();
            V v4 = (V) ((List) this.f27934c).remove(i4);
            AbstractC2029k abstractC2029k = AbstractC2029k.this;
            abstractC2029k.f27912f--;
            e();
            return v4;
        }

        @Override // java.util.List
        public final V set(int i4, V v4) {
            d();
            return (V) ((List) this.f27934c).set(i4, v4);
        }

        @Override // java.util.List
        public final List<V> subList(int i4, int i5) {
            d();
            AbstractC2029k abstractC2029k = AbstractC2029k.this;
            K k4 = this.f27933b;
            List subList = ((List) this.f27934c).subList(i4, i5);
            AbstractC2029k<K, V>.i iVar = this.f27935d;
            if (iVar == null) {
                iVar = this;
            }
            abstractC2029k.getClass();
            return subList instanceof RandomAccess ? new f(abstractC2029k, k4, subList, iVar) : new j(k4, subList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i4) {
            d();
            return new a(i4);
        }
    }

    final Map<K, Collection<V>> c() {
        return this.f27911e;
    }

    public final void d() {
        Iterator<Collection<V>> it = this.f27911e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f27911e.clear();
        this.f27912f = 0;
    }

    final Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map = this.f27911e;
        return map instanceof NavigableMap ? new d((NavigableMap) this.f27911e) : map instanceof SortedMap ? new g((SortedMap) this.f27911e) : new a(this.f27911e);
    }

    final Set<K> f() {
        Map<K, Collection<V>> map = this.f27911e;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f27911e) : map instanceof SortedMap ? new h((SortedMap) this.f27911e) : new c(this.f27911e);
    }

    final void a(Map<K, Collection<V>> map) {
        this.f27911e = map;
        this.f27912f = 0;
        for (Collection<V> collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f27912f = collection.size() + this.f27912f;
        }
    }
}
