package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class f<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f = !f.class.desiredAssertionStatus();
    private static final Comparator<Comparable> g = new Comparator<Comparable>() { // from class: com.google.gson.internal.f.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    Comparator<? super K> f6640a;

    /* renamed from: b, reason: collision with root package name */
    d<K, V> f6641b;

    /* renamed from: c, reason: collision with root package name */
    int f6642c;

    /* renamed from: d, reason: collision with root package name */
    int f6643d;
    final d<K, V> e;
    private f<K, V>.a h;
    private f<K, V>.b i;

    public f() {
        this(g);
    }

    public f(Comparator<? super K> comparator) {
        this.f6642c = 0;
        this.f6643d = 0;
        this.e = new d<>();
        this.f6640a = comparator == null ? g : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6642c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        d<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> a2 = a((f<K, V>) k, true);
        V v2 = a2.g;
        a2.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f6641b = null;
        this.f6642c = 0;
        this.f6643d++;
        d<K, V> dVar = this.e;
        dVar.e = dVar;
        dVar.f6654d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.g;
        }
        return null;
    }

    d<K, V> a(K k, boolean z) {
        int i;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f6640a;
        d<K, V> dVar2 = this.f6641b;
        if (dVar2 != null) {
            Comparable comparable = comparator == g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dVar2.f);
                } else {
                    i = comparator.compare(k, dVar2.f);
                }
                if (i == 0) {
                    return dVar2;
                }
                d<K, V> dVar3 = i < 0 ? dVar2.f6652b : dVar2.f6653c;
                if (dVar3 == null) {
                    break;
                }
                dVar2 = dVar3;
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
            this.f6641b = dVar;
        } else {
            dVar = new d<>(dVar2, k, dVar4, dVar4.e);
            if (i < 0) {
                dVar2.f6652b = dVar;
            } else {
                dVar2.f6653c = dVar;
            }
            b(dVar2, true);
        }
        this.f6642c++;
        this.f6643d++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    d<K, V> a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a((f<K, V>) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> a2 = a(entry.getKey());
        if (a2 != null && a(a2.g, entry.getValue())) {
            return a2;
        }
        return null;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    void a(d<K, V> dVar, boolean z) {
        int i;
        if (z) {
            dVar.e.f6654d = dVar.f6654d;
            dVar.f6654d.e = dVar.e;
        }
        d<K, V> dVar2 = dVar.f6652b;
        d<K, V> dVar3 = dVar.f6653c;
        d<K, V> dVar4 = dVar.f6651a;
        int i2 = 0;
        if (dVar2 != null && dVar3 != null) {
            d<K, V> b2 = dVar2.h > dVar3.h ? dVar2.b() : dVar3.a();
            a((d) b2, false);
            d<K, V> dVar5 = dVar.f6652b;
            if (dVar5 != null) {
                i = dVar5.h;
                b2.f6652b = dVar5;
                dVar5.f6651a = b2;
                dVar.f6652b = null;
            } else {
                i = 0;
            }
            d<K, V> dVar6 = dVar.f6653c;
            if (dVar6 != null) {
                i2 = dVar6.h;
                b2.f6653c = dVar6;
                dVar6.f6651a = b2;
                dVar.f6653c = null;
            }
            b2.h = Math.max(i, i2) + 1;
            a((d) dVar, (d) b2);
            return;
        }
        if (dVar2 != null) {
            a((d) dVar, (d) dVar2);
            dVar.f6652b = null;
        } else if (dVar3 != null) {
            a((d) dVar, (d) dVar3);
            dVar.f6653c = null;
        } else {
            a((d) dVar, (d) null);
        }
        b(dVar4, false);
        this.f6642c--;
        this.f6643d++;
    }

    d<K, V> b(Object obj) {
        d<K, V> a2 = a(obj);
        if (a2 != null) {
            a((d) a2, true);
        }
        return a2;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f6651a;
        dVar.f6651a = null;
        if (dVar2 != null) {
            dVar2.f6651a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f6652b == dVar) {
                dVar3.f6652b = dVar2;
                return;
            } else {
                if (!f && dVar3.f6653c != dVar) {
                    throw new AssertionError();
                }
                dVar3.f6653c = dVar2;
                return;
            }
        }
        this.f6641b = dVar2;
    }

    private void b(d<K, V> dVar, boolean z) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f6652b;
            d<K, V> dVar3 = dVar.f6653c;
            int i = dVar2 != null ? dVar2.h : 0;
            int i2 = dVar3 != null ? dVar3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                d<K, V> dVar4 = dVar3.f6652b;
                d<K, V> dVar5 = dVar3.f6653c;
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
                d<K, V> dVar6 = dVar2.f6652b;
                d<K, V> dVar7 = dVar2.f6653c;
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
            dVar = dVar.f6651a;
        }
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f6652b;
        d<K, V> dVar3 = dVar.f6653c;
        d<K, V> dVar4 = dVar3.f6652b;
        d<K, V> dVar5 = dVar3.f6653c;
        dVar.f6653c = dVar4;
        if (dVar4 != null) {
            dVar4.f6651a = dVar;
        }
        a((d) dVar, (d) dVar3);
        dVar3.f6652b = dVar;
        dVar.f6651a = dVar3;
        dVar.h = Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        dVar3.h = Math.max(dVar.h, dVar5 != null ? dVar5.h : 0) + 1;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f6652b;
        d<K, V> dVar3 = dVar.f6653c;
        d<K, V> dVar4 = dVar2.f6652b;
        d<K, V> dVar5 = dVar2.f6653c;
        dVar.f6652b = dVar5;
        if (dVar5 != null) {
            dVar5.f6651a = dVar;
        }
        a((d) dVar, (d) dVar2);
        dVar2.f6653c = dVar;
        dVar.f6651a = dVar2;
        dVar.h = Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        dVar2.h = Math.max(dVar.h, dVar4 != null ? dVar4.h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        f<K, V>.a aVar2 = new a();
        this.h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        f<K, V>.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        f<K, V>.b bVar2 = new b();
        this.i = bVar2;
        return bVar2;
    }

    /* compiled from: LinkedTreeMap.java */
    static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        d<K, V> f6651a;

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f6652b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f6653c;

        /* renamed from: d, reason: collision with root package name */
        d<K, V> f6654d;
        d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.f6654d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.f6651a = dVar;
            this.f = k;
            this.h = 1;
            this.f6654d = dVar2;
            this.e = dVar3;
            dVar3.f6654d = this;
            dVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f.equals(entry.getKey())) {
                return false;
            }
            if (this.g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (this.f == null ? 0 : this.f.hashCode()) ^ (this.g != null ? this.g.hashCode() : 0);
        }

        public String toString() {
            return this.f + "=" + this.g;
        }

        public d<K, V> a() {
            d<K, V> dVar = this;
            for (d<K, V> dVar2 = this.f6652b; dVar2 != null; dVar2 = dVar2.f6652b) {
                dVar = dVar2;
            }
            return dVar;
        }

        public d<K, V> b() {
            d<K, V> dVar = this;
            for (d<K, V> dVar2 = this.f6653c; dVar2 != null; dVar2 = dVar2.f6653c) {
                dVar = dVar2;
            }
            return dVar;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    private abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f6648b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f6649c = null;

        /* renamed from: d, reason: collision with root package name */
        int f6650d;

        c() {
            this.f6648b = f.this.e.f6654d;
            this.f6650d = f.this.f6643d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6648b != f.this.e;
        }

        final d<K, V> b() {
            d<K, V> dVar = this.f6648b;
            if (dVar == f.this.e) {
                throw new NoSuchElementException();
            }
            if (f.this.f6643d != this.f6650d) {
                throw new ConcurrentModificationException();
            }
            this.f6648b = dVar.f6654d;
            this.f6649c = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f6649c == null) {
                throw new IllegalStateException();
            }
            f.this.a((d) this.f6649c, true);
            this.f6649c = null;
            this.f6650d = f.this.f6643d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f6642c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f<K, V>.c<Map.Entry<K, V>>() { // from class: com.google.gson.internal.f.a.1
                {
                    f fVar = f.this;
                }

                @Override // java.util.Iterator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> next() {
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f.this.a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            d<K, V> a2;
            if (!(obj instanceof Map.Entry) || (a2 = f.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            f.this.a((d) a2, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }
    }

    /* compiled from: LinkedTreeMap.java */
    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f6642c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new f<K, V>.c<K>() { // from class: com.google.gson.internal.f.b.1
                {
                    f fVar = f.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return b().f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return f.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}
