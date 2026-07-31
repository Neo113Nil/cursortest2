package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class be2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2311w4 f23726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ye2 f23727b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zd2 f23728c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23729d;

    public be2(@NotNull C2311w4 adPlaybackStateController, @NotNull ee2 videoDurationHolder, @NotNull mj1 positionProviderHolder, @NotNull ye2 videoPlayerEventsController, @NotNull zd2 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f23726a = adPlaybackStateController;
        this.f23727b = videoPlayerEventsController;
        this.f23728c = videoCompleteNotifyPolicy;
    }

    public final void a() {
        if (this.f23729d) {
            return;
        }
        this.f23729d = true;
        AdPlaybackState a4 = this.f23726a.a();
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
                this.f23726a.a(a4);
            }
        }
        this.f23727b.onVideoCompleted();
    }

    public final boolean b() {
        return this.f23729d;
    }

    public final void c() {
        if (this.f23728c.a()) {
            a();
        }
    }
}
