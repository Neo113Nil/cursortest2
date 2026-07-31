package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2240t2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2373yk f32123a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1916f5 f32124b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1800a9 f32125c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2288v4 f32126d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final q60 f32127e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qi1 f32128f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final mi1 f32129g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2380z4 f32130h;

    public C2240t2(@NotNull C2373yk bindingControllerHolder, @NotNull C2361y8 adStateDataController, @NotNull ki1 playerStateController, @NotNull C1916f5 adPlayerEventsController, @NotNull C1800a9 adStateHolder, @NotNull C2288v4 adPlaybackStateController, @NotNull q60 exoPlayerProvider, @NotNull qi1 playerVolumeController, @NotNull mi1 playerStateHolder, @NotNull C2380z4 adPlaybackStateSkipValidator) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(exoPlayerProvider, "exoPlayerProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateSkipValidator, "adPlaybackStateSkipValidator");
        this.f32123a = bindingControllerHolder;
        this.f32124b = adPlayerEventsController;
        this.f32125c = adStateHolder;
        this.f32126d = adPlaybackStateController;
        this.f32127e = exoPlayerProvider;
        this.f32128f = playerVolumeController;
        this.f32129g = playerStateHolder;
        this.f32130h = adPlaybackStateSkipValidator;
    }

    public final void a(@NotNull C1819b4 adInfo, @NotNull on0 videoAd) {
        boolean z4;
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.f32123a.b()) {
            ap0.f(new Object[0]);
            return;
        }
        if (dm0.f24678b == this.f32125c.a(videoAd)) {
            AdPlaybackState a4 = this.f32126d.a();
            if (a4.isAdInErrorState(adInfo.a(), adInfo.b())) {
                ap0.b(new Object[0]);
                return;
            }
            this.f32125c.a(videoAd, dm0.f24682f);
            AdPlaybackState withSkippedAd = a4.withSkippedAd(adInfo.a(), adInfo.b());
            Intrinsics.checkNotNullExpressionValue(withSkippedAd, "withSkippedAd(...)");
            this.f32126d.a(withSkippedAd);
            return;
        }
        if (!this.f32127e.b()) {
            ap0.b(new Object[0]);
            return;
        }
        int a5 = adInfo.a();
        int b4 = adInfo.b();
        AdPlaybackState adPlaybackState = this.f32126d.a();
        boolean isAdInErrorState = adPlaybackState.isAdInErrorState(a5, b4);
        this.f32130h.getClass();
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        if (a5 < adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(a5);
            Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
            int i4 = adGroup.count;
            if (i4 != -1 && b4 < i4 && adGroup.states[b4] == 2) {
                z4 = true;
                if (!isAdInErrorState || z4) {
                    ap0.b(new Object[0]);
                } else {
                    this.f32125c.a(videoAd, dm0.f24684h);
                    AdPlaybackState withAdResumePositionUs = adPlaybackState.withPlayedAd(a5, b4).withAdResumePositionUs(0L);
                    Intrinsics.checkNotNullExpressionValue(withAdResumePositionUs, "withAdResumePositionUs(...)");
                    this.f32126d.a(withAdResumePositionUs);
                    if (!this.f32129g.c()) {
                        this.f32125c.a((ti1) null);
                    }
                }
                this.f32128f.b();
                this.f32124b.g(videoAd);
            }
        }
        z4 = false;
        if (isAdInErrorState) {
        }
        ap0.b(new Object[0]);
        this.f32128f.b();
        this.f32124b.g(videoAd);
    }
}
