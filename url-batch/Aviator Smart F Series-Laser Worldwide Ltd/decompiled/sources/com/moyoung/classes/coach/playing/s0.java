package com.moyoung.classes.coach.playing;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
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
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.video.VideoSize;
import com.moyoung.classes.R$color;
import com.moyoung.classes.R$id;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.CoachActionPlayedBean;
import com.moyoung.classes.databinding.ActivityCoachCoursePlayingBinding;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class s0 {
    private static final String TAG = "ClassVideoPlayerUI";
    private List<CoachActionBean> actionList;
    private long actionPlayedMs;
    private final ActivityCoachCoursePlayingBinding binding;
    private final com.moyoung.classes.coach.playing.d coachAudioPlayer;
    public final f0 coachVideoPlayer;
    private final Context context;
    private com.moyoung.dafit.module.common.widgets.d countdownTimer;
    private String courseDirName;
    private long coursePlayedMs;
    private int currentActionIndex;
    private int currentVideoPlayedCount;
    private long currentVideoPlayedMs;
    private e onCoursePlayingCallback;
    public ExoPlayer videoPlayer;
    private boolean isCountdownPlayed = false;
    private boolean canRecordVideoPlayedCount = false;
    protected final List<CoachActionPlayedBean> actionPlayedList = new ArrayList();

    class a implements Player.Listener {
        final /* synthetic */ List val$countdownUriList;

        a(List list) {
            this.val$countdownUriList = list;
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
            if (i8 != 4) {
                return;
            }
            if (this.val$countdownUriList.size() != 0) {
                s0.this.playCountdownAudio(this.val$countdownUriList);
                s0.this.showCountdownUI();
            } else {
                s0.this.coachAudioPlayer.audioPlayer.removeListener(this);
                s0 s0Var = s0.this;
                s0Var.playActionVideoWithCanRecordPlayedCount(s0Var.getCurrentActionBean());
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
        public void onIsPlayingChanged(boolean z7) {
            j3.j(this, z7);
            if (z7) {
                s0.this.binding.videoHandlePort.ivPause.setVisibility(0);
                s0.this.binding.videoHandlePort.ivPlay.setVisibility(8);
                s0.this.binding.ivPauseLand.setVisibility(0);
                s0.this.binding.ivPlayLand.setVisibility(8);
                return;
            }
            s0.this.binding.videoHandlePort.ivPause.setVisibility(8);
            s0.this.binding.videoHandlePort.ivPlay.setVisibility(0);
            s0.this.binding.ivPauseLand.setVisibility(8);
            s0.this.binding.ivPlayLand.setVisibility(0);
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
            Log.d("onPlaybackStateChanged", "Duration=" + s0.this.videoPlayer.getContentDuration() + ",playbackState=" + i8);
            if (i8 != 4 || s0.this.videoPlayer.getContentDuration() <= 0) {
                return;
            }
            s0.this.onCoursePlayingCallback.onActionCompleted(s0.this.getCurrentActionBean(), c5.a.getActionSourcePath(s0.this.context, s0.this.getCurrentActionBean().getRestAudio(), s0.this.courseDirName), s0.this.binding.segmentVideoTimeBar.getSegmentTimeList(), s0.this.binding.segmentVideoTimeBar.getProgress(), s0.this.binding.segmentVideoTimeBar.getMax());
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i8) {
            j3.s(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(@NonNull PlaybackException playbackException) {
            j3.t(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            j3.u(this, playbackException);
            if (playbackException != null) {
                Log.d(s0.TAG, playbackException.getMessage() + ", code=" + playbackException.errorCode);
            }
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
        public void onPositionDiscontinuity(@NonNull Player.PositionInfo positionInfo, @NonNull Player.PositionInfo positionInfo2, int i8) {
            j3.y(this, positionInfo, positionInfo2, i8);
            Log.d("onPositionDiscontinuity", "reason=" + i8);
            if (s0.this.isCountdownPlayed && i8 == 0) {
                s0.this.canRecordVideoPlayedCount = true;
                s0.access$608(s0.this);
                s0.this.onCoursePlayingCallback.onActionPlayedCount(s0.this.currentVideoPlayedCount);
                if (s0.this.currentVideoPlayedCount >= s0.this.getCurrentActionBean().getRepeatCount()) {
                    s0.this.videoPlayer.setRepeatMode(0);
                }
            }
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ View val$view;

        c(View view) {
            this.val$view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$view.setAlpha(1.0f);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ View val$view;

        d(View view) {
            this.val$view = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$view.setVisibility(8);
        }
    }

    public interface e {
        void onActionCompleted(CoachActionBean coachActionBean, String str, List<Integer> list, int i8, int i9);

        void onActionContinued();

        void onActionPaused(CoachActionBean coachActionBean);

        void onActionPlayedCount(int i8);

        void onCourseCompleted();

        void onPlaying(long j8);

        void onStart(String str, int i8, int i9);
    }

    public s0(Context context, ActivityCoachCoursePlayingBinding activityCoachCoursePlayingBinding) {
        this.binding = activityCoachCoursePlayingBinding;
        this.context = context;
        f0 f0Var = new f0(context, activityCoachCoursePlayingBinding.videoView, activityCoachCoursePlayingBinding.playerController);
        this.coachVideoPlayer = f0Var;
        this.coachAudioPlayer = new com.moyoung.classes.coach.playing.d(context);
        this.videoPlayer = f0Var.videoPlayer;
        initView();
        initListener();
    }

    static /* synthetic */ int access$608(s0 s0Var) {
        int i8 = s0Var.currentVideoPlayedCount;
        s0Var.currentVideoPlayedCount = i8 + 1;
        return i8;
    }

    private void addActionPlayedMsToList() {
        this.actionPlayedList.add(new CoachActionPlayedBean(getCurrentActionBean().getId(), this.currentActionIndex, getCurrentActionBean().getTitle(), getCurrentActionBean().getNameLanguageList(), this.actionPlayedMs));
    }

    private void addBgAudio2Player(CoachActionBean coachActionBean) {
        ExoPlayer exoPlayer = this.coachAudioPlayer.bgAudioPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        } else {
            this.coachAudioPlayer.setBgAudioUri(c5.a.getActionSourceUri(this.context, coachActionBean.getBgAudio(), this.courseDirName));
        }
    }

    private void addExplainAudio2Player(CoachActionBean coachActionBean) {
        Uri actionSourceUri = c5.a.getActionSourceUri(this.context, coachActionBean.getExplainAudio(), this.courseDirName);
        if (actionSourceUri != null) {
            this.coachAudioPlayer.setAudioUri(actionSourceUri);
        }
    }

    private void addVideo2Player(CoachActionBean coachActionBean) {
        this.coachVideoPlayer.stop();
        ExoPlayer exoPlayer = this.videoPlayer;
        exoPlayer.removeMediaItems(0, exoPlayer.getMediaItemCount());
        Uri actionSourceUri = c5.a.getActionSourceUri(this.context, coachActionBean.getActionVideo(), this.courseDirName);
        if (actionSourceUri == null) {
            Log.d(TAG, "addVideo2Player=videoUriList.size()=0");
            playNextAction();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(actionSourceUri);
        this.coachVideoPlayer.setVideoItemList(arrayList);
        this.videoPlayer.setRepeatMode(2);
        Log.d(TAG, "addVideo2Player=" + arrayList.size());
    }

    private void executeNextClick() {
        addActionPlayedMsToList();
        int i8 = this.currentActionIndex + 1;
        this.currentActionIndex = i8;
        skip2ActionStartPosition(i8);
        playOneAction();
    }

    private void executePauseClick() {
        this.videoPlayer.pause();
        this.coachAudioPlayer.pauseAudio();
        this.coachAudioPlayer.pauseBgAudio();
        com.moyoung.dafit.module.common.widgets.d dVar = this.countdownTimer;
        if (dVar != null) {
            dVar.cancel();
        }
        this.onCoursePlayingCallback.onActionPaused(this.actionList.get(this.currentActionIndex));
    }

    private List<Uri> getCountdownAudio(CoachActionBean coachActionBean) {
        ArrayList arrayList = new ArrayList();
        Uri actionSourceUri = c5.a.getActionSourceUri(this.context, coachActionBean.getActionNameAudio(), this.courseDirName);
        if (actionSourceUri != null) {
            arrayList.add(actionSourceUri);
        }
        Uri actionSourceUri2 = c5.a.getActionSourceUri(this.context, coachActionBean.getCountdownAudio(), this.courseDirName);
        if (actionSourceUri2 != null) {
            arrayList.add(actionSourceUri2);
        }
        return arrayList;
    }

    private void hideViewWithAnim(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d(view));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void initListener() {
        this.binding.videoHandlePort.ivPause.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$2(view);
            }
        });
        this.binding.ivPauseLand.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$3(view);
            }
        });
        this.binding.videoHandlePort.ivPlay.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$4(view);
            }
        });
        this.binding.ivPlayLand.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$5(view);
            }
        });
        this.binding.videoHandlePort.ivNext.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$6(view);
            }
        });
        this.binding.ivNextLand.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$7(view);
            }
        });
        this.binding.videoHandlePort.ivPrev.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$8(view);
            }
        });
        this.binding.ivPrevLand.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.this.lambda$initListener$9(view);
            }
        });
        this.videoPlayer.addListener(new b());
        this.binding.playerController.findViewById(R$id.exo_controller).setVisibility(4);
        this.binding.playerController.setProgressUpdateListener(new PlayerControlView.ProgressUpdateListener() { // from class: com.moyoung.classes.coach.playing.r0
            @Override // com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener
            public final void onProgressUpdate(long j8, long j9) {
                s0.this.lambda$initListener$10(j8, j9);
            }
        });
        this.binding.videoView.findViewById(R$id.rl_exo_controller).setVisibility(4);
        this.binding.videoView.setControllerVisibilityListener(new PlayerControlView.VisibilityListener() { // from class: com.moyoung.classes.coach.playing.h0
            @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
            public final void onVisibilityChange(int i8) {
                s0.this.lambda$initListener$11(i8);
            }
        });
    }

    private void initView() {
        Resources resources = this.binding.circleProgressBar.getResources();
        this.binding.circleProgressBar.setTextColor(resources.getColor(R$color.translucent));
        this.binding.circleProgressBar.setColor(resources.getColor(R$color.class_assist_1));
        this.binding.circleProgressBar.setProgressBgColor(resources.getColor(R$color.bg_1_ff));
        this.binding.circleProgressBar.setValueWidthPercent(20.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$10(long j8, long j9) {
        if (!this.canRecordVideoPlayedCount) {
            this.currentVideoPlayedMs = j8;
            return;
        }
        if (j8 < this.currentVideoPlayedMs) {
            this.currentVideoPlayedMs = 0L;
        }
        long j10 = j8 - this.currentVideoPlayedMs;
        this.currentVideoPlayedMs = j8;
        long j11 = this.coursePlayedMs + j10;
        this.coursePlayedMs = j11;
        this.actionPlayedMs += j10;
        this.binding.segmentVideoTimeBar.setProgress((int) j11);
        this.binding.videoHandlePort.progressBar.setProgress((int) this.actionPlayedMs);
        CircleDisplayView circleDisplayView = this.binding.circleProgressBar;
        circleDisplayView.showValue(this.actionPlayedMs, circleDisplayView.getMaxValue());
        this.onCoursePlayingCallback.onPlaying(this.actionPlayedMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$11(int i8) {
        if (this.binding.viewSwitchToPort.getVisibility() == 0) {
            this.binding.rlVideoHandleLandBtn.setVisibility(0);
            if (i8 == 0) {
                showViewWithAnim(this.binding.ivPrevLand);
                showViewWithAnim(this.binding.ivNextLand);
            } else {
                hideViewWithAnim(this.binding.ivPrevLand);
                hideViewWithAnim(this.binding.ivNextLand);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        executePauseClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(View view) {
        executePauseClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(View view) {
        executeContinueClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(View view) {
        executeContinueClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        executeNextClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$7(View view) {
        executeNextClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$8(View view) {
        executePrevClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$9(View view) {
        executePrevClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playActionList$0() {
        this.videoPlayer.setPlayWhenReady(true);
        playOneAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playNextAction$1() {
        this.videoPlayer.setPlayWhenReady(true);
        playOneAction();
    }

    private void playActionCountdown(List<Uri> list) {
        playCountdownAudio(list);
        this.coachAudioPlayer.audioPlayer.addListener(new a(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playActionVideoWithCanRecordPlayedCount(CoachActionBean coachActionBean) {
        this.isCountdownPlayed = true;
        addExplainAudio2Player(coachActionBean);
        this.coachAudioPlayer.startAudioPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playCountdownAudio(List<Uri> list) {
        this.coachAudioPlayer.setAudioUri(list.get(0));
        this.coachAudioPlayer.startAudioPlayer();
        list.remove(0);
    }

    private void playOneAction() {
        com.moyoung.dafit.module.common.widgets.d dVar = this.countdownTimer;
        if (dVar != null) {
            dVar.cancel();
        }
        if (this.currentActionIndex >= this.actionList.size()) {
            this.onCoursePlayingCallback.onCourseCompleted();
            return;
        }
        if (this.currentActionIndex < 0) {
            this.currentActionIndex = 0;
        }
        this.actionPlayedMs = 0L;
        this.currentVideoPlayedCount = 0;
        this.isCountdownPlayed = false;
        this.canRecordVideoPlayedCount = false;
        CoachActionBean currentActionBean = getCurrentActionBean();
        this.onCoursePlayingCallback.onStart(currentActionBean.getTitle(), this.currentActionIndex, this.actionList.size());
        this.onCoursePlayingCallback.onActionPlayedCount(this.currentVideoPlayedCount);
        showActionProgressBar(currentActionBean);
        addVideo2Player(currentActionBean);
        this.coachVideoPlayer.playVideo();
        List<Uri> countdownAudio = getCountdownAudio(currentActionBean);
        if (countdownAudio.size() == 0) {
            playActionVideoWithCanRecordPlayedCount(currentActionBean);
        } else {
            playActionCountdown(countdownAudio);
        }
    }

    private void showActionProgressBar(CoachActionBean coachActionBean) {
        long actionDurationMs = coachActionBean.getActionDurationMs();
        this.binding.videoHandlePort.progressBar.setMax((int) actionDurationMs);
        this.binding.videoHandlePort.progressBar.setProgress(0);
        this.binding.circleProgressBar.showValue(0.0f, actionDurationMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCountdownUI() {
        com.moyoung.dafit.module.common.widgets.d dVar = this.countdownTimer;
        if (dVar == null) {
            this.countdownTimer = new com.moyoung.dafit.module.common.widgets.d(3, 800);
        } else {
            dVar.cancel();
        }
        this.countdownTimer.setTextView(this.binding.tvCountdown);
        this.countdownTimer.setShowGo(false);
        this.countdownTimer.start();
    }

    private void showCourseProgressBar(List<CoachActionBean> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoachActionBean> it = list.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            long actionDurationMs = it.next().getActionDurationMs();
            j8 += actionDurationMs;
            arrayList.add(Integer.valueOf((int) actionDurationMs));
        }
        this.binding.segmentVideoTimeBar.setSegmentColorRes(R$color.black);
        this.binding.segmentVideoTimeBar.showSegment(arrayList);
        this.binding.segmentVideoTimeBar.setMax((int) j8);
    }

    private void showViewWithAnim(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new c(view));
        view.setVisibility(0);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void skip2ActionStartPosition(int i8) {
        if (i8 >= this.actionList.size()) {
            return;
        }
        this.coursePlayedMs = 0L;
        for (int i9 = 0; i9 <= i8 - 1; i9++) {
            this.coursePlayedMs += this.actionList.get(i9).getActionDurationMs();
        }
        this.binding.segmentVideoTimeBar.setProgress((int) this.coursePlayedMs);
    }

    public void addUnPlayActionPlayedMsToList() {
        if (this.currentActionIndex >= this.actionList.size() - 1) {
            return;
        }
        int i8 = this.currentActionIndex;
        while (true) {
            i8++;
            if (i8 >= this.actionList.size()) {
                return;
            }
            CoachActionBean coachActionBean = this.actionList.get(i8);
            this.actionPlayedList.add(new CoachActionPlayedBean(coachActionBean.getId(), i8, coachActionBean.getTitle(), coachActionBean.getNameLanguageList(), 0L));
        }
    }

    void executeContinueClick() {
        this.videoPlayer.play();
        this.coachAudioPlayer.resumeAudio();
        this.coachAudioPlayer.resumeBgAudio();
        this.onCoursePlayingCallback.onActionContinued();
    }

    public void executePrevClick() {
        addActionPlayedMsToList();
        int i8 = this.currentActionIndex - 1;
        this.currentActionIndex = i8;
        skip2ActionStartPosition(i8);
        playOneAction();
    }

    public String getActionPlayedPercent() {
        return (this.currentActionIndex + 1) + "/" + this.actionList.size();
    }

    public CoachActionBean getCurrentActionBean() {
        if (this.currentActionIndex < this.actionList.size()) {
            return this.actionList.get(this.currentActionIndex);
        }
        return this.actionList.get(r0.size() - 1);
    }

    public CoachActionBean getNextActionBean() {
        if (this.currentActionIndex < this.actionList.size() - 1) {
            return this.actionList.get(this.currentActionIndex + 1);
        }
        return null;
    }

    public void pause() {
        this.coachVideoPlayer.pause();
        com.moyoung.classes.coach.playing.d dVar = this.coachAudioPlayer;
        if (dVar != null) {
            dVar.pauseAudio();
            this.coachAudioPlayer.pauseBgAudio();
        }
    }

    public void playActionList(String str, List<CoachActionBean> list) {
        this.courseDirName = com.moyoung.dafit.module.common.utils.g0.getFileNameSuffixlessFromUrl(str);
        this.actionList = list;
        showCourseProgressBar(list);
        this.binding.videoView.postDelayed(new Runnable() { // from class: com.moyoung.classes.coach.playing.i0
            @Override // java.lang.Runnable
            public final void run() {
                s0.this.lambda$playActionList$0();
            }
        }, 500L);
    }

    public void playNextAction() {
        com.moyoung.dafit.module.common.widgets.d dVar = this.countdownTimer;
        if (dVar != null) {
            dVar.cancel();
        }
        addActionPlayedMsToList();
        this.currentActionIndex++;
        this.binding.videoView.postDelayed(new Runnable() { // from class: com.moyoung.classes.coach.playing.g0
            @Override // java.lang.Runnable
            public final void run() {
                s0.this.lambda$playNextAction$1();
            }
        }, 200L);
    }

    public void release() {
        this.coachVideoPlayer.release();
        com.moyoung.dafit.module.common.widgets.d dVar = this.countdownTimer;
        if (dVar != null) {
            dVar.cancel();
        }
        com.moyoung.classes.coach.playing.d dVar2 = this.coachAudioPlayer;
        if (dVar2 != null) {
            dVar2.release();
        }
    }

    public void resume() {
        this.coachVideoPlayer.playVideo();
        com.moyoung.classes.coach.playing.d dVar = this.coachAudioPlayer;
        if (dVar != null) {
            dVar.resumeAudio();
            this.coachAudioPlayer.resumeBgAudio();
        }
    }

    public void setOnVideoPlayingCallback(e eVar) {
        this.onCoursePlayingCallback = eVar;
    }

    public void stop() {
        this.coachVideoPlayer.stop();
        com.moyoung.classes.coach.playing.d dVar = this.coachAudioPlayer;
        if (dVar != null) {
            dVar.stopAudio();
            this.coachAudioPlayer.stopBgAudio();
        }
    }
}
