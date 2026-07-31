package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class at0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rl0 f23439a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ft0 f23440b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gt0 f23441c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final km0 f23442d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1817b2 f23443e;

    private final class a implements InterfaceC1841c2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void a() {
            at0.this.f23440b.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void b() {
            at0.this.f23440b.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void d() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void e() {
            at0.this.f23440b.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void g() {
            at0.this.f23440b.onInstreamAdBreakError("Ad player returned error");
        }
    }

    public at0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss instreamAdBreak, @NotNull rl0 instreamAdPlayerController, @NotNull C1937g2 adBreakStatusController, @NotNull ft0 manualPlaybackEventListener, @NotNull il0 instreamAdCustomUiElementsHolder, @NotNull gt0 manualPlaybackManager, @NotNull km0 instreamAdViewsHolderManager, @NotNull C1817b2 adBreakPlaybackController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        Intrinsics.checkNotNullParameter(manualPlaybackManager, "manualPlaybackManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adBreakPlaybackController, "adBreakPlaybackController");
        this.f23439a = instreamAdPlayerController;
        this.f23440b = manualPlaybackEventListener;
        this.f23441c = manualPlaybackManager;
        this.f23442d = instreamAdViewsHolderManager;
        this.f23443e = adBreakPlaybackController;
    }

    public final void b() {
        jm0 a4 = this.f23442d.a();
        if (a4 == null || a4.b() == null) {
            return;
        }
        this.f23443e.a();
    }

    public final void c() {
        this.f23439a.a();
        this.f23443e.a(new a());
        this.f23443e.d();
    }

    public final void d() {
        jm0 a4 = this.f23442d.a();
        if (a4 == null || a4.b() == null) {
            return;
        }
        this.f23443e.f();
    }

    public final void a() {
        this.f23443e.b();
        this.f23439a.b();
        this.f23442d.b();
    }

    public final void a(@NotNull j70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        at0 a4 = this.f23441c.a(instreamAdView);
        if (!Intrinsics.areEqual(this, a4)) {
            if (a4 != null) {
                a4.f23443e.c();
                a4.f23442d.b();
            }
            if (this.f23441c.a(this)) {
                this.f23443e.c();
                this.f23442d.b();
            }
            this.f23441c.a(instreamAdView, this);
        }
        this.f23442d.a(instreamAdView, CollectionsKt.emptyList());
        this.f23439a.a();
        this.f23443e.g();
    }

    public final void a(@Nullable cb2 cb2Var) {
        this.f23443e.a(cb2Var);
    }
}
