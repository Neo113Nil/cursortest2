package id;

import a2.r;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements Map, Serializable, xd.e {
    public static final e B = new e(null);
    public static final h C;
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4694d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4695e;

    /* renamed from: i, reason: collision with root package name */
    public int[] f4696i;

    /* renamed from: r, reason: collision with root package name */
    public int[] f4697r;

    /* renamed from: s, reason: collision with root package name */
    public int f4698s;

    /* renamed from: t, reason: collision with root package name */
    public int f4699t;

    /* renamed from: u, reason: collision with root package name */
    public int f4700u;

    /* renamed from: v, reason: collision with root package name */
    public int f4701v;

    /* renamed from: w, reason: collision with root package name */
    public int f4702w;

    /* renamed from: x, reason: collision with root package name */
    public u0.e f4703x;

    /* renamed from: y, reason: collision with root package name */
    public j f4704y;

    /* renamed from: z, reason: collision with root package name */
    public i f4705z;

    static {
        h hVar = new h(0);
        hVar.A = true;
        C = hVar;
    }

    public h(int i3) {
        if (i3 < 0) {
            a1.e("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i3];
        int[] iArr = new int[i3];
        B.getClass();
        int highestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
        this.f4694d = objArr;
        this.f4695e = null;
        this.f4696i = iArr;
        this.f4697r = new int[highestOneBit];
        this.f4698s = 2;
        this.f4699t = 0;
        this.f4700u = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i3 = i(obj);
            int i10 = this.f4698s * 2;
            int length = this.f4697r.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f4697r;
                int i12 = iArr[i3];
                if (i12 == 0) {
                    int i13 = this.f4699t;
                    Object[] objArr = this.f4694d;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f4699t = i14;
                        objArr[i13] = obj;
                        this.f4696i[i13] = i3;
                        iArr[i3] = i14;
                        this.f4702w++;
                        this.f4701v++;
                        if (i11 > this.f4698s) {
                            this.f4698s = i11;
                        }
                        return i13;
                    }
                    f(1);
                } else {
                    if (Intrinsics.a(this.f4694d[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        j(this.f4697r.length * 2);
                        break;
                    }
                    i3 = i3 == 0 ? this.f4697r.length - 1 : i3 - 1;
                }
            }
        }
    }

    public final h b() {
        c();
        this.A = true;
        if (this.f4702w > 0) {
            return this;
        }
        h hVar = C;
        hVar.getClass();
        return hVar;
    }

    public final void c() {
        if (this.A) {
            r.a();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i3 = this.f4699t - 1;
        if (i3 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f4696i;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f4697r[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i3) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        k7.e.M(this.f4694d, 0, this.f4699t);
        Object[] objArr = this.f4695e;
        if (objArr != null) {
            k7.e.M(objArr, 0, this.f4699t);
        }
        this.f4702w = 0;
        this.f4699t = 0;
        this.f4701v++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z10) {
        int i3;
        Object[] objArr = this.f4695e;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = this.f4699t;
            if (i10 >= i3) {
                break;
            }
            int[] iArr = this.f4696i;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f4694d;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z10) {
                    iArr[i11] = i12;
                    this.f4697r[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        k7.e.M(this.f4694d, i11, i3);
        if (objArr != null) {
            k7.e.M(objArr, i11, this.f4699t);
        }
        this.f4699t = i11;
    }

    public final boolean e(Collection collection) {
        boolean a9;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        a9 = false;
                    } else {
                        Object[] objArr = this.f4695e;
                        objArr.getClass();
                        a9 = Intrinsics.a(objArr[g], entry.getValue());
                    }
                    if (!a9) {
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
        i iVar = this.f4705z;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f4705z = iVar2;
        return iVar2;
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
        return this.f4702w == map.size() && e(map.entrySet());
    }

    public final void f(int i3) {
        Object[] objArr = this.f4694d;
        int length = objArr.length;
        int i10 = this.f4699t;
        int i11 = length - i10;
        int i12 = i10 - this.f4702w;
        if (i11 < i3 && i11 + i12 >= i3 && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i3;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.f5563d;
            int length2 = objArr.length;
            cVar.getClass();
            int d10 = kotlin.collections.c.d(length2, i13);
            Object[] objArr2 = this.f4694d;
            objArr2.getClass();
            this.f4694d = Arrays.copyOf(objArr2, d10);
            Object[] objArr3 = this.f4695e;
            this.f4695e = objArr3 != null ? Arrays.copyOf(objArr3, d10) : null;
            this.f4696i = Arrays.copyOf(this.f4696i, d10);
            B.getClass();
            int highestOneBit = Integer.highestOneBit((d10 >= 1 ? d10 : 1) * 3);
            if (highestOneBit > this.f4697r.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i3 = i(obj);
        int i10 = this.f4698s;
        while (true) {
            int i11 = this.f4697r[i3];
            if (i11 == 0) {
                return -1;
            }
            int i12 = i11 - 1;
            if (Intrinsics.a(this.f4694d[i12], obj)) {
                return i12;
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            i3 = i3 == 0 ? this.f4697r.length - 1 : i3 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.f4695e;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i3 = this.f4699t;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f4696i[i3] >= 0) {
                Object[] objArr = this.f4695e;
                objArr.getClass();
                if (Intrinsics.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        f fVar = new f(this, 0);
        int i3 = 0;
        while (fVar.hasNext()) {
            int i10 = fVar.f3616d;
            h hVar = (h) fVar.f3619r;
            if (i10 >= hVar.f4699t) {
                i0.c();
                return 0;
            }
            fVar.f3616d = i10 + 1;
            fVar.f3617e = i10;
            Object obj = hVar.f4694d[i10];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = hVar.f4695e;
            objArr.getClass();
            Object obj2 = objArr[fVar.f3617e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fVar.c();
            i3 += hashCode ^ hashCode2;
        }
        return i3;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f4700u;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f4702w == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f4696i[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i3) {
        this.f4701v++;
        int i10 = 0;
        if (this.f4699t > this.f4702w) {
            d(false);
        }
        this.f4697r = new int[i3];
        B.getClass();
        this.f4700u = Integer.numberOfLeadingZeros(i3) + 1;
        while (i10 < this.f4699t) {
            int i11 = i10 + 1;
            int i12 = i(this.f4694d[i10]);
            int i13 = this.f4698s;
            while (true) {
                int[] iArr = this.f4697r;
                if (iArr[i12] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    i0.l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i12 = i12 == 0 ? iArr.length - 1 : i12 - 1;
            }
        }
    }

    public final void k(int i3) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        Object[] objArr = this.f4694d;
        objArr.getClass();
        objArr[i3] = null;
        Object[] objArr2 = this.f4695e;
        if (objArr2 != null) {
            objArr2[i3] = null;
        }
        int i13 = this.f4696i[i3];
        loop0: while (true) {
            int i14 = i13;
            int i15 = 0;
            do {
                i13 = i13 == 0 ? this.f4697r.length - 1 : i13 - 1;
                int[] iArr2 = this.f4697r;
                i10 = iArr2[i13];
                i15++;
                if (i15 > this.f4698s) {
                    iArr2[i14] = 0;
                    break loop0;
                } else if (i10 == 0) {
                    iArr2[i14] = 0;
                    break loop0;
                } else {
                    i11 = i10 - 1;
                    i12 = i(this.f4694d[i11]) - i13;
                    iArr = this.f4697r;
                }
            } while ((i12 & (iArr.length - 1)) < i15);
            iArr[i14] = i10;
            this.f4696i[i11] = i14;
        }
        this.f4696i[i3] = -1;
        this.f4702w--;
        this.f4701v++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        u0.e eVar = this.f4703x;
        if (eVar != null) {
            return eVar;
        }
        u0.e eVar2 = new u0.e(2, this);
        this.f4703x = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a9 = a(obj);
        Object[] objArr = this.f4695e;
        if (objArr == null) {
            int length = this.f4694d.length;
            if (length < 0) {
                a1.e("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f4695e = objArr;
        }
        if (a9 >= 0) {
            objArr[a9] = obj2;
            return null;
        }
        int i3 = (-a9) - 1;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a9 = a(entry.getKey());
            Object[] objArr = this.f4695e;
            if (objArr == null) {
                int length = this.f4694d.length;
                if (length < 0) {
                    a1.e("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f4695e = objArr;
                }
            }
            if (a9 >= 0) {
                objArr[a9] = entry.getValue();
            } else {
                int i3 = (-a9) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i3])) {
                    objArr[i3] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.f4695e;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4702w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f4702w * 3) + 2);
        sb2.append("{");
        int i3 = 0;
        f fVar = new f(this, 0);
        while (fVar.hasNext()) {
            if (i3 > 0) {
                sb2.append(", ");
            }
            int i10 = fVar.f3616d;
            h hVar = (h) fVar.f3619r;
            if (i10 >= hVar.f4699t) {
                i0.c();
                return null;
            }
            fVar.f3616d = i10 + 1;
            fVar.f3617e = i10;
            Object obj = hVar.f4694d[i10];
            if (obj == hVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = hVar.f4695e;
            objArr.getClass();
            Object obj2 = objArr[fVar.f3617e];
            if (obj2 == hVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            fVar.c();
            i3++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f4704y;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(0, this);
        this.f4704y = jVar2;
        return jVar2;
    }

    public h() {
        this(8);
    }
}
