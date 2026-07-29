package com.mopub.nativeads;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.VastVideoProgressBarWidget;
import com.mopub.mobileads.resource.CloseButtonDrawable;
import com.mopub.mobileads.resource.CtaButtonDrawable;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class NativeFullScreenVideoView extends RelativeLayout {
    private final ImageView mBottomGradient;
    private final ImageView mCachedVideoFrameView;
    private final ImageView mCloseControl;

    @VisibleForTesting
    final int mCloseControlSizePx;

    @VisibleForTesting
    final int mClosePaddingPx;
    private final ImageView mCtaButton;

    @VisibleForTesting
    final int mCtaHeightPx;

    @VisibleForTesting
    final int mCtaMarginPx;

    @VisibleForTesting
    final int mCtaWidthPx;

    @VisibleForTesting
    final int mGradientStripHeightPx;
    private final ProgressBar mLoadingSpinner;

    @VisibleForTesting
    Mode mMode;
    private int mOrientation;
    private final View mOverlay;
    private final ImageView mPlayButton;

    @VisibleForTesting
    final int mPlayControlSizePx;
    private final ImageView mPrivacyInformationIcon;

    @VisibleForTesting
    final int mPrivacyInformationIconSizePx;
    private final ImageView mTopGradient;
    private final VastVideoProgressBarWidget mVideoProgress;
    private final TextureView mVideoTexture;

    public enum Mode {
        LOADING,
        PLAYING,
        PAUSED,
        FINISHED
    }

    public NativeFullScreenVideoView(Context context, int i, String str) {
        this(context, i, str, new ImageView(context), new TextureView(context), new ProgressBar(context), new ImageView(context), new ImageView(context), new VastVideoProgressBarWidget(context), new View(context), new ImageView(context), new ImageView(context), new ImageView(context), new ImageView(context));
    }

    @VisibleForTesting
    NativeFullScreenVideoView(Context context, int i, String str, ImageView imageView, TextureView textureView, ProgressBar progressBar, ImageView imageView2, ImageView imageView3, VastVideoProgressBarWidget vastVideoProgressBarWidget, View view, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7) {
        super(context);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(imageView);
        Preconditions.checkNotNull(textureView);
        Preconditions.checkNotNull(progressBar);
        Preconditions.checkNotNull(imageView2);
        Preconditions.checkNotNull(imageView3);
        Preconditions.checkNotNull(vastVideoProgressBarWidget);
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(imageView4);
        Preconditions.checkNotNull(imageView5);
        Preconditions.checkNotNull(imageView6);
        Preconditions.checkNotNull(imageView7);
        this.mOrientation = i;
        this.mMode = Mode.LOADING;
        this.mCtaWidthPx = Dips.asIntPixels(200.0f, context);
        this.mCtaHeightPx = Dips.asIntPixels(42.0f, context);
        this.mCtaMarginPx = Dips.asIntPixels(10.0f, context);
        this.mCloseControlSizePx = Dips.asIntPixels(50.0f, context);
        this.mClosePaddingPx = Dips.asIntPixels(8.0f, context);
        this.mPrivacyInformationIconSizePx = Dips.asIntPixels(44.0f, context);
        this.mPlayControlSizePx = Dips.asIntPixels(50.0f, context);
        this.mGradientStripHeightPx = Dips.asIntPixels(45.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.mVideoTexture = textureView;
        this.mVideoTexture.setId((int) Utils.generateUniqueId());
        this.mVideoTexture.setLayoutParams(layoutParams);
        addView(this.mVideoTexture);
        this.mCachedVideoFrameView = imageView;
        this.mCachedVideoFrameView.setId((int) Utils.generateUniqueId());
        this.mCachedVideoFrameView.setLayoutParams(layoutParams);
        this.mCachedVideoFrameView.setBackgroundColor(0);
        addView(this.mCachedVideoFrameView);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.mPlayControlSizePx, this.mPlayControlSizePx);
        layoutParams2.addRule(13);
        this.mLoadingSpinner = progressBar;
        this.mLoadingSpinner.setId((int) Utils.generateUniqueId());
        this.mLoadingSpinner.setBackground(new LoadingBackground(context));
        this.mLoadingSpinner.setLayoutParams(layoutParams2);
        this.mLoadingSpinner.setIndeterminate(true);
        addView(this.mLoadingSpinner);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, this.mGradientStripHeightPx);
        layoutParams3.addRule(8, this.mVideoTexture.getId());
        this.mBottomGradient = imageView2;
        this.mBottomGradient.setId((int) Utils.generateUniqueId());
        this.mBottomGradient.setLayoutParams(layoutParams3);
        this.mBottomGradient.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{DrawableConstants.GradientStrip.START_COLOR, DrawableConstants.GradientStrip.END_COLOR}));
        addView(this.mBottomGradient);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, this.mGradientStripHeightPx);
        layoutParams4.addRule(10);
        this.mTopGradient = imageView3;
        this.mTopGradient.setId((int) Utils.generateUniqueId());
        this.mTopGradient.setLayoutParams(layoutParams4);
        this.mTopGradient.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{DrawableConstants.GradientStrip.START_COLOR, DrawableConstants.GradientStrip.END_COLOR}));
        addView(this.mTopGradient);
        this.mVideoProgress = vastVideoProgressBarWidget;
        this.mVideoProgress.setId((int) Utils.generateUniqueId());
        this.mVideoProgress.setAnchorId(this.mVideoTexture.getId());
        this.mVideoProgress.calibrateAndMakeVisible(1000, 0);
        addView(this.mVideoProgress);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(13);
        this.mOverlay = view;
        this.mOverlay.setId((int) Utils.generateUniqueId());
        this.mOverlay.setLayoutParams(layoutParams5);
        this.mOverlay.setBackgroundColor(DrawableConstants.TRANSPARENT_GRAY);
        addView(this.mOverlay);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.mPlayControlSizePx, this.mPlayControlSizePx);
        layoutParams6.addRule(13);
        this.mPlayButton = imageView4;
        this.mPlayButton.setId((int) Utils.generateUniqueId());
        this.mPlayButton.setLayoutParams(layoutParams6);
        this.mPlayButton.setImageDrawable(Drawables.NATIVE_PLAY.createDrawable(context));
        addView(this.mPlayButton);
        this.mPrivacyInformationIcon = imageView5;
        this.mPrivacyInformationIcon.setId((int) Utils.generateUniqueId());
        this.mPrivacyInformationIcon.setImageDrawable(Drawables.NATIVE_PRIVACY_INFORMATION_ICON.createDrawable(context));
        this.mPrivacyInformationIcon.setPadding(this.mClosePaddingPx, this.mClosePaddingPx, this.mClosePaddingPx * 2, this.mClosePaddingPx * 2);
        addView(this.mPrivacyInformationIcon);
        CtaButtonDrawable ctaButtonDrawable = new CtaButtonDrawable(context);
        if (!TextUtils.isEmpty(str)) {
            ctaButtonDrawable.setCtaText(str);
        }
        this.mCtaButton = imageView6;
        this.mCtaButton.setId((int) Utils.generateUniqueId());
        this.mCtaButton.setImageDrawable(ctaButtonDrawable);
        addView(this.mCtaButton);
        this.mCloseControl = imageView7;
        this.mCloseControl.setId((int) Utils.generateUniqueId());
        this.mCloseControl.setImageDrawable(new CloseButtonDrawable());
        this.mCloseControl.setPadding(this.mClosePaddingPx * 3, this.mClosePaddingPx, this.mClosePaddingPx, this.mClosePaddingPx * 3);
        addView(this.mCloseControl);
        updateViewState();
    }

    public void resetProgress() {
        this.mVideoProgress.reset();
    }

    public void setMode(Mode mode) {
        Preconditions.checkNotNull(mode);
        if (this.mMode == mode) {
            return;
        }
        this.mMode = mode;
        updateViewState();
    }

    public TextureView getTextureView() {
        return this.mVideoTexture;
    }

    public void setOrientation(int i) {
        if (this.mOrientation == i) {
            return;
        }
        this.mOrientation = i;
        updateViewState();
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.mVideoTexture.setSurfaceTextureListener(surfaceTextureListener);
        SurfaceTexture surfaceTexture = this.mVideoTexture.getSurfaceTexture();
        if (surfaceTexture == null || surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, this.mVideoTexture.getWidth(), this.mVideoTexture.getHeight());
    }

    public void setCloseControlListener(View.OnClickListener onClickListener) {
        this.mCloseControl.setOnClickListener(onClickListener);
    }

    public void setPrivacyInformationClickListener(View.OnClickListener onClickListener) {
        this.mPrivacyInformationIcon.setOnClickListener(onClickListener);
    }

    public void setCtaClickListener(View.OnClickListener onClickListener) {
        this.mCtaButton.setOnClickListener(onClickListener);
    }

    public void setPlayControlClickListener(View.OnClickListener onClickListener) {
        this.mPlayButton.setOnClickListener(onClickListener);
        this.mOverlay.setOnClickListener(onClickListener);
    }

    public void updateProgress(int i) {
        this.mVideoProgress.updateProgress(i);
    }

    public void setCachedVideoFrame(Bitmap bitmap) {
        this.mCachedVideoFrameView.setImageBitmap(bitmap);
    }

    private void updateViewState() {
        switch (this.mMode) {
            case LOADING:
                setCachedImageVisibility(0);
                setLoadingSpinnerVisibility(0);
                setVideoProgressVisibility(4);
                setPlayButtonVisibility(4);
                break;
            case PLAYING:
                setCachedImageVisibility(4);
                setLoadingSpinnerVisibility(4);
                setVideoProgressVisibility(0);
                setPlayButtonVisibility(4);
                break;
            case PAUSED:
                setCachedImageVisibility(4);
                setLoadingSpinnerVisibility(4);
                setVideoProgressVisibility(0);
                setPlayButtonVisibility(0);
                break;
            case FINISHED:
                setCachedImageVisibility(0);
                setLoadingSpinnerVisibility(4);
                setVideoProgressVisibility(4);
                setPlayButtonVisibility(0);
                break;
        }
        updateVideoTextureLayout();
        updateControlLayouts();
    }

    private void setCachedImageVisibility(int i) {
        this.mCachedVideoFrameView.setVisibility(i);
    }

    private void setLoadingSpinnerVisibility(int i) {
        this.mLoadingSpinner.setVisibility(i);
    }

    private void setVideoProgressVisibility(int i) {
        this.mVideoProgress.setVisibility(i);
    }

    private void setPlayButtonVisibility(int i) {
        this.mPlayButton.setVisibility(i);
        this.mOverlay.setVisibility(i);
    }

    private void updateVideoTextureLayout() {
        Configuration configuration = getContext().getResources().getConfiguration();
        ViewGroup.LayoutParams layoutParams = this.mVideoTexture.getLayoutParams();
        int dipsToIntPixels = Dips.dipsToIntPixels(configuration.screenWidthDp, getContext());
        if (dipsToIntPixels != layoutParams.width) {
            layoutParams.width = dipsToIntPixels;
        }
        int dipsToIntPixels2 = Dips.dipsToIntPixels((configuration.screenWidthDp * 9.0f) / 16.0f, getContext());
        if (dipsToIntPixels2 != layoutParams.height) {
            layoutParams.height = dipsToIntPixels2;
        }
    }

    private void updateControlLayouts() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.mCtaWidthPx, this.mCtaHeightPx);
        layoutParams.setMargins(this.mCtaMarginPx, this.mCtaMarginPx, this.mCtaMarginPx, this.mCtaMarginPx);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.mPrivacyInformationIconSizePx, this.mPrivacyInformationIconSizePx);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.mCloseControlSizePx, this.mCloseControlSizePx);
        switch (this.mOrientation) {
            case 1:
                layoutParams.addRule(3, this.mVideoTexture.getId());
                layoutParams.addRule(14);
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
                layoutParams3.addRule(10);
                layoutParams3.addRule(11);
                break;
            case 2:
                layoutParams.addRule(2, this.mVideoProgress.getId());
                layoutParams.addRule(11);
                layoutParams2.addRule(6, this.mVideoTexture.getId());
                layoutParams2.addRule(5, this.mVideoTexture.getId());
                layoutParams3.addRule(6, this.mVideoTexture.getId());
                layoutParams3.addRule(7, this.mVideoTexture.getId());
                break;
        }
        this.mCtaButton.setLayoutParams(layoutParams);
        this.mPrivacyInformationIcon.setLayoutParams(layoutParams2);
        this.mCloseControl.setLayoutParams(layoutParams3);
    }

    @VisibleForTesting
    static class LoadingBackground extends Drawable {
        private final RectF mButtonRect;

        @VisibleForTesting
        final int mCornerRadiusPx;
        private final Paint mPaint;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        LoadingBackground(Context context) {
            this(context, new RectF(), new Paint());
        }

        LoadingBackground(Context context, RectF rectF, Paint paint) {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(rectF);
            Preconditions.checkNotNull(paint);
            this.mButtonRect = rectF;
            this.mPaint = paint;
            this.mPaint.setColor(-16777216);
            this.mPaint.setAlpha(128);
            this.mPaint.setAntiAlias(true);
            this.mCornerRadiusPx = Dips.asIntPixels(5.0f, context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.mButtonRect.set(getBounds());
            canvas.drawRoundRect(this.mButtonRect, this.mCornerRadiusPx, this.mCornerRadiusPx, this.mPaint);
        }
    }

    @VisibleForTesting
    @Deprecated
    ImageView getCtaButton() {
        return this.mCtaButton;
    }
}
