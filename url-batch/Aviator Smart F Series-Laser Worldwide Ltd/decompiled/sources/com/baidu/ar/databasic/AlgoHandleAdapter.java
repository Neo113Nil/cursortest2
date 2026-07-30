package com.baidu.ar.databasic;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class AlgoHandleAdapter {
    public static native long createHandle();

    public static native int destroyHandle(long j8);

    public static native boolean getHandleEnableSync(long j8);

    public static native long getHandleFaceHandle(long j8);

    public static native byte[] getHandleImageData(long j8);

    public static native int getHandleImageHeight(long j8);

    public static native int getHandleImageWidth(long j8);

    public static native boolean getHandleIsFront(long j8);

    public static native float getHandleMaskBottom(long j8);

    public static native byte[] getHandleMaskData(long j8);

    public static native int getHandleMaskFormat(long j8);

    public static native int getHandleMaskHeight(long j8);

    public static native float getHandleMaskThreshold(long j8);

    public static native float getHandleMaskTop(long j8);

    public static native int getHandleMaskWidth(long j8);

    public static native int getHandleOrientation(long j8);

    public static native int getHandleReferenceCount(long j8);

    public static native int getHandleReserveData(long j8, ReserveHandleData reserveHandleData);

    public static native float[] getHandleResult(long j8);

    public static native int getHandleResultLength(long j8);

    public static native long getHandleTimeStamp(long j8);

    public static native int getHandleType(long j8);

    public static native int getVersion();

    public static native int increaseHandleReference(long j8);

    public static native int setHandleFaceHandle(long j8, long j9);

    public static native int setHandleInput(long j8, int i8, long j9, int i9, int i10, int i11, boolean z7, int i12, boolean z8, ByteBuffer byteBuffer);

    public static native int setHandleMaskData(long j8, int i8, int i9, int i10, byte[] bArr);

    public static native int setHandleMaskThreshold(long j8, float f8);

    public static native int setHandleReserveData(long j8, ReserveHandleData reserveHandleData);

    public static native int setHandleResult(long j8, int i8, float[] fArr);
}
