package com.crrepa.ble.conn.bean;

import android.graphics.Bitmap;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes3.dex */
public class CRPWatchFaceBackgroundInfo {
    private static final int DEFAULT_TIMEOUT = 30;
    private Bitmap bitmap;
    private Bitmap thumBitmap;
    private int timeout = 30;
    private CRPWatchFaceLayoutInfo.CompressionType type;

    public CRPWatchFaceBackgroundInfo(Bitmap bitmap, Bitmap bitmap2, CRPWatchFaceLayoutInfo.CompressionType compressionType) {
        this.bitmap = bitmap;
        this.thumBitmap = bitmap2;
        this.type = compressionType;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public Bitmap getThumBitmap() {
        return this.thumBitmap;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public CRPWatchFaceLayoutInfo.CompressionType getType() {
        return this.type;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setThumBitmap(Bitmap bitmap) {
        this.thumBitmap = bitmap;
    }

    public void setTimeout(int i8) {
        this.timeout = i8;
    }

    public void setType(CRPWatchFaceLayoutInfo.CompressionType compressionType) {
        this.type = compressionType;
    }

    public String toString() {
        return "CRPWatchFaceBackgroundInfo{bitmap=" + this.bitmap + ", thumBitmap=" + this.thumBitmap + ", type=" + this.type + ", timeout=" + this.timeout + '}';
    }

    public CRPWatchFaceBackgroundInfo(Bitmap bitmap, CRPWatchFaceLayoutInfo.CompressionType compressionType) {
        this.bitmap = bitmap;
        this.type = compressionType;
    }
}
