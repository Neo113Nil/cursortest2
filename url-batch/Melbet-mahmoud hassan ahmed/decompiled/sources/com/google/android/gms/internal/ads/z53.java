package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes.dex */
final class z53 extends AbstractCollection {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a63 f14960f;

    z53(a63 a63Var) {
        this.f14960f = a63Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14960f.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14960f.h(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f14960f.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f14960f.b();
    }
}
