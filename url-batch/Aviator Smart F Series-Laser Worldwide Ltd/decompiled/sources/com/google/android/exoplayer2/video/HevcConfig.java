package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i8, int i9, int i10, int i11, int i12, int i13, float f8, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i8;
        this.width = i9;
        this.height = i10;
        this.colorSpace = i11;
        this.colorRange = i12;
        this.colorTransfer = i13;
        this.pixelWidthHeightRatio = f8;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) {
        int i8;
        int i9;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < readUnsignedByte2; i12++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i13 = 0; i13 < readUnsignedShort; i13++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i11 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i11];
            String str = null;
            int i14 = 0;
            int i15 = 0;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f8 = 1.0f;
            while (i14 < readUnsignedByte2) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i21 = 0;
                while (i21 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i22 = readUnsignedByte2;
                    System.arraycopy(bArr2, i10, bArr, i15, bArr2.length);
                    int length = i15 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 33 && i21 == 0) {
                        NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4);
                        int i23 = parseH265SpsNalUnit.width;
                        i17 = parseH265SpsNalUnit.height;
                        i18 = parseH265SpsNalUnit.colorSpace;
                        int i24 = parseH265SpsNalUnit.colorRange;
                        int i25 = parseH265SpsNalUnit.colorTransfer;
                        float f9 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                        i8 = readUnsignedByte3;
                        i9 = readUnsignedShort3;
                        i16 = i23;
                        str = CodecSpecificDataUtil.buildHevcCodecString(parseH265SpsNalUnit.generalProfileSpace, parseH265SpsNalUnit.generalTierFlag, parseH265SpsNalUnit.generalProfileIdc, parseH265SpsNalUnit.generalProfileCompatibilityFlags, parseH265SpsNalUnit.constraintBytes, parseH265SpsNalUnit.generalLevelIdc);
                        i20 = i25;
                        i19 = i24;
                        f8 = f9;
                    } else {
                        i8 = readUnsignedByte3;
                        i9 = readUnsignedShort3;
                    }
                    i15 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i21++;
                    readUnsignedByte2 = i22;
                    readUnsignedByte3 = i8;
                    readUnsignedShort3 = i9;
                    i10 = 0;
                }
                i14++;
                i10 = 0;
            }
            return new HevcConfig(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), readUnsignedByte + 1, i16, i17, i18, i19, i20, f8, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e8);
        }
    }
}
