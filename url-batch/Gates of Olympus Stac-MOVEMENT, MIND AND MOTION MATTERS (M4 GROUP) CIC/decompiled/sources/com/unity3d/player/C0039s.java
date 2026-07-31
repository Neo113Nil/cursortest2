package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0039s extends CameraCaptureSession.StateCallback {
    final /* synthetic */ C0047w a;

    C0039s(C0047w c0047w) {
        this.a = c0047w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC0053z.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        Object obj;
        StringBuilder append;
        CameraDevice cameraDevice2;
        CaptureRequest.Builder builder;
        Surface surface;
        CaptureRequest.Builder builder2;
        Range range;
        C0047w c0047w = this.a;
        cameraDevice = c0047w.b;
        if (cameraDevice == null) {
            return;
        }
        obj = c0047w.s;
        synchronized (obj) {
            C0047w c0047w2 = this.a;
            c0047w2.r = cameraCaptureSession;
            try {
                try {
                    cameraDevice2 = c0047w2.b;
                    c0047w2.q = cameraDevice2.createCaptureRequest(1);
                    C0047w c0047w3 = this.a;
                    builder = c0047w3.q;
                    surface = c0047w3.v;
                    builder.addTarget(surface);
                    C0047w c0047w4 = this.a;
                    builder2 = c0047w4.q;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    range = c0047w4.n;
                    builder2.set(key, range);
                    this.a.g();
                } catch (IllegalStateException e) {
                    append = new StringBuilder("Camera2: IllegalStateException ").append(e);
                    AbstractC0053z.Log(6, append.toString());
                }
            } catch (CameraAccessException e2) {
                append = new StringBuilder("Camera2: CameraAccessException ").append(e2);
                AbstractC0053z.Log(6, append.toString());
            }
        }
    }
}
