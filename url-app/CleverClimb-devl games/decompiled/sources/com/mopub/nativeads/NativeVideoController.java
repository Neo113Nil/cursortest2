package com.mopub.nativeads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.RepeatingHandlerRunnable;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.VastVideoConfig;
import com.mopub.nativeads.VisibilityTracker;
import com.mopub.network.TrackingRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class NativeVideoController implements AudioManager.OnAudioFocusChangeListener, ExoPlayer.EventListener {
    private static final int BUFFER_SEGMENT_COUNT = 32;
    private static final int BUFFER_SEGMENT_SIZE = 65536;
    public static final long RESUME_FINISHED_THRESHOLD = 750;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_CLEARED = 5;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    private static final Map<Long, NativeVideoController> sManagerMap = new HashMap(4);
    private boolean mAppAudioEnabled;
    private boolean mAudioEnabled;
    private AudioManager mAudioManager;
    private MediaCodecAudioRenderer mAudioRenderer;
    private final Context mContext;
    private volatile ExoPlayer mExoPlayer;
    private boolean mExoPlayerStateStartedFromIdle;
    private BitmapDrawable mFinalFrame;
    private final Handler mHandler;
    private Listener mListener;
    private final MoPubExoPlayerFactory mMoPubExoPlayerFactory;
    private NativeVideoProgressRunnable mNativeVideoProgressRunnable;
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private WeakReference<Object> mOwnerRef;
    private boolean mPlayWhenReady;
    private int mPreviousExoPlayerState;
    private Surface mSurface;
    private TextureView mTextureView;
    private VastVideoConfig mVastVideoConfig;
    private MediaCodecVideoRenderer mVideoRenderer;

    public interface Listener {
        void onError(Exception exc);

        void onStateChanged(boolean z, int i);
    }

    public void onLoadingChanged(boolean z) {
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    public void onPositionDiscontinuity() {
    }

    public void onTimelineChanged(Timeline timeline, Object obj) {
    }

    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public static NativeVideoController createForId(long j, Context context, List<VisibilityTrackingEvent> list, VastVideoConfig vastVideoConfig) {
        NativeVideoController nativeVideoController = new NativeVideoController(context, list, vastVideoConfig);
        sManagerMap.put(Long.valueOf(j), nativeVideoController);
        return nativeVideoController;
    }

    @VisibleForTesting
    public static NativeVideoController createForId(long j, Context context, VastVideoConfig vastVideoConfig, NativeVideoProgressRunnable nativeVideoProgressRunnable, MoPubExoPlayerFactory moPubExoPlayerFactory, AudioManager audioManager) {
        NativeVideoController nativeVideoController = new NativeVideoController(context, vastVideoConfig, nativeVideoProgressRunnable, moPubExoPlayerFactory, audioManager);
        sManagerMap.put(Long.valueOf(j), nativeVideoController);
        return nativeVideoController;
    }

    @VisibleForTesting
    public static void setForId(long j, NativeVideoController nativeVideoController) {
        sManagerMap.put(Long.valueOf(j), nativeVideoController);
    }

    public static NativeVideoController getForId(long j) {
        return sManagerMap.get(Long.valueOf(j));
    }

    public static NativeVideoController remove(long j) {
        return sManagerMap.remove(Long.valueOf(j));
    }

    private NativeVideoController(Context context, List<VisibilityTrackingEvent> list, VastVideoConfig vastVideoConfig) {
        this(context, vastVideoConfig, new NativeVideoProgressRunnable(context, new Handler(Looper.getMainLooper()), list, vastVideoConfig), new MoPubExoPlayerFactory(), (AudioManager) context.getSystemService("audio"));
    }

    private NativeVideoController(Context context, VastVideoConfig vastVideoConfig, NativeVideoProgressRunnable nativeVideoProgressRunnable, MoPubExoPlayerFactory moPubExoPlayerFactory, AudioManager audioManager) {
        this.mPreviousExoPlayerState = 1;
        this.mExoPlayerStateStartedFromIdle = true;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(vastVideoConfig);
        Preconditions.checkNotNull(moPubExoPlayerFactory);
        Preconditions.checkNotNull(audioManager);
        this.mContext = context.getApplicationContext();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mVastVideoConfig = vastVideoConfig;
        this.mNativeVideoProgressRunnable = nativeVideoProgressRunnable;
        this.mMoPubExoPlayerFactory = moPubExoPlayerFactory;
        this.mAudioManager = audioManager;
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setProgressListener(NativeVideoProgressRunnable.ProgressListener progressListener) {
        this.mNativeVideoProgressRunnable.setProgressListener(progressListener);
    }

    public void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    public void setPlayWhenReady(boolean z) {
        if (this.mPlayWhenReady == z) {
            return;
        }
        this.mPlayWhenReady = z;
        setExoPlayWhenReady();
    }

    public int getPlaybackState() {
        if (this.mExoPlayer == null) {
            return 5;
        }
        return this.mExoPlayer.getPlaybackState();
    }

    public void setAudioEnabled(boolean z) {
        this.mAudioEnabled = z;
        setExoAudio();
    }

    public void setAppAudioEnabled(boolean z) {
        if (this.mAppAudioEnabled == z) {
            return;
        }
        this.mAppAudioEnabled = z;
        if (this.mAppAudioEnabled) {
            this.mAudioManager.requestAudioFocus(this, 3, 1);
        } else {
            this.mAudioManager.abandonAudioFocus(this);
        }
    }

    public void setAudioVolume(float f) {
        if (this.mAudioEnabled) {
            setExoAudio(f);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (this.mOnAudioFocusChangeListener == null) {
            return;
        }
        this.mOnAudioFocusChangeListener.onAudioFocusChange(i);
    }

    public void setTextureView(TextureView textureView) {
        Preconditions.checkNotNull(textureView);
        this.mSurface = new Surface(textureView.getSurfaceTexture());
        this.mTextureView = textureView;
        this.mNativeVideoProgressRunnable.setTextureView(this.mTextureView);
        setExoSurface(this.mSurface);
    }

    public void prepare(Object obj) {
        Preconditions.checkNotNull(obj);
        this.mOwnerRef = new WeakReference<>(obj);
        clearExistingPlayer();
        preparePlayer();
        setExoSurface(this.mSurface);
    }

    public void clear() {
        setPlayWhenReady(false);
        this.mSurface = null;
        clearExistingPlayer();
    }

    public void release(Object obj) {
        Preconditions.checkNotNull(obj);
        if ((this.mOwnerRef == null ? null : this.mOwnerRef.get()) == obj) {
            clearExistingPlayer();
        }
    }

    public void onPlayerStateChanged(boolean z, int i) {
        if (i == 4 && this.mFinalFrame == null) {
            if (this.mExoPlayer == null || this.mSurface == null || this.mTextureView == null) {
                MoPubLog.w("onPlayerStateChanged called afer view has been recycled.");
                return;
            } else {
                this.mFinalFrame = new BitmapDrawable(this.mContext.getResources(), this.mTextureView.getBitmap());
                this.mNativeVideoProgressRunnable.requestStop();
            }
        }
        this.mPreviousExoPlayerState = i;
        if (i == 3) {
            this.mExoPlayerStateStartedFromIdle = false;
        } else if (i == 1) {
            this.mExoPlayerStateStartedFromIdle = true;
        }
        if (this.mListener != null) {
            this.mListener.onStateChanged(z, i);
        }
    }

    public void seekTo(long j) {
        if (this.mExoPlayer == null) {
            return;
        }
        this.mExoPlayer.seekTo(j);
        this.mNativeVideoProgressRunnable.seekTo(j);
    }

    public long getCurrentPosition() {
        return this.mNativeVideoProgressRunnable.getCurrentPosition();
    }

    public long getDuration() {
        return this.mNativeVideoProgressRunnable.getDuration();
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        if (this.mListener == null) {
            return;
        }
        this.mListener.onError(exoPlaybackException);
        this.mNativeVideoProgressRunnable.requestStop();
    }

    public void handleCtaClick(Context context) {
        triggerImpressionTrackers();
        this.mVastVideoConfig.handleClickWithoutResult(context, 0);
    }

    public boolean hasFinalFrame() {
        return this.mFinalFrame != null;
    }

    public Drawable getFinalFrame() {
        return this.mFinalFrame;
    }

    void triggerImpressionTrackers() {
        this.mNativeVideoProgressRunnable.checkImpressionTrackers(true);
    }

    private void clearExistingPlayer() {
        if (this.mExoPlayer == null) {
            return;
        }
        setExoSurface(null);
        this.mExoPlayer.stop();
        this.mExoPlayer.release();
        this.mExoPlayer = null;
        this.mNativeVideoProgressRunnable.stop();
        this.mNativeVideoProgressRunnable.setExoPlayer(null);
    }

    private void preparePlayer() {
        if (this.mExoPlayer == null) {
            this.mVideoRenderer = new MediaCodecVideoRenderer(this.mContext, MediaCodecSelector.DEFAULT, 0L, this.mHandler, (VideoRendererEventListener) null, 10);
            this.mAudioRenderer = new MediaCodecAudioRenderer(MediaCodecSelector.DEFAULT);
            this.mExoPlayer = this.mMoPubExoPlayerFactory.newInstance(new Renderer[]{this.mVideoRenderer, this.mAudioRenderer}, new DefaultTrackSelector(), new DefaultLoadControl(new DefaultAllocator(true, 65536, 32)));
            this.mNativeVideoProgressRunnable.setExoPlayer(this.mExoPlayer);
            this.mExoPlayer.addListener(this);
            this.mExoPlayer.prepare(new ExtractorMediaSource(Uri.parse(this.mVastVideoConfig.getNetworkMediaFileUrl()), new DataSource.Factory() { // from class: com.mopub.nativeads.NativeVideoController.1
                public DataSource createDataSource() {
                    return new HttpDiskCompositeDataSource(NativeVideoController.this.mContext, "exo_demo");
                }
            }, new ExtractorsFactory() { // from class: com.mopub.nativeads.NativeVideoController.2
                public Extractor[] createExtractors() {
                    return new Extractor[]{new Mp4Extractor()};
                }
            }, this.mHandler, (ExtractorMediaSource.EventListener) null));
            this.mNativeVideoProgressRunnable.startRepeating(50L);
        }
        setExoAudio();
        setExoPlayWhenReady();
    }

    private void setExoPlayWhenReady() {
        if (this.mExoPlayer == null) {
            return;
        }
        this.mExoPlayer.setPlayWhenReady(this.mPlayWhenReady);
    }

    private void setExoAudio() {
        setExoAudio(this.mAudioEnabled ? 1.0f : 0.0f);
    }

    private void setExoAudio(float f) {
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f);
        if (this.mExoPlayer == null) {
            return;
        }
        this.mExoPlayer.sendMessages(new ExoPlayer.ExoPlayerMessage[]{new ExoPlayer.ExoPlayerMessage(this.mAudioRenderer, 2, Float.valueOf(f))});
    }

    private void setExoSurface(Surface surface) {
        if (this.mExoPlayer == null) {
            return;
        }
        this.mExoPlayer.sendMessages(new ExoPlayer.ExoPlayerMessage[]{new ExoPlayer.ExoPlayerMessage(this.mVideoRenderer, 1, surface)});
    }

    @VisibleForTesting
    static class MoPubExoPlayerFactory {
        MoPubExoPlayerFactory() {
        }

        public ExoPlayer newInstance(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl) {
            return ExoPlayerFactory.newInstance(rendererArr, trackSelector, loadControl);
        }
    }

    static class VisibilityTrackingEvent {
        boolean isTracked;
        int minimumPercentageVisible;
        Integer minimumVisiblePx;
        OnTrackedStrategy strategy;
        int totalQualifiedPlayCounter;
        int totalRequiredPlayTimeMs;

        interface OnTrackedStrategy {
            void execute();
        }

        VisibilityTrackingEvent() {
        }
    }

    static class NativeVideoProgressRunnable extends RepeatingHandlerRunnable {
        private final Context mContext;
        private long mCurrentPosition;
        private long mDuration;
        private ExoPlayer mExoPlayer;
        private ProgressListener mProgressListener;
        private boolean mStopRequested;
        private TextureView mTextureView;
        private final VastVideoConfig mVastVideoConfig;
        private final VisibilityTracker.VisibilityChecker mVisibilityChecker;
        private final List<VisibilityTrackingEvent> mVisibilityTrackingEvents;

        public interface ProgressListener {
            void updateProgress(int i);
        }

        NativeVideoProgressRunnable(Context context, Handler handler, List<VisibilityTrackingEvent> list, VastVideoConfig vastVideoConfig) {
            this(context, handler, list, new VisibilityTracker.VisibilityChecker(), vastVideoConfig);
        }

        @VisibleForTesting
        NativeVideoProgressRunnable(Context context, Handler handler, List<VisibilityTrackingEvent> list, VisibilityTracker.VisibilityChecker visibilityChecker, VastVideoConfig vastVideoConfig) {
            super(handler);
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(handler);
            Preconditions.checkNotNull(list);
            Preconditions.checkNotNull(vastVideoConfig);
            this.mContext = context.getApplicationContext();
            this.mVisibilityTrackingEvents = list;
            this.mVisibilityChecker = visibilityChecker;
            this.mVastVideoConfig = vastVideoConfig;
            this.mDuration = -1L;
            this.mStopRequested = false;
        }

        void setExoPlayer(ExoPlayer exoPlayer) {
            this.mExoPlayer = exoPlayer;
        }

        void setTextureView(TextureView textureView) {
            this.mTextureView = textureView;
        }

        void setProgressListener(ProgressListener progressListener) {
            this.mProgressListener = progressListener;
        }

        void seekTo(long j) {
            this.mCurrentPosition = j;
        }

        long getCurrentPosition() {
            return this.mCurrentPosition;
        }

        long getDuration() {
            return this.mDuration;
        }

        void requestStop() {
            this.mStopRequested = true;
        }

        void checkImpressionTrackers(boolean z) {
            int i = 0;
            for (VisibilityTrackingEvent visibilityTrackingEvent : this.mVisibilityTrackingEvents) {
                if (visibilityTrackingEvent.isTracked) {
                    i++;
                } else if (z || this.mVisibilityChecker.isVisible(this.mTextureView, this.mTextureView, visibilityTrackingEvent.minimumPercentageVisible, visibilityTrackingEvent.minimumVisiblePx)) {
                    visibilityTrackingEvent.totalQualifiedPlayCounter = (int) (visibilityTrackingEvent.totalQualifiedPlayCounter + this.mUpdateIntervalMillis);
                    if (z || visibilityTrackingEvent.totalQualifiedPlayCounter >= visibilityTrackingEvent.totalRequiredPlayTimeMs) {
                        visibilityTrackingEvent.strategy.execute();
                        visibilityTrackingEvent.isTracked = true;
                        i++;
                    }
                }
            }
            if (i == this.mVisibilityTrackingEvents.size() && this.mStopRequested) {
                stop();
            }
        }

        @Override // com.mopub.mobileads.RepeatingHandlerRunnable
        public void doWork() {
            if (this.mExoPlayer == null || !this.mExoPlayer.getPlayWhenReady()) {
                return;
            }
            this.mCurrentPosition = this.mExoPlayer.getCurrentPosition();
            this.mDuration = this.mExoPlayer.getDuration();
            checkImpressionTrackers(false);
            if (this.mProgressListener != null) {
                this.mProgressListener.updateProgress((int) ((this.mCurrentPosition / this.mDuration) * 1000.0f));
            }
            List<VastTracker> untriggeredTrackersBefore = this.mVastVideoConfig.getUntriggeredTrackersBefore((int) this.mCurrentPosition, (int) this.mDuration);
            if (untriggeredTrackersBefore.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (VastTracker vastTracker : untriggeredTrackersBefore) {
                if (!vastTracker.isTracked()) {
                    arrayList.add(vastTracker.getContent());
                    vastTracker.setTracked();
                }
            }
            TrackingRequest.makeTrackingHttpRequest(arrayList, this.mContext);
        }

        @VisibleForTesting
        @Deprecated
        void setUpdateIntervalMillis(long j) {
            this.mUpdateIntervalMillis = j;
        }
    }
}
