package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class sp0 extends AbstractC1934g<Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Iterator f31904d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ oj1 f31905e;

    sp0(Iterator it, oj1 oj1Var) {
        this.f31904d = it;
        this.f31905e = oj1Var;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1934g
    protected final Object a() {
        while (this.f31904d.hasNext()) {
            Object next = this.f31904d.next();
            if (this.f31905e.apply(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
