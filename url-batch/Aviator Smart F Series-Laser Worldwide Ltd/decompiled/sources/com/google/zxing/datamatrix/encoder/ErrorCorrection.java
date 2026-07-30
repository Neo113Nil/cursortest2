package com.google.zxing.datamatrix.encoder;

import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.baidu.location.BDLocation;
import com.crrepa.band.my.device.customkey.util.c;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, GattError.GATT_DUP_REG, 134, 240, 92, GattError.GATT_PRC_IN_PROGRESS}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, TsExtractor.TS_STREAM_TYPE_DTS, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, GattError.GATT_NOT_ENCRYPTED, 213, 97, 178, 100, 242}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, 119, TsExtractor.TS_STREAM_TYPE_DTS, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, TsExtractor.TS_PACKET_SIZE, 75, 66, 61, GpsTrainingDaoProxy.GPS_TYPE, 213, 109, 129, 94, GattError.GATT_PRC_IN_PROGRESS, 225, 48, 90, TsExtractor.TS_PACKET_SIZE}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, TsExtractor.TS_PACKET_SIZE, BDLocation.TypeCoarseLocation, 153, GattError.GATT_ALREADY_OPEN, GattError.GATT_CCC_CFG_ERR, 79, 108, 82, 27, 174, 186, TsExtractor.TS_STREAM_TYPE_AC4}, new int[]{52, FaceFrame.FACE_LANDMARKS_COUNT, 88, 205, 109, 39, DfuAdapter.ConnectState.REQUEST_MTU, 21, 155, 197, 251, 223, 155, 21, 5, TsExtractor.TS_STREAM_TYPE_AC4, GattError.GATT_PRC_IN_PROGRESS, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, TsExtractor.TS_STREAM_TYPE_DTS, 110, 213, GattError.GATT_ENCRYPED_NO_MITM, GattError.GATT_PENDING, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, BDLocation.TypeServerDecryptError, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, GattError.GATT_AUTH_FAIL, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, GattError.GATT_AUTH_FAIL, 31, 19, 38, 22, 153, SerialTrans.MTU_MAX, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, BDLocation.TypeServerError, 105, 214, 111, 57, 121, 21, 1, GattError.GATT_CCC_CFG_ERR, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, TsExtractor.TS_STREAM_TYPE_AC4, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, TsExtractor.TS_PACKET_SIZE, 237, 87, 191, 106, 16, GattError.GATT_CONNECTION_TIMEOUT, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, TsExtractor.TS_STREAM_TYPE_DTS, 186, 240, 82, 44, DfuAdapter.ConnectState.REQUEST_MTU, 87, 187, GattError.GATT_CONNECTION_TIMEOUT, BDLocation.TypeCoarseLocation, 175, 69, 213, 92, GattError.GATT_CCC_CFG_ERR, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, FAUEnum.PR_ANIMATE_FAILED, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, GattError.GATT_CANCEL, 218, 234, 117, 203, 29, 232, GattError.GATT_DUP_REG, 238, 22, 150, 201, 117, 62, 207, 164, 13, GattError.GATT_AUTH_FAIL, 245, 127, 67, SerialTrans.MTU_MAX, 28, 155, 43, 203, 107, 233, 53, GattError.GATT_CONGESTED, 46}, new int[]{242, 93, 169, 50, GattError.GATT_DUP_REG, 210, 39, 118, 202, TsExtractor.TS_PACKET_SIZE, 201, PsExtractor.PRIVATE_STREAM_1, GattError.GATT_CONGESTED, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, FaceFrame.FACE_LANDMARKS_COUNT, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, GattError.GATT_CONNECTION_TIMEOUT, 6, 27, 218, 51, 63, 87, 10, 40, 130, TsExtractor.TS_PACKET_SIZE, 17, 163, 31, DfuAdapter.ConnectState.REQUEST_MTU, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, GattError.GATT_CONNECTION_TIMEOUT, 244, 154, 36, 73, 127, 213, GattError.GATT_PENDING, 248, c.MAX_GOAL_TIME, 234, 197, 158, 177, 68, 122, 93, 213, 15, BDLocation.TypeCoarseLocation, 227, 236, 66, GattError.GATT_INVALID_CFG, 153, 185, 202, BDLocation.TypeServerError, 179, 25, 220, 232, 96, 210, 231, GattError.GATT_PENDING, 223, 239, 181, GpsTrainingDaoProxy.GPS_TYPE, 59, 52, TsExtractor.TS_STREAM_TYPE_AC4, 25, 49, 232, 211, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i8 = 1;
        for (int i9 = 0; i9 < 255; i9++) {
            ALOG[i9] = i8;
            LOG[i8] = i9;
            i8 <<= 1;
            if (i8 >= 256) {
                i8 ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i8) {
        return createECCBlock(charSequence, 0, charSequence.length(), i8);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int[] iArr3 = new int[interleavedBlockCount];
            int i8 = 0;
            while (i8 < interleavedBlockCount) {
                int i9 = i8 + 1;
                iArr[i8] = symbolInfo.getDataLengthForInterleavedBlock(i9);
                iArr2[i8] = symbolInfo.getErrorLengthForInterleavedBlock(i9);
                iArr3[i8] = 0;
                if (i8 > 0) {
                    iArr3[i8] = iArr3[i8 - 1] + iArr[i8];
                }
                i8 = i9;
            }
            for (int i10 = 0; i10 < interleavedBlockCount; i10++) {
                StringBuilder sb2 = new StringBuilder(iArr[i10]);
                for (int i11 = i10; i11 < symbolInfo.getDataCapacity(); i11 += interleavedBlockCount) {
                    sb2.append(str.charAt(i11));
                }
                String createECCBlock = createECCBlock(sb2.toString(), iArr2[i10]);
                int i12 = i10;
                int i13 = 0;
                while (i12 < iArr2[i10] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i12, createECCBlock.charAt(i13));
                    i12 += interleavedBlockCount;
                    i13++;
                }
            }
        }
        return sb.toString();
    }

    private static String createECCBlock(CharSequence charSequence, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i13 >= iArr.length) {
                i13 = -1;
                break;
            }
            if (iArr[i13] == i10) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i10)));
        }
        int[] iArr2 = FACTORS[i13];
        char[] cArr = new char[i10];
        for (int i14 = 0; i14 < i10; i14++) {
            cArr[i14] = 0;
        }
        for (int i15 = i8; i15 < i8 + i9; i15++) {
            int i16 = i10 - 1;
            int charAt = cArr[i16] ^ charSequence.charAt(i15);
            while (i16 > 0) {
                if (charAt == 0 || (i12 = iArr2[i16]) == 0) {
                    cArr[i16] = cArr[i16 - 1];
                } else {
                    char c8 = cArr[i16 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i16] = (char) (iArr3[(iArr4[charAt] + iArr4[i12]) % 255] ^ c8);
                }
                i16--;
            }
            if (charAt == 0 || (i11 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i11]) % 255];
            }
        }
        char[] cArr2 = new char[i10];
        for (int i17 = 0; i17 < i10; i17++) {
            cArr2[i17] = cArr[(i10 - i17) - 1];
        }
        return String.valueOf(cArr2);
    }
}
