package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lj1 f34925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final de2 f34926b;

    public y70(@NotNull lj1 positionProviderHolder, @NotNull de2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f34925a = positionProviderHolder;
        this.f34926b = videoDurationHolder;
    }

    public final void a(@NotNull AdPlaybackState adPlaybackState, int i4) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i4).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.f34926b.a();
        }
        this.f34925a.a(new a80(usToMs));
    }

    public final void a() {
        this.f34925a.a((a80) null);
    }
}
