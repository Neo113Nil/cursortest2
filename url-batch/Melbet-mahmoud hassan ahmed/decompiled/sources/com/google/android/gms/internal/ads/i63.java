package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class i63<T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    int f6551f;

    /* renamed from: g, reason: collision with root package name */
    int f6552g;

    /* renamed from: h, reason: collision with root package name */
    int f6553h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n63 f6554i;

    /* synthetic */ i63(n63 n63Var, h63 h63Var) {
        int i7;
        this.f6554i = n63Var;
        i7 = n63Var.f8960j;
        this.f6551f = i7;
        this.f6552g = n63Var.h();
        this.f6553h = -1;
    }

    private final void b() {
        int i7;
        i7 = this.f6554i.f8960j;
        if (i7 != this.f6551f) {
            throw new ConcurrentModificationException();
        }
    }

    abstract T a(int i7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6552g >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6552g;
        this.f6553h = i7;
        T a7 = a(i7);
        this.f6552g = this.f6554i.i(this.f6552g);
        return a7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        q43.g(this.f6553h >= 0, "no calls to next() since the last call to remove()");
        this.f6551f += 32;
        n63 n63Var = this.f6554i;
        n63Var.remove(n63.j(n63Var, this.f6553h));
        this.f6552g--;
        this.f6553h = -1;
    }
}
