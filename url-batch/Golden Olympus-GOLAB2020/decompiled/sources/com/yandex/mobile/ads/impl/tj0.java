package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class tj0<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private transient uj0<Map.Entry<K, V>> f32450b;

    /* renamed from: c, reason: collision with root package name */
    private transient uj0<K> f32451c;

    /* renamed from: d, reason: collision with root package name */
    private transient qj0<V> f32452d;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f32453a;

        /* renamed from: b, reason: collision with root package name */
        int f32454b;

        public a() {
            this(4);
        }

        a(int i4) {
            this.f32453a = new Object[i4 * 2];
            this.f32454b = 0;
        }

        public final tj0<K, V> a() {
            return go1.a(this.f32454b, this.f32453a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i4) {
            int i5 = i4 * 2;
            Object[] objArr = this.f32453a;
            if (i5 > objArr.length) {
                int length = objArr.length;
                if (i5 >= 0) {
                    int i6 = length + (length >> 1) + 1;
                    if (i6 < i5) {
                        i6 = Integer.highestOneBit(i5 - 1) << 1;
                    }
                    if (i6 < 0) {
                        i6 = Integer.MAX_VALUE;
                    }
                    this.f32453a = Arrays.copyOf(objArr, i6);
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }

        public final a<K, V> a(K k4, V v4) {
            a(this.f32454b + 1);
            if (k4 == null) {
                throw new NullPointerException("null key in entry: null=" + v4);
            }
            if (v4 != null) {
                Object[] objArr = this.f32453a;
                int i4 = this.f32454b;
                int i5 = i4 * 2;
                objArr[i5] = k4;
                objArr[i5 + 1] = v4;
                this.f32454b = i4 + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + k4 + "=null");
        }
    }

    static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f32455b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f32456c;

        b(tj0<K, V> tj0Var) {
            Object[] objArr = new Object[tj0Var.size()];
            Object[] objArr2 = new Object[tj0Var.size()];
            x72<Map.Entry<K, V>> it = tj0Var.entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i4] = next.getKey();
                objArr2[i4] = next.getValue();
                i4++;
            }
            this.f32455b = objArr;
            this.f32456c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object readResolve() {
            Object[] objArr = this.f32455b;
            if (!(objArr instanceof uj0)) {
                Object[] objArr2 = this.f32456c;
                a aVar = new a(objArr.length);
                for (int i4 = 0; i4 < objArr.length; i4++) {
                    aVar.a((a) objArr[i4], (Object[]) objArr2[i4]);
                }
                return go1.a(aVar.f32454b, aVar.f32453a);
            }
            uj0 uj0Var = (uj0) objArr;
            qj0 qj0Var = (qj0) this.f32456c;
            a aVar2 = new a(uj0Var.size());
            Iterator it = uj0Var.iterator();
            x72 it2 = qj0Var.iterator();
            while (it.hasNext()) {
                aVar2.a((a) it.next(), (Object) it2.next());
            }
            return go1.a(aVar2.f32454b, aVar2.f32453a);
        }
    }

    tj0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tj0 a(HashMap hashMap) {
        Set<Map.Entry<K, V>> entrySet = hashMap.entrySet();
        boolean z4 = entrySet instanceof Collection;
        a aVar = new a(z4 ? entrySet.size() : 4);
        if (z4) {
            aVar.a(entrySet.size());
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.a((a) entry.getKey(), entry.getValue());
        }
        return go1.a(aVar.f32454b, aVar.f32453a);
    }

    public static <K, V> tj0<K, V> g() {
        return (tj0<K, V>) go1.f26248h;
    }

    abstract uj0<Map.Entry<K, V>> b();

    abstract uj0<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract qj0<V> d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final uj0<Map.Entry<K, V>> entrySet() {
        uj0<Map.Entry<K, V>> uj0Var = this.f32450b;
        if (uj0Var != null) {
            return uj0Var;
        }
        uj0<Map.Entry<K, V>> b4 = b();
        this.f32450b = b4;
        return b4;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((uj0) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final uj0<K> keySet() {
        uj0<K> uj0Var = this.f32451c;
        if (uj0Var != null) {
            return uj0Var;
        }
        uj0<K> c4 = c();
        this.f32451c = c4;
        return c4;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v4) {
        V v5 = get(obj);
        return v5 != null ? v5 : v4;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final qj0<V> values() {
        qj0<V> qj0Var = this.f32452d;
        if (qj0Var != null) {
            return qj0Var;
        }
        qj0<V> d4 = d();
        this.f32452d = d4;
        return d4;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return lx1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k4, V v4) {
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

    public final String toString() {
        int size = size();
        cq.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z4 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(com.ironsource.cc.f15727T);
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    Object writeReplace() {
        return new b(this);
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }
}
