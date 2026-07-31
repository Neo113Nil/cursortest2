package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nm2 implements com.yandex.mobile.ads.nativeads.video.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kt f29686a;

    public nm2(@NotNull kt nativeAdVideoController) {
        Intrinsics.checkNotNullParameter(nativeAdVideoController, "nativeAdVideoController");
        this.f29686a = nativeAdVideoController;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm2) && Intrinsics.areEqual(this.f29686a, ((nm2) obj).f29686a);
    }

    public final int hashCode() {
        return this.f29686a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void pauseAd() {
        this.f29686a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void resumeAd() {
        this.f29686a.b();
    }

    @NotNull
    public final String toString() {
        return "YandexNativeAdVideoControllerAdapter(nativeAdVideoController=" + this.f29686a + ")";
    }
}
