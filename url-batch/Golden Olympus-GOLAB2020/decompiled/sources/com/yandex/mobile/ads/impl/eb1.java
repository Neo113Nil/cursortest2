package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class eb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h81 f25178a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cb1 f25179b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sd2 f25180c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ja1 f25181d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private bb1 f25182e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private g81 f25183f;

    public eb1(@NotNull Context context, @NotNull gg2 viewAdapter, @NotNull me2 videoOptions, @NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull je2 impressionTrackingListener, @NotNull ra1 nativeVideoPlaybackEventListener, @NotNull h81 nativeForcePauseObserver, @NotNull zi0 imageProvider, @NotNull cb1 presenterCreator, @NotNull sd2 aspectRatioProvider, @NotNull ja1 nativeVideoAdPlayerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(presenterCreator, "presenterCreator");
        Intrinsics.checkNotNullParameter(aspectRatioProvider, "aspectRatioProvider");
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayerProvider, "nativeVideoAdPlayerProvider");
        this.f25178a = nativeForcePauseObserver;
        this.f25179b = presenterCreator;
        this.f25180c = aspectRatioProvider;
        this.f25181d = nativeVideoAdPlayerProvider;
    }

    public final void a(@NotNull mb1 videoView, @NotNull ob2<ya1> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f25180c.getClass();
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        videoView.setAspectRatio(videoAdInfo.d().getAdHeight() != 0 ? r4.getAdWidth() / r4.getAdHeight() : 1.7777778f);
        bb1 bb1Var = this.f25182e;
        if (bb1Var != null) {
            bb1Var.a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ eb1(Context context, gg2 gg2Var, me2 me2Var, C2286v2 c2286v2, C2360y7 c2360y7, je2 je2Var, ra1 ra1Var, h81 h81Var, zi0 zi0Var, nx1 nx1Var) {
        this(context, gg2Var, me2Var, c2286v2, c2360y7, je2Var, ra1Var, h81Var, zi0Var, r10, r11, new ja1(r0, c2286v2, c2360y7));
        cb1 cb1Var = new cb1(gg2Var, me2Var, c2286v2, c2360y7, je2Var, ra1Var, zi0Var, nx1Var);
        sd2 sd2Var = new sd2();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a(@NotNull mb1 videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        bb1 bb1Var = this.f25182e;
        if (bb1Var != null) {
            bb1Var.b(videoView);
        }
        g81 g81Var = this.f25183f;
        if (g81Var != null) {
            this.f25178a.b(g81Var);
            this.f25183f = null;
        }
        videoView.setOnAttachStateChangeListener(null);
    }

    public final void a(@NotNull mb1 videoView, @NotNull ab2 video, @NotNull cg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        ga1 a4 = this.f25181d.a(video.b());
        Context context = videoView.getContext();
        cb1 cb1Var = this.f25179b;
        Intrinsics.checkNotNull(context);
        bb1 a5 = cb1Var.a(context, a4, video, videoTracker);
        this.f25182e = a5;
        a5.a(videoView);
        g81 g81Var = new g81(a4);
        this.f25183f = g81Var;
        this.f25178a.a(g81Var);
        videoView.setOnAttachStateChangeListener(new oa1(a4, videoView));
    }
}
