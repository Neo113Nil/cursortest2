package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ai implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f3571a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable[] f3572b;

    /* renamed from: c, reason: collision with root package name */
    public int f3573c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3574d;

    public ai(Throwable th) {
        this.f3571a = th;
        this.f3572b = th.getSuppressed();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i3;
        Throwable th = this.f3571a;
        this.f3574d = false;
        if (th != null) {
            this.f3571a = th.getCause();
        } else {
            Throwable[] thArr = this.f3572b;
            if (thArr != null && (i3 = this.f3573c) < thArr.length) {
                this.f3574d = i3 == 0;
                this.f3573c = i3 + 1;
                th = thArr[i3];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3571a != null) {
            return true;
        }
        Throwable[] thArr = this.f3572b;
        return thArr != null && this.f3573c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
