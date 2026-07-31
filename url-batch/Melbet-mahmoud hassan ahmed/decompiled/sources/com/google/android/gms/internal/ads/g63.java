package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class g63 extends AbstractSet<Map.Entry> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n63 f5470f;

    g63(n63 n63Var) {
        this.f5470f = n63Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5470f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int z6;
        Map o7 = this.f5470f.o();
        if (o7 != null) {
            return o7.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            z6 = this.f5470f.z(entry.getKey());
            if (z6 != -1 && m43.a(n63.m(this.f5470f, z6), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        n63 n63Var = this.f5470f;
        Map o7 = n63Var.o();
        return o7 != null ? o7.entrySet().iterator() : new e63(n63Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int y6;
        int[] a7;
        Object[] b7;
        Object[] c7;
        int i7;
        Map o7 = this.f5470f.o();
        if (o7 != null) {
            return o7.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f5470f.u()) {
            return false;
        }
        y6 = this.f5470f.y();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object l7 = n63.l(this.f5470f);
        a7 = this.f5470f.a();
        b7 = this.f5470f.b();
        c7 = this.f5470f.c();
        int b8 = o63.b(key, value, y6, l7, a7, b7, c7);
        if (b8 == -1) {
            return false;
        }
        this.f5470f.t(b8, y6);
        n63 n63Var = this.f5470f;
        i7 = n63Var.f8961k;
        n63Var.f8961k = i7 - 1;
        this.f5470f.r();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5470f.size();
    }
}
