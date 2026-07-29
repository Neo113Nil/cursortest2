package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.mopub.common.ExternalViewabilitySession;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.IntentActions;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.BaseVideoViewController;
import com.mopub.mobileads.VastWebView;
import com.mopub.network.TrackingRequest;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class VastVideoViewController extends BaseVideoViewController {
    static final String CURRENT_POSITION = "current_position";
    static final int DEFAULT_VIDEO_DURATION_FOR_CLOSE_BUTTON = 5000;
    static final int MAX_VIDEO_DURATION_FOR_CLOSE_BUTTON = 16000;
    static final String RESUMED_VAST_CONFIG = "resumed_vast_config";
    private static final int SEEKER_POSITION_NOT_INITIALIZED = -1;
    static final String VAST_VIDEO_CONFIG = "vast_video_config";
    private static final long VIDEO_COUNTDOWN_UPDATE_INTERVAL = 250;
    private static final long VIDEO_PROGRESS_TIMER_CHECKER_DELAY = 50;
    public static final int WEBVIEW_PADDING = 16;
    private View mAdsByView;
    private ImageView mBlurredLastVideoFrameImageView;
    private VastVideoGradientStripWidget mBottomGradientStripWidget;
    private final View.OnTouchListener mClickThroughListener;
    private VastVideoCloseButtonWidget mCloseButtonWidget;
    private final VastVideoViewCountdownRunnable mCountdownRunnable;
    private VastVideoCtaButtonWidget mCtaButtonWidget;
    private int mDuration;
    private ExternalViewabilitySessionManager mExternalViewabilitySessionManager;
    private boolean mHasSkipOffset;
    private boolean mHasSocialActions;
    private final View mIconView;
    private boolean mIsCalibrationDone;
    private boolean mIsClosing;
    private boolean mIsVideoFinishedPlaying;
    private final View mLandscapeCompanionAdView;
    private final View mPortraitCompanionAdView;
    private VastVideoProgressBarWidget mProgressBarWidget;
    private final VastVideoViewProgressRunnable mProgressCheckerRunnable;
    private VastVideoRadialCountdownWidget mRadialCountdownWidget;
    private int mSeekerPositionOnPause;
    private int mShowCloseButtonDelay;
    private boolean mShowCloseButtonEventFired;
    private final Map<String, VastCompanionAdConfig> mSocialActionsCompanionAds;
    private final View mSocialActionsView;
    private VastVideoGradientStripWidget mTopGradientStripWidget;
    private VastCompanionAdConfig mVastCompanionAdConfig;
    private final VastIconConfig mVastIconConfig;
    private final VastVideoConfig mVastVideoConfig;
    private boolean mVideoError;
    private final VastVideoView mVideoView;

    VastVideoViewController(final Activity activity, Bundle bundle, Bundle bundle2, long j, BaseVideoViewController.BaseVideoViewControllerListener baseVideoViewControllerListener) throws IllegalStateException {
        super(activity, Long.valueOf(j), baseVideoViewControllerListener);
        this.mShowCloseButtonDelay = DEFAULT_VIDEO_DURATION_FOR_CLOSE_BUTTON;
        this.mHasSkipOffset = false;
        this.mIsCalibrationDone = false;
        this.mHasSocialActions = false;
        this.mIsClosing = false;
        this.mSeekerPositionOnPause = -1;
        Serializable serializable = bundle2 != null ? bundle2.getSerializable(RESUMED_VAST_CONFIG) : null;
        Serializable serializable2 = bundle.getSerializable(VAST_VIDEO_CONFIG);
        if (serializable != null && (serializable instanceof VastVideoConfig)) {
            this.mVastVideoConfig = (VastVideoConfig) serializable;
            this.mSeekerPositionOnPause = bundle2.getInt(CURRENT_POSITION, -1);
        } else if (serializable2 != null && (serializable2 instanceof VastVideoConfig)) {
            this.mVastVideoConfig = (VastVideoConfig) serializable2;
        } else {
            throw new IllegalStateException("VastVideoConfig is invalid");
        }
        if (this.mVastVideoConfig.getDiskMediaFileUrl() == null) {
            throw new IllegalStateException("VastVideoConfig does not have a video disk path");
        }
        this.mVastCompanionAdConfig = this.mVastVideoConfig.getVastCompanionAd(activity.getResources().getConfiguration().orientation);
        this.mSocialActionsCompanionAds = this.mVastVideoConfig.getSocialActionsCompanionAds();
        this.mVastIconConfig = this.mVastVideoConfig.getVastIconConfig();
        this.mClickThroughListener = new View.OnTouchListener() { // from class: com.mopub.mobileads.VastVideoViewController.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && VastVideoViewController.this.shouldAllowClickThrough()) {
                    VastVideoViewController.this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_CLICK_THRU, VastVideoViewController.this.getCurrentPosition());
                    VastVideoViewController.this.mIsClosing = true;
                    VastVideoViewController.this.broadcastAction(IntentActions.ACTION_INTERSTITIAL_CLICK);
                    VastVideoViewController.this.mVastVideoConfig.handleClickForResult(activity, VastVideoViewController.this.mIsVideoFinishedPlaying ? VastVideoViewController.this.mDuration : VastVideoViewController.this.getCurrentPosition(), 1);
                }
                return true;
            }
        };
        getLayout().setBackgroundColor(-16777216);
        addBlurredLastVideoFrameImageView(activity, 4);
        this.mVideoView = createVideoView(activity, 0);
        this.mVideoView.requestFocus();
        this.mExternalViewabilitySessionManager = new ExternalViewabilitySessionManager(activity);
        this.mExternalViewabilitySessionManager.createVideoSession(activity, this.mVideoView, this.mVastVideoConfig);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mBlurredLastVideoFrameImageView);
        this.mLandscapeCompanionAdView = createCompanionAdView(activity, this.mVastVideoConfig.getVastCompanionAd(2), 4);
        this.mPortraitCompanionAdView = createCompanionAdView(activity, this.mVastVideoConfig.getVastCompanionAd(1), 4);
        addTopGradientStripWidget(activity);
        addProgressBarWidget(activity, 4);
        addBottomGradientStripWidget(activity);
        addRadialCountdownWidget(activity, 4);
        this.mIconView = createIconView(activity, this.mVastIconConfig, 4);
        this.mIconView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mopub.mobileads.VastVideoViewController.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VastVideoViewController.this.mAdsByView = VastVideoViewController.this.createAdsByView(activity);
                VastVideoViewController.this.mIconView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
        addCtaButtonWidget(activity);
        this.mSocialActionsView = createSocialActionsView(activity, this.mSocialActionsCompanionAds.get(VastXmlManagerAggregator.SOCIAL_ACTIONS_AD_SLOT_ID), Dips.dipsToIntPixels(38.0f, activity), 6, this.mCtaButtonWidget, 4, 16);
        addCloseButtonWidget(activity, 8);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mProgressCheckerRunnable = new VastVideoViewProgressRunnable(this, this.mVastVideoConfig, handler);
        this.mCountdownRunnable = new VastVideoViewCountdownRunnable(this, handler);
    }

    @VisibleForTesting
    View createAdsByView(Activity activity) {
        return createSocialActionsView(activity, this.mSocialActionsCompanionAds.get(VastXmlManagerAggregator.ADS_BY_AD_SLOT_ID), this.mIconView.getHeight(), 1, this.mIconView, 0, 6);
    }

    @VisibleForTesting
    @Deprecated
    boolean getHasSocialActions() {
        return this.mHasSocialActions;
    }

    @VisibleForTesting
    @Deprecated
    View getSocialActionsView() {
        return this.mSocialActionsView;
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected VideoView getVideoView() {
        return this.mVideoView;
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onCreate() {
        super.onCreate();
        switch (this.mVastVideoConfig.getCustomForceOrientation()) {
            case FORCE_PORTRAIT:
                getBaseVideoViewControllerListener().onSetRequestedOrientation(1);
                break;
            case FORCE_LANDSCAPE:
                getBaseVideoViewControllerListener().onSetRequestedOrientation(6);
                break;
        }
        this.mVastVideoConfig.handleImpression(getContext(), getCurrentPosition());
        broadcastAction(IntentActions.ACTION_INTERSTITIAL_SHOW);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onResume() {
        startRunnables();
        if (this.mSeekerPositionOnPause > 0) {
            this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_PLAYING, this.mSeekerPositionOnPause);
            this.mVideoView.seekTo(this.mSeekerPositionOnPause);
        } else {
            this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_LOADED, getCurrentPosition());
        }
        if (!this.mIsVideoFinishedPlaying) {
            this.mVideoView.start();
        }
        if (this.mSeekerPositionOnPause != -1) {
            this.mVastVideoConfig.handleResume(getContext(), this.mSeekerPositionOnPause);
        }
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onPause() {
        stopRunnables();
        this.mSeekerPositionOnPause = getCurrentPosition();
        this.mVideoView.pause();
        if (this.mIsVideoFinishedPlaying || this.mIsClosing) {
            return;
        }
        this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_PAUSED, getCurrentPosition());
        this.mVastVideoConfig.handlePause(getContext(), this.mSeekerPositionOnPause);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onDestroy() {
        stopRunnables();
        this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_STOPPED, getCurrentPosition());
        this.mExternalViewabilitySessionManager.endVideoSession();
        broadcastAction(IntentActions.ACTION_INTERSTITIAL_DISMISS);
        this.mVideoView.onDestroy();
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(CURRENT_POSITION, this.mSeekerPositionOnPause);
        bundle.putSerializable(RESUMED_VAST_CONFIG, this.mVastVideoConfig);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onConfigurationChanged(Configuration configuration) {
        int i = getContext().getResources().getConfiguration().orientation;
        this.mVastCompanionAdConfig = this.mVastVideoConfig.getVastCompanionAd(i);
        if (this.mLandscapeCompanionAdView.getVisibility() == 0 || this.mPortraitCompanionAdView.getVisibility() == 0) {
            if (i == 1) {
                this.mLandscapeCompanionAdView.setVisibility(4);
                this.mPortraitCompanionAdView.setVisibility(0);
            } else {
                this.mPortraitCompanionAdView.setVisibility(4);
                this.mLandscapeCompanionAdView.setVisibility(0);
            }
            if (this.mVastCompanionAdConfig != null) {
                this.mVastCompanionAdConfig.handleImpression(getContext(), this.mDuration);
            }
        }
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onBackPressed() {
        if (this.mIsVideoFinishedPlaying) {
            return;
        }
        this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_SKIPPED, getCurrentPosition());
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    public boolean backButtonEnabled() {
        return this.mShowCloseButtonEventFired;
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            getBaseVideoViewControllerListener().onFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustSkipOffset() {
        int duration = getDuration();
        if (this.mVastVideoConfig.isRewardedVideo()) {
            this.mShowCloseButtonDelay = duration;
            return;
        }
        if (duration < MAX_VIDEO_DURATION_FOR_CLOSE_BUTTON) {
            this.mShowCloseButtonDelay = duration;
        }
        Integer skipOffsetMillis = this.mVastVideoConfig.getSkipOffsetMillis(duration);
        if (skipOffsetMillis != null) {
            this.mShowCloseButtonDelay = skipOffsetMillis.intValue();
            this.mHasSkipOffset = true;
        }
    }

    private VastVideoView createVideoView(final Context context, int i) {
        if (this.mVastVideoConfig.getDiskMediaFileUrl() == null) {
            throw new IllegalStateException("VastVideoConfig does not have a video disk path");
        }
        final VastVideoView vastVideoView = new VastVideoView(context);
        vastVideoView.setId((int) Utils.generateUniqueId());
        vastVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.mopub.mobileads.VastVideoViewController.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                VastVideoViewController.this.mDuration = VastVideoViewController.this.mVideoView.getDuration();
                VastVideoViewController.this.mExternalViewabilitySessionManager.onVideoPrepared(VastVideoViewController.this.getLayout(), VastVideoViewController.this.mDuration);
                VastVideoViewController.this.adjustSkipOffset();
                if (VastVideoViewController.this.mVastCompanionAdConfig == null || VastVideoViewController.this.mHasSocialActions) {
                    vastVideoView.prepareBlurredLastVideoFrame(VastVideoViewController.this.mBlurredLastVideoFrameImageView, VastVideoViewController.this.mVastVideoConfig.getDiskMediaFileUrl());
                }
                VastVideoViewController.this.mProgressBarWidget.calibrateAndMakeVisible(VastVideoViewController.this.getDuration(), VastVideoViewController.this.mShowCloseButtonDelay);
                VastVideoViewController.this.mRadialCountdownWidget.calibrateAndMakeVisible(VastVideoViewController.this.mShowCloseButtonDelay);
                VastVideoViewController.this.mIsCalibrationDone = true;
            }
        });
        vastVideoView.setOnTouchListener(this.mClickThroughListener);
        vastVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mopub.mobileads.VastVideoViewController.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                VastVideoViewController.this.stopRunnables();
                VastVideoViewController.this.makeVideoInteractable();
                VastVideoViewController.this.videoCompleted(false);
                VastVideoViewController.this.mIsVideoFinishedPlaying = true;
                if (VastVideoViewController.this.mVastVideoConfig.isRewardedVideo()) {
                    VastVideoViewController.this.broadcastAction(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
                }
                if (!VastVideoViewController.this.mVideoError && VastVideoViewController.this.mVastVideoConfig.getRemainingProgressTrackerCount() == 0) {
                    VastVideoViewController.this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_COMPLETE, VastVideoViewController.this.getCurrentPosition());
                    VastVideoViewController.this.mVastVideoConfig.handleComplete(VastVideoViewController.this.getContext(), VastVideoViewController.this.getCurrentPosition());
                }
                vastVideoView.setVisibility(4);
                VastVideoViewController.this.mProgressBarWidget.setVisibility(8);
                if (VastVideoViewController.this.mHasSocialActions) {
                    if (VastVideoViewController.this.mBlurredLastVideoFrameImageView.getDrawable() != null) {
                        VastVideoViewController.this.mBlurredLastVideoFrameImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        VastVideoViewController.this.mBlurredLastVideoFrameImageView.setVisibility(0);
                    }
                } else {
                    VastVideoViewController.this.mIconView.setVisibility(8);
                }
                VastVideoViewController.this.mTopGradientStripWidget.notifyVideoComplete();
                VastVideoViewController.this.mBottomGradientStripWidget.notifyVideoComplete();
                VastVideoViewController.this.mCtaButtonWidget.notifyVideoComplete();
                if (VastVideoViewController.this.mVastCompanionAdConfig == null) {
                    if (VastVideoViewController.this.mBlurredLastVideoFrameImageView.getDrawable() != null) {
                        VastVideoViewController.this.mBlurredLastVideoFrameImageView.setVisibility(0);
                    }
                } else {
                    if (context.getResources().getConfiguration().orientation == 1) {
                        VastVideoViewController.this.mPortraitCompanionAdView.setVisibility(0);
                    } else {
                        VastVideoViewController.this.mLandscapeCompanionAdView.setVisibility(0);
                    }
                    VastVideoViewController.this.mVastCompanionAdConfig.handleImpression(context, VastVideoViewController.this.mDuration);
                }
            }
        });
        vastVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.mopub.mobileads.VastVideoViewController.5
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                VastVideoViewController.this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.RECORD_AD_ERROR, VastVideoViewController.this.getCurrentPosition());
                VastVideoViewController.this.stopRunnables();
                VastVideoViewController.this.makeVideoInteractable();
                VastVideoViewController.this.videoError(false);
                VastVideoViewController.this.mVideoError = true;
                VastVideoViewController.this.mVastVideoConfig.handleError(VastVideoViewController.this.getContext(), VastErrorCode.GENERAL_LINEAR_AD_ERROR, VastVideoViewController.this.getCurrentPosition());
                return false;
            }
        });
        vastVideoView.setVideoPath(this.mVastVideoConfig.getDiskMediaFileUrl());
        vastVideoView.setVisibility(i);
        return vastVideoView;
    }

    private void addTopGradientStripWidget(Context context) {
        this.mTopGradientStripWidget = new VastVideoGradientStripWidget(context, GradientDrawable.Orientation.TOP_BOTTOM, this.mVastVideoConfig.getCustomForceOrientation(), this.mVastCompanionAdConfig != null, 0, 6, getLayout().getId());
        getLayout().addView(this.mTopGradientStripWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mTopGradientStripWidget);
    }

    private void addBottomGradientStripWidget(Context context) {
        this.mBottomGradientStripWidget = new VastVideoGradientStripWidget(context, GradientDrawable.Orientation.BOTTOM_TOP, this.mVastVideoConfig.getCustomForceOrientation(), this.mVastCompanionAdConfig != null, 8, 2, this.mProgressBarWidget.getId());
        getLayout().addView(this.mBottomGradientStripWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mBottomGradientStripWidget);
    }

    private void addProgressBarWidget(Context context, int i) {
        this.mProgressBarWidget = new VastVideoProgressBarWidget(context);
        this.mProgressBarWidget.setAnchorId(this.mVideoView.getId());
        this.mProgressBarWidget.setVisibility(i);
        getLayout().addView(this.mProgressBarWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mProgressBarWidget);
    }

    private void addRadialCountdownWidget(Context context, int i) {
        this.mRadialCountdownWidget = new VastVideoRadialCountdownWidget(context);
        this.mRadialCountdownWidget.setVisibility(i);
        getLayout().addView(this.mRadialCountdownWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mRadialCountdownWidget);
    }

    private void addCtaButtonWidget(Context context) {
        this.mCtaButtonWidget = new VastVideoCtaButtonWidget(context, this.mVideoView.getId(), this.mVastCompanionAdConfig != null, true ^ TextUtils.isEmpty(this.mVastVideoConfig.getClickThroughUrl()));
        getLayout().addView(this.mCtaButtonWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mCtaButtonWidget);
        this.mCtaButtonWidget.setOnTouchListener(this.mClickThroughListener);
        String customCtaText = this.mVastVideoConfig.getCustomCtaText();
        if (customCtaText != null) {
            this.mCtaButtonWidget.updateCtaText(customCtaText);
        }
    }

    private void addCloseButtonWidget(Context context, int i) {
        this.mCloseButtonWidget = new VastVideoCloseButtonWidget(context);
        this.mCloseButtonWidget.setVisibility(i);
        getLayout().addView(this.mCloseButtonWidget);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(this.mCloseButtonWidget);
        this.mCloseButtonWidget.setOnTouchListenerToContent(new View.OnTouchListener() { // from class: com.mopub.mobileads.VastVideoViewController.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int currentPosition;
                if (VastVideoViewController.this.mIsVideoFinishedPlaying) {
                    currentPosition = VastVideoViewController.this.mDuration;
                } else {
                    currentPosition = VastVideoViewController.this.getCurrentPosition();
                }
                if (motionEvent.getAction() == 1) {
                    VastVideoViewController.this.mIsClosing = true;
                    if (!VastVideoViewController.this.mIsVideoFinishedPlaying) {
                        VastVideoViewController.this.mExternalViewabilitySessionManager.recordVideoEvent(ExternalViewabilitySession.VideoEvent.AD_SKIPPED, VastVideoViewController.this.getCurrentPosition());
                    }
                    VastVideoViewController.this.mVastVideoConfig.handleClose(VastVideoViewController.this.getContext(), currentPosition);
                    VastVideoViewController.this.getBaseVideoViewControllerListener().onFinish();
                }
                return true;
            }
        });
        String customSkipText = this.mVastVideoConfig.getCustomSkipText();
        if (customSkipText != null) {
            this.mCloseButtonWidget.updateCloseButtonText(customSkipText);
        }
        String customCloseIconUrl = this.mVastVideoConfig.getCustomCloseIconUrl();
        if (customCloseIconUrl != null) {
            this.mCloseButtonWidget.updateCloseButtonIcon(customCloseIconUrl);
        }
    }

    private void addBlurredLastVideoFrameImageView(Context context, int i) {
        this.mBlurredLastVideoFrameImageView = new ImageView(context);
        this.mBlurredLastVideoFrameImageView.setVisibility(i);
        getLayout().addView(this.mBlurredLastVideoFrameImageView, new RelativeLayout.LayoutParams(-1, -1));
    }

    @VisibleForTesting
    View createCompanionAdView(Context context, VastCompanionAdConfig vastCompanionAdConfig, int i) {
        Preconditions.checkNotNull(context);
        if (vastCompanionAdConfig == null) {
            View view = new View(context);
            view.setVisibility(4);
            return view;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(17);
        getLayout().addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        this.mExternalViewabilitySessionManager.registerVideoObstruction(relativeLayout);
        VastWebView createCompanionVastWebView = createCompanionVastWebView(context, vastCompanionAdConfig);
        createCompanionVastWebView.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Dips.dipsToIntPixels(vastCompanionAdConfig.getWidth() + 16, context), Dips.dipsToIntPixels(vastCompanionAdConfig.getHeight() + 16, context));
        layoutParams.addRule(13, -1);
        relativeLayout.addView(createCompanionVastWebView, layoutParams);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(createCompanionVastWebView);
        return createCompanionVastWebView;
    }

    @VisibleForTesting
    View createSocialActionsView(Context context, VastCompanionAdConfig vastCompanionAdConfig, int i, int i2, View view, int i3, int i4) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(view);
        if (vastCompanionAdConfig == null) {
            View view2 = new View(context);
            view2.setVisibility(4);
            return view2;
        }
        this.mHasSocialActions = true;
        this.mCtaButtonWidget.setHasSocialActions(this.mHasSocialActions);
        VastWebView createCompanionVastWebView = createCompanionVastWebView(context, vastCompanionAdConfig);
        int dipsToIntPixels = Dips.dipsToIntPixels(vastCompanionAdConfig.getWidth(), context);
        int dipsToIntPixels2 = Dips.dipsToIntPixels(vastCompanionAdConfig.getHeight(), context);
        int dipsToIntPixels3 = Dips.dipsToIntPixels(i4, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dipsToIntPixels, dipsToIntPixels2);
        layoutParams.addRule(i2, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.setMargins(dipsToIntPixels3, (i - dipsToIntPixels2) / 2, 0, 0);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(16);
        relativeLayout.addView(createCompanionVastWebView, new RelativeLayout.LayoutParams(-2, -2));
        this.mExternalViewabilitySessionManager.registerVideoObstruction(createCompanionVastWebView);
        getLayout().addView(relativeLayout, layoutParams);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(relativeLayout);
        createCompanionVastWebView.setVisibility(i3);
        return createCompanionVastWebView;
    }

    @VisibleForTesting
    View createIconView(final Context context, final VastIconConfig vastIconConfig, int i) {
        Preconditions.checkNotNull(context);
        if (vastIconConfig == null) {
            return new View(context);
        }
        VastWebView createView = VastWebView.createView(context, vastIconConfig.getVastResource());
        createView.setVastWebViewClickListener(new VastWebView.VastWebViewClickListener() { // from class: com.mopub.mobileads.VastVideoViewController.7
            @Override // com.mopub.mobileads.VastWebView.VastWebViewClickListener
            public void onVastWebViewClick() {
                TrackingRequest.makeVastTrackingHttpRequest(vastIconConfig.getClickTrackingUris(), null, Integer.valueOf(VastVideoViewController.this.getCurrentPosition()), VastVideoViewController.this.getNetworkMediaFileUrl(), context);
                vastIconConfig.handleClick(VastVideoViewController.this.getContext(), null, VastVideoViewController.this.mVastVideoConfig.getDspCreativeId());
            }
        });
        createView.setWebViewClient(new WebViewClient() { // from class: com.mopub.mobileads.VastVideoViewController.8
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                vastIconConfig.handleClick(VastVideoViewController.this.getContext(), str, VastVideoViewController.this.mVastVideoConfig.getDspCreativeId());
                return true;
            }
        });
        createView.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Dips.asIntPixels(vastIconConfig.getWidth(), context), Dips.asIntPixels(vastIconConfig.getHeight(), context));
        layoutParams.setMargins(Dips.dipsToIntPixels(12.0f, context), Dips.dipsToIntPixels(12.0f, context), 0, 0);
        getLayout().addView(createView, layoutParams);
        this.mExternalViewabilitySessionManager.registerVideoObstruction(createView);
        return createView;
    }

    int getDuration() {
        return this.mVideoView.getDuration();
    }

    int getCurrentPosition() {
        return this.mVideoView.getCurrentPosition();
    }

    void makeVideoInteractable() {
        this.mShowCloseButtonEventFired = true;
        this.mRadialCountdownWidget.setVisibility(8);
        this.mCloseButtonWidget.setVisibility(0);
        this.mCtaButtonWidget.notifyVideoSkippable();
        this.mSocialActionsView.setVisibility(0);
    }

    boolean shouldBeInteractable() {
        return !this.mShowCloseButtonEventFired && getCurrentPosition() >= this.mShowCloseButtonDelay;
    }

    void updateCountdown() {
        if (this.mIsCalibrationDone) {
            this.mRadialCountdownWidget.updateCountdownProgress(this.mShowCloseButtonDelay, getCurrentPosition());
        }
    }

    void updateProgressBar() {
        this.mProgressBarWidget.updateProgress(getCurrentPosition());
    }

    String getNetworkMediaFileUrl() {
        if (this.mVastVideoConfig == null) {
            return null;
        }
        return this.mVastVideoConfig.getNetworkMediaFileUrl();
    }

    void handleIconDisplay(int i) {
        if (this.mVastIconConfig == null || i < this.mVastIconConfig.getOffsetMS()) {
            return;
        }
        this.mIconView.setVisibility(0);
        this.mVastIconConfig.handleImpression(getContext(), i, getNetworkMediaFileUrl());
        if (this.mVastIconConfig.getDurationMS() != null && i >= this.mVastIconConfig.getOffsetMS() + this.mVastIconConfig.getDurationMS().intValue()) {
            this.mIconView.setVisibility(8);
        }
    }

    void handleViewabilityQuartileEvent(String str) {
        this.mExternalViewabilitySessionManager.recordVideoEvent((ExternalViewabilitySession.VideoEvent) Enum.valueOf(ExternalViewabilitySession.VideoEvent.class, str), getCurrentPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldAllowClickThrough() {
        return this.mShowCloseButtonEventFired;
    }

    private void startRunnables() {
        this.mProgressCheckerRunnable.startRepeating(VIDEO_PROGRESS_TIMER_CHECKER_DELAY);
        this.mCountdownRunnable.startRepeating(VIDEO_COUNTDOWN_UPDATE_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRunnables() {
        this.mProgressCheckerRunnable.stop();
        this.mCountdownRunnable.stop();
    }

    private VastWebView createCompanionVastWebView(final Context context, final VastCompanionAdConfig vastCompanionAdConfig) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(vastCompanionAdConfig);
        VastWebView createView = VastWebView.createView(context, vastCompanionAdConfig.getVastResource());
        createView.setVastWebViewClickListener(new VastWebView.VastWebViewClickListener() { // from class: com.mopub.mobileads.VastVideoViewController.9
            @Override // com.mopub.mobileads.VastWebView.VastWebViewClickListener
            public void onVastWebViewClick() {
                VastVideoViewController.this.broadcastAction(IntentActions.ACTION_INTERSTITIAL_CLICK);
                TrackingRequest.makeVastTrackingHttpRequest(vastCompanionAdConfig.getClickTrackers(), null, Integer.valueOf(VastVideoViewController.this.mDuration), null, context);
                vastCompanionAdConfig.handleClick(context, 1, null, VastVideoViewController.this.mVastVideoConfig.getDspCreativeId());
            }
        });
        createView.setWebViewClient(new WebViewClient() { // from class: com.mopub.mobileads.VastVideoViewController.10
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                vastCompanionAdConfig.handleClick(context, 1, str, VastVideoViewController.this.mVastVideoConfig.getDspCreativeId());
                return true;
            }
        });
        return createView;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoViewProgressRunnable getProgressCheckerRunnable() {
        return this.mProgressCheckerRunnable;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoViewCountdownRunnable getCountdownRunnable() {
        return this.mCountdownRunnable;
    }

    @VisibleForTesting
    @Deprecated
    boolean getHasSkipOffset() {
        return this.mHasSkipOffset;
    }

    @VisibleForTesting
    @Deprecated
    int getShowCloseButtonDelay() {
        return this.mShowCloseButtonDelay;
    }

    @VisibleForTesting
    @Deprecated
    boolean isShowCloseButtonEventFired() {
        return this.mShowCloseButtonEventFired;
    }

    @VisibleForTesting
    @Deprecated
    void setCloseButtonVisible(boolean z) {
        this.mShowCloseButtonEventFired = z;
    }

    @VisibleForTesting
    @Deprecated
    boolean isVideoFinishedPlaying() {
        return this.mIsVideoFinishedPlaying;
    }

    @VisibleForTesting
    @Deprecated
    boolean isCalibrationDone() {
        return this.mIsCalibrationDone;
    }

    @VisibleForTesting
    @Deprecated
    View getLandscapeCompanionAdView() {
        return this.mLandscapeCompanionAdView;
    }

    @VisibleForTesting
    @Deprecated
    View getPortraitCompanionAdView() {
        return this.mPortraitCompanionAdView;
    }

    @VisibleForTesting
    @Deprecated
    boolean getVideoError() {
        return this.mVideoError;
    }

    @VisibleForTesting
    @Deprecated
    void setVideoError() {
        this.mVideoError = true;
    }

    @VisibleForTesting
    @Deprecated
    View getIconView() {
        return this.mIconView;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoGradientStripWidget getTopGradientStripWidget() {
        return this.mTopGradientStripWidget;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoGradientStripWidget getBottomGradientStripWidget() {
        return this.mBottomGradientStripWidget;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoProgressBarWidget getProgressBarWidget() {
        return this.mProgressBarWidget;
    }

    @VisibleForTesting
    @Deprecated
    void setProgressBarWidget(VastVideoProgressBarWidget vastVideoProgressBarWidget) {
        this.mProgressBarWidget = vastVideoProgressBarWidget;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoRadialCountdownWidget getRadialCountdownWidget() {
        return this.mRadialCountdownWidget;
    }

    @VisibleForTesting
    @Deprecated
    void setRadialCountdownWidget(VastVideoRadialCountdownWidget vastVideoRadialCountdownWidget) {
        this.mRadialCountdownWidget = vastVideoRadialCountdownWidget;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoCtaButtonWidget getCtaButtonWidget() {
        return this.mCtaButtonWidget;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoCloseButtonWidget getCloseButtonWidget() {
        return this.mCloseButtonWidget;
    }

    @VisibleForTesting
    @Deprecated
    ImageView getBlurredLastVideoFrameImageView() {
        return this.mBlurredLastVideoFrameImageView;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoView getVastVideoView() {
        return this.mVideoView;
    }

    @VisibleForTesting
    @Deprecated
    void setIsClosing(boolean z) {
        this.mIsClosing = z;
    }
}
