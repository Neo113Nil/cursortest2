package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final /* synthetic */ class xb2 extends kotlin.jvm.internal.p implements Function1<hb2, Unit> {
    xb2(z92 z92Var) {
        super(1, z92Var, xp1.class, "onFailure", "onFailure(Lcom/monetization/ads/video/VideoAdError;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hb2 p02 = (hb2) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((xp1) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
