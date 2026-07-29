package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.BaseVideoViewController;
import com.mopub.mobileads.VastVideoConfig;
import com.mopub.nativeads.NativeFullScreenVideoView;
import com.mopub.nativeads.NativeVideoController;

/* loaded from: classes2.dex */
public class NativeVideoViewController extends BaseVideoViewController implements AudioManager.OnAudioFocusChangeListener, TextureView.SurfaceTextureListener, NativeVideoController.Listener {
    private Bitmap mCachedVideoFrame;
    private boolean mEnded;
    private boolean mError;
    private final NativeFullScreenVideoView mFullScreenVideoView;
    private int mLatestVideoControllerState;
    private final NativeVideoController mNativeVideoController;
    private VastVideoConfig mVastVideoConfig;
    private VideoState mVideoState;

    enum VideoState {
        NONE,
        LOADING,
        BUFFERING,
        PAUSED,
        PLAYING,
        ENDED,
        FAILED_LOAD
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected VideoView getVideoView() {
        return null;
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onDestroy() {
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onPause() {
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public NativeVideoViewController(Context context, Bundle bundle, Bundle bundle2, BaseVideoViewController.BaseVideoViewControllerListener baseVideoViewControllerListener) {
        this(context, bundle, bundle2, baseVideoViewControllerListener, new NativeFullScreenVideoView(context, context.getResources().getConfiguration().orientation, ((VastVideoConfig) bundle.get(Constants.NATIVE_VAST_VIDEO_CONFIG)).getCustomCtaText()));
    }

    @VisibleForTesting
    NativeVideoViewController(Context context, Bundle bundle, Bundle bundle2, BaseVideoViewController.BaseVideoViewControllerListener baseVideoViewControllerListener, NativeFullScreenVideoView nativeFullScreenVideoView) {
        super(context, null, baseVideoViewControllerListener);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotNull(baseVideoViewControllerListener);
        Preconditions.checkNotNull(nativeFullScreenVideoView);
        this.mVideoState = VideoState.NONE;
        this.mVastVideoConfig = (VastVideoConfig) bundle.get(Constants.NATIVE_VAST_VIDEO_CONFIG);
        this.mFullScreenVideoView = nativeFullScreenVideoView;
        this.mNativeVideoController = NativeVideoController.getForId(((Long) bundle.get(Constants.NATIVE_VIDEO_ID)).longValue());
        Preconditions.checkNotNull(this.mVastVideoConfig);
        Preconditions.checkNotNull(this.mNativeVideoController);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onCreate() {
        this.mFullScreenVideoView.setSurfaceTextureListener(this);
        this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.LOADING);
        this.mFullScreenVideoView.setPlayControlClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.NativeVideoViewController.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NativeVideoViewController.this.mEnded) {
                    NativeVideoViewController.this.mEnded = false;
                    NativeVideoViewController.this.mFullScreenVideoView.resetProgress();
                    NativeVideoViewController.this.mNativeVideoController.seekTo(0L);
                }
                NativeVideoViewController.this.applyState(VideoState.PLAYING);
            }
        });
        this.mFullScreenVideoView.setCloseControlListener(new View.OnClickListener() { // from class: com.mopub.nativeads.NativeVideoViewController.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NativeVideoViewController.this.applyState(VideoState.PAUSED, true);
                NativeVideoViewController.this.getBaseVideoViewControllerListener().onFinish();
            }
        });
        this.mFullScreenVideoView.setCtaClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.NativeVideoViewController.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NativeVideoViewController.this.mNativeVideoController.setPlayWhenReady(false);
                NativeVideoViewController.this.mCachedVideoFrame = NativeVideoViewController.this.mFullScreenVideoView.getTextureView().getBitmap();
                NativeVideoViewController.this.mNativeVideoController.handleCtaClick((Activity) NativeVideoViewController.this.getContext());
            }
        });
        this.mFullScreenVideoView.setPrivacyInformationClickListener(new View.OnClickListener() { // from class: com.mopub.nativeads.NativeVideoViewController.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NativeVideoViewController.this.mNativeVideoController.setPlayWhenReady(false);
                NativeVideoViewController.this.mCachedVideoFrame = NativeVideoViewController.this.mFullScreenVideoView.getTextureView().getBitmap();
                new UrlHandler.Builder().withSupportedUrlActions(UrlAction.OPEN_IN_APP_BROWSER, new UrlAction[0]).build().handleUrl(NativeVideoViewController.this.getContext(), "https://www.mopub.com/optout/");
            }
        });
        this.mFullScreenVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getBaseVideoViewControllerListener().onSetContentView(this.mFullScreenVideoView);
        this.mNativeVideoController.setProgressListener(new NativeVideoController.NativeVideoProgressRunnable.ProgressListener() { // from class: com.mopub.nativeads.NativeVideoViewController.5
            @Override // com.mopub.nativeads.NativeVideoController.NativeVideoProgressRunnable.ProgressListener
            public void updateProgress(int i) {
                NativeVideoViewController.this.mFullScreenVideoView.updateProgress(i);
            }
        });
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onResume() {
        if (this.mCachedVideoFrame != null) {
            this.mFullScreenVideoView.setCachedVideoFrame(this.mCachedVideoFrame);
        }
        this.mNativeVideoController.prepare(this);
        this.mNativeVideoController.setListener(this);
        this.mNativeVideoController.setOnAudioFocusChangeListener(this);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onConfigurationChanged(Configuration configuration) {
        this.mFullScreenVideoView.setOrientation(configuration.orientation);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController
    protected void onBackPressed() {
        applyState(VideoState.PAUSED, true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mNativeVideoController.setTextureView(this.mFullScreenVideoView.getTextureView());
        if (!this.mEnded) {
            this.mNativeVideoController.seekTo(this.mNativeVideoController.getCurrentPosition());
        }
        this.mNativeVideoController.setPlayWhenReady(!this.mEnded);
        if (this.mNativeVideoController.getDuration() - this.mNativeVideoController.getCurrentPosition() < 750) {
            this.mEnded = true;
            maybeChangeState();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.mNativeVideoController.release(this);
        applyState(VideoState.PAUSED);
        return true;
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

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -1 || i == -2) {
            applyState(VideoState.PAUSED);
            return;
        }
        if (i == -3) {
            this.mNativeVideoController.setAudioVolume(0.3f);
        } else if (i == 1) {
            this.mNativeVideoController.setAudioVolume(1.0f);
            maybeChangeState();
        }
    }

    private void maybeChangeState() {
        VideoState videoState = this.mVideoState;
        if (this.mError) {
            videoState = VideoState.FAILED_LOAD;
        } else if (this.mEnded) {
            videoState = VideoState.ENDED;
        } else if (this.mLatestVideoControllerState == 1) {
            videoState = VideoState.LOADING;
        } else if (this.mLatestVideoControllerState == 2) {
            videoState = VideoState.BUFFERING;
        } else if (this.mLatestVideoControllerState == 3) {
            videoState = VideoState.PLAYING;
        } else if (this.mLatestVideoControllerState == 4 || this.mLatestVideoControllerState == 5) {
            videoState = VideoState.ENDED;
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
        if (this.mVideoState == videoState) {
            return;
        }
        switch (videoState) {
            case FAILED_LOAD:
                this.mNativeVideoController.setPlayWhenReady(false);
                this.mNativeVideoController.setAudioEnabled(false);
                this.mNativeVideoController.setAppAudioEnabled(false);
                this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.LOADING);
                this.mVastVideoConfig.handleError(getContext(), null, 0);
                break;
            case LOADING:
            case BUFFERING:
                this.mNativeVideoController.setPlayWhenReady(true);
                this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.LOADING);
                break;
            case PLAYING:
                this.mNativeVideoController.setPlayWhenReady(true);
                this.mNativeVideoController.setAudioEnabled(true);
                this.mNativeVideoController.setAppAudioEnabled(true);
                this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.PLAYING);
                break;
            case PAUSED:
                if (!z) {
                    this.mNativeVideoController.setAppAudioEnabled(false);
                }
                this.mNativeVideoController.setPlayWhenReady(false);
                this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.PAUSED);
                break;
            case ENDED:
                this.mEnded = true;
                this.mNativeVideoController.setAppAudioEnabled(false);
                this.mFullScreenVideoView.updateProgress(1000);
                this.mFullScreenVideoView.setMode(NativeFullScreenVideoView.Mode.FINISHED);
                this.mVastVideoConfig.handleComplete(getContext(), 0);
                break;
        }
        this.mVideoState = videoState;
    }

    @VisibleForTesting
    @Deprecated
    NativeFullScreenVideoView getNativeFullScreenVideoView() {
        return this.mFullScreenVideoView;
    }

    @VisibleForTesting
    @Deprecated
    VideoState getVideoState() {
        return this.mVideoState;
    }
}
