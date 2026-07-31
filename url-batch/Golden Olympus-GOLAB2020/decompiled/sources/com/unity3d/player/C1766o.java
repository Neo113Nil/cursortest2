package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1766o {

    /* renamed from: B, reason: collision with root package name */
    public static CameraManager f22199B;

    /* renamed from: C, reason: collision with root package name */
    public static String[] f22200C;

    /* renamed from: D, reason: collision with root package name */
    public static final Semaphore f22201D = new Semaphore(1);

    /* renamed from: a, reason: collision with root package name */
    public final h1.P f22203a;

    /* renamed from: b, reason: collision with root package name */
    public CameraDevice f22204b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f22205c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f22206d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f22207e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f22208f;

    /* renamed from: g, reason: collision with root package name */
    public int f22209g;

    /* renamed from: h, reason: collision with root package name */
    public int f22210h;

    /* renamed from: k, reason: collision with root package name */
    public int f22213k;

    /* renamed from: l, reason: collision with root package name */
    public int f22214l;

    /* renamed from: n, reason: collision with root package name */
    public Range f22216n;

    /* renamed from: p, reason: collision with root package name */
    public Image f22218p;

    /* renamed from: q, reason: collision with root package name */
    public CaptureRequest.Builder f22219q;

    /* renamed from: u, reason: collision with root package name */
    public int f22223u;

    /* renamed from: v, reason: collision with root package name */
    public SurfaceTexture f22224v;

    /* renamed from: i, reason: collision with root package name */
    public float f22211i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f22212j = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22215m = false;

    /* renamed from: o, reason: collision with root package name */
    public ImageReader f22217o = null;

    /* renamed from: r, reason: collision with root package name */
    public CameraCaptureSession f22220r = null;

    /* renamed from: s, reason: collision with root package name */
    public C1764n f22221s = null;

    /* renamed from: t, reason: collision with root package name */
    public final Object f22222t = new Object();

    /* renamed from: w, reason: collision with root package name */
    public Surface f22225w = null;

    /* renamed from: A, reason: collision with root package name */
    public int f22202A = 3;

    /* renamed from: x, reason: collision with root package name */
    public final C1755k f22226x = new C1755k(this);

    /* renamed from: y, reason: collision with root package name */
    public final C1758l f22227y = new C1758l(this);

    /* renamed from: z, reason: collision with root package name */
    public final C1761m f22228z = new C1761m(this);

    public C1766o(h1.P p4) {
        this.f22203a = null;
        this.f22203a = p4;
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f22205c = handlerThread;
        handlerThread.start();
        this.f22206d = new Handler(this.f22205c.getLooper());
    }

    public static int a(Context context, int i4) {
        try {
            CameraCharacteristics cameraCharacteristics = getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i4]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r3.length != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] b(Context context, int i4) {
        Size[] outputSizes;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i4]).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                h1.T.a(6, "Camera2: configuration map is not available.");
            } else {
                outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (outputSizes != null) {
                }
            }
            outputSizes = null;
            if (outputSizes == null) {
                return null;
            }
            int[] iArr = new int[outputSizes.length * 2];
            for (int i5 = 0; i5 < outputSizes.length; i5++) {
                int i6 = i5 * 2;
                iArr[i6] = outputSizes[i5].getWidth();
                iArr[i6 + 1] = outputSizes[i5].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
            return null;
        }
    }

    public static int c(Context context, int i4) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i4]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
            return 0;
        }
    }

    public static boolean d(Context context, int i4) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i4]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    public static boolean e(Context context, int i4) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i4]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    public static String[] getCameraIds(Context context) {
        if (f22200C == null) {
            try {
                if (PlatformSupport.QUINCE_TART_SUPPORT) {
                    f22200C = h1.M.h(context);
                } else {
                    f22200C = getCameraManager(context).getCameraIdList();
                }
            } catch (CameraAccessException e4) {
                h1.T.a(6, "Camera2: CameraAccessException " + e4);
                f22200C = new String[0];
            }
        }
        return f22200C;
    }

    public static CameraManager getCameraManager(Context context) {
        if (f22199B == null) {
            f22199B = (CameraManager) context.getSystemService("camera");
        }
        return f22199B;
    }

    public void createCaptureSession(CameraCaptureSession.StateCallback stateCallback) {
        this.f22204b.createCaptureSession(Arrays.asList(this.f22225w), stateCallback, this.f22206d);
    }

    public final void f() {
        if (this.f22223u != 0) {
            if (this.f22225w == null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f22223u);
                this.f22224v = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f22207e.width(), this.f22207e.height());
                this.f22224v.setOnFrameAvailableListener(this.f22228z, this.f22206d);
                this.f22225w = new Surface(this.f22224v);
            }
        } else if (this.f22225w == null && this.f22217o == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f22207e.width(), this.f22207e.height(), 35, 2);
            this.f22217o = newInstance;
            newInstance.setOnImageAvailableListener(this.f22227y, this.f22206d);
            this.f22218p = null;
            this.f22225w = this.f22217o.getSurface();
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f22220r;
            if (cameraCaptureSession == null) {
                createCaptureSession(new C1752j(this));
            } else if (this.f22202A == 2) {
                cameraCaptureSession.setRepeatingRequest(this.f22219q.build(), getCaptureCallback(), this.f22206d);
            }
            this.f22202A = 1;
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
        }
    }

    public final void g() {
        synchronized (this.f22222t) {
            CameraCaptureSession cameraCaptureSession = this.f22220r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e4) {
                    h1.T.a(6, "Camera2: CameraAccessException " + e4);
                }
                this.f22220r.close();
                this.f22220r = null;
                this.f22202A = 3;
            }
        }
    }

    public String getCameraIdToOpen(Context context, int i4) {
        return getCameraIds(context)[i4];
    }

    public CameraCaptureSession.CaptureCallback getCaptureCallback() {
        if (this.f22221s == null) {
            this.f22221s = new C1764n(this);
        }
        return this.f22221s;
    }

    public final void c() {
        synchronized (this.f22222t) {
            CameraCaptureSession cameraCaptureSession = this.f22220r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.f22202A = 2;
                } catch (CameraAccessException e4) {
                    h1.T.a(6, "Camera2: CameraAccessException " + e4);
                }
            }
        }
    }

    public final void d() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f22220r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.f22219q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f22219q.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f22219q.setTag("Cancel focus");
                this.f22220r.capture(this.f22219q.build(), getCaptureCallback(), this.f22206d);
            }
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
        }
    }

    public final void e() {
        try {
            if (this.f22210h != 0) {
                float f4 = this.f22211i;
                if (f4 >= 0.0f && f4 <= 1.0f) {
                    float f5 = this.f22212j;
                    if (f5 >= 0.0f && f5 <= 1.0f) {
                        this.f22215m = true;
                        int width = this.f22208f.width();
                        int i4 = (int) (((width - (r2 * 2)) * this.f22211i) + this.f22213k);
                        int height = this.f22208f.height();
                        int i5 = (int) (((1.0d - this.f22212j) * (height - (r3 * 2))) + this.f22214l);
                        int max = Math.max(this.f22209g + 1, Math.min(i4, (this.f22208f.width() - this.f22209g) - 1));
                        int max2 = Math.max(this.f22209g + 1, Math.min(i5, (this.f22208f.height() - this.f22209g) - 1));
                        CaptureRequest.Builder builder = this.f22219q;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i6 = this.f22209g;
                        int i7 = i6 * 2;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(max - i6, max2 - i6, i7, i7, 999)});
                        this.f22219q.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f22219q.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f22219q.setTag("Focus");
                        this.f22220r.capture(this.f22219q.build(), getCaptureCallback(), this.f22206d);
                        return;
                    }
                }
            }
            this.f22219q.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f22219q.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.f22220r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(this.f22219q.build(), getCaptureCallback(), this.f22206d);
            }
        } catch (CameraAccessException e4) {
            h1.T.a(6, "Camera2: CameraAccessException " + e4);
        }
    }

    public final boolean a(Context context, int i4, int i5, int i6, int i7, int i8, Surface surface) {
        Semaphore semaphore;
        int i9 = i7;
        try {
            CameraCharacteristics cameraCharacteristics = f22199B.getCameraCharacteristics(getCameraIds(context)[i4]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                h1.T.a(5, "Camera2: only LEGACY hardware level is supported.");
            }
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Size[] sizeArr = null;
            if (streamConfigurationMap == null) {
                h1.T.a(6, "Camera2: configuration map is not available.");
            } else {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (outputSizes != null && outputSizes.length != 0) {
                    sizeArr = outputSizes;
                }
            }
            if (sizeArr == null || sizeArr.length == 0) {
                return false;
            }
            double d4 = i5;
            double d5 = i6;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            double d6 = Double.MAX_VALUE;
            while (i10 < sizeArr.length) {
                int width = sizeArr[i10].getWidth();
                int height = sizeArr[i10].getHeight();
                double d7 = d4;
                CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
                double abs = Math.abs(Math.log(d5 / height)) + Math.abs(Math.log(d7 / width));
                if (abs < d6) {
                    i11 = height;
                    d6 = abs;
                    i12 = width;
                }
                i10++;
                d4 = d7;
                cameraCharacteristics = cameraCharacteristics2;
            }
            CameraCharacteristics cameraCharacteristics3 = cameraCharacteristics;
            this.f22207e = new Rect(0, 0, i12, i11);
            Range[] rangeArr = (Range[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null && rangeArr.length != 0) {
                int i13 = -1;
                int i14 = 0;
                double d8 = Double.MAX_VALUE;
                while (true) {
                    if (i14 < rangeArr.length) {
                        int intValue = ((Integer) rangeArr[i14].getLower()).intValue();
                        int intValue2 = ((Integer) rangeArr[i14].getUpper()).intValue();
                        float f4 = i9;
                        if (f4 + 0.1f > intValue && f4 - 0.1f < intValue2) {
                            break;
                        }
                        if (r7 < d8) {
                            i13 = i14;
                            d8 = r7;
                        }
                        i14++;
                    } else {
                        i9 = ((Integer) (i9 > ((Integer) rangeArr[i13].getUpper()).intValue() ? rangeArr[i13].getUpper() : rangeArr[i13].getLower())).intValue();
                    }
                }
                this.f22216n = new Range(Integer.valueOf(i9), Integer.valueOf(i9));
                try {
                    if (!f22201D.tryAcquire(4L, TimeUnit.SECONDS)) {
                        h1.T.a(5, "Camera2: Timeout waiting to lock camera for opening.");
                        return false;
                    }
                    try {
                        f22199B.openCamera(getCameraIdToOpen(context, i4), this.f22226x, this.f22206d);
                    } catch (CameraAccessException e4) {
                        h1.T.a(6, "Camera2: CameraAccessException " + e4);
                        f22201D.release();
                        return false;
                    } catch (IllegalArgumentException e5) {
                        h1.T.a(6, "Camera2: IllegalArgumentException " + e5);
                    } catch (SecurityException e6) {
                        h1.T.a(6, "Camera2: SecurityException " + e6);
                    }
                    try {
                        semaphore = f22201D;
                    } catch (InterruptedException e7) {
                        h1.T.a(6, "Camera2: Interrupted while waiting to open camera " + e7);
                    }
                    if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                        h1.T.a(5, "Camera2: Timeout waiting to open camera.");
                        return false;
                    }
                    semaphore.release();
                    this.f22223u = i8;
                    this.f22225w = surface;
                    int intValue3 = ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                    this.f22210h = intValue3;
                    if (intValue3 > 0) {
                        this.f22208f = (Rect) cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        float width2 = this.f22207e.width() / this.f22207e.height();
                        if (width2 > r0.width() / this.f22208f.height()) {
                            this.f22213k = 0;
                            this.f22214l = (int) ((this.f22208f.height() - (this.f22208f.width() / width2)) / 2.0f);
                        } else {
                            this.f22214l = 0;
                            this.f22213k = (int) ((this.f22208f.width() - (this.f22208f.height() * width2)) / 2.0f);
                        }
                        this.f22209g = Math.min(this.f22208f.width(), this.f22208f.height()) / 20;
                    }
                    return this.f22204b != null;
                } catch (InterruptedException e8) {
                    h1.T.a(6, "Camera2: Interrupted while trying to lock camera for opening " + e8);
                    return false;
                }
            }
            h1.T.a(6, "Camera2: target FPS ranges are not avialable.");
            return false;
        } catch (CameraAccessException e9) {
            h1.T.a(6, "Camera2: CameraAccessException " + e9);
            return false;
        }
    }

    public final void b() {
        try {
            Semaphore semaphore = f22201D;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!semaphore.tryAcquire(4L, timeUnit)) {
                h1.T.a(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f22204b.close();
            try {
                if (!semaphore.tryAcquire(4L, timeUnit)) {
                    h1.T.a(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e4) {
                h1.T.a(6, "Camera2: Interrupted while waiting to close camera " + e4);
            }
            this.f22204b = null;
            f22201D.release();
        } catch (InterruptedException e5) {
            h1.T.a(6, "Camera2: Interrupted while trying to lock camera for closing " + e5);
        }
    }

    public final void a() {
        if (this.f22204b != null) {
            g();
            b();
            this.f22221s = null;
            this.f22225w = null;
            this.f22224v = null;
            Image image = this.f22218p;
            if (image != null) {
                image.close();
                this.f22218p = null;
            }
            ImageReader imageReader = this.f22217o;
            if (imageReader != null) {
                imageReader.close();
                this.f22217o = null;
            }
        }
        this.f22205c.quit();
        try {
            this.f22205c.join(4000L);
            this.f22205c = null;
            this.f22206d = null;
        } catch (InterruptedException e4) {
            this.f22205c.interrupt();
            h1.T.a(6, "Camera2: Interrupted while waiting for the background thread to finish " + e4);
        }
    }

    public final void a(Object obj) {
        if (obj == "Focus") {
            this.f22215m = false;
            synchronized (this.f22222t) {
                if (this.f22220r != null) {
                    try {
                        this.f22219q.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.f22219q.setTag("Regular");
                        this.f22220r.setRepeatingRequest(this.f22219q.build(), getCaptureCallback(), this.f22206d);
                    } catch (CameraAccessException e4) {
                        h1.T.a(6, "Camera2: CameraAccessException " + e4);
                    }
                }
            }
            return;
        }
        if (obj == "Cancel focus") {
            synchronized (this.f22222t) {
                try {
                    if (this.f22220r != null) {
                        e();
                    }
                } finally {
                }
            }
        }
    }

    public final void a(CameraDevice cameraDevice) {
        synchronized (this.f22222t) {
            this.f22220r = null;
        }
        cameraDevice.close();
        this.f22204b = null;
    }
}
