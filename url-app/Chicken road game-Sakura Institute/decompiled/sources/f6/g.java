package f6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements Map, Serializable, s6.e {

    /* renamed from: s, reason: collision with root package name */
    public static final g f3417s;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3418f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3419g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3420h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f3421i;

    /* renamed from: j, reason: collision with root package name */
    public int f3422j;

    /* renamed from: k, reason: collision with root package name */
    public int f3423k;

    /* renamed from: l, reason: collision with root package name */
    public int f3424l;

    /* renamed from: m, reason: collision with root package name */
    public int f3425m;

    /* renamed from: n, reason: collision with root package name */
    public int f3426n;

    /* renamed from: o, reason: collision with root package name */
    public h f3427o;

    /* renamed from: p, reason: collision with root package name */
    public i f3428p;

    /* renamed from: q, reason: collision with root package name */
    public h f3429q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3430r;

    static {
        g gVar = new g(0);
        gVar.f3430r = true;
        f3417s = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j8 = j(obj);
            int i7 = this.f3422j * 2;
            int length = this.f3421i.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f3421i;
                int i9 = iArr[j8];
                if (i9 <= 0) {
                    int i10 = this.f3423k;
                    Object[] objArr = this.f3418f;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f3423k = i11;
                        objArr[i10] = obj;
                        this.f3420h[i10] = j8;
                        iArr[j8] = i11;
                        this.f3426n++;
                        this.f3425m++;
                        if (i8 > this.f3422j) {
                            this.f3422j = i8;
                        }
                        return i10;
                    }
                    g(1);
                } else {
                    if (k.a(this.f3418f[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        k(this.f3421i.length * 2);
                        break;
                    }
                    j8 = j8 == 0 ? this.f3421i.length - 1 : j8 - 1;
                }
            }
        }
    }

    public final g b() {
        c();
        this.f3430r = true;
        if (this.f3426n > 0) {
            return this;
        }
        g gVar = f3417s;
        k.d(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void c() {
        if (this.f3430r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f3423k - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f3420h;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f3421i[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        r4.a.R(this.f3418f, 0, this.f3423k);
        Object[] objArr = this.f3419g;
        if (objArr != null) {
            r4.a.R(objArr, 0, this.f3423k);
        }
        this.f3426n = 0;
        this.f3423k = 0;
        this.f3425m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z8) {
        int i7;
        Object[] objArr = this.f3419g;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f3423k;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f3420h;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f3418f;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z8) {
                    iArr[i9] = i10;
                    this.f3421i[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        r4.a.R(this.f3418f, i9, i7);
        if (objArr != null) {
            r4.a.R(objArr, i9, this.f3423k);
        }
        this.f3423k = i9;
    }

    public final boolean e(Collection collection) {
        k.f(collection, "m");
        for (Object obj : collection) {
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
        h hVar = this.f3429q;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f3429q = hVar2;
        return hVar2;
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
        return this.f3426n == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        k.f(entry, "entry");
        int h3 = h(entry.getKey());
        if (h3 < 0) {
            return false;
        }
        Object[] objArr = this.f3419g;
        k.c(objArr);
        return k.a(objArr[h3], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArr;
        Object[] objArr2 = this.f3418f;
        int length = objArr2.length;
        int i8 = this.f3423k;
        int i9 = length - i8;
        int i10 = i8 - this.f3426n;
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
            k.e(copyOf, "copyOf(...)");
            this.f3418f = copyOf;
            Object[] objArr3 = this.f3419g;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i12);
                k.e(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f3419g = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f3420h, i12);
            k.e(copyOf2, "copyOf(...)");
            this.f3420h = copyOf2;
            int highestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (highestOneBit > this.f3421i.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f3419g;
        k.c(objArr);
        return objArr[h3];
    }

    public final int h(Object obj) {
        int j8 = j(obj);
        int i7 = this.f3422j;
        while (true) {
            int i8 = this.f3421i[j8];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (k.a(this.f3418f[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            j8 = j8 == 0 ? this.f3421i.length - 1 : j8 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i7 = 0;
        while (dVar.hasNext()) {
            int i8 = dVar.f3413f;
            g gVar = (g) dVar.f3416i;
            if (i8 >= gVar.f3423k) {
                throw new NoSuchElementException();
            }
            dVar.f3413f = i8 + 1;
            dVar.f3414g = i8;
            Object obj = gVar.f3418f[i8];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f3419g;
            k.c(objArr);
            Object obj2 = objArr[dVar.f3414g];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i7 += hashCode ^ hashCode2;
        }
        return i7;
    }

    public final int i(Object obj) {
        int i7 = this.f3423k;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f3420h[i7] >= 0) {
                Object[] objArr = this.f3419g;
                k.c(objArr);
                if (k.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3426n == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3424l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f3420h[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i7) {
        this.f3425m++;
        int i8 = 0;
        if (this.f3423k > this.f3426n) {
            d(false);
        }
        this.f3421i = new int[i7];
        this.f3424l = Integer.numberOfLeadingZeros(i7) + 1;
        while (i8 < this.f3423k) {
            int i9 = i8 + 1;
            int j8 = j(this.f3418f[i8]);
            int i10 = this.f3422j;
            while (true) {
                int[] iArr = this.f3421i;
                if (iArr[j8] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j8 = j8 == 0 ? iArr.length - 1 : j8 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f3427o;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f3427o = hVar2;
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i7) {
        Object[] objArr = this.f3418f;
        k.f(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f3419g;
        if (objArr2 != null) {
            objArr2[i7] = null;
        }
        int i8 = this.f3420h[i7];
        int i9 = this.f3422j * 2;
        int length = this.f3421i.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i8;
        while (true) {
            i8 = i8 == 0 ? this.f3421i.length - 1 : i8 - 1;
            i11++;
            if (i11 > this.f3422j) {
                this.f3421i[i12] = 0;
                break;
            }
            int[] iArr = this.f3421i;
            int i13 = iArr[i8];
            if (i13 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                int j8 = j(this.f3418f[i14]) - i8;
                int[] iArr2 = this.f3421i;
                if ((j8 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i13;
                    this.f3420h[i14] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f3421i[i12] = -1;
                    break;
                }
            }
            i12 = i8;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f3420h[i7] = -1;
        this.f3426n--;
        this.f3425m++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a3 = a(obj);
        Object[] objArr = this.f3419g;
        if (objArr == null) {
            int length = this.f3418f.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f3419g = objArr;
        }
        if (a3 >= 0) {
            objArr[a3] = obj2;
            return null;
        }
        int i7 = (-a3) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k.f(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.f3419g;
            if (objArr == null) {
                int length = this.f3418f.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f3419g = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i7 = (-a3) - 1;
                if (!k.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f3419g;
        k.c(objArr);
        Object obj2 = objArr[h3];
        l(h3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3426n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3426n * 3) + 2);
        sb.append("{");
        int i7 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = dVar.f3413f;
            g gVar = (g) dVar.f3416i;
            if (i8 >= gVar.f3423k) {
                throw new NoSuchElementException();
            }
            dVar.f3413f = i8 + 1;
            dVar.f3414g = i8;
            Object obj = gVar.f3418f[i8];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gVar.f3419g;
            k.c(objArr);
            Object obj2 = objArr[dVar.f3414g];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i7++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        k.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f3428p;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(0, this);
        this.f3428p = iVar2;
        return iVar2;
    }

    public g(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int highestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f3418f = objArr;
        this.f3419g = null;
        this.f3420h = iArr;
        this.f3421i = new int[highestOneBit];
        this.f3422j = 2;
        this.f3423k = 0;
        this.f3424l = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
