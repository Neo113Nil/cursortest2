package com.google.android.cameraview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* loaded from: classes3.dex */
abstract class PreviewImpl {
    private Callback mCallback;
    private int mHeight;
    private int mWidth;

    interface Callback {
        void onSurfaceChanged();
    }

    PreviewImpl() {
    }

    protected void dispatchSurfaceChanged() {
        this.mCallback.onSurfaceChanged();
    }

    int getHeight() {
        return this.mHeight;
    }

    abstract Class getOutputClass();

    abstract Surface getSurface();

    SurfaceHolder getSurfaceHolder() {
        return null;
    }

    Object getSurfaceTexture() {
        return null;
    }

    abstract View getView();

    int getWidth() {
        return this.mWidth;
    }

    abstract boolean isReady();

    void setBufferSize(int i8, int i9) {
    }

    void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    abstract void setDisplayOrientation(int i8);

    void setSize(int i8, int i9) {
        this.mWidth = i8;
        this.mHeight = i9;
    }
}
