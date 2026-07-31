package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nb2 {
    @NotNull
    public static String a(long j4, @NotNull oc2 adPodInfo, @NotNull bb2 videoAd) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        int a4 = adPodInfo.a();
        String g4 = videoAd.g();
        if (g4 == null) {
            g4 = String.valueOf(ci0.a());
        }
        return "ad_break_#" + j4 + "|position_" + a4 + "|video_ad_#" + g4;
    }
}
