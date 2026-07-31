package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bo0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rl0 f23883a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ve2 f23884b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final km0 f23885c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zn0 f23886d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ bo0(Context context, vu1 vu1Var, qs qsVar, rl0 rl0Var, ve2 ve2Var, il0 il0Var) {
        this(context, vu1Var, qsVar, rl0Var, ve2Var, il0Var, r5, new zn0(context, vu1Var, qsVar, rl0Var, r5, ve2Var, il0Var));
        km0 km0Var = new km0();
    }

    public final void a(@NotNull j70 instreamAdView, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f23885c.a(instreamAdView, friendlyOverlays);
        this.f23883a.a();
        this.f23884b.g();
        this.f23886d.a();
    }

    public final void b() {
        this.f23886d.d();
    }

    public final void c() {
        this.f23883a.a();
        this.f23886d.h();
    }

    public final void d() {
        this.f23886d.j();
        this.f23885c.b();
    }

    public bo0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull qs instreamVideoAd, @NotNull rl0 instreamAdPlayerController, @NotNull ve2 videoPlayerController, @NotNull il0 customUiElementsHolder, @NotNull km0 instreamAdViewsHolderManager, @NotNull zn0 instreamVideoPresenter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(instreamVideoPresenter, "instreamVideoPresenter");
        this.f23883a = instreamAdPlayerController;
        this.f23884b = videoPlayerController;
        this.f23885c = instreamAdViewsHolderManager;
        this.f23886d = instreamVideoPresenter;
    }

    public final void a() {
        this.f23886d.c();
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f23886d.a(tn0Var);
    }

    public final void a(@Nullable ao0 ao0Var) {
        this.f23886d.a(ao0Var);
    }
}
