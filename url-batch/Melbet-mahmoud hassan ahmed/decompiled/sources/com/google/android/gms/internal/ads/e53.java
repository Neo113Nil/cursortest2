package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class e53<E> extends i93<E> {

    /* renamed from: f, reason: collision with root package name */
    private final int f4497f;

    /* renamed from: g, reason: collision with root package name */
    private int f4498g;

    protected e53(int i7, int i8) {
        q43.b(i8, i7, "index");
        this.f4497f = i7;
        this.f4498g = i8;
    }

    protected abstract E a(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4498g < this.f4497f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4498g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4498g;
        this.f4498g = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4498g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4498g - 1;
        this.f4498g = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4498g - 1;
    }
}
