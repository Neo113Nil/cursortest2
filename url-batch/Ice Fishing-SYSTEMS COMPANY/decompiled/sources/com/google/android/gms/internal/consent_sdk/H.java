package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class H extends Q implements ListIterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f35685n;

    /* renamed from: u, reason: collision with root package name */
    public int f35686u;

    /* renamed from: v, reason: collision with root package name */
    public final J f35687v;

    public H(J j9, int i) {
        int size = j9.size();
        E.d(i, size);
        this.f35685n = size;
        this.f35686u = i;
        this.f35687v = j9;
    }

    public final Object a(int i) {
        return this.f35687v.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35686u < this.f35685n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35686u > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f35686u;
        this.f35686u = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35686u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f35686u - 1;
        this.f35686u = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35686u - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
