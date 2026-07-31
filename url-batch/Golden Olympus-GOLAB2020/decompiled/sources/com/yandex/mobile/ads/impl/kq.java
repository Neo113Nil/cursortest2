package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class kq<T> extends bf1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final Comparator<T> f28302b;

    kq(Comparator<T> comparator) {
        this.f28302b = (Comparator) nj1.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(T t4, T t5) {
        return this.f28302b.compare(t4, t5);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq) {
            return this.f28302b.equals(((kq) obj).f28302b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28302b.hashCode();
    }

    public final String toString() {
        return this.f28302b.toString();
    }
}
