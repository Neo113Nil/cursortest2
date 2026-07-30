package com.google.android.cameraview;

import android.view.View;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class CameraViewImpl {
    protected final Callback mCallback;
    protected final PreviewImpl mPreview;

    interface Callback {
        void onCameraClosed();

        void onCameraOpened();

        void onPictureTaken(byte[] bArr);
    }

    CameraViewImpl(Callback callback, PreviewImpl previewImpl) {
        this.mCallback = callback;
        this.mPreview = previewImpl;
    }

    abstract AspectRatio getAspectRatio();

    abstract boolean getAutoFocus();

    abstract int getFacing();

    abstract int getFlash();

    abstract Set<AspectRatio> getSupportedAspectRatios();

    View getView() {
        return this.mPreview.getView();
    }

    abstract boolean isCameraOpened();

    abstract boolean setAspectRatio(AspectRatio aspectRatio);

    abstract void setAutoFocus(boolean z7);

    abstract void setDisplayOrientation(int i8);

    abstract void setFacing(int i8);

    abstract void setFlash(int i8);

    abstract boolean start();

    abstract void stop();

    abstract void takePicture();
}
