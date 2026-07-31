package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class n63<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f8955o = new Object();

    /* renamed from: f, reason: collision with root package name */
    private transient Object f8956f;

    /* renamed from: g, reason: collision with root package name */
    transient int[] f8957g;

    /* renamed from: h, reason: collision with root package name */
    transient Object[] f8958h;

    /* renamed from: i, reason: collision with root package name */
    transient Object[] f8959i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f8960j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f8961k;

    /* renamed from: l, reason: collision with root package name */
    private transient Set<K> f8962l;

    /* renamed from: m, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f8963m;

    /* renamed from: n, reason: collision with root package name */
    private transient Collection<V> f8964n;

    n63() {
        s(3);
    }

    n63(int i7) {
        s(8);
    }

    private final int A(int i7, int i8, int i9, int i10) {
        Object d7 = o63.d(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            o63.e(d7, i9 & i11, i10 + 1);
        }
        Object obj = this.f8956f;
        obj.getClass();
        int[] a7 = a();
        for (int i12 = 0; i12 <= i7; i12++) {
            int c7 = o63.c(obj, i12);
            while (c7 != 0) {
                int i13 = c7 - 1;
                int i14 = a7[i13];
                int i15 = ((i7 ^ (-1)) & i14) | i12;
                int i16 = i15 & i11;
                int c8 = o63.c(d7, i16);
                o63.e(d7, i16, c7);
                a7[i13] = ((i11 ^ (-1)) & i15) | (c8 & i11);
                c7 = i14 & i7;
            }
        }
        this.f8956f = d7;
        C(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(Object obj) {
        if (u()) {
            return f8955o;
        }
        int y6 = y();
        Object obj2 = this.f8956f;
        obj2.getClass();
        int b7 = o63.b(obj, null, y6, obj2, a(), b(), null);
        if (b7 == -1) {
            return f8955o;
        }
        Object obj3 = c()[b7];
        t(b7, y6);
        this.f8961k--;
        r();
        return obj3;
    }

    private final void C(int i7) {
        this.f8960j = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.f8960j & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f8957g;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f8958h;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f8959i;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ Object j(n63 n63Var, int i7) {
        return n63Var.b()[i7];
    }

    static /* synthetic */ Object l(n63 n63Var) {
        Object obj = n63Var.f8956f;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ Object m(n63 n63Var, int i7) {
        return n63Var.c()[i7];
    }

    static /* synthetic */ void q(n63 n63Var, int i7, Object obj) {
        n63Var.c()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int y() {
        return (1 << (this.f8960j & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(Object obj) {
        if (u()) {
            return -1;
        }
        int b7 = w63.b(obj);
        int y6 = y();
        Object obj2 = this.f8956f;
        obj2.getClass();
        int c7 = o63.c(obj2, b7 & y6);
        if (c7 != 0) {
            int i7 = y6 ^ (-1);
            int i8 = b7 & i7;
            do {
                int i9 = c7 - 1;
                int i10 = a()[i9];
                if ((i10 & i7) == i8 && m43.a(obj, b()[i9])) {
                    return i9;
                }
                c7 = i10 & y6;
            } while (c7 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        r();
        Map<K, V> o7 = o();
        if (o7 != null) {
            this.f8960j = o93.a(size(), 3, 1073741823);
            o7.clear();
            this.f8956f = null;
        } else {
            Arrays.fill(b(), 0, this.f8961k, (Object) null);
            Arrays.fill(c(), 0, this.f8961k, (Object) null);
            Object obj = this.f8956f;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(a(), 0, this.f8961k, 0);
        }
        this.f8961k = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> o7 = o();
        return o7 != null ? o7.containsKey(obj) : z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> o7 = o();
        if (o7 != null) {
            return o7.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f8961k; i7++) {
            if (m43.a(obj, c()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f8963m;
        if (set != null) {
            return set;
        }
        g63 g63Var = new g63(this);
        this.f8963m = g63Var;
        return g63Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> o7 = o();
        if (o7 != null) {
            return o7.get(obj);
        }
        int z6 = z(obj);
        if (z6 == -1) {
            return null;
        }
        return (V) c()[z6];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    final int i(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f8961k) {
            return i8;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f8962l;
        if (set != null) {
            return set;
        }
        j63 j63Var = new j63(this);
        this.f8962l = j63Var;
        return j63Var;
    }

    final Map<K, V> o() {
        Object obj = this.f8956f;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k7, V v6) {
        int length;
        int min;
        if (u()) {
            q43.g(u(), "Arrays already allocated");
            int i7 = this.f8960j;
            int max = Math.max(i7 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f8956f = o63.d(max2);
            C(max2 - 1);
            this.f8957g = new int[i7];
            this.f8958h = new Object[i7];
            this.f8959i = new Object[i7];
        }
        Map<K, V> o7 = o();
        if (o7 != null) {
            return o7.put(k7, v6);
        }
        int[] a7 = a();
        Object[] b7 = b();
        Object[] c7 = c();
        int i8 = this.f8961k;
        int i9 = i8 + 1;
        int b8 = w63.b(k7);
        int y6 = y();
        int i10 = b8 & y6;
        Object obj = this.f8956f;
        obj.getClass();
        int c8 = o63.c(obj, i10);
        if (c8 == 0) {
            if (i9 <= y6) {
                Object obj2 = this.f8956f;
                obj2.getClass();
                o63.e(obj2, i10, i9);
                length = a().length;
                if (i9 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    this.f8957g = Arrays.copyOf(a(), min);
                    this.f8958h = Arrays.copyOf(b(), min);
                    this.f8959i = Arrays.copyOf(c(), min);
                }
                a()[i8] = (y6 ^ (-1)) & b8;
                b()[i8] = k7;
                c()[i8] = v6;
                this.f8961k = i9;
                r();
                return null;
            }
            y6 = A(y6, o63.a(y6), b8, i8);
            length = a().length;
            if (i9 > length) {
                this.f8957g = Arrays.copyOf(a(), min);
                this.f8958h = Arrays.copyOf(b(), min);
                this.f8959i = Arrays.copyOf(c(), min);
            }
            a()[i8] = (y6 ^ (-1)) & b8;
            b()[i8] = k7;
            c()[i8] = v6;
            this.f8961k = i9;
            r();
            return null;
        }
        int i11 = y6 ^ (-1);
        int i12 = b8 & i11;
        int i13 = 0;
        while (true) {
            int i14 = c8 - 1;
            int i15 = a7[i14];
            int i16 = i15 & i11;
            if (i16 == i12 && m43.a(k7, b7[i14])) {
                V v7 = (V) c7[i14];
                c7[i14] = v6;
                return v7;
            }
            int i17 = i15 & y6;
            i13++;
            if (i17 != 0) {
                c8 = i17;
            } else {
                if (i13 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(y() + 1, 1.0f);
                    int h7 = h();
                    while (h7 >= 0) {
                        linkedHashMap.put(b()[h7], c()[h7]);
                        h7 = i(h7);
                    }
                    this.f8956f = linkedHashMap;
                    this.f8957g = null;
                    this.f8958h = null;
                    this.f8959i = null;
                    r();
                    return (V) linkedHashMap.put(k7, v6);
                }
                if (i9 <= y6) {
                    a7[i14] = (i9 & y6) | i16;
                }
            }
        }
    }

    final void r() {
        this.f8960j += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> o7 = o();
        if (o7 != null) {
            return o7.remove(obj);
        }
        V v6 = (V) B(obj);
        if (v6 == f8955o) {
            return null;
        }
        return v6;
    }

    final void s(int i7) {
        this.f8960j = o93.a(i7, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> o7 = o();
        return o7 != null ? o7.size() : this.f8961k;
    }

    final void t(int i7, int i8) {
        Object obj = this.f8956f;
        obj.getClass();
        int[] a7 = a();
        Object[] b7 = b();
        Object[] c7 = c();
        int size = size() - 1;
        if (i7 >= size) {
            b7[i7] = null;
            c7[i7] = null;
            a7[i7] = 0;
            return;
        }
        Object obj2 = b7[size];
        b7[i7] = obj2;
        c7[i7] = c7[size];
        b7[size] = null;
        c7[size] = null;
        a7[i7] = a7[size];
        a7[size] = 0;
        int b8 = w63.b(obj2) & i8;
        int c8 = o63.c(obj, b8);
        int i9 = size + 1;
        if (c8 == i9) {
            o63.e(obj, b8, i7 + 1);
            return;
        }
        while (true) {
            int i10 = c8 - 1;
            int i11 = a7[i10];
            int i12 = i11 & i8;
            if (i12 == i9) {
                a7[i10] = ((i7 + 1) & i8) | (i11 & (i8 ^ (-1)));
                return;
            }
            c8 = i12;
        }
    }

    final boolean u() {
        return this.f8956f == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f8964n;
        if (collection != null) {
            return collection;
        }
        m63 m63Var = new m63(this);
        this.f8964n = m63Var;
        return m63Var;
    }
}
