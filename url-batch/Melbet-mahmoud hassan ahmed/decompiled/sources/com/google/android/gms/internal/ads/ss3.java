package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class ss3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final int f11957f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11960i;

    /* renamed from: j, reason: collision with root package name */
    private volatile ps3 f11961j;

    /* renamed from: g, reason: collision with root package name */
    private List<ls3> f11958g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    private Map<K, V> f11959h = Collections.emptyMap();

    /* renamed from: k, reason: collision with root package name */
    private Map<K, V> f11962k = Collections.emptyMap();

    private final int k(K k7) {
        int size = this.f11958g.size() - 1;
        int i7 = 0;
        if (size >= 0) {
            int compareTo = k7.compareTo(this.f11958g.get(size).b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i7 <= size) {
            int i8 = (i7 + size) / 2;
            int compareTo2 = k7.compareTo(this.f11958g.get(i8).b());
            if (compareTo2 < 0) {
                size = i8 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i8;
                }
                i7 = i8 + 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V l(int i7) {
        n();
        V v6 = (V) this.f11958g.remove(i7).getValue();
        if (!this.f11959h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m().entrySet().iterator();
            List<ls3> list = this.f11958g;
            Map.Entry<K, V> next = it.next();
            list.add(new ls3(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v6;
    }

    private final SortedMap<K, V> m() {
        n();
        if (this.f11959h.isEmpty() && !(this.f11959h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11959h = treeMap;
            this.f11962k = treeMap.descendingMap();
        }
        return (SortedMap) this.f11959h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f11960i) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f11960i) {
            return;
        }
        this.f11959h = this.f11959h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11959h);
        this.f11962k = this.f11962k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11962k);
        this.f11960i = true;
    }

    public final int b() {
        return this.f11958g.size();
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f11959h.isEmpty() ? ks3.a() : this.f11959h.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f11958g.isEmpty()) {
            this.f11958g.clear();
        }
        if (this.f11959h.isEmpty()) {
            return;
        }
        this.f11959h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f11959h.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final V put(K k7, V v6) {
        n();
        int k8 = k(k7);
        if (k8 >= 0) {
            return (V) this.f11958g.get(k8).setValue(v6);
        }
        n();
        if (this.f11958g.isEmpty() && !(this.f11958g instanceof ArrayList)) {
            this.f11958g = new ArrayList(this.f11957f);
        }
        int i7 = -(k8 + 1);
        if (i7 >= this.f11957f) {
            return m().put(k7, v6);
        }
        int size = this.f11958g.size();
        int i8 = this.f11957f;
        if (size == i8) {
            ls3 remove = this.f11958g.remove(i8 - 1);
            m().put(remove.b(), remove.getValue());
        }
        this.f11958g.add(i7, new ls3(this, k7, v6));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f11961j == null) {
            this.f11961j = new ps3(this, null);
        }
        return this.f11961j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss3)) {
            return super.equals(obj);
        }
        ss3 ss3Var = (ss3) obj;
        int size = size();
        if (size != ss3Var.size()) {
            return false;
        }
        int b7 = b();
        if (b7 != ss3Var.b()) {
            return entrySet().equals(ss3Var.entrySet());
        }
        for (int i7 = 0; i7 < b7; i7++) {
            if (!g(i7).equals(ss3Var.g(i7))) {
                return false;
            }
        }
        if (b7 != size) {
            return this.f11959h.equals(ss3Var.f11959h);
        }
        return true;
    }

    public final Map.Entry<K, V> g(int i7) {
        return this.f11958g.get(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k7 = k(comparable);
        return k7 >= 0 ? (V) this.f11958g.get(k7).getValue() : this.f11959h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b7 = b();
        int i7 = 0;
        for (int i8 = 0; i8 < b7; i8++) {
            i7 += this.f11958g.get(i8).hashCode();
        }
        return this.f11959h.size() > 0 ? i7 + this.f11959h.hashCode() : i7;
    }

    public final boolean j() {
        return this.f11960i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k7 = k(comparable);
        if (k7 >= 0) {
            return (V) l(k7);
        }
        if (this.f11959h.isEmpty()) {
            return null;
        }
        return this.f11959h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11958g.size() + this.f11959h.size();
    }
}
