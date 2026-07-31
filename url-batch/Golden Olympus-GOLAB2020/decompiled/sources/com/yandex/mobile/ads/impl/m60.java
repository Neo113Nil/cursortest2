package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m60 implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2396zk f28912a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r60 f28913b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yh1 f28914c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ji1 f28915d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final di1 f28916e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final z42 f28917f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final mh1 f28918g;

    public m60(@NotNull C2396zk bindingControllerHolder, @NotNull r60 exoPlayerProvider, @NotNull yh1 playbackStateChangedListener, @NotNull ji1 playerStateChangedListener, @NotNull di1 playerErrorListener, @NotNull z42 timelineChangedListener, @NotNull mh1 playbackChangesHandler) {
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(exoPlayerProvider, "exoPlayerProvider");
        Intrinsics.checkNotNullParameter(playbackStateChangedListener, "playbackStateChangedListener");
        Intrinsics.checkNotNullParameter(playerStateChangedListener, "playerStateChangedListener");
        Intrinsics.checkNotNullParameter(playerErrorListener, "playerErrorListener");
        Intrinsics.checkNotNullParameter(timelineChangedListener, "timelineChangedListener");
        Intrinsics.checkNotNullParameter(playbackChangesHandler, "playbackChangesHandler");
        this.f28912a = bindingControllerHolder;
        this.f28913b = exoPlayerProvider;
        this.f28914c = playbackStateChangedListener;
        this.f28915d = playerStateChangedListener;
        this.f28916e = playerErrorListener;
        this.f28917f = timelineChangedListener;
        this.f28918g = playbackChangesHandler;
    }

    public final void onPlayWhenReadyChanged(boolean z4, int i4) {
        Player a4 = this.f28913b.a();
        if (!this.f28912a.b() || a4 == null) {
            return;
        }
        this.f28915d.a(z4, a4.getPlaybackState());
    }

    public final void onPlaybackStateChanged(int i4) {
        Player a4 = this.f28913b.a();
        if (!this.f28912a.b() || a4 == null) {
            return;
        }
        this.f28914c.a(i4, a4);
    }

    public final void onPlayerError(@NotNull PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28916e.a(error);
    }

    public final void onPositionDiscontinuity(@NotNull Player.PositionInfo oldPosition, @NotNull Player.PositionInfo newPosition, int i4) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        this.f28918g.a();
    }

    public final void onRenderedFirstFrame() {
        Player a4 = this.f28913b.a();
        if (a4 != null) {
            onPlaybackStateChanged(a4.getPlaybackState());
        }
    }

    public final void onTimelineChanged(@NotNull Timeline timeline, int i4) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f28917f.a(timeline);
    }
}
