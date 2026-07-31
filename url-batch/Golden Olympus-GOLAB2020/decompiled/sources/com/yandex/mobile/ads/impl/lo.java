package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2276uf<?> f28684a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2172q2 f28685b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v61 f28686c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qo1 f28687d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wb0 f28688e;

    public lo(@NotNull C2276uf<?> asset, @NotNull InterfaceC2172q2 adClickable, @NotNull v61 nativeAdViewAdapter, @NotNull qo1 renderedTimer, @NotNull wb0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f28684a = asset;
        this.f28685b = adClickable;
        this.f28686c = nativeAdViewAdapter;
        this.f28687d = renderedTimer;
        this.f28688e = forceImpressionTrackingListener;
    }

    @NotNull
    public final View.OnClickListener a(@NotNull dr0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        return this.f28686c.g().a(this.f28684a, link, this.f28685b, this.f28686c, this.f28687d, this.f28688e);
    }
}
