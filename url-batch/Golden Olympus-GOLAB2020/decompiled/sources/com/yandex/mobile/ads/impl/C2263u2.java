package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2263u2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2396zk f32773a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1940g5 f32774b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1824b9 f32775c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2311w4 f32776d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r60 f32777e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ri1 f32778f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ni1 f32779g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1796a5 f32780h;

    public C2263u2(@NotNull C2396zk bindingControllerHolder, @NotNull C2384z8 adStateDataController, @NotNull li1 playerStateController, @NotNull C1940g5 adPlayerEventsController, @NotNull C1824b9 adStateHolder, @NotNull C2311w4 adPlaybackStateController, @NotNull r60 exoPlayerProvider, @NotNull ri1 playerVolumeController, @NotNull ni1 playerStateHolder, @NotNull C1796a5 adPlaybackStateSkipValidator) {
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
        this.f32773a = bindingControllerHolder;
        this.f32774b = adPlayerEventsController;
        this.f32775c = adStateHolder;
        this.f32776d = adPlaybackStateController;
        this.f32777e = exoPlayerProvider;
        this.f32778f = playerVolumeController;
        this.f32779g = playerStateHolder;
        this.f32780h = adPlaybackStateSkipValidator;
    }

    public final void a(@NotNull C1843c4 adInfo, @NotNull on0 videoAd) {
        boolean z4;
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.f32773a.b()) {
            ap0.f(new Object[0]);
            return;
        }
        if (em0.f25351b == this.f32775c.a(videoAd)) {
            AdPlaybackState a4 = this.f32776d.a();
            if (a4.isAdInErrorState(adInfo.a(), adInfo.b())) {
                ap0.b(new Object[0]);
                return;
            }
            this.f32775c.a(videoAd, em0.f25355f);
            AdPlaybackState withSkippedAd = a4.withSkippedAd(adInfo.a(), adInfo.b());
            Intrinsics.checkNotNullExpressionValue(withSkippedAd, "withSkippedAd(...)");
            this.f32776d.a(withSkippedAd);
            return;
        }
        if (!this.f32777e.b()) {
            ap0.b(new Object[0]);
            return;
        }
        int a5 = adInfo.a();
        int b4 = adInfo.b();
        AdPlaybackState adPlaybackState = this.f32776d.a();
        boolean isAdInErrorState = adPlaybackState.isAdInErrorState(a5, b4);
        this.f32780h.getClass();
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
                    this.f32775c.a(videoAd, em0.f25357h);
                    AdPlaybackState withAdResumePositionUs = adPlaybackState.withPlayedAd(a5, b4).withAdResumePositionUs(0L);
                    Intrinsics.checkNotNullExpressionValue(withAdResumePositionUs, "withAdResumePositionUs(...)");
                    this.f32776d.a(withAdResumePositionUs);
                    if (!this.f32779g.c()) {
                        this.f32775c.a((ui1) null);
                    }
                }
                this.f32778f.b();
                this.f32774b.g(videoAd);
            }
        }
        z4 = false;
        if (isAdInErrorState) {
        }
        ap0.b(new Object[0]);
        this.f32778f.b();
        this.f32774b.g(videoAd);
    }
}
