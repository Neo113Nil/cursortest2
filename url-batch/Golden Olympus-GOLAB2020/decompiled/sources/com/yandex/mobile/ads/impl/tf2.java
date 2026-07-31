package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ni1 f32419a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final be2 f32420b;

    public tf2(@NotNull ni1 playerStateHolder, @NotNull be2 videoCompletedNotifier) {
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        this.f32419a = playerStateHolder;
        this.f32420b = videoCompletedNotifier;
    }

    public final void a(@NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (this.f32419a.c() || player.isPlayingAd()) {
            return;
        }
        this.f32420b.c();
        boolean b4 = this.f32420b.b();
        Timeline b5 = this.f32419a.b();
        if (b4 || b5.isEmpty()) {
            return;
        }
        b5.getPeriod(0, this.f32419a.a());
    }
}
