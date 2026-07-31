package j;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k.AbstractC0522a;

/* renamed from: j.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0480F {

    /* renamed from: d, reason: collision with root package name */
    public int[] f5138d = AbstractC0522a.f5302a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5139e = AbstractC0522a.f5304c;

    /* renamed from: f, reason: collision with root package name */
    public int f5140f;

    public final int a(Object obj) {
        int i3 = this.f5140f * 2;
        Object[] objArr = this.f5139e;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i3, Object obj) {
        int i4 = this.f5140f;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC0522a.a(this.f5138d, i4, i3);
        if (a3 < 0) {
            return a3;
        }
        if (Z1.i.a(obj, this.f5139e[a3 << 1])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f5138d[i5] == i3) {
            if (Z1.i.a(obj, this.f5139e[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f5138d[i6] == i3; i6--) {
            if (Z1.i.a(obj, this.f5139e[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f5140f > 0) {
            this.f5138d = AbstractC0522a.f5302a;
            this.f5139e = AbstractC0522a.f5304c;
            this.f5140f = 0;
        }
        if (this.f5140f > 0) {
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
        int i3 = this.f5140f;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC0522a.a(this.f5138d, i3, 0);
        if (a3 < 0) {
            return a3;
        }
        if (this.f5139e[a3 << 1] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f5138d[i4] == 0) {
            if (this.f5139e[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f5138d[i5] == 0; i5--) {
            if (this.f5139e[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final Object e(int i3) {
        boolean z3 = false;
        if (i3 >= 0 && i3 < this.f5140f) {
            z3 = true;
        }
        if (z3) {
            return this.f5139e[i3 << 1];
        }
        AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0480F) {
                int i3 = this.f5140f;
                if (i3 != ((C0480F) obj).f5140f) {
                    return false;
                }
                C0480F c0480f = (C0480F) obj;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object e3 = e(i4);
                    Object h3 = h(i4);
                    Object obj2 = c0480f.get(e3);
                    if (h3 == null) {
                        if (obj2 != null || !c0480f.containsKey(e3)) {
                            return false;
                        }
                    } else if (!h3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f5140f != ((Map) obj).size()) {
                return false;
            }
            int i5 = this.f5140f;
            for (int i6 = 0; i6 < i5; i6++) {
                Object e4 = e(i6);
                Object h4 = h(i6);
                Object obj3 = ((Map) obj).get(e4);
                if (h4 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e4)) {
                        return false;
                    }
                } else if (!h4.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (!(i3 >= 0 && i3 < this.f5140f)) {
            AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        Object[] objArr = this.f5139e;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f5140f;
        if (i5 <= 1) {
            clear();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.f5138d;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i6) {
                    int i7 = i3 + 1;
                    M1.k.W(iArr, iArr, i3, i7, i5);
                    Object[] objArr2 = this.f5139e;
                    M1.k.X(objArr2, objArr2, i4, i7 << 1, i5 << 1);
                }
                Object[] objArr3 = this.f5139e;
                int i8 = i6 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i9);
                Z1.i.e(copyOf, "copyOf(this, newSize)");
                this.f5138d = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f5139e, i9 << 1);
                Z1.i.e(copyOf2, "copyOf(this, newSize)");
                this.f5139e = copyOf2;
                if (i5 != this.f5140f) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    M1.k.W(iArr, this.f5138d, 0, 0, i3);
                    M1.k.X(objArr, this.f5139e, 0, 0, i4);
                }
                if (i3 < i6) {
                    int i10 = i3 + 1;
                    M1.k.W(iArr, this.f5138d, i3, i10, i5);
                    M1.k.X(objArr, this.f5139e, i4, i10 << 1, i5 << 1);
                }
            }
            if (i5 != this.f5140f) {
                throw new ConcurrentModificationException();
            }
            this.f5140f = i6;
        }
        return obj;
    }

    public final Object g(int i3, Object obj) {
        boolean z3 = false;
        if (i3 >= 0 && i3 < this.f5140f) {
            z3 = true;
        }
        if (!z3) {
            AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f5139e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return this.f5139e[(c3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c3 = c(obj);
        return c3 >= 0 ? this.f5139e[(c3 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        boolean z3 = false;
        if (i3 >= 0 && i3 < this.f5140f) {
            z3 = true;
        }
        if (z3) {
            return this.f5139e[(i3 << 1) + 1];
        }
        AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f5138d;
        Object[] objArr = this.f5139e;
        int i3 = this.f5140f;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final boolean isEmpty() {
        return this.f5140f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f5140f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b2 = obj != null ? b(hashCode, obj) : d();
        if (b2 >= 0) {
            int i4 = (b2 << 1) + 1;
            Object[] objArr = this.f5139e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~b2;
        int[] iArr = this.f5138d;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5138d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5139e, i6 << 1);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f5139e = copyOf2;
            if (i3 != this.f5140f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f5138d;
            int i7 = i5 + 1;
            M1.k.W(iArr2, iArr2, i7, i5, i3);
            Object[] objArr2 = this.f5139e;
            M1.k.X(objArr2, objArr2, i7 << 1, i5 << 1, this.f5140f << 1);
        }
        int i8 = this.f5140f;
        if (i3 == i8) {
            int[] iArr3 = this.f5138d;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f5139e;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f5140f = i8 + 1;
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
        int c3 = c(obj);
        if (c3 >= 0) {
            return f(c3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return g(c3, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f5140f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5140f * 28);
        sb.append('{');
        int i3 = this.f5140f;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object e3 = e(i4);
            if (e3 != sb) {
                sb.append(e3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h3 = h(i4);
            if (h3 != sb) {
                sb.append(h3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 < 0 || !Z1.i.a(obj2, h(c3))) {
            return false;
        }
        f(c3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c3 = c(obj);
        if (c3 < 0 || !Z1.i.a(obj2, h(c3))) {
            return false;
        }
        g(c3, obj3);
        return true;
    }
}
