package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class at3 implements Iterator<String> {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<String> f2960f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ bt3 f2961g;

    at3(bt3 bt3Var) {
        sq3 sq3Var;
        this.f2961g = bt3Var;
        sq3Var = bt3Var.f3523f;
        this.f2960f = sq3Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2960f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f2960f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
