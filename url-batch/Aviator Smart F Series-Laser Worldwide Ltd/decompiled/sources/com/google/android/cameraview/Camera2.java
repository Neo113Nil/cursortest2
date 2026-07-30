package com.google.android.cameraview;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.google.android.cameraview.CameraViewImpl;
import com.google.android.cameraview.PreviewImpl;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

@TargetApi(21)
/* loaded from: classes3.dex */
class Camera2 extends CameraViewImpl {
    private static final SparseIntArray INTERNAL_FACINGS;
    private static final int MAX_PREVIEW_HEIGHT = 1080;
    private static final int MAX_PREVIEW_WIDTH = 1920;
    private static final String TAG = "Camera2";
    private boolean initInProgress;
    private AspectRatio mAspectRatio;
    private boolean mAutoFocus;
    CameraDevice mCamera;
    private CameraCharacteristics mCameraCharacteristics;
    private final CameraDevice.StateCallback mCameraDeviceCallback;
    private String mCameraId;
    private final CameraManager mCameraManager;
    PictureCaptureCallback mCaptureCallback;
    CameraCaptureSession mCaptureSession;
    private int mDisplayOrientation;
    private int mFacing;
    private int mFlash;
    private ImageReader mImageReader;
    private final ImageReader.OnImageAvailableListener mOnImageAvailableListener;
    private final SizeMap mPictureSizes;
    CaptureRequest.Builder mPreviewRequestBuilder;
    private final SizeMap mPreviewSizes;
    private final CameraCaptureSession.StateCallback mSessionCallback;

    private static abstract class PictureCaptureCallback extends CameraCaptureSession.CaptureCallback {
        static final int STATE_CAPTURING = 5;
        static final int STATE_LOCKED = 2;
        static final int STATE_LOCKING = 1;
        static final int STATE_PRECAPTURE = 3;
        static final int STATE_PREVIEW = 0;
        static final int STATE_WAITING = 4;
        private int mState;

        PictureCaptureCallback() {
        }

