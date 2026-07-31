package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2195r3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f31016a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ln0 f31017b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zi0 f31018c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fd2 f31019d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bg2 f31020e;

    public C2195r3(@NotNull ob2 videoAdInfo, @NotNull ln0 playbackController, @NotNull zi0 imageProvider, @NotNull fd2 statusController, @NotNull cg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(playbackController, "playbackController");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f31016a = videoAdInfo;
        this.f31017b = playbackController;
        this.f31018c = imageProvider;
        this.f31019d = statusController;
        this.f31020e = videoTracker;
    }

    @NotNull
    public final ln0 a() {
        return this.f31017b;
    }

    @NotNull
    public final fd2 b() {
        return this.f31019d;
    }

    @NotNull
    public final ob2<on0> c() {
        return this.f31016a;
    }

    @NotNull
    public final bg2 d() {
        return this.f31020e;
    }
}
