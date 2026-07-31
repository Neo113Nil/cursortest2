package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kn0 implements lc2<on0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final on0 f28273a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rl0 f28274b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private a f28275c;

    public kn0(@NotNull on0 instreamVideoAd, @NotNull rl0 instreamAdPlayerController) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        this.f28273a = instreamVideoAd;
        this.f28274b = instreamAdPlayerController;
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f28274b.g(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final long b() {
        return this.f28274b.a(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void c() {
        this.f28274b.f(this.f28273a);
    }

    public final void d() {
        this.f28274b.h(this.f28273a);
    }

    public final void e() {
        this.f28274b.j(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final long getAdPosition() {
        return this.f28274b.b(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final float getVolume() {
        return this.f28274b.c(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final boolean isPlayingAd() {
        return this.f28274b.d(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void pauseAd() {
        this.f28274b.e(this.f28273a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void resumeAd() {
        this.f28274b.i(this.f28273a);
    }

    private static final class a implements ws {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final nc2 f28276a;

        public a(@NotNull dc2 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f28276a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void a(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.a(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void b(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.d(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void c(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.b(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void d(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.h(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void e(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.g(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void f(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.e(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void g(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.a((gc2) videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void h(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.c(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void i(@NotNull on0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.f(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void a(@NotNull on0 videoAd, @NotNull mc2 error) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            Intrinsics.checkNotNullParameter(error, "error");
            this.f28276a.a(videoAd.g(), error);
        }

        @Override // com.yandex.mobile.ads.impl.ws
        public final void a(@NotNull on0 videoAd, float f4) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f28276a.a(videoAd.g(), f4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(@Nullable dc2 dc2Var) {
        a aVar = this.f28275c;
        if (aVar != null) {
            this.f28274b.b(this.f28273a, aVar);
            this.f28275c = null;
        }
        if (dc2Var != null) {
            a aVar2 = new a(dc2Var);
            this.f28274b.a(this.f28273a, aVar2);
            this.f28275c = aVar2;
        }
    }

    public final void a(float f4) {
        this.f28274b.a(this.f28273a, f4);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a() {
        this.f28274b.k(this.f28273a);
    }
}
