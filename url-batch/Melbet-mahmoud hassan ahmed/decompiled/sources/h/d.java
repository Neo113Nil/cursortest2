package h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class d<K, V> {

    /* renamed from: a, reason: collision with root package name */
    d<K, V>.b f16700a;

    /* renamed from: b, reason: collision with root package name */
    d<K, V>.c f16701b;

    /* renamed from: c, reason: collision with root package name */
    d<K, V>.e f16702c;

    final class a<T> implements Iterator<T> {

        /* renamed from: f, reason: collision with root package name */
        final int f16703f;

        /* renamed from: g, reason: collision with root package name */
        int f16704g;

        /* renamed from: h, reason: collision with root package name */
        int f16705h;

        /* renamed from: i, reason: collision with root package name */
        boolean f16706i = false;

        a(int i7) {
            this.f16703f = i7;
            this.f16704g = d.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16705h < this.f16704g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t6 = (T) d.this.b(this.f16705h, this.f16703f);
            this.f16705h++;
            this.f16706i = true;
            return t6;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16706i) {
                throw new IllegalStateException();
            }
            int i7 = this.f16705h - 1;
            this.f16705h = i7;
            this.f16704g--;
            this.f16706i = false;
            d.this.h(i7);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d7 = d.this.d();
            for (Map.Entry<K, V> entry : collection) {
                d.this.g(entry.getKey(), entry.getValue());
            }
            return d7 != d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e7 = d.this.e(entry.getKey());
            if (e7 < 0) {
                return false;
            }
            return h.c.b(d.this.b(e7, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d7 = d.this.d() - 1; d7 >= 0; d7--) {
                Object b7 = d.this.b(d7, 0);
                Object b8 = d.this.b(d7, 1);
                i7 += (b7 == null ? 0 : b7.hashCode()) ^ (b8 == null ? 0 : b8.hashCode());
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0066d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k7) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return d.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return d.j(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d7 = d.this.d() - 1; d7 >= 0; d7--) {
                Object b7 = d.this.b(d7, 0);
                i7 += b7 == null ? 0 : b7.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e7 = d.this.e(obj);
            if (e7 < 0) {
                return false;
            }
            d.this.h(e7);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return d.o(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return d.p(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return d.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d.this.r(tArr, 0);
        }
    }

    /* renamed from: h.d$d, reason: collision with other inner class name */
    final class C0066d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f, reason: collision with root package name */
        int f16710f;

        /* renamed from: h, reason: collision with root package name */
        boolean f16712h = false;

        /* renamed from: g, reason: collision with root package name */
        int f16711g = -1;

        C0066d() {
            this.f16710f = d.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f16711g++;
            this.f16712h = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f16712h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h.c.b(entry.getKey(), d.this.b(this.f16711g, 0)) && h.c.b(entry.getValue(), d.this.b(this.f16711g, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f16712h) {
                return (K) d.this.b(this.f16711g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f16712h) {
                return (V) d.this.b(this.f16711g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16711g < this.f16710f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f16712h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b7 = d.this.b(this.f16711g, 0);
            Object b8 = d.this.b(this.f16711g, 1);
            return (b7 == null ? 0 : b7.hashCode()) ^ (b8 != null ? b8.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16712h) {
                throw new IllegalStateException();
            }
            d.this.h(this.f16711g);
            this.f16711g--;
            this.f16710f--;
            this.f16712h = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            if (this.f16712h) {
                return (V) d.this.i(this.f16711g, v6);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return d.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f7 = d.this.f(obj);
            if (f7 < 0) {
                return false;
            }
            d.this.h(f7);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d7 = d.this.d();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < d7) {
                if (collection.contains(d.this.b(i7, 1))) {
                    d.this.h(i7);
                    i7--;
                    d7--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d7 = d.this.d();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < d7) {
                if (!collection.contains(d.this.b(i7, 1))) {
                    d.this.h(i7);
                    i7--;
                    d7--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return d.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d.this.r(tArr, 1);
        }
    }

    d() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
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

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i7, int i8);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k7, V v6);

    protected abstract void h(int i7);

    protected abstract V i(int i7, V v6);

    public Set<Map.Entry<K, V>> l() {
        if (this.f16700a == null) {
            this.f16700a = new b();
        }
        return this.f16700a;
    }

    public Set<K> m() {
        if (this.f16701b == null) {
            this.f16701b = new c();
        }
        return this.f16701b;
    }

    public Collection<V> n() {
        if (this.f16702c == null) {
            this.f16702c = new e();
        }
        return this.f16702c;
    }

    public Object[] q(int i7) {
        int d7 = d();
        Object[] objArr = new Object[d7];
        for (int i8 = 0; i8 < d7; i8++) {
            objArr[i8] = b(i8, i7);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i7) {
        int d7 = d();
        if (tArr.length < d7) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d7));
        }
        for (int i8 = 0; i8 < d7; i8++) {
            tArr[i8] = b(i8, i7);
        }
        if (tArr.length > d7) {
            tArr[d7] = null;
        }
        return tArr;
    }
}
