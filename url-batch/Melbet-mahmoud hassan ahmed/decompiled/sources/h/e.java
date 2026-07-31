package h;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: i, reason: collision with root package name */
    static Object[] f16715i;

    /* renamed from: j, reason: collision with root package name */
    static int f16716j;

    /* renamed from: k, reason: collision with root package name */
    static Object[] f16717k;

    /* renamed from: l, reason: collision with root package name */
    static int f16718l;

    /* renamed from: f, reason: collision with root package name */
    int[] f16719f;

    /* renamed from: g, reason: collision with root package name */
    Object[] f16720g;

    /* renamed from: h, reason: collision with root package name */
    int f16721h;

    public e() {
        this.f16719f = c.f16697a;
        this.f16720g = c.f16699c;
        this.f16721h = 0;
    }

    public e(int i7) {
        if (i7 == 0) {
            this.f16719f = c.f16697a;
            this.f16720g = c.f16699c;
        } else {
            a(i7);
        }
        this.f16721h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(e<K, V> eVar) {
        this();
        if (eVar != 0) {
            j(eVar);
        }
    }

    private void a(int i7) {
        if (i7 == 8) {
            synchronized (e.class) {
                Object[] objArr = f16717k;
                if (objArr != null) {
                    this.f16720g = objArr;
                    f16717k = (Object[]) objArr[0];
                    this.f16719f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16718l--;
                    return;
                }
            }
        } else if (i7 == 4) {
            synchronized (e.class) {
                Object[] objArr2 = f16715i;
                if (objArr2 != null) {
                    this.f16720g = objArr2;
                    f16715i = (Object[]) objArr2[0];
                    this.f16719f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16716j--;
                    return;
                }
            }
        }
        this.f16719f = new int[i7];
        this.f16720g = new Object[i7 << 1];
    }

    private static int b(int[] iArr, int i7, int i8) {
        try {
            return c.a(iArr, i7, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (e.class) {
                if (f16718l < 10) {
                    objArr[0] = f16717k;
                    objArr[1] = iArr;
                    for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f16717k = objArr;
                    f16718l++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (e.class) {
                if (f16716j < 10) {
                    objArr[0] = f16715i;
                    objArr[1] = iArr;
                    for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f16715i = objArr;
                    f16716j++;
                }
            }
        }
    }

    public void c(int i7) {
        int i8 = this.f16721h;
        int[] iArr = this.f16719f;
        if (iArr.length < i7) {
            Object[] objArr = this.f16720g;
            a(i7);
            if (this.f16721h > 0) {
                System.arraycopy(iArr, 0, this.f16719f, 0, i8);
                System.arraycopy(objArr, 0, this.f16720g, 0, i8 << 1);
            }
            d(iArr, objArr, i8);
        }
        if (this.f16721h != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i7 = this.f16721h;
        if (i7 > 0) {
            int[] iArr = this.f16719f;
            Object[] objArr = this.f16720g;
            this.f16719f = c.f16697a;
            this.f16720g = c.f16699c;
            this.f16721h = 0;
            d(iArr, objArr, i7);
        }
        if (this.f16721h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i7) {
        int i8 = this.f16721h;
        if (i8 == 0) {
            return -1;
        }
        int b7 = b(this.f16719f, i8, i7);
        if (b7 < 0 || obj.equals(this.f16720g[b7 << 1])) {
            return b7;
        }
        int i9 = b7 + 1;
        while (i9 < i8 && this.f16719f[i9] == i7) {
            if (obj.equals(this.f16720g[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = b7 - 1; i10 >= 0 && this.f16719f[i10] == i7; i10--) {
            if (obj.equals(this.f16720g[i10 << 1])) {
                return i10;
            }
        }
        return i9 ^ (-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f16721h; i7++) {
                try {
                    K i8 = i(i7);
                    V m7 = m(i7);
                    Object obj2 = eVar.get(i8);
                    if (m7 == null) {
                        if (obj2 != null || !eVar.containsKey(i8)) {
                            return false;
                        }
                    } else if (!m7.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f16721h; i9++) {
                try {
                    K i10 = i(i9);
                    V m8 = m(i9);
                    Object obj3 = map.get(i10);
                    if (m8 == null) {
                        if (obj3 != null || !map.containsKey(i10)) {
                            return false;
                        }
                    } else if (!m8.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i7 = this.f16721h;
        if (i7 == 0) {
            return -1;
        }
        int b7 = b(this.f16719f, i7, 0);
        if (b7 < 0 || this.f16720g[b7 << 1] == null) {
            return b7;
        }
        int i8 = b7 + 1;
        while (i8 < i7 && this.f16719f[i8] == 0) {
            if (this.f16720g[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = b7 - 1; i9 >= 0 && this.f16719f[i9] == 0; i9--) {
            if (this.f16720g[i9 << 1] == null) {
                return i9;
            }
        }
        return i8 ^ (-1);
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v6) {
        int f7 = f(obj);
        return f7 >= 0 ? (V) this.f16720g[(f7 << 1) + 1] : v6;
    }

    int h(Object obj) {
        int i7 = this.f16721h * 2;
        Object[] objArr = this.f16720g;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f16719f;
        Object[] objArr = this.f16720g;
        int i7 = this.f16721h;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public K i(int i7) {
        return (K) this.f16720g[i7 << 1];
    }

    public boolean isEmpty() {
        return this.f16721h <= 0;
    }

    public void j(e<? extends K, ? extends V> eVar) {
        int i7 = eVar.f16721h;
        c(this.f16721h + i7);
        if (this.f16721h != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(eVar.i(i8), eVar.m(i8));
            }
        } else if (i7 > 0) {
            System.arraycopy(eVar.f16719f, 0, this.f16719f, 0, i7);
            System.arraycopy(eVar.f16720g, 0, this.f16720g, 0, i7 << 1);
            this.f16721h = i7;
        }
    }

    public V k(int i7) {
        Object[] objArr = this.f16720g;
        int i8 = i7 << 1;
        V v6 = (V) objArr[i8 + 1];
        int i9 = this.f16721h;
        int i10 = 0;
        if (i9 <= 1) {
            d(this.f16719f, objArr, i9);
            this.f16719f = c.f16697a;
            this.f16720g = c.f16699c;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f16719f;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f16720g;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f16720g;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f16721h) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f16719f, 0, i7);
                    System.arraycopy(objArr, 0, this.f16720g, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f16719f, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f16720g, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f16721h) {
            throw new ConcurrentModificationException();
        }
        this.f16721h = i10;
        return v6;
    }

    public V l(int i7, V v6) {
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f16720g;
        V v7 = (V) objArr[i8];
        objArr[i8] = v6;
        return v7;
    }

    public V m(int i7) {
        return (V) this.f16720g[(i7 << 1) + 1];
    }

    public V put(K k7, V v6) {
        int i7;
        int e7;
        int i8 = this.f16721h;
        if (k7 == null) {
            e7 = g();
            i7 = 0;
        } else {
            int hashCode = k7.hashCode();
            i7 = hashCode;
            e7 = e(k7, hashCode);
        }
        if (e7 >= 0) {
            int i9 = (e7 << 1) + 1;
            Object[] objArr = this.f16720g;
            V v7 = (V) objArr[i9];
            objArr[i9] = v6;
            return v7;
        }
        int i10 = e7 ^ (-1);
        int[] iArr = this.f16719f;
        if (i8 >= iArr.length) {
            int i11 = 4;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 >= 4) {
                i11 = 8;
            }
            Object[] objArr2 = this.f16720g;
            a(i11);
            if (i8 != this.f16721h) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16719f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f16720g, 0, objArr2.length);
            }
            d(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f16719f;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f16720g;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f16721h - i10) << 1);
        }
        int i13 = this.f16721h;
        if (i8 == i13) {
            int[] iArr4 = this.f16719f;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f16720g;
                int i14 = i10 << 1;
                objArr4[i14] = k7;
                objArr4[i14 + 1] = v6;
                this.f16721h = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k7, V v6) {
        V v7 = get(k7);
        return v7 == null ? put(k7, v6) : v7;
    }

    public V remove(Object obj) {
        int f7 = f(obj);
        if (f7 >= 0) {
            return k(f7);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f7 = f(obj);
        if (f7 < 0) {
            return false;
        }
        V m7 = m(f7);
        if (obj2 != m7 && (obj2 == null || !obj2.equals(m7))) {
            return false;
        }
        k(f7);
        return true;
    }

    public V replace(K k7, V v6) {
        int f7 = f(k7);
        if (f7 >= 0) {
            return l(f7, v6);
        }
        return null;
    }

    public boolean replace(K k7, V v6, V v7) {
        int f7 = f(k7);
        if (f7 < 0) {
            return false;
        }
        V m7 = m(f7);
        if (m7 != v6 && (v6 == null || !v6.equals(m7))) {
            return false;
        }
        l(f7, v7);
        return true;
    }

    public int size() {
        return this.f16721h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16721h * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f16721h; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            K i8 = i(i7);
            if (i8 != this) {
                sb.append(i8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m7 = m(i7);
            if (m7 != this) {
                sb.append(m7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
