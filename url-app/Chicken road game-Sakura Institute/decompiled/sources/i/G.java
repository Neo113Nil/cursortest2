package i;

import j.AbstractC0705a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public class G {

    /* renamed from: d, reason: collision with root package name */
    public int[] f6893d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f6894e;

    /* renamed from: i, reason: collision with root package name */
    public int f6895i;

    public G(int i2) {
        this.f6893d = i2 == 0 ? AbstractC0705a.f7119a : new int[i2];
        this.f6894e = i2 == 0 ? AbstractC0705a.f7121c : new Object[i2 << 1];
    }

    public final int b(Object obj) {
        int i2 = this.f6895i * 2;
        Object[] objArr = this.f6894e;
        if (obj == null) {
            for (int i4 = 1; i4 < i2; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i2; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i2, Object obj) {
        int i4 = this.f6895i;
        if (i4 == 0) {
            return -1;
        }
        int a4 = AbstractC0705a.a(this.f6893d, i4, i2);
        if (a4 < 0 || Intrinsics.a(obj, this.f6894e[a4 << 1])) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f6893d[i5] == i2) {
            if (Intrinsics.a(obj, this.f6894e[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a4 - 1; i6 >= 0 && this.f6893d[i6] == i2; i6--) {
            if (Intrinsics.a(obj, this.f6894e[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void clear() {
        if (this.f6895i > 0) {
            this.f6893d = AbstractC0705a.f7119a;
            this.f6894e = AbstractC0705a.f7121c;
            this.f6895i = 0;
        }
        if (this.f6895i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.f6895i;
        if (i2 == 0) {
            return -1;
        }
        int a4 = AbstractC0705a.a(this.f6893d, i2, 0);
        if (a4 < 0 || this.f6894e[a4 << 1] == null) {
            return a4;
        }
        int i4 = a4 + 1;
        while (i4 < i2 && this.f6893d[i4] == 0) {
            if (this.f6894e[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a4 - 1; i5 >= 0 && this.f6893d[i5] == 0; i5--) {
            if (this.f6894e[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof G) {
                int i2 = this.f6895i;
                if (i2 != ((G) obj).f6895i) {
                    return false;
                }
                G g4 = (G) obj;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object f4 = f(i4);
                    Object i5 = i(i4);
                    Object obj2 = g4.get(f4);
                    if (i5 == null) {
                        if (obj2 != null || !g4.containsKey(f4)) {
                            return false;
                        }
                    } else if (!i5.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f6895i != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f6895i;
            for (int i7 = 0; i7 < i6; i7++) {
                Object f5 = f(i7);
                Object i8 = i(i7);
                Object obj3 = ((Map) obj).get(f5);
                if (i8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f5)) {
                        return false;
                    }
                } else if (!i8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        boolean z4 = false;
        if (i2 >= 0 && i2 < this.f6895i) {
            z4 = true;
        }
        if (z4) {
            return this.f6894e[i2 << 1];
        }
        AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public final Object g(int i2) {
        if (!(i2 >= 0 && i2 < this.f6895i)) {
            AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        Object[] objArr = this.f6894e;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f6895i;
        if (i5 <= 1) {
            clear();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.f6893d;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    C1436t.e(iArr, iArr, i2, i7, i5);
                    Object[] objArr2 = this.f6894e;
                    C1436t.f(objArr2, objArr2, i4, i7 << 1, i5 << 1);
                }
                Object[] objArr3 = this.f6894e;
                int i8 = i6 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i9);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f6893d = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f6894e, i9 << 1);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.f6894e = copyOf2;
                if (i5 != this.f6895i) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    C1436t.e(iArr, this.f6893d, 0, 0, i2);
                    C1436t.f(objArr, this.f6894e, 0, 0, i4);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    C1436t.e(iArr, this.f6893d, i2, i10, i5);
                    C1436t.f(objArr, this.f6894e, i4, i10 << 1, i5 << 1);
                }
            }
            if (i5 != this.f6895i) {
                throw new ConcurrentModificationException();
            }
            this.f6895i = i6;
        }
        return obj;
    }

    public Object get(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.f6894e[(d4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d4 = d(obj);
        return d4 >= 0 ? this.f6894e[(d4 << 1) + 1] : obj2;
    }

    public final Object h(int i2, Object obj) {
        boolean z4 = false;
        if (i2 >= 0 && i2 < this.f6895i) {
            z4 = true;
        }
        if (!z4) {
            AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        int i4 = (i2 << 1) + 1;
        Object[] objArr = this.f6894e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f6893d;
        Object[] objArr = this.f6894e;
        int i2 = this.f6895i;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i2) {
        boolean z4 = false;
        if (i2 >= 0 && i2 < this.f6895i) {
            z4 = true;
        }
        if (z4) {
            return this.f6894e[(i2 << 1) + 1];
        }
        AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f6895i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f6895i;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c4 = obj != null ? c(hashCode, obj) : e();
        if (c4 >= 0) {
            int i4 = (c4 << 1) + 1;
            Object[] objArr = this.f6894e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c4;
        int[] iArr = this.f6893d;
        if (i2 >= iArr.length) {
            int i6 = 8;
            if (i2 >= 8) {
                i6 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6893d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6894e, i6 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f6894e = copyOf2;
            if (i2 != this.f6895i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i2) {
            int[] iArr2 = this.f6893d;
            int i7 = i5 + 1;
            C1436t.e(iArr2, iArr2, i7, i5, i2);
            Object[] objArr2 = this.f6894e;
            C1436t.f(objArr2, objArr2, i7 << 1, i5 << 1, this.f6895i << 1);
        }
        int i8 = this.f6895i;
        if (i2 == i8) {
            int[] iArr3 = this.f6893d;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f6894e;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f6895i = i8 + 1;
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
        return this.f6895i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6895i * 28);
        sb.append('{');
        int i2 = this.f6895i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object f4 = f(i4);
            if (f4 != sb) {
                sb.append(f4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i5 = i(i4);
            if (i5 != sb) {
                sb.append(i5);
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
        int d4 = d(obj);
        if (d4 < 0 || !Intrinsics.a(obj2, i(d4))) {
            return false;
        }
        g(d4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d4 = d(obj);
        if (d4 < 0 || !Intrinsics.a(obj2, i(d4))) {
            return false;
        }
        h(d4, obj3);
        return true;
    }
}
