package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wa1 implements cc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f33976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final je2 f33977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fc2 f33978c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final k92<ya1> f33979d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private ic2 f33980e;

    public /* synthetic */ wa1(Context context, C2360y7 c2360y7, C2286v2 c2286v2, ga1 ga1Var, ob2 ob2Var, qb1 qb1Var, jc2 jc2Var, cg2 cg2Var, sc2 sc2Var, je2 je2Var) {
        this(context, c2360y7, c2286v2, ga1Var, ob2Var, qb1Var, jc2Var, cg2Var, sc2Var, je2Var, new fc2(context, c2286v2, jc2Var));
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void play() {
        this.f33979d.d();
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void stop() {
        this.f33979d.b();
        this.f33976a.a();
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(@Nullable ic2 ic2Var) {
        this.f33980e = ic2Var;
    }

    private final class a implements ec2<ya1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void a(@NotNull ob2<ya1> videoAdPlaybackInfo, @NotNull mc2 videoAdPlayerError) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
            wa1.this.f33976a.a(videoAdPlayerError);
            ic2 ic2Var = wa1.this.f33980e;
            if (ic2Var != null) {
                ic2Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void b(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void c(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            wa1.this.f33978c.b();
            ic2 ic2Var = wa1.this.f33980e;
            if (ic2Var != null) {
                ic2Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void d(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            wa1.this.f33979d.c();
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void e(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ic2 ic2Var = wa1.this.f33980e;
            if (ic2Var != null) {
                ic2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void f(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void g(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            wa1.this.f33978c.a();
            ic2 ic2Var = wa1.this.f33980e;
            if (ic2Var != null) {
                ic2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void i(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void j(@NotNull ob2<ya1> videoAdInfo) {
            Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void k(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            wa1.this.f33977b.h();
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void l(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            wa1.this.f33977b.d();
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void a(@NotNull ob2<ya1> videoAdPlaybackInfo) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ic2 ic2Var = wa1.this.f33980e;
            if (ic2Var != null) {
                ic2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec2
        public final void a(@NotNull ob2<ya1> videoAdPlaybackInfo, float f4) {
            Intrinsics.checkNotNullParameter(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }
    }

    public wa1(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull ga1 videoAdPlayer, @NotNull ob2 videoAdInfo, @NotNull qb1 videoViewProvider, @NotNull jc2 playbackParametersProvider, @NotNull cg2 videoTracker, @NotNull sc2 progressEventsObservable, @NotNull je2 videoImpressionTrackingListener, @NotNull fc2 playbackEventsReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(playbackParametersProvider, "playbackParametersProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(progressEventsObservable, "progressEventsObservable");
        Intrinsics.checkNotNullParameter(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        Intrinsics.checkNotNullParameter(playbackEventsReporter, "playbackEventsReporter");
        this.f33976a = videoAdPlayer;
        this.f33977b = videoImpressionTrackingListener;
        this.f33978c = playbackEventsReporter;
        k92<ya1> k92Var = new k92<>(context, adConfiguration, new ia1(videoAdPlayer), videoViewProvider, videoAdInfo, new db1(videoViewProvider), new fd2(), videoTracker, progressEventsObservable, new a(), adResponse);
        this.f33979d = k92Var;
        k92Var.a(playbackParametersProvider);
    }
}
