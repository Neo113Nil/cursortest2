package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ys0 implements w72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ss f35304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ft0 f35305b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cb2 f35306c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bt0 f35307d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final tl0 f35308e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private at0 f35309f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private vs f35310g;

    public ys0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss instreamAdBreak, @NotNull C1937g2 adBreakStatusController, @NotNull il0 customUiElementsHolder, @NotNull ul0 instreamAdPlayerReuseControllerFactory, @NotNull ft0 manualPlaybackEventListener, @NotNull cb2 videoAdCreativePlaybackProxyListener, @NotNull bt0 presenterProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        Intrinsics.checkNotNullParameter(presenterProvider, "presenterProvider");
        this.f35304a = instreamAdBreak;
        this.f35305b = manualPlaybackEventListener;
        this.f35306c = videoAdCreativePlaybackProxyListener;
        this.f35307d = presenterProvider;
        instreamAdPlayerReuseControllerFactory.getClass();
        this.f35308e = ul0.a(this);
    }

    @NotNull
    public final ss a() {
        return this.f35304a;
    }

    public final void b() {
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.a();
        }
        vs vsVar = this.f35310g;
        if (vsVar != null) {
            this.f35308e.b(vsVar);
        }
        this.f35309f = null;
        this.f35310g = null;
    }

    public final void c() {
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.b();
        }
    }

    public final void d() {
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w72
    public final void invalidateAdPlayer() {
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.a();
        }
        vs vsVar = this.f35310g;
        if (vsVar != null) {
            this.f35308e.b(vsVar);
        }
        this.f35309f = null;
        this.f35310g = null;
    }

    public final void a(@NotNull j70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.a(instreamAdView);
        }
    }

    public final void a(@NotNull xl2 player) {
        Intrinsics.checkNotNullParameter(player, "player");
        at0 at0Var = this.f35309f;
        if (at0Var != null) {
            at0Var.a();
        }
        vs vsVar = this.f35310g;
        if (vsVar != null) {
            this.f35308e.b(vsVar);
        }
        this.f35309f = null;
        this.f35310g = player;
        this.f35308e.a(player);
        at0 a4 = this.f35307d.a(player);
        a4.a(this.f35306c);
        a4.c();
        this.f35309f = a4;
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f35306c.a(tn0Var);
    }

    public final void a(@Nullable sl2 sl2Var) {
        this.f35305b.a(sl2Var);
    }
}
