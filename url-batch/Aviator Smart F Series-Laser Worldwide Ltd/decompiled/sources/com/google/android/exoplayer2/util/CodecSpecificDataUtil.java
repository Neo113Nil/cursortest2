package com.google.android.exoplayer2.util;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class CodecSpecificDataUtil {
    private static final int EXTENDED_PAR = 15;
    private static final int RECTANGULAR = 0;
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    private CodecSpecificDataUtil() {
    }

    public static String buildAvcCodecString(int i8, int i9, int i10) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z7) {
        return Collections.singletonList(z7 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i8, boolean z7, int i9, int i10, int[] iArr, int i11) {
        Object[] objArr = new Object[5];
        objArr[0] = HEVC_GENERAL_PROFILE_SPACE_STRINGS[i8];
        objArr[1] = Integer.valueOf(i9);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(z7 ? 'H' : org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_LT);
        objArr[4] = Integer.valueOf(i11);
        StringBuilder sb = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i9];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i8, bArr3, bArr2.length, i9);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i8) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i8 <= length) {
            if (isNalStartCode(bArr, i8)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z7;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i9 + 3;
            if (i10 >= bArr.length) {
                z7 = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i10] & 240) == 32) {
                z7 = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i9++;
        }
        Assertions.checkArgument(z7, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i9 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        Assertions.checkArgument(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits = parsableBitArray.readBits(16);
        Assertions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            Assertions.checkArgument(readBits > 0);
            for (int i11 = readBits - 1; i11 > 0; i11 >>= 1) {
                i8++;
            }
            parsableBitArray.skipBits(i8);
        }
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits2 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits3 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(readBits2), Integer.valueOf(readBits3));
    }

    private static boolean isNalStartCode(byte[] bArr, int i8) {
        if (bArr.length - i8 <= NAL_START_CODE.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i9 >= bArr2.length) {
                return true;
            }
            if (bArr[i8 + i9] != bArr2[i9]) {
                return false;
            }
            i9++;
        }
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(readUnsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        do {
            arrayList.add(Integer.valueOf(i8));
            i8 = findNalStartCode(bArr, i8 + NAL_START_CODE.length);
        } while (i8 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i9 = 0;
        while (i9 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i9)).intValue();
            int intValue2 = (i9 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i9 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i9] = bArr3;
            i9++;
        }
        return bArr2;
    }
}
