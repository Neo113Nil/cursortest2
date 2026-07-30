package com.king.zxing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* loaded from: classes4.dex */
final class n extends Handler {
    private final com.king.zxing.camera.d cameraManager;
    private final Context context;
    private final CaptureHandler handler;
    private long lastZoomTime;
    private final MultiFormatReader multiFormatReader;
    private boolean running = true;

    n(Context context, com.king.zxing.camera.d dVar, CaptureHandler captureHandler, Map<DecodeHintType, Object> map) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.multiFormatReader = multiFormatReader;
        multiFormatReader.setHints(map);
        this.context = context;
        this.cameraManager = dVar;
        this.handler = captureHandler;
    }

    private PlanarYUVLuminanceSource buildPlanarYUVLuminanceSource(byte[] bArr, int i8, int i9, boolean z7) {
        if (!z7) {
            return this.cameraManager.buildLuminanceSource(bArr, i8, i9);
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i8; i11++) {
                bArr2[(((i11 * i9) + i9) - i10) - 1] = bArr[(i10 * i8) + i11];
            }
        }
        return this.cameraManager.buildLuminanceSource(bArr2, i9, i8);
    }

    private static void bundleThumbnail(PlanarYUVLuminanceSource planarYUVLuminanceSource, Bundle bundle) {
        int[] renderThumbnail = planarYUVLuminanceSource.renderThumbnail();
        int thumbnailWidth = planarYUVLuminanceSource.getThumbnailWidth();
        Bitmap createBitmap = Bitmap.createBitmap(renderThumbnail, 0, thumbnailWidth, thumbnailWidth, planarYUVLuminanceSource.getThumbnailHeight(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(o.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(o.BARCODE_SCALED_FACTOR, thumbnailWidth / planarYUVLuminanceSource.getWidth());
    }

    private void decode(byte[] bArr, int i8, int i9, boolean z7, boolean z8) {
        boolean z9;
        long currentTimeMillis = System.currentTimeMillis();
        PlanarYUVLuminanceSource buildPlanarYUVLuminanceSource = buildPlanarYUVLuminanceSource(bArr, i8, i9, z7);
        Result result = null;
        if (buildPlanarYUVLuminanceSource != null) {
            try {
                result = this.multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(buildPlanarYUVLuminanceSource)));
                z9 = false;
            } catch (Exception unused) {
                z9 = true;
            }
            if (z9 && this.handler.isSupportLuminanceInvert()) {
                try {
                    result = this.multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(buildPlanarYUVLuminanceSource.invert())));
                    z9 = false;
                } catch (Exception unused2) {
                    z9 = true;
                }
            }
            if (z9) {
                try {
                    result = this.multiFormatReader.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(buildPlanarYUVLuminanceSource)));
                    z9 = false;
                } catch (Exception unused3) {
                    z9 = true;
                }
            }
            if (z9 && z8 && (buildPlanarYUVLuminanceSource = buildPlanarYUVLuminanceSource(bArr, i8, i9, !z7)) != null) {
                try {
                    result = this.multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(buildPlanarYUVLuminanceSource)));
                } catch (Exception unused4) {
                }
            }
            this.multiFormatReader.reset();
        }
        if (result == null) {
            CaptureHandler captureHandler = this.handler;
            if (captureHandler != null) {
                Message.obtain(captureHandler, R$id.decode_failed).sendToTarget();
                return;
            }
            return;
        }
        b5.b.d("Found barcode in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        BarcodeFormat barcodeFormat = result.getBarcodeFormat();
        CaptureHandler captureHandler2 = this.handler;
        if (captureHandler2 != null && captureHandler2.isSupportAutoZoom() && barcodeFormat == BarcodeFormat.QR_CODE) {
            ResultPoint[] resultPoints = result.getResultPoints();
            if (resultPoints.length >= 3) {
                if (handleAutoZoom((int) Math.max(Math.max(ResultPoint.distance(resultPoints[0], resultPoints[1]), ResultPoint.distance(resultPoints[1], resultPoints[2])), ResultPoint.distance(resultPoints[0], resultPoints[2])), i8)) {
                    Message obtain = Message.obtain();
                    obtain.what = R$id.decode_succeeded;
                    obtain.obj = result;
                    if (this.handler.isReturnBitmap()) {
                        Bundle bundle = new Bundle();
                        bundleThumbnail(buildPlanarYUVLuminanceSource, bundle);
                        obtain.setData(bundle);
                    }
                    this.handler.sendMessageDelayed(obtain, 300L);
                    return;
                }
            }
        }
        CaptureHandler captureHandler3 = this.handler;
        if (captureHandler3 != null) {
            Message obtain2 = Message.obtain(captureHandler3, R$id.decode_succeeded, result);
            if (this.handler.isReturnBitmap()) {
                Bundle bundle2 = new Bundle();
                bundleThumbnail(buildPlanarYUVLuminanceSource, bundle2);
                obtain2.setData(bundle2);
            }
            obtain2.sendToTarget();
        }
    }

    private boolean handleAutoZoom(int i8, int i9) {
        Camera camera;
        if (this.lastZoomTime > System.currentTimeMillis() - 1000) {
            return true;
        }
        if (i8 >= i9 / 5 || (camera = this.cameraManager.getOpenCamera().getCamera()) == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            b5.b.i("Zoom not supported");
            return false;
        }
        int maxZoom = parameters.getMaxZoom();
        parameters.setZoom(Math.min(parameters.getZoom() + (maxZoom / 5), maxZoom));
        camera.setParameters(parameters);
        this.lastZoomTime = System.currentTimeMillis();
        return true;
    }

    private boolean isScreenPortrait() {
        Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null || !this.running) {
            return;
        }
        int i8 = message.what;
        if (i8 == R$id.decode) {
            decode((byte[]) message.obj, message.arg1, message.arg2, isScreenPortrait(), this.handler.isSupportVerticalCode());
        } else if (i8 == R$id.quit) {
            this.running = false;
            Looper.myLooper().quit();
        }
    }
}
