package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279z extends AbstractC0209b0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f2964a;

    /* renamed from: b, reason: collision with root package name */
    public int f2965b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2966c;

    public C0279z(C c3, int i3) {
        int size = c3.size();
        AbstractC0216d1.q(i3, size);
        this.f2964a = size;
        this.f2965b = i3;
        this.f2966c = c3;
    }

    public final Object a(int i3) {
        return this.f2966c.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2965b < this.f2964a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2965b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2965b;
        this.f2965b = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2965b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2965b - 1;
        this.f2965b = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2965b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
