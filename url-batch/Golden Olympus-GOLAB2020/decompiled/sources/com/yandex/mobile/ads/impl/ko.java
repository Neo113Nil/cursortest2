package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ko {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2172q2 f28278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qo1 f28279b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wb0 f28280c;

    public ko(@NotNull C2149p2 adClickable, @NotNull qo1 renderedTimer, @NotNull wb0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f28278a = adClickable;
        this.f28279b = renderedTimer;
        this.f28280c = forceImpressionTrackingListener;
    }

    public final void a(@NotNull C2276uf<?> asset, @Nullable dr0 dr0Var, @NotNull v61 nativeAdViewAdapter, @NotNull jo clickListenerConfigurable) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurable, "clickListenerConfigurable");
        if (!asset.e() || dr0Var == null) {
            return;
        }
        clickListenerConfigurable.a(dr0Var, new lo(asset, this.f28278a, nativeAdViewAdapter, this.f28279b, this.f28280c));
    }
}
