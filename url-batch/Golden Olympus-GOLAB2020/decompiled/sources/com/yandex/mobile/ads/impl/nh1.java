package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29644a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rl0 f29645b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ve2 f29646c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final re2 f29647d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final km0 f29648e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final gm0 f29649f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1961h2 f29650g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ nh1(Context context, vu1 vu1Var, rl0 rl0Var, ve2 ve2Var, re2 re2Var, km0 km0Var, yl0 yl0Var, il0 il0Var) {
        this(context, vu1Var, rl0Var, ve2Var, re2Var, km0Var, yl0Var, il0Var, new gm0(r1, vu1Var, km0Var, ve2Var, rl0Var, il0Var), new C1961h2(yl0Var));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @NotNull
    public final h01 a(@NotNull wl0 instreamAdPlaylist) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        Context applicationContext = this.f29644a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        C1937g2 a4 = this.f29650g.a();
        rl0 rl0Var = this.f29645b;
        gm0 gm0Var = this.f29649f;
        km0 km0Var = this.f29648e;
        ve2 ve2Var = this.f29646c;
        return new h01(applicationContext, instreamAdPlaylist, a4, rl0Var, gm0Var, km0Var, ve2Var, this.f29647d, new cb2(), new yi1(ve2Var, a4));
    }

    public nh1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull rl0 instreamAdPlayerController, @NotNull ve2 videoPlayerController, @NotNull re2 videoPlaybackController, @NotNull km0 instreamAdViewsHolderManager, @NotNull yl0 instreamAdPlaylistHolder, @NotNull il0 customUiElementsHolder, @NotNull gm0 instreamAdUiElementsManager, @NotNull C1961h2 adBreakStatusControllerHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(videoPlaybackController, "videoPlaybackController");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        Intrinsics.checkNotNullParameter(adBreakStatusControllerHolder, "adBreakStatusControllerHolder");
        this.f29644a = context;
        this.f29645b = instreamAdPlayerController;
        this.f29646c = videoPlayerController;
        this.f29647d = videoPlaybackController;
        this.f29648e = instreamAdViewsHolderManager;
        this.f29649f = instreamAdUiElementsManager;
        this.f29650g = adBreakStatusControllerHolder;
    }

    @NotNull
    public final ly1 a(@NotNull ss adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Context applicationContext = this.f29644a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        rl0 rl0Var = this.f29645b;
        gm0 gm0Var = this.f29649f;
        km0 km0Var = this.f29648e;
        C1937g2 a4 = this.f29650g.a();
        return new ly1(applicationContext, adBreak, rl0Var, gm0Var, km0Var, a4, new C1817b2(applicationContext, adBreak, rl0Var, gm0Var, km0Var, a4));
    }
}
