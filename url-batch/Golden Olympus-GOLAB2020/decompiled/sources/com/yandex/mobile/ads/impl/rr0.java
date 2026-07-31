package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mj1 f31335a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ee2 f31336b;

    public rr0(@NotNull mj1 positionProviderHolder, @NotNull ee2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f31335a = positionProviderHolder;
        this.f31336b = videoDurationHolder;
    }

    public final int a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        hi1 b4 = this.f31335a.b();
        if (b4 == null) {
            return -1;
        }
        long msToUs = Util.msToUs(this.f31336b.a());
        long msToUs2 = Util.msToUs(b4.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(msToUs2, msToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(msToUs2, msToUs) : adGroupIndexForPositionUs;
    }
}
