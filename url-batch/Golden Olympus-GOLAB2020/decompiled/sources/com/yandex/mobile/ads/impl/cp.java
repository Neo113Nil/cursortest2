package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cp extends AbstractC1855cg<gp, String> {
    @Override // com.yandex.mobile.ads.impl.AbstractC1855cg
    public final C2276uf a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return AbstractC1855cg.a(name, "string", new gp(gp.a.f26264b, value));
    }
}
