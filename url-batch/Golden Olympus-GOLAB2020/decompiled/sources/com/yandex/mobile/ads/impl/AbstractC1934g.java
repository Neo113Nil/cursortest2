package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1934g<T> extends x72<T> {

    /* renamed from: b, reason: collision with root package name */
    private int f25956b = 2;

    /* renamed from: c, reason: collision with root package name */
    private T f25957c;

    protected AbstractC1934g() {
    }

    protected abstract T a();

    protected final void b() {
        this.f25956b = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f25956b;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int a4 = C2155p8.a(i4);
        if (a4 == 0) {
            return true;
        }
        if (a4 != 2) {
            this.f25956b = 4;
            this.f25957c = a();
            if (this.f25956b != 3) {
                this.f25956b = 1;
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
        this.f25956b = 2;
        T t4 = this.f25957c;
        this.f25957c = null;
        return t4;
    }
}
