package T1;

import N.i;
import f2.j;
import g2.InterfaceC0442d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, InterfaceC0442d {

    /* renamed from: q, reason: collision with root package name */
    public static final f f4354q;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4355d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4356e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4357f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4358g;

    /* renamed from: h, reason: collision with root package name */
    public int f4359h;

    /* renamed from: i, reason: collision with root package name */
    public int f4360i;

    /* renamed from: j, reason: collision with root package name */
    public int f4361j;

    /* renamed from: k, reason: collision with root package name */
    public int f4362k;

    /* renamed from: l, reason: collision with root package name */
    public int f4363l;

    /* renamed from: m, reason: collision with root package name */
    public g f4364m;

    /* renamed from: n, reason: collision with root package name */
    public i f4365n;

    /* renamed from: o, reason: collision with root package name */
    public g f4366o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4367p;

    static {
        f fVar = new f(0);
        fVar.f4367p = true;
        f4354q = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j3 = j(obj);
            int i3 = this.f4359h * 2;
            int length = this.f4358g.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f4358g;
                int i5 = iArr[j3];
                if (i5 <= 0) {
                    int i6 = this.f4360i;
                    Object[] objArr = this.f4355d;
                    if (i6 < objArr.length) {
                        int i7 = i6 + 1;
                        this.f4360i = i7;
                        objArr[i6] = obj;
                        this.f4357f[i6] = j3;
                        iArr[j3] = i7;
                        this.f4363l++;
                        this.f4362k++;
                        if (i4 > this.f4359h) {
                            this.f4359h = i4;
                        }
                        return i6;
                    }
                    g(1);
                } else {
                    if (j.a(this.f4355d[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i3) {
                        k(this.f4358g.length * 2);
                        break;
                    }
                    j3 = j3 == 0 ? this.f4358g.length - 1 : j3 - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f4367p = true;
        if (this.f4363l > 0) {
            return this;
        }
        f fVar = f4354q;
        j.d(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f4367p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i3 = this.f4360i - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f4357f;
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    this.f4358g[i5] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        O2.d.d0(this.f4355d, 0, this.f4360i);
        Object[] objArr = this.f4356e;
        if (objArr != null) {
            O2.d.d0(objArr, 0, this.f4360i);
        }
        this.f4363l = 0;
        this.f4360i = 0;
        this.f4362k++;
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
        Object[] objArr = this.f4356e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = this.f4360i;
            if (i4 >= i3) {
                break;
            }
            int[] iArr = this.f4357f;
            int i6 = iArr[i4];
            if (i6 >= 0) {
                Object[] objArr2 = this.f4355d;
                objArr2[i5] = objArr2[i4];
                if (objArr != null) {
                    objArr[i5] = objArr[i4];
                }
                if (z3) {
                    iArr[i5] = i6;
                    this.f4358g[i6] = i5 + 1;
                }
                i5++;
            }
            i4++;
        }
        O2.d.d0(this.f4355d, i5, i3);
        if (objArr != null) {
            O2.d.d0(objArr, i5, this.f4360i);
        }
        this.f4360i = i5;
    }

    public final boolean e(Collection collection) {
        j.f(collection, "m");
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
        g gVar = this.f4366o;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f4366o = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f4363l != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        j.f(entry, "entry");
        int h3 = h(entry.getKey());
        if (h3 < 0) {
            return false;
        }
        Object[] objArr = this.f4356e;
        j.c(objArr);
        return j.a(objArr[h3], entry.getValue());
    }

    public final void g(int i3) {
        Object[] objArr;
        Object[] objArr2 = this.f4355d;
        int length = objArr2.length;
        int i4 = this.f4360i;
        int i5 = length - i4;
        int i6 = i4 - this.f4363l;
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
            j.e(copyOf, "copyOf(...)");
            this.f4355d = copyOf;
            Object[] objArr3 = this.f4356e;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i8);
                j.e(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f4356e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f4357f, i8);
            j.e(copyOf2, "copyOf(...)");
            this.f4357f = copyOf2;
            int highestOneBit = Integer.highestOneBit((i8 >= 1 ? i8 : 1) * 3);
            if (highestOneBit > this.f4358g.length) {
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
        Object[] objArr = this.f4356e;
        j.c(objArr);
        return objArr[h3];
    }

    public final int h(Object obj) {
        int j3 = j(obj);
        int i3 = this.f4359h;
        while (true) {
            int i4 = this.f4358g[j3];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (j.a(this.f4355d[i5], obj)) {
                    return i5;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            j3 = j3 == 0 ? this.f4358g.length - 1 : j3 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            int i4 = cVar.f4350d;
            f fVar = (f) cVar.f4353g;
            if (i4 >= fVar.f4360i) {
                throw new NoSuchElementException();
            }
            cVar.f4350d = i4 + 1;
            cVar.f4351e = i4;
            Object obj = fVar.f4355d[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f4356e;
            j.c(objArr);
            Object obj2 = objArr[cVar.f4351e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.c();
            i3 += hashCode ^ hashCode2;
        }
        return i3;
    }

    public final int i(Object obj) {
        int i3 = this.f4360i;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f4357f[i3] >= 0) {
                Object[] objArr = this.f4356e;
                j.c(objArr);
                if (j.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f4363l == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f4361j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f4357f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i3) {
        this.f4362k++;
        int i4 = 0;
        if (this.f4360i > this.f4363l) {
            d(false);
        }
        this.f4358g = new int[i3];
        this.f4361j = Integer.numberOfLeadingZeros(i3) + 1;
        while (i4 < this.f4360i) {
            int i5 = i4 + 1;
            int j3 = j(this.f4355d[i4]);
            int i6 = this.f4359h;
            while (true) {
                int[] iArr = this.f4358g;
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
        g gVar = this.f4364m;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f4364m = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i3) {
        Object[] objArr = this.f4355d;
        j.f(objArr, "<this>");
        objArr[i3] = null;
        Object[] objArr2 = this.f4356e;
        if (objArr2 != null) {
            objArr2[i3] = null;
        }
        int i4 = this.f4357f[i3];
        int i5 = this.f4359h * 2;
        int length = this.f4358g.length / 2;
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5;
        int i7 = 0;
        int i8 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f4358g.length - 1 : i4 - 1;
            i7++;
            if (i7 > this.f4359h) {
                this.f4358g[i8] = 0;
                break;
            }
            int[] iArr = this.f4358g;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i8] = 0;
                break;
            }
            if (i9 < 0) {
                iArr[i8] = -1;
            } else {
                int i10 = i9 - 1;
                int j3 = j(this.f4355d[i10]) - i4;
                int[] iArr2 = this.f4358g;
                if ((j3 & (iArr2.length - 1)) >= i7) {
                    iArr2[i8] = i9;
                    this.f4357f[i10] = i8;
                }
                i6--;
                if (i6 >= 0) {
                    this.f4358g[i8] = -1;
                    break;
                }
            }
            i8 = i4;
            i7 = 0;
            i6--;
            if (i6 >= 0) {
            }
        }
        this.f4357f[i3] = -1;
        this.f4363l--;
        this.f4362k++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a3 = a(obj);
        Object[] objArr = this.f4356e;
        if (objArr == null) {
            int length = this.f4355d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f4356e = objArr;
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
        j.f(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.f4356e;
            if (objArr == null) {
                int length = this.f4355d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f4356e = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i3 = (-a3) - 1;
                if (!j.a(entry.getValue(), objArr[i3])) {
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
        Object[] objArr = this.f4356e;
        j.c(objArr);
        Object obj2 = objArr[h3];
        l(h3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4363l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f4363l * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = cVar.f4350d;
            f fVar = (f) cVar.f4353g;
            if (i4 >= fVar.f4360i) {
                throw new NoSuchElementException();
            }
            cVar.f4350d = i4 + 1;
            cVar.f4351e = i4;
            Object obj = fVar.f4355d[i4];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f4356e;
            j.c(objArr);
            Object obj2 = objArr[cVar.f4351e];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.c();
            i3++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        j.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f4365n;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f4365n = iVar2;
        return iVar2;
    }

    public f(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i3];
        int[] iArr = new int[i3];
        int highestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
        this.f4355d = objArr;
        this.f4356e = null;
        this.f4357f = iArr;
        this.f4358g = new int[highestOneBit];
        this.f4359h = 2;
        this.f4360i = 0;
        this.f4361j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
