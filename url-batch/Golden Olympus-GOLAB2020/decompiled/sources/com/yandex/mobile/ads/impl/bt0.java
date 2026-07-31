package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gt0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bt0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f23910a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f23911b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1937g2 f23912c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ft0 f23913d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final il0 f23914e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f23915f;

    public bt0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss instreamAdBreak, @NotNull C1937g2 adBreakStatusController, @NotNull ft0 manualPlaybackEventListener, @NotNull il0 instreamAdCustomUiElementsHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        this.f23910a = sdkEnvironmentModule;
        this.f23911b = instreamAdBreak;
        this.f23912c = adBreakStatusController;
        this.f23913d = manualPlaybackEventListener;
        this.f23914e = instreamAdCustomUiElementsHolder;
        this.f23915f = context.getApplicationContext();
    }

    @NotNull
    public final at0 a(@NotNull xl2 instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        rl0 rl0Var = new rl0(instreamAdPlayer);
        Context context = this.f23915f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vu1 vu1Var = this.f23910a;
        ss ssVar = this.f23911b;
        C1937g2 c1937g2 = this.f23912c;
        ft0 ft0Var = this.f23913d;
        il0 il0Var = this.f23914e;
        int i4 = gt0.f26292d;
        gt0 a4 = gt0.a.a();
        km0 km0Var = new km0();
        return new at0(context, vu1Var, ssVar, rl0Var, c1937g2, ft0Var, il0Var, a4, km0Var, new C1817b2(context, ssVar, rl0Var, new gm0(context, vu1Var, km0Var, new ht0(rl0Var, ssVar), rl0Var, il0Var), km0Var, c1937g2));
    }
}
