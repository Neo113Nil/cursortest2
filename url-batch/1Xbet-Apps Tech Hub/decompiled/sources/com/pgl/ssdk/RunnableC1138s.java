package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* compiled from: HardwareDetectForSec.java */
/* renamed from: com.pgl.ssdk.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC1138s implements Runnable {
    RunnableC1138s() {
    }

    @Override // java.lang.Runnable
    public void run() {
        Context b = C1141v.b();
        int i = C1139t.b;
        if (i == -1) {
            CameraManager cameraManager = (CameraManager) b.getSystemService("camera");
            if (cameraManager != null) {
                try {
                    C1139t.b = cameraManager.getCameraIdList().length;
                } catch (Throwable unused) {
                    C1139t.b = -1;
                }
            } else {
                C1139t.b = -2;
            }
            i = C1139t.b;
        }
        C1139t.b = i;
        SharedPreferences a = L.a(C1141v.b());
        if (a != null) {
            a.edit().putInt("camera_count", C1139t.b).apply();
        }
    }
}
