package m4;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class k0<K, V> extends r<K, V> {

    /* renamed from: m, reason: collision with root package name */
    static final r<Object, Object> f19161m = new k0(null, new Object[0], 0);

    /* renamed from: j, reason: collision with root package name */
    private final transient Object f19162j;

    /* renamed from: k, reason: collision with root package name */
    final transient Object[] f19163k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f19164l;

    static class a<K, V> extends s<Map.Entry<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        private final transient r<K, V> f19165h;

        /* renamed from: i, reason: collision with root package name */
        private final transient Object[] f19166i;

        /* renamed from: j, reason: collision with root package name */
        private final transient int f19167j;

        /* renamed from: k, reason: collision with root package name */
        private final transient int f19168k;

        /* renamed from: m4.k0$a$a, reason: collision with other inner class name */
        class C0102a extends q<Map.Entry<K, V>> {
            C0102a() {
            }

            @Override // java.util.List
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i7) {
                l4.j.g(i7, a.this.f19168k);
                int i8 = i7 * 2;
                Object obj = a.this.f19166i[a.this.f19167j + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f19166i[i8 + (a.this.f19167j ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // m4.o
            public boolean n() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f19168k;
            }
        }

        a(r<K, V> rVar, Object[] objArr, int i7, int i8) {
            this.f19165h = rVar;
            this.f19166i = objArr;
            this.f19167j = i7;
            this.f19168k = i8;
        }

        @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f19165h.get(key));
        }

        @Override // m4.o
        int j(Object[] objArr, int i7) {
            return i().j(objArr, i7);
        }

        @Override // m4.o
        boolean n() {
            return true;
        }

        @Override // m4.s, m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public s0<Map.Entry<K, V>> iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f19168k;
        }

        @Override // m4.s
        q<Map.Entry<K, V>> t() {
            return new C0102a();
        }
    }

    static final class b<K> extends s<K> {

        /* renamed from: h, reason: collision with root package name */
        private final transient r<K, ?> f19170h;

        /* renamed from: i, reason: collision with root package name */
        private final transient q<K> f19171i;

        b(r<K, ?> rVar, q<K> qVar) {
            this.f19170h = rVar;
            this.f19171i = qVar;
        }

        @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f19170h.get(obj) != null;
        }

        @Override // m4.s, m4.o
        public q<K> i() {
            return this.f19171i;
        }

        @Override // m4.o
        int j(Object[] objArr, int i7) {
            return i().j(objArr, i7);
        }

        @Override // m4.o
        boolean n() {
            return true;
        }

        @Override // m4.s, m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public s0<K> iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f19170h.size();
        }
    }

    static final class c extends q<Object> {

        /* renamed from: h, reason: collision with root package name */
        private final transient Object[] f19172h;

        /* renamed from: i, reason: collision with root package name */
        private final transient int f19173i;

        /* renamed from: j, reason: collision with root package name */
        private final transient int f19174j;

        c(Object[] objArr, int i7, int i8) {
            this.f19172h = objArr;
            this.f19173i = i7;
            this.f19174j = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            l4.j.g(i7, this.f19174j);
            Object obj = this.f19172h[(i7 * 2) + this.f19173i];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // m4.o
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19174j;
        }
    }

    private k0(Object obj, Object[] objArr, int i7) {
        this.f19162j = obj;
        this.f19163k = objArr;
        this.f19164l = i7;
    }

    static <K, V> k0<K, V> l(int i7, Object[] objArr) {
        if (i7 == 0) {
            return (k0) f19161m;
        }
        if (i7 != 1) {
            l4.j.k(i7, objArr.length >> 1);
            return new k0<>(m(objArr, i7, s.p(i7), 0), objArr, i7);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        h.a(obj, obj2);
        return new k0<>(null, objArr, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object m(Object[] objArr, int i7, int i8, int i9) {
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return null;
        }
        int i10 = i8 - 1;
        int i11 = 0;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            while (i11 < i7) {
                int i12 = (i11 * 2) + i9;
                Object obj3 = objArr[i12];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i12 ^ 1];
                Objects.requireNonNull(obj4);
                h.a(obj3, obj4);
                int a7 = n.a(obj3.hashCode());
                while (true) {
                    int i13 = a7 & i10;
                    int i14 = bArr[i13] & 255;
                    if (i14 == 255) {
                        break;
                    }
                    if (obj3.equals(objArr[i14])) {
                        throw n(obj3, obj4, objArr, i14);
                    }
                    a7 = i13 + 1;
                }
            }
            return bArr;
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            while (i11 < i7) {
                int i15 = (i11 * 2) + i9;
                Object obj5 = objArr[i15];
                Objects.requireNonNull(obj5);
                Object obj6 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj6);
                h.a(obj5, obj6);
                int a8 = n.a(obj5.hashCode());
                while (true) {
                    int i16 = a8 & i10;
                    int i17 = sArr[i16] & 65535;
                    if (i17 == 65535) {
                        break;
                    }
                    if (obj5.equals(objArr[i17])) {
                        throw n(obj5, obj6, objArr, i17);
                    }
                    a8 = i16 + 1;
                }
            }
            return sArr;
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        while (i11 < i7) {
            int i18 = (i11 * 2) + i9;
            Object obj7 = objArr[i18];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i18 ^ 1];
            Objects.requireNonNull(obj8);
            h.a(obj7, obj8);
            int a9 = n.a(obj7.hashCode());
            while (true) {
                int i19 = a9 & i10;
                int i20 = iArr[i19];
                if (i20 == -1) {
                    break;
                }
                if (obj7.equals(objArr[i20])) {
                    throw n(obj7, obj8, objArr, i20);
                }
                a9 = i19 + 1;
            }
        }
        return iArr;
    }

    private static IllegalArgumentException n(Object obj, Object obj2, Object[] objArr, int i7) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i7]);
        String valueOf4 = String.valueOf(objArr[i7 ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    static Object o(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a7 = n.a(obj2.hashCode());
            while (true) {
                int i9 = a7 & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                a7 = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a8 = n.a(obj2.hashCode());
            while (true) {
                int i11 = a8 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                a8 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int a9 = n.a(obj2.hashCode());
            while (true) {
                int i13 = a9 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                a9 = i13 + 1;
            }
        }
    }

    @Override // m4.r
    s<Map.Entry<K, V>> d() {
        return new a(this, this.f19163k, 0, this.f19164l);
    }

    @Override // m4.r
    s<K> e() {
        return new b(this, new c(this.f19163k, 0, this.f19164l));
    }

    @Override // m4.r
    o<V> f() {
        return new c(this.f19163k, 1, this.f19164l);
    }

    @Override // m4.r, java.util.Map
    public V get(Object obj) {
        V v6 = (V) o(this.f19162j, this.f19163k, this.f19164l, 0, obj);
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // m4.r
    boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f19164l;
    }
}
