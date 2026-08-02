package io.flutter.plugins.videoplayer.texture;

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
public final class TextureExoPlayerEventListener extends ExoPlayerEventListener {
    private final boolean surfaceProducerHandlesCropAndRotation;

    public TextureExoPlayerEventListener(InterfaceC0151q interfaceC0151q, VideoPlayerCallbacks videoPlayerCallbacks, boolean z) {
        super(interfaceC0151q, videoPlayerCallbacks);
        this.surfaceProducerHandlesCropAndRotation = z;
    }

    private int getRotationCorrectionFromFormat(InterfaceC0151q interfaceC0151q) {
        C0130F c0130f = (C0130F) interfaceC0151q;
        c0130f.L();
        C0097o c0097o = c0130f.f3863S;
        Objects.requireNonNull(c0097o);
        return c0097o.z;
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
        C0130F c0130f = (C0130F) this.exoPlayer;
        c0130f.L();
        e0 e0Var = c0130f.f3882g0;
        ExoPlayerEventListener.RotationDegrees rotationDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
        int i4 = e0Var.f2776a;
        int i5 = e0Var.f2777b;
        if (i4 != 0 && i5 != 0 && !this.surfaceProducerHandlesCropAndRotation) {
            try {
                rotationDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(getRotationCorrectionFromFormat(this.exoPlayer));
            } catch (IllegalArgumentException unused) {
                rotationDegrees = ExoPlayerEventListener.RotationDegrees.ROTATE_0;
            }
        }
        this.events.onInitialized(i4, i5, ((C0130F) this.exoPlayer).s(), rotationDegrees.getDegrees());
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener, T.L
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(M m4, M m5, int i4) {
    }
}
