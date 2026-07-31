package com.unity3d.player.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.a.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0118k extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0123p a;

    public C0118k(C0123p c0123p) {
        this.a = c0123p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0123p c0123p = this.a;
        if (c0123p.b == null) {
            return;
        }
        synchronized (c0123p.s) {
            C0123p c0123p2 = this.a;
            c0123p2.r = cameraCaptureSession;
            try {
                c0123p2.q = c0123p2.b.createCaptureRequest(1);
                C0123p c0123p3 = this.a;
                c0123p3.q.addTarget(c0123p3.v);
                C0123p c0123p4 = this.a;
                c0123p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0123p4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                AbstractC0126t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC0126t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC0126t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
