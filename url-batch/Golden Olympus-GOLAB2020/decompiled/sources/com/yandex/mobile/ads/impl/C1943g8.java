package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1943g8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tn0 f26062a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uk1 f26063b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final oh1 f26064c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1919f8 f26065d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private C1895e8 f26066e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C1895e8 f26067f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private C1895e8 f26068g;

    public /* synthetic */ C1943g8(Context context, vu1 vu1Var, qs qsVar, rl0 rl0Var, km0 km0Var, ve2 ve2Var, re2 re2Var, tn0 tn0Var, il0 il0Var) {
        this(context, vu1Var, qsVar, rl0Var, km0Var, ve2Var, re2Var, tn0Var, il0Var, new uk1(ve2Var), new oh1(context, vu1Var, qsVar, rl0Var, km0Var, ve2Var, re2Var, il0Var), new C1919f8());
    }

    private final C1895e8 a(InterfaceC1967h8 adSectionPlaybackController) {
        C1919f8 c1919f8 = this.f26065d;
        C2038k8 adSectionStatusController = new C2038k8();
        cb2 adCreativePlaybackProxyListener = new cb2();
        c1919f8.getClass();
        Intrinsics.checkNotNullParameter(adSectionPlaybackController, "adSectionPlaybackController");
        Intrinsics.checkNotNullParameter(adSectionStatusController, "adSectionStatusController");
        Intrinsics.checkNotNullParameter(adCreativePlaybackProxyListener, "adCreativePlaybackProxyListener");
        C1895e8 c1895e8 = new C1895e8(adSectionPlaybackController, adSectionStatusController, adCreativePlaybackProxyListener);
        c1895e8.a(this.f26062a);
        return c1895e8;
    }

    @Nullable
    public final C1895e8 b() {
        InterfaceC1967h8 b4;
        if (this.f26068g == null && (b4 = this.f26064c.b()) != null) {
            this.f26068g = a(b4);
        }
        return this.f26068g;
    }

    @Nullable
    public final C1895e8 c() {
        InterfaceC1967h8 c4;
        if (this.f26066e == null && this.f26063b.a() && (c4 = this.f26064c.c()) != null) {
            this.f26066e = a(c4);
        }
        return this.f26066e;
    }

    public C1943g8(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull qs instreamVideoAd, @NotNull rl0 instreamAdPlayerController, @NotNull km0 instreamAdViewHolderProvider, @NotNull ve2 videoPlayerController, @NotNull re2 videoPlaybackController, @NotNull tn0 adCreativePlaybackListener, @NotNull il0 customUiElementsHolder, @NotNull uk1 prerollVideoPositionStartValidator, @NotNull oh1 playbackControllerHolder, @NotNull C1919f8 adSectionControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdViewHolderProvider, "instreamAdViewHolderProvider");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(videoPlaybackController, "videoPlaybackController");
        Intrinsics.checkNotNullParameter(adCreativePlaybackListener, "adCreativePlaybackListener");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(prerollVideoPositionStartValidator, "prerollVideoPositionStartValidator");
        Intrinsics.checkNotNullParameter(playbackControllerHolder, "playbackControllerHolder");
        Intrinsics.checkNotNullParameter(adSectionControllerFactory, "adSectionControllerFactory");
        this.f26062a = adCreativePlaybackListener;
        this.f26063b = prerollVideoPositionStartValidator;
        this.f26064c = playbackControllerHolder;
        this.f26065d = adSectionControllerFactory;
    }

    @NotNull
    public final C1895e8 a() {
        C1895e8 c1895e8 = this.f26067f;
        if (c1895e8 != null) {
            return c1895e8;
        }
        C1895e8 a4 = a(this.f26064c.a());
        this.f26067f = a4;
        return a4;
    }
}
