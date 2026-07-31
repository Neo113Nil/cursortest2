package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class bv3<E> extends AbstractList<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final cv3 f3546h = cv3.b(bv3.class);

    /* renamed from: f, reason: collision with root package name */
    final List<E> f3547f;

    /* renamed from: g, reason: collision with root package name */
    final Iterator<E> f3548g;

    public bv3(List<E> list, Iterator<E> it) {
        this.f3547f = list;
        this.f3548g = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        if (this.f3547f.size() > i7) {
            return this.f3547f.get(i7);
        }
        if (!this.f3548g.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3547f.add(this.f3548g.next());
        return get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new av3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        cv3 cv3Var = f3546h;
        cv3Var.a("potentially expensive size() call");
        cv3Var.a("blowup running");
        while (this.f3548g.hasNext()) {
            this.f3547f.add(this.f3548g.next());
        }
        return this.f3547f.size();
    }
}
