package com.unity3d.player.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.a.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011k extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0016p a;

    public C0011k(C0016p c0016p) {
        this.a = c0016p;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0016p c0016p = this.a;
        if (c0016p.b == null) {
            return;
        }
        synchronized (c0016p.s) {
            C0016p c0016p2 = this.a;
            c0016p2.r = cameraCaptureSession;
            try {
                c0016p2.q = c0016p2.b.createCaptureRequest(1);
                C0016p c0016p3 = this.a;
                c0016p3.q.addTarget(c0016p3.v);
                C0016p c0016p4 = this.a;
                c0016p4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0016p4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                AbstractC0019t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC0019t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC0019t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
