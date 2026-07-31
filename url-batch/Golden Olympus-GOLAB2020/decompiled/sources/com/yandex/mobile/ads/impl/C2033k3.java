package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2033k3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2288v4 f27992a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1985i2 f27993b;

    public C2033k3(@NotNull de2 videoDurationHolder, @NotNull C2288v4 adPlaybackStateController, @NotNull C1985i2 adBreakTimingProvider) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(adBreakTimingProvider, "adBreakTimingProvider");
        this.f27992a = adPlaybackStateController;
        this.f27993b = adBreakTimingProvider;
    }

    public final int a(@NotNull ts adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long a4 = this.f27993b.a(adBreakPosition);
        AdPlaybackState a5 = this.f27992a.a();
        if (a4 == Long.MIN_VALUE) {
            int i4 = a5.adGroupCount;
            if (i4 <= 0 || a5.getAdGroup(i4 - 1).timeUs != Long.MIN_VALUE) {
                return -1;
            }
            return a5.adGroupCount - 1;
        }
        long msToUs = Util.msToUs(a4);
        int i5 = a5.adGroupCount;
        for (int i6 = 0; i6 < i5; i6++) {
            long j4 = a5.getAdGroup(i6).timeUs;
            if (j4 != Long.MIN_VALUE && Math.abs(j4 - msToUs) <= 1000) {
                return i6;
            }
        }
        return -1;
    }
}
