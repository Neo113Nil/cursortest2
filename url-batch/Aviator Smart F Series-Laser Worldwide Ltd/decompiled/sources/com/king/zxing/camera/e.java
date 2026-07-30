package com.king.zxing.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* loaded from: classes4.dex */
final class e implements Camera.PreviewCallback {
    private final b configManager;
    private Handler previewHandler;
    private int previewMessage;

    e(b bVar) {
        this.configManager = bVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point cameraResolution = this.configManager.getCameraResolution();
        Handler handler = this.previewHandler;
        if (cameraResolution == null || handler == null) {
            b5.b.d("Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.previewMessage, cameraResolution.x, cameraResolution.y, bArr).sendToTarget();
            this.previewHandler = null;
        }
    }

    void setHandler(Handler handler, int i8) {
        this.previewHandler = handler;
        this.previewMessage = i8;
    }
}
