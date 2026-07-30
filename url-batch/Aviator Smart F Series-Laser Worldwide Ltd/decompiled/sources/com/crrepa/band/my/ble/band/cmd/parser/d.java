package com.crrepa.band.my.ble.band.cmd.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class d {
    private static final int CHIP_ID_LENGTH = 1;
    private static final int CHIP_ID_POSITION = 6;
    private static final byte DEVICE_FIRST_BYTE = -22;
    private static final int DEVICE_INFO_LENGTH = 8;
    private static final int DEVICE_INFO_TYPE = 22;
    private static final byte DEVICE_SECOND_BYTE = -2;
    private static final String FIRMWARE_TYPE_FILLING = "0";
    private static final int FIRMWARE_TYPE_LENGTH = 3;
    private static final int FIRMWARE_TYPE_POSITION = 2;
    private static final int FUNCTION_LENGTH = 2;
    private static final int FUNCTION_POSITION = 7;
    private static final int PLATFORM_LENGTH = 1;
    private static final int PLATFORM_POSITION = 5;

    private static boolean isDeviceInfo(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -22 && bArr[1] == -2;
    }

    public static c parseScanRecord(byte[] bArr) {
        byte b8;
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (order.remaining() > 2 && (b8 = order.get()) != 0) {
            int i8 = (byte) (b8 - 1);
            if (order.get() != 22) {
                int position = order.position() + i8;
                if (i8 <= 0 || position >= order.limit()) {
                    return null;
                }
                order.position(position);
            } else {
                byte[] bArr2 = new byte[i8];
                order.get(bArr2, 0, i8);
                if (isDeviceInfo(bArr2)) {
                    byte[] bArr3 = new byte[3];
                    System.arraycopy(bArr2, 2, bArr3, 0, 3);
                    String str = new String(bArr3);
                    str.replace("0", "");
                    byte[] bArr4 = new byte[1];
                    System.arraycopy(bArr2, 5, bArr4, 0, 1);
                    byte b9 = bArr4[0];
                    byte[] bArr5 = new byte[1];
                    System.arraycopy(bArr2, 6, bArr5, 0, 1);
                    byte b10 = bArr5[0];
                    int i9 = i8 - 7;
                    byte[] bArr6 = new byte[i9];
                    System.arraycopy(bArr2, 7, bArr6, 0, i9);
                    int twoBytes2int = 1 < i9 ? twoBytes2int(bArr6[1], bArr6[0]) : bArr6[0];
                    c cVar = new c();
                    cVar.setFirmwareType(str);
                    cVar.setPlatform(b9);
                    cVar.setChipId(b10);
                    cVar.setFunction(twoBytes2int);
                    return cVar;
                }
            }
        }
        return null;
    }

    private static int twoBytes2int(byte b8, byte b9) {
        return ((b8 & 255) << 8) + (b9 & 255);
    }
}
