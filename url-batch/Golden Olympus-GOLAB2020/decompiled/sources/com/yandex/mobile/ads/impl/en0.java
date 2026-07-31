package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class en0 implements Inroll, Pauseroll {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ys0 f25364a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bm2 f25365b;

    public /* synthetic */ en0(ys0 ys0Var) {
        this(ys0Var, new bm2());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @NotNull
    public final InstreamAdBreak getInstreamAdBreak() {
        return new rl2(this.f25364a.a());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f25364a.b();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f25364a.c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@NotNull InstreamAdView instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        this.f25364a.a(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@NotNull InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        this.f25364a.a(new xl2(instreamAdPlayer, this.f25365b));
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f25364a.d();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f25364a.a(instreamAdBreakEventListener != null ? new sl2(instreamAdBreakEventListener) : null);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f25364a.a(videoAdPlaybackListener != null ? new hn2(videoAdPlaybackListener, this.f25365b) : null);
    }

    public en0(@NotNull ys0 manualAdBreakPlaybackController, @NotNull bm2 videoAdAdapterCache) {
        Intrinsics.checkNotNullParameter(manualAdBreakPlaybackController, "manualAdBreakPlaybackController");
        Intrinsics.checkNotNullParameter(videoAdAdapterCache, "videoAdAdapterCache");
        manualAdBreakPlaybackController.getClass();
        this.f25364a = manualAdBreakPlaybackController;
        this.f25365b = videoAdAdapterCache;
    }
}
