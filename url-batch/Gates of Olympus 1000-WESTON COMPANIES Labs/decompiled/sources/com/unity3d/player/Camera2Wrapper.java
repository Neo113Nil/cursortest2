package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import com.unity3d.player.a.AbstractC0126t;
import com.unity3d.player.a.C0123p;
import com.unity3d.player.a.InterfaceC0125s;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class Camera2Wrapper implements InterfaceC0125s {
    public final Context a;
    public C0123p b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C0123p.a(this.a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C0123p.c(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C0123p.e(this.a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C0123p.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C0123p.b(this.a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C0123p c0123p = new C0123p(this);
        this.b = c0123p;
        return c0123p.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C0123p.d(this.a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C0123p c0123p = this.b;
        if (c0123p != null && c0123p.h > 0) {
            if (!c0123p.m) {
                c0123p.i = f;
                c0123p.j = f2;
                synchronized (c0123p.s) {
                    if (c0123p.r != null && c0123p.A != 2) {
                        c0123p.d();
                    }
                }
                return true;
            }
            AbstractC0126t.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C0123p c0123p = this.b;
        if (c0123p == null) {
            return new Rect();
        }
        return c0123p.e;
    }

    public void closeCamera2() {
        C0123p c0123p = this.b;
        if (c0123p != null) {
            c0123p.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C0123p c0123p = this.b;
        if (c0123p != null) {
            c0123p.f();
        }
    }

    public void pauseCamera2() {
        C0123p c0123p = this.b;
        if (c0123p != null) {
            c0123p.c();
        }
    }

    public void stopCamera2() {
        C0123p c0123p = this.b;
        if (c0123p != null) {
            c0123p.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
