package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes.dex */
abstract class g93<F, T> extends f93<F, T> implements ListIterator<T> {
    g93(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f5052f).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f5052f).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f5052f).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f5052f).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t6) {
        throw new UnsupportedOperationException();
    }
}
