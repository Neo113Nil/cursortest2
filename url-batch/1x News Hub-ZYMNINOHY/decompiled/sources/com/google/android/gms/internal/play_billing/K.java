package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class K extends AbstractC0209b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2754a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2755b;

    public K(Object obj) {
        this.f2754a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2755b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2755b) {
            throw new NoSuchElementException();
        }
        this.f2755b = true;
        return this.f2754a;
    }
}
