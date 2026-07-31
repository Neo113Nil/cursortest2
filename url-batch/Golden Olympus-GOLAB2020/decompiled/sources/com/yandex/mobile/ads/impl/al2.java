package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class al2 implements AdPodInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final oc2 f23357a;

    public al2(@NotNull oc2 adPodInfo) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        this.f23357a = adPodInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al2) && Intrinsics.areEqual(this.f23357a, ((al2) obj).f23357a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f23357a.a();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f23357a.b();
    }

    public final int hashCode() {
        return this.f23357a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexAdPodInfo(adPodInfo=" + this.f23357a + ")";
    }
}
