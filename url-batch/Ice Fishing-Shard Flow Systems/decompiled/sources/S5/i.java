package S5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.C0624c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements Map, Serializable, f6.d {

    /* renamed from: v, reason: collision with root package name */
    public static final f f2527v = new f(null);

    /* renamed from: w, reason: collision with root package name */
    public static final i f2528w;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2529d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2530e;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2531i;

    /* renamed from: l, reason: collision with root package name */
    public int[] f2532l;

    /* renamed from: m, reason: collision with root package name */
    public int f2533m;

    /* renamed from: n, reason: collision with root package name */
    public int f2534n;

    /* renamed from: o, reason: collision with root package name */
    public int f2535o;

    /* renamed from: p, reason: collision with root package name */
    public int f2536p;

    /* renamed from: q, reason: collision with root package name */
    public int f2537q;

    /* renamed from: r, reason: collision with root package name */
    public k f2538r;

    /* renamed from: s, reason: collision with root package name */
    public l f2539s;

    /* renamed from: t, reason: collision with root package name */
    public j f2540t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2541u;

    static {
        i iVar = new i(0);
        iVar.f2541u = true;
        f2528w = iVar;
    }

    public i() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i2 = this.f2533m * 2;
            int length = this.f2532l.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.f2532l;
                int i7 = iArr[j];
                if (i7 == 0) {
                    int i8 = this.f2534n;
                    Object[] objArr = this.f2529d;
                    if (i8 < objArr.length) {
                        int i9 = i8 + 1;
                        this.f2534n = i9;
                        objArr[i8] = obj;
                        this.f2531i[i8] = j;
                        iArr[j] = i9;
                        this.f2537q++;
                        this.f2536p++;
                        if (i5 > this.f2533m) {
                            this.f2533m = i5;
                        }
                        return i8;
                    }
                    g(1);
                } else {
                    if (Intrinsics.a(this.f2529d[i7 - 1], obj)) {
                        return -i7;
                    }
                    i5++;
                    if (i5 > i2) {
                        k(this.f2532l.length * 2);
                        break;
                    }
                    j = j == 0 ? this.f2532l.length - 1 : j - 1;
                }
            }
        }
    }

    public final i b() {
        c();
        this.f2541u = true;
        if (this.f2537q > 0) {
            return this;
        }
        i iVar = f2528w;
        Intrinsics.c(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    public final void c() {
        if (this.f2541u) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i2 = this.f2534n - 1;
        if (i2 >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f2531i;
                int i7 = iArr[i5];
                if (i7 >= 0) {
                    this.f2532l[i7] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i2) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        P0.f.F(this.f2529d, 0, this.f2534n);
        Object[] objArr = this.f2530e;
        if (objArr != null) {
            P0.f.F(objArr, 0, this.f2534n);
        }
        this.f2537q = 0;
        this.f2534n = 0;
        this.f2536p++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z7) {
        int i2;
        Object[] objArr = this.f2530e;
        int i5 = 0;
        int i7 = 0;
        while (true) {
            i2 = this.f2534n;
            if (i5 >= i2) {
                break;
            }
            int[] iArr = this.f2531i;
            int i8 = iArr[i5];
            if (i8 >= 0) {
                Object[] objArr2 = this.f2529d;
                objArr2[i7] = objArr2[i5];
                if (objArr != null) {
                    objArr[i7] = objArr[i5];
                }
                if (z7) {
                    iArr[i7] = i8;
                    this.f2532l[i8] = i7 + 1;
                }
                i7++;
            }
            i5++;
        }
        P0.f.F(this.f2529d, i7, i2);
        if (objArr != null) {
            P0.f.F(objArr, i7, this.f2534n);
        }
        this.f2534n = i7;
    }

    public final boolean e(Collection m2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        for (Object obj : m2) {
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
        j jVar = this.f2540t;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f2540t = jVar2;
        return jVar2;
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
        return this.f2537q == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int h7 = h(entry.getKey());
        if (h7 < 0) {
            return false;
        }
        Object[] objArr = this.f2530e;
        Intrinsics.b(objArr);
        return Intrinsics.a(objArr[h7], entry.getValue());
    }

    public final void g(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f2529d;
        int length = objArr2.length;
        int i5 = this.f2534n;
        int i7 = length - i5;
        int i8 = i5 - this.f2537q;
        if (i7 < i2 && i7 + i8 >= i2 && i8 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i9 = i5 + i2;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        if (i9 > objArr2.length) {
            C0624c c0624c = AbstractC0627f.f6131d;
            int length2 = objArr2.length;
            c0624c.getClass();
            int e7 = C0624c.e(length2, i9);
            Object[] objArr3 = this.f2529d;
            Intrinsics.checkNotNullParameter(objArr3, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr3, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f2529d = copyOf;
            Object[] objArr4 = this.f2530e;
            if (objArr4 != null) {
                Intrinsics.checkNotNullParameter(objArr4, "<this>");
                objArr = Arrays.copyOf(objArr4, e7);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f2530e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f2531i, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f2531i = copyOf2;
            f2527v.getClass();
            int highestOneBit = Integer.highestOneBit((e7 >= 1 ? e7 : 1) * 3);
            if (highestOneBit > this.f2532l.length) {
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
        Object[] objArr = this.f2530e;
        Intrinsics.b(objArr);
        return objArr[h7];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i2 = this.f2533m;
        while (true) {
            int i5 = this.f2532l[j];
            if (i5 == 0) {
                return -1;
            }
            int i7 = i5 - 1;
            if (Intrinsics.a(this.f2529d[i7], obj)) {
                return i7;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            j = j == 0 ? this.f2532l.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        g gVar = new g(this, 0);
        int i2 = 0;
        while (gVar.hasNext()) {
            int i5 = gVar.f1142d;
            i iVar = (i) gVar.f1145l;
            if (i5 >= iVar.f2534n) {
                throw new NoSuchElementException();
            }
            gVar.f1142d = i5 + 1;
            gVar.f1143e = i5;
            Object obj = iVar.f2529d[i5];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.f2530e;
            Intrinsics.b(objArr);
            Object obj2 = objArr[gVar.f1143e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gVar.e();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        int i2 = this.f2534n;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f2531i[i2] >= 0) {
                Object[] objArr = this.f2530e;
                Intrinsics.b(objArr);
                if (Intrinsics.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2537q == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2535o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f2531i[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i2) {
        this.f2536p++;
        int i5 = 0;
        if (this.f2534n > this.f2537q) {
            d(false);
        }
        this.f2532l = new int[i2];
        f2527v.getClass();
        this.f2535o = Integer.numberOfLeadingZeros(i2) + 1;
        while (i5 < this.f2534n) {
            int i7 = i5 + 1;
            int j = j(this.f2529d[i5]);
            int i8 = this.f2533m;
            while (true) {
                int[] iArr = this.f2532l;
                if (iArr[j] == 0) {
                    break;
                }
                i8--;
                if (i8 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j = j == 0 ? iArr.length - 1 : j - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.f2538r;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f2538r = kVar2;
        return kVar2;
    }

    public final void l(int i2) {
        int i5;
        int i7;
        int j;
        int[] iArr;
        Object[] objArr = this.f2529d;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f2530e;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i2] = null;
        }
        int i8 = this.f2531i[i2];
        loop0: while (true) {
            int i9 = i8;
            int i10 = 0;
            do {
                i8 = i8 == 0 ? this.f2532l.length - 1 : i8 - 1;
                int[] iArr2 = this.f2532l;
                i5 = iArr2[i8];
                i10++;
                if (i10 > this.f2533m) {
                    iArr2[i9] = 0;
                    break loop0;
                } else if (i5 == 0) {
                    iArr2[i9] = 0;
                    break loop0;
                } else {
                    i7 = i5 - 1;
                    j = j(this.f2529d[i7]) - i8;
                    iArr = this.f2532l;
                }
            } while ((j & (iArr.length - 1)) < i10);
            iArr[i9] = i5;
            this.f2531i[i7] = i9;
        }
        this.f2531i[i2] = -1;
        this.f2537q--;
        this.f2536p++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a7 = a(obj);
        Object[] objArr = this.f2530e;
        if (objArr == null) {
            int length = this.f2529d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2530e = objArr;
        }
        if (a7 >= 0) {
            objArr[a7] = obj2;
            return null;
        }
        int i2 = (-a7) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a7 = a(entry.getKey());
            Object[] objArr = this.f2530e;
            if (objArr == null) {
                int length = this.f2529d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2530e = objArr;
            }
            if (a7 >= 0) {
                objArr[a7] = entry.getValue();
            } else {
                int i2 = (-a7) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
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
        Object[] objArr = this.f2530e;
        Intrinsics.b(objArr);
        Object obj2 = objArr[h7];
        l(h7);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2537q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2537q * 3) + 2);
        sb.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        int i2 = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb, "sb");
            int i5 = gVar.f1142d;
            i iVar = (i) gVar.f1145l;
            if (i5 >= iVar.f2534n) {
                throw new NoSuchElementException();
            }
            gVar.f1142d = i5 + 1;
            gVar.f1143e = i5;
            Object obj = iVar.f2529d[i5];
            if (obj == iVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = iVar.f2530e;
            Intrinsics.b(objArr);
            Object obj2 = objArr[gVar.f1143e];
            if (obj2 == iVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            gVar.e();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.f2539s;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f2539s = lVar2;
        return lVar2;
    }

    public i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        f2527v.getClass();
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f2529d = objArr;
        this.f2530e = null;
        this.f2531i = iArr;
        this.f2532l = new int[highestOneBit];
        this.f2533m = 2;
        this.f2534n = 0;
        this.f2535o = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
