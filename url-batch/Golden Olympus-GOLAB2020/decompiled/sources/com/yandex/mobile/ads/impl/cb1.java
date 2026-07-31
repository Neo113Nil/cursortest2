package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f24154a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final me2 f24155b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24156c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f24157d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final je2 f24158e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xa1 f24159f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final zi0 f24160g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final nx1 f24161h;

    public cb1(@NotNull gg2 videoViewAdapter, @NotNull me2 videoOptions, @NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull je2 videoImpressionListener, @NotNull ra1 nativeVideoPlaybackEventListener, @NotNull zi0 imageProvider, @Nullable nx1 nx1Var) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(videoImpressionListener, "videoImpressionListener");
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        this.f24154a = videoViewAdapter;
        this.f24155b = videoOptions;
        this.f24156c = adConfiguration;
        this.f24157d = adResponse;
        this.f24158e = videoImpressionListener;
        this.f24159f = nativeVideoPlaybackEventListener;
        this.f24160g = imageProvider;
        this.f24161h = nx1Var;
    }

    @NotNull
    public final bb1 a(@NotNull Context context, @NotNull ga1 videoAdPlayer, @NotNull ab2 video, @NotNull cg2 videoTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        return new bb1(context, this.f24157d, this.f24156c, videoAdPlayer, video, this.f24155b, this.f24154a, new jc2(this.f24156c, this.f24157d), videoTracker, this.f24158e, this.f24159f, this.f24160g, this.f24161h);
    }
}
