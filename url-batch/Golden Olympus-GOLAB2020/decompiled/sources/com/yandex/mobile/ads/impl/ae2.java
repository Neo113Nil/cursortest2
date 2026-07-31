package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ae2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2288v4 f23255a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ze2 f23256b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yd2 f23257c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23258d;

    public ae2(@NotNull C2288v4 adPlaybackStateController, @NotNull de2 videoDurationHolder, @NotNull lj1 positionProviderHolder, @NotNull ze2 videoPlayerEventsController, @NotNull yd2 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f23255a = adPlaybackStateController;
        this.f23256b = videoPlayerEventsController;
        this.f23257c = videoCompleteNotifyPolicy;
    }

    public final void a() {
        if (this.f23258d) {
            return;
        }
        this.f23258d = true;
        AdPlaybackState a4 = this.f23255a.a();
        int i4 = a4.adGroupCount;
        for (int i5 = 0; i5 < i4; i5++) {
            AdPlaybackState.AdGroup adGroup = a4.getAdGroup(i5);
            Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
            if (adGroup.timeUs != Long.MIN_VALUE) {
                if (adGroup.count < 0) {
                    a4 = a4.withAdCount(i5, 1);
                    Intrinsics.checkNotNullExpressionValue(a4, "withAdCount(...)");
                }
                a4 = a4.withSkippedAdGroup(i5);
                Intrinsics.checkNotNullExpressionValue(a4, "withSkippedAdGroup(...)");
                this.f23255a.a(a4);
            }
        }
        this.f23256b.onVideoCompleted();
    }

    public final boolean b() {
        return this.f23258d;
    }

    public final void c() {
        if (this.f23257c.a()) {
            a();
        }
    }
}
