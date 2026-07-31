package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class za1 implements hc2<ya1> {
    @Override // com.yandex.mobile.ads.impl.hc2
    public final ya1 a(bb2 videoAd, hu creative, mv0 mediaFile, oc2 adPodInfo, String str, String str2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        return new ya1(mediaFile.f(), mediaFile.h(), mediaFile.d());
    }
}
