package com.moyoung.classes.meditation;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.coach.widget.CustomExoPlayerTimeBar;
import com.realsil.sdk.dfu.DfuConstants;
import java.io.File;

/* loaded from: classes4.dex */
public class c {
    private ExoPlayer audioPlayer;
    private Context context;
    private final Handler handler = new Handler();

    public c(Context context, PlayerControlView playerControlView) {
        this.context = context.getApplicationContext();
        initAudioPlayer(playerControlView);
    }

    private void executeVolumeFadeInLoop() {
        this.handler.postDelayed(new Runnable() { // from class: com.moyoung.classes.meditation.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.lambda$executeVolumeFadeInLoop$0();
            }
        }, 10L);
    }

    private void executeVolumeFadeOutLoop() {
        this.handler.postDelayed(new Runnable() { // from class: com.moyoung.classes.meditation.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.lambda$executeVolumeFadeOutLoop$1();
            }
        }, 10L);
    }

    private void initAudioPlayer(PlayerControlView playerControlView) {
        ExoPlayer.Builder builder = new ExoPlayer.Builder(this.context);
        long j8 = DfuConstants.MAX_CALLBACK_LOCK_WAIT_TIME;
        ExoPlayer build = builder.setSeekBackIncrementMs(j8).setSeekForwardIncrementMs(j8).build();
        this.audioPlayer = build;
        build.setPlayWhenReady(false);
        if (playerControlView != null) {
            initControlView(playerControlView);
        }
    }

    private void initControlView(PlayerControlView playerControlView) {
        playerControlView.setShowTimeoutMs(-1);
        playerControlView.setPlayer(this.audioPlayer);
        CustomExoPlayerTimeBar customExoPlayerTimeBar = (CustomExoPlayerTimeBar) playerControlView.findViewById(R$id.exo_progress);
        customExoPlayerTimeBar.hideScrubber(true);
        customExoPlayerTimeBar.setDragEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeVolumeFadeInLoop$0() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer == null || exoPlayer.getVolume() >= 1.0f) {
            return;
        }
        Log.d("setVolumeFadeInAndOut", "=" + this.audioPlayer.getVolume());
        ExoPlayer exoPlayer2 = this.audioPlayer;
        exoPlayer2.setVolume(exoPlayer2.getVolume() + 0.01f);
        executeVolumeFadeInLoop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeVolumeFadeOutLoop$1() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer == null || exoPlayer.getVolume() <= 0.0f) {
            return;
        }
        Log.d("setVolumeFadeInAndOut", "=" + this.audioPlayer.getVolume());
        ExoPlayer exoPlayer2 = this.audioPlayer;
        exoPlayer2.setVolume(exoPlayer2.getVolume() - 0.01f);
        executeVolumeFadeOutLoop();
    }

    private void seekTo(long j8) {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j8);
        }
    }

    private void setVolumeFadeIn() {
        this.audioPlayer.setVolume(0.0f);
        executeVolumeFadeInLoop();
    }

    private void startPlayer() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
            setVolumeFadeIn();
        }
    }

    public ExoPlayer getAudioPlayer() {
        return this.audioPlayer;
    }

    public void pause() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    public void play() {
        play(-1L);
    }

    public void release() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.audioPlayer = null;
        }
        this.context = null;
    }

    public void setAudioWithFile(File file) {
        this.audioPlayer.addMediaItem(MediaItem.fromUri(Uri.fromFile(file)));
        this.audioPlayer.prepare();
    }

    public void setAudioWithUrl(String str) {
        this.audioPlayer.addMediaItem(MediaItem.fromUri(str));
        this.audioPlayer.prepare();
    }

    public void setIsRepeat(boolean z7) {
        ExoPlayer exoPlayer;
        if (z7 && (exoPlayer = this.audioPlayer) != null) {
            exoPlayer.setRepeatMode(2);
        }
    }

    public void setVolumeFadeOut() {
        this.audioPlayer.setVolume(1.0f);
        executeVolumeFadeOutLoop();
    }

    public void stop() {
        ExoPlayer exoPlayer = this.audioPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
    }

    public void play(long j8) {
        if (j8 != -1) {
            seekTo(j8);
        }
        startPlayer();
    }
}
