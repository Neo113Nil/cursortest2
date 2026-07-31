package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jn2 implements yt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final VideoPlayer f27783a;

    public jn2(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f27783a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void a(@Nullable af2 af2Var) {
        this.f27783a.setVideoPlayerListener(af2Var != null ? new kn2(af2Var) : null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn2) && Intrinsics.areEqual(this.f27783a, ((jn2) obj).f27783a);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoDuration() {
        return this.f27783a.getVideoDuration();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final long getVideoPosition() {
        return this.f27783a.getVideoPosition();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final float getVolume() {
        return this.f27783a.getVolume();
    }

    public final int hashCode() {
        return this.f27783a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void pauseVideo() {
        this.f27783a.pauseVideo();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void prepareVideo() {
        this.f27783a.prepareVideo();
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public final void resumeVideo() {
        this.f27783a.resumeVideo();
    }

    @NotNull
    public final String toString() {
        return "YandexVideoPlayerAdapter(videoPlayer=" + this.f27783a + ")";
    }
}
