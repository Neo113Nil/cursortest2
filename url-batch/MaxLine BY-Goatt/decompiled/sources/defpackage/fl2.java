package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class fl2 {
    public int[] m;
    public Object[] n;
    public int o;

    public fl2(int i) {
        this.m = i == 0 ? yk3.p : new int[i];
        this.n = i == 0 ? yk3.r : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.o * 2;
        Object[] objArr = this.n;
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

    public final int b(int i, Object obj) {
        int i2 = this.o;
        if (i2 == 0) {
            return -1;
        }
        int o = yk3.o(i2, i, this.m);
        if (o < 0 || Intrinsics.b(obj, this.n[o << 1])) {
            return o;
        }
        int i3 = o + 1;
        while (i3 < i2 && this.m[i3] == i) {
            if (Intrinsics.b(obj, this.n[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = o - 1; i4 >= 0 && this.m[i4] == i; i4--) {
            if (Intrinsics.b(obj, this.n[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.o > 0) {
            this.m = yk3.p;
            this.n = yk3.r;
            this.o = 0;
        }
        if (this.o > 0) {
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
        int i = this.o;
        if (i == 0) {
            return -1;
        }
        int o = yk3.o(i, 0, this.m);
        if (o < 0 || this.n[o << 1] == null) {
            return o;
        }
        int i2 = o + 1;
        while (i2 < i && this.m[i2] == 0) {
            if (this.n[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = o - 1; i3 >= 0 && this.m[i3] == 0; i3--) {
            if (this.n[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.o) {
            z = true;
        }
        if (z) {
            return this.n[i << 1];
        }
        lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof fl2) {
                int i = this.o;
                if (i != ((fl2) obj).o) {
                    return false;
                }
                fl2 fl2Var = (fl2) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = fl2Var.get(e);
                    if (h == null) {
                        if (obj2 != null || !fl2Var.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.o != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.o;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Object obj3 = ((Map) obj).get(e2);
                if (h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e2)) {
                        return false;
                    }
                } else if (!h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.o)) {
            lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.n;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.m;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ni.d(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.n;
                ni.e(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.n;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.m = Arrays.copyOf(iArr, i7);
            this.n = Arrays.copyOf(this.n, i7 << 1);
            if (i2 != this.o) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ni.d(0, 0, i, iArr, this.m);
                ni.e(0, 0, i3, objArr, this.n);
            }
            if (i < i4) {
                int i8 = i + 1;
                ni.d(i, i8, i2, iArr, this.m);
                ni.e(i3, i8 << 1, i2 << 1, objArr, this.n);
            }
        }
        if (i2 != this.o) {
            throw new ConcurrentModificationException();
        }
        this.o = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.o) {
            z = true;
        }
        if (!z) {
            lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.n;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.n[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.n[(c << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.o) {
            z = true;
        }
        if (z) {
            return this.n[(i << 1) + 1];
        }
        lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.m;
        Object[] objArr = this.n;
        int i = this.o;
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

    public final boolean isEmpty() {
        return this.o <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.o;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b = obj != null ? b(hashCode, obj) : d();
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.n;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~b;
        int[] iArr = this.m;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.m = Arrays.copyOf(iArr, i4);
            this.n = Arrays.copyOf(this.n, i4 << 1);
            if (i != this.o) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.m;
            int i5 = i3 + 1;
            ni.d(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.n;
            ni.e(i5 << 1, i3 << 1, this.o << 1, objArr2, objArr2);
        }
        int i6 = this.o;
        if (i == i6) {
            int[] iArr3 = this.m;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.n;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.o = i6 + 1;
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
        int c = c(obj);
        if (c < 0 || !Intrinsics.b(obj2, h(c))) {
            return false;
        }
        f(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !Intrinsics.b(obj2, h(c))) {
            return false;
        }
        g(c, obj3);
        return true;
    }

    public final int size() {
        return this.o;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 28);
        sb.append('{');
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return f(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return g(c, obj2);
        }
        return null;
    }
}
