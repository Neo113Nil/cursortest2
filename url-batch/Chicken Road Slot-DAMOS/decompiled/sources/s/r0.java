package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: d, reason: collision with root package name */
    public int[] f8367d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8368e;

    /* renamed from: i, reason: collision with root package name */
    public int f8369i;

    public r0(int i3) {
        this.f8367d = i3 == 0 ? t.a.f9193a : new int[i3];
        this.f8368e = i3 == 0 ? t.a.f9195c : new Object[i3 << 1];
    }

    public final int a(Object obj) {
        int i3 = this.f8369i * 2;
        Object[] objArr = this.f8368e;
        if (obj == null) {
            for (int i10 = 1; i10 < i3; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i3; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i3, Object obj) {
        int i10 = this.f8369i;
        if (i10 == 0) {
            return -1;
        }
        int a9 = t.a.a(i10, i3, this.f8367d);
        if (a9 < 0 || Intrinsics.a(obj, this.f8368e[a9 << 1])) {
            return a9;
        }
        int i11 = a9 + 1;
        while (i11 < i10 && this.f8367d[i11] == i3) {
            if (Intrinsics.a(obj, this.f8368e[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a9 - 1; i12 >= 0 && this.f8367d[i12] == i3; i12--) {
            if (Intrinsics.a(obj, this.f8368e[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f8369i > 0) {
            this.f8367d = t.a.f9193a;
            this.f8368e = t.a.f9195c;
            this.f8369i = 0;
        }
        if (this.f8369i > 0) {
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
        int i3 = this.f8369i;
        if (i3 == 0) {
            return -1;
        }
        int a9 = t.a.a(i3, 0, this.f8367d);
        if (a9 < 0 || this.f8368e[a9 << 1] == null) {
            return a9;
        }
        int i10 = a9 + 1;
        while (i10 < i3 && this.f8367d[i10] == 0) {
            if (this.f8368e[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a9 - 1; i11 >= 0 && this.f8367d[i11] == 0; i11--) {
            if (this.f8368e[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object e(int i3) {
        boolean z10 = false;
        if (i3 >= 0 && i3 < this.f8369i) {
            z10 = true;
        }
        if (z10) {
            return this.f8368e[i3 << 1];
        }
        a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof r0) {
                int i3 = this.f8369i;
                if (i3 != ((r0) obj).f8369i) {
                    return false;
                }
                r0 r0Var = (r0) obj;
                for (int i10 = 0; i10 < i3; i10++) {
                    Object e2 = e(i10);
                    Object h10 = h(i10);
                    Object obj2 = r0Var.get(e2);
                    if (h10 == null) {
                        if (obj2 != null || !r0Var.containsKey(e2)) {
                            return false;
                        }
                    } else if (!h10.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8369i != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f8369i;
            for (int i12 = 0; i12 < i11; i12++) {
                Object e9 = e(i12);
                Object h11 = h(i12);
                Object obj3 = ((Map) obj).get(e9);
                if (h11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e9)) {
                        return false;
                    }
                } else if (!h11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f8369i)) {
            a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f8368e;
        int i11 = i3 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f8367d;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i12) {
                int i13 = i3 + 1;
                kotlin.collections.v.c(i3, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f8368e;
                kotlin.collections.v.d(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f8368e;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            this.f8367d = Arrays.copyOf(iArr, i15);
            this.f8368e = Arrays.copyOf(this.f8368e, i15 << 1);
            if (i10 != this.f8369i) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                kotlin.collections.v.c(0, 0, i3, iArr, this.f8367d);
                kotlin.collections.v.d(0, 0, i11, objArr, this.f8368e);
            }
            if (i3 < i12) {
                int i16 = i3 + 1;
                kotlin.collections.v.c(i3, i16, i10, iArr, this.f8367d);
                kotlin.collections.v.d(i11, i16 << 1, i10 << 1, objArr, this.f8368e);
            }
        }
        if (i10 != this.f8369i) {
            throw new ConcurrentModificationException();
        }
        this.f8369i = i12;
        return obj;
    }

    public final Object g(int i3, Object obj) {
        boolean z10 = false;
        if (i3 >= 0 && i3 < this.f8369i) {
            z10 = true;
        }
        if (!z10) {
            a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i10 = (i3 << 1) + 1;
        Object[] objArr = this.f8368e;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return this.f8368e[(c10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c10 = c(obj);
        return c10 >= 0 ? this.f8368e[(c10 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        boolean z10 = false;
        if (i3 >= 0 && i3 < this.f8369i) {
            z10 = true;
        }
        if (z10) {
            return this.f8368e[(i3 << 1) + 1];
        }
        a1.e(v4.a.j(i3, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.f8367d;
        Object[] objArr = this.f8368e;
        int i3 = this.f8369i;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final boolean isEmpty() {
        return this.f8369i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f8369i;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b10 = obj != null ? b(hashCode, obj) : d();
        if (b10 >= 0) {
            int i10 = (b10 << 1) + 1;
            Object[] objArr = this.f8368e;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~b10;
        int[] iArr = this.f8367d;
        if (i3 >= iArr.length) {
            int i12 = 8;
            if (i3 >= 8) {
                i12 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i12 = 4;
            }
            this.f8367d = Arrays.copyOf(iArr, i12);
            this.f8368e = Arrays.copyOf(this.f8368e, i12 << 1);
            if (i3 != this.f8369i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i3) {
            int[] iArr2 = this.f8367d;
            int i13 = i11 + 1;
            kotlin.collections.v.c(i13, i11, i3, iArr2, iArr2);
            Object[] objArr2 = this.f8368e;
            kotlin.collections.v.d(i13 << 1, i11 << 1, this.f8369i << 1, objArr2, objArr2);
        }
        int i14 = this.f8369i;
        if (i3 == i14) {
            int[] iArr3 = this.f8367d;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.f8368e;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f8369i = i14 + 1;
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
        int c10 = c(obj);
        if (c10 < 0 || !Intrinsics.a(obj2, h(c10))) {
            return false;
        }
        f(c10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c10 = c(obj);
        if (c10 < 0 || !Intrinsics.a(obj2, h(c10))) {
            return false;
        }
        g(c10, obj3);
        return true;
    }

    public final int size() {
        return this.f8369i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8369i * 28);
        sb2.append('{');
        int i3 = this.f8369i;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object e2 = e(i10);
            if (e2 != sb2) {
                sb2.append(e2);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h10 = h(i10);
            if (h10 != sb2) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object remove(Object obj) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return f(c10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return g(c10, obj2);
        }
        return null;
    }
}
