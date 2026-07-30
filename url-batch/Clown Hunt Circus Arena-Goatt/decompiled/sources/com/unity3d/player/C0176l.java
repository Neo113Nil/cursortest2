package com.unity3d.player;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176l extends CameraDevice.StateCallback {
    public final /* synthetic */ C0184p a;

    public C0176l(C0184p c0184p) {
        this.a = c0184p;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0184p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0184p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        com.unity3d.player.a.t.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0184p.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        com.unity3d.player.a.t.Log(6, "Camera2: Error opening CameraDevice " + i);
        this.a.a(cameraDevice);
        C0184p.D.release();
    }
}
