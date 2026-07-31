package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2057l3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2311w4 f28398a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2008j2 f28399b;

    public C2057l3(@NotNull ee2 videoDurationHolder, @NotNull C2311w4 adPlaybackStateController, @NotNull C2008j2 adBreakTimingProvider) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(adBreakTimingProvider, "adBreakTimingProvider");
        this.f28398a = adPlaybackStateController;
        this.f28399b = adBreakTimingProvider;
    }

    public final int a(@NotNull ts adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long a4 = this.f28399b.a(adBreakPosition);
        AdPlaybackState a5 = this.f28398a.a();
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
