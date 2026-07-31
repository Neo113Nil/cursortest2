package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1752j extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1766o f22188a;

    public C1752j(C1766o c1766o) {
        this.f22188a = c1766o;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f22188a.f22202A = 3;
        h1.T.a(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C1766o c1766o = this.f22188a;
        if (c1766o.f22204b == null) {
            return;
        }
        synchronized (c1766o.f22222t) {
            C1766o c1766o2 = this.f22188a;
            c1766o2.f22220r = cameraCaptureSession;
            try {
                try {
                    c1766o2.f22219q = c1766o2.f22204b.createCaptureRequest(1);
                    C1766o c1766o3 = this.f22188a;
                    c1766o3.f22219q.addTarget(c1766o3.f22225w);
                    C1766o c1766o4 = this.f22188a;
                    c1766o4.f22219q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c1766o4.f22216n);
                    this.f22188a.e();
                } catch (CameraAccessException e4) {
                    h1.T.a(6, "Camera2: CameraAccessException " + e4);
                }
            } catch (IllegalStateException e5) {
                h1.T.a(6, "Camera2: IllegalStateException " + e5);
            }
        }
    }
}
