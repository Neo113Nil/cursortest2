package F0;

import a.AbstractC0086a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Map, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final f f476r;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f477e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f478f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f479g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f480h;

    /* renamed from: i, reason: collision with root package name */
    public int f481i;

    /* renamed from: j, reason: collision with root package name */
    public int f482j;

    /* renamed from: k, reason: collision with root package name */
    public int f483k;

    /* renamed from: l, reason: collision with root package name */
    public int f484l;

    /* renamed from: m, reason: collision with root package name */
    public int f485m;

    /* renamed from: n, reason: collision with root package name */
    public g f486n;

    /* renamed from: o, reason: collision with root package name */
    public h f487o;

    /* renamed from: p, reason: collision with root package name */
    public g f488p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f489q;

    static {
        f fVar = new f(0);
        fVar.f489q = true;
        f476r = fVar;
    }

    public f(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f477e = objArr;
        this.f478f = null;
        this.f479g = iArr;
        this.f480h = new int[highestOneBit];
        this.f481i = 2;
        this.f482j = 0;
        this.f483k = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i2 = i(obj);
            int i3 = this.f481i * 2;
            int length = this.f480h.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f480h;
                int i5 = iArr[i2];
                if (i5 <= 0) {
                    int i6 = this.f482j;
                    Object[] objArr = this.f477e;
                    if (i6 < objArr.length) {
                        int i7 = i6 + 1;
                        this.f482j = i7;
                        objArr[i6] = obj;
                        this.f479g[i6] = i2;
                        iArr[i2] = i7;
                        this.f485m++;
                        this.f484l++;
                        if (i4 > this.f481i) {
                            this.f481i = i4;
                        }
                        return i6;
                    }
                    f(1);
                } else {
                    if (P0.h.a(this.f477e[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i3) {
                        j(this.f480h.length * 2);
                        break;
                    }
                    i2 = i2 == 0 ? this.f480h.length - 1 : i2 - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f489q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z2) {
        int i2;
        Object[] objArr = this.f478f;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.f482j;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f479g;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                Object[] objArr2 = this.f477e;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z2) {
                    iArr[i4] = i5;
                    this.f480h[i5] = i4 + 1;
                }
                i4++;
            }
            i3++;
        }
        AbstractC0086a.D(this.f477e, i4, i2);
        if (objArr != null) {
            AbstractC0086a.D(objArr, i4, this.f482j);
        }
        this.f482j = i4;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i2 = this.f482j - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f479g;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.f480h[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC0086a.D(this.f477e, 0, this.f482j);
        Object[] objArr = this.f478f;
        if (objArr != null) {
            AbstractC0086a.D(objArr, 0, this.f482j);
        }
        this.f485m = 0;
        this.f482j = 0;
        this.f484l++;
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
        P0.h.e(collection, "m");
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
        P0.h.e(entry, "entry");
        int g2 = g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        Object[] objArr = this.f478f;
        P0.h.b(objArr);
        return P0.h.a(objArr[g2], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f488p;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f488p = gVar2;
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
        return this.f485m == map.size() && d(map.entrySet());
    }

    public final void f(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f477e;
        int length = objArr2.length;
        int i3 = this.f482j;
        int i4 = length - i3;
        int i5 = i3 - this.f485m;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr2.length) {
            int length2 = objArr2.length;
            int i7 = length2 + (length2 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i7);
            P0.h.d(copyOf, "copyOf(...)");
            this.f477e = copyOf;
            Object[] objArr3 = this.f478f;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i7);
                P0.h.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f478f = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f479g, i7);
            P0.h.d(copyOf2, "copyOf(...)");
            this.f479g = copyOf2;
            int highestOneBit = Integer.highestOneBit((i7 >= 1 ? i7 : 1) * 3);
            if (highestOneBit > this.f480h.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i2 = i(obj);
        int i3 = this.f481i;
        while (true) {
            int i4 = this.f480h[i2];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (P0.h.a(this.f477e[i5], obj)) {
                    return i5;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            i2 = i2 == 0 ? this.f480h.length - 1 : i2 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f478f;
        P0.h.b(objArr);
        return objArr[g2];
    }

    public final int h(Object obj) {
        int i2 = this.f482j;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f479g[i2] >= 0) {
                Object[] objArr = this.f478f;
                P0.h.b(objArr);
                if (P0.h.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i2 = 0;
        while (dVar.hasNext()) {
            int i3 = dVar.f469f;
            f fVar = dVar.f468e;
            if (i3 >= fVar.f482j) {
                throw new NoSuchElementException();
            }
            dVar.f469f = i3 + 1;
            dVar.f470g = i3;
            Object obj = fVar.f477e[i3];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f478f;
            P0.h.b(objArr);
            Object obj2 = objArr[dVar.f470g];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.b();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f483k;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f485m == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f479g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i2) {
        this.f484l++;
        int i3 = 0;
        if (this.f482j > this.f485m) {
            c(false);
        }
        this.f480h = new int[i2];
        this.f483k = Integer.numberOfLeadingZeros(i2) + 1;
        while (i3 < this.f482j) {
            int i4 = i3 + 1;
            int i5 = i(this.f477e[i3]);
            int i6 = this.f481i;
            while (true) {
                int[] iArr = this.f480h;
                if (iArr[i5] == 0) {
                    break;
                }
                i6--;
                if (i6 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i5 = i5 == 0 ? iArr.length - 1 : i5 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i2) {
        Object[] objArr = this.f477e;
        P0.h.e(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f478f;
        if (objArr2 != null) {
            objArr2[i2] = null;
        }
        int i3 = this.f479g[i2];
        int i4 = this.f481i * 2;
        int length = this.f480h.length / 2;
        if (i4 > length) {
            i4 = length;
        }
        int i5 = i4;
        int i6 = 0;
        int i7 = i3;
        while (true) {
            i3 = i3 == 0 ? this.f480h.length - 1 : i3 - 1;
            i6++;
            if (i6 > this.f481i) {
                this.f480h[i7] = 0;
                break;
            }
            int[] iArr = this.f480h;
            int i8 = iArr[i3];
            if (i8 == 0) {
                iArr[i7] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i7] = -1;
            } else {
                int i9 = i8 - 1;
                int i10 = i(this.f477e[i9]) - i3;
                int[] iArr2 = this.f480h;
                if ((i10 & (iArr2.length - 1)) >= i6) {
                    iArr2[i7] = i8;
                    this.f479g[i9] = i7;
                }
                i5--;
                if (i5 >= 0) {
                    this.f480h[i7] = -1;
                    break;
                }
            }
            i7 = i3;
            i6 = 0;
            i5--;
            if (i5 >= 0) {
            }
        }
        this.f479g[i2] = -1;
        this.f485m--;
        this.f484l++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f486n;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f486n = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a2 = a(obj);
        Object[] objArr = this.f478f;
        if (objArr == null) {
            int length = this.f477e.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f478f = objArr;
        }
        if (a2 >= 0) {
            objArr[a2] = obj2;
            return null;
        }
        int i2 = (-a2) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        P0.h.e(map, "from");
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.f478f;
            if (objArr == null) {
                int length = this.f477e.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f478f = objArr;
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i2 = (-a2) - 1;
                if (!P0.h.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f478f;
        P0.h.b(objArr);
        Object obj2 = objArr[g2];
        k(g2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f485m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f485m * 3) + 2);
        sb.append("{");
        int i2 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = dVar.f469f;
            f fVar = dVar.f468e;
            if (i3 >= fVar.f482j) {
                throw new NoSuchElementException();
            }
            dVar.f469f = i3 + 1;
            dVar.f470g = i3;
            Object obj = fVar.f477e[i3];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f478f;
            P0.h.b(objArr);
            Object obj2 = objArr[dVar.f470g];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.b();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        P0.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f487o;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f487o = hVar2;
        return hVar2;
    }
}
