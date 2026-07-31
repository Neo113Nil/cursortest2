package com.unity3d.player.a;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.a.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0119l extends CameraDevice.StateCallback {
    public final /* synthetic */ C0123p a;

    public C0119l(C0123p c0123p) {
        this.a = c0123p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0123p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0123p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC0126t.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0123p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC0126t.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.a.a(cameraDevice);
        C0123p.D.release();
    }
}
