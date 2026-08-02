package com.startapp.sdk.internal;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* loaded from: classes.dex */
public final class pd extends b2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: g, reason: collision with root package name */
    public MediaPlayer f7444g;

    /* renamed from: h, reason: collision with root package name */
    public final VideoView f7445h;

    public pd(VideoView videoView) {
        this.f7445h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f6692a = str;
        if (str != null) {
            try {
                this.f7445h.setVideoPath(str);
            } catch (Throwable th) {
                d9.a(th);
                onError(this.f7444g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.startapp.sdk.ads.video.b bVar = this.f6695d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
        ProgressBar progressBar;
        if (this.f6694c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        yj yjVar = this.f6694c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i4 == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        String obj = (i5 != -1010 ? i5 != -1007 ? i5 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED).toString();
        ak akVar = new ak(videoPlayerInterface$VideoPlayerErrorType, obj, currentPosition);
        com.startapp.sdk.ads.video.c cVar = yjVar.f7970a;
        if (cVar.L != null) {
            if (!cVar.f6252Z || cVar.f6255c0 > cVar.f6256d0 || currentPosition <= 0 || !obj.equals("MEDIA_ERROR_IO")) {
                yjVar.f7970a.a(akVar);
            } else {
                com.startapp.sdk.ads.video.c cVar2 = yjVar.f7970a;
                cVar2.f6255c0++;
                if (!cVar2.f6258f0 && ((progressBar = cVar2.f6242P) == null || !progressBar.isShown())) {
                    cVar2.f6262j0.postDelayed(new pj(cVar2), AdsCommonMetaData.k().F().h());
                }
                com.startapp.sdk.ads.video.c cVar3 = yjVar.f7970a;
                cVar3.L.a(cVar3.x().getLocalVideoPath());
                yjVar.f7970a.L.a(currentPosition);
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        G2.b bVar;
        this.f7444g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        wj wjVar = this.f6693b;
        if (wjVar != null) {
            com.startapp.sdk.ads.video.c cVar = wjVar.f7847a;
            int i4 = cVar.f6259g0;
            if (i4 > 0) {
                pd pdVar = cVar.L;
                if (pdVar != null) {
                    pdVar.a(i4);
                }
                com.startapp.sdk.ads.video.c cVar2 = wjVar.f7847a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                sd sdVar = cVar2.f7823D;
                if (sdVar != null && (bVar = sdVar.f7566c) != null) {
                    F2.i iVar = bVar.f842a;
                    V3.b.a(iVar);
                    iVar.f785e.d("resume", null);
                }
                cVar2.a(cVar2.f6259g0, new VideoPausedTrackingParams(cVar2.n, cVar2.a(cVar2.f6259g0), cVar2.f7820A, cVar2.f6248V, pauseOrigin, cVar2.f6261i0), "resumed", cVar2.x().getVideoTrackingDetails().n());
                cVar2.f6248V++;
            } else if (cVar.B()) {
                wjVar.f7847a.H();
            }
        }
        if (g0.b(this.f6692a) && (mediaPlayer2 = this.f7444g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new od(this));
        } else {
            if (g0.b(this.f6692a)) {
                return;
            }
            ne.f7339a.f7396b = this.f6697f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        vj vjVar = this.f6696e;
        if (vjVar != null) {
            vjVar.f7774a.H();
        }
    }

    public final void a(int i4) {
        try {
            MediaPlayer mediaPlayer = this.f7444g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i4, 3);
                } else {
                    mediaPlayer.seekTo(i4);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
