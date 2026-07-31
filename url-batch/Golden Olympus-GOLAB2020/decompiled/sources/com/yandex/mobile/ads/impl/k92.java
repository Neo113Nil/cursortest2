package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ad2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k92<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lc2<T> f28119a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hg2 f28120b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob2<T> f28121c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fd2 f28122d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bg2 f28123e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2105n4 f28124f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final yc2 f28125g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final vc2 f28126h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final dc2<T> f28127i;

    public k92(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull lc2 videoAdPlayer, @NotNull hg2 videoViewProvider, @NotNull ob2 videoAdInfo, @NotNull jf2 videoRenderValidator, @NotNull fd2 videoAdStatusController, @NotNull cg2 videoTracker, @NotNull sc2 progressEventsObservable, @NotNull ec2 playbackEventsListener, @Nullable C2360y7 c2360y7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoRenderValidator, "videoRenderValidator");
        Intrinsics.checkNotNullParameter(videoAdStatusController, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(progressEventsObservable, "progressEventsObservable");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        this.f28119a = videoAdPlayer;
        this.f28120b = videoViewProvider;
        this.f28121c = videoAdInfo;
        this.f28122d = videoAdStatusController;
        this.f28123e = videoTracker;
        C2105n4 c2105n4 = new C2105n4();
        this.f28124f = c2105n4;
        yc2 yc2Var = new yc2(context, adConfiguration, c2360y7, videoAdInfo, c2105n4, videoAdStatusController, videoViewProvider, videoRenderValidator, videoTracker);
        this.f28125g = yc2Var;
        vc2 vc2Var = new vc2(videoAdPlayer, progressEventsObservable);
        this.f28126h = vc2Var;
        this.f28127i = new dc2<>(videoAdInfo, videoAdPlayer, vc2Var, yc2Var, videoAdStatusController, c2105n4, videoTracker, playbackEventsListener);
        new uc2(context, videoAdInfo, videoViewProvider, videoAdStatusController, videoTracker, videoAdPlayer, playbackEventsListener).a(progressEventsObservable);
    }

    public final void a() {
        this.f28126h.b();
        this.f28119a.a((dc2) null);
        this.f28122d.b();
        this.f28125g.e();
        this.f28124f.a();
    }

    public final void b() {
        this.f28126h.b();
        this.f28119a.pauseAd();
    }

    public final void c() {
        this.f28119a.c();
    }

    public final void d() {
        this.f28119a.a(this.f28127i);
        this.f28119a.a(this.f28121c);
        C2105n4 c2105n4 = this.f28124f;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28865v;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        View view = this.f28120b.getView();
        if (view != null) {
            this.f28123e.a(view, this.f28120b.a());
        }
        this.f28125g.f();
        this.f28122d.b(ed2.f25239c);
    }

    public final void e() {
        this.f28119a.resumeAd();
    }

    public final void f() {
        this.f28119a.a();
    }

    public final void a(@NotNull ad2.b reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f28125g.a(reportParameterManager);
    }

    public final void a(@NotNull ad2.a reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f28125g.a(reportParameterManager);
    }
}
