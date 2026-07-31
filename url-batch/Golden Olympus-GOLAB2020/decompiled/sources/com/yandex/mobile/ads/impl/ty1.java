package com.yandex.mobile.ads.impl;

import com.ironsource.b9;

/* loaded from: classes3.dex */
final class ty1<E> extends uj0<E> {

    /* renamed from: d, reason: collision with root package name */
    final transient E f32745d;

    ty1(E e4) {
        this.f32745d = (E) nj1.a(e4);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final int a(int i4, Object[] objArr) {
        objArr[i4] = this.f32745d;
        return i4 + 1;
    }

    @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0
    public final sj0<E> b() {
        return sj0.a(this.f32745d);
    }

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f32745d.equals(obj);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    final boolean f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.uj0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32745d.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.uj0, com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final x72<E> iterator() {
        return new tp0(this.f32745d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return b9.i.f15550d + this.f32745d.toString() + ']';
    }
}
