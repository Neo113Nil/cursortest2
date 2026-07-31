package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ow1 implements yt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ul1 f30215a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qi1 f30216b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ze2 f30217c;

    public ow1(@NotNull ll1 progressProvider, @NotNull qi1 playerVolumeController, @NotNull ze2 eventsController) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(eventsController, "eventsController");
        this.f30215a = progressProvider;
        this.f30216b = playerVolumeController;
        this.f30217c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void a(@Nullable af2 af2Var) {
        this.f30217c.a(af2Var);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoDuration() {
        return this.f30215a.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoPosition() {
        return this.f30215a.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final float getVolume() {
        Float a4 = this.f30216b.a();
        if (a4 != null) {
            return a4.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void pauseVideo() {
        this.f30217c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void prepareVideo() {
        this.f30217c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void resumeVideo() {
        this.f30217c.onVideoResumed();
    }
}
