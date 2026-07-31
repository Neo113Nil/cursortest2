package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class t62<F, T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterator<? extends F> f32232b;

    t62(Iterator<? extends F> it) {
        this.f32232b = (Iterator) nj1.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32232b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f32232b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f32232b.remove();
    }
}
