package N1;

import M1.B;
import a2.InterfaceC0187d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Map, Serializable, InterfaceC0187d {

    /* renamed from: q, reason: collision with root package name */
    public static final g f2875q;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2876d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2877e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2878f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2879g;

    /* renamed from: h, reason: collision with root package name */
    public int f2880h;

    /* renamed from: i, reason: collision with root package name */
    public int f2881i;

    /* renamed from: j, reason: collision with root package name */
    public int f2882j;

    /* renamed from: k, reason: collision with root package name */
    public int f2883k;

    /* renamed from: l, reason: collision with root package name */
    public int f2884l;

    /* renamed from: m, reason: collision with root package name */
    public h f2885m;

    /* renamed from: n, reason: collision with root package name */
    public N.i f2886n;

    /* renamed from: o, reason: collision with root package name */
    public h f2887o;
    public boolean p;

    static {
        g gVar = new g(0);
        gVar.p = true;
        f2875q = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j3 = j(obj);
            int i3 = this.f2880h * 2;
            int length = this.f2879g.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f2879g;
                int i5 = iArr[j3];
                if (i5 <= 0) {
                    int i6 = this.f2881i;
                    Object[] objArr = this.f2876d;
                    if (i6 < objArr.length) {
                        int i7 = i6 + 1;
                        this.f2881i = i7;
                        objArr[i6] = obj;
                        this.f2878f[i6] = j3;
                        iArr[j3] = i7;
                        this.f2884l++;
                        this.f2883k++;
                        if (i4 > this.f2880h) {
                            this.f2880h = i4;
                        }
                        return i6;
                    }
                    g(1);
                } else {
                    if (Z1.i.a(this.f2876d[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i3) {
                        k(this.f2879g.length * 2);
                        break;
                    }
                    j3 = j3 == 0 ? this.f2879g.length - 1 : j3 - 1;
                }
            }
        }
    }

    public final g b() {
        c();
        this.p = true;
        if (this.f2884l > 0) {
            return this;
        }
        g gVar = f2875q;
        Z1.i.d(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void c() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i3 = this.f2881i - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f2878f;
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    this.f2879g[i5] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        B.L(this.f2876d, 0, this.f2881i);
        Object[] objArr = this.f2877e;
        if (objArr != null) {
            B.L(objArr, 0, this.f2881i);
        }
        this.f2884l = 0;
        this.f2881i = 0;
        this.f2883k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z3) {
        int i3;
        Object[] objArr = this.f2877e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = this.f2881i;
            if (i4 >= i3) {
                break;
            }
            int[] iArr = this.f2878f;
            int i6 = iArr[i4];
            if (i6 >= 0) {
                Object[] objArr2 = this.f2876d;
                objArr2[i5] = objArr2[i4];
                if (objArr != null) {
                    objArr[i5] = objArr[i4];
                }
                if (z3) {
                    iArr[i5] = i6;
                    this.f2879g[i6] = i5 + 1;
                }
                i5++;
            }
            i4++;
        }
        B.L(this.f2876d, i5, i3);
        if (objArr != null) {
            B.L(objArr, i5, this.f2881i);
        }
        this.f2881i = i5;
    }

    public final boolean e(Collection collection) {
        Z1.i.f(collection, "m");
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
        h hVar = this.f2887o;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f2887o = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f2884l != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        Z1.i.f(entry, "entry");
        int h3 = h(entry.getKey());
        if (h3 < 0) {
            return false;
        }
        Object[] objArr = this.f2877e;
        Z1.i.c(objArr);
        return Z1.i.a(objArr[h3], entry.getValue());
    }

    public final void g(int i3) {
        Object[] objArr;
        Object[] objArr2 = this.f2876d;
        int length = objArr2.length;
        int i4 = this.f2881i;
        int i5 = length - i4;
        int i6 = i4 - this.f2884l;
        if (i5 < i3 && i5 + i6 >= i3 && i6 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i7 = i4 + i3;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > objArr2.length) {
            int length2 = objArr2.length;
            int i8 = length2 + (length2 >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i8);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f2876d = copyOf;
            Object[] objArr3 = this.f2877e;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i8);
                Z1.i.e(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f2877e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f2878f, i8);
            Z1.i.e(copyOf2, "copyOf(...)");
            this.f2878f = copyOf2;
            int highestOneBit = Integer.highestOneBit((i8 >= 1 ? i8 : 1) * 3);
            if (highestOneBit > this.f2879g.length) {
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
        Object[] objArr = this.f2877e;
        Z1.i.c(objArr);
        return objArr[h3];
    }

    public final int h(Object obj) {
        int j3 = j(obj);
        int i3 = this.f2880h;
        while (true) {
            int i4 = this.f2879g[j3];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (Z1.i.a(this.f2876d[i5], obj)) {
                    return i5;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            j3 = j3 == 0 ? this.f2879g.length - 1 : j3 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i3 = 0;
        while (dVar.hasNext()) {
            int i4 = dVar.f2871d;
            g gVar = (g) dVar.f2874g;
            if (i4 >= gVar.f2881i) {
                throw new NoSuchElementException();
            }
            dVar.f2871d = i4 + 1;
            dVar.f2872e = i4;
            Object obj = gVar.f2876d[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f2877e;
            Z1.i.c(objArr);
            Object obj2 = objArr[dVar.f2872e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i3 += hashCode ^ hashCode2;
        }
        return i3;
    }

    public final int i(Object obj) {
        int i3 = this.f2881i;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f2878f[i3] >= 0) {
                Object[] objArr = this.f2877e;
                Z1.i.c(objArr);
                if (Z1.i.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2884l == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2882j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f2878f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i3) {
        this.f2883k++;
        int i4 = 0;
        if (this.f2881i > this.f2884l) {
            d(false);
        }
        this.f2879g = new int[i3];
        this.f2882j = Integer.numberOfLeadingZeros(i3) + 1;
        while (i4 < this.f2881i) {
            int i5 = i4 + 1;
            int j3 = j(this.f2876d[i4]);
            int i6 = this.f2880h;
            while (true) {
                int[] iArr = this.f2879g;
                if (iArr[j3] == 0) {
                    break;
                }
                i6--;
                if (i6 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j3 = j3 == 0 ? iArr.length - 1 : j3 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f2885m;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f2885m = hVar2;
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i3) {
        Object[] objArr = this.f2876d;
        Z1.i.f(objArr, "<this>");
        objArr[i3] = null;
        Object[] objArr2 = this.f2877e;
        if (objArr2 != null) {
            objArr2[i3] = null;
        }
        int i4 = this.f2878f[i3];
        int i5 = this.f2880h * 2;
        int length = this.f2879g.length / 2;
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5;
        int i7 = 0;
        int i8 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f2879g.length - 1 : i4 - 1;
            i7++;
            if (i7 > this.f2880h) {
                this.f2879g[i8] = 0;
                break;
            }
            int[] iArr = this.f2879g;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i8] = 0;
                break;
            }
            if (i9 < 0) {
                iArr[i8] = -1;
            } else {
                int i10 = i9 - 1;
                int j3 = j(this.f2876d[i10]) - i4;
                int[] iArr2 = this.f2879g;
                if ((j3 & (iArr2.length - 1)) >= i7) {
                    iArr2[i8] = i9;
                    this.f2878f[i10] = i8;
                }
                i6--;
                if (i6 >= 0) {
                    this.f2879g[i8] = -1;
                    break;
                }
            }
            i8 = i4;
            i7 = 0;
            i6--;
            if (i6 >= 0) {
            }
        }
        this.f2878f[i3] = -1;
        this.f2884l--;
        this.f2883k++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a3 = a(obj);
        Object[] objArr = this.f2877e;
        if (objArr == null) {
            int length = this.f2876d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2877e = objArr;
        }
        if (a3 >= 0) {
            objArr[a3] = obj2;
            return null;
        }
        int i3 = (-a3) - 1;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        Z1.i.f(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.f2877e;
            if (objArr == null) {
                int length = this.f2876d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2877e = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i3 = (-a3) - 1;
                if (!Z1.i.a(entry.getValue(), objArr[i3])) {
                    objArr[i3] = entry.getValue();
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
        Object[] objArr = this.f2877e;
        Z1.i.c(objArr);
        Object obj2 = objArr[h3];
        l(h3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2884l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2884l * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i3 = 0;
        while (dVar.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = dVar.f2871d;
            g gVar = (g) dVar.f2874g;
            if (i4 >= gVar.f2881i) {
                throw new NoSuchElementException();
            }
            dVar.f2871d = i4 + 1;
            dVar.f2872e = i4;
            Object obj = gVar.f2876d[i4];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gVar.f2877e;
            Z1.i.c(objArr);
            Object obj2 = objArr[dVar.f2872e];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i3++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        N.i iVar = this.f2886n;
        if (iVar != null) {
            return iVar;
        }
        N.i iVar2 = new N.i(this);
        this.f2886n = iVar2;
        return iVar2;
    }

    public g(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i3];
        int[] iArr = new int[i3];
        int highestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
        this.f2876d = objArr;
        this.f2877e = null;
        this.f2878f = iArr;
        this.f2879g = new int[highestOneBit];
        this.f2880h = 2;
        this.f2881i = 0;
        this.f2882j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
