package com.compress.nativelib;

import android.util.Log;
import com.compress.api.CompressParam;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import java.util.Locale;

/* loaded from: classes2.dex */
public class NativeLib {
    private static final String TAG = "NativeLib";
    private PicZipEventCallback callback;

    private static void printHexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (int i8 = 0; i8 < bArr.length; i8++) {
            String hexString = Integer.toHexString(bArr[i8] & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            if (i8 < bArr.length - 1) {
                char c8 = i8 % 16 == 15 ? '\n' : ' ';
                sb.append(c8);
                if (c8 == '\n') {
                    FileLogger.write(sb.toString().toUpperCase(Locale.getDefault()));
                    sb = new StringBuilder("");
                }
            }
        }
        FileLogger.write(sb.toString().toUpperCase(Locale.getDefault()));
    }

    public native boolean CompressInJNI(CompressParam compressParam);

    public native void DecompressInJNI(int i8, byte[] bArr);

    public void compressRetsFromJNI(int i8, int i9, int i10, byte[] bArr) {
        PicZipEventCallback picZipEventCallback = this.callback;
        if (picZipEventCallback != null) {
            picZipEventCallback.compressRets(i8, i9, i10, bArr);
        }
    }

    public void decompressRetsFromJNI(int i8, int i9, int i10, int i11, int i12, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (this.callback != null) {
            DecompressRet decompressRet = new DecompressRet();
            decompressRet.setWidth(i10);
            decompressRet.setHeight(i11);
            decompressRet.setFormat(i12);
            decompressRet.setRedChannel(bArr);
            decompressRet.setGreenChannel(bArr2);
            decompressRet.setBlueChannel(bArr3);
            decompressRet.setAlphaChannel(bArr4);
            Log.i(TAG, "decompressRetsFromJNI: format = " + i12);
            this.callback.deCompressRets(i8, i9, decompressRet);
        }
    }

    public void setCallback(PicZipEventCallback picZipEventCallback) {
        this.callback = picZipEventCallback;
    }
}
