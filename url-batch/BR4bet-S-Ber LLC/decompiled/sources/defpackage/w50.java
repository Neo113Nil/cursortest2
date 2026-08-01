package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class w50 {
    public int[] f;
    public Object[] g;
    public int h;

    public w50(int i) {
        this.f = i == 0 ? xf.g : new int[i];
        this.g = i == 0 ? xf.h : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.h * 2;
        Object[] objArr = this.g;
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

    public final void b(int i) {
        int i2 = this.h;
        int[] iArr = this.f;
        if (iArr.length < i) {
            this.f = Arrays.copyOf(iArr, i);
            this.g = Arrays.copyOf(this.g, i * 2);
        }
        if (this.h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int f = xf.f(i2, i, this.f);
        if (f < 0 || kr.b(obj, this.g[f << 1])) {
            return f;
        }
        int i3 = f + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (kr.b(obj, this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = f - 1; i4 >= 0 && this.f[i4] == i; i4--) {
            if (kr.b(obj, this.g[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.h > 0) {
            this.f = xf.g;
            this.g = xf.h;
            this.h = 0;
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int f = xf.f(i, 0, this.f);
        if (f < 0 || this.g[f << 1] == null) {
            return f;
        }
        int i2 = f + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = f - 1; i3 >= 0 && this.f[i3] == 0; i3--) {
            if (this.g[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof w50) {
                int i = this.h;
                if (i != ((w50) obj).h) {
                    return false;
                }
                w50 w50Var = (w50) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = w50Var.get(f);
                    if (i3 == null) {
                        if (obj2 != null || !w50Var.containsKey(f)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.h;
            for (int i5 = 0; i5 < i4; i5++) {
                Object f2 = f(i5);
                Object i6 = i(i5);
                Object obj3 = ((Map) obj).get(f2);
                if (i6 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!i6.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.h) {
            return this.g[i << 1];
        }
        g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.g;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                a7.X(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.g;
                a7.Z(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.g;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f = Arrays.copyOf(iArr, i7);
            this.g = Arrays.copyOf(this.g, i7 << 1);
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                a7.X(0, 0, i, iArr, this.f);
                a7.Z(objArr, this.g, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                a7.X(i, i8, i2, iArr, this.f);
                a7.Z(objArr, this.g, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i4;
        return obj;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.g[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.g[(d << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.h) {
            g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.h) {
            return this.g[(i << 1) + 1];
        }
        g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c = obj != null ? c(hashCode, obj) : e();
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.g;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c;
        int[] iArr = this.f;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f = Arrays.copyOf(iArr, i4);
            this.g = Arrays.copyOf(this.g, i4 << 1);
            if (i != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f;
            int i5 = i3 + 1;
            a7.X(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.g;
            a7.Z(objArr2, objArr2, i5 << 1, i3 << 1, this.h << 1);
        }
        int i6 = this.h;
        if (i == i6) {
            int[] iArr3 = this.f;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.g;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.h = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !kr.b(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !kr.b(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }

    public final int size() {
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }
}
