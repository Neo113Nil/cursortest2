package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC1910f<E> extends y72<E> {

    /* renamed from: b, reason: collision with root package name */
    private final int f25528b;

    /* renamed from: c, reason: collision with root package name */
    private int f25529c;

    protected AbstractC1910f(int i4, int i5) {
        nj1.b(i5, i4);
        this.f25528b = i4;
        this.f25529c = i5;
    }

    protected abstract E a(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f25529c < this.f25528b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25529c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f25529c;
        this.f25529c = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25529c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f25529c - 1;
        this.f25529c = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25529c - 1;
    }
}
