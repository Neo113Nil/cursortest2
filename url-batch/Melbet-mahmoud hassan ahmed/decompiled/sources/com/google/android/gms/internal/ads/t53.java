package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class t53 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    final Iterator f12096f;

    /* renamed from: g, reason: collision with root package name */
    final Collection f12097g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ u53 f12098h;

    t53(u53 u53Var) {
        this.f12098h = u53Var;
        Collection collection = u53Var.f12645g;
        this.f12097g = collection;
        this.f12096f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    t53(u53 u53Var, Iterator it) {
        this.f12098h = u53Var;
        this.f12097g = u53Var.f12645g;
        this.f12096f = it;
    }

    final void a() {
        this.f12098h.a();
        if (this.f12098h.f12645g != this.f12097g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f12096f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f12096f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        this.f12096f.remove();
        x53 x53Var = this.f12098h.f12648j;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - 1;
        this.f12098h.j();
    }
}
