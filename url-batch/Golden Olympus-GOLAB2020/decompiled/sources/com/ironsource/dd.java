package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.td;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class dd extends AbstractC1516n implements sd, ud {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fd f15893b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1460f1 f15894c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final td f15895d;

    public dd(@NotNull fd listener, @NotNull C1525o1 adTools, @NotNull C1460f1 adProperties, @NotNull td.b adUnitStrategyFactory, @NotNull qd fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f15893b = listener;
        this.f15894c = adProperties;
        this.f15895d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.d(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.ud
    public void a() {
        this.f15893b.a();
    }

    @Override // com.ironsource.ud
    public void b() {
        this.f15893b.b();
    }

    @Override // com.ironsource.InterfaceC1496k2
    public void c() {
        this.f15893b.onAdClicked();
    }

    public final void i() {
        this.f15895d.loadAd();
    }

    @Override // com.ironsource.ud
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f15893b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.sd
    public void onClosed() {
        this.f15893b.onAdClosed();
    }

    public /* synthetic */ dd(fd fdVar, C1525o1 c1525o1, C1460f1 c1460f1, td.b bVar, qd qdVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(fdVar, c1525o1, c1460f1, (i4 & 8) != 0 ? new td.b() : bVar, qdVar);
    }

    public final void a(@NotNull Activity activity, @Nullable Placement placement) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f15894c.a(placement);
        this.f15895d.a(activity);
    }

    @Override // com.ironsource.ud
    public void b(@Nullable IronSourceError ironSourceError) {
        fd fdVar = this.f15893b;
        String uuid = this.f15894c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        fdVar.a(new LevelPlayAdError(ironSourceError, uuid, this.f15894c.c()));
    }

    @Override // com.ironsource.ud
    public void a(@Nullable IronSourceError ironSourceError) {
        fd fdVar = this.f15893b;
        String uuid = this.f15894c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        fdVar.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.f15894c.c()));
    }

    @Override // com.ironsource.ud
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f15893b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.sd
    public void a(@NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f15893b.a(reward);
    }
}
