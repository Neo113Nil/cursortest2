package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uc2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final an1 f33034a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ql1 f33035b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final s92<T> f33036c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ba2<T> f33037d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qh2<T> f33038e;

    public uc2(@NotNull Context context, @NotNull ob2 videoAdInfo, @NotNull hg2 videoViewProvider, @NotNull fd2 adStatusController, @NotNull cg2 videoTracker, @NotNull lc2 videoAdPlayer, @NotNull ec2 playbackEventsListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(adStatusController, "adStatusController");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        this.f33034a = new an1(videoTracker);
        this.f33035b = new ql1(context, videoAdInfo);
        this.f33036c = new s92<>(videoAdInfo, videoViewProvider, videoTracker, playbackEventsListener);
        this.f33037d = new ba2<>(videoViewProvider, videoTracker, videoAdPlayer);
        this.f33038e = new qh2<>(videoAdInfo, videoViewProvider, adStatusController, videoTracker, playbackEventsListener);
    }

    public final void a(@NotNull sc2 progressEventsObservable) {
        Intrinsics.checkNotNullParameter(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f33034a, this.f33035b, this.f33037d, this.f33036c, this.f33038e);
        progressEventsObservable.a(this.f33038e);
    }
}
