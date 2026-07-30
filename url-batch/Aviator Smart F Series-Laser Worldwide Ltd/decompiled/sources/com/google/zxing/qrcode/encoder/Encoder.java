package com.google.zxing.qrcode.encoder;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Encoder {
    private static final int[] ALPHANUMERIC_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

    /* renamed from: com.google.zxing.qrcode.encoder.Encoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Encoder() {
    }

    static void append8BitBytes(String str, BitArray bitArray, String str2) {
        try {
            for (byte b8 : str.getBytes(str2)) {
                bitArray.appendBits(b8, 8);
            }
        } catch (UnsupportedEncodingException e8) {
            throw new WriterException(e8);
        }
    }

    static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            int alphanumericCode = getAlphanumericCode(charSequence.charAt(i8));
            if (alphanumericCode == -1) {
                throw new WriterException();
            }
            int i9 = i8 + 1;
            if (i9 < length) {
                int alphanumericCode2 = getAlphanumericCode(charSequence.charAt(i9));
                if (alphanumericCode2 == -1) {
                    throw new WriterException();
                }
                bitArray.appendBits((alphanumericCode * 45) + alphanumericCode2, 11);
                i8 += 2;
            } else {
                bitArray.appendBits(alphanumericCode, 6);
                i8 = i9;
            }
        }
    }

    static void appendBytes(String str, Mode mode, BitArray bitArray, String str2) {
        int i8 = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i8 == 1) {
            appendNumericBytes(str, bitArray);
            return;
        }
        if (i8 == 2) {
            appendAlphanumericBytes(str, bitArray);
        } else if (i8 == 3) {
            append8BitBytes(str, bitArray, str2);
        } else {
            if (i8 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            appendKanjiBytes(str, bitArray);
        }
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void appendKanjiBytes(String str, BitArray bitArray) {
        int i8;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i9 = 0; i9 < length; i9 += 2) {
                int i10 = ((bytes[i9] & 255) << 8) | (bytes[i9 + 1] & 255);
                int i11 = 33088;
                if (i10 < 33088 || i10 > 40956) {
                    if (i10 < 57408 || i10 > 60351) {
                        i8 = -1;
                        if (i8 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        bitArray.appendBits(((i8 >> 8) * PsExtractor.AUDIO_STREAM) + (i8 & 255), 13);
                    } else {
                        i11 = 49472;
                    }
                }
                i8 = i10 - i11;
                if (i8 != -1) {
                }
            }
        } catch (UnsupportedEncodingException e8) {
            throw new WriterException(e8);
        }
    }

    static void appendLengthInfo(int i8, Version version, Mode mode, BitArray bitArray) {
        int characterCountBits = mode.getCharacterCountBits(version);
        int i9 = 1 << characterCountBits;
        if (i8 < i9) {
            bitArray.appendBits(i8, characterCountBits);
            return;
        }
        throw new WriterException(i8 + " is bigger than " + (i9 - 1));
    }

    static void appendModeInfo(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            int charAt = charSequence.charAt(i8) - '0';
            int i9 = i8 + 2;
            if (i9 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i8 + 1) - '0') * 10) + (charSequence.charAt(i9) - '0'), 10);
                i8 += 3;
            } else {
                i8++;
                if (i8 < length) {
                    bitArray.appendBits((charAt * 10) + (charSequence.charAt(i8) - '0'), 7);
                    i8 = i9;
                } else {
                    bitArray.appendBits(charAt, 4);
                }
            }
        }
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.getSize() + mode.getCharacterCountBits(version) + bitArray2.getSize();
    }

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
        return MaskUtil.applyMaskPenaltyRule1(byteMatrix) + MaskUtil.applyMaskPenaltyRule2(byteMatrix) + MaskUtil.applyMaskPenaltyRule3(byteMatrix) + MaskUtil.applyMaskPenaltyRule4(byteMatrix);
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) {
        int i8 = Integer.MAX_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < 8; i10++) {
            MatrixUtil.buildMatrix(bitArray, errorCorrectionLevel, version, i10, byteMatrix);
            int calculateMaskPenalty = calculateMaskPenalty(byteMatrix);
            if (calculateMaskPenalty < i8) {
                i9 = i10;
                i8 = calculateMaskPenalty;
            }
        }
        return i9;
    }

    public static Mode chooseMode(String str) {
        return chooseMode(str, null);
    }

    private static Version chooseVersion(int i8, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i9 = 1; i9 <= 40; i9++) {
            Version versionForNumber = Version.getVersionForNumber(i9);
            if (willFit(i8, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) {
        return encode(str, errorCorrectionLevel, null);
    }

    static byte[] generateECBytes(byte[] bArr, int i8) {
        int length = bArr.length;
        int[] iArr = new int[length + i8];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i8);
        byte[] bArr2 = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr2[i10] = (byte) iArr[length + i10];
        }
        return bArr2;
    }

    static int getAlphanumericCode(int i8) {
        int[] iArr = ALPHANUMERIC_TABLE;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    static void getNumDataBytesAndNumECBytesForBlockID(int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        if (i11 >= i10) {
            throw new WriterException("Block ID too large");
        }
        int i12 = i8 % i10;
        int i13 = i10 - i12;
        int i14 = i8 / i10;
        int i15 = i14 + 1;
        int i16 = i9 / i10;
        int i17 = i16 + 1;
        int i18 = i14 - i16;
        int i19 = i15 - i17;
        if (i18 != i19) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i10 != i13 + i12) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i8 != ((i16 + i18) * i13) + ((i17 + i19) * i12)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i11 < i13) {
            iArr[0] = i16;
            iArr2[0] = i18;
        } else {
            iArr[0] = i17;
            iArr2[0] = i19;
        }
    }

    static BitArray interleaveWithECBytes(BitArray bitArray, int i8, int i9, int i10) {
        if (bitArray.getSizeInBytes() != i9) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            getNumDataBytesAndNumECBytesForBlockID(i8, i9, i10, i14, iArr, iArr2);
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            bitArray.toBytes(i11 << 3, bArr, 0, i15);
            byte[] generateECBytes = generateECBytes(bArr, iArr2[0]);
            arrayList.add(new BlockPair(bArr, generateECBytes));
            i12 = Math.max(i12, i15);
            i13 = Math.max(i13, generateECBytes.length);
            i11 += iArr[0];
        }
        if (i9 != i11) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray2 = new BitArray();
        for (int i16 = 0; i16 < i12; i16++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] dataBytes = ((BlockPair) it.next()).getDataBytes();
                if (i16 < dataBytes.length) {
                    bitArray2.appendBits(dataBytes[i16], 8);
                }
            }
        }
        for (int i17 = 0; i17 < i13; i17++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] errorCorrectionBytes = ((BlockPair) it2.next()).getErrorCorrectionBytes();
                if (i17 < errorCorrectionBytes.length) {
                    bitArray2.appendBits(errorCorrectionBytes[i17], 8);
                }
            }
        }
        if (i8 == bitArray2.getSizeInBytes()) {
            return bitArray2;
        }
        throw new WriterException("Interleaving error: " + i8 + " and " + bitArray2.getSizeInBytes() + " differ.");
    }

    private static boolean isOnlyDoubleByteKanji(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i8 = 0; i8 < length; i8 += 2) {
                int i9 = bytes[i8] & 255;
                if ((i9 < 129 || i9 > 159) && (i9 < 224 || i9 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) {
        return chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    static void terminateBits(int i8, BitArray bitArray) {
        int i9 = i8 << 3;
        if (bitArray.getSize() > i9) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i9);
        }
        for (int i10 = 0; i10 < 4 && bitArray.getSize() < i9; i10++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i8 - bitArray.getSizeInBytes();
        for (int i11 = 0; i11 < sizeInBytes; i11++) {
            bitArray.appendBits((i11 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray.getSize() != i9) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private static boolean willFit(int i8, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        return version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i8 + 7) / 8;
    }

    private static Mode chooseMode(String str, String str2) {
        if ("Shift_JIS".equals(str2) && isOnlyDoubleByteKanji(str)) {
            return Mode.KANJI;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt >= '0' && charAt <= '9') {
                z8 = true;
            } else {
                if (getAlphanumericCode(charAt) == -1) {
                    return Mode.BYTE;
                }
                z7 = true;
            }
        }
        return z7 ? Mode.ALPHANUMERIC : z8 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) {
        Version recommendVersion;
        CharacterSetECI characterSetECIByName;
        boolean z7 = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String obj = z7 ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode chooseMode = chooseMode(str, obj);
        BitArray bitArray = new BitArray();
        Mode mode = Mode.BYTE;
        if (chooseMode == mode && z7 && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(obj)) != null) {
            appendECI(characterSetECIByName, bitArray);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                appendModeInfo(Mode.FNC1_FIRST_POSITION, bitArray);
            }
        }
        appendModeInfo(chooseMode, bitArray);
        BitArray bitArray2 = new BitArray();
        appendBytes(str, chooseMode, bitArray2, obj);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                recommendVersion = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (!willFit(calculateBitsNeeded(chooseMode, bitArray, bitArray2, recommendVersion), recommendVersion, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
                BitArray bitArray3 = new BitArray();
                bitArray3.appendBitArray(bitArray);
                appendLengthInfo(chooseMode != mode ? bitArray2.getSizeInBytes() : str.length(), recommendVersion, chooseMode, bitArray3);
                bitArray3.appendBitArray(bitArray2);
                Version.ECBlocks eCBlocksForLevel = recommendVersion.getECBlocksForLevel(errorCorrectionLevel);
                int totalCodewords = recommendVersion.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
                terminateBits(totalCodewords, bitArray3);
                BitArray interleaveWithECBytes = interleaveWithECBytes(bitArray3, recommendVersion.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
                QRCode qRCode = new QRCode();
                qRCode.setECLevel(errorCorrectionLevel);
                qRCode.setMode(chooseMode);
                qRCode.setVersion(recommendVersion);
                int dimensionForVersion = recommendVersion.getDimensionForVersion();
                ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
                int chooseMaskPattern = chooseMaskPattern(interleaveWithECBytes, errorCorrectionLevel, recommendVersion, byteMatrix);
                qRCode.setMaskPattern(chooseMaskPattern);
                MatrixUtil.buildMatrix(interleaveWithECBytes, errorCorrectionLevel, recommendVersion, chooseMaskPattern, byteMatrix);
                qRCode.setMatrix(byteMatrix);
                return qRCode;
            }
        }
        recommendVersion = recommendVersion(errorCorrectionLevel, chooseMode, bitArray, bitArray2);
        BitArray bitArray32 = new BitArray();
        bitArray32.appendBitArray(bitArray);
        appendLengthInfo(chooseMode != mode ? bitArray2.getSizeInBytes() : str.length(), recommendVersion, chooseMode, bitArray32);
        bitArray32.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel2 = recommendVersion.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords2 = recommendVersion.getTotalCodewords() - eCBlocksForLevel2.getTotalECCodewords();
        terminateBits(totalCodewords2, bitArray32);
        BitArray interleaveWithECBytes2 = interleaveWithECBytes(bitArray32, recommendVersion.getTotalCodewords(), totalCodewords2, eCBlocksForLevel2.getNumBlocks());
        QRCode qRCode2 = new QRCode();
        qRCode2.setECLevel(errorCorrectionLevel);
        qRCode2.setMode(chooseMode);
        qRCode2.setVersion(recommendVersion);
        int dimensionForVersion2 = recommendVersion.getDimensionForVersion();
        ByteMatrix byteMatrix2 = new ByteMatrix(dimensionForVersion2, dimensionForVersion2);
        int chooseMaskPattern2 = chooseMaskPattern(interleaveWithECBytes2, errorCorrectionLevel, recommendVersion, byteMatrix2);
        qRCode2.setMaskPattern(chooseMaskPattern2);
        MatrixUtil.buildMatrix(interleaveWithECBytes2, errorCorrectionLevel, recommendVersion, chooseMaskPattern2, byteMatrix2);
        qRCode2.setMatrix(byteMatrix2);
        return qRCode2;
    }
}
