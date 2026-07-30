package com.google.zxing.qrcode.encoder;

import cn.hutool.core.io.file.c;
import com.baidu.location.BDLocation;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;

/* loaded from: classes4.dex */
final class MatrixUtil {
    private static final int TYPE_INFO_MASK_PATTERN = 21522;
    private static final int TYPE_INFO_POLY = 1335;
    private static final int VERSION_INFO_POLY = 7973;
    private static final int[][] POSITION_DETECTION_PATTERN = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] POSITION_ADJUSTMENT_PATTERN = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, GattError.GATT_NOT_ENCRYPTED, -1}, new int[]{6, 34, 62, 90, 118, GattError.GATT_CANCEL, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, GattError.GATT_PENDING, BDLocation.TypeServerDecryptError}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new int[]{6, 30, 58, 86, 114, GattError.GATT_NOT_ENCRYPTED, 170}};
    private static final int[][] TYPE_INFO_COORDINATES = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private MatrixUtil() {
    }

    static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i8, ByteMatrix byteMatrix) {
        clearMatrix(byteMatrix);
        embedBasicPatterns(version, byteMatrix);
        embedTypeInfo(errorCorrectionLevel, i8, byteMatrix);
        maybeEmbedVersionInfo(version, byteMatrix);
        embedDataBits(bitArray, i8, byteMatrix);
    }

    static int calculateBCHCode(int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int findMSBSet = findMSBSet(i9);
        int i10 = i8 << (findMSBSet - 1);
        while (findMSBSet(i10) >= findMSBSet) {
            i10 ^= i9 << (findMSBSet(i10) - findMSBSet);
        }
        return i10;
    }

    static void clearMatrix(ByteMatrix byteMatrix) {
        byteMatrix.clear((byte) -1);
    }

    static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) {
        embedPositionDetectionPatternsAndSeparators(byteMatrix);
        embedDarkDotAtLeftBottomCorner(byteMatrix);
        maybeEmbedPositionAdjustmentPatterns(version, byteMatrix);
        embedTimingPatterns(byteMatrix);
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix byteMatrix) {
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
    }

    static void embedDataBits(BitArray bitArray, int i8, ByteMatrix byteMatrix) {
        boolean z7;
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i9 = 0;
        int i10 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < byteMatrix.getHeight()) {
                for (int i11 = 0; i11 < 2; i11++) {
                    int i12 = width - i11;
                    if (isEmpty(byteMatrix.get(i12, height))) {
                        if (i9 < bitArray.getSize()) {
                            z7 = bitArray.get(i9);
                            i9++;
                        } else {
                            z7 = false;
                        }
                        if (i8 != -1 && MaskUtil.getDataMaskBit(i8, i12, height)) {
                            z7 = !z7;
                        }
                        byteMatrix.set(i12, height, z7);
                    }
                }
                height += i10;
            }
            i10 = -i10;
            height += i10;
            width -= 2;
        }
        if (i9 == bitArray.getSize()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i9 + c.UNIX_SEPARATOR + bitArray.getSize());
    }

    private static void embedHorizontalSeparationPattern(int i8, int i9, ByteMatrix byteMatrix) {
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i8 + i10;
            if (!isEmpty(byteMatrix.get(i11, i9))) {
                throw new WriterException();
            }
            byteMatrix.set(i11, i9, 0);
        }
    }

    private static void embedPositionAdjustmentPattern(int i8, int i9, ByteMatrix byteMatrix) {
        for (int i10 = 0; i10 < 5; i10++) {
            int[] iArr = POSITION_ADJUSTMENT_PATTERN[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                byteMatrix.set(i8 + i11, i9 + i10, iArr[i11]);
            }
        }
    }

    private static void embedPositionDetectionPattern(int i8, int i9, ByteMatrix byteMatrix) {
        for (int i10 = 0; i10 < 7; i10++) {
            int[] iArr = POSITION_DETECTION_PATTERN[i10];
            for (int i11 = 0; i11 < 7; i11++) {
                byteMatrix.set(i8 + i11, i9 + i10, iArr[i11]);
            }
        }
    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix byteMatrix) {
        int length = POSITION_DETECTION_PATTERN[0].length;
        embedPositionDetectionPattern(0, 0, byteMatrix);
        embedPositionDetectionPattern(byteMatrix.getWidth() - length, 0, byteMatrix);
        embedPositionDetectionPattern(0, byteMatrix.getWidth() - length, byteMatrix);
        embedHorizontalSeparationPattern(0, 7, byteMatrix);
        embedHorizontalSeparationPattern(byteMatrix.getWidth() - 8, 7, byteMatrix);
        embedHorizontalSeparationPattern(0, byteMatrix.getWidth() - 8, byteMatrix);
        embedVerticalSeparationPattern(7, 0, byteMatrix);
        embedVerticalSeparationPattern(byteMatrix.getHeight() - 8, 0, byteMatrix);
        embedVerticalSeparationPattern(7, byteMatrix.getHeight() - 7, byteMatrix);
    }

    private static void embedTimingPatterns(ByteMatrix byteMatrix) {
        int i8 = 8;
        while (i8 < byteMatrix.getWidth() - 8) {
            int i9 = i8 + 1;
            int i10 = i9 % 2;
            if (isEmpty(byteMatrix.get(i8, 6))) {
                byteMatrix.set(i8, 6, i10);
            }
            if (isEmpty(byteMatrix.get(6, i8))) {
                byteMatrix.set(6, i8, i10);
            }
            i8 = i9;
        }
    }

    static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int i8, ByteMatrix byteMatrix) {
        BitArray bitArray = new BitArray();
        makeTypeInfoBits(errorCorrectionLevel, i8, bitArray);
        for (int i9 = 0; i9 < bitArray.getSize(); i9++) {
            boolean z7 = bitArray.get((bitArray.getSize() - 1) - i9);
            int[] iArr = TYPE_INFO_COORDINATES[i9];
            byteMatrix.set(iArr[0], iArr[1], z7);
            if (i9 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i9) - 1, 8, z7);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i9 - 8), z7);
            }
        }
    }

    private static void embedVerticalSeparationPattern(int i8, int i9, ByteMatrix byteMatrix) {
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = i9 + i10;
            if (!isEmpty(byteMatrix.get(i8, i11))) {
                throw new WriterException();
            }
            byteMatrix.set(i8, i11, 0);
        }
    }

    static int findMSBSet(int i8) {
        return 32 - Integer.numberOfLeadingZeros(i8);
    }

    private static boolean isEmpty(int i8) {
        return i8 == -1;
    }

    static void makeTypeInfoBits(ErrorCorrectionLevel errorCorrectionLevel, int i8, BitArray bitArray) {
        if (!QRCode.isValidMaskPattern(i8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i8;
        bitArray.appendBits(bits, 5);
        bitArray.appendBits(calculateBCHCode(bits, TYPE_INFO_POLY), 10);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(TYPE_INFO_MASK_PATTERN, 15);
        bitArray.xor(bitArray2);
        if (bitArray.getSize() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + bitArray.getSize());
    }

    static void makeVersionInfoBits(Version version, BitArray bitArray) {
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(calculateBCHCode(version.getVersionNumber(), VERSION_INFO_POLY), 12);
        if (bitArray.getSize() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + bitArray.getSize());
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() < 2) {
            return;
        }
        int[] iArr = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[version.getVersionNumber() - 1];
        for (int i8 : iArr) {
            if (i8 >= 0) {
                for (int i9 : iArr) {
                    if (i9 >= 0 && isEmpty(byteMatrix.get(i9, i8))) {
                        embedPositionAdjustmentPattern(i9 - 2, i8 - 2, byteMatrix);
                    }
                }
            }
        }
    }

    static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() < 7) {
            return;
        }
        BitArray bitArray = new BitArray();
        makeVersionInfoBits(version, bitArray);
        int i8 = 17;
        for (int i9 = 0; i9 < 6; i9++) {
            for (int i10 = 0; i10 < 3; i10++) {
                boolean z7 = bitArray.get(i8);
                i8--;
                byteMatrix.set(i9, (byteMatrix.getHeight() - 11) + i10, z7);
                byteMatrix.set((byteMatrix.getHeight() - 11) + i10, i9, z7);
            }
        }
    }
}
