package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;

@Deprecated
/* loaded from: classes3.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] != 71) {
            i8++;
        }
        return i8;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i8, int i9, int i10) {
        int i11 = 0;
        for (int i12 = -4; i12 <= 4; i12++) {
            int i13 = (i12 * TsExtractor.TS_PACKET_SIZE) + i10;
            if (i13 < i8 || i13 >= i9 || bArr[i13] != 71) {
                i11 = 0;
            } else {
                i11++;
                if (i11 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i8, int i9) {
        parsableByteArray.setPosition(i8);
        if (parsableByteArray.bytesLeft() < 5) {
            return C.TIME_UNSET;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) != 0 || ((2096896 & readInt) >> 8) != i9 || (readInt & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
