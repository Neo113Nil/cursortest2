package com.yandex.mobile.ads.impl;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class go1<K, V> extends tj0<K, V> {

    /* renamed from: h, reason: collision with root package name */
    static final tj0<Object, Object> f26248h = new go1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f26249e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f26250f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f26251g;

    static class a<K, V> extends uj0<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private final transient tj0<K, V> f26252d;

        /* renamed from: e, reason: collision with root package name */
        private final transient Object[] f26253e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f26254f = 0;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f26255g;

        /* renamed from: com.yandex.mobile.ads.impl.go1$a$a, reason: collision with other inner class name */
        final class C0189a extends sj0<Map.Entry<K, V>> {
            C0189a() {
            }

            @Override // com.yandex.mobile.ads.impl.qj0
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i4) {
                nj1.a(i4, a.this.f26255g);
                a aVar = a.this;
                int i5 = i4 * 2;
                Object obj = aVar.f26253e[aVar.f26254f + i5];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f26253e[i5 + (aVar2.f26254f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f26255g;
            }
        }

        a(tj0 tj0Var, Object[] objArr, int i4) {
            this.f26252d = tj0Var;
            this.f26253e = objArr;
            this.f26255g = i4;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final int a(int i4, Object[] objArr) {
            return b().a(i4, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f26252d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.uj0
        final sj0<Map.Entry<K, V>> g() {
            return new C0189a();
        }

        @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final x72<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f26255g;
        }
    }

    static final class b<K> extends uj0<K> {

        /* renamed from: d, reason: collision with root package name */
        private final transient tj0<K, ?> f26257d;

        /* renamed from: e, reason: collision with root package name */
        private final transient sj0<K> f26258e;

        b(tj0<K, ?> tj0Var, sj0<K> sj0Var) {
            this.f26257d = tj0Var;
            this.f26258e = sj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final int a(int i4, Object[] objArr) {
            return this.f26258e.a(i4, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0
        public final sj0<K> b() {
            return this.f26258e;
        }

        @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f26257d.get(obj) != null;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final x72<K> iterator() {
            return this.f26258e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f26257d.size();
        }
    }

    static final class c extends sj0<Object> {

        /* renamed from: e, reason: collision with root package name */
        private final transient Object[] f26259e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f26260f;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f26261g;

        c(Object[] objArr, int i4, int i5) {
            this.f26259e = objArr;
            this.f26260f = i4;
            this.f26261g = i5;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i4) {
            nj1.a(i4, this.f26261g);
            Object obj = this.f26259e[(i4 * 2) + this.f26260f];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f26261g;
        }
    }

    private go1(Object obj, Object[] objArr, int i4) {
        this.f26249e = obj;
        this.f26250f = objArr;
        this.f26251g = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> go1<K, V> a(int i4, Object[] objArr) {
        byte[] bArr;
        if (i4 == 0) {
            return (go1) f26248h;
        }
        Object obj = null;
        int i5 = 0;
        if (i4 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new go1<>(null, objArr, 1);
        }
        nj1.b(i4, objArr.length >> 1);
        int a4 = uj0.a(i4);
        if (i4 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
        } else {
            int i6 = a4 - 1;
            if (a4 <= 128) {
                bArr = new byte[a4];
                Arrays.fill(bArr, (byte) -1);
                while (i5 < i4) {
                    int i7 = i5 * 2;
                    Object obj2 = objArr[i7];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr[i7 ^ 1];
                    Objects.requireNonNull(obj3);
                    int a5 = ye0.a(obj2.hashCode());
                    while (true) {
                        int i8 = a5 & i6;
                        int i9 = bArr[i8] & KotlinVersion.MAX_COMPONENT_VALUE;
                        if (i9 == 255) {
                            break;
                        }
                        if (obj2.equals(objArr[i9])) {
                            throw a(obj2, obj3, objArr, i9);
                        }
                        a5 = i8 + 1;
                    }
                }
            } else if (a4 <= 32768) {
                bArr = new short[a4];
                Arrays.fill(bArr, (short) -1);
                while (i5 < i4) {
                    int i10 = i5 * 2;
                    Object obj4 = objArr[i10];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArr[i10 ^ 1];
                    Objects.requireNonNull(obj5);
                    int a6 = ye0.a(obj4.hashCode());
                    while (true) {
                        int i11 = a6 & i6;
                        int i12 = bArr[i11] & 65535;
                        if (i12 == 65535) {
                            break;
                        }
                        if (obj4.equals(objArr[i12])) {
                            throw a(obj4, obj5, objArr, i12);
                        }
                        a6 = i11 + 1;
                    }
                }
            } else {
                bArr = new int[a4];
                Arrays.fill((int[]) bArr, -1);
                while (i5 < i4) {
                    int i13 = i5 * 2;
                    Object obj6 = objArr[i13];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr[i13 ^ 1];
                    Objects.requireNonNull(obj7);
                    int a7 = ye0.a(obj6.hashCode());
                    while (true) {
                        int i14 = a7 & i6;
                        ?? r8 = bArr[i14];
                        if (r8 == -1) {
                            break;
                        }
                        if (obj6.equals(objArr[r8])) {
                            throw a(obj6, obj7, objArr, r8);
                        }
                        a7 = i14 + 1;
                    }
                }
            }
            obj = bArr;
        }
        return new go1<>(obj, objArr, i4);
    }

    @Override // com.yandex.mobile.ads.impl.tj0
    final uj0<Map.Entry<K, V>> b() {
        return new a(this, this.f26250f, this.f26251g);
    }

    @Override // com.yandex.mobile.ads.impl.tj0
    final uj0<K> c() {
        return new b(this, new c(this.f26250f, 0, this.f26251g));
    }

    @Override // com.yandex.mobile.ads.impl.tj0
    final qj0<V> d() {
        return new c(this.f26250f, 1, this.f26251g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.tj0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v4;
        Object obj2 = this.f26249e;
        Object[] objArr = this.f26250f;
        int i4 = this.f26251g;
        if (obj != null) {
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v4 = (V) objArr[1];
                    Objects.requireNonNull(v4);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int a4 = ye0.a(obj.hashCode());
                    while (true) {
                        int i5 = a4 & length;
                        int i6 = bArr[i5] & 255;
                        if (i6 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            v4 = (V) objArr[i6 ^ 1];
                            break;
                        }
                        a4 = i5 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int a5 = ye0.a(obj.hashCode());
                    while (true) {
                        int i7 = a5 & length2;
                        int i8 = sArr[i7] & 65535;
                        if (i8 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            v4 = (V) objArr[i8 ^ 1];
                            break;
                        }
                        a5 = i7 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int a6 = ye0.a(obj.hashCode());
                    while (true) {
                        int i9 = a6 & length3;
                        int i10 = iArr[i9];
                        if (i10 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            v4 = (V) objArr[i10 ^ 1];
                            break;
                        }
                        a6 = i9 + 1;
                    }
                }
            }
            if (v4 != null) {
                return null;
            }
            return v4;
        }
        v4 = null;
        if (v4 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26251g;
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i4) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i4] + "=" + objArr[i4 ^ 1]);
    }
}
