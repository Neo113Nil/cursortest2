package defpackage;

import defpackage.h0;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uh1<K, V> implements Map<K, V>, Serializable, n71 {
    public static final uh1 A;
    public static final a z = new a(null);
    public Object[] m;
    public Object[] n;
    public int[] o;
    public int[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public z02 v;
    public zh1 w;
    public yh1 x;
    public boolean y;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        uh1 uh1Var = new uh1(0);
        uh1Var.y = true;
        A = uh1Var;
    }

    public uh1(int i) {
        if (i < 0) {
            lh.e("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        z.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.m = objArr;
        this.n = null;
        this.o = iArr;
        this.p = new int[highestOneBit];
        this.q = 2;
        this.r = 0;
        this.s = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (!this.y) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        fj2 fj2Var = new fj2();
        fj2Var.m = this;
        return fj2Var;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.q * 2;
            int length = this.p.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.p;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.r;
                    Object[] objArr = this.m;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.r = i6;
                        objArr[i5] = obj;
                        this.o[i5] = i;
                        iArr[i] = i6;
                        this.u++;
                        this.t++;
                        if (i3 > this.q) {
                            this.q = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (Intrinsics.b(this.m[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.p.length * 2);
                        break;
                    }
                    i = i == 0 ? this.p.length - 1 : i - 1;
                }
            }
        }
    }

    public final uh1 b() {
        c();
        this.y = true;
        if (this.u > 0) {
            return this;
        }
        uh1 uh1Var = A;
        uh1Var.getClass();
        return uh1Var;
    }

    public final void c() {
        if (this.y) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.r - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.o;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.p[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        z71.O(this.m, 0, this.r);
        Object[] objArr = this.n;
        if (objArr != null) {
            z71.O(objArr, 0, this.r);
        }
        this.u = 0;
        this.r = 0;
        this.t++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z2) {
        int i;
        Object[] objArr = this.n;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.r;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.o;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.m;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.p[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        z71.O(this.m, i3, i);
        if (objArr != null) {
            z71.O(objArr, i3, this.r);
        }
        this.r = i3;
    }

    public final boolean e(Collection collection) {
        boolean b;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        b = false;
                    } else {
                        Object[] objArr = this.n;
                        objArr.getClass();
                        b = Intrinsics.b(objArr[g], entry.getValue());
                    }
                    if (!b) {
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
        yh1 yh1Var = this.x;
        if (yh1Var != null) {
            return yh1Var;
        }
        yh1 yh1Var2 = new yh1(this);
        this.x = yh1Var2;
        return yh1Var2;
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
        return this.u == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.m;
        int length = objArr.length;
        int i2 = this.r;
        int i3 = length - i2;
        int i4 = i2 - this.u;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            h0.a aVar = h0.m;
            int length2 = objArr.length;
            aVar.getClass();
            int d = h0.a.d(length2, i5);
            Object[] objArr2 = this.m;
            objArr2.getClass();
            this.m = Arrays.copyOf(objArr2, d);
            Object[] objArr3 = this.n;
            this.n = objArr3 != null ? Arrays.copyOf(objArr3, d) : null;
            this.o = Arrays.copyOf(this.o, d);
            z.getClass();
            int highestOneBit = Integer.highestOneBit((d >= 1 ? d : 1) * 3);
            if (highestOneBit > this.p.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.q;
        while (true) {
            int i3 = this.p[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (Intrinsics.b(this.m[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.p.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.n;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.r;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.o[i] >= 0) {
                Object[] objArr = this.n;
                objArr.getClass();
                if (Intrinsics.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        vh1 vh1Var = new vh1(this, 0);
        int i = 0;
        while (vh1Var.hasNext()) {
            int i2 = vh1Var.m;
            uh1 uh1Var = (uh1) vh1Var.p;
            if (i2 >= uh1Var.r) {
                b71.f();
                return 0;
            }
            vh1Var.m = i2 + 1;
            vh1Var.n = i2;
            Object obj = uh1Var.m[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = uh1Var.n;
            objArr.getClass();
            Object obj2 = objArr[vh1Var.n];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            vh1Var.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.s;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.u == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.o[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.t++;
        int i2 = 0;
        if (this.r > this.u) {
            d(false);
        }
        this.p = new int[i];
        z.getClass();
        this.s = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.r) {
            int i3 = i2 + 1;
            int i4 = i(this.m[i2]);
            int i5 = this.q;
            while (true) {
                int[] iArr = this.p;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    lh.g("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
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
        Object[] objArr = this.m;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.n;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.o[i];
        int i3 = this.q * 2;
        int length = this.p.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.p.length - 1 : i2 - 1;
            i5++;
            int i7 = this.q;
            int[] iArr = this.p;
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
                int i10 = i(this.m[i9]) - i2;
                int[] iArr2 = this.p;
                if ((i10 & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.o[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.p[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.o[i] = -1;
        this.u--;
        this.t++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        z02 z02Var = this.v;
        if (z02Var != null) {
            return z02Var;
        }
        z02 z02Var2 = new z02(2, this);
        this.v = z02Var2;
        return z02Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a2 = a(obj);
        Object[] objArr = this.n;
        if (objArr == null) {
            int length = this.m.length;
            if (length < 0) {
                lh.e("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.n = objArr;
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
        map.getClass();
        c();
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry<K, V> entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.n;
            if (objArr == null) {
                int length = this.m.length;
                if (length < 0) {
                    lh.e("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.n = objArr;
                }
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!Intrinsics.b(entry.getValue(), objArr[i])) {
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
        Object[] objArr = this.n;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.u * 3) + 2);
        sb.append("{");
        int i = 0;
        vh1 vh1Var = new vh1(this, 0);
        while (vh1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = vh1Var.m;
            uh1 uh1Var = (uh1) vh1Var.p;
            if (i2 >= uh1Var.r) {
                b71.f();
                return null;
            }
            vh1Var.m = i2 + 1;
            vh1Var.n = i2;
            Object obj = uh1Var.m[i2];
            if (obj == uh1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = uh1Var.n;
            objArr.getClass();
            Object obj2 = objArr[vh1Var.n];
            if (obj2 == uh1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            vh1Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zh1 zh1Var = this.w;
        if (zh1Var != null) {
            return zh1Var;
        }
        zh1 zh1Var2 = new zh1(0, this);
        this.w = zh1Var2;
        return zh1Var2;
    }

    public uh1() {
        this(8);
    }
}
