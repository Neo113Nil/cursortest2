package com.moyoung.instructions.widgets;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.DefaultRenderersFactory;
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
import com.google.android.exoplayer2.video.VideoSize;
import com.moyoung.instructions.R$drawable;
import com.moyoung.instructions.R$id;
import com.moyoung.instructions.R$layout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class VideoPagerComponent extends LinearLayout {
    private ExoPlayer currentPlayer;
    private LinearLayout indicatorContainer;
    private int previousPosition;
    private final List<Uri> videoUris;
    private ViewPager2 viewPager;

    private static class VideoAdapter extends RecyclerView.Adapter {
        List<Uri> videoUri;

        public static class VideoViewHolder extends RecyclerView.ViewHolder {
            private ExoPlayer player;
            private final TextureView playerView;

            class a implements Player.Listener {
                a() {
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
                public /* synthetic */ void onPlaybackStateChanged(int i8) {
                    j3.r(this, i8);
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
                public void onVideoSizeChanged(VideoSize videoSize) {
                    j3.J(this, videoSize);
                    VideoViewHolder.this.adjustTextureViewSize(videoSize.width, videoSize.height);
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

            public VideoViewHolder(@NonNull View view) {
                super(view);
                this.playerView = (TextureView) view.findViewById(R$id.player_view);
                initializePlayer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void adjustTextureViewSize(int i8, int i9) {
                if (i8 == 0 || i9 == 0) {
                    return;
                }
                float f8 = i8 / i9;
                int i10 = this.playerView.getContext().getResources().getDisplayMetrics().widthPixels;
                ViewGroup.LayoutParams layoutParams = this.playerView.getLayoutParams();
                layoutParams.width = i10;
                layoutParams.height = (int) (i10 / f8);
                this.playerView.setLayoutParams(layoutParams);
            }

            private void initializePlayer() {
                if (this.player == null) {
                    this.player = new ExoPlayer.Builder(this.playerView.getContext()).build();
                    ExoPlayer build = new ExoPlayer.Builder(this.playerView.getContext()).setRenderersFactory(new DefaultRenderersFactory(this.playerView.getContext()).setEnableDecoderFallback(true)).build();
                    this.player = build;
                    build.setVideoTextureView(this.playerView);
                    this.player.setRepeatMode(0);
                    this.player.prepare();
                    this.player.addListener(new a());
                }
            }

            public void bind(Uri uri) {
                this.player.setMediaItem(MediaItem.fromUri(uri));
            }

            public ExoPlayer getPlayer() {
                return this.player;
            }
        }

        VideoAdapter(List<Uri> list) {
            ArrayList arrayList = new ArrayList();
            this.videoUri = arrayList;
            arrayList.addAll(list);
            Log.d("instruct-module", "VideoAdapter:videoUris" + list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.videoUri.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int i8) {
            videoViewHolder.bind(this.videoUri.get(i8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
            return new VideoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_video_exoplayer, viewGroup, false));
        }
    }

    class a extends ViewPager2.OnPageChangeCallback {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i8) {
            VideoPagerComponent.this.updateIndicators(i8);
            VideoPagerComponent videoPagerComponent = VideoPagerComponent.this;
            videoPagerComponent.playVideoAt(i8, videoPagerComponent.previousPosition);
            VideoPagerComponent.this.previousPosition = i8;
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
        public /* synthetic */ void onPlaybackStateChanged(int i8) {
            j3.r(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i8) {
            j3.s(this, i8);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            j3.t(this, playbackException);
            Log.d("instruct-module", "playVideoAt:Error: errorCode: " + playbackException.errorCode);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            j3.u(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerStateChanged(boolean z7, int i8) {
            if (i8 == 3) {
                Log.d("instruct-module", "playVideoAt:playWhenReady" + z7 + " playbackState: " + i8);
                VideoPagerComponent.this.currentPlayer.setPlayWhenReady(true);
            }
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

    public VideoPagerComponent(@NonNull Context context) {
        super(context);
        this.videoUris = new ArrayList();
        this.previousPosition = -1;
        init();
    }

    private void createIndicators(int i8) {
        this.indicatorContainer.removeAllViews();
        for (int i9 = 0; i9 < i8; i9++) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(16, 16);
            layoutParams.setMargins(12, 0, 12, 0);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R$drawable.indicator_inactive);
            this.indicatorContainer.addView(view);
        }
        updateIndicators(0);
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R$layout.video_pager, (ViewGroup) this, true);
        this.viewPager = (ViewPager2) findViewById(R$id.viewPager);
        this.indicatorContainer = (LinearLayout) findViewById(R$id.indicatorContainer);
        setupViewPager();
        createIndicators(this.videoUris.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideoAt$0() {
        this.viewPager.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playVideoAt(int i8, int i9) {
        if (this.currentPlayer != null && i9 != -1 && i9 != i8) {
            Log.d("instruct-module", ":playVideoAt:Pausing current player at position: " + i9);
            this.currentPlayer.setPlayWhenReady(false);
            this.currentPlayer.seekTo(0L);
            this.currentPlayer.pause();
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = ((RecyclerView) this.viewPager.getChildAt(0)).findViewHolderForAdapterPosition(i8);
        if (findViewHolderForAdapterPosition instanceof VideoAdapter.VideoViewHolder) {
            VideoAdapter.VideoViewHolder videoViewHolder = (VideoAdapter.VideoViewHolder) findViewHolderForAdapterPosition;
            ExoPlayer player = videoViewHolder.getPlayer();
            this.currentPlayer = player;
            if (player == null) {
                Log.d("instruct-module", ":playVideoAtError: currentPlayer is null at position: " + i8);
                return;
            }
            Log.d("instruct-module", "playVideoAt:Playing video at position: " + i8);
            this.currentPlayer.addListener(new b());
            this.currentPlayer.prepare();
            videoViewHolder.playerView.post(new Runnable() { // from class: com.moyoung.instructions.widgets.c
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPagerComponent.this.lambda$playVideoAt$0();
                }
            });
        }
    }

    private void releaseAllPlayer() {
        ExoPlayer player;
        if (this.viewPager.getAdapter() != null) {
            RecyclerView recyclerView = (RecyclerView) this.viewPager.getChildAt(0);
            for (int i8 = 0; i8 < this.viewPager.getAdapter().getItemCount(); i8++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
                if ((findViewHolderForAdapterPosition instanceof VideoAdapter.VideoViewHolder) && (player = ((VideoAdapter.VideoViewHolder) findViewHolderForAdapterPosition).getPlayer()) != null) {
                    player.stop();
                    player.release();
                    System.gc();
                }
            }
        }
    }

    private void setupViewPager() {
        this.viewPager.setAdapter(new VideoAdapter(this.videoUris));
        this.viewPager.setOffscreenPageLimit(2);
        this.viewPager.registerOnPageChangeCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIndicators(int i8) {
        int i9 = 0;
        while (i9 < this.indicatorContainer.getChildCount()) {
            this.indicatorContainer.getChildAt(i9).setBackgroundResource(i9 == i8 ? R$drawable.indicator_active : R$drawable.indicator_inactive);
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        releaseAllPlayer();
    }

    public VideoPagerComponent(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoUris = new ArrayList();
        this.previousPosition = -1;
        init();
    }

    public VideoPagerComponent(@NonNull Context context, List<Uri> list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.videoUris = arrayList;
        this.previousPosition = -1;
        arrayList.clear();
        arrayList.addAll(list);
        init();
    }
}
