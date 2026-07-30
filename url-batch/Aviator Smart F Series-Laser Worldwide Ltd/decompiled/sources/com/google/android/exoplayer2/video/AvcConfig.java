package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class AvcConfig {

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

    private AvcConfig(List<byte[]> list, int i8, int i9, int i10, int i11, int i12, int i13, float f8, @Nullable String str) {
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

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, readUnsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i14 = 0; i14 < readUnsignedByte3; i14++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (readUnsignedByte2 > 0) {
                NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i15 = parseSpsNalUnit.width;
                int i16 = parseSpsNalUnit.height;
                int i17 = parseSpsNalUnit.colorSpace;
                int i18 = parseSpsNalUnit.colorRange;
                int i19 = parseSpsNalUnit.colorTransfer;
                float f9 = parseSpsNalUnit.pixelWidthHeightRatio;
                str = CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit.profileIdc, parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit.levelIdc);
                i11 = i18;
                i12 = i19;
                f8 = f9;
                i8 = i15;
                i9 = i16;
                i10 = i17;
            } else {
                str = null;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                f8 = 1.0f;
            }
            return new AvcConfig(arrayList, readUnsignedByte, i8, i9, i10, i11, i12, f8, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e8);
        }
    }
}
