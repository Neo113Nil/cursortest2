package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class jx1 extends AbstractC1934g<Object> {

    /* renamed from: d, reason: collision with root package name */
    final Iterator<Object> f27893d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kx1 f27894e;

    jx1(kx1 kx1Var) {
        this.f27894e = kx1Var;
        this.f27893d = kx1Var.f28349b.iterator();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1934g
    protected final Object a() {
        while (this.f27893d.hasNext()) {
            Object next = this.f27893d.next();
            if (this.f27894e.f28350c.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
