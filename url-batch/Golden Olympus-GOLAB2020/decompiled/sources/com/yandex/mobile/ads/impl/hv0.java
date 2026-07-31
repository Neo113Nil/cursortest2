package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hv0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gv0 f26950a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final at1<CorePlaybackControlsContainer> f26951b;

    public /* synthetic */ hv0() {
        this(new gv0(), new at1());
    }

    @Nullable
    public final iv0 a(@NotNull Context context, int i4, @NotNull iv0 controls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controls, "customControls");
        this.f26950a.getClass();
        Intrinsics.checkNotNullParameter(controls, "controls");
        if (controls.getMuteControl() != null || controls.getVideoProgress() != null || controls.getCountDownProgress() != null) {
            return new cv(controls.getMuteControl(), controls.getVideoProgress(), controls.getCountDownProgress());
        }
        this.f26951b.getClass();
        return (iv0) at1.a(context, CorePlaybackControlsContainer.class, i4, null);
    }

    public hv0(@NotNull gv0 controlsAvailabilityChecker, @NotNull at1<CorePlaybackControlsContainer> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(controlsAvailabilityChecker, "controlsAvailabilityChecker");
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f26950a = controlsAvailabilityChecker;
        this.f26951b = safeLayoutInflater;
    }
}
