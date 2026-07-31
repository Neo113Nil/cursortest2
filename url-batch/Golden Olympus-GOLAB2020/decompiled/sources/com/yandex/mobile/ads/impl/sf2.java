package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mi1 f31728a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ae2 f31729b;

    public sf2(@NotNull mi1 playerStateHolder, @NotNull ae2 videoCompletedNotifier) {
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        this.f31728a = playerStateHolder;
        this.f31729b = videoCompletedNotifier;
    }

    public final void a(@NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (this.f31728a.c() || player.isPlayingAd()) {
            return;
        }
        this.f31729b.c();
        boolean b4 = this.f31729b.b();
        Timeline b5 = this.f31728a.b();
        if (b4 || b5.isEmpty()) {
            return;
        }
        b5.getPeriod(0, this.f31728a.a());
    }
}
