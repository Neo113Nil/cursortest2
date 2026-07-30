package e;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements Map {

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f96f;

    /* renamed from: g, reason: collision with root package name */
    public static int f97g;

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f98h;

    /* renamed from: i, reason: collision with root package name */
    public static int f99i;

    /* renamed from: b, reason: collision with root package name */
    public int[] f100b = b.f104a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f101c = b.f105b;

    /* renamed from: d, reason: collision with root package name */
    public int f102d = 0;

    /* renamed from: e, reason: collision with root package name */
    public c0.e f103e;

    public static int b(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            try {
                int i7 = iArr[i6];
                if (i7 < i3) {
                    i5 = i6 + 1;
                } else {
                    if (i7 <= i3) {
                        return i6;
                    }
                    i4 = i6 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return ~i5;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                try {
                    if (f99i < 10) {
                        objArr[0] = f98h;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f98h = objArr;
                        f99i++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                try {
                    if (f97g < 10) {
                        objArr[0] = f96f;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f96f = objArr;
                        f97g++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (a.class) {
                try {
                    Object[] objArr = f98h;
                    if (objArr != null) {
                        this.f101c = objArr;
                        f98h = (Object[]) objArr[0];
                        this.f100b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f99i--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (a.class) {
                try {
                    Object[] objArr2 = f96f;
                    if (objArr2 != null) {
                        this.f101c = objArr2;
                        f96f = (Object[]) objArr2[0];
                        this.f100b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f97g--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f100b = new int[i2];
        this.f101c = new Object[i2 << 1];
    }

    @Override // java.util.Map
    public final void clear() {
        int i2 = this.f102d;
        if (i2 > 0) {
            int[] iArr = this.f100b;
            Object[] objArr = this.f101c;
            this.f100b = b.f104a;
            this.f101c = b.f105b;
            this.f102d = 0;
            c(iArr, objArr, i2);
        }
        if (this.f102d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f102d;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f100b, i3, i2);
        if (b2 < 0 || obj.equals(this.f101c[b2 << 1])) {
            return b2;
        }
        int i4 = b2 + 1;
        while (i4 < i3 && this.f100b[i4] == i2) {
            if (obj.equals(this.f101c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = b2 - 1; i5 >= 0 && this.f100b[i5] == i2; i5--) {
            if (obj.equals(this.f101c[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f103e == null) {
            this.f103e = new c0.e(this);
        }
        c0.e eVar = this.f103e;
        if (((d) eVar.f70a) == null) {
            eVar.f70a = new d(eVar, 0);
        }
        return (d) eVar.f70a;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        int i2;
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f102d == aVar.f102d) {
                for (0; i3 < this.f102d; i3 + 1) {
                    Object[] objArr = this.f101c;
                    int i4 = i3 << 1;
                    Object obj2 = objArr[i4];
                    Object obj3 = objArr[i4 + 1];
                    Object orDefault = aVar.getOrDefault(obj2, null);
                    if (obj3 == null) {
                        i3 = (orDefault == null && aVar.containsKey(obj2)) ? i3 + 1 : 0;
                    } else if (obj3.equals(orDefault)) {
                    }
                }
                return true;
            }
            return false;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f102d == map.size()) {
                for (0; i2 < this.f102d; i2 + 1) {
                    Object[] objArr2 = this.f101c;
                    int i5 = i2 << 1;
                    Object obj4 = objArr2[i5];
                    Object obj5 = objArr2[i5 + 1];
                    Object obj6 = map.get(obj4);
                    if (obj5 == null) {
                        i2 = (obj6 == null && map.containsKey(obj4)) ? i2 + 1 : 0;
                    } else if (obj5.equals(obj6)) {
                    }
                }
                return true;
            }
        }
        return false;
        return false;
    }

    public final int f() {
        int i2 = this.f102d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f100b, i2, 0);
        if (b2 < 0 || this.f101c[b2 << 1] == null) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f100b[i3] == 0) {
            if (this.f101c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f100b[i4] == 0; i4--) {
            if (this.f101c[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int g(Object obj) {
        int i2 = this.f102d * 2;
        Object[] objArr = this.f101c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        return e2 >= 0 ? this.f101c[(e2 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        Object[] objArr = this.f101c;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f102d;
        int[] iArr = this.f100b;
        int i5 = 0;
        if (i4 <= 1) {
            c(iArr, objArr, i4);
            this.f100b = b.f104a;
            this.f101c = b.f105b;
        } else {
            int i6 = i4 - 1;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f101c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f101c;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f102d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f100b, 0, i2);
                    System.arraycopy(objArr, 0, this.f101c, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f100b, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f101c, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f102d) {
            throw new ConcurrentModificationException();
        }
        this.f102d = i5;
        return obj;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int[] iArr = this.f100b;
        Object[] objArr = this.f101c;
        int i2 = this.f102d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f102d <= 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f103e == null) {
            this.f103e = new c0.e(this);
        }
        c0.e eVar = this.f103e;
        if (((d) eVar.f71b) == null) {
            eVar.f71b = new d(eVar, 1);
        }
        return (d) eVar.f71b;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        int d2;
        int i3 = this.f102d;
        if (obj == null) {
            d2 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            int i4 = (d2 << 1) + 1;
            Object[] objArr = this.f101c;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~d2;
        int[] iArr = this.f100b;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f101c;
            a(i6);
            if (i3 != this.f102d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f100b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f101c, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f100b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f101c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f102d - i5) << 1);
        }
        int i8 = this.f102d;
        if (i3 == i8) {
            int[] iArr4 = this.f100b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f101c;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f102d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f102d;
        int i2 = this.f102d;
        int[] iArr = this.f100b;
        if (iArr.length < size) {
            Object[] objArr = this.f101c;
            a(size);
            if (this.f102d > 0) {
                System.arraycopy(iArr, 0, this.f100b, 0, i2);
                System.arraycopy(objArr, 0, this.f101c, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f102d != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object obj3 = this.f101c[(e2 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        h(e2);
        return true;
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        int i2 = (e2 << 1) + 1;
        Object obj4 = this.f101c[i2];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        Object[] objArr = this.f101c;
        Object obj5 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f102d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f102d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f102d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = i2 << 1;
            Object obj = this.f101c[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f101c[i3 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f103e == null) {
            this.f103e = new c0.e(this);
        }
        c0.e eVar = this.f103e;
        if (((f) eVar.f72c) == null) {
            eVar.f72c = new f(eVar);
        }
        return (f) eVar.f72c;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return h(e2);
        }
        return null;
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f101c;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }
}
