package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0036s extends CameraCaptureSession.StateCallback {
    final /* synthetic */ C0044w a;

    C0036s(C0044w c0044w) {
        this.a = c0044w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC0050z.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        Object obj;
        String str;
        CameraDevice cameraDevice2;
        CaptureRequest.Builder builder;
        Surface surface;
        CaptureRequest.Builder builder2;
        Range range;
        C0044w c0044w = this.a;
        cameraDevice = c0044w.b;
        if (cameraDevice == null) {
            return;
        }
        obj = c0044w.s;
        synchronized (obj) {
            C0044w c0044w2 = this.a;
            c0044w2.r = cameraCaptureSession;
            try {
                cameraDevice2 = c0044w2.b;
                c0044w2.q = cameraDevice2.createCaptureRequest(1);
                C0044w c0044w3 = this.a;
                builder = c0044w3.q;
                surface = c0044w3.v;
                builder.addTarget(surface);
                C0044w c0044w4 = this.a;
                builder2 = c0044w4.q;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                range = c0044w4.n;
                builder2.set(key, range);
                this.a.g();
            } catch (CameraAccessException e) {
                str = "Camera2: CameraAccessException " + e;
                AbstractC0050z.Log(6, str);
            } catch (IllegalStateException e2) {
                str = "Camera2: IllegalStateException " + e2;
                AbstractC0050z.Log(6, str);
            }
        }
    }
}
