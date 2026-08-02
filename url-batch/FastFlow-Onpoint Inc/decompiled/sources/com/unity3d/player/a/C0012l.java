package com.unity3d.player.a;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.a.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012l extends CameraDevice.StateCallback {
    public final /* synthetic */ C0016p a;

    public C0012l(C0016p c0016p) {
        this.a = c0016p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0016p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0016p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC0019t.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0016p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC0019t.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.a.a(cameraDevice);
        C0016p.D.release();
    }
}
