package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class jh implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f291a;
    public final Throwable[] b;
    public int c;
    public boolean d;

    public jh(Throwable th) {
        this.f291a = th;
        this.b = th.getSuppressed();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i;
        Throwable th = this.f291a;
        this.d = false;
        if (th != null) {
            this.f291a = th.getCause();
        } else {
            Throwable[] thArr = this.b;
            if (thArr != null && (i = this.c) < thArr.length) {
                this.d = i == 0;
                this.c = i + 1;
                th = thArr[i];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f291a != null) {
            return true;
        }
        Throwable[] thArr = this.b;
        return thArr != null && this.c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
