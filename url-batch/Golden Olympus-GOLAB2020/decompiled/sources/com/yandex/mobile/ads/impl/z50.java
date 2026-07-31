package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z50 implements vs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f35470a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vl1 f35471b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2035k5 f35472c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1988i5 f35473d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1940g5 f35474e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ni1 f35475f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ri1 f35476g;

    public z50(@NotNull C1824b9 adStateHolder, @NotNull li1 playerStateController, @NotNull ml1 progressProvider, @NotNull C2035k5 prepareController, @NotNull C1988i5 playController, @NotNull C1940g5 adPlayerEventsController, @NotNull ni1 playerStateHolder, @NotNull ri1 playerVolumeController) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(prepareController, "prepareController");
        Intrinsics.checkNotNullParameter(playController, "playController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        this.f35470a = adStateHolder;
        this.f35471b = progressProvider;
        this.f35472c = prepareController;
        this.f35473d = playController;
        this.f35474e = adPlayerEventsController;
        this.f35475f = playerStateHolder;
        this.f35476g = playerVolumeController;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f35471b.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f35471b.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35473d.b(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35472c.a(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void e(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void f(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35473d.a(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35473d.c(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35473d.d(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f35473d.e(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final boolean j(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f35470a.a(videoAd) != em0.f25351b && this.f35475f.c();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final float k(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Float a4 = this.f35476g.a();
        if (a4 != null) {
            return a4.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@Nullable sl0 sl0Var) {
        this.f35474e.a(sl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f35476g.a(f4);
        this.f35474e.a(videoAd, f4);
    }
}
