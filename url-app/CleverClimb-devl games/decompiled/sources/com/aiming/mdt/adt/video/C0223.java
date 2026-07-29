package com.aiming.mdt.adt.video;

import android.media.MediaPlayer;
import com.aiming.mdt.a.C0054;

/* renamed from: com.aiming.mdt.adt.video.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0223 implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ VideoActivity f729;

    C0223(VideoActivity videoActivity) {
        this.f729 = videoActivity;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        boolean z;
        C0054 c0054;
        C0054 c00542;
        z = this.f729.isPause;
        if (z) {
            c0054 = this.f729.mVideoView;
            if (c0054 != null) {
                c00542 = this.f729.mVideoView;
                c00542.start();
                this.f729.isPause = false;
            }
        }
    }
}
