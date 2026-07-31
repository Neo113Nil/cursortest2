package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26223a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final km0 f26224b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final s72 f26225c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private r72 f26226d;

    public gm0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull km0 instreamAdViewsHolderManager, @NotNull si1 playerVolumeProvider, @NotNull rl0 playerController, @NotNull il0 customUiElementsHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        this.f26223a = context;
        this.f26224b = instreamAdViewsHolderManager;
        this.f26225c = new s72(sdkEnvironmentModule, playerVolumeProvider, playerController, customUiElementsHolder);
    }

    public final void a(@NotNull ss coreInstreamAdBreak, @NotNull ob2 videoAdInfo, @NotNull bg2 videoTracker, @NotNull cb2 playbackListener, @NotNull sk1 imageProvider) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        a();
        jm0 a4 = this.f26224b.a();
        if (a4 != null) {
            s72 s72Var = this.f26225c;
            Context applicationContext = this.f26223a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            r72 a5 = s72Var.a(applicationContext, a4, coreInstreamAdBreak, videoAdInfo, videoTracker, imageProvider, playbackListener);
            a5.a();
            this.f26226d = a5;
        }
    }

    public final void a() {
        r72 r72Var = this.f26226d;
        if (r72Var != null) {
            r72Var.b();
        }
        this.f26226d = null;
    }

    public final void a(@NotNull ob2<on0> nextVideo) {
        Intrinsics.checkNotNullParameter(nextVideo, "nextVideo");
        r72 r72Var = this.f26226d;
        if (r72Var != null) {
            r72Var.a(nextVideo);
        }
    }
}
