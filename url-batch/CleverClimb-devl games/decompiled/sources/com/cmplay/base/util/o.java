package com.cmplay.base.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import libcore.util.Objects;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
abstract class o<K, V> {

    /* renamed from: b, reason: collision with root package name */
    o<K, V>.b f4041b;

    /* renamed from: c, reason: collision with root package name */
    o<K, V>.c f4042c;

    /* renamed from: d, reason: collision with root package name */
    o<K, V>.e f4043d;

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int i2);

    protected abstract V a(int i, V v);

    protected abstract void a(int i);

    protected abstract void a(K k, V v);

    protected abstract int b(Object obj);

    protected abstract Map<K, V> b();

    protected abstract void c();

    o() {
    }

    /* compiled from: MapCollections.java */
    final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f4044a;

        /* renamed from: b, reason: collision with root package name */
        int f4045b;

        /* renamed from: c, reason: collision with root package name */
        int f4046c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4047d = false;

        a(int i) {
            this.f4044a = i;
            this.f4045b = o.this.a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4046c < this.f4045b;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = (T) o.this.a(this.f4046c, this.f4044a);
            this.f4046c++;
            this.f4047d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4047d) {
                throw new IllegalStateException();
            }
            this.f4046c--;
            this.f4045b--;
            this.f4047d = false;
            o.this.a(this.f4046c);
        }
    }

    /* compiled from: MapCollections.java */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        int f4050a;

        /* renamed from: c, reason: collision with root package name */
        boolean f4052c = false;

        /* renamed from: b, reason: collision with root package name */
        int f4051b = -1;

        d() {
            this.f4050a = o.this.a() - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4051b < this.f4050a;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f4051b++;
            this.f4052c = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4052c) {
                throw new IllegalStateException();
            }
            this.f4051b--;
            this.f4050a--;
            this.f4052c = false;
            o.this.a(this.f4051b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.f4052c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) o.this.a(this.f4051b, 0);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.f4052c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) o.this.a(this.f4051b, 1);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.f4052c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) o.this.a(this.f4051b, (int) v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f4052c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equal(entry.getKey(), o.this.a(this.f4051b, 0)) && Objects.equal(entry.getValue(), o.this.a(this.f4051b, 1));
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f4052c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object a2 = o.this.a(this.f4051b, 0);
            Object a3 = o.this.a(this.f4051b, 1);
            return (a2 == null ? 0 : a2.hashCode()) ^ (a3 != null ? a3.hashCode() : 0);
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a2 = o.this.a();
            for (Map.Entry<K, V> entry : collection) {
                o.this.a((o) entry.getKey(), (K) entry.getValue());
            }
            return a2 != o.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = o.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return Objects.equal(o.this.a(a2, 1), entry.getValue());
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
        public boolean isEmpty() {
            return o.this.a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
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
            return o.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int a2 = o.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = o.this.a(a2, 0);
                Object a4 = o.this.a(a2, 1);
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a4 == null ? 0 : a4.hashCode());
            }
            return i;
        }
    }

    /* compiled from: MapCollections.java */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return o.this.a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return o.a((Map) o.this.b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return o.this.a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int a2 = o.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            o.this.a(a2);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return o.b(o.this.b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return o.c(o.this.b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return o.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return o.this.b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.this.a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int a2 = o.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = o.this.a(a2, 0);
                i += a3 == null ? 0 : a3.hashCode();
            }
            return i;
        }
    }

    /* compiled from: MapCollections.java */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            o.this.c();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return o.this.b(obj) >= 0;
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
            return o.this.a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int b2 = o.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            o.this.a(b2);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int a2 = o.this.a();
            int i = 0;
            boolean z = false;
            while (i < a2) {
                if (collection.contains(o.this.a(i, 1))) {
                    o.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int a2 = o.this.a();
            int i = 0;
            boolean z = false;
            while (i < a2) {
                if (!collection.contains(o.this.a(i, 1))) {
                    o.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return o.this.a();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return o.this.b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public <T> T[] a(T[] tArr, int i) {
        int a2 = a();
        if (tArr.length < a2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2));
        }
        for (int i2 = 0; i2 < a2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > a2) {
            tArr[a2] = null;
        }
        return tArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    public Set<Map.Entry<K, V>> d() {
        if (this.f4041b == null) {
            this.f4041b = new b();
        }
        return this.f4041b;
    }

    public Set<K> e() {
        if (this.f4042c == null) {
            this.f4042c = new c();
        }
        return this.f4042c;
    }

    public Collection<V> f() {
        if (this.f4043d == null) {
            this.f4043d = new e();
        }
        return this.f4043d;
    }
}
