package com.moyoung.classes.coach.playing;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;

/* loaded from: classes4.dex */
public class d {
    protected ExoPlayer audioPlayer;
    protected ExoPlayer bgAudioPlayer;
    private Context context;

    public d(Context context) {
        this.context = context.getApplicationContext();
    }

    private void initAudioPlayer() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
            return;
        }
        ExoPlayer build = new ExoPlayer.Builder(this.context).build();
        this.audioPlayer = build;
        build.setPlayWhenReady(true);
    }

    private void initBgAudioPlayer() {
        if (this.bgAudioPlayer != null) {
            return;
        }
        ExoPlayer build = new ExoPlayer.Builder(this.context).build();
        this.bgAudioPlayer = build;
        build.setPlayWhenReady(false);
    }

    public void pauseAudio() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    public void pauseBgAudio() {
        ExoPlayer exoPlayer = this.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    public void release() {
        ExoPlayer exoPlayer = this.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.bgAudioPlayer = null;
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
            this.audioPlayer = null;
        }
        this.context = null;
    }

    public void resumeAudio() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public void resumeBgAudio() {
        ExoPlayer exoPlayer = this.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public void setAudioUri(Uri uri) {
        initAudioPlayer();
        this.audioPlayer.clearMediaItems();
        this.audioPlayer.addMediaItem(MediaItem.fromUri(uri));
        this.audioPlayer.prepare();
    }

    public void setBgAudioUri(Uri uri) {
        initBgAudioPlayer();
        this.bgAudioPlayer.addMediaItem(MediaItem.fromUri(uri));
        this.bgAudioPlayer.prepare();
    }

    public void startAudioPlayer() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public void startBgAudioPlayer() {
        ExoPlayer exoPlayer = this.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public void stopAudio() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
    }

    public void stopBgAudio() {
        ExoPlayer exoPlayer = this.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
    }
}
