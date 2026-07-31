package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f29539a;

    public nb1(@NotNull ga1 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f29539a = videoAdPlayer;
    }

    public final void a(@NotNull mb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView c4 = nativeVideoView.c();
        this.f29539a.a(c4);
        c4.setVisibility(0);
        nativeVideoView.a().setVisibility(0);
        nativeVideoView.b().setVisibility(0);
    }

    public final void b(@NotNull mb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        TextureView c4 = nativeVideoView.c();
        this.f29539a.a((TextureView) null);
        c4.setVisibility(8);
        nativeVideoView.a().setVisibility(8);
        nativeVideoView.b().setVisibility(8);
    }
}
