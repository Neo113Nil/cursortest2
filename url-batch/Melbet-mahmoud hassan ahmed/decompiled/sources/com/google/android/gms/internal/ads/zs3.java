package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class zs3 implements ListIterator<String> {

    /* renamed from: f, reason: collision with root package name */
    final ListIterator<String> f15256f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f15257g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ bt3 f15258h;

    zs3(bt3 bt3Var, int i7) {
        sq3 sq3Var;
        this.f15258h = bt3Var;
        this.f15257g = i7;
        sq3Var = bt3Var.f3523f;
        this.f15256f = sq3Var.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15256f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15256f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f15256f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15256f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f15256f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15256f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
