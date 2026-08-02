package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r implements ListIterator, Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f5997a;

    /* renamed from: b, reason: collision with root package name */
    public int f5998b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0346t f5999c;

    public r(AbstractC0346t abstractC0346t, int i4) {
        int size = abstractC0346t.size();
        U.i.I(i4, size);
        this.f5997a = size;
        this.f5998b = i4;
        this.f5999c = abstractC0346t;
    }

    public final Object a(int i4) {
        return this.f5999c.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5998b < this.f5997a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5998b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f5998b;
        this.f5998b = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5998b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f5998b - 1;
        this.f5998b = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5998b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
