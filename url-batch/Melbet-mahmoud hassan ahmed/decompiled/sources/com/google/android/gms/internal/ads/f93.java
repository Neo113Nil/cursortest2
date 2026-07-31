package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class f93<F, T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<? extends F> f5052f;

    f93(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f5052f = it;
    }

    abstract T a(F f7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5052f.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f5052f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5052f.remove();
    }
}
