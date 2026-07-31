package e6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Map, Serializable, r6.c {

    /* renamed from: q, reason: collision with root package name */
    public static final f f2521q;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2522d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2523e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2524f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2525g;

    /* renamed from: h, reason: collision with root package name */
    public int f2526h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2527j;

    /* renamed from: k, reason: collision with root package name */
    public int f2528k;

    /* renamed from: l, reason: collision with root package name */
    public int f2529l;

    /* renamed from: m, reason: collision with root package name */
    public g f2530m;

    /* renamed from: n, reason: collision with root package name */
    public h f2531n;

    /* renamed from: o, reason: collision with root package name */
    public g f2532o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2533p;

    static {
        f fVar = new f(0);
        fVar.f2533p = true;
        f2521q = fVar;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f2522d = objArr;
        this.f2523e = null;
        this.f2524f = iArr;
        this.f2525g = new int[highestOneBit];
        this.f2526h = 2;
        this.i = 0;
        this.f2527j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i8 = this.f2526h * 2;
            int length = this.f2525g.length / 2;
            if (i8 > length) {
                i8 = length;
            }
            int i9 = 0;
            while (true) {
                int[] iArr = this.f2525g;
                int i10 = iArr[i];
                if (i10 <= 0) {
                    int i11 = this.i;
                    Object[] objArr = this.f2522d;
                    if (i11 < objArr.length) {
                        int i12 = i11 + 1;
                        this.i = i12;
                        objArr[i11] = obj;
                        this.f2524f[i11] = i;
                        iArr[i] = i12;
                        this.f2529l++;
                        this.f2528k++;
                        if (i9 > this.f2526h) {
                            this.f2526h = i9;
                        }
                        return i11;
                    }
                    f(1);
                } else {
                    if (i.a(this.f2522d[i10 - 1], obj)) {
                        return -i10;
                    }
                    i9++;
                    if (i9 > i8) {
                        j(this.f2525g.length * 2);
                        break;
                    }
                    i = i == 0 ? this.f2525g.length - 1 : i - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f2533p) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z3) {
        int i;
        Object[] objArr = this.f2523e;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.i;
            if (i8 >= i) {
                break;
            }
            int[] iArr = this.f2524f;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f2522d;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z3) {
                    iArr[i9] = i10;
                    this.f2525g[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        a.a.x(this.f2522d, i9, i);
        if (objArr != null) {
            a.a.x(objArr, i9, this.i);
        }
        this.i = i9;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.i - 1;
        if (i >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f2524f;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f2525g[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        a.a.x(this.f2522d, 0, this.i);
        Object[] objArr = this.f2523e;
        if (objArr != null) {
            a.a.x(objArr, 0, this.i);
        }
        this.f2529l = 0;
        this.i = 0;
        this.f2528k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        i.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        i.e(entry, "entry");
        int g3 = g(entry.getKey());
        if (g3 < 0) {
            return false;
        }
        Object[] objArr = this.f2523e;
        i.b(objArr);
        return i.a(objArr[g3], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f2532o;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f2532o = gVar2;
        return gVar2;
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
        return this.f2529l == map.size() && d(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f2522d;
        int length = objArr2.length;
        int i8 = this.i;
        int i9 = length - i8;
        int i10 = i8 - this.f2529l;
        if (i9 < i && i9 + i10 >= i && i10 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i11 = i8 + i;
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
            i.d(copyOf, "copyOf(...)");
            this.f2522d = copyOf;
            Object[] objArr3 = this.f2523e;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i12);
                i.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f2523e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f2524f, i12);
            i.d(copyOf2, "copyOf(...)");
            this.f2524f = copyOf2;
            int highestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (highestOneBit > this.f2525g.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i8 = this.f2526h;
        while (true) {
            int i9 = this.f2525g[i];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (i.a(this.f2522d[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            i = i == 0 ? this.f2525g.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g3 = g(obj);
        if (g3 < 0) {
            return null;
        }
        Object[] objArr = this.f2523e;
        i.b(objArr);
        return objArr[g3];
    }

    public final int h(Object obj) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f2524f[i] >= 0) {
                Object[] objArr = this.f2523e;
                i.b(objArr);
                if (i.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i8 = dVar.f2488d;
            f fVar = (f) dVar.f2491g;
            if (i8 >= fVar.i) {
                throw new NoSuchElementException();
            }
            dVar.f2488d = i8 + 1;
            dVar.f2489e = i8;
            Object obj = fVar.f2522d[i8];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f2523e;
            i.b(objArr);
            Object obj2 = objArr[dVar.f2489e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2527j;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2529l == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f2524f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.f2528k++;
        int i8 = 0;
        if (this.i > this.f2529l) {
            c(false);
        }
        this.f2525g = new int[i];
        this.f2527j = Integer.numberOfLeadingZeros(i) + 1;
        while (i8 < this.i) {
            int i9 = i8 + 1;
            int i10 = i(this.f2522d[i8]);
            int i11 = this.f2526h;
            while (true) {
                int[] iArr = this.f2525g;
                if (iArr[i10] == 0) {
                    break;
                }
                i11--;
                if (i11 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i10 = i10 == 0 ? iArr.length - 1 : i10 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        Object[] objArr = this.f2522d;
        i.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f2523e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i8 = this.f2524f[i];
        int i9 = this.f2526h * 2;
        int length = this.f2525g.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i8;
        while (true) {
            i8 = i8 == 0 ? this.f2525g.length - 1 : i8 - 1;
            i11++;
            if (i11 > this.f2526h) {
                this.f2525g[i12] = 0;
                break;
            }
            int[] iArr = this.f2525g;
            int i13 = iArr[i8];
            if (i13 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                int i15 = i(this.f2522d[i14]) - i8;
                int[] iArr2 = this.f2525g;
                if ((i15 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i13;
                    this.f2524f[i14] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f2525g[i12] = -1;
                    break;
                }
            }
            i12 = i8;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f2524f[i] = -1;
        this.f2529l--;
        this.f2528k++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f2530m;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f2530m = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a8 = a(obj);
        Object[] objArr = this.f2523e;
        if (objArr == null) {
            int length = this.f2522d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2523e = objArr;
        }
        if (a8 >= 0) {
            objArr[a8] = obj2;
            return null;
        }
        int i = (-a8) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        i.e(map, "from");
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a8 = a(entry.getKey());
            Object[] objArr = this.f2523e;
            if (objArr == null) {
                int length = this.f2522d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2523e = objArr;
            }
            if (a8 >= 0) {
                objArr[a8] = entry.getValue();
            } else {
                int i = (-a8) - 1;
                if (!i.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g3 = g(obj);
        if (g3 < 0) {
            return null;
        }
        Object[] objArr = this.f2523e;
        i.b(objArr);
        Object obj2 = objArr[g3];
        k(g3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2529l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2529l * 3) + 2);
        sb.append("{");
        int i = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i8 = dVar.f2488d;
            f fVar = (f) dVar.f2491g;
            if (i8 >= fVar.i) {
                throw new NoSuchElementException();
            }
            dVar.f2488d = i8 + 1;
            dVar.f2489e = i8;
            Object obj = fVar.f2522d[i8];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f2523e;
            i.b(objArr);
            Object obj2 = objArr[dVar.f2489e];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f2531n;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(0, this);
        this.f2531n = hVar2;
        return hVar2;
    }
}
