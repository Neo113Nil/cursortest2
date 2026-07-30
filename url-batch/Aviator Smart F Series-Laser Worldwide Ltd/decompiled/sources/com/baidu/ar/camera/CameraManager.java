package com.baidu.ar.camera;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import com.crrepa.band.my.device.customkey.util.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class CameraManager {
    public static final int DEFAULTHEIGHT = 720;
    public static final int DEFAULTWIDTH = 1280;
    public static final int DESIREDPREVIEWFPS = 30;
    public static final float Ratio11 = 1.0f;
    public static final float Ratio169 = 0.5625f;
    public static final float Ratio43 = 0.75f;

    /* renamed from: e, reason: collision with root package name */
    public static CameraManager f1928e;

    /* renamed from: b, reason: collision with root package name */
    public Camera f1930b;

    /* renamed from: a, reason: collision with root package name */
    public int f1929a = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f1931c = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f1932d = 0.5625f;

    public class b implements Comparator<Camera.Size> {
        public b(CameraManager cameraManager) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Long.signum((size.width * size.height) - (size2.width * size2.height));
        }
    }

    public static CameraManager getInstance() {
        if (f1928e == null) {
            f1928e = new CameraManager();
        }
        return f1928e;
    }

    public final int a(int i8) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f1929a, cameraInfo);
        int i9 = i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 270 : c.MAX_GOAL_TIME : 90;
        int i10 = cameraInfo.facing;
        int i11 = cameraInfo.orientation;
        return i10 == 1 ? (360 - ((i11 + i9) % 360)) % 360 : ((i11 - i9) + 360) % 360;
    }

    public void addCameraCallbackBuffer(byte[] bArr) {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public final boolean b(int i8) {
        for (int i9 = 0; i9 < 3; i9++) {
            try {
                this.f1930b = Camera.open(i8);
                return true;
            } catch (Exception unused) {
                Log.e("CameraManager", "camera open error!");
                try {
                    Camera camera = this.f1930b;
                    if (camera != null) {
                        camera.release();
                        this.f1930b = null;
                    }
                    Thread.sleep(150L);
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean chooseFixedPreviewFps(int i8) {
        try {
            Camera camera = this.f1930b;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                int[] iArr = new int[2];
                for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
                    Log.d("CameraManager", "entry: " + iArr2[0] + " - " + iArr2[1]);
                    int i9 = iArr2[0];
                    int i10 = iArr2[1];
                    if (i9 == i10 && i9 == i8) {
                        parameters.setPreviewFpsRange(i9, i10);
                        return true;
                    }
                    if (i9 >= iArr[0] && i10 >= iArr[1]) {
                        iArr[0] = i9;
                        iArr[1] = i10;
                    }
                }
                Log.d("CameraManager", "setting fps: " + iArr[0] + " - " + iArr[1]);
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                this.f1930b.setParameters(parameters);
            }
            return false;
        } catch (Exception e8) {
            Log.e("chooseFixedPreviewFps ", e8.getLocalizedMessage());
            return false;
        }
    }

    public int getCameraID() {
        return this.f1929a;
    }

    public Camera.CameraInfo getCameraInfo() {
        if (this.f1930b == null) {
            return null;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f1929a, cameraInfo);
        return cameraInfo;
    }

    public float getCurrentRatio() {
        return this.f1932d;
    }

    public int getPreviewOrientation() {
        return this.f1931c;
    }

    public void openCamera(int i8) {
        openCamera(i8, 1280, 720, this.f1931c);
    }

    public void releaseCamera() {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.stopPreview();
            this.f1930b.setPreviewCallback(null);
            this.f1930b.release();
            this.f1930b = null;
        }
    }

    public void reopenCamera() {
        releaseCamera();
        openCamera(this.f1929a);
    }

    public boolean setCameraFlashMode(String str) {
        try {
            Camera camera = this.f1930b;
            if (camera == null) {
                return false;
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(str);
            this.f1930b.setParameters(parameters);
            return true;
        } catch (Exception e8) {
            Log.e("setCameraFlashMode ", e8.getLocalizedMessage());
            return false;
        }
    }

    public void setOnCameraError(Camera.ErrorCallback errorCallback) {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.setPreviewCallback(previewCallback);
        }
    }

    public void setPreviewSurface(SurfaceTexture surfaceTexture) {
        Camera camera = this.f1930b;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public void startPreview() {
        Camera.Size size;
        Camera camera = this.f1930b;
        if (camera != null) {
            try {
                size = camera.getParameters().getPreviewSize();
            } catch (Exception e8) {
                e8.printStackTrace();
                size = null;
            }
            if (size != null) {
                int bitsPerPixel = ((size.width * size.height) * ImageFormat.getBitsPerPixel(17)) / 8;
                for (int i8 = 0; i8 < 3; i8++) {
                    this.f1930b.addCallbackBuffer(new byte[bitsPerPixel]);
                }
            }
            try {
                this.f1930b.startPreview();
            } catch (Exception unused) {
                Log.e("startPreview camera", "Exception");
            }
        }
    }

    public void stopPreview() {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    public void switchCamera(int i8, int i9, int i10) {
        if (this.f1929a == i8) {
            return;
        }
        this.f1929a = i8;
        releaseCamera();
        openCamera(i8, i9, i10, this.f1931c);
    }

    public void takePicture(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2) {
        Camera camera = this.f1930b;
        if (camera != null) {
            camera.takePicture(shutterCallback, pictureCallback, pictureCallback2);
        }
    }

    public final Camera.Size a(List<Camera.Size> list, int i8, int i9) {
        int i10;
        Object max;
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Camera.Size size : list) {
            int i11 = size.height;
            int i12 = (i11 * i8) / i9;
            int i13 = size.width;
            if (i12 == i13) {
                if (i13 < i8 || i11 < i9) {
                    arrayList2.add(size);
                } else {
                    arrayList.add(size);
                }
            }
        }
        if (arrayList.size() > 0) {
            max = Collections.min(arrayList, new b());
        } else {
            if (arrayList2.size() <= 0) {
                boolean z7 = false;
                Camera.Size size2 = list.get(0);
                for (Camera.Size size3 : list) {
                    int i14 = size3.width;
                    if (i14 != i8 || (i10 = size3.height) != i9 || i10 / i14 != this.f1932d) {
                        if (i14 == i8) {
                            if (Math.abs(size2.height - i9) > Math.abs(size3.height - i9) && size3.height / size3.width == this.f1932d) {
                            }
                            z7 = true;
                        } else if (size3.height == i9) {
                            if (Math.abs(size2.width - i8) > Math.abs(size3.width - i8) && size3.height / size3.width == this.f1932d) {
                            }
                            z7 = true;
                        } else if (!z7 && Math.abs(size2.width - i8) > Math.abs(size3.width - i8) && Math.abs(size2.height - i9) > Math.abs(size3.height - i9) && size3.height / size3.width == this.f1932d) {
                            size2 = size3;
                        }
                    }
                    return size3;
                }
                return size2;
            }
            max = Collections.max(arrayList2, new b());
        }
        return (Camera.Size) max;
    }

    public void openCamera(int i8, int i9, int i10, int i11) {
        String str;
        Camera camera;
        List<String> supportedAntibanding;
        this.f1929a = i8;
        if (this.f1930b != null) {
            str = "camera already initialized!";
        } else {
            if (b(i8) && (camera = this.f1930b) != null) {
                try {
                    this.f1931c = i11;
                    Camera.Parameters parameters = camera.getParameters();
                    if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    }
                    if (i8 == 0 || !Build.BRAND.contains("Xiaomi")) {
                        parameters.setRecordingHint(true);
                    }
                    if (Build.MODEL.contains("Lenovo K520") && (supportedAntibanding = parameters.getSupportedAntibanding()) != null && supportedAntibanding.contains("50hz")) {
                        parameters.setAntibanding("50hz");
                    }
                    this.f1930b.setParameters(parameters);
                    try {
                        a(this.f1930b, i9, i10);
                    } catch (Exception unused) {
                        Log.e("CameraManager", "setPreviewSize Error");
                    }
                    chooseFixedPreviewFps(30000);
                    this.f1930b.setDisplayOrientation(a(i11));
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            str = "Unable to open camera!";
        }
        Log.e("CameraManager", str);
    }

    public void reopenCamera(int i8, int i9) {
        releaseCamera();
        openCamera(this.f1929a, i8, i9, this.f1931c);
    }

    public void setPreviewSurface(SurfaceHolder surfaceHolder) {
        Camera camera = this.f1930b;
        if (camera != null) {
            try {
                camera.setPreviewDisplay(surfaceHolder);
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(Camera camera, int i8, int i9) {
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size a8 = a(parameters.getSupportedPreviewSizes(), i8, i9);
        parameters.setPreviewSize(a8.width, a8.height);
        camera.setParameters(parameters);
        Log.d("setPreviewSize", "width = " + a8.width + ", height = " + a8.height);
    }

    public final void a(List<Camera.Size> list) {
        Collections.sort(list, new b());
    }
}
