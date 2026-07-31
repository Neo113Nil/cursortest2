package m4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import m4.o;

/* loaded from: classes.dex */
public abstract class r<K, V> implements Map<K, V>, Serializable {

    /* renamed from: i, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f19200i = new Map.Entry[0];

    /* renamed from: f, reason: collision with root package name */
    private transient s<Map.Entry<K, V>> f19201f;

    /* renamed from: g, reason: collision with root package name */
    private transient s<K> f19202g;

    /* renamed from: h, reason: collision with root package name */
    private transient o<V> f19203h;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Comparator<? super V> f19204a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f19205b;

        /* renamed from: c, reason: collision with root package name */
        int f19206c;

        /* renamed from: d, reason: collision with root package name */
        boolean f19207d;

        public a() {
            this(4);
        }

        a(int i7) {
            this.f19205b = new Object[i7 * 2];
            this.f19206c = 0;
            this.f19207d = false;
        }

        private void c(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f19205b;
            if (i8 > objArr.length) {
                this.f19205b = Arrays.copyOf(objArr, o.b.c(objArr.length, i8));
                this.f19207d = false;
            }
        }

        public r<K, V> a() {
            return b();
        }

        public r<K, V> b() {
            g();
            this.f19207d = true;
            return k0.l(this.f19206c, this.f19205b);
        }

        public a<K, V> d(K k7, V v6) {
            c(this.f19206c + 1);
            h.a(k7, v6);
            Object[] objArr = this.f19205b;
            int i7 = this.f19206c;
            objArr[i7 * 2] = k7;
            objArr[(i7 * 2) + 1] = v6;
            this.f19206c = i7 + 1;
            return this;
        }

        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f19206c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return this;
        }

        void g() {
            int i7;
            if (this.f19204a != null) {
                if (this.f19207d) {
                    this.f19205b = Arrays.copyOf(this.f19205b, this.f19206c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f19206c];
                int i8 = 0;
                while (true) {
                    i7 = this.f19206c;
                    if (i8 >= i7) {
                        break;
                    }
                    int i9 = i8 * 2;
                    Object obj = this.f19205b[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f19205b[i9 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i8++;
                }
                Arrays.sort(entryArr, 0, i7, h0.a(this.f19204a).c(y.j()));
                for (int i10 = 0; i10 < this.f19206c; i10++) {
                    int i11 = i10 * 2;
                    this.f19205b[i11] = entryArr[i10].getKey();
                    this.f19205b[i11 + 1] = entryArr[i10].getValue();
                }
            }
        }
    }

    r() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> r<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.f(iterable);
        return aVar.a();
    }

    public static <K, V> r<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof r) && !(map instanceof SortedMap)) {
            r<K, V> rVar = (r) map;
            if (!rVar.h()) {
                return rVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> r<K, V> j() {
        return (r<K, V>) k0.f19161m;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract s<Map.Entry<K, V>> d();

    abstract s<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return y.c(this, obj);
    }

    abstract o<V> f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s<Map.Entry<K, V>> entrySet() {
        s<Map.Entry<K, V>> sVar = this.f19201f;
        if (sVar != null) {
            return sVar;
        }
        s<Map.Entry<K, V>> d7 = d();
        this.f19201f = d7;
        return d7;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v6) {
        V v7 = get(obj);
        return v7 != null ? v7 : v6;
    }

    abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return p0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s<K> keySet() {
        s<K> sVar = this.f19202g;
        if (sVar != null) {
            return sVar;
        }
        s<K> e7 = e();
        this.f19202g = e7;
        return e7;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public o<V> values() {
        o<V> oVar = this.f19203h;
        if (oVar != null) {
            return oVar;
        }
        o<V> f7 = f();
        this.f19203h = f7;
        return f7;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k7, V v6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return y.i(this);
    }
}
