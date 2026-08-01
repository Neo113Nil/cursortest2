package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sz implements Map, Serializable, pw {
    public static final sz s;
    public Object[] f;
    public Object[] g;
    public int[] h;
    public int[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public tz o;
    public uz p;
    public tz q;
    public boolean r;

    static {
        sz szVar = new sz(0);
        szVar.r = true;
        s = szVar;
    }

    public sz(int i) {
        if (i < 0) {
            s9.k("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f = objArr;
        this.g = null;
        this.h = iArr;
        this.i = new int[highestOneBit];
        this.j = 2;
        this.k = 0;
        this.l = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.j * 2;
            int length = this.i.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.i;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.k;
                    Object[] objArr = this.f;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.k = i6;
                        objArr[i5] = obj;
                        this.h[i5] = i;
                        iArr[i] = i6;
                        this.n++;
                        this.m++;
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (mv.c(this.f[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.i.length * 2);
                        break;
                    }
                    i = i == 0 ? this.i.length - 1 : i - 1;
                }
            }
        }
    }

    public final sz b() {
        c();
        this.r = true;
        if (this.n > 0) {
            return this;
        }
        sz szVar = s;
        szVar.getClass();
        return szVar;
    }

    public final void c() {
        if (this.r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.k - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        d50.Q(this.f, 0, this.k);
        Object[] objArr = this.g;
        if (objArr != null) {
            d50.Q(objArr, 0, this.k);
        }
        this.n = 0;
        this.k = 0;
        this.m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.g;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.h;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        d50.Q(this.f, i3, i);
        if (objArr != null) {
            d50.Q(objArr, i3, this.k);
        }
        this.k = i3;
    }

    public final boolean e(Collection collection) {
        boolean c;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        c = false;
                    } else {
                        Object[] objArr = this.g;
                        objArr.getClass();
                        c = mv.c(objArr[g], entry.getValue());
                    }
                    if (!c) {
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
        tz tzVar = this.q;
        if (tzVar != null) {
            return tzVar;
        }
        tz tzVar2 = new tz(this, 0);
        this.q = tzVar2;
        return tzVar2;
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
        return this.n == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.f;
        int length = objArr.length;
        int i2 = this.k;
        int i3 = length - i2;
        int i4 = i2 - this.n;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.g;
            this.g = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.h = Arrays.copyOf(this.h, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.i.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.j;
        while (true) {
            int i3 = this.i[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (mv.c(this.f[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.i.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.g;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.k;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.h[i] >= 0) {
                Object[] objArr = this.g;
                objArr.getClass();
                if (mv.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        pz pzVar = new pz(this, 0);
        int i = 0;
        while (pzVar.hasNext()) {
            int i2 = pzVar.f;
            sz szVar = (sz) pzVar.i;
            if (i2 >= szVar.k) {
                throw new NoSuchElementException();
            }
            pzVar.f = i2 + 1;
            pzVar.g = i2;
            Object obj = szVar.f[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = szVar.g;
            objArr.getClass();
            Object obj2 = objArr[pzVar.g];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            pzVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.l;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.n == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.h[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.m++;
        int i2 = 0;
        if (this.k > this.n) {
            d(false);
        }
        this.i = new int[i];
        this.l = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.k) {
            int i3 = i2 + 1;
            int i4 = i(this.f[i2]);
            int i5 = this.j;
            while (true) {
                int[] iArr = this.i;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    s9.u("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        Object[] objArr = this.f;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.g;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.h[i];
        int i3 = this.j * 2;
        int length = this.i.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.i.length - 1 : i2 - 1;
            i5++;
            int i7 = this.j;
            int[] iArr = this.i;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                int i10 = i(this.f[i9]) - i2;
                int[] iArr2 = this.i;
                if ((i10 & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.h[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.i[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.h[i] = -1;
        this.n--;
        this.m++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        tz tzVar = this.o;
        if (tzVar != null) {
            return tzVar;
        }
        tz tzVar2 = new tz(this, 1);
        this.o = tzVar2;
        return tzVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.g;
        if (objArr == null) {
            int length = this.f.length;
            if (length < 0) {
                s9.k("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.g = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
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
            int a = a(entry.getKey());
            Object[] objArr = this.g;
            if (objArr == null) {
                int length = this.f.length;
                if (length < 0) {
                    s9.k("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.g = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!mv.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
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
        Object[] objArr = this.g;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.n * 3) + 2);
        sb.append("{");
        int i = 0;
        pz pzVar = new pz(this, 0);
        while (pzVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = pzVar.f;
            sz szVar = (sz) pzVar.i;
            if (i2 >= szVar.k) {
                throw new NoSuchElementException();
            }
            pzVar.f = i2 + 1;
            pzVar.g = i2;
            Object obj = szVar.f[i2];
            if (obj == szVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = szVar.g;
            objArr.getClass();
            Object obj2 = objArr[pzVar.g];
            if (obj2 == szVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            pzVar.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        uz uzVar = this.p;
        if (uzVar != null) {
            return uzVar;
        }
        uz uzVar2 = new uz(this);
        this.p = uzVar2;
        return uzVar2;
    }

    public sz() {
        this(8);
    }
}
