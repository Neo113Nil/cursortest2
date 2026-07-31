package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class jr1<T> extends bf1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final bf1<? super T> f27815b;

    jr1(bf1<? super T> bf1Var) {
        this.f27815b = (bf1) nj1.a(bf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bf1
    public final <S extends T> bf1<S> b() {
        return this.f27815b;
    }

    @Override // java.util.Comparator
    public final int compare(T t4, T t5) {
        return this.f27815b.compare(t5, t4);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jr1) {
            return this.f27815b.equals(((jr1) obj).f27815b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f27815b.hashCode();
    }

    public final String toString() {
        return this.f27815b + ".reverse()";
    }
}
