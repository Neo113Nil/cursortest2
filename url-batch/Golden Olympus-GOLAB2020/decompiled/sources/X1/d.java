package X1;

import com.ironsource.cc;
import i2.InterfaceC2471a;
import i2.InterfaceC2475e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements Map, Serializable, InterfaceC2475e {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f9691o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    private static final d f9692p;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f9693b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f9694c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f9695d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f9696e;

    /* renamed from: f, reason: collision with root package name */
    private int f9697f;

    /* renamed from: g, reason: collision with root package name */
    private int f9698g;

    /* renamed from: h, reason: collision with root package name */
    private int f9699h;

    /* renamed from: i, reason: collision with root package name */
    private int f9700i;

    /* renamed from: j, reason: collision with root package name */
    private int f9701j;

    /* renamed from: k, reason: collision with root package name */
    private X1.f f9702k;

    /* renamed from: l, reason: collision with root package name */
    private g f9703l;

    /* renamed from: m, reason: collision with root package name */
    private X1.e f9704m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9705n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i4) {
            return Integer.highestOneBit(kotlin.ranges.g.d(i4, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i4) {
            return Integer.numberOfLeadingZeros(i4) + 1;
        }

        public final d e() {
            return d.f9692p;
        }

        private a() {
        }
    }

    public static final class b extends C0069d implements Iterator, InterfaceC2471a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= d().f9698g) {
                throw new NoSuchElementException();
            }
            int b4 = b();
            f(b4 + 1);
            g(b4);
            c cVar = new c(d(), c());
            e();
            return cVar;
        }

        public final void k(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (b() >= d().f9698g) {
                throw new NoSuchElementException();
            }
            int b4 = b();
            f(b4 + 1);
            g(b4);
            Object obj = d().f9693b[c()];
            if (obj == d()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(cc.f15727T);
            Object[] objArr = d().f9694c;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            e();
        }

        public final int l() {
            if (b() >= d().f9698g) {
                throw new NoSuchElementException();
            }
            int b4 = b();
            f(b4 + 1);
            g(b4);
            Object obj = d().f9693b[c()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = d().f9694c;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[c()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            e();
            return hashCode2;
        }
    }

    public static final class c implements Map.Entry, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final d f9706b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9707c;

        public c(d map, int i4) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f9706b = map;
            this.f9707c = i4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f9706b.f9693b[this.f9707c];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f9706b.f9694c;
            Intrinsics.checkNotNull(objArr);
            return objArr[this.f9707c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f9706b.p();
            Object[] n4 = this.f9706b.n();
            int i4 = this.f9707c;
            Object obj2 = n4[i4];
            n4[i4] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(cc.f15727T);
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: X1.d$d, reason: collision with other inner class name */
    public static class C0069d {

        /* renamed from: b, reason: collision with root package name */
        private final d f9708b;

        /* renamed from: c, reason: collision with root package name */
        private int f9709c;

        /* renamed from: d, reason: collision with root package name */
        private int f9710d;

        /* renamed from: e, reason: collision with root package name */
        private int f9711e;

        public C0069d(d map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f9708b = map;
            this.f9710d = -1;
            this.f9711e = map.f9700i;
            e();
        }

        public final void a() {
            if (this.f9708b.f9700i != this.f9711e) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f9709c;
        }

        public final int c() {
            return this.f9710d;
        }

        public final d d() {
            return this.f9708b;
        }

        public final void e() {
            while (this.f9709c < this.f9708b.f9698g) {
                int[] iArr = this.f9708b.f9695d;
                int i4 = this.f9709c;
                if (iArr[i4] >= 0) {
                    return;
                } else {
                    this.f9709c = i4 + 1;
                }
            }
        }

        public final void f(int i4) {
            this.f9709c = i4;
        }

        public final void g(int i4) {
            this.f9710d = i4;
        }

        public final boolean hasNext() {
            return this.f9709c < this.f9708b.f9698g;
        }

        public final void remove() {
            a();
            if (this.f9710d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f9708b.p();
            this.f9708b.P(this.f9710d);
            this.f9710d = -1;
            this.f9711e = this.f9708b.f9700i;
        }
    }

    public static final class e extends C0069d implements Iterator, InterfaceC2471a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f9698g) {
                throw new NoSuchElementException();
            }
            int b4 = b();
            f(b4 + 1);
            g(b4);
            Object obj = d().f9693b[c()];
            e();
            return obj;
        }
    }

    public static final class f extends C0069d implements Iterator, InterfaceC2471a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f9698g) {
                throw new NoSuchElementException();
            }
            int b4 = b();
            f(b4 + 1);
            g(b4);
            Object[] objArr = d().f9694c;
            Intrinsics.checkNotNull(objArr);
            Object obj = objArr[c()];
            e();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f9705n = true;
        f9692p = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i4, int i5) {
        this.f9693b = objArr;
        this.f9694c = objArr2;
        this.f9695d = iArr;
        this.f9696e = iArr2;
        this.f9697f = i4;
        this.f9698g = i5;
        this.f9699h = f9691o.d(B());
    }

    private final int B() {
        return this.f9696e.length;
    }

    private final int F(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f9699h;
    }

    private final boolean H(Collection collection) {
        boolean z4 = false;
        if (collection.isEmpty()) {
            return false;
        }
        v(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (I((Map.Entry) it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    private final boolean I(Map.Entry entry) {
        int m4 = m(entry.getKey());
        Object[] n4 = n();
        if (m4 >= 0) {
            n4[m4] = entry.getValue();
            return true;
        }
        int i4 = (-m4) - 1;
        if (Intrinsics.areEqual(entry.getValue(), n4[i4])) {
            return false;
        }
        n4[i4] = entry.getValue();
        return true;
    }

    private final boolean J(int i4) {
        int F4 = F(this.f9693b[i4]);
        int i5 = this.f9697f;
        while (true) {
            int[] iArr = this.f9696e;
            if (iArr[F4] == 0) {
                iArr[F4] = i4 + 1;
                this.f9695d[i4] = F4;
                return true;
            }
            i5--;
            if (i5 < 0) {
                return false;
            }
            F4 = F4 == 0 ? B() - 1 : F4 - 1;
        }
    }

    private final void K() {
        this.f9700i++;
    }

    private final void L(int i4) {
        K();
        if (this.f9698g > size()) {
            q();
        }
        int i5 = 0;
        if (i4 != B()) {
            this.f9696e = new int[i4];
            this.f9699h = f9691o.d(i4);
        } else {
            AbstractC3219i.m(this.f9696e, 0, 0, B());
        }
        while (i5 < this.f9698g) {
            int i6 = i5 + 1;
            if (!J(i5)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i5 = i6;
        }
    }

    private final void N(int i4) {
        int g4 = kotlin.ranges.g.g(this.f9697f * 2, B() / 2);
        int i5 = 0;
        int i6 = i4;
        do {
            i4 = i4 == 0 ? B() - 1 : i4 - 1;
            i5++;
            if (i5 > this.f9697f) {
                this.f9696e[i6] = 0;
                return;
            }
            int[] iArr = this.f9696e;
            int i7 = iArr[i4];
            if (i7 == 0) {
                iArr[i6] = 0;
                return;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                if (((F(this.f9693b[i8]) - i4) & (B() - 1)) >= i5) {
                    this.f9696e[i6] = i7;
                    this.f9695d[i8] = i6;
                }
                g4--;
            }
            i6 = i4;
            i5 = 0;
            g4--;
        } while (g4 >= 0);
        this.f9696e[i6] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int i4) {
        X1.c.f(this.f9693b, i4);
        N(this.f9695d[i4]);
        this.f9695d[i4] = -1;
        this.f9701j = size() - 1;
        K();
    }

    private final boolean R(int i4) {
        int z4 = z();
        int i5 = this.f9698g;
        int i6 = z4 - i5;
        int size = i5 - size();
        return i6 < i4 && i6 + size >= i4 && size >= z() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] n() {
        Object[] objArr = this.f9694c;
        if (objArr != null) {
            return objArr;
        }
        Object[] d4 = X1.c.d(z());
        this.f9694c = d4;
        return d4;
    }

    private final void q() {
        int i4;
        Object[] objArr = this.f9694c;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.f9698g;
            if (i5 >= i4) {
                break;
            }
            if (this.f9695d[i5] >= 0) {
                Object[] objArr2 = this.f9693b;
                objArr2[i6] = objArr2[i5];
                if (objArr != null) {
                    objArr[i6] = objArr[i5];
                }
                i6++;
            }
            i5++;
        }
        X1.c.g(this.f9693b, i6, i4);
        if (objArr != null) {
            X1.c.g(objArr, i6, this.f9698g);
        }
        this.f9698g = i6;
    }

    private final boolean t(Map map) {
        return size() == map.size() && r(map.entrySet());
    }

    private final void u(int i4) {
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        if (i4 > z()) {
            int e4 = AbstractC3213c.Companion.e(z(), i4);
            this.f9693b = X1.c.e(this.f9693b, e4);
            Object[] objArr = this.f9694c;
            this.f9694c = objArr != null ? X1.c.e(objArr, e4) : null;
            int[] copyOf = Arrays.copyOf(this.f9695d, e4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f9695d = copyOf;
            int c4 = f9691o.c(e4);
            if (c4 > B()) {
                L(c4);
            }
        }
    }

    private final void v(int i4) {
        if (R(i4)) {
            L(B());
        } else {
            u(this.f9698g + i4);
        }
    }

    private final int x(Object obj) {
        int F4 = F(obj);
        int i4 = this.f9697f;
        while (true) {
            int i5 = this.f9696e[F4];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (Intrinsics.areEqual(this.f9693b[i6], obj)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            F4 = F4 == 0 ? B() - 1 : F4 - 1;
        }
    }

    private final int y(Object obj) {
        int i4 = this.f9698g;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.f9695d[i4] >= 0) {
                Object[] objArr = this.f9694c;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    public Set A() {
        X1.e eVar = this.f9704m;
        if (eVar != null) {
            return eVar;
        }
        X1.e eVar2 = new X1.e(this);
        this.f9704m = eVar2;
        return eVar2;
    }

    public Set C() {
        X1.f fVar = this.f9702k;
        if (fVar != null) {
            return fVar;
        }
        X1.f fVar2 = new X1.f(this);
        this.f9702k = fVar2;
        return fVar2;
    }

    public int D() {
        return this.f9701j;
    }

    public Collection E() {
        g gVar = this.f9703l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f9703l = gVar2;
        return gVar2;
    }

    public final e G() {
        return new e(this);
    }

    public final boolean M(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        p();
        int x4 = x(entry.getKey());
        if (x4 < 0) {
            return false;
        }
        Object[] objArr = this.f9694c;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[x4], entry.getValue())) {
            return false;
        }
        P(x4);
        return true;
    }

    public final int O(Object obj) {
        p();
        int x4 = x(obj);
        if (x4 < 0) {
            return -1;
        }
        P(x4);
        return x4;
    }

    public final boolean Q(Object obj) {
        p();
        int y4 = y(obj);
        if (y4 < 0) {
            return false;
        }
        P(y4);
        return true;
    }

    public final f S() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        p();
        E it = new IntRange(0, this.f9698g - 1).iterator();
        while (it.hasNext()) {
            int a4 = it.a();
            int[] iArr = this.f9695d;
            int i4 = iArr[a4];
            if (i4 >= 0) {
                this.f9696e[i4] = 0;
                iArr[a4] = -1;
            }
        }
        X1.c.g(this.f9693b, 0, this.f9698g);
        Object[] objArr = this.f9694c;
        if (objArr != null) {
            X1.c.g(objArr, 0, this.f9698g);
        }
        this.f9701j = 0;
        this.f9698g = 0;
        K();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return x(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return y(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return A();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && t((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int x4 = x(obj);
        if (x4 < 0) {
            return null;
        }
        Object[] objArr = this.f9694c;
        Intrinsics.checkNotNull(objArr);
        return objArr[x4];
    }

    @Override // java.util.Map
    public int hashCode() {
        b w4 = w();
        int i4 = 0;
        while (w4.hasNext()) {
            i4 += w4.l();
        }
        return i4;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C();
    }

    public final int m(Object obj) {
        p();
        while (true) {
            int F4 = F(obj);
            int g4 = kotlin.ranges.g.g(this.f9697f * 2, B() / 2);
            int i4 = 0;
            while (true) {
                int i5 = this.f9696e[F4];
                if (i5 <= 0) {
                    if (this.f9698g < z()) {
                        int i6 = this.f9698g;
                        int i7 = i6 + 1;
                        this.f9698g = i7;
                        this.f9693b[i6] = obj;
                        this.f9695d[i6] = F4;
                        this.f9696e[F4] = i7;
                        this.f9701j = size() + 1;
                        K();
                        if (i4 > this.f9697f) {
                            this.f9697f = i4;
                        }
                        return i6;
                    }
                    v(1);
                } else {
                    if (Intrinsics.areEqual(this.f9693b[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > g4) {
                        L(B() * 2);
                        break;
                    }
                    F4 = F4 == 0 ? B() - 1 : F4 - 1;
                }
            }
        }
    }

    public final Map o() {
        p();
        this.f9705n = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f9692p;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void p() {
        if (this.f9705n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        p();
        int m4 = m(obj);
        Object[] n4 = n();
        if (m4 >= 0) {
            n4[m4] = obj2;
            return null;
        }
        int i4 = (-m4) - 1;
        Object obj3 = n4[i4];
        n4[i4] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        p();
        H(from.entrySet());
    }

    public final boolean r(Collection m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!s((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int O3 = O(obj);
        if (O3 < 0) {
            return null;
        }
        Object[] objArr = this.f9694c;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[O3];
        X1.c.f(objArr, O3);
        return obj2;
    }

    public final boolean s(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int x4 = x(entry.getKey());
        if (x4 < 0) {
            return false;
        }
        Object[] objArr = this.f9694c;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[x4], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return D();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b w4 = w();
        int i4 = 0;
        while (w4.hasNext()) {
            if (i4 > 0) {
                sb.append(", ");
            }
            w4.k(sb);
            i4++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return E();
    }

    public final b w() {
        return new b(this);
    }

    public final int z() {
        return this.f9693b.length;
    }

    public d() {
        this(8);
    }

    public d(int i4) {
        this(X1.c.d(i4), null, new int[i4], new int[f9691o.c(i4)], 2, 0);
    }
}
