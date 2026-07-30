package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import b5.b;
import cn.hutool.core.text.l;
import com.baidu.ar.k;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.my.lib.data.ErrorCode;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", l.SPACE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", "V", ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", l.SPACE, "a", "b", "c", "d", "e", "f", "g", CmcdHeadersFactory.STREAMING_FORMAT_HLS, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "j", k.f2621r, CmcdHeadersFactory.STREAM_TYPE_LIVE, "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", l.SPACE, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", b.VERTICAL, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", SystemInfoUtil.COMMA, "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", l.SPACE, "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", ErrorCode.PARAMETER_ERROR, "6", "7", "8", "9", SystemInfoUtil.COMMA, ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = readByte(zArr, i8 << 3);
        }
        return bArr;
    }

    private boolean[] correctBits(boolean[] zArr) {
        int i8;
        GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i8 = 6;
        } else {
            i8 = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i8 = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i8 = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i8;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i8;
        int[] iArr = new int[length];
        int i9 = 0;
        while (i9 < length) {
            iArr[i9] = readCode(zArr, length2, i8);
            i9++;
            length2 += i8;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i10 = 1 << i8;
            int i11 = i10 - 1;
            int i12 = 0;
            for (int i13 = 0; i13 < nbDatablocks; i13++) {
                int i14 = iArr[i13];
                if (i14 == 0 || i14 == i11) {
                    throw FormatException.getFormatInstance();
                }
                if (i14 == 1 || i14 == i10 - 2) {
                    i12++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i8) - i12];
            int i15 = 0;
            for (int i16 = 0; i16 < nbDatablocks; i16++) {
                int i17 = iArr[i16];
                if (i17 == 1 || i17 == i10 - 2) {
                    Arrays.fill(zArr2, i15, (i15 + i8) - 1, i17 > 1);
                    i15 += i8 - 1;
                } else {
                    int i18 = i8 - 1;
                    while (i18 >= 0) {
                        int i19 = i15 + 1;
                        zArr2[i15] = ((1 << i18) & i17) != 0;
                        i18--;
                        i15 = i19;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e8) {
            throw FormatException.getFormatInstance(e8);
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        boolean isCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i8 = (isCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i8];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, isCompact)];
        int i9 = 2;
        if (isCompact) {
            for (int i10 = 0; i10 < i8; i10++) {
                iArr[i10] = i10;
            }
        } else {
            int i11 = i8 / 2;
            int i12 = ((i8 + 1) + (((i11 - 1) / 15) * 2)) / 2;
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[(i11 - i13) - 1] = (i12 - r12) - 1;
                iArr[i11 + i13] = (i13 / 15) + i13 + i12 + 1;
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < nbLayers) {
            int i16 = ((nbLayers - i14) << i9) + (isCompact ? 9 : 12);
            int i17 = i14 << 1;
            int i18 = (i8 - 1) - i17;
            int i19 = 0;
            while (i19 < i16) {
                int i20 = i19 << 1;
                int i21 = 0;
                while (i21 < i9) {
                    int i22 = i17 + i21;
                    int i23 = i17 + i19;
                    zArr[i15 + i20 + i21] = bitMatrix.get(iArr[i22], iArr[i23]);
                    int i24 = iArr[i23];
                    int i25 = i18 - i21;
                    zArr[(i16 * 2) + i15 + i20 + i21] = bitMatrix.get(i24, iArr[i25]);
                    int i26 = i18 - i19;
                    zArr[(i16 * 4) + i15 + i20 + i21] = bitMatrix.get(iArr[i25], iArr[i26]);
                    zArr[(i16 * 6) + i15 + i20 + i21] = bitMatrix.get(iArr[i26], iArr[i22]);
                    i21++;
                    nbLayers = nbLayers;
                    isCompact = isCompact;
                    i9 = 2;
                }
                i19++;
                i9 = 2;
            }
            i15 += i16 << 3;
            i14++;
            i9 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i8) {
        int i9 = AnonymousClass1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i9 == 1) {
            return UPPER_TABLE[i8];
        }
        if (i9 == 2) {
            return LOWER_TABLE[i8];
        }
        if (i9 == 3) {
            return MIXED_TABLE[i8];
        }
        if (i9 == 4) {
            return PUNCT_TABLE[i8];
        }
        if (i9 == 5) {
            return DIGIT_TABLE[i8];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String getEncodedData(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i8 = 0;
        while (i8 < length) {
            if (table != Table.BINARY) {
                int i9 = table == Table.DIGIT ? 4 : 5;
                if (length - i8 < i9) {
                    break;
                }
                int readCode = readCode(zArr, i8, i9);
                i8 += i9;
                String character = getCharacter(table, readCode);
                if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb.append(character);
                }
                table = table2;
            } else {
                if (length - i8 < 5) {
                    break;
                }
                int readCode2 = readCode(zArr, i8, 5);
                int i10 = i8 + 5;
                if (readCode2 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    readCode2 = readCode(zArr, i10, 11) + 31;
                    i10 = i8 + 16;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= readCode2) {
                        i8 = i10;
                        break;
                    }
                    if (length - i10 < 8) {
                        i8 = length;
                        break;
                    }
                    sb.append((char) readCode(zArr, i10, 8));
                    i10 += 8;
                    i11++;
                }
                table = table2;
            }
        }
        return sb.toString();
    }

    private static Table getTable(char c8) {
        return c8 != 'B' ? c8 != 'D' ? c8 != 'P' ? c8 != 'L' ? c8 != 'M' ? Table.UPPER : Table.MIXED : Table.LOWER : Table.PUNCT : Table.DIGIT : Table.BINARY;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i8) {
        int length = zArr.length - i8;
        return (byte) (length >= 8 ? readCode(zArr, i8, 8) : readCode(zArr, i8, length) << (8 - length));
    }

    private static int readCode(boolean[] zArr, int i8, int i9) {
        int i10 = 0;
        for (int i11 = i8; i11 < i8 + i9; i11++) {
            i10 <<= 1;
            if (zArr[i11]) {
                i10 |= 1;
            }
        }
        return i10;
    }

    private static int totalBitsInLayer(int i8, boolean z7) {
        return ((z7 ? 88 : 112) + (i8 << 4)) * i8;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) {
        this.ddata = aztecDetectorResult;
        boolean[] correctBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(correctBits), getEncodedData(correctBits), null, null);
        decoderResult.setNumBits(correctBits.length);
        return decoderResult;
    }
}
