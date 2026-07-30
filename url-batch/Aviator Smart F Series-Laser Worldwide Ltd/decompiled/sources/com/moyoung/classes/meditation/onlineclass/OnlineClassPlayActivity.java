package com.moyoung.classes.meditation.onlineclass;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.j3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$raw;
import com.moyoung.classes.databinding.ActivityMeditationOnlineClassPlayBinding;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassBean;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class OnlineClassPlayActivity extends BaseVBActivity<ActivityMeditationOnlineClassPlayBinding> {
    private com.moyoung.classes.meditation.c audioPlayerUI;
    private boolean isPlayed = false;
    private OnlineClassBean onlineClassBean;
    private long startTimestamp;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ((ActivityMeditationOnlineClassPlayBinding) ((BaseVBActivity) OnlineClassPlayActivity.this).binding).animPlaying.setAnimation(R$raw.anim_circle_playing);
            ((ActivityMeditationOnlineClassPlayBinding) ((BaseVBActivity) OnlineClassPlayActivity.this).binding).animPlaying.setRepeatMode(1);
            ((ActivityMeditationOnlineClassPlayBinding) ((BaseVBActivity) OnlineClassPlayActivity.this).binding).animPlaying.playAnimation();
            ((ActivityMeditationOnlineClassPlayBinding) ((BaseVBActivity) OnlineClassPlayActivity.this).binding).animPlaying.setVisibility(0);
            ((ActivityMeditationOnlineClassPlayBinding) ((BaseVBActivity) OnlineClassPlayActivity.this).binding).animLoading.setVisibility(8);
        }
    }

    class b implements Player.Listener {
        b() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            j3.a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i8) {
            j3.b(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            j3.c(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            j3.d(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            j3.f(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i8, boolean z7) {
            j3.g(this, i8, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            j3.h(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z7) {
            j3.i(this, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z7) {
            j3.j(this, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z7) {
            j3.k(this, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j8) {
            j3.l(this, j8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i8) {
            j3.m(this, mediaItem, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            j3.n(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            j3.o(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z7, int i8) {
            j3.p(this, z7, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            j3.q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i8) {
            j3.r(this, i8);
            if (i8 == 4) {
                OnlineClassPlayActivity.this.audioPlayerUI.stop();
                OnlineClassPlayActivity onlineClassPlayActivity = OnlineClassPlayActivity.this;
                OnlineClassDoneActivity.start(onlineClassPlayActivity, onlineClassPlayActivity.onlineClassBean, OnlineClassPlayActivity.this.startTimestamp);
                OnlineClassPlayActivity.this.finish();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i8) {
            j3.s(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            j3.t(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            j3.u(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z7, int i8) {
            j3.v(this, z7, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            j3.w(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i8) {
            j3.x(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            j3.z(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i8) {
            j3.A(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j8) {
            j3.B(this, j8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j8) {
            j3.C(this, j8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z7) {
            j3.D(this, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z7) {
            j3.E(this, z7);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i8, int i9) {
            j3.F(this, i8, i9);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i8) {
            j3.G(this, timeline, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            j3.H(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            j3.I(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            j3.J(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f8) {
            j3.K(this, f8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            j3.e(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i8) {
            j3.y(this, positionInfo, positionInfo2, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playClass$1(View view) {
        resumeClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playClass$2(View view) {
        pauseClass();
    }

    private void pauseClass() {
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.pause();
        }
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).animPlaying.pauseAnimation();
    }

    private void playClass(File file) {
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).tvLoadingTips.setVisibility(8);
        com.moyoung.classes.meditation.c cVar = new com.moyoung.classes.meditation.c(this, ((ActivityMeditationOnlineClassPlayBinding) this.binding).playerController);
        this.audioPlayerUI = cVar;
        cVar.setAudioWithFile(file);
        this.audioPlayerUI.setIsRepeat(false);
        this.audioPlayerUI.play();
        this.audioPlayerUI.getAudioPlayer().addListener(new b());
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).playerController.findViewById(R$id.exo_play).setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassPlayActivity.this.lambda$playClass$1(view);
            }
        });
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).playerController.findViewById(R$id.exo_pause).setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassPlayActivity.this.lambda$playClass$2(view);
            }
        });
    }

    private void resumeClass() {
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.play();
        }
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).animPlaying.playAnimation();
    }

    public static void start(Context context, OnlineClassBean onlineClassBean) {
        Intent intent = new Intent(context, (Class<?>) OnlineClassPlayActivity.class);
        intent.putExtra(OnlineClassBean.class.getName(), onlineClassBean);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        getWindow().addFlags(128);
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassPlayActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        OnlineClassBean onlineClassBean = (OnlineClassBean) getIntent().getSerializableExtra(OnlineClassBean.class.getName());
        this.onlineClassBean = onlineClassBean;
        if (onlineClassBean == null) {
            finish();
            return;
        }
        com.moyoung.dafit.module.common.imageload.c.load(((ActivityMeditationOnlineClassPlayBinding) this.binding).ivBg, onlineClassBean.getBigImgUrl(), R$drawable.shape_net_img_placeholder, c5.d.getScreenWidth(this), c5.d.getScreenHeight(this));
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).animLoading.setAnimation(R$raw.anim_circle_loading);
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).animLoading.playAnimation();
        ((ActivityMeditationOnlineClassPlayBinding) this.binding).animLoading.addAnimatorListener(new a());
        File onlineClassAudioFile = OnlineClassDetailActivity.getOnlineClassAudioFile(getApplicationContext(), this.onlineClassBean.getAudioUrl());
        if (onlineClassAudioFile.exists()) {
            playClass(onlineClassAudioFile);
            this.isPlayed = true;
        }
        this.startTimestamp = System.currentTimeMillis();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(128);
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.stop();
            this.audioPlayerUI.release();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        pauseClass();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.isPlayed) {
            resumeClass();
        }
    }
}
