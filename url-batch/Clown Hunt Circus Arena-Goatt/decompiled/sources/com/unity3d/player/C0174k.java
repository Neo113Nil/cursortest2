package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174k extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0184p a;

    public C0174k(C0184p c0184p) {
        this.a = c0184p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0184p c0184p = this.a;
        if (c0184p.b == null) {
            return;
        }
        synchronized (c0184p.t) {
            C0184p c0184p2 = this.a;
            c0184p2.r = cameraCaptureSession;
            try {
                c0184p2.q = c0184p2.b.createCaptureRequest(1);
                C0184p c0184p3 = this.a;
                c0184p3.q.addTarget(c0184p3.w);
                C0184p c0184p4 = this.a;
                c0184p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0184p4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                com.unity3d.player.a.t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                com.unity3d.player.a.t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.A = 3;
        com.unity3d.player.a.t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
