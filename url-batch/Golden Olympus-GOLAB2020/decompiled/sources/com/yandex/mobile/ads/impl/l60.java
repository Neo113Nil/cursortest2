package com.yandex.mobile.ads.impl;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l60 implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2373yk f28434a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q60 f28435b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xh1 f28436c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ii1 f28437d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ci1 f28438e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final y42 f28439f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final lh1 f28440g;

    public l60(@NotNull C2373yk bindingControllerHolder, @NotNull q60 exoPlayerProvider, @NotNull xh1 playbackStateChangedListener, @NotNull ii1 playerStateChangedListener, @NotNull ci1 playerErrorListener, @NotNull y42 timelineChangedListener, @NotNull lh1 playbackChangesHandler) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(exoPlayerProvider, "exoPlayerProvider");
        Intrinsics.checkNotNullParameter(playbackStateChangedListener, "playbackStateChangedListener");
        Intrinsics.checkNotNullParameter(playerStateChangedListener, "playerStateChangedListener");
        Intrinsics.checkNotNullParameter(playerErrorListener, "playerErrorListener");
        Intrinsics.checkNotNullParameter(timelineChangedListener, "timelineChangedListener");
        Intrinsics.checkNotNullParameter(playbackChangesHandler, "playbackChangesHandler");
        this.f28434a = bindingControllerHolder;
        this.f28435b = exoPlayerProvider;
        this.f28436c = playbackStateChangedListener;
        this.f28437d = playerStateChangedListener;
        this.f28438e = playerErrorListener;
        this.f28439f = timelineChangedListener;
        this.f28440g = playbackChangesHandler;
    }

    public final void onPlayWhenReadyChanged(boolean z4, int i4) {
        Player a4 = this.f28435b.a();
        if (!this.f28434a.b() || a4 == null) {
            return;
        }
        this.f28437d.a(z4, a4.getPlaybackState());
    }

    public final void onPlaybackStateChanged(int i4) {
        Player a4 = this.f28435b.a();
        if (!this.f28434a.b() || a4 == null) {
            return;
        }
        this.f28436c.a(i4, a4);
    }

    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28438e.a(error);
    }

    public final void onPositionDiscontinuity(@NotNull Player.PositionInfo oldPosition, @NotNull Player.PositionInfo newPosition, int i4) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        this.f28440g.a();
    }

    public final void onRenderedFirstFrame() {
        Player a4 = this.f28435b.a();
        if (a4 != null) {
            onPlaybackStateChanged(a4.getPlaybackState());
        }
    }

    public final void onTimelineChanged(@NotNull Timeline timeline, int i4) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f28439f.a(timeline);
    }
}
