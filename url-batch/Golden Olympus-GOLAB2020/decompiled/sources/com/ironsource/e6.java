package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class e6 implements d6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f15978a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f15979b;

    public e6(@NotNull InterfaceC1541q3 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f15978a = analytics;
        this.f15979b = callbackExecutor;
    }

    @Override // com.ironsource.d6
    @NotNull
    public BannerAdView a(@NotNull sj adInstance, @NotNull wg adContainer, @NotNull C1587w4 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new p6(adInstance, adContainer, auctionDataReporter, this.f15978a, null, null, null, null, 240, null));
    }
}
