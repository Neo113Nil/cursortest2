package i;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: f, reason: collision with root package name */
    public int[] f4742f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f4743g;

    /* renamed from: h, reason: collision with root package name */
    public int f4744h;

    public g0(int i7) {
        this.f4742f = i7 == 0 ? j.a.f4966a : new int[i7];
        this.f4743g = i7 == 0 ? j.a.f4968c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f4744h * 2;
        Object[] objArr = this.f4743g;
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

    public final int b(int i7, Object obj) {
        int i8 = this.f4744h;
        if (i8 == 0) {
            return -1;
        }
        int a3 = j.a.a(this.f4742f, i8, i7);
        if (a3 < 0 || r6.k.a(obj, this.f4743g[a3 << 1])) {
            return a3;
        }
        int i9 = a3 + 1;
        while (i9 < i8 && this.f4742f[i9] == i7) {
            if (r6.k.a(obj, this.f4743g[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a3 - 1; i10 >= 0 && this.f4742f[i10] == i7; i10--) {
            if (r6.k.a(obj, this.f4743g[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f4744h > 0) {
            this.f4742f = j.a.f4966a;
            this.f4743g = j.a.f4968c;
            this.f4744h = 0;
        }
        if (this.f4744h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i7 = this.f4744h;
        if (i7 == 0) {
            return -1;
        }
        int a3 = j.a.a(this.f4742f, i7, 0);
        if (a3 < 0 || this.f4743g[a3 << 1] == null) {
            return a3;
        }
        int i8 = a3 + 1;
        while (i8 < i7 && this.f4742f[i8] == 0) {
            if (this.f4743g[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a3 - 1; i9 >= 0 && this.f4742f[i9] == 0; i9--) {
            if (this.f4743g[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final Object e(int i7) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f4744h) {
            z8 = true;
        }
        if (z8) {
            return this.f4743g[i7 << 1];
        }
        j.a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof g0) {
                int i7 = this.f4744h;
                if (i7 != ((g0) obj).f4744h) {
                    return false;
                }
                g0 g0Var = (g0) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object e9 = e(i8);
                    Object h3 = h(i8);
                    Object obj2 = g0Var.get(e9);
                    if (h3 == null) {
                        if (obj2 != null || !g0Var.containsKey(e9)) {
                            return false;
                        }
                    } else if (!h3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4744h != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f4744h;
            for (int i10 = 0; i10 < i9; i10++) {
                Object e10 = e(i10);
                Object h8 = h(i10);
                Object obj3 = ((Map) obj).get(e10);
                if (h8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e10)) {
                        return false;
                    }
                } else if (!h8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f4744h)) {
            j.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f4743g;
        int i9 = i7 << 1;
        Object obj = objArr[i9 + 1];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i10 = i8 - 1;
        int[] iArr = this.f4742f;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i7 < i10) {
                int i11 = i7 + 1;
                e6.k.W(iArr, iArr, i7, i11, i8);
                Object[] objArr2 = this.f4743g;
                e6.k.X(objArr2, objArr2, i9, i11 << 1, i8 << 1);
            }
            Object[] objArr3 = this.f4743g;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i13);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4742f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4743g, i13 << 1);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4743g = copyOf2;
            if (i8 != this.f4744h) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                e6.k.W(iArr, this.f4742f, 0, 0, i7);
                e6.k.X(objArr, this.f4743g, 0, 0, i9);
            }
            if (i7 < i10) {
                int i14 = i7 + 1;
                e6.k.W(iArr, this.f4742f, i7, i14, i8);
                e6.k.X(objArr, this.f4743g, i9, i14 << 1, i8 << 1);
            }
        }
        if (i8 != this.f4744h) {
            throw new ConcurrentModificationException();
        }
        this.f4744h = i10;
        return obj;
    }

    public final Object g(int i7, Object obj) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f4744h) {
            z8 = true;
        }
        if (!z8) {
            j.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f4743g;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return this.f4743g[(c4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c4 = c(obj);
        return c4 >= 0 ? this.f4743g[(c4 << 1) + 1] : obj2;
    }

    public final Object h(int i7) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f4744h) {
            z8 = true;
        }
        if (z8) {
            return this.f4743g[(i7 << 1) + 1];
        }
        j.a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f4742f;
        Object[] objArr = this.f4743g;
        int i7 = this.f4744h;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public final boolean isEmpty() {
        return this.f4744h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7 = this.f4744h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b9 = obj != null ? b(hashCode, obj) : d();
        if (b9 >= 0) {
            int i8 = (b9 << 1) + 1;
            Object[] objArr = this.f4743g;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~b9;
        int[] iArr = this.f4742f;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4742f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4743g, i10 << 1);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4743g = copyOf2;
            if (i7 != this.f4744h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f4742f;
            int i11 = i9 + 1;
            e6.k.W(iArr2, iArr2, i11, i9, i7);
            Object[] objArr2 = this.f4743g;
            e6.k.X(objArr2, objArr2, i11 << 1, i9 << 1, this.f4744h << 1);
        }
        int i12 = this.f4744h;
        if (i7 == i12) {
            int[] iArr3 = this.f4742f;
            if (i9 < iArr3.length) {
                iArr3[i9] = hashCode;
                Object[] objArr3 = this.f4743g;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f4744h = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return f(c4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return g(c4, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4744h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4744h * 28);
        sb.append('{');
        int i7 = this.f4744h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object e9 = e(i8);
            if (e9 != sb) {
                sb.append(e9);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h3 = h(i8);
            if (h3 != sb) {
                sb.append(h3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c4 = c(obj);
        if (c4 < 0 || !r6.k.a(obj2, h(c4))) {
            return false;
        }
        f(c4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c4 = c(obj);
        if (c4 < 0 || !r6.k.a(obj2, h(c4))) {
            return false;
        }
        g(c4, obj3);
        return true;
    }
}
