package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ir1 extends bf1<Comparable<?>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final ir1 f27387b = new ir1();
    private static final long serialVersionUID = 0;

    private ir1() {
    }

    private Object readResolve() {
        return f27387b;
    }

    @Override // com.yandex.mobile.ads.impl.bf1
    public final <S extends Comparable<?>> bf1<S> b() {
        return ec1.f25235b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
