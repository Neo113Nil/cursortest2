package com.king.zxing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.fragment.app.Fragment;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.king.zxing.camera.FrontLightMode;
import com.king.zxing.camera.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class i implements j, l, k, SurfaceHolder.Callback {
    private static final int DEVIATION = 6;
    private Activity activity;
    private a ambientLightManager;
    private b beepManager;
    private float brightEnoughLux;
    private com.king.zxing.camera.d cameraManager;
    private CaptureHandler captureHandler;
    private String characterSet;
    private Collection<BarcodeFormat> decodeFormats;
    private Map<DecodeHintType, Object> decodeHints;
    private int framingRectHorizontalOffset;
    private float framingRectRatio;
    private int framingRectVerticalOffset;
    private boolean hasCameraFlash;
    private boolean hasSurface;
    private p inactivityTimer;
    private boolean isAutoRestartPreviewAndDecode;
    private boolean isContinuousScan;
    private boolean isFullScreenScan;
    private boolean isPlayBeep;
    private boolean isReturnBitmap;
    private boolean isSupportAutoZoom;
    private boolean isSupportLuminanceInvert;
    private boolean isSupportVerticalCode;
    private boolean isSupportZoom;
    private boolean isVibrate;
    private View ivTorch;
    private float oldDistance;
    private q onCaptureCallback;
    private r onCaptureListener;
    private SurfaceHolder surfaceHolder;
    private SurfaceView surfaceView;
    private float tooDarkLux;
    private ViewfinderView viewfinderView;

    @Deprecated
    public i(Fragment fragment, SurfaceView surfaceView, ViewfinderView viewfinderView) {
        this(fragment, surfaceView, viewfinderView, (View) null);
    }

    private float calcFingerSpacing(MotionEvent motionEvent) {
        float x7 = motionEvent.getX(0) - motionEvent.getX(1);
        float y7 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x7 * x7) + (y7 * y7));
    }

    private Rect calcTapArea(float f8, float f9, float f10, Camera.Size size) {
        int i8 = (int) (((f8 / size.width) * 2000.0f) - 1000.0f);
        int i9 = (int) (((f9 / size.height) * 2000.0f) - 1000.0f);
        int intValue = Float.valueOf(f10 * 200.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i8 - intValue, -1000, 1000), clamp(i9 - intValue, -1000, 1000), r3 + r5, r4 + r5);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    private int clamp(int i8, int i9, int i10) {
        return i8 > i10 ? i10 : i8 < i9 ? i9 : i8;
    }

    @Deprecated
    private void focusOnTouch(MotionEvent motionEvent, Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size previewSize = parameters.getPreviewSize();
        Rect calcTapArea = calcTapArea(motionEvent.getRawX(), motionEvent.getRawY(), 1.0f, previewSize);
        Rect calcTapArea2 = calcTapArea(motionEvent.getRawX(), motionEvent.getRawY(), 1.5f, previewSize);
        Camera.Parameters parameters2 = camera.getParameters();
        if (parameters2.getMaxNumFocusAreas() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(calcTapArea, 600));
            parameters2.setFocusAreas(arrayList);
        }
        if (parameters2.getMaxNumMeteringAreas() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Camera.Area(calcTapArea2, 600));
            parameters2.setMeteringAreas(arrayList2);
        }
        final String focusMode = parameters.getFocusMode();
        parameters.setFocusMode("macro");
        camera.setParameters(parameters);
        camera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.king.zxing.d
            @Override // android.hardware.Camera.AutoFocusCallback
            public final void onAutoFocus(boolean z7, Camera camera2) {
                i.lambda$focusOnTouch$4(focusMode, z7, camera2);
            }
        });
    }

    private void handleZoom(boolean z7, Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            b5.b.i("zoom not supported");
            return;
        }
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        if (z7 && zoom < maxZoom) {
            zoom++;
        } else if (zoom > 0) {
            zoom--;
        }
        parameters.setZoom(zoom);
        camera.setParameters(parameters);
    }

    private void initCamera(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.cameraManager.isOpen()) {
            b5.b.w("initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try {
            this.cameraManager.openDriver(surfaceHolder);
            if (this.captureHandler == null) {
                CaptureHandler captureHandler = new CaptureHandler(this.activity, this.viewfinderView, this.onCaptureListener, this.decodeFormats, this.decodeHints, this.characterSet, this.cameraManager);
                this.captureHandler = captureHandler;
                captureHandler.setSupportVerticalCode(this.isSupportVerticalCode);
                this.captureHandler.setReturnBitmap(this.isReturnBitmap);
                this.captureHandler.setSupportAutoZoom(this.isSupportAutoZoom);
                this.captureHandler.setSupportLuminanceInvert(this.isSupportLuminanceInvert);
            }
        } catch (IOException e8) {
            b5.b.w(e8);
        } catch (RuntimeException e9) {
            b5.b.w("Unexpected error initializing camera", e9);
        }
    }

    private void initCameraManager() {
        com.king.zxing.camera.d dVar = new com.king.zxing.camera.d(this.activity);
        this.cameraManager = dVar;
        dVar.setFullScreenScan(this.isFullScreenScan);
        this.cameraManager.setFramingRectRatio(this.framingRectRatio);
        this.cameraManager.setFramingRectVerticalOffset(this.framingRectVerticalOffset);
        this.cameraManager.setFramingRectHorizontalOffset(this.framingRectHorizontalOffset);
        View view = this.ivTorch;
        if (view == null || !this.hasCameraFlash) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.king.zxing.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i.this.lambda$initCameraManager$1(view2);
            }
        });
        this.cameraManager.setOnSensorListener(new d.a() { // from class: com.king.zxing.g
            @Override // com.king.zxing.camera.d.a
            public final void onSensorChanged(boolean z7, boolean z8, float f8) {
                i.this.lambda$initCameraManager$2(z7, z8, f8);
            }
        });
        this.cameraManager.setOnTorchListener(new d.b() { // from class: com.king.zxing.h
            @Override // com.king.zxing.camera.d.b
            public final void onTorchChanged(boolean z7) {
                i.this.lambda$initCameraManager$3(z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$focusOnTouch$4(String str, boolean z7, Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setFocusMode(str);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCameraManager$1(View view) {
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            dVar.setTorch(!this.ivTorch.isSelected());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCameraManager$2(boolean z7, boolean z8, float f8) {
        if (z8) {
            if (this.ivTorch.getVisibility() != 0) {
                this.ivTorch.setVisibility(0);
            }
        } else {
            if (z7 || this.ivTorch.getVisibility() != 0) {
                return;
            }
            this.ivTorch.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCameraManager$3(boolean z7) {
        this.ivTorch.setSelected(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(Result result, Bitmap bitmap, float f8) {
        this.inactivityTimer.onActivity();
        this.beepManager.playBeepSoundAndVibrate();
        onResult(result, bitmap, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$5(String str) {
        q qVar = this.onCaptureCallback;
        if (qVar == null || !qVar.onResultCallback(str)) {
            Intent intent = new Intent();
            intent.putExtra("SCAN_RESULT", str);
            this.activity.setResult(-1, intent);
            this.activity.finish();
        }
    }

    public i autoRestartPreviewAndDecode(boolean z7) {
        this.isAutoRestartPreviewAndDecode = z7;
        return this;
    }

    public i brightEnoughLux(float f8) {
        this.brightEnoughLux = f8;
        a aVar = this.ambientLightManager;
        if (aVar != null) {
            aVar.setTooDarkLux(this.tooDarkLux);
        }
        return this;
    }

    public i characterSet(String str) {
        this.characterSet = str;
        return this;
    }

    public i continuousScan(boolean z7) {
        this.isContinuousScan = z7;
        return this;
    }

    public i decodeFormats(Collection<BarcodeFormat> collection) {
        this.decodeFormats = collection;
        return this;
    }

    public i decodeHint(DecodeHintType decodeHintType, Object obj) {
        if (this.decodeHints == null) {
            this.decodeHints = new EnumMap(DecodeHintType.class);
        }
        this.decodeHints.put(decodeHintType, obj);
        return this;
    }

    public i decodeHints(Map<DecodeHintType, Object> map) {
        this.decodeHints = map;
        return this;
    }

    public i framingRectHorizontalOffset(int i8) {
        this.framingRectHorizontalOffset = i8;
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            dVar.setFramingRectHorizontalOffset(i8);
        }
        return this;
    }

    public i framingRectRatio(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.framingRectRatio = f8;
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            dVar.setFramingRectRatio(f8);
        }
        return this;
    }

    public i framingRectVerticalOffset(int i8) {
        this.framingRectVerticalOffset = i8;
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            dVar.setFramingRectVerticalOffset(i8);
        }
        return this;
    }

    public i frontLightMode(FrontLightMode frontLightMode) {
        FrontLightMode.put(this.activity, frontLightMode);
        View view = this.ivTorch;
        if (view != null && frontLightMode != FrontLightMode.AUTO) {
            view.setVisibility(4);
        }
        return this;
    }

    public i fullScreenScan(boolean z7) {
        this.isFullScreenScan = z7;
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            dVar.setFullScreenScan(z7);
        }
        return this;
    }

    @Override // com.king.zxing.k
    public a getAmbientLightManager() {
        return this.ambientLightManager;
    }

    @Override // com.king.zxing.k
    public b getBeepManager() {
        return this.beepManager;
    }

    @Override // com.king.zxing.k
    public com.king.zxing.camera.d getCameraManager() {
        return this.cameraManager;
    }

    @Override // com.king.zxing.k
    public p getInactivityTimer() {
        return this.inactivityTimer;
    }

    @Override // com.king.zxing.j
    public void onCreate() {
        this.surfaceHolder = this.surfaceView.getHolder();
        this.hasSurface = false;
        this.inactivityTimer = new p(this.activity);
        this.beepManager = new b(this.activity);
        this.ambientLightManager = new a(this.activity);
        this.hasCameraFlash = this.activity.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        initCameraManager();
        this.onCaptureListener = new r() { // from class: com.king.zxing.e
            @Override // com.king.zxing.r
            public final void onHandleDecode(Result result, Bitmap bitmap, float f8) {
                i.this.lambda$onCreate$0(result, bitmap, f8);
            }
        };
        this.beepManager.setPlayBeep(this.isPlayBeep);
        this.beepManager.setVibrate(this.isVibrate);
        this.ambientLightManager.setTooDarkLux(this.tooDarkLux);
        this.ambientLightManager.setBrightEnoughLux(this.brightEnoughLux);
    }

    @Override // com.king.zxing.j
    public void onDestroy() {
        this.inactivityTimer.shutdown();
    }

    @Override // com.king.zxing.j
    public void onPause() {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.quitSynchronously();
            this.captureHandler = null;
        }
        this.inactivityTimer.onPause();
        this.ambientLightManager.stop();
        this.beepManager.close();
        this.cameraManager.closeDriver();
        if (!this.hasSurface) {
            this.surfaceHolder.removeCallback(this);
        }
        View view = this.ivTorch;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.ivTorch.setSelected(false);
        this.ivTorch.setVisibility(4);
    }

    public void onResult(Result result, Bitmap bitmap, float f8) {
        onResult(result);
    }

    @Override // com.king.zxing.j
    public void onResume() {
        this.beepManager.updatePrefs();
        this.inactivityTimer.onResume();
        if (this.hasSurface) {
            initCamera(this.surfaceHolder);
        } else {
            this.surfaceHolder.addCallback(this);
        }
        this.ambientLightManager.start(this.cameraManager);
    }

    @Override // com.king.zxing.l
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Camera camera;
        if (!this.isSupportZoom || !this.cameraManager.isOpen() || (camera = this.cameraManager.getOpenCamera().getCamera()) == null || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            float calcFingerSpacing = calcFingerSpacing(motionEvent);
            float f8 = this.oldDistance;
            if (calcFingerSpacing > f8 + 6.0f) {
                handleZoom(true, camera);
            } else if (calcFingerSpacing < f8 - 6.0f) {
                handleZoom(false, camera);
            }
            this.oldDistance = calcFingerSpacing;
        } else if (action == 5) {
            this.oldDistance = calcFingerSpacing(motionEvent);
        }
        return true;
    }

    public i playBeep(boolean z7) {
        this.isPlayBeep = z7;
        b bVar = this.beepManager;
        if (bVar != null) {
            bVar.setPlayBeep(z7);
        }
        return this;
    }

    public void restartPreviewAndDecode() {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.restartPreviewAndDecode();
        }
    }

    public i returnBitmap(boolean z7) {
        this.isReturnBitmap = z7;
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.setReturnBitmap(z7);
        }
        return this;
    }

    public i setOnCaptureCallback(q qVar) {
        this.onCaptureCallback = qVar;
        return this;
    }

    public i supportAutoZoom(boolean z7) {
        this.isSupportAutoZoom = z7;
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.setSupportAutoZoom(z7);
        }
        return this;
    }

    public i supportLuminanceInvert(boolean z7) {
        this.isSupportLuminanceInvert = z7;
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.setSupportLuminanceInvert(z7);
        }
        return this;
    }

    public i supportVerticalCode(boolean z7) {
        this.isSupportVerticalCode = z7;
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.setSupportVerticalCode(z7);
        }
        return this;
    }

    public i supportZoom(boolean z7) {
        this.isSupportZoom = z7;
        return this;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            b5.b.w("*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (this.hasSurface) {
            return;
        }
        this.hasSurface = true;
        initCamera(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.hasSurface = false;
    }

    public i tooDarkLux(float f8) {
        this.tooDarkLux = f8;
        a aVar = this.ambientLightManager;
        if (aVar != null) {
            aVar.setTooDarkLux(f8);
        }
        return this;
    }

    public i vibrate(boolean z7) {
        this.isVibrate = z7;
        b bVar = this.beepManager;
        if (bVar != null) {
            bVar.setVibrate(z7);
        }
        return this;
    }

    public i(Fragment fragment, SurfaceView surfaceView, ViewfinderView viewfinderView, View view) {
        this(fragment.getActivity(), surfaceView, viewfinderView, view);
    }

    public void onResult(Result result) {
        CaptureHandler captureHandler;
        final String text = result.getText();
        if (this.isContinuousScan) {
            q qVar = this.onCaptureCallback;
            if (qVar != null) {
                qVar.onResultCallback(text);
            }
            if (this.isAutoRestartPreviewAndDecode) {
                restartPreviewAndDecode();
                return;
            }
            return;
        }
        if (this.isPlayBeep && (captureHandler = this.captureHandler) != null) {
            captureHandler.postDelayed(new Runnable() { // from class: com.king.zxing.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.lambda$onResult$5(text);
                }
            }, 100L);
            return;
        }
        q qVar2 = this.onCaptureCallback;
        if (qVar2 == null || !qVar2.onResultCallback(text)) {
            Intent intent = new Intent();
            intent.putExtra("SCAN_RESULT", text);
            this.activity.setResult(-1, intent);
            this.activity.finish();
        }
    }

    @Deprecated
    public i(Activity activity, SurfaceView surfaceView, ViewfinderView viewfinderView) {
        this(activity, surfaceView, viewfinderView, (View) null);
    }

    public i(Activity activity, SurfaceView surfaceView, ViewfinderView viewfinderView, View view) {
        this.isSupportZoom = true;
        this.isSupportAutoZoom = true;
        this.isSupportLuminanceInvert = false;
        this.isContinuousScan = false;
        this.isAutoRestartPreviewAndDecode = true;
        this.framingRectRatio = 0.9f;
        this.tooDarkLux = 45.0f;
        this.brightEnoughLux = 100.0f;
        this.activity = activity;
        this.surfaceView = surfaceView;
        this.viewfinderView = viewfinderView;
        this.ivTorch = view;
    }
}
