package com.crrepa.ble.ota.goodix;

import a4.a;
import com.crrepa.g1.c;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class BleRestoreWriteFormatter {
    private static final int DEFAULT_OFFSET = 16777216;
    public static final int PACKAGE_LENGTH = 1024;
    private static final int START_INDEX = 256;
    public static final String BOOT_FLAG = "ble_app_band";
    public static final byte[] BOOT_FLAG_BYTES = BOOT_FLAG.getBytes(StandardCharsets.UTF_8);
    public static byte HEAD_FIRST_BYTE = a.L0;
    public static byte HEAD_SECOND_BYTE = 71;

    public static byte[] getBootInfoCmd(byte[] bArr) {
        byte[] bArr2 = new byte[39];
        bArr2[0] = HEAD_FIRST_BYTE;
        bArr2[1] = HEAD_SECOND_BYTE;
        bArr2[2] = a.f50j0;
        bArr2[3] = 0;
        bArr2[4] = 31;
        bArr2[5] = 0;
        bArr2[6] = 0;
        bArr2[7] = 0;
        bArr2[8] = 0;
        bArr2[9] = 0;
        bArr2[10] = 1;
        bArr2[11] = 24;
        bArr2[12] = 0;
        byte[] bArr3 = new byte[24];
        System.arraycopy(bArr, (bArr.length - BOOT_FLAG_BYTES.length) - 24, bArr3, 0, 24);
        System.arraycopy(bArr3, 0, bArr2, 13, 24);
        int i8 = 0;
        for (int i9 = 2; i9 < 37; i9++) {
            i8 += c.a(bArr2[i9]);
        }
        byte[] a8 = c.a(i8);
        System.arraycopy(a8, 0, bArr2, 37, a8.length);
        return bArr2;
    }

    public static byte[] getReadFlashCmd(int i8) {
        byte[] b8 = c.b(((i8 + 256) * 1024) + 16777216);
        byte[] bArr = {HEAD_FIRST_BYTE, HEAD_SECOND_BYTE, 33, 0, 7, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0};
        System.arraycopy(b8, 0, bArr, 7, b8.length);
        int i9 = 0;
        for (int i10 = 2; i10 < 13; i10++) {
            i9 += c.a(bArr[i10]);
        }
        byte[] a8 = c.a(i9);
        System.arraycopy(a8, 0, bArr, 13, a8.length);
        return bArr;
    }

    public static byte[] getShutdownCmd() {
        return new byte[]{a.L0, 71, 2, 0, 0, 0, 2, 0};
    }

    public static byte[] getStartInfoCmd(byte[] bArr) {
        byte[] bArr2 = new byte[55];
        bArr2[0] = HEAD_FIRST_BYTE;
        bArr2[1] = HEAD_SECOND_BYTE;
        bArr2[2] = a.f50j0;
        bArr2[3] = 0;
        bArr2[4] = 47;
        bArr2[5] = 0;
        bArr2[6] = 0;
        bArr2[7] = 64;
        bArr2[8] = 0;
        bArr2[9] = 0;
        bArr2[10] = 1;
        bArr2[11] = a.f58l0;
        bArr2[12] = 0;
        System.arraycopy(bArr, 0, bArr2, 13, bArr.length);
        int i8 = 0;
        for (int i9 = 2; i9 < 53; i9++) {
            i8 += c.a(bArr2[i9]);
        }
        byte[] a8 = c.a(i8);
        System.arraycopy(a8, 0, bArr2, 53, a8.length);
        return bArr2;
    }
}
