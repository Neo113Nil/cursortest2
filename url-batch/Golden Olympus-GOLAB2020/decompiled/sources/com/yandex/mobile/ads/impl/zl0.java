package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fz1 f35618a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ol1 f35619b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fo0 f35620c;

    public /* synthetic */ zl0(on0 on0Var, do0 do0Var, kn0 kn0Var, km0 km0Var, fd2 fd2Var) {
        this(on0Var, do0Var, kn0Var, km0Var, fd2Var, new fz1(km0Var, on0Var), new ol1(km0Var), new fo0(kn0Var, do0Var, fd2Var));
    }

    public final void a(@NotNull sc2 progressEventsObservable) {
        Intrinsics.checkNotNullParameter(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f35618a, this.f35619b, this.f35620c);
    }

    public zl0(@NotNull on0 instreamVideoAd, @NotNull do0 videoViewProvider, @NotNull kn0 videoAdPlayer, @NotNull km0 adViewsHolderManager, @NotNull fd2 adStatusController, @NotNull fz1 skipDisplayTracker, @NotNull ol1 progressDisplayTracker, @NotNull fo0 visibilityTracker) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(adStatusController, "adStatusController");
        Intrinsics.checkNotNullParameter(skipDisplayTracker, "skipDisplayTracker");
        Intrinsics.checkNotNullParameter(progressDisplayTracker, "progressDisplayTracker");
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        this.f35618a = skipDisplayTracker;
        this.f35619b = progressDisplayTracker;
        this.f35620c = visibilityTracker;
    }
}
