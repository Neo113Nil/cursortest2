package com.king.zxing.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import com.king.zxing.camera.open.CameraFacing;

/* loaded from: classes4.dex */
final class b {
    private Point bestPreviewSize;
    private Point cameraResolution;
    private final Context context;
    private int cwNeededRotation;
    private int cwRotationFromDisplayToCamera;
    private Point previewSizeOnScreen;
    private Point screenResolution;

    b(Context context) {
        this.context = context;
    }

    private void doSetTorch(Camera.Parameters parameters, boolean z7, boolean z8) {
        c.setTorch(parameters, z7);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
        if (z8 || defaultSharedPreferences.getBoolean("preferences_disable_exposure", true)) {
            return;
        }
        c.setBestExposure(parameters, z7);
    }

    private void initializeTorch(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z7) {
        doSetTorch(parameters, FrontLightMode.readPref(sharedPreferences) == FrontLightMode.ON, z7);
    }

    Point getBestPreviewSize() {
        return this.bestPreviewSize;
    }

    int getCWNeededRotation() {
        return this.cwNeededRotation;
    }

    Point getCameraResolution() {
        return this.cameraResolution;
    }

    Point getPreviewSizeOnScreen() {
        return this.previewSizeOnScreen;
    }

    Point getScreenResolution() {
        return this.screenResolution;
    }

    boolean getTorchState(Camera camera) {
        Camera.Parameters parameters;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return false;
        }
        String flashMode = parameters.getFlashMode();
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    void initFromCameraParameters(a5.a aVar) {
        int i8;
        Camera.Parameters parameters = aVar.getCamera().getParameters();
        Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            i8 = 0;
        } else if (rotation == 1) {
            i8 = 90;
        } else if (rotation == 2) {
            i8 = com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;
        } else if (rotation == 3) {
            i8 = 270;
        } else {
            if (rotation % 90 != 0) {
                throw new IllegalArgumentException("Bad rotation: " + rotation);
            }
            i8 = (rotation + 360) % 360;
        }
        b5.b.i("Display at: " + i8);
        int orientation = aVar.getOrientation();
        b5.b.i("Camera at: " + orientation);
        CameraFacing facing = aVar.getFacing();
        CameraFacing cameraFacing = CameraFacing.FRONT;
        if (facing == cameraFacing) {
            orientation = (360 - orientation) % 360;
            b5.b.i("Front camera overriden to: " + orientation);
        }
        this.cwRotationFromDisplayToCamera = ((orientation + 360) - i8) % 360;
        b5.b.i("Final display orientation: " + this.cwRotationFromDisplayToCamera);
        if (aVar.getFacing() == cameraFacing) {
            b5.b.i("Compensating rotation for front camera");
            this.cwNeededRotation = (360 - this.cwRotationFromDisplayToCamera) % 360;
        } else {
            this.cwNeededRotation = this.cwRotationFromDisplayToCamera;
        }
        b5.b.i("Clockwise rotation from display to camera: " + this.cwNeededRotation);
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.screenResolution = point;
        b5.b.i("Screen resolution in current orientation: " + this.screenResolution);
        this.cameraResolution = c.findBestPreviewSizeValue(parameters, this.screenResolution);
        b5.b.i("Camera resolution: " + this.cameraResolution);
        this.bestPreviewSize = c.findBestPreviewSizeValue(parameters, this.screenResolution);
        b5.b.i("Best available preview size: " + this.bestPreviewSize);
        Point point2 = this.screenResolution;
        boolean z7 = point2.x < point2.y;
        Point point3 = this.bestPreviewSize;
        if (z7 == (point3.x < point3.y)) {
            this.previewSizeOnScreen = point3;
        } else {
            Point point4 = this.bestPreviewSize;
            this.previewSizeOnScreen = new Point(point4.y, point4.x);
        }
        b5.b.i("Preview size on screen: " + this.previewSizeOnScreen);
    }

    void setDesiredCameraParameters(a5.a aVar, boolean z7) {
        Camera camera = aVar.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            b5.b.w("Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        b5.b.i("Initial camera parameters: " + parameters.flatten());
        if (z7) {
            b5.b.w("In camera config safe mode -- most settings will not be honored");
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
        if (parameters.isZoomSupported()) {
            parameters.setZoom(parameters.getMaxZoom() / 10);
        }
        initializeTorch(parameters, defaultSharedPreferences, z7);
        c.setFocus(parameters, defaultSharedPreferences.getBoolean("preferences_auto_focus", true), defaultSharedPreferences.getBoolean("preferences_disable_continuous_focus", true), z7);
        if (!z7) {
            if (defaultSharedPreferences.getBoolean("preferences_invert_scan", false)) {
                c.setInvertColor(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_barcode_scene_mode", true)) {
                c.setBarcodeSceneMode(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_metering", true)) {
                c.setVideoStabilization(parameters);
                c.setFocusArea(parameters);
                c.setMetering(parameters);
            }
            parameters.setRecordingHint(true);
        }
        Point point = this.bestPreviewSize;
        parameters.setPreviewSize(point.x, point.y);
        camera.setParameters(parameters);
        camera.setDisplayOrientation(this.cwRotationFromDisplayToCamera);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.bestPreviewSize;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            b5.b.w("Camera said it supported preview size " + this.bestPreviewSize.x + 'x' + this.bestPreviewSize.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
            Point point3 = this.bestPreviewSize;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    void setTorch(Camera camera, boolean z7) {
        Camera.Parameters parameters = camera.getParameters();
        doSetTorch(parameters, z7, false);
        camera.setParameters(parameters);
    }
}
