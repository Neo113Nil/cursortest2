package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zr implements p72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final as f35753a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2254tg f35754b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final im0 f35755c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fm0 f35756d;

    public zr(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull il0 customUiElementsHolder, @NotNull kn0 instreamVastAdPlayer, @NotNull ss coreInstreamAdBreak, @NotNull ob2 videoAdInfo, @NotNull bg2 videoTracker, @NotNull sk1 imageProvider, @NotNull cb2 playbackListener, @NotNull as controlsViewConfigurator, @NotNull qm0 assetsWrapperProvider, @NotNull pm0 assetsWrapper, @NotNull C2070lg assetViewConfiguratorsCreator, @NotNull List assetViewConfigurators, @NotNull C2254tg assetsViewConfigurator, @NotNull im0 instreamAdViewUiElementsManager, @NotNull ym0 instreamDesignProvider, @NotNull xm0 instreamDesign, @NotNull fm0 instreamAdUiElementsController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(controlsViewConfigurator, "controlsViewConfigurator");
        Intrinsics.checkNotNullParameter(assetsWrapperProvider, "assetsWrapperProvider");
        Intrinsics.checkNotNullParameter(assetsWrapper, "assetsWrapper");
        Intrinsics.checkNotNullParameter(assetViewConfiguratorsCreator, "assetViewConfiguratorsCreator");
        Intrinsics.checkNotNullParameter(assetViewConfigurators, "assetViewConfigurators");
        Intrinsics.checkNotNullParameter(assetsViewConfigurator, "assetsViewConfigurator");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(instreamDesignProvider, "instreamDesignProvider");
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        Intrinsics.checkNotNullParameter(instreamAdUiElementsController, "instreamAdUiElementsController");
        this.f35753a = controlsViewConfigurator;
        this.f35754b = assetsViewConfigurator;
        this.f35755c = instreamAdViewUiElementsManager;
        this.f35756d = instreamAdUiElementsController;
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(@NotNull j70 instreamAdView, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        db2 a4 = this.f35756d.a(instreamAdView);
        if (a4 != null) {
            this.f35753a.a(a4, controlsState);
            this.f35754b.a(a4);
            instreamAdView.addView(a4.a(), new ViewGroup.LayoutParams(-1, -1));
        }
        this.f35755c.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        instreamAdView.setAdUiElements(a4);
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(@NotNull j70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        this.f35755c.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        db2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            instreamAdView.removeView(adUiElements.a());
        }
        this.f35755c.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        instreamAdView.setAdUiElements(null);
    }
}
