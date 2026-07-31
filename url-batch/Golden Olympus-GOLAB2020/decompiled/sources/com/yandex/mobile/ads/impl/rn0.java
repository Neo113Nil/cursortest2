package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sn0 f31304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final oz f31305b;

    public rn0(@NotNull sn0 instreamVideoAdControlsStateStorage, @NotNull si1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(instreamVideoAdControlsStateStorage, "instreamVideoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        this.f31304a = instreamVideoAdControlsStateStorage;
        this.f31305b = new oz(playerVolumeProvider);
    }

    @NotNull
    public final tm0 a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        tm0 a4 = this.f31304a.a(videoAdInfo);
        return a4 == null ? this.f31305b.a() : a4;
    }
}
