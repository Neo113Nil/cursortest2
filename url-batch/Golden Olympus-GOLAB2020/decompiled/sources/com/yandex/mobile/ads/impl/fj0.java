package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fj0 extends AbstractC1855cg<ej0, ej0> {
    @Override // com.yandex.mobile.ads.impl.AbstractC1855cg
    public final C2276uf a(Object obj, String name) {
        ej0 value = (ej0) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return AbstractC1855cg.a(name, "image", value);
    }
}
