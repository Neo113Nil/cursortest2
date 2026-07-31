package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f25878a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final View.OnClickListener f25879b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a10 f25880c;

    public fo(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss coreInstreamAdBreak, @NotNull ob2<on0> videoAdInfo, @NotNull bg2 videoTracker, @NotNull tn0 playbackListener, @NotNull wd2 videoClicks, @NotNull View.OnClickListener clickListener, @NotNull a10 deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f25878a = videoAdInfo;
        this.f25879b = clickListener;
        this.f25880c = deviceTypeProvider;
    }

    public final void a(@NotNull View clickControl) {
        Intrinsics.checkNotNullParameter(clickControl, "clickControl");
        a10 a10Var = this.f25880c;
        Context context = clickControl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        z00 a4 = a10Var.a(context);
        String c4 = this.f25878a.b().c();
        if ((c4 == null || c4.length() == 0) || a4 == z00.f35413d) {
            clickControl.setVisibility(8);
        } else {
            clickControl.setOnClickListener(this.f25879b);
        }
    }

    public final void a(@NotNull ExtendedVideoAdControlsContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        a10 a10Var = this.f25880c;
        Intrinsics.checkNotNull(context);
        z00 a4 = a10Var.a(context);
        String c4 = this.f25878a.b().c();
        container.setOnClickListener(((c4 == null || c4.length() == 0) || a4 == z00.f35413d) ? null : new co(context, this.f25879b));
    }
}
