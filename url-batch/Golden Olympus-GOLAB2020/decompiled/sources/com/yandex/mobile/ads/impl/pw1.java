package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pw1 implements yt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vl1 f30602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ri1 f30603b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ye2 f30604c;

    public pw1(@NotNull ml1 progressProvider, @NotNull ri1 playerVolumeController, @NotNull ye2 eventsController) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(eventsController, "eventsController");
        this.f30602a = progressProvider;
        this.f30603b = playerVolumeController;
        this.f30604c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void a(@Nullable af2 af2Var) {
        this.f30604c.a(af2Var);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoDuration() {
        return this.f30602a.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoPosition() {
        return this.f30602a.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final float getVolume() {
        Float a4 = this.f30603b.a();
        if (a4 != null) {
            return a4.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void pauseVideo() {
        this.f30604c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void prepareVideo() {
        this.f30604c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void resumeVideo() {
        this.f30604c.onVideoResumed();
    }
}
