package com.google.android.cameraview;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import androidx.collection.SparseArrayCompat;
import com.crrepa.band.my.device.customkey.util.c;
import com.google.android.cameraview.CameraViewImpl;
import com.google.android.cameraview.PreviewImpl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class Camera1 extends CameraViewImpl {
    private static final SparseArrayCompat<String> FLASH_MODES;
    private static final int INVALID_CAMERA_ID = -1;
    private static final long MIN_TIME_FOR_AUTOFOCUS = 1500;
    private final AtomicBoolean isAutoFocusInProgress;
    private final AtomicBoolean isPictureCaptureInProgress;
    private AspectRatio mAspectRatio;
    private boolean mAutoFocus;
    Camera mCamera;
    private int mCameraId;
    private final Camera.CameraInfo mCameraInfo;
    private Camera.Parameters mCameraParameters;
    private int mDisplayOrientation;
    private int mFacing;
    private int mFlash;
    private final SizeMap mPictureSizes;
    private final SizeMap mPreviewSizes;
    private boolean mShowingPreview;

    static {
        SparseArrayCompat<String> sparseArrayCompat = new SparseArrayCompat<>();
        FLASH_MODES = sparseArrayCompat;
        sparseArrayCompat.put(0, "off");
        sparseArrayCompat.put(1, "on");
        sparseArrayCompat.put(2, "torch");
        sparseArrayCompat.put(3, TtmlNode.TEXT_EMPHASIS_AUTO);
        sparseArrayCompat.put(4, "red-eye");
    }

    Camera1(CameraViewImpl.Callback callback, PreviewImpl previewImpl) {
        super(callback, previewImpl);
        this.isPictureCaptureInProgress = new AtomicBoolean(false);
        this.mCameraInfo = new Camera.CameraInfo();
        this.mPreviewSizes = new SizeMap();
        this.mPictureSizes = new SizeMap();
        this.isAutoFocusInProgress = new AtomicBoolean(false);
        previewImpl.setCallback(new PreviewImpl.Callback() { // from class: com.google.android.cameraview.Camera1.1
            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceChanged() {
                Camera1 camera1 = Camera1.this;
                if (camera1.mCamera != null) {
                    camera1.setUpPreview();
                    Camera1.this.adjustCameraParameters();
                }
            }
        });
    }

    private int calcCameraRotation(int i8) {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo.facing == 1) {
            return (cameraInfo.orientation + i8) % 360;
        }
        return ((this.mCameraInfo.orientation + i8) + (isLandscape(i8) ? c.MAX_GOAL_TIME : 0)) % 360;
    }

    private int calcDisplayOrientation(int i8) {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i8) % 360)) % 360 : ((cameraInfo.orientation - i8) + 360) % 360;
    }

    private AspectRatio chooseAspectRatio() {
        Iterator<AspectRatio> it = this.mPreviewSizes.ratios().iterator();
        AspectRatio aspectRatio = null;
        while (it.hasNext()) {
            aspectRatio = it.next();
            if (aspectRatio.equals(Constants.DEFAULT_ASPECT_RATIO)) {
                break;
            }
        }
        return aspectRatio;
    }

    private void chooseCamera() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i8 = 0; i8 < numberOfCameras; i8++) {
            Camera.getCameraInfo(i8, this.mCameraInfo);
            if (this.mCameraInfo.facing == this.mFacing) {
                this.mCameraId = i8;
                return;
            }
        }
        this.mCameraId = -1;
    }

    private Size chooseOptimalSize(SortedSet<Size> sortedSet) {
        if (!this.mPreview.isReady()) {
            return sortedSet.first();
        }
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        if (isLandscape(this.mDisplayOrientation)) {
            height = width;
            width = height;
        }
        Iterator<Size> it = sortedSet.iterator();
        Size size = null;
        while (it.hasNext()) {
            size = it.next();
            if (width <= size.getWidth() && height <= size.getHeight()) {
                break;
            }
        }
        return size;
    }

    private boolean isLandscape(int i8) {
        return i8 == 90 || i8 == 270;
    }

    private void openCamera() {
        if (this.mCamera != null) {
            releaseCamera();
        }
        Camera open = Camera.open(this.mCameraId);
        this.mCamera = open;
        this.mCameraParameters = open.getParameters();
        this.mPreviewSizes.clear();
        for (Camera.Size size : this.mCameraParameters.getSupportedPreviewSizes()) {
            this.mPreviewSizes.add(new Size(size.width, size.height));
        }
        this.mPictureSizes.clear();
        for (Camera.Size size2 : this.mCameraParameters.getSupportedPictureSizes()) {
            this.mPictureSizes.add(new Size(size2.width, size2.height));
        }
        if (this.mAspectRatio == null) {
            this.mAspectRatio = Constants.DEFAULT_ASPECT_RATIO;
        }
        adjustCameraParameters();
        this.mCamera.setDisplayOrientation(calcDisplayOrientation(this.mDisplayOrientation));
        this.mCallback.onCameraOpened();
    }

    private void releaseCamera() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
            this.mCamera = null;
            this.mCallback.onCameraClosed();
        }
    }

    private boolean setAutoFocusInternal(boolean z7) {
        this.mAutoFocus = z7;
        if (!isCameraOpened()) {
            return false;
        }
        List<String> supportedFocusModes = this.mCameraParameters.getSupportedFocusModes();
        if (z7 && supportedFocusModes.contains("continuous-picture")) {
            this.mCameraParameters.setFocusMode("continuous-picture");
            return true;
        }
        if (supportedFocusModes.contains("fixed")) {
            this.mCameraParameters.setFocusMode("fixed");
            return true;
        }
        if (supportedFocusModes.contains("infinity")) {
            this.mCameraParameters.setFocusMode("infinity");
            return true;
        }
        this.mCameraParameters.setFocusMode(supportedFocusModes.get(0));
        return true;
    }

    private boolean setFlashInternal(int i8) {
        if (!isCameraOpened()) {
            this.mFlash = i8;
            return false;
        }
        List<String> supportedFlashModes = this.mCameraParameters.getSupportedFlashModes();
        SparseArrayCompat<String> sparseArrayCompat = FLASH_MODES;
        String str = sparseArrayCompat.get(i8);
        if (supportedFlashModes != null && supportedFlashModes.contains(str)) {
            this.mCameraParameters.setFlashMode(str);
            this.mFlash = i8;
            return true;
        }
        String str2 = sparseArrayCompat.get(this.mFlash);
        if (supportedFlashModes != null && supportedFlashModes.contains(str2)) {
            return false;
        }
        this.mCameraParameters.setFlashMode("off");
        this.mFlash = 0;
        return true;
    }

    void adjustCameraParameters() {
        SortedSet<Size> sizes = this.mPreviewSizes.sizes(this.mAspectRatio);
        if (sizes == null) {
            AspectRatio chooseAspectRatio = chooseAspectRatio();
            this.mAspectRatio = chooseAspectRatio;
            sizes = this.mPreviewSizes.sizes(chooseAspectRatio);
        }
        Size chooseOptimalSize = chooseOptimalSize(sizes);
        Size last = this.mPictureSizes.sizes(this.mAspectRatio).last();
        if (this.mShowingPreview) {
            this.mCamera.stopPreview();
        }
        this.mCameraParameters.setPreviewSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
        this.mCameraParameters.setPictureSize(last.getWidth(), last.getHeight());
        this.mCameraParameters.setRotation(calcCameraRotation(this.mDisplayOrientation));
        setAutoFocusInternal(this.mAutoFocus);
        setFlashInternal(this.mFlash);
        this.mCamera.setParameters(this.mCameraParameters);
        if (this.mShowingPreview) {
            this.mCamera.startPreview();
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    AspectRatio getAspectRatio() {
        return this.mAspectRatio;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean getAutoFocus() {
        if (!isCameraOpened()) {
            return this.mAutoFocus;
        }
        String focusMode = this.mCameraParameters.getFocusMode();
        return focusMode != null && focusMode.contains("continuous");
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    int getFacing() {
        return this.mFacing;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    int getFlash() {
        return this.mFlash;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    Set<AspectRatio> getSupportedAspectRatios() {
        SizeMap sizeMap = this.mPreviewSizes;
        for (AspectRatio aspectRatio : sizeMap.ratios()) {
            if (this.mPictureSizes.sizes(aspectRatio) == null) {
                sizeMap.remove(aspectRatio);
            }
        }
        return sizeMap.ratios();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean isCameraOpened() {
        return this.mCamera != null;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean setAspectRatio(AspectRatio aspectRatio) {
        if (this.mAspectRatio == null || !isCameraOpened()) {
            this.mAspectRatio = aspectRatio;
            return true;
        }
        if (this.mAspectRatio.equals(aspectRatio)) {
            return false;
        }
        if (this.mPreviewSizes.sizes(aspectRatio) != null) {
            this.mAspectRatio = aspectRatio;
            adjustCameraParameters();
            return true;
        }
        throw new UnsupportedOperationException(aspectRatio + " is not supported");
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setAutoFocus(boolean z7) {
        if (this.mAutoFocus != z7 && setAutoFocusInternal(z7)) {
            this.mCamera.setParameters(this.mCameraParameters);
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setDisplayOrientation(int i8) {
        if (this.mDisplayOrientation == i8) {
            return;
        }
        this.mDisplayOrientation = i8;
        if (isCameraOpened()) {
            this.mCameraParameters.setRotation(calcCameraRotation(i8));
            this.mCamera.setParameters(this.mCameraParameters);
            this.mCamera.setDisplayOrientation(calcDisplayOrientation(i8));
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setFacing(int i8) {
        if (this.mFacing == i8) {
            return;
        }
        this.mFacing = i8;
        if (isCameraOpened()) {
            stop();
            start();
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setFlash(int i8) {
        if (i8 != this.mFlash && setFlashInternal(i8)) {
            this.mCamera.setParameters(this.mCameraParameters);
        }
    }

    @SuppressLint({"NewApi"})
    void setUpPreview() {
        try {
            if (this.mPreview.getOutputClass() == SurfaceHolder.class) {
                this.mCamera.setPreviewDisplay(this.mPreview.getSurfaceHolder());
            } else {
                this.mCamera.setPreviewTexture((SurfaceTexture) this.mPreview.getSurfaceTexture());
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean start() {
        chooseCamera();
        openCamera();
        if (this.mPreview.isReady()) {
            setUpPreview();
        }
        this.mShowingPreview = true;
        this.mCamera.startPreview();
        return true;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void stop() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.stopPreview();
        }
        this.mShowingPreview = false;
        this.isAutoFocusInProgress.set(false);
        releaseCamera();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void takePicture() {
        if (!isCameraOpened()) {
            throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
        }
        if (!getAutoFocus()) {
            takePictureInternal();
            return;
        }
        this.mCamera.cancelAutoFocus();
        this.isAutoFocusInProgress.getAndSet(true);
        try {
            this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.google.android.cameraview.Camera1.2
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z7, Camera camera) {
                    if (Camera1.this.isAutoFocusInProgress.get()) {
                        Camera1.this.isAutoFocusInProgress.set(false);
                        Camera1.this.takePictureInternal();
                    }
                }
            });
        } catch (Exception unused) {
            if (this.isAutoFocusInProgress.get()) {
                this.isAutoFocusInProgress.set(false);
                takePictureInternal();
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.google.android.cameraview.Camera1.3
            @Override // java.lang.Runnable
            public void run() {
                if (Camera1.this.isAutoFocusInProgress.get()) {
                    Camera1.this.isAutoFocusInProgress.set(false);
                    Camera1.this.takePictureInternal();
                }
            }
        }, MIN_TIME_FOR_AUTOFOCUS);
    }

    void takePictureInternal() {
        if (this.isPictureCaptureInProgress.getAndSet(true)) {
            return;
        }
        this.mCamera.takePicture(null, null, null, new Camera.PictureCallback() { // from class: com.google.android.cameraview.Camera1.4
            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                Camera1.this.isPictureCaptureInProgress.set(false);
                Camera1.this.mCallback.onPictureTaken(bArr);
                camera.cancelAutoFocus();
                camera.startPreview();
            }
        });
    }
}
