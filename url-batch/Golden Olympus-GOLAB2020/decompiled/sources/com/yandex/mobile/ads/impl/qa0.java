package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qa0 extends AbstractC1855cg<pa0, ej0> {
    @Override // com.yandex.mobile.ads.impl.AbstractC1855cg
    public final C2276uf a(Object obj, String name) {
        ej0 value = (ej0) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return AbstractC1855cg.a(name, "feedback", new pa0(value));
    }
}
