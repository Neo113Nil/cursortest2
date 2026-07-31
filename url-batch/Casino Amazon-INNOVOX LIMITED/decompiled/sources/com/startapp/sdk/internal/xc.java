package com.startapp.sdk.internal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.sdk.ads.video.VideoMode$VideoFinishedReason;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xc implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public String f496a;
    public cj b;
    public ej c;
    public dj d;
    public bj e;
    public hj f;
    public MediaPlayer g;
    public final VideoView h;

    public xc(VideoView videoView) {
        this.h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        dj djVar = this.d;
        if (djVar != null) {
            com.startapp.sdk.ads.video.a aVar = djVar.f217a;
            if (!aVar.a0) {
                aVar.a(VideoMode$VideoFinishedReason.COMPLETE);
            }
            xc xcVar = djVar.f217a.L;
            if (xcVar != null) {
                xcVar.h.stopPlayback();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        oi b;
        if (this.c == null) {
            return false;
        }
        if (mediaPlayer != null) {
            mediaPlayer.getCurrentPosition();
        }
        ej ejVar = this.c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        String obj = (i2 != -1010 ? i2 != -1007 ? i2 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED).toString();
        com.startapp.sdk.ads.video.a aVar = ejVar.f231a;
        n8 n8Var = new n8(o8.e);
        n8Var.d = "Video player error: " + videoPlayerInterface$VideoPlayerErrorType;
        n8Var.e = obj;
        n8Var.g = aVar.a();
        n8Var.a();
        int ordinal = videoPlayerInterface$VideoPlayerErrorType.ordinal();
        VASTErrorCodes vASTErrorCodes = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? VASTErrorCodes.UndefinedError : VASTErrorCodes.MediaFileDisplayError : VASTErrorCodes.TimeoutMediaFileURI : VASTErrorCodes.GeneralLinearError;
        ri riVar = new ri(aVar.b0, new VideoTrackingParams(aVar.n, aVar.a(aVar.b0), aVar.A), aVar.y().getVideoUrl(), aVar.y().getVideoTrackingDetails().e());
        riVar.e = vASTErrorCodes;
        com.startapp.sdk.ads.video.a.a(aVar.f248a, riVar.a());
        if (aVar.v() == 0) {
            e0.a(aVar.h, aVar.n, aVar.A, "VIDEO_ERROR", (JSONObject) null);
            if (!VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT.equals(videoPlayerInterface$VideoPlayerErrorType) && (b = com.startapp.sdk.ads.video.a.b(aVar.f248a)) != null) {
                b.a();
            }
        }
        if ((!aVar.o() || aVar.z) && aVar.y().hasPostRoll()) {
            aVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        } else {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            db.a(aVar.f248a).a(intent);
            aVar.U = true;
            aVar.b();
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        MediaEvents mediaEvents;
        this.g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        cj cjVar = this.b;
        if (cjVar != null) {
            com.startapp.sdk.ads.video.a aVar = cjVar.f206a;
            int i = aVar.b0;
            xc xcVar = aVar.L;
            if (i > 0) {
                if (xcVar != null) {
                    try {
                        MediaPlayer mediaPlayer3 = xcVar.g;
                        if (mediaPlayer3 != null) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                mediaPlayer3.seekTo(i, 3);
                            } else {
                                mediaPlayer3.seekTo(i);
                            }
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                }
                com.startapp.sdk.ads.video.a aVar2 = cjVar.f206a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                ed edVar = aVar2.D;
                if (edVar != null && (mediaEvents = edVar.c) != null) {
                    mediaEvents.resume();
                }
                aVar2.a(aVar2.b0, new VideoPausedTrackingParams(aVar2.n, aVar2.a(aVar2.b0), aVar2.A, aVar2.V, pauseOrigin), "resumed", aVar2.y().getVideoTrackingDetails().n());
                aVar2.V++;
            } else if (xcVar != null && xcVar.g != null && aVar.S) {
                aVar.F();
            }
        }
        if (!e0.b(this.f496a) || (mediaPlayer2 = this.g) == null) {
            return;
        }
        mediaPlayer2.setOnBufferingUpdateListener(new wc(this));
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        bj bjVar = this.e;
        if (bjVar != null) {
            bjVar.f189a.F();
        }
    }
}
