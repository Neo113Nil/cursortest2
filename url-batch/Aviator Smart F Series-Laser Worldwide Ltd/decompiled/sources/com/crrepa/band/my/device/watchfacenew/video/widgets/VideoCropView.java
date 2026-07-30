package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class VideoCropView extends FrameLayout {
    private VideoCropMaskView videoCropMaskView;
    private VideoCropSlideView videoCropSlideView;

    public VideoCropView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.videoCropSlideView = new VideoCropSlideView(context);
        this.videoCropMaskView = new VideoCropMaskView(context);
        addView(this.videoCropSlideView);
        addView(this.videoCropMaskView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupVideo$0(Uri uri) {
        this.videoCropSlideView.setupVideo(uri, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupVideo$1(Uri uri, boolean z7) {
        this.videoCropSlideView.setupVideo(uri, z7);
    }

    public Rect getScaledRect() {
        return this.videoCropSlideView.getScaledRect();
    }

    public VideoCropSlideView getVideoSlideView() {
        return this.videoCropSlideView;
    }

    public void setBorderStrokeWidth(float f8) {
        this.videoCropMaskView.setBorderStrokeWidth(f8);
    }

    public void setCircleCropFrame(int i8, int i9) {
        this.videoCropMaskView.setCircleFrame(i8, i9);
        this.videoCropSlideView.setCropFrame(i8, i9);
    }

    public void setCornerCropFrame(int i8, int i9, float f8) {
        this.videoCropMaskView.setCornerFrame(i8, i9, f8);
        this.videoCropSlideView.setCropFrame(i8, i9);
    }

    public void setupVideo(final Uri uri) {
        post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.g
            @Override // java.lang.Runnable
            public final void run() {
                VideoCropView.this.lambda$setupVideo$0(uri);
            }
        });
    }

    public void setupVideo(final Uri uri, final boolean z7) {
        post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.widgets.h
            @Override // java.lang.Runnable
            public final void run() {
                VideoCropView.this.lambda$setupVideo$1(uri, z7);
            }
        });
    }

    public VideoCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public VideoCropView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        init(context);
    }
}
