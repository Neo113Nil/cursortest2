package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oa1 implements ua1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ga1 f29956a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mb1 f29957b;

    public oa1(@NotNull ga1 player, @NotNull mb1 videoView) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f29956a = player;
        this.f29957b = videoView;
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final void a() {
        this.f29957b.b().b().clearAnimation();
        this.f29956a.a((TextureView) null);
    }

    @Override // com.yandex.mobile.ads.impl.ua1
    public final void b() {
        this.f29956a.a(this.f29957b.c());
    }
}
