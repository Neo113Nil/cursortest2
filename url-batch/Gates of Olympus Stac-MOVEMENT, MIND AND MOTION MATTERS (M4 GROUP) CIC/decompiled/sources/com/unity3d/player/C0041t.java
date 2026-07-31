package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0041t extends CameraDevice.StateCallback {
    final /* synthetic */ C0047w a;

    C0041t(C0047w c0047w) {
        this.a = c0047w;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Semaphore semaphore;
        semaphore = C0047w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Semaphore semaphore;
        AbstractC0053z.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        semaphore = C0047w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Semaphore semaphore;
        AbstractC0053z.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.a.a(cameraDevice);
        semaphore = C0047w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Semaphore semaphore;
        this.a.b = cameraDevice;
        semaphore = C0047w.D;
        semaphore.release();
    }
}
