package org.bouncycastle.util.encoders;

import okio.z0;

/* loaded from: classes5.dex */
public class f {
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_ILL = 0;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_END = -1;
    private static final byte S_ERR = -2;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, (byte) 5);
        fill(bArr2, 97, 108, (byte) 6);
        fill(bArr2, 109, 109, (byte) 7);
        fill(bArr2, 110, 111, (byte) 6);
        fill(bArr2, 112, 112, (byte) 8);
        fill(bArr2, 113, 115, (byte) 9);
        fill(bArr2, 116, 116, (byte) 10);
        fill(bArr2, 117, 127, (byte) 0);
        fill(bArr, 0, bArr.length - 1, (byte) -2);
        fill(bArr, 8, 11, (byte) -1);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, (byte) 16);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, (byte) 16);
        fill(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, S_P4A, 32, 96};
        for (int i8 = 0; i8 < 128; i8++) {
            byte b8 = bArr2[i8];
            firstUnitTable[i8] = (short) (bArr4[b8] | ((bArr3[b8] & i8) << 8));
        }
    }

    private static void fill(byte[] bArr, int i8, int i9, byte b8) {
        while (i8 <= i9) {
            bArr[i8] = b8;
            i8++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < bArr.length) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 < 0) {
                short s7 = firstUnitTable[b8 & Byte.MAX_VALUE];
                int i11 = s7 >>> 8;
                byte b9 = (byte) s7;
                while (b9 >= 0) {
                    if (i10 >= bArr.length) {
                        return -1;
                    }
                    int i12 = i10 + 1;
                    byte b10 = bArr[i10];
                    i11 = (i11 << 6) | (b10 & 63);
                    b9 = transitionTable[b9 + ((b10 & 255) >>> 4)];
                    i10 = i12;
                }
                if (b9 == -2) {
                    return -1;
                }
                if (i11 <= 65535) {
                    if (i9 >= cArr.length) {
                        return -1;
                    }
                    cArr[i9] = (char) i11;
                    i9++;
                } else {
                    if (i9 >= cArr.length - 1) {
                        return -1;
                    }
                    int i13 = i9 + 1;
                    cArr[i9] = (char) ((i11 >>> 10) + z0.HIGH_SURROGATE_HEADER);
                    i9 += 2;
                    cArr[i13] = (char) ((i11 & 1023) | z0.LOG_SURROGATE_HEADER);
                }
                i8 = i10;
            } else {
                if (i9 >= cArr.length) {
                    return -1;
                }
                cArr[i9] = (char) b8;
                i8 = i10;
                i9++;
            }
        }
        return i9;
    }
}
