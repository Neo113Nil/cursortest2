package com.yandex.mobile.ads.impl;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iq {
    @NotNull
    public static nq a(@NotNull f61 nativeAd, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull q00 adTypeSpecificBinder, @NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(adTypeSpecificBinder, "adTypeSpecificBinder");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        ct adAssets = nativeAd.getAdAssets();
        return new nq(new qd0(nativeAd, contentCloseListener, nativeAdEventListener, reporter, new C2208rg(CollectionsKt.emptyList()), new y31()), new C2159pc(adAssets, new c51()), new fv0(adAssets, new p41()), new hn1(adAssets, new in1(), new v31(), new p41()), adTypeSpecificBinder);
    }
}
