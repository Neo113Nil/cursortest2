package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ia1 implements lc2<ya1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f27146a;

    public ia1(@NotNull ga1 videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f27146a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(@NotNull ob2<ya1> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f27146a.a(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final long b() {
        return this.f27146a.b();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void c() {
        this.f27146a.c();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final long getAdPosition() {
        return this.f27146a.getAdPosition();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final float getVolume() {
        return this.f27146a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final boolean isPlayingAd() {
        return this.f27146a.isPlayingAd();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void pauseAd() {
        this.f27146a.pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void resumeAd() {
        this.f27146a.resumeAd();
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(@Nullable dc2 dc2Var) {
        this.f27146a.a(dc2Var);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a() {
        this.f27146a.a();
    }
}
