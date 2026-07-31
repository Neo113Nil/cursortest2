package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class li1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ni1 f28598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ee2 f28599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r60 f28600c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ri1 f28601d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bi1 f28602e;

    public li1(@NotNull ni1 stateHolder, @NotNull ee2 durationHolder, @NotNull r60 playerProvider, @NotNull ri1 volumeController, @NotNull bi1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f28598a = stateHolder;
        this.f28599b = durationHolder;
        this.f28600c = playerProvider;
        this.f28601d = volumeController;
        this.f28602e = playerPlaybackController;
    }

    @NotNull
    public final ee2 a() {
        return this.f28599b;
    }

    @NotNull
    public final bi1 b() {
        return this.f28602e;
    }

    @NotNull
    public final r60 c() {
        return this.f28600c;
    }

    @NotNull
    public final ni1 d() {
        return this.f28598a;
    }

    @NotNull
    public final ri1 e() {
        return this.f28601d;
    }
}
