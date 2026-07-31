package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: d, reason: collision with root package name */
    public int[] f5540d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5541e;

    /* renamed from: f, reason: collision with root package name */
    public int f5542f;

    public t0(int i) {
        this.f5540d = i == 0 ? p.a.f5707a : new int[i];
        this.f5541e = i == 0 ? p.a.f5709c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f5542f * 2;
        Object[] objArr = this.f5541e;
        if (obj == null) {
            for (int i8 = 1; i8 < i; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i8 = this.f5542f;
        int[] iArr = this.f5540d;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5540d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5541e, i * 2);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5541e = copyOf2;
        }
        if (this.f5542f != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i8 = this.f5542f;
        if (i8 == 0) {
            return -1;
        }
        int a8 = p.a.a(i8, i, this.f5540d);
        if (a8 < 0 || q6.i.a(obj, this.f5541e[a8 << 1])) {
            return a8;
        }
        int i9 = a8 + 1;
        while (i9 < i8 && this.f5540d[i9] == i) {
            if (q6.i.a(obj, this.f5541e[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a8 - 1; i10 >= 0 && this.f5540d[i10] == i; i10--) {
            if (q6.i.a(obj, this.f5541e[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final void clear() {
        if (this.f5542f > 0) {
            this.f5540d = p.a.f5707a;
            this.f5541e = p.a.f5709c;
            this.f5542f = 0;
        }
        if (this.f5542f > 0) {
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
        int i = this.f5542f;
        if (i == 0) {
            return -1;
        }
        int a8 = p.a.a(i, 0, this.f5540d);
        if (a8 < 0 || this.f5541e[a8 << 1] == null) {
            return a8;
        }
        int i8 = a8 + 1;
        while (i8 < i && this.f5540d[i8] == 0) {
            if (this.f5541e[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a8 - 1; i9 >= 0 && this.f5540d[i9] == 0; i9--) {
            if (this.f5541e[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof t0) {
                int i = this.f5542f;
                if (i != ((t0) obj).f5542f) {
                    return false;
                }
                t0 t0Var = (t0) obj;
                for (int i8 = 0; i8 < i; i8++) {
                    Object f6 = f(i8);
                    Object i9 = i(i8);
                    Object obj2 = t0Var.get(f6);
                    if (i9 == null) {
                        if (obj2 != null || !t0Var.containsKey(f6)) {
                            return false;
                        }
                    } else if (!i9.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f5542f != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f5542f;
            for (int i11 = 0; i11 < i10; i11++) {
                Object f8 = f(i11);
                Object i12 = i(i11);
                Object obj3 = ((Map) obj).get(f8);
                if (i12 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f8)) {
                        return false;
                    }
                } else if (!i12.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f5542f) {
            z3 = true;
        }
        if (z3) {
            return this.f5541e[i << 1];
        }
        p.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object g(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f5542f)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f5541e;
        int i9 = i << 1;
        Object obj = objArr[i9 + 1];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i10 = i8 - 1;
        int[] iArr = this.f5540d;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                d6.l.F(i, i11, i8, iArr, iArr);
                Object[] objArr2 = this.f5541e;
                d6.l.H(objArr2, objArr2, i9, i11 << 1, i8 << 1);
            }
            Object[] objArr3 = this.f5541e;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i13);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5540d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5541e, i13 << 1);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5541e = copyOf2;
            if (i8 != this.f5542f) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                d6.l.F(0, 0, i, iArr, this.f5540d);
                d6.l.H(objArr, this.f5541e, 0, 0, i9);
            }
            if (i < i10) {
                int i14 = i + 1;
                d6.l.F(i, i14, i8, iArr, this.f5540d);
                d6.l.H(objArr, this.f5541e, i9, i14 << 1, i8 << 1);
            }
        }
        if (i8 != this.f5542f) {
            throw new ConcurrentModificationException();
        }
        this.f5542f = i10;
        return obj;
    }

    public Object get(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f5541e[(d8 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d8 = d(obj);
        return d8 >= 0 ? this.f5541e[(d8 << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z3 = false;
        if (i >= 0 && i < this.f5542f) {
            z3 = true;
        }
        if (!z3) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i8 = (i << 1) + 1;
        Object[] objArr = this.f5541e;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f5540d;
        Object[] objArr = this.f5541e;
        int i = this.f5542f;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            Object obj = objArr[i8];
            i10 += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public final Object i(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f5542f) {
            z3 = true;
        }
        if (z3) {
            return this.f5541e[(i << 1) + 1];
        }
        p.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f5542f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f5542f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c8 = obj != null ? c(hashCode, obj) : e();
        if (c8 >= 0) {
            int i8 = (c8 << 1) + 1;
            Object[] objArr = this.f5541e;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~c8;
        int[] iArr = this.f5540d;
        if (i >= iArr.length) {
            int i10 = 8;
            if (i >= 8) {
                i10 = (i >> 1) + i;
            } else if (i < 4) {
                i10 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5540d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5541e, i10 << 1);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5541e = copyOf2;
            if (i != this.f5542f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i) {
            int[] iArr2 = this.f5540d;
            int i11 = i9 + 1;
            d6.l.F(i11, i9, i, iArr2, iArr2);
            Object[] objArr2 = this.f5541e;
            d6.l.H(objArr2, objArr2, i11 << 1, i9 << 1, this.f5542f << 1);
        }
        int i12 = this.f5542f;
        if (i == i12) {
            int[] iArr3 = this.f5540d;
            if (i9 < iArr3.length) {
                iArr3[i9] = hashCode;
                Object[] objArr3 = this.f5541e;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f5542f = i12 + 1;
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
        int d8 = d(obj);
        if (d8 >= 0) {
            return g(d8);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return h(d8, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f5542f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5542f * 28);
        sb.append('{');
        int i = this.f5542f;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object f6 = f(i8);
            if (f6 != sb) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i9 = i(i8);
            if (i9 != sb) {
                sb.append(i9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 < 0 || !q6.i.a(obj2, i(d8))) {
            return false;
        }
        g(d8);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d8 = d(obj);
        if (d8 < 0 || !q6.i.a(obj2, i(d8))) {
            return false;
        }
        h(d8, obj3);
        return true;
    }
}
