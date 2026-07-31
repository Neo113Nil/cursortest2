package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xl2 implements vs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InstreamAdPlayer f34615a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bm2 f34616b;

    public xl2(@NotNull InstreamAdPlayer instreamAdPlayer, @NotNull bm2 videoAdAdapterCache) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdAdapterCache, "videoAdAdapterCache");
        this.f34615a = instreamAdPlayer;
        this.f34616b = videoAdAdapterCache;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34616b.a(videoAd).getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34615a.getAdPosition(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.playAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.prepareAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void e(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.releaseAd(this.f34616b.a(videoAd));
        this.f34616b.b(videoAd);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof xl2) && Intrinsics.areEqual(((xl2) obj).f34615a, this.f34615a);
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void f(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.pauseAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.resumeAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.skipAd(this.f34616b.a(videoAd));
    }

    public final int hashCode() {
        return this.f34615a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.stopAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final boolean j(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34615a.isPlayingAd(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final float k(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34615a.getVolume(this.f34616b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@Nullable sl0 sl0Var) {
        this.f34615a.setInstreamAdPlayerListener(sl0Var != null ? new zl2(sl0Var, this.f34616b, new yl2()) : null);
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34615a.setVolume(this.f34616b.a(videoAd), f4);
    }
}
