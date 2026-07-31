package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class v33<T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    private T f13114f;

    /* renamed from: g, reason: collision with root package name */
    private int f13115g = 2;

    protected v33() {
    }

    protected abstract T a();

    protected final T b() {
        this.f13115g = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f13115g;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.f13115g = 4;
            this.f13114f = a();
            if (this.f13115g != 3) {
                this.f13115g = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13115g = 2;
        T t6 = this.f13114f;
        this.f13114f = null;
        return t6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
