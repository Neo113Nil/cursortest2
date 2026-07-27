package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class K extends AbstractC0321c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5071a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5072b;

    public K(Object obj) {
        this.f5071a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f5072b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5072b) {
            throw new NoSuchElementException();
        }
        this.f5072b = true;
        return this.f5071a;
    }
}
