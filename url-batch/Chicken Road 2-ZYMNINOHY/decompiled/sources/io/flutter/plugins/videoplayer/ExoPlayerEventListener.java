package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import E0.e;
import T.C;
import T.C0086d;
import T.C0091i;
import T.C0107z;
import T.E;
import T.H;
import T.I;
import T.J;
import T.K;
import T.L;
import T.M;
import T.N;
import T.T;
import T.U;
import T.Y;
import T.Z;
import T.a0;
import T.e0;
import a0.C0130F;
import a0.InterfaceC0151q;
import java.util.List;
import v2.G;

/* loaded from: classes.dex */
public abstract class ExoPlayerEventListener implements L {
    protected final VideoPlayerCallbacks events;
    protected final InterfaceC0151q exoPlayer;
    private boolean isInitialized = false;

    public enum RotationDegrees {
        ROTATE_0(0),
        ROTATE_90(90),
        ROTATE_180(180),
        ROTATE_270(270);

        private final int degrees;

        RotationDegrees(int i4) {
            this.degrees = i4;
        }

        public static RotationDegrees fromDegrees(int i4) {
            for (RotationDegrees rotationDegrees : values()) {
                if (rotationDegrees.degrees == i4) {
                    return rotationDegrees;
                }
            }
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Invalid rotation degrees specified: "));
        }

        public int getDegrees() {
            return this.degrees;
        }
    }

    public ExoPlayerEventListener(InterfaceC0151q interfaceC0151q, VideoPlayerCallbacks videoPlayerCallbacks) {
        this.exoPlayer = interfaceC0151q;
        this.events = videoPlayerCallbacks;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String findSelectedAudioTrackId(a0 a0Var) {
        G listIterator = a0Var.f2765a.listIterator(0);
        int i4 = 0;
        while (listIterator.hasNext()) {
            Z z = (Z) listIterator.next();
            U u4 = z.f2752b;
            boolean[] zArr = z.f2755e;
            if (u4.f2707c == 1) {
                int length = zArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (zArr[i5]) {
                        for (int i6 = 0; i6 < z.f2751a; i6++) {
                            if (zArr[i6]) {
                                return i4 + "_" + i6;
                            }
                        }
                    } else {
                        i5++;
                    }
                }
            }
            i4++;
        }
        return null;
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0086d c0086d) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(J j4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onCues(V.c cVar) {
    }

    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0091i c0091i) {
    }

    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i4, boolean z) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onEvents(N n, K k4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // T.L
    public void onIsPlayingChanged(boolean z) {
        this.events.onIsPlayingStateUpdate(z);
    }

    @Override // T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onMediaItemTransition(C0107z c0107z, int i4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C c4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onMetadata(E e4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(I i4) {
    }

    @Override // T.L
    public void onPlaybackStateChanged(int i4) {
        PlatformPlaybackState platformPlaybackState = PlatformPlaybackState.UNKNOWN;
        if (i4 == 1) {
            platformPlaybackState = PlatformPlaybackState.IDLE;
        } else if (i4 == 2) {
            platformPlaybackState = PlatformPlaybackState.BUFFERING;
        } else if (i4 == 3) {
            platformPlaybackState = PlatformPlaybackState.READY;
            if (!this.isInitialized) {
                this.isInitialized = true;
                sendInitialized();
            }
        } else if (i4 == 4) {
            platformPlaybackState = PlatformPlaybackState.ENDED;
        }
        this.events.onPlaybackStateChanged(platformPlaybackState);
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i4) {
    }

    @Override // T.L
    public void onPlayerError(H h2) {
        if (h2.f2661a == 1002) {
            e eVar = (e) this.exoPlayer;
            eVar.getClass();
            eVar.g(((C0130F) eVar).m(), -9223372036854775807L);
            ((C0130F) this.exoPlayer).B();
            return;
        }
        this.events.onError("VideoError", "Video player had error " + h2, null);
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(H h2) {
    }

    @Override // T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i4) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C c4) {
    }

    @Override // T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i4) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i4) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
    }

    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i4, int i5) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onTimelineChanged(T t4, int i4) {
    }

    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(Y y4) {
    }

    @Override // T.L
    public void onTracksChanged(a0 a0Var) {
        this.events.onAudioTrackChanged(findSelectedAudioTrackId(a0Var));
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(e0 e0Var) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f4) {
    }

    public abstract void sendInitialized();

    @Override // T.L
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // T.L
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(M m4, M m5, int i4) {
    }
}
