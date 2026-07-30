package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i8, boolean z7, int i9, int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15, int i16, int i17, float f8, int i18, int i19, int i20) {
            this.generalProfileSpace = i8;
            this.generalTierFlag = z7;
            this.generalProfileIdc = i9;
            this.generalProfileCompatibilityFlags = i10;
            this.chromaFormatIdc = i11;
            this.bitDepthLumaMinus8 = i12;
            this.bitDepthChromaMinus8 = i13;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i14;
            this.seqParameterSetId = i15;
            this.width = i16;
            this.height = i17;
            this.pixelWidthHeightRatio = f8;
            this.colorSpace = i18;
            this.colorRange = i19;
            this.colorTransfer = i20;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i8, int i9, boolean z7) {
            this.picParameterSetId = i8;
            this.seqParameterSetId = i9;
            this.bottomFieldPicOrderInFramePresentFlag = z7;
        }
    }

    public static final class SpsData {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8, boolean z7, boolean z8, int i15, int i16, int i17, boolean z9, int i18, int i19, int i20) {
            this.profileIdc = i8;
            this.constraintsFlagsAndReservedZero2Bits = i9;
            this.levelIdc = i10;
            this.seqParameterSetId = i11;
            this.maxNumRefFrames = i12;
            this.width = i13;
            this.height = i14;
            this.pixelWidthHeightRatio = f8;
            this.separateColorPlaneFlag = z7;
            this.frameMbsOnlyFlag = z8;
            this.frameNumLength = i15;
            this.picOrderCountType = i16;
            this.picOrderCntLsbLength = i17;
            this.deltaPicOrderAlwaysZeroFlag = z9;
            this.colorSpace = i18;
            this.colorRange = i19;
            this.colorTransfer = i20;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i8 + 1;
            if (i10 >= position) {
                byteBuffer.clear();
                return;
            }
            int i11 = byteBuffer.get(i8) & 255;
            if (i9 == 3) {
                if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i8 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i11 == 0) {
                i9++;
            }
            if (i11 != 0) {
                i9 = 0;
            }
            i8 = i10;
        }
    }

    public static int findNalUnit(byte[] bArr, int i8, int i9, boolean[] zArr) {
        int i10 = i9 - i8;
        Assertions.checkState(i10 >= 0);
        if (i10 == 0) {
            return i9;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i8 - 3;
        }
        if (i10 > 1 && zArr[1] && bArr[i8] == 1) {
            clearPrefixFlags(zArr);
            return i8 - 2;
        }
        if (i10 > 2 && zArr[2] && bArr[i8] == 0 && bArr[i8 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i8 - 1;
        }
        int i11 = i9 - 1;
        int i12 = i8 + 2;
        while (i12 < i11) {
            byte b8 = bArr[i12];
            if ((b8 & 254) == 0) {
                int i13 = i12 - 2;
                if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b8 == 1) {
                    clearPrefixFlags(zArr);
                    return i13;
                }
                i12 -= 2;
            }
            i12 += 3;
        }
        zArr[0] = i10 <= 2 ? !(i10 != 2 ? !(zArr[1] && bArr[i11] == 1) : !(zArr[2] && bArr[i9 + (-2)] == 0 && bArr[i11] == 1)) : bArr[i9 + (-3)] == 0 && bArr[i9 + (-2)] == 0 && bArr[i11] == 1;
        zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
        zArr[2] = bArr[i11] == 0;
        return i9;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i8, int i9) {
        while (i8 < i9 - 2) {
            if (bArr[i8] == 0 && bArr[i8 + 1] == 0 && bArr[i8 + 2] == 3) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int getH265NalUnitType(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & a4.a.f97x1) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i8) {
        return bArr[i8 + 3] & 31;
    }

    public static boolean isNalUnitSei(@Nullable String str, byte b8) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b8 & 31) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b8 & a4.a.f97x1) >> 1) == 39;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i8, int i9) {
        return parseH265SpsNalUnitPayload(bArr, i8 + 2, i9);
    }

    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i8, int i9) {
        int i10;
        float f8;
        int i11;
        int i12;
        int i13;
        int i14;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i8, i9);
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int readBits2 = parsableNalUnitBitArray.readBits(2);
        boolean readBit = parsableNalUnitBitArray.readBit();
        int readBits3 = parsableNalUnitBitArray.readBits(5);
        int i15 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (parsableNalUnitBitArray.readBit()) {
                i15 |= 1 << i16;
            }
        }
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < 6; i17++) {
            iArr[i17] = parsableNalUnitBitArray.readBits(8);
        }
        int readBits4 = parsableNalUnitBitArray.readBits(8);
        int i18 = 0;
        for (int i19 = 0; i19 < readBits; i19++) {
            if (parsableNalUnitBitArray.readBit()) {
                i18 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i18 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i18);
        if (readBits > 0) {
            parsableNalUnitBitArray.skipBits((8 - readBits) * 2);
        }
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt2 == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readUnsignedExpGolombCodedInt3 -= ((readUnsignedExpGolombCodedInt2 == 1 || readUnsignedExpGolombCodedInt2 == 2) ? 2 : 1) * (readUnsignedExpGolombCodedInt5 + readUnsignedExpGolombCodedInt6);
            readUnsignedExpGolombCodedInt4 -= (readUnsignedExpGolombCodedInt2 == 1 ? 2 : 1) * (readUnsignedExpGolombCodedInt7 + readUnsignedExpGolombCodedInt8);
        }
        int i20 = readUnsignedExpGolombCodedInt4;
        int i21 = readUnsignedExpGolombCodedInt3;
        int i22 = i20;
        int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i23 = parsableNalUnitBitArray.readBit() ? 0 : readBits; i23 <= readBits; i23++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipH265ScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i24 = 0; i24 < readUnsignedExpGolombCodedInt12; i24++) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt11 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        int i25 = -1;
        float f9 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int readBits5 = parsableNalUnitBitArray.readBits(8);
                if (readBits5 == 255) {
                    int readBits6 = parsableNalUnitBitArray.readBits(16);
                    int readBits7 = parsableNalUnitBitArray.readBits(16);
                    if (readBits6 != 0 && readBits7 != 0) {
                        f9 = readBits6 / readBits7;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (readBits5 < fArr.length) {
                        f9 = fArr[readBits5];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + readBits5);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i12 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int readBits8 = parsableNalUnitBitArray.readBits(8);
                    int readBits9 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    i25 = ColorInfo.isoColorPrimariesToColorSpace(readBits8);
                    i14 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits9);
                } else {
                    i14 = -1;
                }
            } else {
                i14 = -1;
                i12 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                i22 *= 2;
            }
            i13 = i14;
            i11 = i25;
            f8 = f9;
            i10 = i22;
        } else {
            i10 = i22;
            f8 = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new H265SpsData(readBits2, readBit, readBits3, i15, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt9, readUnsignedExpGolombCodedInt10, iArr, readBits4, readUnsignedExpGolombCodedInt, i21, i10, f8, i11, i12, i13);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i8, int i9) {
        return parsePpsNalUnitPayload(bArr, i8 + 1, i9);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i8, int i9) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i8, i9);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i8, int i9) {
        return parseSpsNalUnitPayload(bArr, i8 + 1, i9);
    }

    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i8, int i9) {
        int readUnsignedExpGolombCodedInt;
        boolean readBit;
        int i10;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i8, i9);
        int readBits = parsableNalUnitBitArray.readBits(8);
        int readBits2 = parsableNalUnitBitArray.readBits(8);
        int readBits3 = parsableNalUnitBitArray.readBits(8);
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readBits == 100 || readBits == 110 || readBits == 122 || readBits == 244 || readBits == 44 || readBits == 83 || readBits == 86 || readBits == 118 || readBits == 128 || readBits == 138) {
            readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBit = readUnsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i17 = readUnsignedExpGolombCodedInt != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i18 < 6 ? 16 : 64);
                    }
                    i18++;
                }
            }
        } else {
            readUnsignedExpGolombCodedInt = 1;
            readBit = false;
        }
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt4 == 0) {
            i10 = readUnsignedExpGolombCodedInt;
            z7 = readBit;
            i11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            z8 = false;
        } else {
            if (readUnsignedExpGolombCodedInt4 == 1) {
                boolean readBit2 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                z7 = readBit;
                long readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i10 = readUnsignedExpGolombCodedInt;
                for (int i19 = 0; i19 < readUnsignedExpGolombCodedInt5; i19++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z8 = readBit2;
            } else {
                i10 = readUnsignedExpGolombCodedInt;
                z7 = readBit;
                z8 = false;
            }
            i11 = 0;
        }
        int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean readBit3 = parsableNalUnitBitArray.readBit();
        int i20 = (2 - (readBit3 ? 1 : 0)) * readUnsignedExpGolombCodedInt8;
        if (!readBit3) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i21 = readUnsignedExpGolombCodedInt7 * 16;
        int i22 = i20 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (i10 == 0) {
                i16 = 2 - (readBit3 ? 1 : 0);
                i15 = 1;
            } else {
                int i23 = i10;
                i15 = i23 == 3 ? 1 : 2;
                i16 = (i23 == 1 ? 2 : 1) * (2 - (readBit3 ? 1 : 0));
            }
            i21 -= (readUnsignedExpGolombCodedInt9 + readUnsignedExpGolombCodedInt10) * i15;
            i22 -= (readUnsignedExpGolombCodedInt11 + readUnsignedExpGolombCodedInt12) * i16;
        }
        int i24 = i21;
        float f8 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int readBits4 = parsableNalUnitBitArray.readBits(8);
                if (readBits4 == 255) {
                    int readBits5 = parsableNalUnitBitArray.readBits(16);
                    int readBits6 = parsableNalUnitBitArray.readBits(16);
                    if (readBits5 != 0 && readBits6 != 0) {
                        f8 = readBits5 / readBits6;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (readBits4 < fArr.length) {
                        f8 = fArr[readBits4];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + readBits4);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                int i25 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (!parsableNalUnitBitArray.readBit()) {
                    i13 = i25;
                    i12 = -1;
                    i14 = -1;
                    return new SpsData(readBits, readBits2, readBits3, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt6, i24, i22, f8, z7, readBit3, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4, i11, z8, i12, i13, i14);
                }
                int readBits7 = parsableNalUnitBitArray.readBits(8);
                int readBits8 = parsableNalUnitBitArray.readBits(8);
                parsableNalUnitBitArray.skipBits(8);
                i12 = ColorInfo.isoColorPrimariesToColorSpace(readBits7);
                i14 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8);
                i13 = i25;
                return new SpsData(readBits, readBits2, readBits3, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt6, i24, i22, f8, z7, readBit3, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4, i11, z8, i12, i13, i14);
            }
        }
        i12 = -1;
        i13 = -1;
        i14 = -1;
        return new SpsData(readBits, readBits2, readBits3, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt6, i24, i22, f8, z7, readBit3, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4, i11, z8, i12, i13, i14);
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = 0;
            while (i9 < 6) {
                int i10 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int min = Math.min(64, 1 << ((i8 << 1) + 4));
                    if (i8 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i11 = 0; i11 < min; i11++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i8 == 3) {
                    i10 = 3;
                }
                i9 += i10;
            }
        }
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i8) {
        int i9 = 8;
        int i10 = 8;
        for (int i11 = 0; i11 < i8; i11++) {
            if (i9 != 0) {
                i9 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i10) + 256) % 256;
            }
            if (i9 != 0) {
                i10 = i9;
            }
        }
    }

    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < readUnsignedExpGolombCodedInt; i10++) {
            if (i10 == 0 || !parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr3 = new int[readUnsignedExpGolombCodedInt2];
                int i11 = 0;
                while (i11 < readUnsignedExpGolombCodedInt2) {
                    iArr3[i11] = (i11 > 0 ? iArr3[i11 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i11++;
                }
                int[] iArr4 = new int[readUnsignedExpGolombCodedInt3];
                int i12 = 0;
                while (i12 < readUnsignedExpGolombCodedInt3) {
                    iArr4[i12] = (i12 > 0 ? iArr4[i12 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i12++;
                }
                i8 = readUnsignedExpGolombCodedInt2;
                iArr = iArr3;
                i9 = readUnsignedExpGolombCodedInt3;
                iArr2 = iArr4;
            } else {
                int i13 = i8 + i9;
                int readUnsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr5 = new int[i14];
                int[] iArr6 = new int[i14];
                int i16 = 0;
                for (int i17 = i9 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + readUnsignedExpGolombCodedInt4;
                    if (i18 < 0 && zArr[i8 + i17]) {
                        iArr5[i16] = i18;
                        i16++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 < 0 && zArr[i13]) {
                    iArr5[i16] = readUnsignedExpGolombCodedInt4;
                    i16++;
                }
                for (int i19 = 0; i19 < i8; i19++) {
                    int i20 = iArr[i19] + readUnsignedExpGolombCodedInt4;
                    if (i20 < 0 && zArr[i19]) {
                        iArr5[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i16);
                int i21 = 0;
                for (int i22 = i8 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + readUnsignedExpGolombCodedInt4;
                    if (i23 > 0 && zArr[i22]) {
                        iArr6[i21] = i23;
                        i21++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 > 0 && zArr[i13]) {
                    iArr6[i21] = readUnsignedExpGolombCodedInt4;
                    i21++;
                }
                for (int i24 = 0; i24 < i9; i24++) {
                    int i25 = iArr2[i24] + readUnsignedExpGolombCodedInt4;
                    if (i25 > 0 && zArr[i8 + i24]) {
                        iArr6[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i21);
                iArr = copyOf;
                i8 = i16;
                i9 = i21;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i8) {
        int i9;
        synchronized (scratchEscapePositionsLock) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                try {
                    i10 = findNextUnescapeIndex(bArr, i10, i8);
                    if (i10 < i8) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i11) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i11] = i10;
                        i10 += 3;
                        i11++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i9 = i8 - i11;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = scratchEscapePositions[i14] - i13;
                System.arraycopy(bArr, i13, bArr, i12, i15);
                int i16 = i12 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i12 = i16 + 2;
                bArr[i17] = 0;
                i13 += i15 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i12, i9 - i12);
        }
        return i9;
    }
}
