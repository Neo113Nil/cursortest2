package A2;

import a.AbstractC0345a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;

@Metadata
/* loaded from: classes.dex */
public final class e<K, V> implements Map<K, V>, Serializable, N2.e {

    /* renamed from: t, reason: collision with root package name */
    public static final a f817t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final e f818u;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f819d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f820e;

    /* renamed from: i, reason: collision with root package name */
    public int[] f821i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f822j;

    /* renamed from: k, reason: collision with root package name */
    public int f823k;

    /* renamed from: l, reason: collision with root package name */
    public int f824l;

    /* renamed from: m, reason: collision with root package name */
    public int f825m;

    /* renamed from: n, reason: collision with root package name */
    public int f826n;

    /* renamed from: o, reason: collision with root package name */
    public int f827o;

    /* renamed from: p, reason: collision with root package name */
    public L.g f828p;

    /* renamed from: q, reason: collision with root package name */
    public j f829q;

    /* renamed from: r, reason: collision with root package name */
    public i f830r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f831s;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        e eVar = new e(0);
        eVar.f831s = true;
        f818u = eVar;
    }

    public e() {
        this(8);
    }

    public final int b(Object obj) {
        c();
        while (true) {
            int k4 = k(obj);
            int i2 = this.f823k * 2;
            int length = this.f822j.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f822j;
                int i5 = iArr[k4];
                if (i5 <= 0) {
                    int i6 = this.f824l;
                    Object[] objArr = this.f819d;
                    if (i6 < objArr.length) {
                        int i7 = i6 + 1;
                        this.f824l = i7;
                        objArr[i6] = obj;
                        this.f821i[i6] = k4;
                        iArr[k4] = i7;
                        this.f827o++;
                        this.f826n++;
                        if (i4 > this.f823k) {
                            this.f823k = i4;
                        }
                        return i6;
                    }
                    g(1);
                } else {
                    if (Intrinsics.a(this.f819d[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i2) {
                        m(this.f822j.length * 2);
                        break;
                    }
                    k4 = k4 == 0 ? this.f822j.length - 1 : k4 - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f831s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i2 = this.f824l - 1;
        if (i2 >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f821i;
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    this.f822j[i5] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        AbstractC0345a.D(this.f819d, 0, this.f824l);
        Object[] objArr = this.f820e;
        if (objArr != null) {
            AbstractC0345a.D(objArr, 0, this.f824l);
        }
        this.f827o = 0;
        this.f824l = 0;
        this.f826n++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z4) {
        int i2;
        Object[] objArr = this.f820e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = this.f824l;
            if (i4 >= i2) {
                break;
            }
            int[] iArr = this.f821i;
            int i6 = iArr[i4];
            if (i6 >= 0) {
                Object[] objArr2 = this.f819d;
                objArr2[i5] = objArr2[i4];
                if (objArr != null) {
                    objArr[i5] = objArr[i4];
                }
                if (z4) {
                    iArr[i5] = i6;
                    this.f822j[i6] = i5 + 1;
                }
                i5++;
            }
            i4++;
        }
        AbstractC0345a.D(this.f819d, i5, i2);
        if (objArr != null) {
            AbstractC0345a.D(objArr, i5, this.f824l);
        }
        this.f824l = i5;
    }

    public final boolean e(Collection m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        for (Object obj : m4) {
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
        i iVar = this.f830r;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f830r = iVar2;
        return iVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f827o != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int h4 = h(entry.getKey());
        if (h4 < 0) {
            return false;
        }
        Object[] objArr = this.f820e;
        Intrinsics.c(objArr);
        return Intrinsics.a(objArr[h4], entry.getValue());
    }

    public final void g(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f819d;
        int length = objArr2.length;
        int i4 = this.f824l;
        int i5 = length - i4;
        int i6 = i4 - this.f827o;
        if (i5 < i2 && i5 + i6 >= i2 && i6 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i7 = i4 + i2;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > objArr2.length) {
            AbstractC1420d.a aVar = AbstractC1420d.f11939d;
            int length2 = objArr2.length;
            aVar.getClass();
            int e4 = AbstractC1420d.a.e(length2, i7);
            Object[] objArr3 = this.f819d;
            Intrinsics.checkNotNullParameter(objArr3, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr3, e4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f819d = copyOf;
            Object[] objArr4 = this.f820e;
            if (objArr4 != null) {
                Intrinsics.checkNotNullParameter(objArr4, "<this>");
                objArr = Arrays.copyOf(objArr4, e4);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f820e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f821i, e4);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f821i = copyOf2;
            f817t.getClass();
            int highestOneBit = Integer.highestOneBit((e4 >= 1 ? e4 : 1) * 3);
            if (highestOneBit > this.f822j.length) {
                m(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h4 = h(obj);
        if (h4 < 0) {
            return null;
        }
        Object[] objArr = this.f820e;
        Intrinsics.c(objArr);
        return objArr[h4];
    }

    public final int h(Object obj) {
        int k4 = k(obj);
        int i2 = this.f823k;
        while (true) {
            int i4 = this.f822j[k4];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (Intrinsics.a(this.f819d[i5], obj)) {
                    return i5;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            k4 = k4 == 0 ? this.f822j.length - 1 : k4 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        f fVar = new f(this, 0);
        int i2 = 0;
        while (fVar.hasNext()) {
            int i4 = fVar.f835d;
            e eVar = (e) fVar.f838j;
            if (i4 >= eVar.f824l) {
                throw new NoSuchElementException();
            }
            fVar.f835d = i4 + 1;
            fVar.f836e = i4;
            Object obj = eVar.f819d[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f820e;
            Intrinsics.c(objArr);
            Object obj2 = objArr[fVar.f836e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fVar.d();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        int i2 = this.f824l;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f821i[i2] >= 0) {
                Object[] objArr = this.f820e;
                Intrinsics.c(objArr);
                if (Intrinsics.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f827o == 0;
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f825m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        L.g gVar = this.f828p;
        if (gVar != null) {
            return gVar;
        }
        L.g gVar2 = new L.g(this);
        this.f828p = gVar2;
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f821i[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i2) {
        this.f826n++;
        int i4 = 0;
        if (this.f824l > this.f827o) {
            d(false);
        }
        this.f822j = new int[i2];
        f817t.getClass();
        this.f825m = Integer.numberOfLeadingZeros(i2) + 1;
        while (i4 < this.f824l) {
            int i5 = i4 + 1;
            int k4 = k(this.f819d[i4]);
            int i6 = this.f823k;
            while (true) {
                int[] iArr = this.f822j;
                if (iArr[k4] == 0) {
                    break;
                }
                i6--;
                if (i6 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k4 = k4 == 0 ? iArr.length - 1 : k4 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i2) {
        Object[] objArr = this.f819d;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f820e;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i2] = null;
        }
        int i4 = this.f821i[i2];
        int i5 = this.f823k * 2;
        int length = this.f822j.length / 2;
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5;
        int i7 = 0;
        int i8 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f822j.length - 1 : i4 - 1;
            i7++;
            if (i7 > this.f823k) {
                this.f822j[i8] = 0;
                break;
            }
            int[] iArr = this.f822j;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i8] = 0;
                break;
            }
            if (i9 < 0) {
                iArr[i8] = -1;
            } else {
                int i10 = i9 - 1;
                int k4 = k(this.f819d[i10]) - i4;
                int[] iArr2 = this.f822j;
                if ((k4 & (iArr2.length - 1)) >= i7) {
                    iArr2[i8] = i9;
                    this.f821i[i10] = i8;
                }
                i6--;
                if (i6 >= 0) {
                    this.f822j[i8] = -1;
                    break;
                }
            }
            i8 = i4;
            i7 = 0;
            i6--;
            if (i6 >= 0) {
            }
        }
        this.f821i[i2] = -1;
        this.f827o--;
        this.f826n++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int b4 = b(obj);
        Object[] objArr = this.f820e;
        if (objArr == null) {
            int length = this.f819d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f820e = objArr;
        }
        if (b4 >= 0) {
            objArr[b4] = obj2;
            return null;
        }
        int i2 = (-b4) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry<K, V>> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry<K, V> entry : entrySet) {
            int b4 = b(entry.getKey());
            Object[] objArr = this.f820e;
            if (objArr == null) {
                int length = this.f819d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f820e = objArr;
            }
            if (b4 >= 0) {
                objArr[b4] = entry.getValue();
            } else {
                int i2 = (-b4) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h4 = h(obj);
        if (h4 < 0) {
            return null;
        }
        Object[] objArr = this.f820e;
        Intrinsics.c(objArr);
        Object obj2 = objArr[h4];
        n(h4);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f827o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f827o * 3) + 2);
        sb.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        f fVar = new f(this, 0);
        int i2 = 0;
        while (fVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb, "sb");
            int i4 = fVar.f835d;
            e eVar = (e) fVar.f838j;
            if (i4 >= eVar.f824l) {
                throw new NoSuchElementException();
            }
            fVar.f835d = i4 + 1;
            fVar.f836e = i4;
            Object obj = eVar.f819d[i4];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f820e;
            Intrinsics.c(objArr);
            Object obj2 = objArr[fVar.f836e];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fVar.d();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f829q;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f829q = jVar2;
        return jVar2;
    }

    public e(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        f817t.getClass();
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f819d = objArr;
        this.f820e = null;
        this.f821i = iArr;
        this.f822j = new int[highestOneBit];
        this.f823k = 2;
        this.f824l = 0;
        this.f825m = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
