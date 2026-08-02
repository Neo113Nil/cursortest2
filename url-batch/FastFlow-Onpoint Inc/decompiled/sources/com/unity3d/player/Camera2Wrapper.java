package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import com.unity3d.player.a.AbstractC0019t;
import com.unity3d.player.a.C0016p;
import com.unity3d.player.a.InterfaceC0018s;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Camera2Wrapper implements InterfaceC0018s {
    public final Context a;
    public C0016p b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C0016p.a(this.a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C0016p.c(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C0016p.e(this.a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C0016p.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C0016p.b(this.a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C0016p c0016p = new C0016p(this);
        this.b = c0016p;
        return c0016p.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C0016p.d(this.a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C0016p c0016p = this.b;
        if (c0016p != null && c0016p.h > 0) {
            if (!c0016p.m) {
                c0016p.i = f;
                c0016p.j = f2;
                synchronized (c0016p.s) {
                    if (c0016p.r != null && c0016p.A != 2) {
                        c0016p.d();
                    }
                }
                return true;
            }
            AbstractC0019t.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C0016p c0016p = this.b;
        if (c0016p == null) {
            return new Rect();
        }
        return c0016p.e;
    }

    public void closeCamera2() {
        C0016p c0016p = this.b;
        if (c0016p != null) {
            c0016p.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C0016p c0016p = this.b;
        if (c0016p != null) {
            c0016p.f();
        }
    }

    public void pauseCamera2() {
        C0016p c0016p = this.b;
        if (c0016p != null) {
            c0016p.c();
        }
    }

    public void stopCamera2() {
        C0016p c0016p = this.b;
        if (c0016p != null) {
            c0016p.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
