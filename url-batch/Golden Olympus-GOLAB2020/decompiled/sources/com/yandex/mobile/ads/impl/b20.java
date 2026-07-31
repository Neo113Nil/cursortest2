package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b20 {
    @NotNull
    public static q00 a(@NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull Cdo clickConnector, @NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        if (!(nativeAdPrivate instanceof pz1)) {
            return new b51(nativeAdPrivate, contentCloseListener, nativeAdEventListener, clickConnector, reporter, new z31(), new g61(), new C2208rg(g61.a(nativeAdPrivate)));
        }
        pz1 pz1Var = (pz1) nativeAdPrivate;
        return new oz1(pz1Var, contentCloseListener, nativeAdEventListener, clickConnector, reporter, new z31(), new g61(), new C2208rg(g61.b(pz1Var)));
    }
}
