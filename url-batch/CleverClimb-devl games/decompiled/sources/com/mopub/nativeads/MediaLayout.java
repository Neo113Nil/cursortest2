package com.mopub.nativeads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.VastVideoProgressBarWidget;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class MediaLayout extends RelativeLayout {
    private static final float ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH = 1.7777778f;
    private static final float ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT = 0.5625f;
    private static final int CONTROL_SIZE_DIPS = 40;
    private static final int GRADIENT_STRIP_HEIGHT_DIPS = 35;
    private static final int MUTE_SIZE_DIPS = 36;
    private static final int PINNER_PADDING_DIPS = 10;
    private ImageView mBottomGradient;
    private final int mControlSizePx;
    private final int mGradientStripHeightPx;
    private boolean mIsInitialized;
    private ProgressBar mLoadingSpinner;
    private ImageView mMainImageView;
    private volatile Mode mMode;
    private ImageView mMuteControl;
    private final int mMuteSizePx;
    private MuteState mMuteState;
    private Drawable mMutedDrawable;
    private View mOverlay;
    private final int mPaddingPx;
    private ImageView mPlayButton;
    private ImageView mTopGradient;
    private Drawable mUnmutedDrawable;
    private VastVideoProgressBarWidget mVideoProgress;
    private TextureView mVideoTextureView;

    public enum Mode {
        IMAGE,
        PLAYING,
        LOADING,
        BUFFERING,
        PAUSED,
        FINISHED
    }

    public enum MuteState {
        MUTED,
        UNMUTED
    }

    public MediaLayout(Context context) {
        this(context, null);
    }

    public MediaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = Mode.IMAGE;
        Preconditions.checkNotNull(context);
        this.mMuteState = MuteState.MUTED;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.mMainImageView = new ImageView(context);
        this.mMainImageView.setLayoutParams(layoutParams);
        this.mMainImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.mMainImageView);
        this.mControlSizePx = Dips.asIntPixels(40.0f, context);
        this.mGradientStripHeightPx = Dips.asIntPixels(35.0f, context);
        this.mMuteSizePx = Dips.asIntPixels(36.0f, context);
        this.mPaddingPx = Dips.asIntPixels(10.0f, context);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.mVideoTextureView != null) {
            this.mVideoTextureView.setSurfaceTextureListener(surfaceTextureListener);
            SurfaceTexture surfaceTexture = this.mVideoTextureView.getSurfaceTexture();
            if (surfaceTexture == null || surfaceTextureListener == null) {
                return;
            }
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, this.mVideoTextureView.getWidth(), this.mVideoTextureView.getHeight());
        }
    }

    public void initForVideo() {
        if (this.mIsInitialized) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.mVideoTextureView = new TextureView(getContext());
        this.mVideoTextureView.setLayoutParams(layoutParams);
        this.mVideoTextureView.setId((int) Utils.generateUniqueId());
        addView(this.mVideoTextureView);
        this.mMainImageView.bringToFront();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.mControlSizePx, this.mControlSizePx);
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        this.mLoadingSpinner = new ProgressBar(getContext());
        this.mLoadingSpinner.setLayoutParams(layoutParams2);
        this.mLoadingSpinner.setPadding(0, this.mPaddingPx, this.mPaddingPx, 0);
        this.mLoadingSpinner.setIndeterminate(true);
        addView(this.mLoadingSpinner);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, this.mGradientStripHeightPx);
        layoutParams3.addRule(8, this.mVideoTextureView.getId());
        this.mBottomGradient = new ImageView(getContext());
        this.mBottomGradient.setLayoutParams(layoutParams3);
        this.mBottomGradient.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{DrawableConstants.GradientStrip.START_COLOR, DrawableConstants.GradientStrip.END_COLOR}));
        addView(this.mBottomGradient);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, this.mGradientStripHeightPx);
        layoutParams4.addRule(6, this.mVideoTextureView.getId());
        this.mTopGradient = new ImageView(getContext());
        this.mTopGradient.setLayoutParams(layoutParams4);
        this.mTopGradient.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{DrawableConstants.GradientStrip.START_COLOR, DrawableConstants.GradientStrip.END_COLOR}));
        addView(this.mTopGradient);
        this.mVideoProgress = new VastVideoProgressBarWidget(getContext());
        this.mVideoProgress.setAnchorId(this.mVideoTextureView.getId());
        this.mVideoProgress.calibrateAndMakeVisible(1000, 0);
        addView(this.mVideoProgress);
        this.mMutedDrawable = Drawables.NATIVE_MUTED.createDrawable(getContext());
        this.mUnmutedDrawable = Drawables.NATIVE_UNMUTED.createDrawable(getContext());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.mMuteSizePx, this.mMuteSizePx);
        layoutParams5.addRule(9);
        layoutParams5.addRule(2, this.mVideoProgress.getId());
        this.mMuteControl = new ImageView(getContext());
        this.mMuteControl.setLayoutParams(layoutParams5);
        this.mMuteControl.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mMuteControl.setPadding(this.mPaddingPx, this.mPaddingPx, this.mPaddingPx, this.mPaddingPx);
        this.mMuteControl.setImageDrawable(this.mMutedDrawable);
        addView(this.mMuteControl);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(13);
        this.mOverlay = new View(getContext());
        this.mOverlay.setLayoutParams(layoutParams6);
        this.mOverlay.setBackgroundColor(0);
        addView(this.mOverlay);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(this.mControlSizePx, this.mControlSizePx);
        layoutParams7.addRule(13);
        this.mPlayButton = new ImageView(getContext());
        this.mPlayButton.setLayoutParams(layoutParams7);
        this.mPlayButton.setImageDrawable(Drawables.NATIVE_PLAY.createDrawable(getContext()));
        addView(this.mPlayButton);
        this.mIsInitialized = true;
        updateViewState();
    }

    public void reset() {
        setMode(Mode.IMAGE);
        setPlayButtonClickListener(null);
        setMuteControlClickListener(null);
        setVideoClickListener(null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, measuredWidth) : measuredWidth;
        }
        int i3 = (int) (size * ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT);
        if (mode2 == 1073741824 && size2 < i3) {
            size = (int) (size2 * ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH);
            i3 = size2;
        }
        if (Math.abs(i3 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            MoPubLog.v(String.format("Resetting mediaLayout size to w: %d h: %d", Integer.valueOf(size), Integer.valueOf(i3)));
            getLayoutParams().width = size;
            getLayoutParams().height = i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMainImageDrawable(Drawable drawable) {
        Preconditions.checkNotNull(drawable);
        this.mMainImageView.setImageDrawable(drawable);
    }

    public void resetProgress() {
        if (this.mVideoProgress != null) {
            this.mVideoProgress.reset();
        }
    }

    public void updateProgress(int i) {
        if (this.mVideoProgress != null) {
            this.mVideoProgress.updateProgress(i);
        }
    }

    public TextureView getTextureView() {
        return this.mVideoTextureView;
    }

    public void setMode(Mode mode) {
        Preconditions.checkNotNull(mode);
        this.mMode = mode;
        post(new Runnable() { // from class: com.mopub.nativeads.MediaLayout.1
            @Override // java.lang.Runnable
            public void run() {
                MediaLayout.this.updateViewState();
            }
        });
    }

    public ImageView getMainImageView() {
        return this.mMainImageView;
    }

    public void setMuteControlClickListener(View.OnClickListener onClickListener) {
        if (this.mMuteControl != null) {
            this.mMuteControl.setOnClickListener(onClickListener);
        }
    }

    public void setPlayButtonClickListener(View.OnClickListener onClickListener) {
        if (this.mPlayButton == null || this.mOverlay == null) {
            return;
        }
        this.mOverlay.setOnClickListener(onClickListener);
        this.mPlayButton.setOnClickListener(onClickListener);
    }

    public void setVideoClickListener(View.OnClickListener onClickListener) {
        if (this.mVideoTextureView != null) {
            this.mVideoTextureView.setOnClickListener(onClickListener);
        }
    }

    public void setMuteState(MuteState muteState) {
        Preconditions.checkNotNull(muteState);
        if (muteState == this.mMuteState) {
            return;
        }
        this.mMuteState = muteState;
        if (this.mMuteControl != null) {
            if (AnonymousClass2.$SwitchMap$com$mopub$nativeads$MediaLayout$MuteState[this.mMuteState.ordinal()] == 1) {
                this.mMuteControl.setImageDrawable(this.mMutedDrawable);
            } else {
                this.mMuteControl.setImageDrawable(this.mUnmutedDrawable);
            }
        }
    }

    /* renamed from: com.mopub.nativeads.MediaLayout$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$mopub$nativeads$MediaLayout$MuteState;

        static {
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.BUFFERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.PLAYING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$Mode[Mode.FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $SwitchMap$com$mopub$nativeads$MediaLayout$MuteState = new int[MuteState.values().length];
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$MuteState[MuteState.MUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$mopub$nativeads$MediaLayout$MuteState[MuteState.UNMUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewState() {
        switch (this.mMode) {
            case IMAGE:
                setMainImageVisibility(0);
                setLoadingSpinnerVisibility(4);
                setVideoControlVisibility(4);
                setPlayButtonVisibility(4);
                return;
            case LOADING:
                setMainImageVisibility(0);
                setLoadingSpinnerVisibility(0);
                setVideoControlVisibility(4);
                setPlayButtonVisibility(4);
                return;
            case BUFFERING:
                setMainImageVisibility(4);
                setLoadingSpinnerVisibility(0);
                setVideoControlVisibility(0);
                setPlayButtonVisibility(4);
                break;
            case PLAYING:
                break;
            case PAUSED:
                setMainImageVisibility(4);
                setLoadingSpinnerVisibility(4);
                setVideoControlVisibility(0);
                setPlayButtonVisibility(0);
                return;
            case FINISHED:
                setMainImageVisibility(0);
                setLoadingSpinnerVisibility(4);
                setVideoControlVisibility(4);
                setPlayButtonVisibility(0);
                return;
            default:
                return;
        }
        setMainImageVisibility(4);
        setLoadingSpinnerVisibility(4);
        setVideoControlVisibility(0);
        setPlayButtonVisibility(4);
    }

    private void setMainImageVisibility(int i) {
        this.mMainImageView.setVisibility(i);
    }

    private void setLoadingSpinnerVisibility(int i) {
        if (this.mLoadingSpinner != null) {
            this.mLoadingSpinner.setVisibility(i);
        }
        if (this.mTopGradient != null) {
            this.mTopGradient.setVisibility(i);
        }
    }

    private void setVideoControlVisibility(int i) {
        if (this.mBottomGradient != null) {
            this.mBottomGradient.setVisibility(i);
        }
        if (this.mVideoProgress != null) {
            this.mVideoProgress.setVisibility(i);
        }
        if (this.mMuteControl != null) {
            this.mMuteControl.setVisibility(i);
        }
    }

    private void setPlayButtonVisibility(int i) {
        if (this.mPlayButton == null || this.mOverlay == null) {
            return;
        }
        this.mPlayButton.setVisibility(i);
        this.mOverlay.setVisibility(i);
    }
}
