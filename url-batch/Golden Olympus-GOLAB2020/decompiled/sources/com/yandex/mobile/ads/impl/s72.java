package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final si1 f31616a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rl0 f31617b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q72 f31618c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sn0 f31619d;

    public /* synthetic */ s72(vu1 vu1Var, si1 si1Var, rl0 rl0Var, il0 il0Var) {
        this(vu1Var, si1Var, rl0Var, il0Var, new q72(vu1Var, il0Var), new sn0());
    }

    @NotNull
    public final r72 a(@NotNull Context context, @NotNull jm0 viewHolder, @NotNull ss coreInstreamAdBreak, @NotNull ob2 videoAdInfo, @NotNull bg2 videoTracker, @NotNull sk1 imageProvider, @NotNull cb2 playbackListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        kn0 kn0Var = new kn0((on0) videoAdInfo.d(), this.f31617b);
        p72 a4 = this.f31618c.a(context, coreInstreamAdBreak, videoAdInfo, kn0Var, videoTracker, imageProvider, playbackListener);
        sn0 sn0Var = this.f31619d;
        si1 si1Var = this.f31616a;
        return new r72(viewHolder, a4, videoAdInfo, sn0Var, si1Var, kn0Var, new rn0(sn0Var, si1Var), new qn0(sn0Var, kn0Var));
    }

    public s72(@NotNull vu1 sdkEnvironmentModule, @NotNull si1 playerVolumeProvider, @NotNull rl0 instreamAdPlayerController, @NotNull il0 customUiElementsHolder, @NotNull q72 uiElementBinderProvider, @NotNull sn0 videoAdOptionsStorage) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(uiElementBinderProvider, "uiElementBinderProvider");
        Intrinsics.checkNotNullParameter(videoAdOptionsStorage, "videoAdOptionsStorage");
        this.f31616a = playerVolumeProvider;
        this.f31617b = instreamAdPlayerController;
        this.f31618c = uiElementBinderProvider;
        this.f31619d = videoAdOptionsStorage;
    }
}
