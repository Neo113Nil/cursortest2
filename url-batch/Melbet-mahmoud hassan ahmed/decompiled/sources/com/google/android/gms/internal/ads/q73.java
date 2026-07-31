package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class q73 extends h93 {

    /* renamed from: f, reason: collision with root package name */
    boolean f10604f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f10605g;

    q73(Object obj) {
        this.f10605g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f10604f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10604f) {
            throw new NoSuchElementException();
        }
        this.f10604f = true;
        return this.f10605g;
    }
}
