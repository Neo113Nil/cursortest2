package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dc2<T> implements nc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<T> f24582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lc2<T> f24583b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vc2 f24584c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yc2 f24585d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final fd2 f24586e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2105n4 f24587f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final bg2 f24588g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ec2<T> f24589h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private kc2 f24590i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24591j;

    public dc2(@NotNull ob2 videoAdInfo, @NotNull lc2 videoAdPlayer, @NotNull vc2 progressTrackingManager, @NotNull yc2 videoAdRenderingController, @NotNull fd2 videoAdStatusController, @NotNull C2105n4 adLoadingPhasesManager, @NotNull cg2 videoTracker, @NotNull ec2 playbackEventsListener) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(progressTrackingManager, "progressTrackingManager");
        Intrinsics.checkNotNullParameter(videoAdRenderingController, "videoAdRenderingController");
        Intrinsics.checkNotNullParameter(videoAdStatusController, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        this.f24582a = videoAdInfo;
        this.f24583b = videoAdPlayer;
        this.f24584c = progressTrackingManager;
        this.f24585d = videoAdRenderingController;
        this.f24586e = videoAdStatusController;
        this.f24587f = adLoadingPhasesManager;
        this.f24588g = videoTracker;
        this.f24589h = playbackEventsListener;
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void a(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24591j = false;
        this.f24586e.b(ed2.f25243g);
        this.f24588g.b();
        this.f24584c.b();
        this.f24585d.c();
        this.f24589h.g(this.f24582a);
        this.f24583b.a((dc2) null);
        this.f24589h.j(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void b(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24586e.b(ed2.f25244h);
        if (this.f24591j) {
            this.f24588g.d();
        }
        this.f24589h.b(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void c(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        if (this.f24591j) {
            this.f24586e.b(ed2.f25241e);
            this.f24588g.j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void d(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24586e.b(ed2.f25240d);
        this.f24587f.a(EnumC2082m4.f28865v);
        this.f24589h.d(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void e(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24588g.g();
        this.f24591j = false;
        this.f24586e.b(ed2.f25242f);
        this.f24584c.b();
        this.f24585d.d();
        this.f24589h.e(this.f24582a);
        this.f24583b.a((dc2) null);
        this.f24589h.j(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void f(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        if (this.f24591j) {
            this.f24586e.b(ed2.f25245i);
            this.f24588g.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void g(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24586e.b(ed2.f25241e);
        if (this.f24591j) {
            this.f24588g.c();
        }
        this.f24584c.a();
        this.f24589h.f(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void h(@NotNull gc2 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24591j = true;
        this.f24586e.b(ed2.f25241e);
        this.f24584c.a();
        this.f24590i = new kc2(this.f24583b, this.f24588g);
        this.f24589h.c(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void a(@NotNull fn0 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24588g.e();
        this.f24591j = false;
        this.f24586e.b(ed2.f25242f);
        this.f24584c.b();
        this.f24585d.d();
        this.f24589h.a(this.f24582a);
        this.f24583b.a((dc2) null);
        this.f24589h.j(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void a(@NotNull gc2 playbackInfo, @NotNull mc2 videoAdPlayerError) {
        ed2 ed2Var;
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
        this.f24591j = false;
        if (this.f24586e.a(ed2.f25240d)) {
            ed2Var = ed2.f25246j;
        } else {
            ed2Var = ed2.f25247k;
        }
        this.f24586e.b(ed2Var);
        this.f24584c.b();
        this.f24585d.a(videoAdPlayerError);
        this.f24588g.a(videoAdPlayerError);
        this.f24589h.a(this.f24582a, videoAdPlayerError);
        this.f24583b.a((dc2) null);
        this.f24589h.j(this.f24582a);
    }

    @Override // com.yandex.mobile.ads.impl.nc2
    public final void a(@NotNull gc2 playbackInfo, float f4) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.f24588g.a(f4);
        kc2 kc2Var = this.f24590i;
        if (kc2Var != null) {
            kc2Var.a(f4);
        }
        this.f24589h.a(this.f24582a, f4);
    }
}
