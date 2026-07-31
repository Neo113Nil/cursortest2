package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
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
public final class jb extends AbstractC1503l2 {
    @Override // com.ironsource.AbstractC1503l2
    public void a() {
    }

    @Override // com.ironsource.AbstractC1503l2
    public void b() {
    }

    @Override // com.ironsource.AbstractC1503l2
    public void c(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void d(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void g(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void b(@NotNull Placement placement, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@Nullable IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull IronSourceError error, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(@NotNull Placement placement, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(boolean z4, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
