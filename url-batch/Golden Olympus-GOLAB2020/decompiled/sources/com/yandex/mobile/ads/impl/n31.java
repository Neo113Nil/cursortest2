package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n31 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kn0 f29417a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2083m5 f29418b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tm0 f29419c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final m31 f29420d;

    public n31(@NotNull kn0 instreamVastAdPlayer, @NotNull C2083m5 adPlayerVolumeConfigurator, @NotNull tm0 instreamControlsState, @Nullable m31 m31Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        Intrinsics.checkNotNullParameter(instreamControlsState, "instreamControlsState");
        this.f29417a = instreamVastAdPlayer;
        this.f29418b = adPlayerVolumeConfigurator;
        this.f29419c = instreamControlsState;
        this.f29420d = m31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View volumeControl) {
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        boolean z4 = !(this.f29417a.getVolume() == 0.0f);
        this.f29418b.a(this.f29419c.a(), z4);
        m31 m31Var = this.f29420d;
        if (m31Var != null) {
            m31Var.setMuted(z4);
        }
    }
}
