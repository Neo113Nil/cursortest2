package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ai implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f6675a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable[] f6676b;

    /* renamed from: c, reason: collision with root package name */
    public int f6677c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6678d;

    public ai(Throwable th) {
        this.f6675a = th;
        this.f6676b = th.getSuppressed();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i4;
        Throwable th = this.f6675a;
        this.f6678d = false;
        if (th != null) {
            this.f6675a = th.getCause();
        } else {
            Throwable[] thArr = this.f6676b;
            if (thArr != null && (i4 = this.f6677c) < thArr.length) {
                this.f6678d = i4 == 0;
                this.f6677c = i4 + 1;
                th = thArr[i4];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6675a != null) {
            return true;
        }
        Throwable[] thArr = this.f6676b;
        return thArr != null && this.f6677c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
