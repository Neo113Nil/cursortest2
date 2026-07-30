package com.crrepa.ble.scan;

import com.crrepa.ble.scan.bean.CRPScanRecordInfo;
import com.crrepa.g1.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class CRPScanRecordParser {
    private static final int CHIP_ID_LENGTH = 1;
    private static final int CHIP_ID_POSITION = 6;
    private static final String FIRMWARE_TYPE_FILLING = "0";
    private static final int FIRMWARE_TYPE_LENGTH = 3;
    private static final int FIRMWARE_TYPE_POSITION = 2;
    private static final int FUNCTION_LENGTH = 2;
    private static final int FUNCTION_POSITION = 7;
    private static final int LOCAL_NAME_TYPE = 9;
    private static final int PLATFORM_LENGTH = 1;
    private static final int PLATFORM_POSITION = 5;
    private static final int SERVICE_DATA_LENGTH = 8;
    private static final int SERVICE_DATA_TYPE = 22;

    public static CRPScanRecordInfo parseScanRecord(byte[] bArr) {
        byte b8;
        if (c.h(bArr)) {
            return null;
        }
        CRPScanRecordInfo cRPScanRecordInfo = new CRPScanRecordInfo();
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (order.remaining() > 2 && (b8 = order.get()) != 0) {
            byte b9 = order.get();
            int i8 = (byte) (b8 - 1);
            if (b9 != 9) {
                if (b9 != 22) {
                    int position = order.position() + i8;
                    if (i8 <= 0 || position >= order.limit()) {
                        return null;
                    }
                    order.position(position);
                } else {
                    if (i8 < 8) {
                        return null;
                    }
                    byte[] bArr2 = new byte[i8];
                    order.get(bArr2, 0, i8);
                    byte[] bArr3 = new byte[3];
                    System.arraycopy(bArr2, 2, bArr3, 0, 3);
                    String str = new String(bArr3);
                    str.replace("0", "");
                    byte[] bArr4 = new byte[1];
                    System.arraycopy(bArr2, 5, bArr4, 0, 1);
                    byte b10 = bArr4[0];
                    byte[] bArr5 = new byte[1];
                    System.arraycopy(bArr2, 6, bArr5, 0, 1);
                    byte b11 = bArr5[0];
                    int i9 = i8 - 7;
                    byte[] bArr6 = new byte[i9];
                    System.arraycopy(bArr2, 7, bArr6, 0, i9);
                    byte b12 = 1 < i9 ? bArr6[1] : bArr6[0];
                    cRPScanRecordInfo.setFirmwareType(str);
                    cRPScanRecordInfo.setPlatform(CRPScanRecordInfo.McuPlatform.getInstance(b10));
                    cRPScanRecordInfo.setChipId(b11);
                    cRPScanRecordInfo.setFunction(CRPScanRecordInfo.BandFunction.getInstance(b12));
                }
            } else if (i8 > 0) {
                byte[] bArr7 = new byte[i8];
                order.get(bArr7, 0, i8);
                cRPScanRecordInfo.setName(new String(bArr7, StandardCharsets.UTF_8));
            }
        }
        return cRPScanRecordInfo;
    }
}
