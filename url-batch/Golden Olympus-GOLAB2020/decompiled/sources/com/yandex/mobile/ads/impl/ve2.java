package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ve2 implements si1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yt f33591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vf2 f33592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final af2 f33593c;

    public /* synthetic */ ve2(yt ytVar) {
        this(ytVar, new vf2(), new af2());
    }

    public final void a(@NotNull re2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33593c.a(listener);
    }

    public final long b() {
        return this.f33591a.getVideoDuration();
    }

    public final long c() {
        return this.f33591a.getVideoPosition();
    }

    public final void d() {
        this.f33591a.pauseVideo();
    }

    public final void e() {
        this.f33591a.prepareVideo();
    }

    public final void f() {
        this.f33591a.resumeVideo();
    }

    public final void g() {
        this.f33591a.a(this.f33593c);
    }

    @Override // com.yandex.mobile.ads.impl.si1
    public final float getVolume() {
        return this.f33591a.getVolume();
    }

    public final void h() {
        this.f33591a.a(null);
        this.f33593c.b();
    }

    @NotNull
    public final vf2 a() {
        return this.f33592b;
    }

    public ve2(@NotNull yt videoPlayer, @NotNull vf2 statusController, @NotNull af2 videoPlayerEventsController) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        this.f33591a = videoPlayer;
        this.f33592b = statusController;
        this.f33593c = videoPlayerEventsController;
    }
}
