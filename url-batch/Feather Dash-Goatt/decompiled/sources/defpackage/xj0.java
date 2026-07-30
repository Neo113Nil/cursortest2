package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xj0 implements Map, Serializable, ac0 {
    public static final tj0 r = new tj0(null);
    public static final xj0 s;
    public Object[] d;
    public Object[] e;
    public int[] g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public ow0 n;
    public zj0 o;
    public yj0 p;
    public boolean q;

    static {
        xj0 xj0Var = new xj0(0);
        xj0Var.q = true;
        s = xj0Var;
    }

    public xj0(int i) {
        if (i < 0) {
            dd0.e("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        r.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.g = iArr;
        this.h = new int[highestOneBit];
        this.i = 2;
        this.j = 0;
        this.k = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int h = h(obj);
            int i = this.i * 2;
            int length = this.h.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.j;
                    Object[] objArr = this.d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.j = i5;
                        objArr[i4] = obj;
                        this.g[i4] = h;
                        iArr[h] = i5;
                        this.m++;
                        this.l++;
                        if (i2 > this.i) {
                            this.i = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (Intrinsics.a(this.d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.h.length * 2);
                        break;
                    }
                    h = h == 0 ? this.h.length - 1 : h - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        t90.B(this.d, i3, i);
        if (objArr != null) {
            t90.B(objArr, i3, this.j);
        }
        this.j = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        t90.B(this.d, 0, this.j);
        Object[] objArr = this.e;
        if (objArr != null) {
            t90.B(objArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean a;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = f(entry.getKey());
                    if (f < 0) {
                        a = false;
                    } else {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        a = Intrinsics.a(objArr[f], entry.getValue());
                    }
                    if (!a) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            s sVar = w.d;
            int length2 = objArr.length;
            sVar.getClass();
            int d = s.d(length2, i5);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            this.d = Arrays.copyOf(objArr2, d);
            Object[] objArr3 = this.e;
            this.e = objArr3 != null ? Arrays.copyOf(objArr3, d) : null;
            this.g = Arrays.copyOf(this.g, d);
            r.getClass();
            int highestOneBit = Integer.highestOneBit((d >= 1 ? d : 1) * 3);
            if (highestOneBit > this.h.length) {
                i(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        yj0 yj0Var = this.p;
        if (yj0Var != null) {
            return yj0Var;
        }
        yj0 yj0Var2 = new yj0(this);
        this.p = yj0Var2;
        return yj0Var2;
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
        return this.m == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int h = h(obj);
        int i = this.i;
        while (true) {
            int i2 = this.h[h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.a(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            h = h == 0 ? this.h.length - 1 : h - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                if (Intrinsics.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        return objArr[f];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final int hashCode() {
        uj0 uj0Var = new uj0(this, 0);
        int i = 0;
        while (uj0Var.hasNext()) {
            int i2 = uj0Var.d;
            xj0 xj0Var = (xj0) uj0Var.h;
            if (i2 >= xj0Var.j) {
                dd0.c();
                return 0;
            }
            uj0Var.d = i2 + 1;
            uj0Var.e = i2;
            Object obj = xj0Var.d[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = xj0Var.e;
            objArr.getClass();
            Object obj2 = objArr[uj0Var.e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            uj0Var.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.l++;
        int i2 = 0;
        if (this.j > this.m) {
            c(false);
        }
        this.h = new int[i];
        r.getClass();
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.j) {
            int i3 = i2 + 1;
            int h = h(this.d[i2]);
            int i4 = this.i;
            while (true) {
                int[] iArr = this.h;
                if (iArr[h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    dd0.j("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                h = h == 0 ? iArr.length - 1 : h - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        Object[] objArr = this.d;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.g[i];
        int i3 = this.i * 2;
        int length = this.h.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.h.length - 1 : i2 - 1;
            i5++;
            int i7 = this.i;
            int[] iArr = this.h;
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
                int h = h(this.d[i9]) - i2;
                int[] iArr2 = this.h;
                if ((h & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.g[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.h[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.g[i] = -1;
        this.m--;
        this.l++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ow0 ow0Var = this.n;
        if (ow0Var != null) {
            return ow0Var;
        }
        ow0 ow0Var2 = new ow0(2, this);
        this.n = ow0Var2;
        return ow0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                dd0.e("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.e = objArr;
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
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        e(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    dd0.e("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.e = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        Object obj2 = objArr[f];
        j(f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        int i = 0;
        uj0 uj0Var = new uj0(this, 0);
        while (uj0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = uj0Var.d;
            xj0 xj0Var = (xj0) uj0Var.h;
            if (i2 >= xj0Var.j) {
                dd0.c();
                return null;
            }
            uj0Var.d = i2 + 1;
            uj0Var.e = i2;
            Object obj = xj0Var.d[i2];
            if (obj == xj0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = xj0Var.e;
            objArr.getClass();
            Object obj2 = objArr[uj0Var.e];
            if (obj2 == xj0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            uj0Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zj0 zj0Var = this.o;
        if (zj0Var != null) {
            return zj0Var;
        }
        zj0 zj0Var2 = new zj0(0, this);
        this.o = zj0Var2;
        return zj0Var2;
    }

    public xj0() {
        this(8);
    }
}
