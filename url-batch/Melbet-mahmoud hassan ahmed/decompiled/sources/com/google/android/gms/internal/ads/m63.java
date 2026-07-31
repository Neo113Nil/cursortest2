package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class m63 extends AbstractCollection {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n63 f8438f;

    m63(n63 n63Var) {
        this.f8438f = n63Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f8438f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        n63 n63Var = this.f8438f;
        Map o7 = n63Var.o();
        return o7 != null ? o7.values().iterator() : new f63(n63Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f8438f.size();
    }
}
