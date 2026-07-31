package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yl0 f30046a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nh1 f30047b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ly1 f30048c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private h01 f30049d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private ly1 f30050e;

    public /* synthetic */ oh1(Context context, vu1 vu1Var, qs qsVar, rl0 rl0Var, km0 km0Var, ve2 ve2Var, re2 re2Var, il0 il0Var) {
        this(context, vu1Var, qsVar, rl0Var, km0Var, ve2Var, re2Var, il0Var, new yl0(qsVar, ve2Var));
    }

    @NotNull
    public final InterfaceC1967h8 a() {
        h01 h01Var = this.f30049d;
        if (h01Var != null) {
            return h01Var;
        }
        h01 a4 = this.f30047b.a(this.f30046a.a());
        this.f30049d = a4;
        return a4;
    }

    @Nullable
    public final InterfaceC1967h8 b() {
        ly1 ly1Var = this.f30050e;
        if (ly1Var == null) {
            ss b4 = this.f30046a.a().b();
            ly1Var = b4 != null ? this.f30047b.a(b4) : null;
            this.f30050e = ly1Var;
        }
        return ly1Var;
    }

    @Nullable
    public final InterfaceC1967h8 c() {
        ly1 ly1Var = this.f30048c;
        if (ly1Var == null) {
            ss c4 = this.f30046a.a().c();
            ly1Var = c4 != null ? this.f30047b.a(c4) : null;
            this.f30048c = ly1Var;
        }
        return ly1Var;
    }

    public oh1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull qs instreamVideoAd, @NotNull rl0 instreamAdPlayerController, @NotNull km0 instreamAdViewHolderProvider, @NotNull ve2 videoPlayerController, @NotNull re2 videoPlaybackController, @NotNull il0 customUiElementsHolder, @NotNull yl0 instreamAdPlaylistHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdViewHolderProvider, "instreamAdViewHolderProvider");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(videoPlaybackController, "videoPlaybackController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        this.f30046a = instreamAdPlaylistHolder;
        this.f30047b = new nh1(context, sdkEnvironmentModule, instreamAdPlayerController, videoPlayerController, videoPlaybackController, instreamAdViewHolderProvider, instreamAdPlaylistHolder, customUiElementsHolder);
    }
}
