package u;

import C4.p;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import v.AbstractC0955a;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0939j {

    /* renamed from: d, reason: collision with root package name */
    public int[] f8043d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8044e;

    /* renamed from: i, reason: collision with root package name */
    public int f8045i;

    public C0939j(int i2) {
        this.f8043d = i2 == 0 ? AbstractC0955a.f8126a : new int[i2];
        this.f8044e = i2 == 0 ? AbstractC0955a.f8127b : new Object[i2 << 1];
    }

    public final int a(Object obj) {
        int i2 = this.f8045i * 2;
        Object[] objArr = this.f8044e;
        if (obj == null) {
            for (int i5 = 1; i5 < i2; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i2; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i2, Object obj) {
        int i5 = this.f8045i;
        if (i5 == 0) {
            return -1;
        }
        int a7 = AbstractC0955a.a(i5, i2, this.f8043d);
        if (a7 < 0 || Intrinsics.a(obj, this.f8044e[a7 << 1])) {
            return a7;
        }
        int i7 = a7 + 1;
        while (i7 < i5 && this.f8043d[i7] == i2) {
            if (Intrinsics.a(obj, this.f8044e[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a7 - 1; i8 >= 0 && this.f8043d[i8] == i2; i8--) {
            if (Intrinsics.a(obj, this.f8044e[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f8045i > 0) {
            this.f8043d = AbstractC0955a.f8126a;
            this.f8044e = AbstractC0955a.f8127b;
            this.f8045i = 0;
        }
        if (this.f8045i > 0) {
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
        int i2 = this.f8045i;
        if (i2 == 0) {
            return -1;
        }
        int a7 = AbstractC0955a.a(i2, 0, this.f8043d);
        if (a7 < 0 || this.f8044e[a7 << 1] == null) {
            return a7;
        }
        int i5 = a7 + 1;
        while (i5 < i2 && this.f8043d[i5] == 0) {
            if (this.f8044e[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i7 = a7 - 1; i7 >= 0 && this.f8043d[i7] == 0; i7--) {
            if (this.f8044e[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i5;
    }

    public final Object e(int i2) {
        if (i2 < 0 || i2 >= this.f8045i) {
            throw new IllegalArgumentException(p.g(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8044e[i2 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0939j) {
                int i2 = this.f8045i;
                if (i2 != ((C0939j) obj).f8045i) {
                    return false;
                }
                C0939j c0939j = (C0939j) obj;
                for (int i5 = 0; i5 < i2; i5++) {
                    Object e7 = e(i5);
                    Object h7 = h(i5);
                    Object obj2 = c0939j.get(e7);
                    if (h7 == null) {
                        if (obj2 != null || !c0939j.containsKey(e7)) {
                            return false;
                        }
                    } else if (!h7.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8045i != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.f8045i;
            for (int i8 = 0; i8 < i7; i8++) {
                Object e8 = e(i8);
                Object h8 = h(i8);
                Object obj3 = ((Map) obj).get(e8);
                if (h8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e8)) {
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

    public final Object f(int i2) {
        int i5;
        if (i2 < 0 || i2 >= (i5 = this.f8045i)) {
            throw new IllegalArgumentException(p.g(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8044e;
        int i7 = i2 << 1;
        Object obj = objArr[i7 + 1];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i8 = i5 - 1;
        int[] iArr = this.f8043d;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i2 < i8) {
                int i9 = i2 + 1;
                o.d(i2, i9, iArr, iArr, i5);
                Object[] objArr2 = this.f8044e;
                o.e(objArr2, objArr2, i7, i9 << 1, i5 << 1);
            }
            Object[] objArr3 = this.f8044e;
            int i10 = i8 << 1;
            objArr3[i10] = null;
            objArr3[i10 + 1] = null;
        } else {
            int i11 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8043d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8044e, i11 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8044e = copyOf2;
            if (i5 != this.f8045i) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                o.d(0, 0, iArr, this.f8043d, i2);
                o.e(objArr, this.f8044e, 0, 0, i7);
            }
            if (i2 < i8) {
                int i12 = i2 + 1;
                o.d(i2, i12, iArr, this.f8043d, i5);
                o.e(objArr, this.f8044e, i7, i12 << 1, i5 << 1);
            }
        }
        if (i5 != this.f8045i) {
            throw new ConcurrentModificationException();
        }
        this.f8045i = i8;
        return obj;
    }

    public final Object g(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f8045i) {
            throw new IllegalArgumentException(p.g(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i5 = (i2 << 1) + 1;
        Object[] objArr = this.f8044e;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c7 = c(obj);
        if (c7 >= 0) {
            return this.f8044e[(c7 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c7 = c(obj);
        return c7 >= 0 ? this.f8044e[(c7 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        if (i2 < 0 || i2 >= this.f8045i) {
            throw new IllegalArgumentException(p.g(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8044e[(i2 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f8043d;
        Object[] objArr = this.f8044e;
        int i2 = this.f8045i;
        int i5 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i2) {
            Object obj = objArr[i5];
            i8 += (obj != null ? obj.hashCode() : 0) ^ iArr[i7];
            i7++;
            i5 += 2;
        }
        return i8;
    }

    public final boolean isEmpty() {
        return this.f8045i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f8045i;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b7 = obj != null ? b(hashCode, obj) : d();
        if (b7 >= 0) {
            int i5 = (b7 << 1) + 1;
            Object[] objArr = this.f8044e;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i7 = ~b7;
        int[] iArr = this.f8043d;
        if (i2 >= iArr.length) {
            int i8 = 8;
            if (i2 >= 8) {
                i8 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i8 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i8);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8043d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8044e, i8 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8044e = copyOf2;
            if (i2 != this.f8045i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i2) {
            int[] iArr2 = this.f8043d;
            int i9 = i7 + 1;
            o.d(i9, i7, iArr2, iArr2, i2);
            Object[] objArr2 = this.f8044e;
            o.e(objArr2, objArr2, i9 << 1, i7 << 1, this.f8045i << 1);
        }
        int i10 = this.f8045i;
        if (i2 == i10) {
            int[] iArr3 = this.f8043d;
            if (i7 < iArr3.length) {
                iArr3[i7] = hashCode;
                Object[] objArr3 = this.f8044e;
                int i11 = i7 << 1;
                objArr3[i11] = obj;
                objArr3[i11 + 1] = obj2;
                this.f8045i = i10 + 1;
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
        int c7 = c(obj);
        if (c7 >= 0) {
            return f(c7);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c7 = c(obj);
        if (c7 >= 0) {
            return g(c7, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8045i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8045i * 28);
        sb.append('{');
        int i2 = this.f8045i;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object e7 = e(i5);
            if (e7 != sb) {
                sb.append(e7);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h7 = h(i5);
            if (h7 != sb) {
                sb.append(h7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c7 = c(obj);
        if (c7 < 0 || !Intrinsics.a(obj2, h(c7))) {
            return false;
        }
        f(c7);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c7 = c(obj);
        if (c7 < 0 || !Intrinsics.a(obj2, h(c7))) {
            return false;
        }
        g(c7, obj3);
        return true;
    }
}
