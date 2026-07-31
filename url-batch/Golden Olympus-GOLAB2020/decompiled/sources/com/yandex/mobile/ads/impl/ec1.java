package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ec1 extends bf1<Comparable<?>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final ec1 f25235b = new ec1();
    private static final long serialVersionUID = 0;

    private ec1() {
    }

    private Object readResolve() {
        return f25235b;
    }

    @Override // com.yandex.mobile.ads.impl.bf1
    public final <S extends Comparable<?>> bf1<S> b() {
        return ir1.f27387b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
