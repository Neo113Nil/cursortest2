package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bo implements p72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hm0 f23881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2083m5 f23882b;

    public bo(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss coreInstreamAdBreak, @NotNull kn0 instreamVastAdPlayer, @NotNull ob2 videoAdInfo, @NotNull bg2 videoTracker, @NotNull cb2 playbackListener, @NotNull iu creativeAssetsProvider, @NotNull vn0 instreamVideoClicksProvider, @NotNull wd2 videoClicks, @NotNull hm0 clickListener, @NotNull C2083m5 adPlayerVolumeConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(creativeAssetsProvider, "creativeAssetsProvider");
        Intrinsics.checkNotNullParameter(instreamVideoClicksProvider, "instreamVideoClicksProvider");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f23881a = clickListener;
        this.f23882b = adPlayerVolumeConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(@NotNull j70 instreamAdView, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        instreamAdView.setOnClickListener(this.f23881a);
        this.f23882b.a(controlsState.a(), controlsState.d());
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(@NotNull j70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        instreamAdView.setOnClickListener(null);
        instreamAdView.setClickable(false);
    }
}
