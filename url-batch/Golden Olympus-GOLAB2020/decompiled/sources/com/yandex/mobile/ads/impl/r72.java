package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jm0 f31064a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p72 f31065b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f31066c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rn0 f31067d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qn0 f31068e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private tm0 f31069f;

    public r72(@NotNull jm0 instreamAdViewsHolder, @NotNull p72 uiElementBinder, @NotNull ob2<on0> videoAdInfo, @NotNull sn0 videoAdControlsStateStorage, @NotNull si1 playerVolumeProvider, @NotNull kn0 instreamVastAdPlayer, @NotNull rn0 videoAdControlsStateProvider, @NotNull qn0 instreamVideoAdControlsStateManager) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolder, "instreamAdViewsHolder");
        Intrinsics.checkNotNullParameter(uiElementBinder, "uiElementBinder");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdControlsStateStorage, "videoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdControlsStateProvider, "videoAdControlsStateProvider");
        Intrinsics.checkNotNullParameter(instreamVideoAdControlsStateManager, "instreamVideoAdControlsStateManager");
        this.f31064a = instreamAdViewsHolder;
        this.f31065b = uiElementBinder;
        this.f31066c = videoAdInfo;
        this.f31067d = videoAdControlsStateProvider;
        this.f31068e = instreamVideoAdControlsStateManager;
    }

    public final void a() {
        j70 b4 = this.f31064a.b();
        if (this.f31069f != null || b4 == null) {
            return;
        }
        tm0 a4 = this.f31067d.a(this.f31066c);
        this.f31065b.a(b4, a4);
        this.f31069f = a4;
    }

    public final void b() {
        tm0 tm0Var;
        j70 b4 = this.f31064a.b();
        if (b4 == null || (tm0Var = this.f31069f) == null) {
            return;
        }
        this.f31068e.b(this.f31066c, b4, tm0Var);
        this.f31069f = null;
        this.f31065b.a(b4);
    }

    public final void a(@NotNull ob2<on0> nextVideo) {
        tm0 tm0Var;
        Intrinsics.checkNotNullParameter(nextVideo, "nextVideo");
        j70 b4 = this.f31064a.b();
        if (b4 == null || (tm0Var = this.f31069f) == null) {
            return;
        }
        this.f31068e.a(nextVideo, b4, tm0Var);
    }
}
