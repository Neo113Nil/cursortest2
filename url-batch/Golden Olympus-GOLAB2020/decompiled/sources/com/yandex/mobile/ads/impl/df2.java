package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class df2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob1 f24611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hl1 f24612b;

    public df2(@NotNull ob1 controlsConfigurator, @NotNull hl1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(controlsConfigurator, "controlsConfigurator");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f24611a = controlsConfigurator;
        this.f24612b = progressBarConfigurator;
    }

    public final void a(@NotNull mb1 videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.c().setVisibility(0);
        pe2 placeholderView = videoView.b();
        this.f24612b.getClass();
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        placeholderView.b().setVisibility(8);
        ImageView a4 = placeholderView.a();
        if (a4 != null) {
            a4.setVisibility(8);
        }
        this.f24611a.a(videoView.a().a());
    }
}
