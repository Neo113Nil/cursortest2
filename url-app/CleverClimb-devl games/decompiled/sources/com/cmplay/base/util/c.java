package com.cmplay.base.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import libcore.util.EmptyArray;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public final class c<K, V> implements Map<K, V> {

    /* renamed from: b, reason: collision with root package name */
    static Object[] f3965b;

    /* renamed from: c, reason: collision with root package name */
    static int f3966c;

    /* renamed from: d, reason: collision with root package name */
    static Object[] f3967d;
    static int e;
    int[] g = EmptyArray.INT;
    Object[] h = EmptyArray.OBJECT;
    int i = 0;
    o<K, V> j;

    /* renamed from: a, reason: collision with root package name */
    public static final c f3964a = new c(true);
    static final int[] f = new int[0];

    int a(Object obj, int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return -1;
        }
        int a2 = k.a(this.g, i2, i);
        if (a2 < 0 || obj.equals(this.h[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.g[i3] == i) {
            if (obj.equals(this.h[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.g[i4] == i; i4--) {
            if (obj.equals(this.h[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    int a() {
        int i = this.i;
        if (i == 0) {
            return -1;
        }
        int a2 = k.a(this.g, i, 0);
        if (a2 < 0 || this.h[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.g[i2] == 0) {
            if (this.h[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a2 - 1; i3 >= 0 && this.g[i3] == 0; i3--) {
            if (this.h[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    private void e(int i) {
        if (this.g == f) {
            throw new UnsupportedOperationException("ArrayMap is immutable");
        }
        if (i == 8) {
            synchronized (c.class) {
                if (f3967d != null) {
                    Object[] objArr = f3967d;
                    this.h = objArr;
                    f3967d = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                if (f3965b != null) {
                    Object[] objArr2 = f3965b;
                    this.h = objArr2;
                    f3965b = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3966c--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.h = new Object[i << 1];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (e < 10) {
                    objArr[0] = f3967d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3967d = objArr;
                    e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                if (f3966c < 10) {
                    objArr[0] = f3965b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3965b = objArr;
                    f3966c++;
                }
            }
        }
    }

    public c() {
    }

    private c(boolean z) {
    }

    @Override // java.util.Map
    public void clear() {
        if (this.i > 0) {
            a(this.g, this.h, this.i);
            this.g = EmptyArray.INT;
            this.h = EmptyArray.OBJECT;
            this.i = 0;
        }
    }

    public void a(int i) {
        if (this.g.length < i) {
            int[] iArr = this.g;
            Object[] objArr = this.h;
            e(i);
            if (this.i > 0) {
                System.arraycopy(iArr, 0, this.g, 0, this.i);
                System.arraycopy(objArr, 0, this.h, 0, this.i << 1);
            }
            a(iArr, objArr, this.i);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int b(Object obj) {
        int i = this.i * 2;
        Object[] objArr = this.h;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return (V) this.h[(a2 << 1) + 1];
        }
        return null;
    }

    public K b(int i) {
        return (K) this.h[i << 1];
    }

    public V c(int i) {
        return (V) this.h[(i << 1) + 1];
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.h[i2];
        this.h[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.i <= 0;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        int i;
        int a2;
        if (k == null) {
            a2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            a2 = a(k, hashCode);
        }
        if (a2 >= 0) {
            int i2 = (a2 << 1) + 1;
            V v2 = (V) this.h[i2];
            this.h[i2] = v;
            return v2;
        }
        int i3 = a2 ^ (-1);
        if (this.i >= this.g.length) {
            int i4 = 4;
            if (this.i >= 8) {
                i4 = (this.i >> 1) + this.i;
            } else if (this.i >= 4) {
                i4 = 8;
            }
            int[] iArr = this.g;
            Object[] objArr = this.h;
            e(i4);
            if (this.g.length > 0) {
                System.arraycopy(iArr, 0, this.g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.h, 0, objArr.length);
            }
            a(iArr, objArr, this.i);
        }
        if (i3 < this.i) {
            int i5 = i3 + 1;
            System.arraycopy(this.g, i3, this.g, i5, this.i - i3);
            System.arraycopy(this.h, i3 << 1, this.h, i5 << 1, (this.i - i3) << 1);
        }
        this.g[i3] = i;
        int i6 = i3 << 1;
        this.h[i6] = k;
        this.h[i6 + 1] = v;
        this.i++;
        return null;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return d(a2);
        }
        return null;
    }

    public V d(int i) {
        int i2 = i << 1;
        V v = (V) this.h[i2 + 1];
        if (this.i <= 1) {
            a(this.g, this.h, this.i);
            this.g = EmptyArray.INT;
            this.h = EmptyArray.OBJECT;
            this.i = 0;
        } else {
            int i3 = 8;
            if (this.g.length > 8 && this.i < this.g.length / 3) {
                if (this.i > 8) {
                    i3 = (this.i >> 1) + this.i;
                }
                int[] iArr = this.g;
                Object[] objArr = this.h;
                e(i3);
                this.i--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.g, 0, i);
                    System.arraycopy(objArr, 0, this.h, 0, i2);
                }
                if (i < this.i) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.g, i, this.i - i);
                    System.arraycopy(objArr, i4 << 1, this.h, i2, (this.i - i) << 1);
                }
            } else {
                this.i--;
                if (i < this.i) {
                    int i5 = i + 1;
                    System.arraycopy(this.g, i5, this.g, i, this.i - i);
                    System.arraycopy(this.h, i5 << 1, this.h, i2, (this.i - i) << 1);
                }
                this.h[this.i << 1] = null;
                this.h[(this.i << 1) + 1] = null;
            }
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.i;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i = 0; i < this.i; i++) {
            try {
                K b2 = b(i);
                V c2 = c(i);
                Object obj2 = map.get(b2);
                if (c2 == null) {
                    if (obj2 != null || !map.containsKey(b2)) {
                        return false;
                    }
                } else if (!c2.equals(obj2)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.h;
        int i = this.i;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            Object obj = objArr[i3];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i3 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        for (int i = 0; i < this.i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private o<K, V> b() {
        if (this.j == null) {
            this.j = new o<K, V>() { // from class: com.cmplay.base.util.c.1
                @Override // com.cmplay.base.util.o
                protected int a() {
                    return c.this.i;
                }

                @Override // com.cmplay.base.util.o
                protected Object a(int i, int i2) {
                    return c.this.h[(i << 1) + i2];
                }

                @Override // com.cmplay.base.util.o
                protected int a(Object obj) {
                    return c.this.a(obj);
                }

                @Override // com.cmplay.base.util.o
                protected int b(Object obj) {
                    return c.this.b(obj);
                }

                @Override // com.cmplay.base.util.o
                protected Map<K, V> b() {
                    return c.this;
                }

                @Override // com.cmplay.base.util.o
                protected void a(K k, V v) {
                    c.this.put(k, v);
                }

                @Override // com.cmplay.base.util.o
                protected V a(int i, V v) {
                    return (V) c.this.a(i, (int) v);
                }

                @Override // com.cmplay.base.util.o
                protected void a(int i) {
                    c.this.d(i);
                }

                @Override // com.cmplay.base.util.o
                protected void c() {
                    c.this.clear();
                }
            };
        }
        return this.j;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.i + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
