package com.moyoung.classes.coach.playing;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.TimeBar;
import com.moyoung.classes.R$id;
import com.moyoung.classes.coach.widget.CustomExoPlayerTimeBar;
import com.moyoung.classes.coach.widget.CustomPlayerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f0 {
    private Context context;
    public ExoPlayer videoPlayer;
    private CustomPlayerView videoView;

    class a implements TimeBar.OnScrubListener {
        a() {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j8) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j8) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j8, boolean z7) {
            f0.this.seekTo(j8);
        }
    }

    public f0(Context context, CustomPlayerView customPlayerView) {
        this.context = context.getApplicationContext();
        initVideoPlayer(customPlayerView, null);
    }

    private void initControlView(CustomPlayerView customPlayerView, PlayerControlView playerControlView) {
        initTimeBar(customPlayerView, playerControlView);
        if (playerControlView == null) {
            customPlayerView.setControllerHideOnTouch(false);
            customPlayerView.setControllerShowTimeoutMs(-1);
            customPlayerView.findViewById(R$id.exo_play).setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f0.this.lambda$initControlView$0(view);
                }
            });
            customPlayerView.findViewById(R$id.exo_pause).setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f0.this.lambda$initControlView$1(view);
                }
            });
            return;
        }
        playerControlView.setShowTimeoutMs(-1);
        playerControlView.setPlayer(this.videoPlayer);
        customPlayerView.setUseController(true);
        customPlayerView.setControllerAutoShow(false);
        customPlayerView.setControllerShowTimeoutMs(5000);
        playerControlView.setTimeBarMinUpdateInterval(16);
    }

    private void initTimeBar(CustomPlayerView customPlayerView, PlayerControlView playerControlView) {
        if (playerControlView == null) {
            return;
        }
        CustomExoPlayerTimeBar customExoPlayerTimeBar = (CustomExoPlayerTimeBar) playerControlView.findViewById(R$id.exo_progress);
        customExoPlayerTimeBar.hideScrubber(true);
        customExoPlayerTimeBar.setDragEnabled(false);
        customExoPlayerTimeBar.addListener(new a());
    }

    private void initVideoPlayer(CustomPlayerView customPlayerView, PlayerControlView playerControlView) {
        ExoPlayer build = new ExoPlayer.Builder(this.context).build();
        this.videoPlayer = build;
        build.setPlayWhenReady(false);
        initVideoView(customPlayerView);
        initControlView(customPlayerView, playerControlView);
    }

    private void initVideoView(CustomPlayerView customPlayerView) {
        customPlayerView.setResizeMode(1);
        customPlayerView.setPlayer(this.videoPlayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initControlView$0(View view) {
        playVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initControlView$1(View view) {
        pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j8) {
        ExoPlayer exoPlayer = this.videoPlayer;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j8);
        }
    }

    private void startPlayer() {
        ExoPlayer exoPlayer = this.videoPlayer;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
            this.videoPlayer.play();
        }
    }

    public ExoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public void pause() {
        ExoPlayer exoPlayer = this.videoPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    public void playVideo() {
        playVideo(-1L);
    }

    public void release() {
        ExoPlayer exoPlayer = this.videoPlayer;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.videoPlayer = null;
        }
        this.context = null;
    }

    public void setVideoItemList(List<Uri> list) {
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            this.videoPlayer.addMediaItem(MediaItem.fromUri(it.next()));
        }
        this.videoPlayer.prepare();
    }

    public void setVideoResizeModeByOrientation(boolean z7) {
        if (z7) {
            this.videoView.setResizeMode(2);
        } else {
            this.videoView.setResizeMode(1);
        }
    }

    public void stop() {
        ExoPlayer exoPlayer = this.videoPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
    }

    public void playVideo(long j8) {
        if (j8 != -1) {
            seekTo(j8);
        }
        startPlayer();
    }

    public f0(Context context, CustomPlayerView customPlayerView, PlayerControlView playerControlView) {
        this.context = context.getApplicationContext();
        this.videoView = customPlayerView;
        initVideoPlayer(customPlayerView, playerControlView);
    }
}
