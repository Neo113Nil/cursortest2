package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* loaded from: classes3.dex */
final class fo1<E> extends sj0<E> {

    /* renamed from: g, reason: collision with root package name */
    static final sj0<Object> f25884g = new fo1(0, new Object[0]);

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f25885e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f25886f;

    fo1(int i4, Object[] objArr) {
        this.f25885e = objArr;
        this.f25886f = i4;
    }

    @Override // com.yandex.mobile.ads.impl.sj0, com.yandex.mobile.ads.impl.qj0
    final int a(int i4, Object[] objArr) {
        System.arraycopy(this.f25885e, 0, objArr, i4, this.f25886f);
        return i4 + this.f25886f;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final Object[] c() {
        return this.f25885e;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int d() {
        return this.f25886f;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i4) {
        nj1.a(i4, this.f25886f);
        E e4 = (E) this.f25885e[i4];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25886f;
    }
}
