package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class an extends AbstractC1503l2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InternalNativeAdListener f15081a;

    public an(@NotNull InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f15081a = mNativeAdListener;
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f15081a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void d(@Nullable AdInfo adInfo) {
        this.f15081a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f15081a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull Placement placement, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f15081a.onNativeAdClicked(adInfo);
    }
}
