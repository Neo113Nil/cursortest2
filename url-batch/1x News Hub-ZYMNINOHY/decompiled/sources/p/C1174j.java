package p;

import E1.AbstractC0033i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import q.AbstractC1178a;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1174j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10204a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10205b;

    /* renamed from: c, reason: collision with root package name */
    public int f10206c;

    public C1174j(int i3) {
        this.f10204a = i3 == 0 ? AbstractC1178a.f10226a : new int[i3];
        this.f10205b = i3 == 0 ? AbstractC1178a.f10227b : new Object[i3 << 1];
    }

    public final int a(Object obj) {
        int i3 = this.f10206c * 2;
        Object[] objArr = this.f10205b;
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
        int i4 = this.f10206c;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC1178a.a(i4, i3, this.f10204a);
        if (a3 < 0 || kotlin.jvm.internal.j.a(obj, this.f10205b[a3 << 1])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f10204a[i5] == i3) {
            if (kotlin.jvm.internal.j.a(obj, this.f10205b[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f10204a[i6] == i3; i6--) {
            if (kotlin.jvm.internal.j.a(obj, this.f10205b[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f10206c > 0) {
            this.f10204a = AbstractC1178a.f10226a;
            this.f10205b = AbstractC1178a.f10227b;
            this.f10206c = 0;
        }
        if (this.f10206c > 0) {
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
        int i3 = this.f10206c;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC1178a.a(i3, 0, this.f10204a);
        if (a3 < 0 || this.f10205b[a3 << 1] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f10204a[i4] == 0) {
            if (this.f10205b[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f10204a[i5] == 0; i5--) {
            if (this.f10205b[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final Object e(int i3) {
        if (i3 < 0 || i3 >= this.f10206c) {
            throw new IllegalArgumentException(AbstractC0033i.h(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f10205b[i3 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1174j) {
                int i3 = this.f10206c;
                if (i3 != ((C1174j) obj).f10206c) {
                    return false;
                }
                C1174j c1174j = (C1174j) obj;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object e3 = e(i4);
                    Object h3 = h(i4);
                    Object obj2 = c1174j.get(e3);
                    if (h3 == null) {
                        if (obj2 != null || !c1174j.containsKey(e3)) {
                            return false;
                        }
                    } else if (!h3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f10206c != ((Map) obj).size()) {
                return false;
            }
            int i5 = this.f10206c;
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
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f10206c)) {
            throw new IllegalArgumentException(AbstractC0033i.h(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f10205b;
        int i5 = i3 << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i6 = i4 - 1;
        int[] iArr = this.f10204a;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i6) {
                int i7 = i3 + 1;
                c2.c.Q(i3, i7, i4, iArr, iArr);
                Object[] objArr2 = this.f10205b;
                c2.c.R(i5, i7 << 1, i4 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f10205b;
            int i8 = i6 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i9);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f10204a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10205b, i9 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f10205b = copyOf2;
            if (i4 != this.f10206c) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                c2.c.Q(0, 0, i3, iArr, this.f10204a);
                c2.c.R(0, 0, i5, objArr, this.f10205b);
            }
            if (i3 < i6) {
                int i10 = i3 + 1;
                c2.c.Q(i3, i10, i4, iArr, this.f10204a);
                c2.c.R(i5, i10 << 1, i4 << 1, objArr, this.f10205b);
            }
        }
        if (i4 != this.f10206c) {
            throw new ConcurrentModificationException();
        }
        this.f10206c = i6;
        return obj;
    }

    public final Object g(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.f10206c) {
            throw new IllegalArgumentException(AbstractC0033i.h(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f10205b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return this.f10205b[(c3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c3 = c(obj);
        return c3 >= 0 ? this.f10205b[(c3 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        if (i3 < 0 || i3 >= this.f10206c) {
            throw new IllegalArgumentException(AbstractC0033i.h(i3, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f10205b[(i3 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f10204a;
        Object[] objArr = this.f10205b;
        int i3 = this.f10206c;
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
        return this.f10206c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f10206c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b3 = obj != null ? b(hashCode, obj) : d();
        if (b3 >= 0) {
            int i4 = (b3 << 1) + 1;
            Object[] objArr = this.f10205b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~b3;
        int[] iArr = this.f10204a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f10204a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10205b, i6 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f10205b = copyOf2;
            if (i3 != this.f10206c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f10204a;
            int i7 = i5 + 1;
            c2.c.Q(i7, i5, i3, iArr2, iArr2);
            Object[] objArr2 = this.f10205b;
            c2.c.R(i7 << 1, i5 << 1, this.f10206c << 1, objArr2, objArr2);
        }
        int i8 = this.f10206c;
        if (i3 == i8) {
            int[] iArr3 = this.f10204a;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f10205b;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f10206c = i8 + 1;
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
        return this.f10206c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10206c * 28);
        sb.append('{');
        int i3 = this.f10206c;
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
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c3))) {
            return false;
        }
        f(c3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c3 = c(obj);
        if (c3 < 0 || !kotlin.jvm.internal.j.a(obj2, h(c3))) {
            return false;
        }
        g(c3, obj3);
        return true;
    }
}
