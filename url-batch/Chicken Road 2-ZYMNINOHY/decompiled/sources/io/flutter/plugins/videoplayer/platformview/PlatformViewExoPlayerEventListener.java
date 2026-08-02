package io.flutter.plugins.videoplayer.platformview;

import T.C;
import T.C0086d;
import T.C0091i;
import T.C0097o;
import T.C0107z;
import T.E;
import T.H;
import T.I;
import T.J;
import T.K;
import T.M;
import T.N;
import T.T;
import T.Y;
import T.e0;
import V.c;
import a0.C0130F;
import a0.InterfaceC0151q;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PlatformViewExoPlayerEventListener extends ExoPlayerEventListener {
    public PlatformViewExoPlayerEventListener(InterfaceC0151q interfaceC0151q, VideoPlayerCallbacks videoPlayerCallbacks) {
        super(interfaceC0151q, videoPlayerCallbacks);
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0086d c0086d) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(J j4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onCues(c cVar) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0091i c0091i) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i4, boolean z) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onEvents(N n, K k4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onMediaItemTransition(C0107z c0107z, int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C c4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onMetadata(E e4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(I i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(H h2) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C c4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i4, int i5) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onTimelineChanged(T t4, int i4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(Y y4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(e0 e0Var) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f4) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    public void sendInitialized() {
        int i4;
        int i5;
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.L();
        C0097o c0097o = c0130f.f3863S;
        Objects.requireNonNull(c0097o);
        ExoPlayerEventListener.RotationDegrees fromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(c0097o.z);
        int i6 = c0097o.f2874u;
        int i7 = c0097o.v;
        if (fromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_90 || fromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_270) {
            fromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(0);
            i4 = i7;
            i5 = i6;
        } else {
            i5 = i7;
            i4 = i6;
        }
        this.events.onInitialized(i4, i5, ((C0130F) this.exoPlayer).s(), fromDegrees.getDegrees());
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(M m4, M m5, int i4) {
    }
}
