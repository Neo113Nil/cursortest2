package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class ho1<E> extends uj0<E> {

    /* renamed from: i, reason: collision with root package name */
    private static final Object[] f26872i = null;

    /* renamed from: j, reason: collision with root package name */
    static final ho1<Object> f26873j;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f26874d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f26875e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f26876f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f26877g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f26878h;

    static {
        Object[] objArr = new Object[0];
        f26873j = new ho1<>(objArr, 0, objArr, 0, 0);
    }

    ho1(Object[] objArr, int i4, Object[] objArr2, int i5, int i6) {
        this.f26874d = objArr;
        this.f26875e = i4;
        this.f26876f = objArr2;
        this.f26877g = i5;
        this.f26878h = i6;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int a(int i4, Object[] objArr) {
        System.arraycopy(this.f26874d, 0, objArr, i4, this.f26878h);
        return i4 + this.f26878h;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final Object[] c() {
        return this.f26874d;
    }

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f26876f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a4 = ye0.a(obj.hashCode());
        while (true) {
            int i4 = a4 & this.f26877g;
            Object obj2 = objArr[i4];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a4 = i4 + 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int d() {
        return this.f26878h;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.uj0
    final sj0<E> g() {
        return sj0.b(this.f26878h, this.f26874d);
    }

    @Override // com.yandex.mobile.ads.impl.uj0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26875e;
    }

    @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final x72<E> iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26878h;
    }
}
