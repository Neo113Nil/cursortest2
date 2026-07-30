package com.google.android.cameraview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.crrepa.band.my.device.customkey.util.c;

@TargetApi(14)
/* loaded from: classes3.dex */
class TextureViewPreview extends PreviewImpl {
    private int mDisplayOrientation;
    private final TextureView mTextureView;

    TextureViewPreview(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, R.layout.texture_view, viewGroup).findViewById(R.id.texture_view);
        this.mTextureView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.google.android.cameraview.TextureViewPreview.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
                TextureViewPreview.this.setSize(i8, i9);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureViewPreview.this.setSize(0, 0);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
                TextureViewPreview.this.setSize(i8, i9);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    void configureTransform() {
        Matrix matrix = new Matrix();
        int i8 = this.mDisplayOrientation;
        if (i8 % c.MAX_GOAL_TIME == 90) {
            float width = getWidth();
            float height = getHeight();
            matrix.setPolyToPoly(new float[]{0.0f, 0.0f, width, 0.0f, 0.0f, height, width, height}, 0, this.mDisplayOrientation == 90 ? new float[]{0.0f, height, 0.0f, 0.0f, width, height, width, 0.0f} : new float[]{width, 0.0f, width, height, 0.0f, 0.0f, 0.0f, height}, 0, 4);
        } else if (i8 == 180) {
            matrix.postRotate(180.0f, getWidth() / 2, getHeight() / 2);
        }
        this.mTextureView.setTransform(matrix);
    }

    @Override // com.google.android.cameraview.PreviewImpl
    Class getOutputClass() {
        return SurfaceTexture.class;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    Surface getSurface() {
        return new Surface(this.mTextureView.getSurfaceTexture());
    }

    @Override // com.google.android.cameraview.PreviewImpl
    View getView() {
        return this.mTextureView;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    boolean isReady() {
        return this.mTextureView.getSurfaceTexture() != null;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    @TargetApi(15)
    void setBufferSize(int i8, int i9) {
        this.mTextureView.getSurfaceTexture().setDefaultBufferSize(i8, i9);
    }

    @Override // com.google.android.cameraview.PreviewImpl
    void setDisplayOrientation(int i8) {
        this.mDisplayOrientation = i8;
        configureTransform();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.cameraview.PreviewImpl
    public SurfaceTexture getSurfaceTexture() {
        return this.mTextureView.getSurfaceTexture();
    }
}
