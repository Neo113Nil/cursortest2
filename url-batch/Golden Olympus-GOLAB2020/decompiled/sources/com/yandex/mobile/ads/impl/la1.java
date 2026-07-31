package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class la1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sh1 f28492a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ff2 f28493b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vh2 f28494c;

    public la1(@NotNull gg2 viewAdapter, @NotNull ga1 nativeVideoAdPlayer, @NotNull qb1 videoViewProvider, @NotNull xa1 listener) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ia1 ia1Var = new ia1(nativeVideoAdPlayer);
        this.f28492a = new sh1(listener);
        this.f28493b = new ff2(viewAdapter);
        this.f28494c = new vh2(ia1Var, videoViewProvider);
    }

    public final void a(@NotNull sc2 progressEventsObservable) {
        Intrinsics.checkNotNullParameter(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f28492a, this.f28493b, this.f28494c);
    }
}
