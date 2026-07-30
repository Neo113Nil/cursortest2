package com.google.zxing.datamatrix.decoder;

import cn.hutool.core.io.file.c;
import com.baidu.ar.auth.FeatureCodes;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.pqc.math.linearalgebra.k;

/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', k.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', k.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', k.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', k.MATRIX_TYPE_ZERO};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', c.UNIX_SEPARATOR, ':', ';', '<', '=', '>', '?', '@', '[', c.WINDOWS_SEPARATOR, ']', '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', k.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', k.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', k.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', k.MATRIX_TYPE_ZERO, '{', '|', '}', '~', Ascii.MAX};
    }

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr) {
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode mode = Mode.ASCII_ENCODE;
        do {
            Mode mode2 = Mode.ASCII_ENCODE;
            if (mode == mode2) {
                mode = decodeAsciiSegment(bitSource, sb, sb2);
            } else {
                int i8 = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[mode.ordinal()];
                if (i8 == 1) {
                    decodeC40Segment(bitSource, sb);
                } else if (i8 == 2) {
                    decodeTextSegment(bitSource, sb);
                } else if (i8 == 3) {
                    decodeAnsiX12Segment(bitSource, sb);
                } else if (i8 == 4) {
                    decodeEdifactSegment(bitSource, sb);
                } else {
                    if (i8 != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    decodeBase256Segment(bitSource, sb, arrayList);
                }
                mode = mode2;
            }
            if (mode == Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, sb3, arrayList, null);
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i8 = 0; i8 < 3; i8++) {
                int i9 = iArr[i8];
                if (i9 == 0) {
                    sb.append('\r');
                } else if (i9 == 1) {
                    sb.append('*');
                } else if (i9 == 2) {
                    sb.append('>');
                } else if (i9 == 3) {
                    sb.append(' ');
                } else if (i9 < 14) {
                    sb.append((char) (i9 + 44));
                } else {
                    if (i9 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    sb.append((char) (i9 + 51));
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, StringBuilder sb, StringBuilder sb2) {
        boolean z7 = false;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits == 0) {
                throw FormatException.getFormatInstance();
            }
            if (readBits > 128) {
                if (readBits != 129) {
                    if (readBits > 229) {
                        switch (readBits) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case GpsTrainingDaoProxy.GPS_TYPE /* 241 */:
                                break;
                            case 235:
                                z7 = true;
                                break;
                            case 236:
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (readBits != 254 || bitSource.available() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i8 = readBits + ErrorCode.ERR_OPEN_FILE;
                        if (i8 < 10) {
                            sb.append('0');
                        }
                        sb.append(i8);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z7) {
                    readBits += 128;
                }
                sb.append((char) (readBits - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuilder sb, Collection<byte[]> collection) {
        int byteOffset = bitSource.getByteOffset();
        int i8 = byteOffset + 2;
        int unrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (unrandomize255State == 0) {
            unrandomize255State = bitSource.available() / 8;
        } else if (unrandomize255State >= 250) {
            unrandomize255State = ((unrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i8);
            i8 = byteOffset + 3;
        }
        if (unrandomize255State < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[unrandomize255State];
        int i9 = 0;
        while (i9 < unrandomize255State) {
            if (bitSource.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i9] = (byte) unrandomize255State(bitSource.readBits(8), i8);
            i9++;
            i8++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e8) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e8)));
        }
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        boolean z7 = false;
        int i8 = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i9 = 0; i9 < 3; i9++) {
                int i10 = iArr[i9];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            char[] cArr = C40_SHIFT2_SET_CHARS;
                            if (i10 < cArr.length) {
                                char c8 = cArr[i10];
                                if (z7) {
                                    sb.append((char) (c8 + 128));
                                    z7 = false;
                                } else {
                                    sb.append(c8);
                                }
                            } else if (i10 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i10 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z7 = true;
                            }
                            i8 = 0;
                        } else {
                            if (i8 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z7) {
                                sb.append((char) (i10 + 224));
                                z7 = false;
                                i8 = 0;
                            } else {
                                sb.append((char) (i10 + 96));
                                i8 = 0;
                            }
                        }
                    } else if (z7) {
                        sb.append((char) (i10 + 128));
                        z7 = false;
                        i8 = 0;
                    } else {
                        sb.append((char) i10);
                        i8 = 0;
                    }
                } else if (i10 < 3) {
                    i8 = i10 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i10 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c9 = cArr2[i10];
                    if (z7) {
                        sb.append((char) (c9 + 128));
                        z7 = false;
                    } else {
                        sb.append(c9);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder sb) {
        while (bitSource.available() > 16) {
            for (int i8 = 0; i8 < 4; i8++) {
                int readBits = bitSource.readBits(6);
                if (readBits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((readBits & 32) == 0) {
                    readBits |= 64;
                }
                sb.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bitSource, StringBuilder sb) {
        int readBits;
        int[] iArr = new int[3];
        boolean z7 = false;
        int i8 = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i9 = 0; i9 < 3; i9++) {
                int i10 = iArr[i9];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i10 < cArr.length) {
                                char c8 = cArr[i10];
                                if (z7) {
                                    sb.append((char) (c8 + 128));
                                    z7 = false;
                                } else {
                                    sb.append(c8);
                                }
                            } else if (i10 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i10 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z7 = true;
                            }
                            i8 = 0;
                        } else {
                            if (i8 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i10 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c9 = cArr2[i10];
                            if (z7) {
                                sb.append((char) (c9 + 128));
                                z7 = false;
                                i8 = 0;
                            } else {
                                sb.append(c9);
                                i8 = 0;
                            }
                        }
                    } else if (z7) {
                        sb.append((char) (i10 + 128));
                        z7 = false;
                        i8 = 0;
                    } else {
                        sb.append((char) i10);
                        i8 = 0;
                    }
                } else if (i10 < 3) {
                    i8 = i10 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i10 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c10 = cArr3[i10];
                    if (z7) {
                        sb.append((char) (c10 + 128));
                        z7 = false;
                    } else {
                        sb.append(c10);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int i8, int i9, int[] iArr) {
        int i10 = ((i8 << 8) + i9) - 1;
        int i11 = i10 / FeatureCodes.ADVANCE_BEAUTY;
        iArr[0] = i11;
        int i12 = i10 - (i11 * FeatureCodes.ADVANCE_BEAUTY);
        int i13 = i12 / 40;
        iArr[1] = i13;
        iArr[2] = i12 - (i13 * 40);
    }

    private static int unrandomize255State(int i8, int i9) {
        int i10 = i8 - (((i9 * 149) % 255) + 1);
        return i10 >= 0 ? i10 : i10 + 256;
    }
}
