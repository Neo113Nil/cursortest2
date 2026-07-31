package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o7 {
    public static double a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d7 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d7);
        return d7 / 1.073741824E9d;
    }

    public static double b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d7 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d7);
        return d7 / 65536.0d;
    }

    public static int c(byte b7) {
        return b7 < 0 ? b7 + 256 : b7;
    }

    public static int d(ByteBuffer byteBuffer) {
        return (c(byteBuffer.get()) << 8) + c(byteBuffer.get());
    }

    public static long e(ByteBuffer byteBuffer) {
        long j7 = byteBuffer.getInt();
        return j7 < 0 ? j7 + 4294967296L : j7;
    }

    public static long f(ByteBuffer byteBuffer) {
        long e7 = e(byteBuffer) << 32;
        if (e7 >= 0) {
            return e7 + e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
