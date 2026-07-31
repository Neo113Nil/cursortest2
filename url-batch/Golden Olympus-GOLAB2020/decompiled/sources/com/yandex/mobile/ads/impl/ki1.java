package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mi1 f28204a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final de2 f28205b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q60 f28206c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qi1 f28207d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ai1 f28208e;

    public ki1(@NotNull mi1 stateHolder, @NotNull de2 durationHolder, @NotNull q60 playerProvider, @NotNull qi1 volumeController, @NotNull ai1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f28204a = stateHolder;
        this.f28205b = durationHolder;
        this.f28206c = playerProvider;
        this.f28207d = volumeController;
        this.f28208e = playerPlaybackController;
    }

    @NotNull
    public final de2 a() {
        return this.f28205b;
    }

    @NotNull
    public final ai1 b() {
        return this.f28208e;
    }

    @NotNull
    public final q60 c() {
        return this.f28206c;
    }

    @NotNull
    public final mi1 d() {
        return this.f28204a;
    }

    @NotNull
    public final qi1 e() {
        return this.f28207d;
    }
}
