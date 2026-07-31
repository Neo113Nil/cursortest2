package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class j63 extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n63 f6992f;

    j63(n63 n63Var) {
        this.f6992f = n63Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6992f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6992f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        n63 n63Var = this.f6992f;
        Map o7 = n63Var.o();
        return o7 != null ? o7.keySet().iterator() : new d63(n63Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object B;
        Object obj2;
        Map o7 = this.f6992f.o();
        if (o7 != null) {
            return o7.keySet().remove(obj);
        }
        B = this.f6992f.B(obj);
        obj2 = n63.f8955o;
        return B != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6992f.size();
    }
}
