package com.crrepa.n1;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
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

/* loaded from: classes3.dex */
public final class j<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<Comparable> f13431h = new a();

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f13432i = true;

    /* renamed from: a, reason: collision with root package name */
    Comparator<? super K> f13433a;

    /* renamed from: b, reason: collision with root package name */
    e f13434b;

    /* renamed from: c, reason: collision with root package name */
    int f13435c;

    /* renamed from: d, reason: collision with root package name */
    int f13436d;

    /* renamed from: e, reason: collision with root package name */
    final e f13437e;

    /* renamed from: f, reason: collision with root package name */
    private j<K, V>.b f13438f;

    /* renamed from: g, reason: collision with root package name */
    private j<K, V>.c f13439g;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && j.this.a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e a8;
            if (!(obj instanceof Map.Entry) || (a8 = j.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            j.this.b(a8, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.f13435c;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) a().f13453f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return j.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.f13435c;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f13444a;

        /* renamed from: b, reason: collision with root package name */
        e f13445b = null;

        /* renamed from: c, reason: collision with root package name */
        int f13446c;

        d() {
            this.f13444a = j.this.f13437e.f13451d;
            this.f13446c = j.this.f13436d;
        }

        final e a() {
            e eVar = this.f13444a;
            j jVar = j.this;
            if (eVar == jVar.f13437e) {
                throw new NoSuchElementException();
            }
            if (jVar.f13436d != this.f13446c) {
                throw new ConcurrentModificationException();
            }
            this.f13444a = eVar.f13451d;
            this.f13445b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13444a != j.this.f13437e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f13445b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            j.this.b(eVar, true);
            this.f13445b = null;
            this.f13446c = j.this.f13436d;
        }
    }

    static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f13448a;

        /* renamed from: b, reason: collision with root package name */
        e f13449b;

        /* renamed from: c, reason: collision with root package name */
        e f13450c;

        /* renamed from: d, reason: collision with root package name */
        e f13451d;

        /* renamed from: e, reason: collision with root package name */
        e f13452e;

        /* renamed from: f, reason: collision with root package name */
        final Object f13453f;

        /* renamed from: g, reason: collision with root package name */
        Object f13454g;

        /* renamed from: h, reason: collision with root package name */
        int f13455h;

        e() {
            this.f13453f = null;
            this.f13452e = this;
            this.f13451d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f13449b; eVar2 != null; eVar2 = eVar2.f13449b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f13450c; eVar2 != null; eVar2 = eVar2.f13450c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f13453f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f13454g;
            Object value = entry.getValue();
            if (obj3 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!obj3.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f13453f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f13454g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f13453f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f13454g;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f13454g;
            this.f13454g = obj;
            return obj2;
        }

        public String toString() {
            return this.f13453f + "=" + this.f13454g;
        }

        e(e eVar, Object obj, e eVar2, e eVar3) {
            this.f13448a = eVar;
            this.f13453f = obj;
            this.f13455h = 1;
            this.f13451d = eVar2;
            this.f13452e = eVar3;
            eVar3.f13451d = this;
            eVar2.f13452e = this;
        }
    }

    public j() {
        this(f13431h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    e a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a((j<K, V>) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    e b(Object obj) {
        e a8 = a(obj);
        if (a8 != null) {
            b(a8, true);
        }
        return a8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f13434b = null;
        this.f13435c = 0;
        this.f13436d++;
        e eVar = this.f13437e;
        eVar.f13452e = eVar;
        eVar.f13451d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        j<K, V>.b bVar = this.f13438f;
        if (bVar != null) {
            return bVar;
        }
        j<K, V>.b bVar2 = new b();
        this.f13438f = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e a8 = a(obj);
        if (a8 != null) {
            return (V) a8.f13454g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        j<K, V>.c cVar = this.f13439g;
        if (cVar != null) {
            return cVar;
        }
        j<K, V>.c cVar2 = new c();
        this.f13439g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v7) {
        if (k8 == null) {
            throw new NullPointerException("key == null");
        }
        e a8 = a((j<K, V>) k8, true);
        V v8 = (V) a8.f13454g;
        a8.f13454g = v7;
        return v8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e b8 = b(obj);
        if (b8 != null) {
            return (V) b8.f13454g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13435c;
    }

    public j(Comparator<? super K> comparator) {
        this.f13435c = 0;
        this.f13436d = 0;
        this.f13437e = new e();
        this.f13433a = comparator == null ? f13431h : comparator;
    }

    private void b(e eVar) {
        e eVar2 = eVar.f13449b;
        e eVar3 = eVar.f13450c;
        e eVar4 = eVar2.f13449b;
        e eVar5 = eVar2.f13450c;
        eVar.f13449b = eVar5;
        if (eVar5 != null) {
            eVar5.f13448a = eVar;
        }
        a(eVar, eVar2);
        eVar2.f13450c = eVar;
        eVar.f13448a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f13455h : 0, eVar5 != null ? eVar5.f13455h : 0) + 1;
        eVar.f13455h = max;
        eVar2.f13455h = Math.max(max, eVar4 != null ? eVar4.f13455h : 0) + 1;
    }

    e a(K k8, boolean z7) {
        int i8;
        e eVar;
        Comparator<? super K> comparator = this.f13433a;
        e eVar2 = this.f13434b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f13431h ? (Comparable) k8 : null;
            while (true) {
                a0.f fVar = (Object) eVar2.f13453f;
                i8 = comparable != null ? comparable.compareTo(fVar) : comparator.compare(k8, fVar);
                if (i8 == 0) {
                    return eVar2;
                }
                e eVar3 = i8 < 0 ? eVar2.f13449b : eVar2.f13450c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i8 = 0;
        }
        if (!z7) {
            return null;
        }
        e eVar4 = this.f13437e;
        if (eVar2 != null) {
            eVar = new e(eVar2, k8, eVar4, eVar4.f13452e);
            if (i8 < 0) {
                eVar2.f13449b = eVar;
            } else {
                eVar2.f13450c = eVar;
            }
            a(eVar2, true);
        } else {
            if (comparator == f13431h && !(k8 instanceof Comparable)) {
                throw new ClassCastException(k8.getClass().getName() + " is not Comparable");
            }
            eVar = new e(eVar2, k8, eVar4, eVar4.f13452e);
            this.f13434b = eVar;
        }
        this.f13435c++;
        this.f13436d++;
        return eVar;
    }

    e a(Map.Entry<?, ?> entry) {
        e a8 = a(entry.getKey());
        if (a8 == null || !a(a8.f13454g, entry.getValue())) {
            return null;
        }
        return a8;
    }

    void b(e eVar, boolean z7) {
        int i8;
        if (z7) {
            e eVar2 = eVar.f13452e;
            eVar2.f13451d = eVar.f13451d;
            eVar.f13451d.f13452e = eVar2;
        }
        e eVar3 = eVar.f13449b;
        e eVar4 = eVar.f13450c;
        e eVar5 = eVar.f13448a;
        int i9 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                a(eVar, eVar3);
                eVar.f13449b = null;
            } else if (eVar4 != null) {
                a(eVar, eVar4);
                eVar.f13450c = null;
            } else {
                a(eVar, (e) null);
            }
            a(eVar5, false);
            this.f13435c--;
            this.f13436d++;
            return;
        }
        e b8 = eVar3.f13455h > eVar4.f13455h ? eVar3.b() : eVar4.a();
        b(b8, false);
        e eVar6 = eVar.f13449b;
        if (eVar6 != null) {
            i8 = eVar6.f13455h;
            b8.f13449b = eVar6;
            eVar6.f13448a = b8;
            eVar.f13449b = null;
        } else {
            i8 = 0;
        }
        e eVar7 = eVar.f13450c;
        if (eVar7 != null) {
            i9 = eVar7.f13455h;
            b8.f13450c = eVar7;
            eVar7.f13448a = b8;
            eVar.f13450c = null;
        }
        b8.f13455h = Math.max(i8, i9) + 1;
        a(eVar, b8);
    }

    private Object a() {
        return new LinkedHashMap(this);
    }

    private void a(e eVar) {
        e eVar2 = eVar.f13449b;
        e eVar3 = eVar.f13450c;
        e eVar4 = eVar3.f13449b;
        e eVar5 = eVar3.f13450c;
        eVar.f13450c = eVar4;
        if (eVar4 != null) {
            eVar4.f13448a = eVar;
        }
        a(eVar, eVar3);
        eVar3.f13449b = eVar;
        eVar.f13448a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f13455h : 0, eVar4 != null ? eVar4.f13455h : 0) + 1;
        eVar.f13455h = max;
        eVar3.f13455h = Math.max(max, eVar5 != null ? eVar5.f13455h : 0) + 1;
    }

    private void a(e eVar, e eVar2) {
        e eVar3 = eVar.f13448a;
        eVar.f13448a = null;
        if (eVar2 != null) {
            eVar2.f13448a = eVar3;
        }
        if (eVar3 == null) {
            this.f13434b = eVar2;
            return;
        }
        if (eVar3.f13449b == eVar) {
            eVar3.f13449b = eVar2;
        } else {
            if (!f13432i && eVar3.f13450c != eVar) {
                throw new AssertionError();
            }
            eVar3.f13450c = eVar2;
        }
    }

    private void a(e eVar, boolean z7) {
        while (eVar != null) {
            e eVar2 = eVar.f13449b;
            e eVar3 = eVar.f13450c;
            int i8 = eVar2 != null ? eVar2.f13455h : 0;
            int i9 = eVar3 != null ? eVar3.f13455h : 0;
            int i10 = i8 - i9;
            if (i10 == -2) {
                e eVar4 = eVar3.f13449b;
                e eVar5 = eVar3.f13450c;
                int i11 = (eVar4 != null ? eVar4.f13455h : 0) - (eVar5 != null ? eVar5.f13455h : 0);
                if (i11 != -1 && (i11 != 0 || z7)) {
                    if (!f13432i && i11 != 1) {
                        throw new AssertionError();
                    }
                    b(eVar3);
                }
                a(eVar);
                if (z7) {
                    return;
                }
            } else if (i10 == 2) {
                e eVar6 = eVar2.f13449b;
                e eVar7 = eVar2.f13450c;
                int i12 = (eVar6 != null ? eVar6.f13455h : 0) - (eVar7 != null ? eVar7.f13455h : 0);
                if (i12 != 1 && (i12 != 0 || z7)) {
                    if (!f13432i && i12 != -1) {
                        throw new AssertionError();
                    }
                    a(eVar2);
                }
                b(eVar);
                if (z7) {
                    return;
                }
            } else if (i10 == 0) {
                eVar.f13455h = i8 + 1;
                if (z7) {
                    return;
                }
            } else {
                if (!f13432i && i10 != -1 && i10 != 1) {
                    throw new AssertionError();
                }
                eVar.f13455h = Math.max(i8, i9) + 1;
                if (!z7) {
                    return;
                }
            }
            eVar = eVar.f13448a;
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
