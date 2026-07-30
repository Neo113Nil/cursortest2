package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.baidu.platform.comapi.h.t.h;
import java.util.List;

/* loaded from: classes2.dex */
public class ArCameraView extends SurfaceView implements SurfaceHolder.Callback {
    public static final int WALK_AR_PERMISSION = 3001;

    /* renamed from: a, reason: collision with root package name */
    SurfaceHolder f10346a;

    /* renamed from: b, reason: collision with root package name */
    Camera f10347b;

    /* renamed from: c, reason: collision with root package name */
    private Context f10348c;

    public ArCameraView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        try {
            this.f10348c = context;
            SurfaceHolder holder = getHolder();
            this.f10346a = holder;
            holder.addCallback(this);
            this.f10346a.setType(3);
        } catch (Exception e8) {
            e8.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.h.t.q.a.a(), "相机出现错误", 0).show();
        }
    }

    public static int getBackCameraId() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i8 = 0; i8 < numberOfCameras; i8++) {
                Camera.getCameraInfo(i8, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i8;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            Log.d("ARCamera", "GetBackCameraID error!");
        }
        return -1;
    }

    public static boolean setCameraDisplayOrientation(Activity activity, int i8, Camera camera) {
        if (i8 == -1) {
            return false;
        }
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i8, cameraInfo);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int i9 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME : 90;
            camera.setDisplayOrientation(cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i9) % 360)) % 360 : ((cameraInfo.orientation - i9) + 360) % 360);
            return true;
        } catch (Exception e8) {
            Log.d("ARCamera", e8.getMessage());
            return false;
        }
    }

    private void setDisplayOrientation(int i8) {
        try {
            Camera camera = this.f10347b;
            if (camera != null) {
                camera.setDisplayOrientation(i8);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    protected Camera.Size getBestPreSize(int i8, int i9, List<Camera.Size> list) {
        for (Camera.Size size : list) {
            if (size.width == i8 && size.height == i9) {
                return size;
            }
        }
        float f8 = i8 / i9;
        float f9 = 0.1f;
        Camera.Size size2 = null;
        for (Camera.Size size3 : list) {
            float abs = Math.abs(f8 - (size3.width / size3.height));
            if (abs < f9) {
                size2 = size3;
                f9 = abs;
            }
        }
        if (size2 == null) {
            double d8 = Double.MAX_VALUE;
            for (Camera.Size size4 : list) {
                if (Math.abs(size4.height - i9) < d8) {
                    d8 = Math.abs(size4.height - i9);
                    size2 = size4;
                }
            }
        }
        return size2;
    }

    public void pauseCamera() {
        try {
            Camera camera = this.f10347b;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void releaseCamera() {
        try {
            Camera camera = this.f10347b;
            if (camera != null) {
                try {
                    camera.setPreviewCallback(null);
                    this.f10347b.stopPreview();
                } catch (Exception unused) {
                }
                try {
                    this.f10347b.release();
                } catch (Exception unused2) {
                }
                this.f10347b = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void resumeCamera() {
        try {
            Camera camera = this.f10347b;
            if (camera != null) {
                camera.startPreview();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.h.t.q.a.a(), "相机出现错误", 0).show();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        if (!setCameraDisplayOrientation((Activity) this.f10348c, getBackCameraId(), this.f10347b)) {
            setDisplayOrientation(90);
        }
        resumeCamera();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.e("CameraView", "surfaceCreated");
        try {
            if (this.f10347b == null) {
                this.f10347b = Camera.open();
            }
            Camera.Parameters parameters = this.f10347b.getParameters();
            Camera.Size bestPreSize = getBestPreSize(h.b(this.f10348c), h.c(this.f10348c), parameters.getSupportedPreviewSizes());
            parameters.setPreviewSize(bestPreSize.width, bestPreSize.height);
            Camera camera = this.f10347b;
            if (camera != null) {
                camera.setParameters(parameters);
                this.f10347b.setPreviewDisplay(surfaceHolder);
            }
            resumeCamera();
        } catch (Exception e8) {
            e8.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.h.t.q.a.a(), "相机出现错误", 0).show();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.e("CameraView", "surfaceDestroyed");
        releaseCamera();
    }

    public ArCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
