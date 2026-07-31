package com.unity3d.player;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1755k extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1766o f22190a;

    public C1755k(C1766o c1766o) {
        this.f22190a = c1766o;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C1766o.f22201D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        h1.T.a(5, "Camera2: CameraDevice disconnected.");
        this.f22190a.a(cameraDevice);
        C1766o.f22201D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i4) {
        h1.T.a(6, "Camera2: Error opening CameraDevice " + i4);
        this.f22190a.a(cameraDevice);
        C1766o.f22201D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f22190a.f22204b = cameraDevice;
        C1766o.f22201D.release();
    }
}
