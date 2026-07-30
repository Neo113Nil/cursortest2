package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.view.Surface;
import com.unity3d.player.a.C0150n;
import com.unity3d.player.a.InterfaceC0153q;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Camera2Wrapper implements InterfaceC0153q {
    public final Context a;
    public C0184p b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C0184p.getCameraIds(this.a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C0184p.c(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C0184p.e(this.a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C0184p.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C0184p.b(this.a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        C0184p c0184p;
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        CameraManager cameraManager = C0184p.B;
        if (PlatformSupport.QUINCE_TART_SUPPORT) {
            c0184p = new C0150n(this);
        } else {
            c0184p = new C0184p(this);
        }
        C0184p c0184p2 = c0184p;
        this.b = c0184p2;
        return c0184p2.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C0184p.d(this.a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C0184p c0184p = this.b;
        if (c0184p != null && c0184p.h > 0) {
            if (!c0184p.m) {
                c0184p.i = f;
                c0184p.j = f2;
                synchronized (c0184p.t) {
                    if (c0184p.r != null && c0184p.A != 2) {
                        c0184p.d();
                    }
                }
                return true;
            }
            com.unity3d.player.a.t.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C0184p c0184p = this.b;
        if (c0184p == null) {
            return new Rect();
        }
        return c0184p.e;
    }

    public void closeCamera2() {
        C0184p c0184p = this.b;
        if (c0184p != null) {
            c0184p.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C0184p c0184p = this.b;
        if (c0184p != null) {
            c0184p.f();
        }
    }

    public void pauseCamera2() {
        C0184p c0184p = this.b;
        if (c0184p != null) {
            c0184p.c();
        }
    }

    public void stopCamera2() {
        C0184p c0184p = this.b;
        if (c0184p != null) {
            c0184p.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
