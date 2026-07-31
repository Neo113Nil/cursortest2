package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o31 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kn0 f29893a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2083m5 f29894b;

    public /* synthetic */ o31(kn0 kn0Var) {
        this(kn0Var, new C2083m5(kn0Var));
    }

    public final void a(@NotNull db2 uiElements, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        float a4 = controlsState.a();
        boolean d4 = controlsState.d();
        m31 i4 = uiElements.i();
        n31 n31Var = new n31(this.f29893a, this.f29894b, controlsState, i4);
        if (i4 != null) {
            i4.setOnClickListener(n31Var);
        }
        if (i4 != null) {
            i4.setMuted(d4);
        }
        this.f29894b.a(a4, d4);
    }

    public o31(@NotNull kn0 instreamVastAdPlayer, @NotNull C2083m5 adPlayerVolumeConfigurator) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f29893a = instreamVastAdPlayer;
        this.f29894b = adPlayerVolumeConfigurator;
    }
}
