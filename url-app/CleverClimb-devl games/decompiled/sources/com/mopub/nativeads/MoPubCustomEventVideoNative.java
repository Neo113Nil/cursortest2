package com.mopub.nativeads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import com.mopub.common.DataKeys;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import com.mopub.mobileads.VastManager;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.VastVideoConfig;
import com.mopub.mobileads.VideoViewabilityTracker;
import com.mopub.mobileads.factories.VastManagerFactory;
import com.mopub.nativeads.CustomEventNative;
import com.mopub.nativeads.MediaLayout;
import com.mopub.nativeads.NativeImageHelper;
import com.mopub.nativeads.NativeVideoController;
import com.mopub.nativeads.VisibilityTracker;
import com.mopub.network.TrackingRequest;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MoPubCustomEventVideoNative extends CustomEventNative {
    @Override // com.mopub.nativeads.CustomEventNative
    protected void loadNativeAd(Context context, CustomEventNative.CustomEventNativeListener customEventNativeListener, Map<String, Object> map, Map<String, String> map2) {
        Object obj = map.get(DataKeys.JSON_BODY_KEY);
        if (!(obj instanceof JSONObject)) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.INVALID_RESPONSE);
            return;
        }
        VideoResponseHeaders videoResponseHeaders = new VideoResponseHeaders(map2);
        if (!videoResponseHeaders.hasValidHeaders()) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.INVALID_RESPONSE);
            return;
        }
        Object obj2 = map.get(DataKeys.CLICK_TRACKING_URL_KEY);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (!TextUtils.isEmpty(str)) {
                try {
                    new MoPubVideoNativeAd(context, (JSONObject) obj, customEventNativeListener, videoResponseHeaders, str).loadAd();
                    return;
                } catch (IllegalArgumentException unused) {
                    customEventNativeListener.onNativeAdFailed(NativeErrorCode.UNSPECIFIED);
                    return;
                }
            }
        }
        customEventNativeListener.onNativeAdFailed(NativeErrorCode.UNSPECIFIED);
    }

    public static class MoPubVideoNativeAd extends VideoNativeAd implements AudioManager.OnAudioFocusChangeListener, VastManager.VastManagerListener, NativeVideoController.NativeVideoProgressRunnable.ProgressListener {
        static final String PRIVACY_INFORMATION_CLICKTHROUGH_URL = "https://www.mopub.com/optout/";
        private final Context mContext;
        private final CustomEventNative.CustomEventNativeListener mCustomEventNativeListener;
        private boolean mEnded;
        private boolean mError;
        private final long mId;
        private final JSONObject mJsonObject;
        private int mLatestVideoControllerState;
        private boolean mLatestVisibility;
        private MediaLayout mMediaLayout;
        private final String mMoPubClickTrackingUrl;
        private boolean mMuted;
        private NativeVideoController mNativeVideoController;
        private final NativeVideoControllerFactory mNativeVideoControllerFactory;
        private boolean mNeedsPrepare;
        private boolean mNeedsSeek;
        private boolean mPauseCanBeTracked;
        private boolean mResumeCanBeTracked;
        private View mRootView;
        private final VastManager mVastManager;
        VastVideoConfig mVastVideoConfig;
        private final VideoResponseHeaders mVideoResponseHeaders;
        private VideoState mVideoState;
        private final VisibilityTracker mVideoVisibleTracking;

        public enum VideoState {
            CREATED,
            LOADING,
            BUFFERING,
            PAUSED,
            PLAYING,
            PLAYING_MUTED,
            ENDED,
            FAILED_LOAD
        }

        enum Parameter {
            IMPRESSION_TRACKER("imptracker", true),
            CLICK_TRACKER("clktracker", true),
            TITLE(TJAdUnitConstants.String.TITLE, false),
            TEXT("text", false),
            IMAGE_URL("mainimage", false),
            ICON_URL("iconimage", false),
            CLICK_DESTINATION("clk", false),
            FALLBACK("fallback", false),
            CALL_TO_ACTION("ctatext", false),
            VAST_VIDEO("video", false);


            @VisibleForTesting
            static final Set<String> requiredKeys = new HashSet();
            final String mName;
            final boolean mRequired;

            static {
                for (Parameter parameter : values()) {
                    if (parameter.mRequired) {
                        requiredKeys.add(parameter.mName);
                    }
                }
            }

            Parameter(String str, boolean z) {
                Preconditions.checkNotNull(str);
                this.mName = str;
                this.mRequired = z;
            }

            static Parameter from(String str) {
                Preconditions.checkNotNull(str);
                for (Parameter parameter : values()) {
                    if (parameter.mName.equals(str)) {
                        return parameter;
                    }
                }
                return null;
            }
        }

        public MoPubVideoNativeAd(Context context, JSONObject jSONObject, CustomEventNative.CustomEventNativeListener customEventNativeListener, VideoResponseHeaders videoResponseHeaders, String str) {
            this(context, jSONObject, customEventNativeListener, videoResponseHeaders, new VisibilityTracker(context), new NativeVideoControllerFactory(), str, VastManagerFactory.create(context.getApplicationContext(), false));
        }

        @VisibleForTesting
        MoPubVideoNativeAd(Context context, JSONObject jSONObject, CustomEventNative.CustomEventNativeListener customEventNativeListener, VideoResponseHeaders videoResponseHeaders, VisibilityTracker visibilityTracker, NativeVideoControllerFactory nativeVideoControllerFactory, String str, VastManager vastManager) {
            this.mPauseCanBeTracked = false;
            this.mResumeCanBeTracked = false;
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(jSONObject);
            Preconditions.checkNotNull(customEventNativeListener);
            Preconditions.checkNotNull(videoResponseHeaders);
            Preconditions.checkNotNull(visibilityTracker);
            Preconditions.checkNotNull(nativeVideoControllerFactory);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(vastManager);
            this.mContext = context.getApplicationContext();
            this.mJsonObject = jSONObject;
            this.mCustomEventNativeListener = customEventNativeListener;
            this.mVideoResponseHeaders = videoResponseHeaders;
            this.mNativeVideoControllerFactory = nativeVideoControllerFactory;
            this.mMoPubClickTrackingUrl = str;
            this.mId = Utils.generateUniqueId();
            this.mNeedsSeek = true;
            this.mVideoState = VideoState.CREATED;
            this.mNeedsPrepare = true;
            this.mLatestVideoControllerState = 1;
            this.mMuted = true;
            this.mVideoVisibleTracking = visibilityTracker;
            this.mVideoVisibleTracking.setVisibilityTrackerListener(new VisibilityTracker.VisibilityTrackerListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.1
                @Override // com.mopub.nativeads.VisibilityTracker.VisibilityTrackerListener
                public void onVisibilityChanged(List<View> list, List<View> list2) {
                    if (!list.isEmpty() && !MoPubVideoNativeAd.this.mLatestVisibility) {
                        MoPubVideoNativeAd.this.mLatestVisibility = true;
                        MoPubVideoNativeAd.this.maybeChangeState();
                    } else {
                        if (list2.isEmpty() || !MoPubVideoNativeAd.this.mLatestVisibility) {
                            return;
                        }
                        MoPubVideoNativeAd.this.mLatestVisibility = false;
                        MoPubVideoNativeAd.this.maybeChangeState();
                    }
                }
            });
            this.mVastManager = vastManager;
        }

        void loadAd() throws IllegalArgumentException {
            if (!containsRequiredKeys(this.mJsonObject)) {
                throw new IllegalArgumentException("JSONObject did not contain required keys.");
            }
            Iterator<String> keys = this.mJsonObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Parameter from = Parameter.from(next);
                if (from != null) {
                    try {
                        addInstanceVariable(from, this.mJsonObject.opt(next));
                    } catch (ClassCastException unused) {
                        throw new IllegalArgumentException("JSONObject key (" + next + ") contained unexpected value.");
                    }
                } else {
                    addExtra(next, this.mJsonObject.opt(next));
                }
            }
            setPrivacyInformationIconClickThroughUrl(PRIVACY_INFORMATION_CLICKTHROUGH_URL);
            NativeImageHelper.preCacheImages(this.mContext, getAllImageUrls(), new NativeImageHelper.ImageListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.2
                @Override // com.mopub.nativeads.NativeImageHelper.ImageListener
                public void onImagesCached() {
                    MoPubVideoNativeAd.this.mVastManager.prepareVastVideoConfiguration(MoPubVideoNativeAd.this.getVastVideo(), MoPubVideoNativeAd.this, null, MoPubVideoNativeAd.this.mContext);
                }

                @Override // com.mopub.nativeads.NativeImageHelper.ImageListener
                public void onImagesFailedToCache(NativeErrorCode nativeErrorCode) {
                    MoPubVideoNativeAd.this.mCustomEventNativeListener.onNativeAdFailed(nativeErrorCode);
                }
            });
        }

        @Override // com.mopub.mobileads.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastVideoConfig vastVideoConfig) {
            if (vastVideoConfig == null) {
                this.mCustomEventNativeListener.onNativeAdFailed(NativeErrorCode.INVALID_RESPONSE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            NativeVideoController.VisibilityTrackingEvent visibilityTrackingEvent = new NativeVideoController.VisibilityTrackingEvent();
            visibilityTrackingEvent.strategy = new HeaderVisibilityStrategy(this);
            visibilityTrackingEvent.minimumPercentageVisible = this.mVideoResponseHeaders.getImpressionMinVisiblePercent();
            visibilityTrackingEvent.totalRequiredPlayTimeMs = this.mVideoResponseHeaders.getImpressionVisibleMs();
            arrayList.add(visibilityTrackingEvent);
            visibilityTrackingEvent.minimumVisiblePx = this.mVideoResponseHeaders.getImpressionVisiblePx();
            for (VastTracker vastTracker : vastVideoConfig.getImpressionTrackers()) {
                NativeVideoController.VisibilityTrackingEvent visibilityTrackingEvent2 = new NativeVideoController.VisibilityTrackingEvent();
                visibilityTrackingEvent2.strategy = new PayloadVisibilityStrategy(this.mContext, vastTracker.getContent());
                visibilityTrackingEvent2.minimumPercentageVisible = this.mVideoResponseHeaders.getImpressionMinVisiblePercent();
                visibilityTrackingEvent2.totalRequiredPlayTimeMs = this.mVideoResponseHeaders.getImpressionVisibleMs();
                arrayList.add(visibilityTrackingEvent2);
                visibilityTrackingEvent2.minimumVisiblePx = this.mVideoResponseHeaders.getImpressionVisiblePx();
            }
            this.mVastVideoConfig = vastVideoConfig;
            VideoViewabilityTracker videoViewabilityTracker = this.mVastVideoConfig.getVideoViewabilityTracker();
            if (videoViewabilityTracker != null) {
                NativeVideoController.VisibilityTrackingEvent visibilityTrackingEvent3 = new NativeVideoController.VisibilityTrackingEvent();
                visibilityTrackingEvent3.strategy = new PayloadVisibilityStrategy(this.mContext, videoViewabilityTracker.getContent());
                visibilityTrackingEvent3.minimumPercentageVisible = videoViewabilityTracker.getPercentViewable();
                visibilityTrackingEvent3.totalRequiredPlayTimeMs = videoViewabilityTracker.getViewablePlaytimeMS();
                arrayList.add(visibilityTrackingEvent3);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(this.mMoPubClickTrackingUrl);
            hashSet.addAll(getClickTrackers());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(new VastTracker((String) it.next(), false));
            }
            this.mVastVideoConfig.addClickTrackers(arrayList2);
            this.mVastVideoConfig.setClickThroughUrl(getClickDestinationUrl());
            this.mNativeVideoController = this.mNativeVideoControllerFactory.createForId(this.mId, this.mContext, arrayList, this.mVastVideoConfig);
            this.mCustomEventNativeListener.onNativeAdLoaded(this);
            JSONObject videoTrackers = this.mVideoResponseHeaders.getVideoTrackers();
            if (videoTrackers != null) {
                this.mVastVideoConfig.addVideoTrackers(videoTrackers);
            }
        }

        private boolean containsRequiredKeys(JSONObject jSONObject) {
            Preconditions.checkNotNull(jSONObject);
            HashSet hashSet = new HashSet();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
            return hashSet.containsAll(Parameter.requiredKeys);
        }

        private void addInstanceVariable(Parameter parameter, Object obj) throws ClassCastException {
            Preconditions.checkNotNull(parameter);
            Preconditions.checkNotNull(obj);
            try {
                switch (parameter) {
                    case IMPRESSION_TRACKER:
                        addImpressionTrackers(obj);
                        break;
                    case TITLE:
                        setTitle((String) obj);
                        break;
                    case TEXT:
                        setText((String) obj);
                        break;
                    case IMAGE_URL:
                        setMainImageUrl((String) obj);
                        break;
                    case ICON_URL:
                        setIconImageUrl((String) obj);
                        break;
                    case CLICK_DESTINATION:
                        setClickDestinationUrl((String) obj);
                        break;
                    case CLICK_TRACKER:
                        parseClickTrackers(obj);
                        break;
                    case CALL_TO_ACTION:
                        setCallToAction((String) obj);
                        break;
                    case VAST_VIDEO:
                        setVastVideo((String) obj);
                        break;
                    default:
                        MoPubLog.d("Unable to add JSON key to internal mapping: " + parameter.mName);
                        break;
                }
            } catch (ClassCastException e) {
                if (!parameter.mRequired) {
                    MoPubLog.d("Ignoring class cast exception for optional key: " + parameter.mName);
                    return;
                }
                throw e;
            }
        }

        private void parseClickTrackers(Object obj) {
            if (obj instanceof JSONArray) {
                addClickTrackers(obj);
            } else {
                addClickTracker((String) obj);
            }
        }

        @Override // com.mopub.nativeads.VideoNativeAd
        public void render(MediaLayout mediaLayout) {
            Preconditions.checkNotNull(mediaLayout);
            this.mVideoVisibleTracking.addView(this.mRootView, mediaLayout, this.mVideoResponseHeaders.getPlayVisiblePercent(), this.mVideoResponseHeaders.getPauseVisiblePercent(), this.mVideoResponseHeaders.getImpressionVisiblePx());
            this.mMediaLayout = mediaLayout;
            this.mMediaLayout.initForVideo();
            this.mMediaLayout.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.3
                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    MoPubVideoNativeAd.this.mNativeVideoController.setListener(MoPubVideoNativeAd.this);
                    MoPubVideoNativeAd.this.mNativeVideoController.setOnAudioFocusChangeListener(MoPubVideoNativeAd.this);
                    MoPubVideoNativeAd.this.mNativeVideoController.setProgressListener(MoPubVideoNativeAd.this);
                    MoPubVideoNativeAd.this.mNativeVideoController.setTextureView(MoPubVideoNativeAd.this.mMediaLayout.getTextureView());
                    MoPubVideoNativeAd.this.mMediaLayout.resetProgress();
                    long duration = MoPubVideoNativeAd.this.mNativeVideoController.getDuration();
                    long currentPosition = MoPubVideoNativeAd.this.mNativeVideoController.getCurrentPosition();
                    if (MoPubVideoNativeAd.this.mLatestVideoControllerState == 4 || (duration > 0 && duration - currentPosition < 750)) {
                        MoPubVideoNativeAd.this.mEnded = true;
                    }
                    if (MoPubVideoNativeAd.this.mNeedsPrepare) {
                        MoPubVideoNativeAd.this.mNeedsPrepare = false;
                        MoPubVideoNativeAd.this.mNativeVideoController.prepare(MoPubVideoNativeAd.this);
                    }
                    MoPubVideoNativeAd.this.mNeedsSeek = true;
                    MoPubVideoNativeAd.this.maybeChangeState();
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    MoPubVideoNativeAd.this.mNeedsPrepare = true;
                    MoPubVideoNativeAd.this.mNativeVideoController.release(MoPubVideoNativeAd.this);
                    MoPubVideoNativeAd.this.applyState(VideoState.PAUSED);
                    return true;
                }
            });
            this.mMediaLayout.setPlayButtonClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MoPubVideoNativeAd.this.mMediaLayout.resetProgress();
                    MoPubVideoNativeAd.this.mNativeVideoController.seekTo(0L);
                    MoPubVideoNativeAd.this.mEnded = false;
                    MoPubVideoNativeAd.this.mNeedsSeek = false;
                }
            });
            this.mMediaLayout.setMuteControlClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MoPubVideoNativeAd.this.mMuted = !MoPubVideoNativeAd.this.mMuted;
                    MoPubVideoNativeAd.this.maybeChangeState();
                }
            });
            this.mMediaLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MoPubVideoNativeAd.this.prepareToLeaveView();
                    MoPubVideoNativeAd.this.mNativeVideoController.triggerImpressionTrackers();
                    MraidVideoPlayerActivity.startNativeVideo(MoPubVideoNativeAd.this.mContext, MoPubVideoNativeAd.this.mId, MoPubVideoNativeAd.this.mVastVideoConfig);
                }
            });
            if (this.mNativeVideoController.getPlaybackState() == 5) {
                this.mNativeVideoController.prepare(this);
            }
            applyState(VideoState.PAUSED);
        }

        @Override // com.mopub.nativeads.VideoNativeAd, com.mopub.nativeads.BaseNativeAd
        public void prepare(View view) {
            Preconditions.checkNotNull(view);
            this.mRootView = view;
            this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.MoPubCustomEventVideoNative.MoPubVideoNativeAd.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    MoPubVideoNativeAd.this.prepareToLeaveView();
                    MoPubVideoNativeAd.this.mNativeVideoController.triggerImpressionTrackers();
                    MoPubVideoNativeAd.this.mNativeVideoController.handleCtaClick(MoPubVideoNativeAd.this.mContext);
                }
            });
        }

        @Override // com.mopub.nativeads.VideoNativeAd, com.mopub.nativeads.BaseNativeAd
        public void clear(View view) {
            Preconditions.checkNotNull(view);
            this.mNativeVideoController.clear();
            cleanUpMediaLayout();
        }

        @Override // com.mopub.nativeads.VideoNativeAd, com.mopub.nativeads.BaseNativeAd
        public void destroy() {
            cleanUpMediaLayout();
            this.mNativeVideoController.setPlayWhenReady(false);
            this.mNativeVideoController.release(this);
            NativeVideoController.remove(this.mId);
            this.mVideoVisibleTracking.destroy();
        }

        @Override // com.mopub.nativeads.NativeVideoController.Listener
        public void onStateChanged(boolean z, int i) {
            this.mLatestVideoControllerState = i;
            maybeChangeState();
        }

        @Override // com.mopub.nativeads.NativeVideoController.Listener
        public void onError(Exception exc) {
            MoPubLog.w("Error playing back video.", exc);
            this.mError = true;
            maybeChangeState();
        }

        @Override // com.mopub.nativeads.NativeVideoController.NativeVideoProgressRunnable.ProgressListener
        public void updateProgress(int i) {
            this.mMediaLayout.updateProgress(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -1 || i == -2) {
                this.mMuted = true;
                maybeChangeState();
            } else if (i == -3) {
                this.mNativeVideoController.setAudioVolume(0.3f);
            } else if (i == 1) {
                this.mNativeVideoController.setAudioVolume(1.0f);
                maybeChangeState();
            }
        }

        private void cleanUpMediaLayout() {
            if (this.mMediaLayout != null) {
                this.mMediaLayout.setMode(MediaLayout.Mode.IMAGE);
                this.mMediaLayout.setSurfaceTextureListener(null);
                this.mMediaLayout.setPlayButtonClickListener(null);
                this.mMediaLayout.setMuteControlClickListener(null);
                this.mMediaLayout.setOnClickListener(null);
                this.mVideoVisibleTracking.removeView(this.mMediaLayout);
                this.mMediaLayout = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void prepareToLeaveView() {
            this.mNeedsSeek = true;
            this.mNeedsPrepare = true;
            this.mNativeVideoController.setListener(null);
            this.mNativeVideoController.setOnAudioFocusChangeListener(null);
            this.mNativeVideoController.setProgressListener(null);
            this.mNativeVideoController.clear();
            applyState(VideoState.PAUSED, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeChangeState() {
            VideoState videoState = this.mVideoState;
            if (this.mError) {
                videoState = VideoState.FAILED_LOAD;
            } else if (this.mEnded) {
                videoState = VideoState.ENDED;
            } else if (this.mLatestVideoControllerState == 1) {
                videoState = VideoState.LOADING;
            } else if (this.mLatestVideoControllerState == 2) {
                videoState = VideoState.BUFFERING;
            } else if (this.mLatestVideoControllerState == 4) {
                this.mEnded = true;
                videoState = VideoState.ENDED;
            } else if (this.mLatestVideoControllerState == 3) {
                if (this.mLatestVisibility) {
                    videoState = this.mMuted ? VideoState.PLAYING_MUTED : VideoState.PLAYING;
                } else {
                    videoState = VideoState.PAUSED;
                }
            }
            applyState(videoState);
        }

        @VisibleForTesting
        void applyState(VideoState videoState) {
            applyState(videoState, false);
        }

        @VisibleForTesting
        void applyState(VideoState videoState, boolean z) {
            Preconditions.checkNotNull(videoState);
            if (this.mVastVideoConfig == null || this.mNativeVideoController == null || this.mMediaLayout == null || this.mVideoState == videoState) {
            }
            VideoState videoState2 = this.mVideoState;
            this.mVideoState = videoState;
            switch (videoState) {
                case FAILED_LOAD:
                    this.mVastVideoConfig.handleError(this.mContext, null, 0);
                    this.mNativeVideoController.setAppAudioEnabled(false);
                    this.mMediaLayout.setMode(MediaLayout.Mode.IMAGE);
                    break;
                case CREATED:
                case LOADING:
                    this.mNativeVideoController.setPlayWhenReady(true);
                    this.mMediaLayout.setMode(MediaLayout.Mode.LOADING);
                    break;
                case BUFFERING:
                    this.mNativeVideoController.setPlayWhenReady(true);
                    this.mMediaLayout.setMode(MediaLayout.Mode.BUFFERING);
                    break;
                case PAUSED:
                    if (z) {
                        this.mResumeCanBeTracked = false;
                    }
                    if (!z) {
                        this.mNativeVideoController.setAppAudioEnabled(false);
                        if (this.mPauseCanBeTracked) {
                            TrackingRequest.makeVastTrackingHttpRequest(this.mVastVideoConfig.getPauseTrackers(), null, Integer.valueOf((int) this.mNativeVideoController.getCurrentPosition()), null, this.mContext);
                            this.mPauseCanBeTracked = false;
                            this.mResumeCanBeTracked = true;
                        }
                    }
                    this.mNativeVideoController.setPlayWhenReady(false);
                    this.mMediaLayout.setMode(MediaLayout.Mode.PAUSED);
                    break;
                case PLAYING:
                    handleResumeTrackersAndSeek(videoState2);
                    this.mNativeVideoController.setPlayWhenReady(true);
                    this.mNativeVideoController.setAudioEnabled(true);
                    this.mNativeVideoController.setAppAudioEnabled(true);
                    this.mMediaLayout.setMode(MediaLayout.Mode.PLAYING);
                    this.mMediaLayout.setMuteState(MediaLayout.MuteState.UNMUTED);
                    break;
                case PLAYING_MUTED:
                    handleResumeTrackersAndSeek(videoState2);
                    this.mNativeVideoController.setPlayWhenReady(true);
                    this.mNativeVideoController.setAudioEnabled(false);
                    this.mNativeVideoController.setAppAudioEnabled(false);
                    this.mMediaLayout.setMode(MediaLayout.Mode.PLAYING);
                    this.mMediaLayout.setMuteState(MediaLayout.MuteState.MUTED);
                    break;
                case ENDED:
                    if (this.mNativeVideoController.hasFinalFrame()) {
                        this.mMediaLayout.setMainImageDrawable(this.mNativeVideoController.getFinalFrame());
                    }
                    this.mPauseCanBeTracked = false;
                    this.mResumeCanBeTracked = false;
                    this.mVastVideoConfig.handleComplete(this.mContext, 0);
                    this.mNativeVideoController.setAppAudioEnabled(false);
                    this.mMediaLayout.setMode(MediaLayout.Mode.FINISHED);
                    this.mMediaLayout.updateProgress(1000);
                    break;
            }
        }

        private void handleResumeTrackersAndSeek(VideoState videoState) {
            if (this.mResumeCanBeTracked && videoState != VideoState.PLAYING && videoState != VideoState.PLAYING_MUTED) {
                TrackingRequest.makeVastTrackingHttpRequest(this.mVastVideoConfig.getResumeTrackers(), null, Integer.valueOf((int) this.mNativeVideoController.getCurrentPosition()), null, this.mContext);
                this.mResumeCanBeTracked = false;
            }
            this.mPauseCanBeTracked = true;
            if (this.mNeedsSeek) {
                this.mNeedsSeek = false;
                this.mNativeVideoController.seekTo(this.mNativeVideoController.getCurrentPosition());
            }
        }

        private boolean isImageKey(String str) {
            return str != null && str.toLowerCase(Locale.US).endsWith("image");
        }

        private List<String> getExtrasImageUrls() {
            ArrayList arrayList = new ArrayList(getExtras().size());
            for (Map.Entry<String, Object> entry : getExtras().entrySet()) {
                if (isImageKey(entry.getKey()) && (entry.getValue() instanceof String)) {
                    arrayList.add((String) entry.getValue());
                }
            }
            return arrayList;
        }

        private List<String> getAllImageUrls() {
            ArrayList arrayList = new ArrayList();
            if (getMainImageUrl() != null) {
                arrayList.add(getMainImageUrl());
            }
            if (getIconImageUrl() != null) {
                arrayList.add(getIconImageUrl());
            }
            arrayList.addAll(getExtrasImageUrls());
            return arrayList;
        }

        @VisibleForTesting
        @Deprecated
        boolean needsPrepare() {
            return this.mNeedsPrepare;
        }

        @VisibleForTesting
        @Deprecated
        boolean hasEnded() {
            return this.mEnded;
        }

        @VisibleForTesting
        @Deprecated
        boolean needsSeek() {
            return this.mNeedsSeek;
        }

        @VisibleForTesting
        @Deprecated
        boolean isMuted() {
            return this.mMuted;
        }

        @VisibleForTesting
        @Deprecated
        long getId() {
            return this.mId;
        }

        @VisibleForTesting
        @Deprecated
        VideoState getVideoState() {
            return this.mVideoState;
        }

        @VisibleForTesting
        @Deprecated
        void setLatestVisibility(boolean z) {
            this.mLatestVisibility = z;
        }

        @VisibleForTesting
        @Deprecated
        void setMuted(boolean z) {
            this.mMuted = z;
        }

        @VisibleForTesting
        @Deprecated
        MediaLayout getMediaLayout() {
            return this.mMediaLayout;
        }
    }

    @VisibleForTesting
    static class HeaderVisibilityStrategy implements NativeVideoController.VisibilityTrackingEvent.OnTrackedStrategy {
        private final WeakReference<MoPubVideoNativeAd> mMoPubVideoNativeAd;

        HeaderVisibilityStrategy(MoPubVideoNativeAd moPubVideoNativeAd) {
            this.mMoPubVideoNativeAd = new WeakReference<>(moPubVideoNativeAd);
        }

        @Override // com.mopub.nativeads.NativeVideoController.VisibilityTrackingEvent.OnTrackedStrategy
        public void execute() {
            MoPubVideoNativeAd moPubVideoNativeAd = this.mMoPubVideoNativeAd.get();
            if (moPubVideoNativeAd != null) {
                moPubVideoNativeAd.notifyAdImpressed();
            }
        }
    }

    @VisibleForTesting
    static class PayloadVisibilityStrategy implements NativeVideoController.VisibilityTrackingEvent.OnTrackedStrategy {
        private final Context mContext;
        private final String mUrl;

        PayloadVisibilityStrategy(Context context, String str) {
            this.mContext = context.getApplicationContext();
            this.mUrl = str;
        }

        @Override // com.mopub.nativeads.NativeVideoController.VisibilityTrackingEvent.OnTrackedStrategy
        public void execute() {
            TrackingRequest.makeTrackingHttpRequest(this.mUrl, this.mContext);
        }
    }

    @VisibleForTesting
    static class NativeVideoControllerFactory {
        NativeVideoControllerFactory() {
        }

        public NativeVideoController createForId(long j, Context context, List<NativeVideoController.VisibilityTrackingEvent> list, VastVideoConfig vastVideoConfig) {
            return NativeVideoController.createForId(j, context, list, vastVideoConfig);
        }
    }

    @VisibleForTesting
    static class VideoResponseHeaders {
        private boolean mHeadersAreValid;
        private int mImpressionMinVisiblePercent;
        private int mImpressionVisibleMs;
        private Integer mImpressionVisiblePx;
        private int mMaxBufferMs;
        private int mPauseVisiblePercent;
        private int mPlayVisiblePercent;
        private JSONObject mVideoTrackers;

        VideoResponseHeaders(Map<String, String> map) {
            try {
                this.mPlayVisiblePercent = Integer.parseInt(map.get(DataKeys.PLAY_VISIBLE_PERCENT));
                this.mPauseVisiblePercent = Integer.parseInt(map.get(DataKeys.PAUSE_VISIBLE_PERCENT));
                this.mImpressionVisibleMs = Integer.parseInt(map.get(DataKeys.IMPRESSION_VISIBLE_MS));
                this.mMaxBufferMs = Integer.parseInt(map.get(DataKeys.MAX_BUFFER_MS));
                this.mHeadersAreValid = true;
            } catch (NumberFormatException unused) {
                this.mHeadersAreValid = false;
            }
            String str = map.get(DataKeys.IMPRESSION_MIN_VISIBLE_PX);
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.mImpressionVisiblePx = Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException unused2) {
                    MoPubLog.d("Unable to parse impression min visible px from server extras.");
                }
            }
            try {
                this.mImpressionMinVisiblePercent = Integer.parseInt(map.get(DataKeys.IMPRESSION_MIN_VISIBLE_PERCENT));
            } catch (NumberFormatException unused3) {
                MoPubLog.d("Unable to parse impression min visible percent from server extras.");
                if (this.mImpressionVisiblePx == null || this.mImpressionVisiblePx.intValue() < 0) {
                    this.mHeadersAreValid = false;
                }
            }
            String str2 = map.get(DataKeys.VIDEO_TRACKERS_KEY);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                this.mVideoTrackers = new JSONObject(str2);
            } catch (JSONException e) {
                MoPubLog.d("Failed to parse video trackers to JSON: " + str2, e);
                this.mVideoTrackers = null;
            }
        }

        boolean hasValidHeaders() {
            return this.mHeadersAreValid;
        }

        int getPlayVisiblePercent() {
            return this.mPlayVisiblePercent;
        }

        int getPauseVisiblePercent() {
            return this.mPauseVisiblePercent;
        }

        int getImpressionMinVisiblePercent() {
            return this.mImpressionMinVisiblePercent;
        }

        int getImpressionVisibleMs() {
            return this.mImpressionVisibleMs;
        }

        int getMaxBufferMs() {
            return this.mMaxBufferMs;
        }

        Integer getImpressionVisiblePx() {
            return this.mImpressionVisiblePx;
        }

        JSONObject getVideoTrackers() {
            return this.mVideoTrackers;
        }
    }
}
