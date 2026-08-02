package com.startapp.sdk.internal;

import a.AbstractC0129a;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import k1.C1078b;

/* loaded from: classes.dex */
public final class pd extends b2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: g, reason: collision with root package name */
    public MediaPlayer f4309g;

    /* renamed from: h, reason: collision with root package name */
    public final VideoView f4310h;

    public pd(VideoView videoView) {
        this.f4310h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f3587a = str;
        if (str != null) {
            try {
                this.f4310h.setVideoPath(str);
            } catch (Throwable th) {
                d9.a(th);
                onError(this.f4309g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.startapp.sdk.ads.video.b bVar = this.f3590d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i4) {
        ProgressBar progressBar;
        if (this.f3589c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        yj yjVar = this.f3589c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i3 == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        String obj = (i4 != -1010 ? i4 != -1007 ? i4 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED).toString();
        ak akVar = new ak(videoPlayerInterface$VideoPlayerErrorType, obj, currentPosition);
        com.startapp.sdk.ads.video.c cVar = yjVar.f4822a;
        if (cVar.L != null) {
            if (!cVar.f3169Z || cVar.f3172c0 > cVar.f3173d0 || currentPosition <= 0 || !obj.equals("MEDIA_ERROR_IO")) {
                yjVar.f4822a.a(akVar);
            } else {
                com.startapp.sdk.ads.video.c cVar2 = yjVar.f4822a;
                cVar2.f3172c0++;
                if (!cVar2.f3175f0 && ((progressBar = cVar2.f3159P) == null || !progressBar.isShown())) {
                    cVar2.f3179j0.postDelayed(new pj(cVar2), AdsCommonMetaData.k().F().h());
                }
                com.startapp.sdk.ads.video.c cVar3 = yjVar.f4822a;
                cVar3.L.a(cVar3.x().getLocalVideoPath());
                yjVar.f4822a.L.a(currentPosition);
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        C1078b c1078b;
        this.f4309g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        wj wjVar = this.f3588b;
        if (wjVar != null) {
            com.startapp.sdk.ads.video.c cVar = wjVar.f4701a;
            int i3 = cVar.f3176g0;
            if (i3 > 0) {
                pd pdVar = cVar.L;
                if (pdVar != null) {
                    pdVar.a(i3);
                }
                com.startapp.sdk.ads.video.c cVar2 = wjVar.f4701a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                sd sdVar = cVar2.f4678D;
                if (sdVar != null && (c1078b = sdVar.f4429c) != null) {
                    j1.i iVar = c1078b.f9675a;
                    AbstractC0129a.a(iVar);
                    iVar.f9544e.d("resume", null);
                }
                cVar2.a(cVar2.f3176g0, new VideoPausedTrackingParams(cVar2.f4530n, cVar2.a(cVar2.f3176g0), cVar2.f4675A, cVar2.f3165V, pauseOrigin, cVar2.f3178i0), "resumed", cVar2.x().getVideoTrackingDetails().n());
                cVar2.f3165V++;
            } else if (cVar.B()) {
                wjVar.f4701a.H();
            }
        }
        if (g0.b(this.f3587a) && (mediaPlayer2 = this.f4309g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new od(this));
        } else {
            if (g0.b(this.f3587a)) {
                return;
            }
            ne.f4206a.f4261b = this.f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        vj vjVar = this.f3591e;
        if (vjVar != null) {
            vjVar.f4630a.H();
        }
    }

    public final void a(int i3) {
        try {
            MediaPlayer mediaPlayer = this.f4309g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i3, 3);
                } else {
                    mediaPlayer.seekTo(i3);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
