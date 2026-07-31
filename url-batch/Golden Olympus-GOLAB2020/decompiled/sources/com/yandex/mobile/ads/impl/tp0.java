package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class tp0 extends x72<Object> {

    /* renamed from: b, reason: collision with root package name */
    boolean f32547b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f32548c;

    tp0(Object obj) {
        this.f32548c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f32547b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32547b) {
            throw new NoSuchElementException();
        }
        this.f32547b = true;
        return this.f32548c;
    }
}
