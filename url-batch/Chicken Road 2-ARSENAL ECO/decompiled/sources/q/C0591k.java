package q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: q.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0591k {

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f5738i;

    /* renamed from: j, reason: collision with root package name */
    public static int f5739j;

    /* renamed from: k, reason: collision with root package name */
    public static Object[] f5740k;

    /* renamed from: l, reason: collision with root package name */
    public static int f5741l;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5742f = AbstractC0584d.f5714a;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5743g = AbstractC0584d.f5715b;

    /* renamed from: h, reason: collision with root package name */
    public int f5744h = 0;

    public static void b(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (C0591k.class) {
                try {
                    if (f5741l < 10) {
                        objArr[0] = f5740k;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f5740k = objArr;
                        f5741l++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0591k.class) {
                try {
                    if (f5739j < 10) {
                        objArr[0] = f5738i;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f5738i = objArr;
                        f5739j++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (C0591k.class) {
                try {
                    Object[] objArr = f5740k;
                    if (objArr != null) {
                        this.f5743g = objArr;
                        f5740k = (Object[]) objArr[0];
                        this.f5742f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5741l--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (C0591k.class) {
                try {
                    Object[] objArr2 = f5738i;
                    if (objArr2 != null) {
                        this.f5743g = objArr2;
                        f5738i = (Object[]) objArr2[0];
                        this.f5742f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5739j--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5742f = new int[i7];
        this.f5743g = new Object[i7 << 1];
    }

    public final int c(int i7, Object obj) {
        int i8 = this.f5744h;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a7 = AbstractC0584d.a(i8, i7, this.f5742f);
            if (a7 < 0 || obj.equals(this.f5743g[a7 << 1])) {
                return a7;
            }
            int i9 = a7 + 1;
            while (i9 < i8 && this.f5742f[i9] == i7) {
                if (obj.equals(this.f5743g[i9 << 1])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a7 - 1; i10 >= 0 && this.f5742f[i10] == i7; i10--) {
                if (obj.equals(this.f5743g[i10 << 1])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i7 = this.f5744h;
        if (i7 > 0) {
            int[] iArr = this.f5742f;
            Object[] objArr = this.f5743g;
            this.f5742f = AbstractC0584d.f5714a;
            this.f5743g = AbstractC0584d.f5715b;
            this.f5744h = 0;
            b(iArr, objArr, i7);
        }
        if (this.f5744h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f5744h;
        if (i7 == 0) {
            return -1;
        }
        try {
            int a7 = AbstractC0584d.a(i7, 0, this.f5742f);
            if (a7 < 0 || this.f5743g[a7 << 1] == null) {
                return a7;
            }
            int i8 = a7 + 1;
            while (i8 < i7 && this.f5742f[i8] == 0) {
                if (this.f5743g[i8 << 1] == null) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = a7 - 1; i9 >= 0 && this.f5742f[i9] == 0; i9--) {
                if (this.f5743g[i9 << 1] == null) {
                    return i9;
                }
            }
            return ~i8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        int i7;
        int i8;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0591k) {
            C0591k c0591k = (C0591k) obj;
            if (this.f5744h == c0591k.f5744h) {
                for (0; i8 < this.f5744h; i8 + 1) {
                    Object[] objArr = this.f5743g;
                    int i9 = i8 << 1;
                    Object obj2 = objArr[i9];
                    Object obj3 = objArr[i9 + 1];
                    Object orDefault = c0591k.getOrDefault(obj2, null);
                    if (obj3 == null) {
                        i8 = (orDefault == null && c0591k.containsKey(obj2)) ? i8 + 1 : 0;
                    } else if (obj3.equals(orDefault)) {
                    }
                }
                return true;
            }
            return false;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5744h == map.size()) {
                for (0; i7 < this.f5744h; i7 + 1) {
                    Object[] objArr2 = this.f5743g;
                    int i10 = i7 << 1;
                    Object obj4 = objArr2[i10];
                    Object obj5 = objArr2[i10 + 1];
                    Object obj6 = map.get(obj4);
                    if (obj5 == null) {
                        i7 = (obj6 == null && map.containsKey(obj4)) ? i7 + 1 : 0;
                    } else if (obj5.equals(obj6)) {
                    }
                }
                return true;
            }
        }
        return false;
        return false;
    }

    public final int f(Object obj) {
        int i7 = this.f5744h * 2;
        Object[] objArr = this.f5743g;
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

    public final Object g(int i7) {
        Object[] objArr = this.f5743g;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f5744h;
        int i10 = 0;
        if (i9 <= 1) {
            b(this.f5742f, objArr, i9);
            this.f5742f = AbstractC0584d.f5714a;
            this.f5743g = AbstractC0584d.f5715b;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f5742f;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f5743g;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f5743g;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f5744h) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f5742f, 0, i7);
                    System.arraycopy(objArr, 0, this.f5743g, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f5742f, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f5743g, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f5744h) {
            throw new ConcurrentModificationException();
        }
        this.f5744h = i10;
        return obj;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d7 = d(obj);
        return d7 >= 0 ? this.f5743g[(d7 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f5742f;
        Object[] objArr = this.f5743g;
        int i7 = this.f5744h;
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

    public final boolean isEmpty() {
        return this.f5744h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int c7;
        int i8 = this.f5744h;
        if (obj == null) {
            c7 = e();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            c7 = c(hashCode, obj);
        }
        if (c7 >= 0) {
            int i9 = (c7 << 1) + 1;
            Object[] objArr = this.f5743g;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~c7;
        int[] iArr = this.f5742f;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f5743g;
            a(i11);
            if (i8 != this.f5744h) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5742f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5743g, 0, objArr2.length);
            }
            b(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f5742f;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f5743g;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f5744h - i10) << 1);
        }
        int i13 = this.f5744h;
        if (i8 == i13) {
            int[] iArr4 = this.f5742f;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f5743g;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f5744h = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int d7 = d(obj);
        if (d7 >= 0) {
            return g(d7);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d7 = d(obj);
        if (d7 < 0) {
            return null;
        }
        int i7 = (d7 << 1) + 1;
        Object[] objArr = this.f5743g;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f5744h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5744h * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f5744h; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = i7 << 1;
            Object obj = this.f5743g[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f5743g[i8 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d7 = d(obj);
        if (d7 < 0) {
            return false;
        }
        Object obj3 = this.f5743g[(d7 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        g(d7);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d7 = d(obj);
        if (d7 < 0) {
            return false;
        }
        int i7 = (d7 << 1) + 1;
        Object obj4 = this.f5743g[i7];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        Object[] objArr = this.f5743g;
        Object obj5 = objArr[i7];
        objArr[i7] = obj3;
        return true;
    }
}
