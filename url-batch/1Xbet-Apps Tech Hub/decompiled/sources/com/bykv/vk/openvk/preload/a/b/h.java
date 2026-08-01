package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f = true;
    private static final Comparator<Comparable> g = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.h.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> a;
    d<K, V> b;
    int c;
    int d;
    final d<K, V> e;
    private h<K, V>.a h;
    private h<K, V>.b i;

    public h() {
        this(g);
    }

    private h(Comparator<? super K> comparator) {
        this.c = 0;
        this.d = 0;
        this.e = new d<>();
        this.a = comparator == null ? g : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (b(obj) != null) {
            return f;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> a2 = a((h<K, V>) k, f);
        V v2 = a2.g;
        a2.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        d<K, V> dVar = this.e;
        dVar.e = dVar;
        dVar.d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.g;
        }
        return null;
    }

    private d<K, V> a(K k, boolean z) {
        int i;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.a;
        d<K, V> dVar2 = this.b;
        if (dVar2 != null) {
            Comparable comparable = comparator == g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dVar2.f);
                } else {
                    i = comparator.compare(k, dVar2.f);
                }
                if (i != 0) {
                    d<K, V> dVar3 = i < 0 ? dVar2.b : dVar2.c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar4 = this.e;
        if (dVar2 == null) {
            if (comparator == g && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            dVar = new d<>(dVar2, k, dVar4, dVar4.e);
            this.b = dVar;
        } else {
            dVar = new d<>(dVar2, k, dVar4, dVar4.e);
            if (i < 0) {
                dVar2.b = dVar;
            } else {
                dVar2.c = dVar;
            }
            b(dVar2, f);
        }
        this.c++;
        this.d++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a((h<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> b2 = b(entry.getKey());
        boolean z = false;
        if (b2 != null) {
            V v = b2.g;
            Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                z = true;
            }
        }
        if (z) {
            return b2;
        }
        return null;
    }

    final void a(d<K, V> dVar, boolean z) {
        int i;
        if (z) {
            dVar.e.d = dVar.d;
            dVar.d.e = dVar.e;
        }
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar.a;
        int i2 = 0;
        if (dVar2 != null && dVar3 != null) {
            if (dVar2.h > dVar3.h) {
                d<K, V> dVar5 = dVar2.c;
                while (true) {
                    d<K, V> dVar6 = dVar5;
                    dVar3 = dVar2;
                    dVar2 = dVar6;
                    if (dVar2 == null) {
                        break;
                    } else {
                        dVar5 = dVar2.c;
                    }
                }
            } else {
                while (true) {
                    d<K, V> dVar7 = dVar3.b;
                    if (dVar7 == null) {
                        break;
                    } else {
                        dVar3 = dVar7;
                    }
                }
            }
            a((d) dVar3, false);
            d<K, V> dVar8 = dVar.b;
            if (dVar8 != null) {
                i = dVar8.h;
                dVar3.b = dVar8;
                dVar8.a = dVar3;
                dVar.b = null;
            } else {
                i = 0;
            }
            d<K, V> dVar9 = dVar.c;
            if (dVar9 != null) {
                i2 = dVar9.h;
                dVar3.c = dVar9;
                dVar9.a = dVar3;
                dVar.c = null;
            }
            dVar3.h = Math.max(i, i2) + 1;
            a(dVar, dVar3);
            return;
        }
        if (dVar2 != null) {
            a(dVar, dVar2);
            dVar.b = null;
        } else if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar4, false);
        this.c--;
        this.d++;
    }

    final d<K, V> a(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            a((d) b2, f);
        }
        return b2;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.a;
        dVar.a = null;
        if (dVar2 != null) {
            dVar2.a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.b == dVar) {
                dVar3.b = dVar2;
                return;
            } else {
                if (!f && dVar3.c != dVar) {
                    throw new AssertionError();
                }
                dVar3.c = dVar2;
                return;
            }
        }
        this.b = dVar2;
    }

    private void b(d<K, V> dVar, boolean z) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.b;
            d<K, V> dVar3 = dVar.c;
            int i = dVar2 != null ? dVar2.h : 0;
            int i2 = dVar3 != null ? dVar3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                d<K, V> dVar4 = dVar3.b;
                d<K, V> dVar5 = dVar3.c;
                int i4 = (dVar4 != null ? dVar4.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    a((d) dVar);
                } else {
                    if (!f && i4 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                d<K, V> dVar6 = dVar2.b;
                d<K, V> dVar7 = dVar2.c;
                int i5 = (dVar6 != null ? dVar6.h : 0) - (dVar7 != null ? dVar7.h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    b((d) dVar);
                } else {
                    if (!f && i5 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                dVar.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                if (!f && i3 != -1 && i3 != 1) {
                    throw new AssertionError();
                }
                dVar.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.a;
        }
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar3.b;
        d<K, V> dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.a = dVar;
        }
        a(dVar, dVar3);
        dVar3.b = dVar;
        dVar.a = dVar3;
        dVar.h = Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        dVar3.h = Math.max(dVar.h, dVar5 != null ? dVar5.h : 0) + 1;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar2.b;
        d<K, V> dVar5 = dVar2.c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.a = dVar;
        }
        a(dVar, dVar2);
        dVar2.c = dVar;
        dVar.a = dVar2;
        dVar.h = Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        dVar2.h = Math.max(dVar.h, dVar4 != null ? dVar4.h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        h<K, V>.a aVar2 = new a();
        this.h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        h<K, V>.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.i = bVar2;
        return bVar2;
    }

    /* compiled from: LinkedTreeMap.java */
    static final class d<K, V> implements Map.Entry<K, V> {
        d<K, V> a;
        d<K, V> b;
        d<K, V> c;
        d<K, V> d;
        d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.a = dVar;
            this.f = k;
            this.h = 1;
            this.d = dVar2;
            this.e = dVar3;
            dVar3.d = this;
            dVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return h.f;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return h.f;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            return this.f + "=" + this.g;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    abstract class c<T> implements Iterator<T> {
        d<K, V> b;
        d<K, V> c = null;
        int d;

        c() {
            this.b = h.this.e.d;
            this.d = h.this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b != h.this.e) {
                return h.f;
            }
            return false;
        }

        final d<K, V> a() {
            d<K, V> dVar = this.b;
            if (dVar == h.this.e) {
                throw new NoSuchElementException();
            }
            if (h.this.d != this.d) {
                throw new ConcurrentModificationException();
            }
            this.b = dVar.d;
            this.c = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.c;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            h.this.a((d) dVar, h.f);
            this.c = null;
            this.d = h.this.d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new h<K, V>.c<Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.h.a.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || h.this.a((Map.Entry<?, ?>) obj) == null) {
                return false;
            }
            return h.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> a;
            if (!(obj instanceof Map.Entry) || (a = h.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            h.this.a((d) a, h.f);
            return h.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }
    }

    /* compiled from: LinkedTreeMap.java */
    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new h<K, V>.c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.h.b.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (h.this.a(obj) != null) {
                return h.f;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }
    }
}
