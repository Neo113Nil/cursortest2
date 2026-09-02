package e;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024a implements Map {

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f464f;

    /* renamed from: g, reason: collision with root package name */
    public static int f465g;

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f466h;

    /* renamed from: i, reason: collision with root package name */
    public static int f467i;

    /* renamed from: b, reason: collision with root package name */
    public int[] f468b = AbstractC0025b.f472a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f469c = AbstractC0025b.f473b;

    /* renamed from: d, reason: collision with root package name */
    public int f470d = 0;

    /* renamed from: e, reason: collision with root package name */
    public B.e f471e;

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
            synchronized (C0024a.class) {
                try {
                    if (f467i < 10) {
                        objArr[0] = f466h;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f466h = objArr;
                        f467i++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0024a.class) {
                try {
                    if (f465g < 10) {
                        objArr[0] = f464f;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f464f = objArr;
                        f465g++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0024a.class) {
                try {
                    Object[] objArr = f466h;
                    if (objArr != null) {
                        this.f469c = objArr;
                        f466h = (Object[]) objArr[0];
                        this.f468b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f467i--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0024a.class) {
                try {
                    Object[] objArr2 = f464f;
                    if (objArr2 != null) {
                        this.f469c = objArr2;
                        f464f = (Object[]) objArr2[0];
                        this.f468b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f465g--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f468b = new int[i2];
        this.f469c = new Object[i2 << 1];
    }

    @Override // java.util.Map
    public final void clear() {
        int i2 = this.f470d;
        if (i2 > 0) {
            int[] iArr = this.f468b;
            Object[] objArr = this.f469c;
            this.f468b = AbstractC0025b.f472a;
            this.f469c = AbstractC0025b.f473b;
            this.f470d = 0;
            c(iArr, objArr, i2);
        }
        if (this.f470d > 0) {
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
        int i3 = this.f470d;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f468b, i3, i2);
        if (b2 < 0) {
            return b2;
        }
        if (obj.equals(this.f469c[b2 << 1])) {
            return b2;
        }
        int i4 = b2 + 1;
        while (i4 < i3 && this.f468b[i4] == i2) {
            if (obj.equals(this.f469c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = b2 - 1; i5 >= 0 && this.f468b[i5] == i2; i5--) {
            if (obj.equals(this.f469c[i5 << 1])) {
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
        if (this.f471e == null) {
            this.f471e = new B.e(this);
        }
        B.e eVar = this.f471e;
        if (((C0027d) eVar.f7a) == null) {
            eVar.f7a = new C0027d(eVar, 0);
        }
        return (C0027d) eVar.f7a;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0024a) {
            C0024a c0024a = (C0024a) obj;
            if (this.f470d != c0024a.f470d) {
                return false;
            }
            for (int i2 = 0; i2 < this.f470d; i2++) {
                try {
                    Object[] objArr = this.f469c;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object orDefault = c0024a.getOrDefault(obj2, null);
                    if (obj3 == null) {
                        if (orDefault != null || !c0024a.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(orDefault)) {
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
            if (this.f470d != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f470d; i4++) {
                try {
                    Object[] objArr2 = this.f469c;
                    int i5 = i4 << 1;
                    Object obj4 = objArr2[i5];
                    Object obj5 = objArr2[i5 + 1];
                    Object obj6 = map.get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !map.containsKey(obj4)) {
                            return false;
                        }
                    } else if (!obj5.equals(obj6)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.f470d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f468b, i2, 0);
        if (b2 < 0) {
            return b2;
        }
        if (this.f469c[b2 << 1] == null) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f468b[i3] == 0) {
            if (this.f469c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f468b[i4] == 0; i4--) {
            if (this.f469c[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int g(Object obj) {
        int i2 = this.f470d * 2;
        Object[] objArr = this.f469c;
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
        return e2 >= 0 ? this.f469c[(e2 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        Object[] objArr = this.f469c;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f470d;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f468b, objArr, i4);
            this.f468b = AbstractC0025b.f472a;
            this.f469c = AbstractC0025b.f473b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f468b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f469c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f469c;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f470d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f468b, 0, i2);
                    System.arraycopy(objArr, 0, this.f469c, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f468b, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f469c, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f470d) {
            throw new ConcurrentModificationException();
        }
        this.f470d = i5;
        return obj;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int[] iArr = this.f468b;
        Object[] objArr = this.f469c;
        int i2 = this.f470d;
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
        return this.f470d <= 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f471e == null) {
            this.f471e = new B.e(this);
        }
        B.e eVar = this.f471e;
        if (((C0027d) eVar.f8b) == null) {
            eVar.f8b = new C0027d(eVar, 1);
        }
        return (C0027d) eVar.f8b;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        int d2;
        int i3 = this.f470d;
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
            Object[] objArr = this.f469c;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~d2;
        int[] iArr = this.f468b;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f469c;
            a(i6);
            if (i3 != this.f470d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f468b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f469c, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f468b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f469c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f470d - i5) << 1);
        }
        int i8 = this.f470d;
        if (i3 == i8) {
            int[] iArr4 = this.f468b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f469c;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f470d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f470d;
        int i2 = this.f470d;
        int[] iArr = this.f468b;
        if (iArr.length < size) {
            Object[] objArr = this.f469c;
            a(size);
            if (this.f470d > 0) {
                System.arraycopy(iArr, 0, this.f468b, 0, i2);
                System.arraycopy(objArr, 0, this.f469c, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f470d != i2) {
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
        Object[] objArr = this.f469c;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f470d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f470d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f470d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = i2 << 1;
            Object obj = this.f469c[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f469c[i3 + 1];
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
        if (this.f471e == null) {
            this.f471e = new B.e(this);
        }
        B.e eVar = this.f471e;
        if (((C0029f) eVar.f9c) == null) {
            eVar.f9c = new C0029f(eVar);
        }
        return (C0029f) eVar.f9c;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object obj3 = this.f469c[(e2 << 1) + 1];
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
        Object obj4 = this.f469c[i2];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        Object[] objArr = this.f469c;
        Object obj5 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
