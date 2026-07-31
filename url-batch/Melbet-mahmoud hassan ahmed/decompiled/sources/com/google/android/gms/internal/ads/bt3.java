package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class bt3 extends AbstractList<String> implements RandomAccess, sq3 {

    /* renamed from: f, reason: collision with root package name */
    private final sq3 f3523f;

    public bt3(sq3 sq3Var) {
        this.f3523f = sq3Var;
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final Object E(int i7) {
        return this.f3523f.E(i7);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final sq3 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final List<?> f() {
        return this.f3523f.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return ((rq3) this.f3523f).get(i7);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final void h(uo3 uo3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new at3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i7) {
        return new zs3(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3523f.size();
    }
}
