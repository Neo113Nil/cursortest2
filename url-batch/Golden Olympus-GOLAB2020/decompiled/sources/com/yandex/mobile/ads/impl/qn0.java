package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tm0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sn0 f30850a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final im0 f30851b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hl0 f30852c;

    public /* synthetic */ qn0(sn0 sn0Var, kn0 kn0Var) {
        this(sn0Var, kn0Var, new im0(), new hl0(kn0Var));
    }

    public final void a(@NotNull ob2<on0> videoAdInfo, @NotNull j70 instreamAdView, @NotNull tm0 initialControlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        this.f30851b.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        db2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f30850a.a(videoAdInfo, new tm0(new tm0.a().b(this.f30852c.a(adUiElements, initialControlsState).d()).a(initialControlsState.a())));
        }
    }

    public final void b(@NotNull ob2<on0> videoAdInfo, @NotNull j70 instreamAdView, @NotNull tm0 initialControlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        this.f30851b.getClass();
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        db2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f30850a.a(videoAdInfo, this.f30852c.a(adUiElements, initialControlsState));
        }
    }

    public qn0(@NotNull sn0 videoAdControlsStateStorage, @NotNull kn0 instreamVastAdPlayer, @NotNull im0 instreamAdViewUiElementsManager, @NotNull hl0 videoAdControlsStateProvider) {
        Intrinsics.checkNotNullParameter(videoAdControlsStateStorage, "videoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(videoAdControlsStateProvider, "videoAdControlsStateProvider");
        this.f30850a = videoAdControlsStateStorage;
        this.f30851b = instreamAdViewUiElementsManager;
        this.f30852c = videoAdControlsStateProvider;
    }
}