        private void process(@NonNull CaptureResult captureResult) {
            int i8 = this.mState;
            if (i8 == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num2 == null || num2.intValue() == 2) {
                        setState(5);
                        onReady();
                        return;
                    } else {
                        setState(2);
                        onPrecaptureRequired();
                        return;
                    }
                }
                return;
            }
            if (i8 == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    setState(4);
                    return;
                }
                return;
            }
            if (i8 != 4) {
                return;
            }
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num4 == null || num4.intValue() != 5) {
                setState(5);
                onReady();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            process(captureResult);
        }

        public abstract void onPrecaptureRequired();

        public abstract void onReady();

        void setState(int i8) {
            this.mState = i8;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        INTERNAL_FACINGS = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 0);
    }

    Camera2(CameraViewImpl.Callback callback, PreviewImpl previewImpl, Context context) {
        super(callback, previewImpl);
        this.mCameraDeviceCallback = new CameraDevice.StateCallback() { // from class: com.google.android.cameraview.Camera2.1
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(@NonNull CameraDevice cameraDevice) {
                Camera2.this.mCallback.onCameraClosed();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(@NonNull CameraDevice cameraDevice) {
                Camera2.this.mCamera = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(@NonNull CameraDevice cameraDevice, int i8) {
                Log.e(Camera2.TAG, "onError: " + cameraDevice.getId() + " (" + i8 + ")");
                Camera2.this.mCamera = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(@NonNull CameraDevice cameraDevice) {
                Camera2 camera2 = Camera2.this;
                camera2.mCamera = cameraDevice;
                camera2.mCallback.onCameraOpened();
                Camera2.this.startCaptureSession();
            }
        };
        this.mSessionCallback = new CameraCaptureSession.StateCallback() { // from class: com.google.android.cameraview.Camera2.2
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
                CameraCaptureSession cameraCaptureSession2 = Camera2.this.mCaptureSession;
                if (cameraCaptureSession2 == null || !cameraCaptureSession2.equals(cameraCaptureSession)) {
                    return;
                }
                Camera2.this.mCaptureSession = null;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                Log.e(Camera2.TAG, "Failed to configure capture session.");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                Camera2 camera2 = Camera2.this;
                if (camera2.mCamera == null) {
                    return;
                }
                camera2.mCaptureSession = cameraCaptureSession;
                camera2.updateAutoFocus();
                Camera2.this.updateFlash();
                try {
                    Camera2 camera22 = Camera2.this;
                    camera22.mCaptureSession.setRepeatingRequest(camera22.mPreviewRequestBuilder.build(), Camera2.this.mCaptureCallback, null);
                } catch (CameraAccessException e8) {
                    Log.e(Camera2.TAG, "Failed to start camera preview because it couldn't access camera", e8);
                } catch (IllegalStateException e9) {
                    Log.e(Camera2.TAG, "Failed to start camera preview.", e9);
                }
            }
        };
        this.mCaptureCallback = new PictureCaptureCallback() { // from class: com.google.android.cameraview.Camera2.3
            @Override // com.google.android.cameraview.Camera2.PictureCaptureCallback
            public void onPrecaptureRequired() {
                CaptureRequest.Builder builder = Camera2.this.mPreviewRequestBuilder;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                builder.set(key, 1);
                setState(3);
                try {
                    Camera2 camera2 = Camera2.this;
                    camera2.mCaptureSession.capture(camera2.mPreviewRequestBuilder.build(), this, null);
                    Camera2.this.mPreviewRequestBuilder.set(key, 0);
                } catch (CameraAccessException e8) {
                    Log.e(Camera2.TAG, "Failed to run precapture sequence.", e8);
                }
            }

            @Override // com.google.android.cameraview.Camera2.PictureCaptureCallback
            public void onReady() {
                Camera2.this.captureStillPicture();
            }
        };
        this.mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: com.google.android.cameraview.Camera2.4
            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                Image acquireNextImage = imageReader.acquireNextImage();
                try {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (planes.length > 0) {
                        ByteBuffer buffer = planes[0].getBuffer();
                        byte[] bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                        Camera2.this.mCallback.onPictureTaken(bArr);
                    }
                    acquireNextImage.close();
                } catch (Throwable th) {
                    if (acquireNextImage != null) {
                        try {
                            acquireNextImage.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
        this.mPreviewSizes = new SizeMap();
        this.mPictureSizes = new SizeMap();
        this.mAspectRatio = Constants.DEFAULT_ASPECT_RATIO;
        this.initInProgress = false;
        this.mCameraManager = (CameraManager) context.getSystemService(PixelReadParams.DEFAULT_FILTER_ID);
        this.mPreview.setCallback(new PreviewImpl.Callback() { // from class: com.google.android.cameraview.Camera2.5
            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceChanged() {
                Camera2.this.startCaptureSession();
            }
        });
    }

    private boolean chooseCameraIdByFacing() {
        try {
            int i8 = INTERNAL_FACINGS.get(this.mFacing);
            String[] cameraIdList = this.mCameraManager.getCameraIdList();
            if (cameraIdList.length == 0) {
                throw new RuntimeException("No camera available.");
            }
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() != 2) {
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num2 == null) {
                        throw new NullPointerException("Unexpected state: LENS_FACING null");
                    }
                    if (num2.intValue() == i8) {
                        this.mCameraId = str;
                        this.mCameraCharacteristics = cameraCharacteristics;
                        return true;
                    }
                }
            }
            String str2 = cameraIdList[0];
            this.mCameraId = str2;
            CameraCharacteristics cameraCharacteristics2 = this.mCameraManager.getCameraCharacteristics(str2);
            this.mCameraCharacteristics = cameraCharacteristics2;
            Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num3 != null && num3.intValue() != 2) {
                Integer num4 = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num4 == null) {
                    throw new NullPointerException("Unexpected state: LENS_FACING null");
                }
                int size = INTERNAL_FACINGS.size();
                for (int i9 = 0; i9 < size; i9++) {
                    SparseIntArray sparseIntArray = INTERNAL_FACINGS;
                    if (sparseIntArray.valueAt(i9) == num4.intValue()) {
                        this.mFacing = sparseIntArray.keyAt(i9);
                        return true;
                    }
                }
                this.mFacing = 0;
                return true;
            }
            return false;
        } catch (CameraAccessException e8) {
            throw new RuntimeException("Failed to get a list of camera devices", e8);
        }
    }

    private Size chooseOptimalSize() {
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        if (width < height) {
            height = width;
            width = height;
        }
        SortedSet<Size> sizes = this.mPreviewSizes.sizes(this.mAspectRatio);
        for (Size size : sizes) {
            if (size.getWidth() >= width && size.getHeight() >= height) {
                return size;
            }
        }
        return sizes.last();
    }

    private void collectCameraInfo() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalStateException("Failed to get configuration map: " + this.mCameraId);
        }
        this.mPreviewSizes.clear();
        for (android.util.Size size : streamConfigurationMap.getOutputSizes(this.mPreview.getOutputClass())) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (width <= MAX_PREVIEW_WIDTH && height <= MAX_PREVIEW_HEIGHT) {
                this.mPreviewSizes.add(new Size(width, height));
            }
        }
        this.mPictureSizes.clear();
        collectPictureSizes(this.mPictureSizes, streamConfigurationMap);
        Set<AspectRatio> ratios = this.mPreviewSizes.ratios();
        Set<AspectRatio> ratios2 = this.mPictureSizes.ratios();
        Iterator it = new HashSet(ratios).iterator();
        while (it.hasNext()) {
            AspectRatio aspectRatio = (AspectRatio) it.next();
            if (!ratios2.contains(aspectRatio)) {
                this.mPreviewSizes.remove(aspectRatio);
            }
        }
        if (this.mPreviewSizes.ratios().contains(this.mAspectRatio)) {
            return;
        }
        Set<AspectRatio> ratios3 = this.mPreviewSizes.ratios();
        if (ratios3.isEmpty()) {
            return;
        }
        this.mAspectRatio = ratios3.iterator().next();
    }

    private void lockFocus() {
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder == null) {
            Log.e(TAG, "mPreviewRequestBuilder is null!");
            return;
        }
        try {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.mCaptureCallback.setState(1);
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
        } catch (CameraAccessException | IllegalStateException | NullPointerException e8) {
            Log.e(TAG, "Failed to lock focus.", e8);
        }
    }

    private void prepareImageReader() {
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        SortedSet<Size> sizes = this.mPictureSizes.sizes(this.mAspectRatio);
        Size size = (sizes == null || sizes.isEmpty()) ? new Size(MAX_PREVIEW_WIDTH, MAX_PREVIEW_HEIGHT) : sizes.last();
        ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 2);
        this.mImageReader = newInstance;
        newInstance.setOnImageAvailableListener(this.mOnImageAvailableListener, null);
    }

    private void startOpeningCamera() {
        try {
            this.mCameraManager.openCamera(this.mCameraId, this.mCameraDeviceCallback, (Handler) null);
        } catch (CameraAccessException e8) {
            throw new RuntimeException("Failed to open camera: " + this.mCameraId, e8);
        }
    }

    void captureStillPicture() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.mCamera.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.mImageReader.getSurface());
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            createCaptureRequest.set(key, (Integer) this.mPreviewRequestBuilder.get(key));
            int i8 = this.mFlash;
            int i9 = 1;
            if (i8 == 0) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i8 == 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            } else if (i8 == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            } else if (i8 == 3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i8 == 4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            }
            int intValue = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
            int i10 = this.mDisplayOrientation;
            if (this.mFacing != 1) {
                i9 = -1;
            }
            createCaptureRequest.set(key2, Integer.valueOf(((intValue + (i10 * i9)) + 360) % 360));
            this.mCaptureSession.stopRepeating();
            this.mCaptureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() { // from class: com.google.android.cameraview.Camera2.7
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    Camera2.this.unlockFocus();
                }
            }, null);
        } catch (CameraAccessException e8) {
            Log.e(TAG, "Cannot capture a still picture.", e8);
        }
    }

    protected void collectPictureSizes(SizeMap sizeMap, StreamConfigurationMap streamConfigurationMap) {
        for (android.util.Size size : streamConfigurationMap.getOutputSizes(256)) {
            this.mPictureSizes.add(new Size(size.getWidth(), size.getHeight()));
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    AspectRatio getAspectRatio() {
        return this.mAspectRatio;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean getAutoFocus() {
        return this.mAutoFocus;
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
        return this.mPreviewSizes.ratios();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean isCameraOpened() {
        return this.mCamera != null;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean setAspectRatio(AspectRatio aspectRatio) {
        if (aspectRatio == null || aspectRatio.equals(this.mAspectRatio) || !this.mPreviewSizes.ratios().contains(aspectRatio)) {
            return false;
        }
        this.mAspectRatio = aspectRatio;
        prepareImageReader();
        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
        if (cameraCaptureSession == null) {
            return true;
        }
        cameraCaptureSession.close();
        this.mCaptureSession = null;
        startCaptureSession();
        return true;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setAutoFocus(boolean z7) {
        if (this.mAutoFocus == z7) {
            return;
        }
        this.mAutoFocus = z7;
        if (this.mPreviewRequestBuilder != null) {
            updateAutoFocus();
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    this.mAutoFocus = !this.mAutoFocus;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void setDisplayOrientation(int i8) {
        this.mDisplayOrientation = i8;
        this.mPreview.setDisplayOrientation(i8);
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
        int i9 = this.mFlash;
        if (i9 == i8) {
            return;
        }
        this.mFlash = i8;
        if (this.mPreviewRequestBuilder != null) {
            updateFlash();
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                } catch (CameraAccessException unused) {
                    this.mFlash = i9;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    boolean start() {
        if (!chooseCameraIdByFacing()) {
            return false;
        }
        collectCameraInfo();
        prepareImageReader();
        startOpeningCamera();
        return true;
    }

    void startCaptureSession() {
        if (isCameraOpened() && this.mPreview.isReady() && this.mImageReader != null) {
            Size chooseOptimalSize = chooseOptimalSize();
            this.mPreview.setBufferSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
            if (this.initInProgress) {
                return;
            }
            this.initInProgress = true;
            new Handler().postDelayed(new Runnable() { // from class: com.google.android.cameraview.Camera2.6
                @Override // java.lang.Runnable
                public void run() {
                    PreviewImpl previewImpl;
                    try {
                        Camera2 camera2 = Camera2.this;
                        if (camera2.mCamera != null && (previewImpl = camera2.mPreview) != null) {
                            Surface surface = previewImpl.getSurface();
                            Camera2 camera22 = Camera2.this;
                            camera22.mPreviewRequestBuilder = camera22.mCamera.createCaptureRequest(1);
                            Camera2.this.mPreviewRequestBuilder.addTarget(surface);
                            Camera2 camera23 = Camera2.this;
                            camera23.mCamera.createCaptureSession(Arrays.asList(surface, camera23.mImageReader.getSurface()), Camera2.this.mSessionCallback, null);
                            Camera2.this.initInProgress = false;
                        }
                    } catch (CameraAccessException | NullPointerException e8) {
                        Log.e(Camera2.TAG, "Failed to start camera session.", e8);
                    }
                }
            }, 50L);
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void stop() {
        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.mCaptureSession = null;
        }
        CameraDevice cameraDevice = this.mCamera;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.mCamera = null;
        }
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            imageReader.close();
            this.mImageReader = null;
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    void takePicture() {
        if (this.mAutoFocus) {
            lockFocus();
        } else {
            captureStillPicture();
        }
    }

    void unlockFocus() {
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        builder.set(key, 2);
        try {
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            updateAutoFocus();
            updateFlash();
            this.mPreviewRequestBuilder.set(key, 0);
            this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            this.mCaptureCallback.setState(0);
        } catch (CameraAccessException e8) {
            Log.e(TAG, "Failed to restart camera preview.", e8);
        }
    }

    void updateAutoFocus() {
        if (!this.mAutoFocus) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            return;
        }
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null && iArr.length != 0 && (iArr.length != 1 || iArr[0] != 0)) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        } else {
            this.mAutoFocus = false;
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        }
    }

    void updateFlash() {
        int i8 = this.mFlash;
        if (i8 == 0) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        if (i8 == 1) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        if (i8 == 2) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
        } else if (i8 == 3) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (i8 != 4) {
                return;
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 4);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        }
    }
}
