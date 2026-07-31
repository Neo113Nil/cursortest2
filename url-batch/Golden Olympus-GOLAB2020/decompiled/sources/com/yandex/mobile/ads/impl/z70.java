package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mj1 f35501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ee2 f35502b;

    public z70(@NotNull mj1 positionProviderHolder, @NotNull ee2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f35501a = positionProviderHolder;
        this.f35502b = videoDurationHolder;
    }

    public final void a(@NotNull AdPlaybackState adPlaybackState, int i4) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i4).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.f35502b.a();
        }
        this.f35501a.a(new b80(usToMs));
    }

    public final void a() {
        this.f35501a.a((b80) null);
    }
}
