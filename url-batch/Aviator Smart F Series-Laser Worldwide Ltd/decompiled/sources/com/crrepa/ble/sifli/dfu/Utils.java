package com.crrepa.ble.sifli.dfu;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes3.dex */
public class Utils {
    private static final ByteOrder order = ByteOrder.LITTLE_ENDIAN;

    public static byte[] addIntToByteArray(int i8, byte[] bArr, int i9) {
        System.arraycopy(ByteBuffer.allocate(4).order(order).putInt(i8).array(), 0, bArr, i9, 4);
        return bArr;
    }

    public static byte[] addShortToByteArray(int i8, byte[] bArr, int i9) {
        System.arraycopy(ByteBuffer.allocate(2).order(order).putShort((short) i8).array(), 0, bArr, i9, 2);
        return bArr;
    }

    public static int getIntFromByteArray(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i8, bArr2, 0, 4);
        return ByteBuffer.wrap(bArr2, 0, 4).order(order).getInt();
    }

    public static int getUnsignedShortFromByteArray(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i8, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(order).getShort() & u.MAX_VALUE;
    }
}
