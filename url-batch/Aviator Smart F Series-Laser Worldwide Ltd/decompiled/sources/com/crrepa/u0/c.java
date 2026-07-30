package com.crrepa.u0;

import android.graphics.Bitmap;
import com.compress.api.CompressParam;
import com.compress.api.PicZipApi;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class c {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13859a = new c();

        private b() {
        }
    }

    private c() {
        PicZipApi.getInstance().init();
    }

    public static c a() {
        return b.f13859a;
    }

    public void a(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        BleLog.i("width: " + width + ", height: " + height);
        int i8 = width * height;
        byte[] bArr = new byte[i8];
        byte[] bArr2 = new byte[i8];
        byte[] bArr3 = new byte[i8];
        byte[] bArr4 = new byte[i8];
        for (int i9 = 0; i9 < height; i9++) {
            for (int i10 = 0; i10 < width; i10++) {
                int pixel = bitmap.getPixel(i10, i9);
                int i11 = (i9 * width) + i10;
                int i12 = (pixel >> 24) & 255;
                int i13 = (pixel >> 16) & 255;
                int i14 = (pixel >> 8) & 255;
                int i15 = pixel & 255;
                if (config == Bitmap.Config.RGB_565) {
                    bArr[i11] = (byte) (i13 >> 3);
                    bArr2[i11] = (byte) (i14 >> 2);
                    bArr3[i11] = (byte) (i15 >> 3);
                } else {
                    bArr[i11] = (byte) i13;
                    bArr2[i11] = (byte) i14;
                    bArr3[i11] = (byte) i15;
                }
                bArr4[i11] = (byte) i12;
            }
        }
        final CompressParam compressParam = new CompressParam();
        compressParam.setWidth(width);
        compressParam.setHeight(height);
        compressParam.setStride(width);
        compressParam.setModeRgb(1);
        compressParam.setModeAlpha(1);
        compressParam.setCmpMode(0);
        compressParam.setTileWidth(8);
        compressParam.setAlphaChannel(bArr4);
        compressParam.setRedChannel(bArr);
        compressParam.setGreenChannel(bArr2);
        compressParam.setBlueChannel(bArr3);
        if (config == Bitmap.Config.ARGB_8888) {
            compressParam.setPixelFormat(1);
        } else {
            compressParam.setPixelFormat(config == Bitmap.Config.RGB_565 ? 2 : 0);
        }
        BleLog.i("compress: " + compressParam.getPixelFormat());
        new Thread(new Runnable() { // from class: com.crrepa.u0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(CompressParam.this);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CompressParam compressParam) {
        PicZipApi.getInstance().compress(compressParam);
    }

    public void a(PicZipEventCallback picZipEventCallback) {
        PicZipApi.getInstance().setCallback(picZipEventCallback);
    }
}
