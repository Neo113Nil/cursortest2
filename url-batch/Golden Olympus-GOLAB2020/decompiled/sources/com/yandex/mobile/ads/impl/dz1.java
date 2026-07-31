package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dz1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kn0 f25011a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final dd2 f25012b;

    public /* synthetic */ dz1(kn0 kn0Var, on0 on0Var) {
        this(kn0Var, on0Var, on0Var.h());
    }

    public final void a(@NotNull View skipControl, @NotNull tm0 controlsState) {
        Intrinsics.checkNotNullParameter(skipControl, "skipControl");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        if (this.f25012b == null) {
            skipControl.setVisibility(8);
            return;
        }
        skipControl.setOnClickListener(new cz1(this.f25011a));
        if (controlsState.c()) {
            skipControl.setVisibility(0);
        }
        skipControl.setEnabled(controlsState.c());
    }

    public dz1(@NotNull kn0 instreamVastAdPlayer, @NotNull on0 instreamVideoAd, @Nullable dd2 dd2Var) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        this.f25011a = instreamVastAdPlayer;
        this.f25012b = dd2Var;
    }
}
