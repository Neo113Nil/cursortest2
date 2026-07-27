package h4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u4.InterfaceC1484d;

/* renamed from: h4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488f implements Map, Serializable, InterfaceC1484d {

    /* renamed from: n, reason: collision with root package name */
    public static final C0488f f5806n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5807a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5808b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5809c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5810d;

    /* renamed from: e, reason: collision with root package name */
    public int f5811e;

    /* renamed from: f, reason: collision with root package name */
    public int f5812f;

    /* renamed from: g, reason: collision with root package name */
    public int f5813g;

    /* renamed from: h, reason: collision with root package name */
    public int f5814h;

    /* renamed from: i, reason: collision with root package name */
    public int f5815i;

    /* renamed from: j, reason: collision with root package name */
    public C0489g f5816j;

    /* renamed from: k, reason: collision with root package name */
    public C0490h f5817k;

    /* renamed from: l, reason: collision with root package name */
    public C0489g f5818l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5819m;

    static {
        C0488f c0488f = new C0488f(0);
        c0488f.f5819m = true;
        f5806n = c0488f;
    }

    public C0488f() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k3 = k(obj);
            int i2 = this.f5811e * 2;
            int length = this.f5810d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f5810d;
                int i6 = iArr[k3];
                if (i6 <= 0) {
                    int i7 = this.f5812f;
                    Object[] objArr = this.f5807a;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.f5812f = i8;
                        objArr[i7] = obj;
                        this.f5809c[i7] = k3;
                        iArr[k3] = i8;
                        this.f5815i++;
                        this.f5814h++;
                        if (i3 > this.f5811e) {
                            this.f5811e = i3;
                        }
                        return i7;
                    }
                    h(1);
                } else {
                    if (kotlin.jvm.internal.i.a(this.f5807a[i6 - 1], obj)) {
                        return -i6;
                    }
                    i3++;
                    if (i3 > i2) {
                        l(this.f5810d.length * 2);
                        break;
                    }
                    k3 = k3 == 0 ? this.f5810d.length - 1 : k3 - 1;
                }
            }
        }
    }

    public final C0488f c() {
        d();
        this.f5819m = true;
        if (this.f5815i > 0) {
            return this;
        }
        C0488f c0488f = f5806n;
        kotlin.jvm.internal.i.c(c0488f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c0488f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i2 = this.f5812f - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f5809c;
                int i6 = iArr[i3];
                if (i6 >= 0) {
                    this.f5810d[i6] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        K1.b.l0(0, this.f5812f, this.f5807a);
        Object[] objArr = this.f5808b;
        if (objArr != null) {
            K1.b.l0(0, this.f5812f, objArr);
        }
        this.f5815i = 0;
        this.f5812f = 0;
        this.f5814h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.f5819m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z) {
        int i2;
        Object[] objArr = this.f5808b;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            i2 = this.f5812f;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f5809c;
            int i7 = iArr[i3];
            if (i7 >= 0) {
                Object[] objArr2 = this.f5807a;
                objArr2[i6] = objArr2[i3];
                if (objArr != null) {
                    objArr[i6] = objArr[i3];
                }
                if (z) {
                    iArr[i6] = i7;
                    this.f5810d[i7] = i6 + 1;
                }
                i6++;
            }
            i3++;
        }
        K1.b.l0(i6, i2, this.f5807a);
        if (objArr != null) {
            K1.b.l0(i6, this.f5812f, objArr);
        }
        this.f5812f = i6;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0489g c0489g = this.f5818l;
        if (c0489g != null) {
            return c0489g;
        }
        C0489g c0489g2 = new C0489g(this, 0);
        this.f5818l = c0489g2;
        return c0489g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f5815i != map.size() || !f(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Collection m6) {
        kotlin.jvm.internal.i.e(m6, "m");
        for (Object obj : m6) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        kotlin.jvm.internal.i.e(entry, "entry");
        int i2 = i(entry.getKey());
        if (i2 < 0) {
            return false;
        }
        Object[] objArr = this.f5808b;
        kotlin.jvm.internal.i.b(objArr);
        return kotlin.jvm.internal.i.a(objArr[i2], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i2 = i(obj);
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.f5808b;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[i2];
    }

    public final void h(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f5807a;
        int length = objArr2.length;
        int i3 = this.f5812f;
        int i6 = length - i3;
        int i7 = i3 - this.f5815i;
        if (i6 < i2 && i6 + i7 >= i2 && i7 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i8 = i3 + i2;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr2.length) {
            int length2 = objArr2.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i9);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f5807a = copyOf;
            Object[] objArr3 = this.f5808b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i9);
                kotlin.jvm.internal.i.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f5808b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f5809c, i9);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
            this.f5809c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (highestOneBit > this.f5810d.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0486d c0486d = new C0486d(this, 0);
        int i2 = 0;
        while (c0486d.hasNext()) {
            int i3 = c0486d.f5799b;
            C0488f c0488f = c0486d.f5798a;
            if (i3 >= c0488f.f5812f) {
                throw new NoSuchElementException();
            }
            c0486d.f5799b = i3 + 1;
            c0486d.f5800c = i3;
            Object obj = c0488f.f5807a[i3];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c0488f.f5808b;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[c0486d.f5800c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0486d.c();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        int k3 = k(obj);
        int i2 = this.f5811e;
        while (true) {
            int i3 = this.f5810d[k3];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i6 = i3 - 1;
                if (kotlin.jvm.internal.i.a(this.f5807a[i6], obj)) {
                    return i6;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            k3 = k3 == 0 ? this.f5810d.length - 1 : k3 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5815i == 0;
    }

    public final int j(Object obj) {
        int i2 = this.f5812f;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f5809c[i2] >= 0) {
                Object[] objArr = this.f5808b;
                kotlin.jvm.internal.i.b(objArr);
                if (kotlin.jvm.internal.i.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f5813g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0489g c0489g = this.f5816j;
        if (c0489g != null) {
            return c0489g;
        }
        C0489g c0489g2 = new C0489g(this, 1);
        this.f5816j = c0489g2;
        return c0489g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f5809c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i2) {
        this.f5814h++;
        int i3 = 0;
        if (this.f5812f > this.f5815i) {
            e(false);
        }
        this.f5810d = new int[i2];
        this.f5813g = Integer.numberOfLeadingZeros(i2) + 1;
        while (i3 < this.f5812f) {
            int i6 = i3 + 1;
            int k3 = k(this.f5807a[i3]);
            int i7 = this.f5811e;
            while (true) {
                int[] iArr = this.f5810d;
                if (iArr[k3] == 0) {
                    break;
                }
                i7--;
                if (i7 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k3 = k3 == 0 ? iArr.length - 1 : k3 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i2) {
        Object[] objArr = this.f5807a;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f5808b;
        if (objArr2 != null) {
            objArr2[i2] = null;
        }
        int i3 = this.f5809c[i2];
        int i6 = this.f5811e * 2;
        int length = this.f5810d.length / 2;
        if (i6 > length) {
            i6 = length;
        }
        int i7 = i6;
        int i8 = 0;
        int i9 = i3;
        while (true) {
            i3 = i3 == 0 ? this.f5810d.length - 1 : i3 - 1;
            i8++;
            if (i8 > this.f5811e) {
                this.f5810d[i9] = 0;
                break;
            }
            int[] iArr = this.f5810d;
            int i10 = iArr[i3];
            if (i10 == 0) {
                iArr[i9] = 0;
                break;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                int k3 = k(this.f5807a[i11]) - i3;
                int[] iArr2 = this.f5810d;
                if ((k3 & (iArr2.length - 1)) >= i8) {
                    iArr2[i9] = i10;
                    this.f5809c[i11] = i9;
                }
                i7--;
                if (i7 >= 0) {
                    this.f5810d[i9] = -1;
                    break;
                }
            }
            i9 = i3;
            i8 = 0;
            i7--;
            if (i7 >= 0) {
            }
        }
        this.f5809c[i2] = -1;
        this.f5815i--;
        this.f5814h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a6 = a(obj);
        Object[] objArr = this.f5808b;
        if (objArr == null) {
            int length = this.f5807a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f5808b = objArr;
        }
        if (a6 >= 0) {
            objArr[a6] = obj2;
            return null;
        }
        int i2 = (-a6) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.i.e(from, "from");
        d();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        h(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a6 = a(entry.getKey());
            Object[] objArr = this.f5808b;
            if (objArr == null) {
                int length = this.f5807a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f5808b = objArr;
            }
            if (a6 >= 0) {
                objArr[a6] = entry.getValue();
            } else {
                int i2 = (-a6) - 1;
                if (!kotlin.jvm.internal.i.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int i2 = i(obj);
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.f5808b;
        kotlin.jvm.internal.i.b(objArr);
        Object obj2 = objArr[i2];
        m(i2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5815i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f5815i * 3) + 2);
        sb.append("{");
        C0486d c0486d = new C0486d(this, 0);
        int i2 = 0;
        while (c0486d.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = c0486d.f5799b;
            C0488f c0488f = c0486d.f5798a;
            if (i3 >= c0488f.f5812f) {
                throw new NoSuchElementException();
            }
            c0486d.f5799b = i3 + 1;
            c0486d.f5800c = i3;
            Object obj = c0488f.f5807a[i3];
            if (obj == c0488f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c0488f.f5808b;
            kotlin.jvm.internal.i.b(objArr);
            Object obj2 = objArr[c0486d.f5800c];
            if (obj2 == c0488f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0486d.c();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0490h c0490h = this.f5817k;
        if (c0490h != null) {
            return c0490h;
        }
        C0490h c0490h2 = new C0490h(this);
        this.f5817k = c0490h2;
        return c0490h2;
    }

    public C0488f(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f5807a = objArr;
        this.f5808b = null;
        this.f5809c = iArr;
        this.f5810d = new int[highestOneBit];
        this.f5811e = 2;
        this.f5812f = 0;
        this.f5813g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
