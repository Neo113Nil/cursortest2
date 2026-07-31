package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z42 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2311w4 f35461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2340xa f35462b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mh1 f35463c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ni1 f35464d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ee2 f35465e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c82 f35466f;

    public z42(@NotNull C2311w4 adPlaybackStateController, @NotNull li1 playerStateController, @NotNull C2340xa adsPlaybackInitializer, @NotNull mh1 playbackChangesHandler, @NotNull ni1 playerStateHolder, @NotNull ee2 videoDurationHolder, @NotNull c82 updatedDurationAdPlaybackProvider) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adsPlaybackInitializer, "adsPlaybackInitializer");
        Intrinsics.checkNotNullParameter(playbackChangesHandler, "playbackChangesHandler");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(updatedDurationAdPlaybackProvider, "updatedDurationAdPlaybackProvider");
        this.f35461a = adPlaybackStateController;
        this.f35462b = adsPlaybackInitializer;
        this.f35463c = playbackChangesHandler;
        this.f35464d = playerStateHolder;
        this.f35465e = videoDurationHolder;
        this.f35466f = updatedDurationAdPlaybackProvider;
    }

    public final void a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        if (timeline.isEmpty()) {
            return;
        }
        if (timeline.getPeriodCount() != 1) {
            ap0.b(new Object[0]);
        }
        this.f35464d.a(timeline);
        Timeline.Period period = timeline.getPeriod(0, this.f35464d.a());
        Intrinsics.checkNotNullExpressionValue(period, "getPeriod(...)");
        long j4 = period.durationUs;
        this.f35465e.a(Util.usToMs(j4));
        if (j4 != -9223372036854775807L) {
            AdPlaybackState adPlaybackState = this.f35461a.a();
            this.f35466f.getClass();
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
            this.f35461a.a(withContentDurationUs);
        }
        if (!this.f35462b.a()) {
            this.f35462b.b();
        }
        this.f35463c.a();
    }
}
