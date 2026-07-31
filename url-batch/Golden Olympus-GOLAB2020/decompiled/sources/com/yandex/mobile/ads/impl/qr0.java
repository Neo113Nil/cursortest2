package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lj1 f30879a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final de2 f30880b;

    public qr0(@NotNull lj1 positionProviderHolder, @NotNull de2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f30879a = positionProviderHolder;
        this.f30880b = videoDurationHolder;
    }

    public final int a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        gi1 b4 = this.f30879a.b();
        if (b4 == null) {
            return -1;
        }
        long msToUs = Util.msToUs(this.f30880b.a());
        long msToUs2 = Util.msToUs(b4.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(msToUs2, msToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(msToUs2, msToUs) : adGroupIndexForPositionUs;
    }
}
