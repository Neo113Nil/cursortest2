package W0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, h1.b {

    /* renamed from: n, reason: collision with root package name */
    public static final f f908n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f909a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f910b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f911c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f912e;

    /* renamed from: f, reason: collision with root package name */
    public int f913f;

    /* renamed from: g, reason: collision with root package name */
    public int f914g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public g f915j;

    /* renamed from: k, reason: collision with root package name */
    public h f916k;

    /* renamed from: l, reason: collision with root package name */
    public g f917l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f918m;

    static {
        f fVar = new f(0);
        fVar.f918m = true;
        f908n = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j2 = j(obj);
            int i = this.f912e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[j2];
                if (i3 <= 0) {
                    int i4 = this.f913f;
                    Object[] objArr = this.f909a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f913f = i5;
                        objArr[i4] = obj;
                        this.f911c[i4] = j2;
                        iArr[j2] = i5;
                        this.i++;
                        this.h++;
                        if (i2 > this.f912e) {
                            this.f912e = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (g1.f.a(this.f909a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.d.length * 2);
                        break;
                    }
                    j2 = j2 == 0 ? this.d.length - 1 : j2 - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f918m = true;
        if (this.i > 0) {
            return this;
        }
        f fVar = f908n;
        g1.f.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f918m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f913f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f911c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        T.d.M(this.f909a, 0, this.f913f);
        Object[] objArr = this.f910b;
        if (objArr != null) {
            T.d.M(objArr, 0, this.f913f);
        }
        this.i = 0;
        this.f913f = 0;
        this.h++;
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
        Object[] objArr = this.f910b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f913f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f911c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f909a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        T.d.M(this.f909a, i3, i);
        if (objArr != null) {
            T.d.M(objArr, i3, this.f913f);
        }
        this.f913f = i3;
    }

    public final boolean e(Collection collection) {
        g1.f.e(collection, "m");
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
        g gVar = this.f917l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f917l = gVar2;
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
        g1.f.e(entry, "entry");
        int h = h(entry.getKey());
        if (h < 0) {
            return false;
        }
        Object[] objArr = this.f910b;
        g1.f.b(objArr);
        return g1.f.a(objArr[h], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f909a;
        int length = objArr2.length;
        int i2 = this.f913f;
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
            g1.f.d(copyOf, "copyOf(...)");
            this.f909a = copyOf;
            Object[] objArr3 = this.f910b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                g1.f.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f910b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f911c, i6);
            g1.f.d(copyOf2, "copyOf(...)");
            this.f911c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.d.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.f910b;
        g1.f.b(objArr);
        return objArr[h];
    }

    public final int h(Object obj) {
        int j2 = j(obj);
        int i = this.f912e;
        while (true) {
            int i2 = this.d[j2];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (g1.f.a(this.f909a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j2 = j2 == 0 ? this.d.length - 1 : j2 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i2 = dVar.f355a;
            f fVar = (f) dVar.d;
            if (i2 >= fVar.f913f) {
                throw new NoSuchElementException();
            }
            dVar.f355a = i2 + 1;
            dVar.f356b = i2;
            Object obj = fVar.f909a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f910b;
            g1.f.b(objArr);
            Object obj2 = objArr[dVar.f356b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f913f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f911c[i] >= 0) {
                Object[] objArr = this.f910b;
                g1.f.b(objArr);
                if (g1.f.a(objArr[i], obj)) {
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
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f914g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f911c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        this.h++;
        int i2 = 0;
        if (this.f913f > this.i) {
            d(false);
        }
        this.d = new int[i];
        this.f914g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f913f) {
            int i3 = i2 + 1;
            int j2 = j(this.f909a[i2]);
            int i4 = this.f912e;
            while (true) {
                int[] iArr = this.d;
                if (iArr[j2] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j2 = j2 == 0 ? iArr.length - 1 : j2 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f915j;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f915j = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        Object[] objArr = this.f909a;
        g1.f.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f910b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.f911c[i];
        int i3 = this.f912e * 2;
        int length = this.d.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.d.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.f912e) {
                this.d[i6] = 0;
                break;
            }
            int[] iArr = this.d;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int j2 = j(this.f909a[i8]) - i2;
                int[] iArr2 = this.d;
                if ((j2 & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.f911c[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.d[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.f911c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a2 = a(obj);
        Object[] objArr = this.f910b;
        if (objArr == null) {
            int length = this.f909a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f910b = objArr;
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
        g1.f.e(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.f910b;
            if (objArr == null) {
                int length = this.f909a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f910b = objArr;
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!g1.f.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.f910b;
        g1.f.b(objArr);
        Object obj2 = objArr[h];
        l(h);
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
            int i2 = dVar.f355a;
            f fVar = (f) dVar.d;
            if (i2 >= fVar.f913f) {
                throw new NoSuchElementException();
            }
            dVar.f355a = i2 + 1;
            dVar.f356b = i2;
            Object obj = fVar.f909a[i2];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f910b;
            g1.f.b(objArr);
            Object obj2 = objArr[dVar.f356b];
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
        g1.f.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f916k;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f916k = hVar2;
        return hVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f909a = objArr;
        this.f910b = null;
        this.f911c = iArr;
        this.d = new int[highestOneBit];
        this.f912e = 2;
        this.f913f = 0;
        this.f914g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
