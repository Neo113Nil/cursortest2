package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hi1 implements kj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Player f26759a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ni1 f26760b;

    public hi1(@NotNull Player player, @NotNull ni1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f26759a = player;
        this.f26760b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.kj1
    public final long a() {
        Timeline b4 = this.f26760b.b();
        return this.f26759a.getContentPosition() - (!b4.isEmpty() ? b4.getPeriod(0, this.f26760b.a()).getPositionInWindowMs() : 0L);
    }
}
