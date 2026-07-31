package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hp1 implements cc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f26881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ob2<ya1> f26882b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vc2 f26883c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f26884d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private ic2 f26885e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ hp1(ga1 ga1Var, ob2 ob2Var, sc2 sc2Var) {
        this(ga1Var, ob2Var, sc2Var, r4, new vc2(r4, sc2Var));
        ia1 ia1Var = new ia1(ga1Var);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void play() {
        this.f26881a.a(this.f26884d);
        this.f26881a.a(this.f26882b.d());
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void stop() {
        this.f26883c.b();
        this.f26881a.pauseAd();
        this.f26881a.a();
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(@Nullable ic2 ic2Var) {
        this.f26885e = ic2Var;
    }

    private final class a implements nc2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void a(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            hp1.this.f26883c.b();
            hp1.this.f26881a.a((nc2) null);
            ic2 ic2Var = hp1.this.f26885e;
            if (ic2Var != null) {
                ic2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void b(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void c(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void d(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            hp1.this.f26881a.c();
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void e(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            hp1.this.f26883c.b();
            hp1.this.f26881a.a((nc2) null);
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void f(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void g(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void h(@NotNull gc2 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            hp1.this.f26883c.a();
            ic2 ic2Var = hp1.this.f26885e;
            if (ic2Var != null) {
                ic2Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void a(@NotNull fn0 playbackInfo) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            hp1.this.f26883c.b();
            hp1.this.f26881a.a((nc2) null);
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void a(@NotNull gc2 playbackInfo, @NotNull mc2 videoAdPlayerError) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
            Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
            hp1.this.f26883c.b();
            hp1.this.f26881a.a((nc2) null);
            hp1.this.f26881a.a(videoAdPlayerError);
        }

        @Override // com.yandex.mobile.ads.impl.nc2
        public final void a(@NotNull gc2 playbackInfo, float f4) {
            Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        }
    }

    public hp1(@NotNull ga1 nativeVideoAdPlayer, @NotNull ob2<ya1> videoAdInfo, @NotNull sc2 videoAdProgressEventsObservable, @NotNull lc2<?> videoAdPlayer, @NotNull vc2 videoAdProgressTrackingManager) {
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdProgressTrackingManager, "videoAdProgressTrackingManager");
        this.f26881a = nativeVideoAdPlayer;
        this.f26882b = videoAdInfo;
        this.f26883c = videoAdProgressTrackingManager;
        this.f26884d = new a();
    }
}
