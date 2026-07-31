package m5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import y5.InterfaceC0766a;

/* renamed from: m5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529f implements Map, Serializable, InterfaceC0766a {

    /* renamed from: s, reason: collision with root package name */
    public static final C0529f f5468s;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5469f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5470g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f5471h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f5472i;

    /* renamed from: j, reason: collision with root package name */
    public int f5473j;

    /* renamed from: k, reason: collision with root package name */
    public int f5474k;

    /* renamed from: l, reason: collision with root package name */
    public int f5475l;

    /* renamed from: m, reason: collision with root package name */
    public int f5476m;

    /* renamed from: n, reason: collision with root package name */
    public int f5477n;

    /* renamed from: o, reason: collision with root package name */
    public C0530g f5478o;

    /* renamed from: p, reason: collision with root package name */
    public C0531h f5479p;

    /* renamed from: q, reason: collision with root package name */
    public C0530g f5480q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5481r;

    static {
        C0529f c0529f = new C0529f(0);
        c0529f.f5481r = true;
        f5468s = c0529f;
    }

    public C0529f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j4 = j(obj);
            int i7 = this.f5473j * 2;
            int length = this.f5472i.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f5472i;
                int i9 = iArr[j4];
                if (i9 <= 0) {
                    int i10 = this.f5474k;
                    Object[] objArr = this.f5469f;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f5474k = i11;
                        objArr[i10] = obj;
                        this.f5471h[i10] = j4;
                        iArr[j4] = i11;
                        this.f5477n++;
                        this.f5476m++;
                        if (i8 > this.f5473j) {
                            this.f5473j = i8;
                        }
                        return i10;
                    }
                    g(1);
                } else {
                    if (kotlin.jvm.internal.i.a(this.f5469f[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        k(this.f5472i.length * 2);
                        break;
                    }
                    j4 = j4 == 0 ? this.f5472i.length - 1 : j4 - 1;
                }
            }
        }
    }

    public final C0529f b() {
        c();
        this.f5481r = true;
        if (this.f5477n > 0) {
            return this;
        }
        C0529f c0529f = f5468s;
        kotlin.jvm.internal.i.c(c0529f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c0529f;
    }

    public final void c() {
        if (this.f5481r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f5474k - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f5471h;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f5472i[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        A3.c.a0(0, this.f5474k, this.f5469f);
        Object[] objArr = this.f5470g;
        if (objArr != null) {
            A3.c.a0(0, this.f5474k, objArr);
        }
        this.f5477n = 0;
        this.f5474k = 0;
        this.f5476m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z5) {
        int i7;
        Object[] objArr = this.f5470g;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f5474k;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f5471h;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f5469f;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z5) {
                    iArr[i9] = i10;
                    this.f5472i[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        A3.c.a0(i9, i7, this.f5469f);
        if (objArr != null) {
            A3.c.a0(i9, this.f5474k, objArr);
        }
        this.f5474k = i9;
    }

    public final boolean e(Collection m4) {
        kotlin.jvm.internal.i.e(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0530g c0530g = this.f5480q;
        if (c0530g != null) {
            return c0530g;
        }
        C0530g c0530g2 = new C0530g(this, 0);
        this.f5480q = c0530g2;
        return c0530g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f5477n == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        kotlin.jvm.internal.i.e(entry, "entry");
        int h7 = h(entry.getKey());
        if (h7 < 0) {
            return false;
        }
        Object[] objArr = this.f5470g;
        kotlin.jvm.internal.i.b(objArr);
        return kotlin.jvm.internal.i.a(objArr[h7], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArr;
        Object[] objArr2 = this.f5469f;
        int length = objArr2.length;
        int i8 = this.f5474k;
        int i9 = length - i8;
        int i10 = i8 - this.f5477n;
        if (i9 < i7 && i9 + i10 >= i7 && i10 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i11 = i8 + i7;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > objArr2.length) {
            int length2 = objArr2.length;
            int i12 = length2 + (length2 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i12);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f5469f = copyOf;
            Object[] objArr3 = this.f5470g;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i12);
                kotlin.jvm.internal.i.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f5470g = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f5471h, i12);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
            this.f5471h = copyOf2;
            int highestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (highestOneBit > this.f5472i.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h7 = h(obj);
        if (h7 < 0) {
            return null;
        }
        Object[] objArr = this.f5470g;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[h7];
    }

    public final int h(Object obj) {
        int j4 = j(obj);
        int i7 = this.f5473j;
        while (true) {
            int i8 = this.f5472i[j4];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (kotlin.jvm.internal.i.a(this.f5469f[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            j4 = j4 == 0 ? this.f5472i.length - 1 : j4 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0527d c0527d = new C0527d(this, 0);
        int i7 = 0;
        while (c0527d.hasNext()) {
            int i8 = c0527d.f5461g;
            C0529f c0529f = c0527d.f5460f;
            if (i8 >= c0529f.f5474k) {
                throw new NoSuchElementException();
            }
            c0527d.f5461g = i8 + 1;
            c0527d.f5462h = i8;
            Object obj = c0529f.f5469f[i8];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c0529f.f5470g;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[c0527d.f5462h];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0527d.b();
            i7 += hashCode ^ hashCode2;
        }
        return i7;
    }

    public final int i(Object obj) {
        int i7 = this.f5474k;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f5471h[i7] >= 0) {
                Object[] objArr = this.f5470g;
                kotlin.jvm.internal.i.b(objArr);
                if (kotlin.jvm.internal.i.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5477n == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f5475l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f5471h[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i7) {
        this.f5476m++;
        int i8 = 0;
        if (this.f5474k > this.f5477n) {
            d(false);
        }
        this.f5472i = new int[i7];
        this.f5475l = Integer.numberOfLeadingZeros(i7) + 1;
        while (i8 < this.f5474k) {
            int i9 = i8 + 1;
            int j4 = j(this.f5469f[i8]);
            int i10 = this.f5473j;
            while (true) {
                int[] iArr = this.f5472i;
                if (iArr[j4] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j4 = j4 == 0 ? iArr.length - 1 : j4 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0530g c0530g = this.f5478o;
        if (c0530g != null) {
            return c0530g;
        }
        C0530g c0530g2 = new C0530g(this, 1);
        this.f5478o = c0530g2;
        return c0530g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i7) {
        Object[] objArr = this.f5469f;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f5470g;
        if (objArr2 != null) {
            objArr2[i7] = null;
        }
        int i8 = this.f5471h[i7];
        int i9 = this.f5473j * 2;
        int length = this.f5472i.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i8;
        while (true) {
            i8 = i8 == 0 ? this.f5472i.length - 1 : i8 - 1;
            i11++;
            if (i11 > this.f5473j) {
                this.f5472i[i12] = 0;
                break;
            }
            int[] iArr = this.f5472i;
            int i13 = iArr[i8];
            if (i13 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                int j4 = j(this.f5469f[i14]) - i8;
                int[] iArr2 = this.f5472i;
                if ((j4 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i13;
                    this.f5471h[i14] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f5472i[i12] = -1;
                    break;
                }
            }
            i12 = i8;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f5471h[i7] = -1;
        this.f5477n--;
        this.f5476m++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a7 = a(obj);
        Object[] objArr = this.f5470g;
        if (objArr == null) {
            int length = this.f5469f.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f5470g = objArr;
        }
        if (a7 >= 0) {
            objArr[a7] = obj2;
            return null;
        }
        int i7 = (-a7) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.i.e(from, "from");
        c();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a7 = a(entry.getKey());
            Object[] objArr = this.f5470g;
            if (objArr == null) {
                int length = this.f5469f.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f5470g = objArr;
            }
            if (a7 >= 0) {
                objArr[a7] = entry.getValue();
            } else {
                int i7 = (-a7) - 1;
                if (!kotlin.jvm.internal.i.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h7 = h(obj);
        if (h7 < 0) {
            return null;
        }
        Object[] objArr = this.f5470g;
        kotlin.jvm.internal.i.b(objArr);
        Object obj2 = objArr[h7];
        l(h7);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5477n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f5477n * 3) + 2);
        sb.append("{");
        int i7 = 0;
        C0527d c0527d = new C0527d(this, 0);
        while (c0527d.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = c0527d.f5461g;
            C0529f c0529f = c0527d.f5460f;
            if (i8 >= c0529f.f5474k) {
                throw new NoSuchElementException();
            }
            c0527d.f5461g = i8 + 1;
            c0527d.f5462h = i8;
            Object obj = c0529f.f5469f[i8];
            if (obj == c0529f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c0529f.f5470g;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[c0527d.f5462h];
            if (obj2 == c0529f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0527d.b();
            i7++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0531h c0531h = this.f5479p;
        if (c0531h != null) {
            return c0531h;
        }
        C0531h c0531h2 = new C0531h(this);
        this.f5479p = c0531h2;
        return c0531h2;
    }

    public C0529f(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int highestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f5469f = objArr;
        this.f5470g = null;
        this.f5471h = iArr;
        this.f5472i = new int[highestOneBit];
        this.f5473j = 2;
        this.f5474k = 0;
        this.f5475l = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
