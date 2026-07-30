package com.king.zxing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public class CaptureHandler extends Handler implements ResultPointCallback {
    private static final String TAG = "CaptureHandler";
    private final com.king.zxing.camera.d cameraManager;
    private final o decodeThread;
    private boolean isReturnBitmap;
    private boolean isSupportAutoZoom;
    private boolean isSupportLuminanceInvert;
    private boolean isSupportVerticalCode;
    private final r onCaptureListener;
    private State state;
    private final ViewfinderView viewfinderView;

    private enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    CaptureHandler(Activity activity, ViewfinderView viewfinderView, r rVar, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, com.king.zxing.camera.d dVar) {
        this.viewfinderView = viewfinderView;
        this.onCaptureListener = rVar;
        o oVar = new o(activity, dVar, this, collection, map, str, this);
        this.decodeThread = oVar;
        oVar.start();
        this.state = State.SUCCESS;
        this.cameraManager = dVar;
        dVar.startPreview();
        restartPreviewAndDecode();
    }

    private boolean isScreenPortrait(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    private ResultPoint transform(ResultPoint resultPoint) {
        float x7;
        float y7;
        int max;
        Point screenResolution = this.cameraManager.getScreenResolution();
        Point cameraResolution = this.cameraManager.getCameraResolution();
        int i8 = screenResolution.x;
        int i9 = screenResolution.y;
        if (i8 < i9) {
            x7 = (resultPoint.getX() * ((i8 * 1.0f) / cameraResolution.y)) - (Math.max(screenResolution.x, cameraResolution.y) / 2);
            y7 = resultPoint.getY() * ((i9 * 1.0f) / cameraResolution.x);
            max = Math.min(screenResolution.y, cameraResolution.x) / 2;
        } else {
            x7 = (resultPoint.getX() * ((i8 * 1.0f) / cameraResolution.x)) - (Math.min(screenResolution.y, cameraResolution.y) / 2);
            y7 = resultPoint.getY() * ((i9 * 1.0f) / cameraResolution.y);
            max = Math.max(screenResolution.x, cameraResolution.x) / 2;
        }
        return new ResultPoint(x7, y7 - max);
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        if (this.viewfinderView != null) {
            this.viewfinderView.addPossibleResultPoint(transform(resultPoint));
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        float f8;
        int i8 = message.what;
        if (i8 == R$id.restart_preview) {
            restartPreviewAndDecode();
            return;
        }
        if (i8 != R$id.decode_succeeded) {
            if (i8 == R$id.decode_failed) {
                this.state = State.PREVIEW;
                this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), R$id.decode);
                return;
            }
            return;
        }
        this.state = State.SUCCESS;
        Bundle data = message.getData();
        if (data != null) {
            byte[] byteArray = data.getByteArray(o.BARCODE_BITMAP);
            r1 = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
            f8 = data.getFloat(o.BARCODE_SCALED_FACTOR);
        } else {
            f8 = 1.0f;
        }
        this.onCaptureListener.onHandleDecode((Result) message.obj, r1, f8);
    }

    public boolean isReturnBitmap() {
        return this.isReturnBitmap;
    }

    public boolean isSupportAutoZoom() {
        return this.isSupportAutoZoom;
    }

    public boolean isSupportLuminanceInvert() {
        return this.isSupportLuminanceInvert;
    }

    public boolean isSupportVerticalCode() {
        return this.isSupportVerticalCode;
    }

    public void quitSynchronously() {
        this.state = State.DONE;
        this.cameraManager.stopPreview();
        Message.obtain(this.decodeThread.getHandler(), R$id.quit).sendToTarget();
        try {
            this.decodeThread.join(100L);
        } catch (InterruptedException unused) {
        }
        removeMessages(R$id.decode_succeeded);
        removeMessages(R$id.decode_failed);
    }

    public void restartPreviewAndDecode() {
        if (this.state == State.SUCCESS) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), R$id.decode);
            ViewfinderView viewfinderView = this.viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.drawViewfinder();
            }
        }
    }

    public void setReturnBitmap(boolean z7) {
        this.isReturnBitmap = z7;
    }

    public void setSupportAutoZoom(boolean z7) {
        this.isSupportAutoZoom = z7;
    }

    public void setSupportLuminanceInvert(boolean z7) {
        this.isSupportLuminanceInvert = z7;
    }

    public void setSupportVerticalCode(boolean z7) {
        this.isSupportVerticalCode = z7;
    }
}
