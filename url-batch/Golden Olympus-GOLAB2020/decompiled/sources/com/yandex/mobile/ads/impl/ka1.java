package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ka1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f28139a;

    public ka1(@NotNull ga1 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f28139a = videoAdPlayer;
    }

    public final void a(@Nullable Double d4) {
        this.f28139a.setVolume((float) (d4 != null ? d4.doubleValue() : 0.0d));
    }
}
