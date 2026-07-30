package com.baidu.ar.arplay.core.engine3d;

import android.util.Log;
import com.baidu.ar.arplay.core.engine.engine3d.IARPCamera;

/* loaded from: classes.dex */
public class ARPCamera extends ARPNode implements IARPCamera {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1722a = 0;
    private static ARPCamera mARPCamera;

    public static class ARPCameraType {
        public static final int ORTHOGRAPHIC = 2;
        public static final int PERSPECTIVE = 1;
    }

    private ARPCamera() {
    }

    private void checkSceneCameraValid() {
        bindInternal(nativeCheckSceneCameraValid());
    }

    public static void destory() {
        ARPCamera aRPCamera = mARPCamera;
        if (aRPCamera != null) {
            aRPCamera.lock.lock();
            mARPCamera.mNativeNodeAddr = -1L;
            nativeDestory();
            mARPCamera.lock.unlock();
            mARPCamera = null;
        }
    }

    public static ARPCamera getDefaultCamera() {
        ARPCamera aRPCamera;
        ARPCamera aRPCamera2 = mARPCamera;
        if (aRPCamera2 != null) {
            aRPCamera2.checkSceneCameraValid();
            return mARPCamera;
        }
        synchronized (ARPCamera.class) {
            try {
                if (mARPCamera == null) {
                    mARPCamera = new ARPCamera();
                }
                mARPCamera.checkSceneCameraValid();
                aRPCamera = mARPCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aRPCamera;
    }

    public static native void nativeDestory();

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public float getFieldOfView() {
        if (this.mNativeNodeAddr != -1) {
            return nativeGetFieldOfView(this.mNativeNodeAddr);
        }
        Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        return 0.0f;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public float[] getViewMatrix() {
        if (this.mNativeNodeAddr == -1) {
            Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
            return null;
        }
        this.lock.lock();
        float[] nativeGetViewMatrix = nativeGetViewMatrix(this.mNativeNodeAddr);
        this.lock.unlock();
        return nativeGetViewMatrix;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public float getZFar() {
        if (this.mNativeNodeAddr != -1) {
            return nativeGetZFar(this.mNativeNodeAddr);
        }
        Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        return 0.0f;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public float getZNear() {
        if (this.mNativeNodeAddr != -1) {
            return nativeGetZNear(this.mNativeNodeAddr);
        }
        Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        return 0.0f;
    }

    public native long nativeCheckSceneCameraValid();

    public native float nativeGetFieldOfView(long j8);

    public native float[] nativeGetViewMatrix(long j8);

    public native float nativeGetZFar(long j8);

    public native float nativeGetZNear(long j8);

    public native void nativeSetFieldOfView(long j8, float f8);

    public native void nativeSetViewMatrix(long j8, float[] fArr);

    public native void nativeSetZFar(long j8, float f8);

    public native void nativeSetZNear(long j8, float f8);

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public void setFieldOfView(float f8) {
        if (this.mNativeNodeAddr == -1) {
            Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        } else {
            nativeSetFieldOfView(this.mNativeNodeAddr, f8);
        }
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public void setViewMatrix(float[] fArr) {
        if (this.mNativeNodeAddr == -1) {
            Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
            return;
        }
        this.lock.lock();
        nativeSetViewMatrix(this.mNativeNodeAddr, fArr);
        this.lock.unlock();
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public void setZFar(float f8) {
        if (this.mNativeNodeAddr == -1) {
            Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        } else {
            nativeSetZFar(this.mNativeNodeAddr, f8);
        }
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPCamera
    public void setZNear(float f8) {
        if (this.mNativeNodeAddr == -1) {
            Log.e(ARPCamera.class.getSimpleName(), "node addr is error");
        } else {
            nativeSetZNear(this.mNativeNodeAddr, f8);
        }
    }
}
