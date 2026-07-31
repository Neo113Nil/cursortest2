package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y50 implements vs {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f34807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ul1 f34808b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2011j5 f34809c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1964h5 f34810d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1916f5 f34811e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final mi1 f34812f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final qi1 f34813g;

    public y50(@NotNull C1800a9 adStateHolder, @NotNull ki1 playerStateController, @NotNull ll1 progressProvider, @NotNull C2011j5 prepareController, @NotNull C1964h5 playController, @NotNull C1916f5 adPlayerEventsController, @NotNull mi1 playerStateHolder, @NotNull qi1 playerVolumeController) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(prepareController, "prepareController");
        Intrinsics.checkNotNullParameter(playController, "playController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        this.f34807a = adStateHolder;
        this.f34808b = progressProvider;
        this.f34809c = prepareController;
        this.f34810d = playController;
        this.f34811e = adPlayerEventsController;
        this.f34812f = playerStateHolder;
        this.f34813g = playerVolumeController;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34808b.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final long b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34808b.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f34810d.b(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f34809c.a(videoAd);
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
            this.f34810d.a(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f34810d.c(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f34810d.d(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        try {
            this.f34810d.e(videoAd);
        } catch (RuntimeException e4) {
            ap0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final boolean j(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f34807a.a(videoAd) != dm0.f24678b && this.f34812f.c();
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final float k(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Float a4 = this.f34813g.a();
        if (a4 != null) {
            return a4.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@Nullable sl0 sl0Var) {
        this.f34811e.a(sl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f34813g.a(f4);
        this.f34811e.a(videoAd, f4);
    }
}
