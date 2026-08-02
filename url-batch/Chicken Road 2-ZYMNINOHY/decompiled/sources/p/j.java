package p;

import E.AbstractC0005f;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14665a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14666b;

    /* renamed from: c, reason: collision with root package name */
    public int f14667c;

    public j(int i4) {
        this.f14665a = i4 == 0 ? AbstractC1350a.f14809a : new int[i4];
        this.f14666b = i4 == 0 ? AbstractC1350a.f14810b : new Object[i4 << 1];
    }

    public final int a(Object obj) {
        int i4 = this.f14667c * 2;
        Object[] objArr = this.f14666b;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i4) {
        int i5 = this.f14667c;
        int[] iArr = this.f14665a;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, i4);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f14665a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14666b, i4 * 2);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f14666b = copyOf2;
        }
        if (this.f14667c != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i4, Object obj) {
        int i5 = this.f14667c;
        if (i5 == 0) {
            return -1;
        }
        int a3 = AbstractC1350a.a(i5, i4, this.f14665a);
        if (a3 < 0 || kotlin.jvm.internal.i.a(obj, this.f14666b[a3 << 1])) {
            return a3;
        }
        int i6 = a3 + 1;
        while (i6 < i5 && this.f14665a[i6] == i4) {
            if (kotlin.jvm.internal.i.a(obj, this.f14666b[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a3 - 1; i7 >= 0 && this.f14665a[i7] == i4; i7--) {
            if (kotlin.jvm.internal.i.a(obj, this.f14666b[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final void clear() {
        if (this.f14667c > 0) {
            this.f14665a = AbstractC1350a.f14809a;
            this.f14666b = AbstractC1350a.f14810b;
            this.f14667c = 0;
        }
        if (this.f14667c > 0) {
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
        int i4 = this.f14667c;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC1350a.a(i4, 0, this.f14665a);
        if (a3 < 0 || this.f14666b[a3 << 1] == null) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f14665a[i5] == 0) {
            if (this.f14666b[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f14665a[i6] == 0; i6--) {
            if (this.f14666b[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i4 = this.f14667c;
                if (i4 != ((j) obj).f14667c) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object f4 = f(i5);
                    Object i6 = i(i5);
                    Object obj2 = jVar.get(f4);
                    if (i6 == null) {
                        if (obj2 != null || !jVar.containsKey(f4)) {
                            return false;
                        }
                    } else if (!i6.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f14667c != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.f14667c;
            for (int i8 = 0; i8 < i7; i8++) {
                Object f5 = f(i8);
                Object i9 = i(i8);
                Object obj3 = ((Map) obj).get(f5);
                if (i9 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f5)) {
                        return false;
                    }
                } else if (!i9.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i4) {
        if (i4 < 0 || i4 >= this.f14667c) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f14666b[i4 << 1];
    }

    public final Object g(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f14667c)) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f14666b;
        int i6 = i4 << 1;
        Object obj = objArr[i6 + 1];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i7 = i5 - 1;
        int[] iArr = this.f14665a;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i7) {
                int i8 = i4 + 1;
                d3.g.P(i4, i8, i5, iArr, iArr);
                Object[] objArr2 = this.f14666b;
                d3.g.Q(i6, i8 << 1, i5 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f14666b;
            int i9 = i7 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            int i10 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f14665a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14666b, i10 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f14666b = copyOf2;
            if (i5 != this.f14667c) {
                throw new ConcurrentModificationException();
            }
            if (i4 > 0) {
                d3.g.P(0, 0, i4, iArr, this.f14665a);
                d3.g.Q(0, 0, i6, objArr, this.f14666b);
            }
            if (i4 < i7) {
                int i11 = i4 + 1;
                d3.g.P(i4, i11, i5, iArr, this.f14665a);
                d3.g.Q(i6, i11 << 1, i5 << 1, objArr, this.f14666b);
            }
        }
        if (i5 != this.f14667c) {
            throw new ConcurrentModificationException();
        }
        this.f14667c = i7;
        return obj;
    }

    public Object get(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.f14666b[(d4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d4 = d(obj);
        return d4 >= 0 ? this.f14666b[(d4 << 1) + 1] : obj2;
    }

    public final Object h(int i4, Object obj) {
        if (i4 < 0 || i4 >= this.f14667c) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f14666b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f14665a;
        Object[] objArr = this.f14666b;
        int i4 = this.f14667c;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            i7 += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final Object i(int i4) {
        if (i4 < 0 || i4 >= this.f14667c) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f14666b[(i4 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f14667c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i4 = this.f14667c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c4 = obj != null ? c(hashCode, obj) : e();
        if (c4 >= 0) {
            int i5 = (c4 << 1) + 1;
            Object[] objArr = this.f14666b;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~c4;
        int[] iArr = this.f14665a;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f14665a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14666b, i7 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f14666b = copyOf2;
            if (i4 != this.f14667c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.f14665a;
            int i8 = i6 + 1;
            d3.g.P(i8, i6, i4, iArr2, iArr2);
            Object[] objArr2 = this.f14666b;
            d3.g.Q(i8 << 1, i6 << 1, this.f14667c << 1, objArr2, objArr2);
        }
        int i9 = this.f14667c;
        if (i4 == i9) {
            int[] iArr3 = this.f14665a;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                Object[] objArr3 = this.f14666b;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f14667c = i9 + 1;
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
        int d4 = d(obj);
        if (d4 >= 0) {
            return g(d4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return h(d4, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f14667c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14667c * 28);
        sb.append('{');
        int i4 = this.f14667c;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object f4 = f(i5);
            if (f4 != sb) {
                sb.append(f4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i6 = i(i5);
            if (i6 != sb) {
                sb.append(i6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 < 0 || !kotlin.jvm.internal.i.a(obj2, i(d4))) {
            return false;
        }
        g(d4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d4 = d(obj);
        if (d4 < 0 || !kotlin.jvm.internal.i.a(obj2, i(d4))) {
            return false;
        }
        h(d4, obj3);
        return true;
    }
}
