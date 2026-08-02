package v2;

import a.AbstractC0124a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: v2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474v extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f15679j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f15680a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f15681b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f15682c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f15683d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f15684e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f15685f;

    /* renamed from: g, reason: collision with root package name */
    public transient C1472t f15686g;

    /* renamed from: h, reason: collision with root package name */
    public transient C1472t f15687h;

    /* renamed from: i, reason: collision with root package name */
    public transient C1467n f15688i;

    public static C1474v a() {
        C1474v c1474v = new C1474v();
        c1474v.f15684e = Math.min(Math.max(3, 1), 1073741823);
        return c1474v;
    }

    public static C1474v b(int i4) {
        C1474v c1474v = new C1474v();
        AbstractC0124a.g("Expected size must be >= 0", i4 >= 0);
        c1474v.f15684e = Math.min(Math.max(i4, 1), 1073741823);
        return c1474v;
    }

    public final Map c() {
        Object obj = this.f15680a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f15684e += 32;
        Map c4 = c();
        if (c4 != null) {
            this.f15684e = Math.min(Math.max(size(), 3), 1073741823);
            c4.clear();
            this.f15680a = null;
            this.f15685f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f15685f, (Object) null);
        Arrays.fill(k(), 0, this.f15685f, (Object) null);
        Object obj = this.f15680a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f15685f, 0);
        this.f15685f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c4 = c();
        return c4 != null ? c4.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.containsValue(obj);
        }
        for (int i4 = 0; i4 < this.f15685f; i4++) {
            if (V3.b.n(obj, k()[i4])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f15684e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int r4 = r.r(obj);
        int d4 = d();
        Object obj2 = this.f15680a;
        Objects.requireNonNull(obj2);
        int s4 = r.s(r4 & d4, obj2);
        if (s4 == 0) {
            return -1;
        }
        int i4 = ~d4;
        int i5 = r4 & i4;
        do {
            int i6 = s4 - 1;
            int i7 = i()[i6];
            if ((i7 & i4) == i5 && V3.b.n(obj, j()[i6])) {
                return i6;
            }
            s4 = i7 & d4;
        } while (s4 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1472t c1472t = this.f15687h;
        if (c1472t != null) {
            return c1472t;
        }
        C1472t c1472t2 = new C1472t(this, 0);
        this.f15687h = c1472t2;
        return c1472t2;
    }

    public final void f(int i4, int i5) {
        Object obj = this.f15680a;
        Objects.requireNonNull(obj);
        int[] i6 = i();
        Object[] j4 = j();
        Object[] k4 = k();
        int size = size();
        int i7 = size - 1;
        if (i4 >= i7) {
            j4[i4] = null;
            k4[i4] = null;
            i6[i4] = 0;
            return;
        }
        Object obj2 = j4[i7];
        j4[i4] = obj2;
        k4[i4] = k4[i7];
        j4[i7] = null;
        k4[i7] = null;
        i6[i4] = i6[i7];
        i6[i7] = 0;
        int r4 = r.r(obj2) & i5;
        int s4 = r.s(r4, obj);
        if (s4 == size) {
            r.t(r4, i4 + 1, obj);
            return;
        }
        while (true) {
            int i8 = s4 - 1;
            int i9 = i6[i8];
            int i10 = i9 & i5;
            if (i10 == size) {
                i6[i8] = r.m(i9, i4 + 1, i5);
                return;
            }
            s4 = i10;
        }
    }

    public final boolean g() {
        return this.f15680a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.get(obj);
        }
        int e4 = e(obj);
        if (e4 == -1) {
            return null;
        }
        return k()[e4];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d4 = d();
            Object obj2 = this.f15680a;
            Objects.requireNonNull(obj2);
            int o = r.o(obj, null, d4, obj2, i(), j(), null);
            if (o != -1) {
                Object obj3 = k()[o];
                f(o, d4);
                this.f15685f--;
                this.f15684e += 32;
                return obj3;
            }
        }
        return f15679j;
    }

    public final int[] i() {
        int[] iArr = this.f15681b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f15682c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f15683d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1472t c1472t = this.f15686g;
        if (c1472t != null) {
            return c1472t;
        }
        C1472t c1472t2 = new C1472t(this, 1);
        this.f15686g = c1472t2;
        return c1472t2;
    }

    public final int l(int i4, int i5, int i6, int i7) {
        Object e4 = r.e(i5);
        int i8 = i5 - 1;
        if (i7 != 0) {
            r.t(i6 & i8, i7 + 1, e4);
        }
        Object obj = this.f15680a;
        Objects.requireNonNull(obj);
        int[] i9 = i();
        for (int i10 = 0; i10 <= i4; i10++) {
            int s4 = r.s(i10, obj);
            while (s4 != 0) {
                int i11 = s4 - 1;
                int i12 = i9[i11];
                int i13 = ((~i4) & i12) | i10;
                int i14 = i13 & i8;
                int s5 = r.s(i14, e4);
                r.t(i14, s4, e4);
                i9[i11] = r.m(i13, s5, i8);
                s4 = i12 & i4;
            }
        }
        this.f15680a = e4;
        this.f15684e = r.m(this.f15684e, 32 - Integer.numberOfLeadingZeros(i8), 31);
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i4;
        int i5;
        int i6 = 32;
        int i7 = 1;
        if (g()) {
            AbstractC0124a.s("Arrays already allocated", g());
            int i8 = this.f15684e;
            int max = Math.max(i8 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f15680a = r.e(max2);
            this.f15684e = r.m(this.f15684e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.f15681b = new int[i8];
            this.f15682c = new Object[i8];
            this.f15683d = new Object[i8];
        }
        Map c4 = c();
        if (c4 != null) {
            return c4.put(obj, obj2);
        }
        int[] i9 = i();
        Object[] j4 = j();
        Object[] k4 = k();
        int i10 = this.f15685f;
        int i11 = i10 + 1;
        int r4 = r.r(obj);
        int d4 = d();
        int i12 = r4 & d4;
        Object obj3 = this.f15680a;
        Objects.requireNonNull(obj3);
        int s4 = r.s(i12, obj3);
        if (s4 == 0) {
            if (i11 > d4) {
                d4 = l(d4, (d4 + 1) * (d4 < 32 ? 4 : 2), r4, i10);
            } else {
                Object obj4 = this.f15680a;
                Objects.requireNonNull(obj4);
                r.t(i12, i11, obj4);
            }
            i4 = 1;
        } else {
            int i13 = ~d4;
            int i14 = r4 & i13;
            int i15 = 0;
            while (true) {
                int i16 = s4 - i7;
                i4 = i7;
                int i17 = i9[i16];
                int i18 = i6;
                if ((i17 & i13) == i14 && V3.b.n(obj, j4[i16])) {
                    Object obj5 = k4[i16];
                    k4[i16] = obj2;
                    return obj5;
                }
                int i19 = i17 & d4;
                int i20 = i15 + 1;
                if (i19 != 0) {
                    i15 = i20;
                    s4 = i19;
                    i7 = i4;
                    i6 = i18;
                } else {
                    if (i20 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (!isEmpty()) {
                            i5 = 0;
                            while (i5 >= 0) {
                                linkedHashMap.put(j()[i5], k()[i5]);
                                int i21 = i5 + 1;
                                if (i21 < this.f15685f) {
                                    i5 = i21;
                                }
                            }
                            this.f15680a = linkedHashMap;
                            this.f15681b = null;
                            this.f15682c = null;
                            this.f15683d = null;
                            this.f15684e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i5 = -1;
                        while (i5 >= 0) {
                        }
                        this.f15680a = linkedHashMap;
                        this.f15681b = null;
                        this.f15682c = null;
                        this.f15683d = null;
                        this.f15684e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > d4) {
                        d4 = l(d4, (d4 + 1) * (d4 < i18 ? 4 : 2), r4, i10);
                    } else {
                        i9[i16] = r.m(i17, i11, d4);
                    }
                }
            }
        }
        int length = i().length;
        if (i11 > length) {
            int i22 = i4;
            int min = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (min != length) {
                this.f15681b = Arrays.copyOf(i(), min);
                this.f15682c = Arrays.copyOf(j(), min);
                this.f15683d = Arrays.copyOf(k(), min);
            }
        }
        i()[i10] = r.m(r4, 0, d4);
        j()[i10] = obj;
        k()[i10] = obj2;
        this.f15685f = i11;
        this.f15684e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.remove(obj);
        }
        Object h2 = h(obj);
        if (h2 == f15679j) {
            return null;
        }
        return h2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c4 = c();
        return c4 != null ? c4.size() : this.f15685f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1467n c1467n = this.f15688i;
        if (c1467n != null) {
            return c1467n;
        }
        C1467n c1467n2 = new C1467n(1, this);
        this.f15688i = c1467n2;
        return c1467n2;
    }
}
