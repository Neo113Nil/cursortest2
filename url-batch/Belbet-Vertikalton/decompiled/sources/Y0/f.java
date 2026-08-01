package Y0;

import H1.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, k1.b {

    /* renamed from: n, reason: collision with root package name */
    public static final f f1404n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1405a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1406b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1407c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1408d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1409f;

    /* renamed from: g, reason: collision with root package name */
    public int f1410g;

    /* renamed from: h, reason: collision with root package name */
    public int f1411h;
    public int i;
    public g j;

    /* renamed from: k, reason: collision with root package name */
    public h f1412k;

    /* renamed from: l, reason: collision with root package name */
    public g f1413l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1414m;

    static {
        f fVar = new f(0);
        fVar.f1414m = true;
        f1404n = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i = this.e * 2;
            int length = this.f1408d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1408d;
                int i3 = iArr[j];
                if (i3 <= 0) {
                    int i4 = this.f1409f;
                    Object[] objArr = this.f1405a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f1409f = i5;
                        objArr[i4] = obj;
                        this.f1407c[i4] = j;
                        iArr[j] = i5;
                        this.i++;
                        this.f1411h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (j1.h.a(this.f1405a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.f1408d.length * 2);
                        break;
                    }
                    j = j == 0 ? this.f1408d.length - 1 : j - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f1414m = true;
        if (this.i > 0) {
            return this;
        }
        f fVar = f1404n;
        j1.h.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f1414m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f1409f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1407c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f1408d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        l.S(this.f1405a, 0, this.f1409f);
        Object[] objArr = this.f1406b;
        if (objArr != null) {
            l.S(objArr, 0, this.f1409f);
        }
        this.i = 0;
        this.f1409f = 0;
        this.f1411h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z2) {
        int i;
        Object[] objArr = this.f1406b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f1409f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f1407c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f1405a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.f1408d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        l.S(this.f1405a, i3, i);
        if (objArr != null) {
            l.S(objArr, i3, this.f1409f);
        }
        this.f1409f = i3;
    }

    public final boolean e(Collection collection) {
        j1.h.e(collection, "m");
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
        g gVar = this.f1413l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f1413l = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.i != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        j1.h.e(entry, "entry");
        int h2 = h(entry.getKey());
        if (h2 < 0) {
            return false;
        }
        Object[] objArr = this.f1406b;
        j1.h.b(objArr);
        return j1.h.a(objArr[h2], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f1405a;
        int length = objArr2.length;
        int i2 = this.f1409f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr2.length) {
            int length2 = objArr2.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i6);
            j1.h.d(copyOf, "copyOf(...)");
            this.f1405a = copyOf;
            Object[] objArr3 = this.f1406b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                j1.h.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f1406b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f1407c, i6);
            j1.h.d(copyOf2, "copyOf(...)");
            this.f1407c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.f1408d.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h2 = h(obj);
        if (h2 < 0) {
            return null;
        }
        Object[] objArr = this.f1406b;
        j1.h.b(objArr);
        return objArr[h2];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i = this.e;
        while (true) {
            int i2 = this.f1408d[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (j1.h.a(this.f1405a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.f1408d.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i2 = dVar.f699a;
            f fVar = (f) dVar.f702d;
            if (i2 >= fVar.f1409f) {
                throw new NoSuchElementException();
            }
            dVar.f699a = i2 + 1;
            dVar.f700b = i2;
            Object obj = fVar.f1405a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f1406b;
            j1.h.b(objArr);
            Object obj2 = objArr[dVar.f700b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f1409f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f1407c[i] >= 0) {
                Object[] objArr = this.f1406b;
                j1.h.b(objArr);
                if (j1.h.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f1410g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f1407c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        this.f1411h++;
        int i2 = 0;
        if (this.f1409f > this.i) {
            d(false);
        }
        this.f1408d = new int[i];
        this.f1410g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f1409f) {
            int i3 = i2 + 1;
            int j = j(this.f1405a[i2]);
            int i4 = this.e;
            while (true) {
                int[] iArr = this.f1408d;
                if (iArr[j] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j = j == 0 ? iArr.length - 1 : j - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.j;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.j = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        Object[] objArr = this.f1405a;
        j1.h.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f1406b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.f1407c[i];
        int i3 = this.e * 2;
        int length = this.f1408d.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.f1408d.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.e) {
                this.f1408d[i6] = 0;
                break;
            }
            int[] iArr = this.f1408d;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int j = j(this.f1405a[i8]) - i2;
                int[] iArr2 = this.f1408d;
                if ((j & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.f1407c[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.f1408d[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.f1407c[i] = -1;
        this.i--;
        this.f1411h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a2 = a(obj);
        Object[] objArr = this.f1406b;
        if (objArr == null) {
            int length = this.f1405a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f1406b = objArr;
        }
        if (a2 >= 0) {
            objArr[a2] = obj2;
            return null;
        }
        int i = (-a2) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j1.h.e(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.f1406b;
            if (objArr == null) {
                int length = this.f1405a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f1406b = objArr;
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!j1.h.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h2 = h(obj);
        if (h2 < 0) {
            return null;
        }
        Object[] objArr = this.f1406b;
        j1.h.b(objArr);
        Object obj2 = objArr[h2];
        l(h2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = dVar.f699a;
            f fVar = (f) dVar.f702d;
            if (i2 >= fVar.f1409f) {
                throw new NoSuchElementException();
            }
            dVar.f699a = i2 + 1;
            dVar.f700b = i2;
            Object obj = fVar.f1405a[i2];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f1406b;
            j1.h.b(objArr);
            Object obj2 = objArr[dVar.f700b];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        j1.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f1412k;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f1412k = hVar2;
        return hVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f1405a = objArr;
        this.f1406b = null;
        this.f1407c = iArr;
        this.f1408d = new int[highestOneBit];
        this.e = 2;
        this.f1409f = 0;
        this.f1410g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
