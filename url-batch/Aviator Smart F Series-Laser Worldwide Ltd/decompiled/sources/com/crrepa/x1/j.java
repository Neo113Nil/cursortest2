package com.crrepa.x1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static String f14036a = "1.3.8";

    /* renamed from: b, reason: collision with root package name */
    private static final ByteOrder f14037b = ByteOrder.LITTLE_ENDIAN;

    public static int a(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i8, bArr2, 0, 4);
        return ByteBuffer.wrap(bArr2, 0, 4).order(f14037b).getInt();
    }

    public static int b(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i8, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(f14037b).getShort();
    }

    public static long c(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i8, bArr2, 0, 4);
        return h.a(ByteBuffer.wrap(bArr2, 0, 4).order(f14037b).getInt());
    }

    public static int d(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i8, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(f14037b).getShort() & u.MAX_VALUE;
    }

    public static byte[] a(int i8, byte[] bArr, int i9) {
        System.arraycopy(ByteBuffer.allocate(4).order(f14037b).putInt(i8).array(), 0, bArr, i9, 4);
        return bArr;
    }

    public static byte[] b(int i8, byte[] bArr, int i9) {
        System.arraycopy(ByteBuffer.allocate(2).order(f14037b).putShort((short) i8).array(), 0, bArr, i9, 2);
        return bArr;
    }
}
