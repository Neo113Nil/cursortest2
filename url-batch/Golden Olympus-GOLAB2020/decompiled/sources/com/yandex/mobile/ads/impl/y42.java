package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y42 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2288v4 f34799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2317wa f34800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lh1 f34801c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mi1 f34802d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final de2 f34803e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b82 f34804f;

    public y42(@NotNull C2288v4 adPlaybackStateController, @NotNull ki1 playerStateController, @NotNull C2317wa adsPlaybackInitializer, @NotNull lh1 playbackChangesHandler, @NotNull mi1 playerStateHolder, @NotNull de2 videoDurationHolder, @NotNull b82 updatedDurationAdPlaybackProvider) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adsPlaybackInitializer, "adsPlaybackInitializer");
        Intrinsics.checkNotNullParameter(playbackChangesHandler, "playbackChangesHandler");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(updatedDurationAdPlaybackProvider, "updatedDurationAdPlaybackProvider");
        this.f34799a = adPlaybackStateController;
        this.f34800b = adsPlaybackInitializer;
        this.f34801c = playbackChangesHandler;
        this.f34802d = playerStateHolder;
        this.f34803e = videoDurationHolder;
        this.f34804f = updatedDurationAdPlaybackProvider;
    }

    public final void a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        if (timeline.isEmpty()) {
            return;
        }
        if (timeline.getPeriodCount() != 1) {
            ap0.b(new Object[0]);
        }
        this.f34802d.a(timeline);
        Timeline.Period period = timeline.getPeriod(0, this.f34802d.a());
        Intrinsics.checkNotNullExpressionValue(period, "getPeriod(...)");
        long j4 = period.durationUs;
        this.f34803e.a(Util.usToMs(j4));
        if (j4 != -9223372036854775807L) {
            AdPlaybackState adPlaybackState = this.f34799a.a();
            this.f34804f.getClass();
            Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
            AdPlaybackState withContentDurationUs = adPlaybackState.withContentDurationUs(j4);
            Intrinsics.checkNotNullExpressionValue(withContentDurationUs, "withContentDurationUs(...)");
            int i4 = withContentDurationUs.adGroupCount;
            for (int i5 = 0; i5 < i4; i5++) {
                if (withContentDurationUs.getAdGroup(i5).timeUs > j4) {
                    withContentDurationUs = withContentDurationUs.withSkippedAdGroup(i5);
                    Intrinsics.checkNotNullExpressionValue(withContentDurationUs, "withSkippedAdGroup(...)");
                }
            }
            this.f34799a.a(withContentDurationUs);
        }
        if (!this.f34800b.a()) {
            this.f34800b.b();
        }
        this.f34801c.a();
    }
}
