package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class av3 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    int f2985f = 0;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ bv3 f2986g;

    av3(bv3 bv3Var) {
        this.f2986g = bv3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2985f < this.f2986g.f3547f.size() || this.f2986g.f3548g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2985f >= this.f2986g.f3547f.size()) {
            bv3 bv3Var = this.f2986g;
            bv3Var.f3547f.add(bv3Var.f3548g.next());
            return next();
        }
        List<E> list = this.f2986g.f3547f;
        int i7 = this.f2985f;
        this.f2985f = i7 + 1;
        return list.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
