package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class VideoCropSlideView extends FrameLayout {
    private float frameH;
    private float frameW;
    private float initialTouchX;
    private float initialTouchY;
    private float maxMarginLeft;
    private float maxMarginTop;
    private float minScale;
    private MediaPlayer.OnPreparedListener preparedListener;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    e videoCropScaleRestorer;
    private float videoOriginalH;
    private float videoOriginalW;
    private VideoView videoView;

    private class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NonNull ScaleGestureDetector scaleGestureDetector) {
            VideoCropSlideView.access$132(VideoCropSlideView.this, scaleGestureDetector.getScaleFactor());
            if (VideoCropSlideView.this.scaleFactor < 1.0f) {
                VideoCropSlideView.this.scaleFactor = 1.0f;
            }
            float f8 = VideoCropSlideView.this.videoOriginalW * VideoCropSlideView.this.scaleFactor;
            float f9 = VideoCropSlideView.this.videoOriginalH * VideoCropSlideView.this.scaleFactor;
            VideoCropSlideView.this.updateVideoViewMargin(scaleGestureDetector.getFocusX() - f8, scaleGestureDetector.getFocusY() - f9);
            VideoCropSlideView.this.updateVideoViewLayout(f8, f9);
            return true;
        }
    }

    public VideoCropSlideView(@NonNull Context context) {
        super(context);
        this.scaleFactor = 1.0f;
        this.minScale = 1.0f;
        init();
    }

    static /* synthetic */ float access$132(VideoCropSlideView videoCropSlideView, float f8) {
        float f9 = videoCropSlideView.scaleFactor * f8;
        videoCropSlideView.scaleFactor = f9;
        return f9;
    }

    private void init() {
        VideoView videoView = new VideoView(getContext());
        this.videoView = videoView;
        addView(videoView);
        this.videoCropScaleRestorer = new e();
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), new b());
    }

    private void initVideoViewLayoutParams(int i8, int i9) {
        float f8;
        float f9;
        float f10;
        if (i9 > i8) {
            float f11 = this.frameW;
            f10 = f11 / i8;
            this.videoOriginalW = f11;
            float f12 = i9 * f10;
            this.videoOriginalH = f12;
            f8 = this.maxMarginLeft;
            f9 = this.maxMarginTop - ((f12 / 2.0f) - (this.frameH / 2.0f));
        } else {
            float f13 = this.frameH;
            float f14 = f13 / i9;
            float f15 = i8 * f14;
            this.videoOriginalW = f15;
            this.videoOriginalH = f13;
            f8 = this.maxMarginLeft - ((f15 / 2.0f) - (this.frameW / 2.0f));
            f9 = this.maxMarginTop;
            f10 = f14;
        }
        this.minScale = f10;
        this.scaleFactor = f10;
        updateVideoViewLayout(this.videoOriginalW, this.videoOriginalH);
        updateVideoViewMargin(f8, f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupVideo$0(boolean z7, MediaPlayer mediaPlayer) {
        if (z7) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
        MediaPlayer.OnPreparedListener onPreparedListener = this.preparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
        initVideoViewLayoutParams(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
    }

    private void moveVideo(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.initialTouchX = motionEvent.getX();
            this.initialTouchY = motionEvent.getY();
        } else {
            if (action != 2) {
                return;
            }
            updateVideoViewMargin(motionEvent.getX() - this.initialTouchX, motionEvent.getY() - this.initialTouchY);
            this.initialTouchX = motionEvent.getX();
            this.initialTouchY = motionEvent.getY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoViewLayout(float f8, float f9) {
        this.videoView.setLayoutParams(new FrameLayout.LayoutParams((int) f8, (int) f9));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.videoView.getLayoutParams();
        float f10 = this.scaleFactor;
        float f11 = this.minScale;
        if (f10 < f11) {
            f10 = f11;
        }
        this.videoCropScaleRestorer.updateMatrix(f10, layoutParams.leftMargin, layoutParams.topMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoViewMargin(float f8, float f9) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.videoView.getLayoutParams();
        int i8 = (int) (layoutParams.leftMargin + f8);
        layoutParams.leftMargin = i8;
        int i9 = (int) (layoutParams.topMargin + f9);
        layoutParams.topMargin = i9;
        float f10 = i8;
        float f11 = this.maxMarginLeft;
        if (f10 > f11) {
            layoutParams.leftMargin = (int) f11;
        }
        float f12 = (f11 - layoutParams.width) + this.frameW;
        if (layoutParams.leftMargin < f12) {
            layoutParams.leftMargin = (int) f12;
        }
        float f13 = i9;
        float f14 = this.maxMarginTop;
        if (f13 > f14) {
            layoutParams.topMargin = (int) f14;
        }
        float f15 = (f14 - layoutParams.height) + this.frameH;
        if (layoutParams.topMargin < f15) {
            layoutParams.topMargin = (int) f15;
        }
        this.videoView.setLayoutParams(layoutParams);
        float f16 = this.scaleFactor;
        float f17 = this.minScale;
        if (f16 < f17) {
            f16 = f17;
        }
        this.videoCropScaleRestorer.updateMatrix(f16, layoutParams.leftMargin, layoutParams.topMargin);
    }

    public Rect getScaledRect() {
        return this.videoCropScaleRestorer.calculateOriginalCoordinates(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.frameW, this.frameH);
    }

    public VideoView getVideoView() {
        return this.videoView;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.maxMarginLeft = (getMeasuredWidth() / 2.0f) - (this.frameW / 2.0f);
        this.maxMarginTop = (getMeasuredHeight() / 2.0f) - (this.frameH / 2.0f);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.scaleGestureDetector.onTouchEvent(motionEvent);
        moveVideo(motionEvent);
        return true;
    }

    public void setCropFrame(int i8, int i9) {
        this.frameW = i8;
        this.frameH = i9;
    }

    public void setPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.preparedListener = onPreparedListener;
    }

    public void setupVideo(Uri uri, final boolean z7) {
        this.videoView.setVideoURI(uri);
        this.videoView.requestFocus();
        this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.f
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoCropSlideView.this.lambda$setupVideo$0(z7, mediaPlayer);
            }
        });
    }

    public VideoCropSlideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scaleFactor = 1.0f;
        this.minScale = 1.0f;
        init();
    }

    public VideoCropSlideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.scaleFactor = 1.0f;
        this.minScale = 1.0f;
        init();
    }
}
