package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ep1 f24281a;

    public cp1(@NotNull gg2 videoViewAdapter, @NotNull gp1 replayController) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(replayController, "replayController");
        this.f24281a = new ep1(videoViewAdapter, replayController, this);
    }

    public static void b(@NotNull bp1 replayActionView) {
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        replayActionView.setBackground(null);
        replayActionView.setVisibility(8);
        replayActionView.a().setOnClickListener(null);
    }

    public final void a(@NotNull bp1 replayActionView) {
        Intrinsics.checkNotNullParameter(replayActionView, "replayActionView");
        replayActionView.setVisibility(4);
        replayActionView.a().setOnClickListener(this.f24281a);
    }
}
