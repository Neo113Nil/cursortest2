package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class w73<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final List<F> f13746f;

    /* renamed from: g, reason: collision with root package name */
    final e43<? super F, ? extends T> f13747g;

    w73(List<F> list, e43<? super F, ? extends T> e43Var) {
        this.f13746f = list;
        this.f13747g = e43Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13746f.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i7) {
        return new v73(this, this.f13746f.listIterator(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13746f.size();
    }
}
