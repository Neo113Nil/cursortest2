package com.king.zxing.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import androidx.annotation.FloatRange;
import com.google.zxing.PlanarYUVLuminanceSource;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class d {
    private static final int MAX_FRAME_HEIGHT = 675;
    private static final int MAX_FRAME_WIDTH = 1200;
    private static final int MIN_FRAME_HEIGHT = 240;
    private static final int MIN_FRAME_WIDTH = 240;
    private com.king.zxing.camera.a autoFocusManager;
    private a5.a camera;
    private final com.king.zxing.camera.b configManager;
    private final Context context;
    private Rect framingRect;
    private int framingRectHorizontalOffset;
    private Rect framingRectInPreview;
    private float framingRectRatio;
    private int framingRectVerticalOffset;
    private boolean initialized;
    private boolean isFullScreenScan;
    private boolean isTorch;
    private a onSensorListener;
    private b onTorchListener;
    private final e previewCallback;
    private boolean previewing;
    private int requestedCameraId = -1;
    private int requestedFramingRectHeight;
    private int requestedFramingRectWidth;

    public interface a {
        void onSensorChanged(boolean z7, boolean z8, float f8);
    }

    public interface b {
        void onTorchChanged(boolean z7);
    }

    public d(Context context) {
        this.context = context.getApplicationContext();
        com.king.zxing.camera.b bVar = new com.king.zxing.camera.b(context);
        this.configManager = bVar;
        this.previewCallback = new e(bVar);
    }

    public PlanarYUVLuminanceSource buildLuminanceSource(byte[] bArr, int i8, int i9) {
        if (getFramingRectInPreview() == null) {
            return null;
        }
        if (this.isFullScreenScan) {
            return new PlanarYUVLuminanceSource(bArr, i8, i9, 0, 0, i8, i9, false);
        }
        int min = (int) (Math.min(i8, i9) * this.framingRectRatio);
        return new PlanarYUVLuminanceSource(bArr, i8, i9, ((i8 - min) / 2) + this.framingRectHorizontalOffset, ((i9 - min) / 2) + this.framingRectVerticalOffset, min, min, false);
    }

    public void closeDriver() {
        a5.a aVar = this.camera;
        if (aVar != null) {
            aVar.getCamera().release();
            this.camera = null;
            this.framingRect = null;
            this.framingRectInPreview = null;
        }
        this.isTorch = false;
        b bVar = this.onTorchListener;
        if (bVar != null) {
            bVar.onTorchChanged(false);
        }
    }

    public Point getCameraResolution() {
        return this.configManager.getCameraResolution();
    }

    public synchronized Rect getFramingRect() {
        try {
            if (this.framingRect == null) {
                if (this.camera == null) {
                    return null;
                }
                Point cameraResolution = this.configManager.getCameraResolution();
                if (cameraResolution == null) {
                    return null;
                }
                int i8 = cameraResolution.x;
                int i9 = cameraResolution.y;
                if (this.isFullScreenScan) {
                    this.framingRect = new Rect(0, 0, i8, i9);
                } else {
                    int min = (int) (Math.min(i8, i9) * this.framingRectRatio);
                    int i10 = ((i8 - min) / 2) + this.framingRectHorizontalOffset;
                    int i11 = ((i9 - min) / 2) + this.framingRectVerticalOffset;
                    this.framingRect = new Rect(i10, i11, i10 + min, min + i11);
                }
            }
            return this.framingRect;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Rect getFramingRectInPreview() {
        if (this.framingRectInPreview == null) {
            Rect framingRect = getFramingRect();
            if (framingRect == null) {
                return null;
            }
            Rect rect = new Rect(framingRect);
            Point cameraResolution = this.configManager.getCameraResolution();
            Point screenResolution = this.configManager.getScreenResolution();
            if (cameraResolution != null && screenResolution != null) {
                int i8 = rect.left;
                int i9 = cameraResolution.y;
                int i10 = screenResolution.x;
                rect.left = (i8 * i9) / i10;
                rect.right = (rect.right * i9) / i10;
                int i11 = rect.top;
                int i12 = cameraResolution.x;
                int i13 = screenResolution.y;
                rect.top = (i11 * i12) / i13;
                rect.bottom = (rect.bottom * i12) / i13;
                this.framingRectInPreview = rect;
            }
            return null;
        }
        return this.framingRectInPreview;
    }

    public a5.a getOpenCamera() {
        return this.camera;
    }

    public Point getScreenResolution() {
        return this.configManager.getScreenResolution();
    }

    public synchronized boolean isOpen() {
        return this.camera != null;
    }

    public void openDriver(SurfaceHolder surfaceHolder) {
        int i8;
        a5.a aVar = this.camera;
        if (aVar == null) {
            aVar = a5.b.open(this.requestedCameraId);
            if (aVar == null) {
                throw new IOException("Camera.open() failed to return object from driver");
            }
            this.camera = aVar;
        }
        if (!this.initialized) {
            this.initialized = true;
            this.configManager.initFromCameraParameters(aVar);
            int i9 = this.requestedFramingRectWidth;
            if (i9 > 0 && (i8 = this.requestedFramingRectHeight) > 0) {
                setManualFramingRect(i9, i8);
                this.requestedFramingRectWidth = 0;
                this.requestedFramingRectHeight = 0;
            }
        }
        Camera camera = aVar.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        String flatten = parameters == null ? null : parameters.flatten();
        try {
            this.configManager.setDesiredCameraParameters(aVar, false);
        } catch (RuntimeException unused) {
            b5.b.w("Camera rejected parameters. Setting only minimal safe-mode parameters");
            b5.b.i("Resetting to saved camera params: " + flatten);
            if (flatten != null) {
                Camera.Parameters parameters2 = camera.getParameters();
                parameters2.unflatten(flatten);
                try {
                    camera.setParameters(parameters2);
                    this.configManager.setDesiredCameraParameters(aVar, true);
                } catch (RuntimeException unused2) {
                    b5.b.w("Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
        camera.setPreviewDisplay(surfaceHolder);
    }

    public synchronized void requestPreviewFrame(Handler handler, int i8) {
        a5.a aVar = this.camera;
        if (aVar != null && this.previewing) {
            this.previewCallback.setHandler(handler, i8);
            aVar.getCamera().setOneShotPreviewCallback(this.previewCallback);
        }
    }

    public void sensorChanged(boolean z7, float f8) {
        a aVar = this.onSensorListener;
        if (aVar != null) {
            aVar.onSensorChanged(this.isTorch, z7, f8);
        }
    }

    public void setFramingRectHorizontalOffset(int i8) {
        this.framingRectHorizontalOffset = i8;
    }

    public void setFramingRectRatio(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.framingRectRatio = f8;
    }

    public void setFramingRectVerticalOffset(int i8) {
        this.framingRectVerticalOffset = i8;
    }

    public void setFullScreenScan(boolean z7) {
        this.isFullScreenScan = z7;
    }

    public synchronized void setManualCameraId(int i8) {
        this.requestedCameraId = i8;
    }

    public synchronized void setManualFramingRect(int i8, int i9) {
        try {
            if (this.initialized) {
                Point screenResolution = this.configManager.getScreenResolution();
                int i10 = screenResolution.x;
                if (i8 > i10) {
                    i8 = i10;
                }
                int i11 = screenResolution.y;
                if (i9 > i11) {
                    i9 = i11;
                }
                int i12 = (i10 - i8) / 2;
                int i13 = (i11 - i9) / 2;
                this.framingRect = new Rect(i12, i13, i8 + i12, i9 + i13);
                b5.b.d("Calculated manual framing rect: " + this.framingRect);
                this.framingRectInPreview = null;
            } else {
                this.requestedFramingRectWidth = i8;
                this.requestedFramingRectHeight = i9;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setOnSensorListener(a aVar) {
        this.onSensorListener = aVar;
    }

    public void setOnTorchListener(b bVar) {
        this.onTorchListener = bVar;
    }

    public synchronized void setTorch(boolean z7) {
        try {
            a5.a aVar = this.camera;
            if (aVar != null && z7 != this.configManager.getTorchState(aVar.getCamera())) {
                com.king.zxing.camera.a aVar2 = this.autoFocusManager;
                boolean z8 = aVar2 != null;
                if (z8) {
                    aVar2.stop();
                    this.autoFocusManager = null;
                }
                this.isTorch = z7;
                this.configManager.setTorch(aVar.getCamera(), z7);
                if (z8) {
                    com.king.zxing.camera.a aVar3 = new com.king.zxing.camera.a(this.context, aVar.getCamera());
                    this.autoFocusManager = aVar3;
                    aVar3.start();
                }
                b bVar = this.onTorchListener;
                if (bVar != null) {
                    bVar.onTorchChanged(z7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void startPreview() {
        a5.a aVar = this.camera;
        if (aVar == null || this.previewing) {
            return;
        }
        aVar.getCamera().startPreview();
        this.previewing = true;
        this.autoFocusManager = new com.king.zxing.camera.a(this.context, aVar.getCamera());
    }

    public void stopPreview() {
        com.king.zxing.camera.a aVar = this.autoFocusManager;
        if (aVar != null) {
            aVar.stop();
            this.autoFocusManager = null;
        }
        a5.a aVar2 = this.camera;
        if (aVar2 == null || !this.previewing) {
            return;
        }
        aVar2.getCamera().stopPreview();
        this.previewCallback.setHandler(null, 0);
        this.previewing = false;
    }
}
