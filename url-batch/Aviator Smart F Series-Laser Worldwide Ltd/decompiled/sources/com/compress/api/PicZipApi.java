package com.compress.api;

import com.compress.nativelib.NativeLib;

/* loaded from: classes2.dex */
public class PicZipApi {
    private static PicZipApi instance;
    private PicZipEventCallback callback;
    private NativeLib nativeLib;

    private PicZipApi() {
    }

    public static PicZipApi getInstance() {
        if (instance == null) {
            instance = new PicZipApi();
        }
        return instance;
    }

    public void compress(CompressParam compressParam) {
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib == null) {
            PicZipEventCallback picZipEventCallback = this.callback;
            if (picZipEventCallback != null) {
                picZipEventCallback.compressRets(compressParam.getId(), 4097, compressParam.getTileWidth(), null);
                return;
            }
            return;
        }
        if (compressParam != null) {
            nativeLib.CompressInJNI(compressParam);
            return;
        }
        PicZipEventCallback picZipEventCallback2 = this.callback;
        if (picZipEventCallback2 != null) {
            picZipEventCallback2.compressRets(-1, 4098, -1, null);
        }
    }

    public void decompress(int i8, byte[] bArr) {
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib == null) {
            PicZipEventCallback picZipEventCallback = this.callback;
            if (picZipEventCallback != null) {
                picZipEventCallback.deCompressRets(i8, 4097, null);
                return;
            }
            return;
        }
        if (bArr != null) {
            nativeLib.DecompressInJNI(i8, bArr);
            return;
        }
        PicZipEventCallback picZipEventCallback2 = this.callback;
        if (picZipEventCallback2 != null) {
            picZipEventCallback2.deCompressRets(i8, 4099, null);
        }
    }

    public void init() {
        this.nativeLib = new NativeLib();
        System.loadLibrary("nativelib");
    }

    public void setCallback(PicZipEventCallback picZipEventCallback) {
        this.callback = picZipEventCallback;
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib != null) {
            nativeLib.setCallback(picZipEventCallback);
        }
    }
}
