package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class Camera2Wrapper implements h1.P {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22002a;

    /* renamed from: b, reason: collision with root package name */
    public C1766o f22003b = null;

    public Camera2Wrapper(Context context) {
        this.f22002a = context;
        initCamera2Jni();
    }

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i4, int i5, int i6);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4, int i5, int i6) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i4, i5, i6);
    }

    public void closeCamera2() {
        C1766o c1766o = this.f22003b;
        if (c1766o != null) {
            c1766o.a();
        }
        this.f22003b = null;
    }

    public int getCamera2Count() {
        return C1766o.getCameraIds(this.f22002a).length;
    }

    public int getCamera2FocalLengthEquivalent(int i4) {
        return C1766o.a(this.f22002a, i4);
    }

    public int[] getCamera2Resolutions(int i4) {
        return C1766o.b(this.f22002a, i4);
    }

    public int getCamera2SensorOrientation(int i4) {
        return C1766o.c(this.f22002a, i4);
    }

    public Rect getFrameSizeCamera2() {
        C1766o c1766o = this.f22003b;
        return c1766o != null ? c1766o.f22207e : new Rect();
    }

    public boolean initializeCamera2(int i4, int i5, int i6, int i7, int i8, Surface surface) {
        if (this.f22003b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        CameraManager cameraManager = C1766o.f22199B;
        C1766o m4 = PlatformSupport.QUINCE_TART_SUPPORT ? new h1.M(this) : new C1766o(this);
        this.f22003b = m4;
        return m4.a(this.f22002a, i4, i5, i6, i7, i8, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i4) {
        return C1766o.d(this.f22002a, i4);
    }

    public boolean isCamera2FrontFacing(int i4) {
        return C1766o.e(this.f22002a, i4);
    }

    public void pauseCamera2() {
        C1766o c1766o = this.f22003b;
        if (c1766o != null) {
            c1766o.c();
        }
    }

    public boolean setAutoFocusPoint(float f4, float f5) {
        C1766o c1766o = this.f22003b;
        if (c1766o != null && c1766o.f22210h > 0) {
            if (!c1766o.f22215m) {
                c1766o.f22211i = f4;
                c1766o.f22212j = f5;
                synchronized (c1766o.f22222t) {
                    try {
                        if (c1766o.f22220r != null && c1766o.f22202A != 2) {
                            c1766o.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            h1.T.a(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public void startCamera2() {
        C1766o c1766o = this.f22003b;
        if (c1766o != null) {
            c1766o.f();
        }
    }

    public void stopCamera2() {
        C1766o c1766o = this.f22003b;
        if (c1766o != null) {
            c1766o.g();
        }
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
