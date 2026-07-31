package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gi1 implements jj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Player f26170a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mi1 f26171b;

    public gi1(@NotNull Player player, @NotNull mi1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f26170a = player;
        this.f26171b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.jj1
    public final long a() {
        Timeline b4 = this.f26171b.b();
        return this.f26170a.getContentPosition() - (!b4.isEmpty() ? b4.getPeriod(0, this.f26171b.a()).getPositionInWindowMs() : 0L);
    }
}
