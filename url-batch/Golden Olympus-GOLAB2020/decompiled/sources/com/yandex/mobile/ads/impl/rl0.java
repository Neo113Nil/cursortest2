package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vs f31269a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sl0 f31270b;

    public /* synthetic */ rl0(vs vsVar) {
        this(vsVar, new sl0());
    }

    public final void a(@NotNull on0 videoAd, @NotNull ws listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31270b.a(videoAd, listener);
    }

    public final long b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f31269a.b(videoAd);
    }

    public final float c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f31269a.k(videoAd);
    }

    public final boolean d(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f31269a.j(videoAd);
    }

    public final void e(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.f(videoAd);
    }

    public final void f(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.c(videoAd);
    }

    public final void g(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.d(videoAd);
    }

    public final void h(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.e(videoAd);
    }

    public final void i(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.g(videoAd);
    }

    public final void j(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.h(videoAd);
    }

    public final void k(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.i(videoAd);
    }

    public rl0(@NotNull vs instreamAdPlayer, @NotNull sl0 instreamAdPlayerEventsObservable) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(instreamAdPlayerEventsObservable, "instreamAdPlayerEventsObservable");
        this.f31269a = instreamAdPlayer;
        this.f31270b = instreamAdPlayerEventsObservable;
    }

    public final long a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return this.f31269a.a(videoAd);
    }

    public final void b(@NotNull on0 videoAd, @NotNull ws listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31270b.b(videoAd, listener);
    }

    public final void a(@NotNull on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31269a.a(videoAd, f4);
    }

    public final void b() {
        this.f31269a.a((sl0) null);
        this.f31270b.a();
    }

    public final void a() {
        this.f31269a.a(this.f31270b);
    }
}
