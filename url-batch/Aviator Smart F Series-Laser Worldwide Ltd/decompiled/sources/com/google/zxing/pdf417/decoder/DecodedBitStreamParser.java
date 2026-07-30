package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i8 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i8 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i8] = bigIntegerArr2[i8 - 1].multiply(valueOf);
            i8++;
        }
    }

    private DecodedBitStreamParser() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0074. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int byteCompaction(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static DecoderResult decode(int[] iArr, String str) {
        int i8;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i9 = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        int i10 = 2;
        while (i10 < iArr[0]) {
            if (i9 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i9) {
                    case 900:
                        i8 = textCompaction(iArr, i10, sb);
                        break;
                    case 901:
                        i8 = byteCompaction(i9, iArr, charset, i10, sb);
                        break;
                    case 902:
                        i8 = numericCompaction(iArr, i10, sb);
                        break;
                    default:
                        switch (i9) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                i8 = i10 + 1;
                                break;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                i8 = i10 + 2;
                                break;
                            case ECI_CHARSET /* 927 */:
                                i8 = i10 + 1;
                                charset = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i10]).name());
                                break;
                            case 928:
                                i8 = decodeMacroBlock(iArr, i10, pDF417ResultMetadata);
                                break;
                            default:
                                i8 = textCompaction(iArr, i10 - 1, sb);
                                break;
                        }
                }
            } else {
                i8 = i10 + 1;
                sb.append((char) iArr[i10]);
            }
            if (i8 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i10 = i8 + 1;
            i9 = iArr[i8];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i8) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i9 = 0; i9 < i8; i9++) {
            bigInteger = bigInteger.add(EXP900[(i8 - i9) - 1].multiply(BigInteger.valueOf(iArr[i9])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    static int decodeMacroBlock(int[] iArr, int i8, PDF417ResultMetadata pDF417ResultMetadata) {
        if (i8 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i9 = 0;
        while (i9 < 2) {
            iArr2[i9] = iArr[i8];
            i9++;
            i8++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int textCompaction = textCompaction(iArr, i8, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        int i10 = iArr[textCompaction] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD ? textCompaction + 1 : -1;
        while (textCompaction < iArr[0]) {
            int i11 = iArr[textCompaction];
            if (i11 == MACRO_PDF417_TERMINATOR) {
                textCompaction++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i11 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[textCompaction + 1]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        textCompaction = textCompaction(iArr, textCompaction + 2, sb2);
                        pDF417ResultMetadata.setFileName(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        textCompaction = numericCompaction(iArr, textCompaction + 2, sb3);
                        pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        textCompaction = numericCompaction(iArr, textCompaction + 2, sb4);
                        pDF417ResultMetadata.setTimestamp(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        textCompaction = textCompaction(iArr, textCompaction + 2, sb5);
                        pDF417ResultMetadata.setSender(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        textCompaction = textCompaction(iArr, textCompaction + 2, sb6);
                        pDF417ResultMetadata.setAddressee(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        textCompaction = numericCompaction(iArr, textCompaction + 2, sb7);
                        pDF417ResultMetadata.setFileSize(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        textCompaction = numericCompaction(iArr, textCompaction + 2, sb8);
                        pDF417ResultMetadata.setChecksum(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i10 != -1) {
            int i12 = textCompaction - i10;
            if (pDF417ResultMetadata.isLastSegment()) {
                i12--;
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i10, i12 + i10));
        }
        return textCompaction;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void decodeTextCompaction(int[] iArr, int[] iArr2, int i8, StringBuilder sb) {
        Mode mode;
        int i9;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = iArr[i10];
            char c8 = ' ';
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[mode2.ordinal()]) {
                case 1:
                    if (i11 < 26) {
                        i9 = i11 + 65;
                        c8 = (char) i9;
                        break;
                    } else {
                        if (i11 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i11) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c8 = 0;
                                    Mode mode4 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i10]);
                        }
                        c8 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i11 < 26) {
                        i9 = i11 + 97;
                        c8 = (char) i9;
                        break;
                    } else {
                        if (i11 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i11) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    c8 = 0;
                                    Mode mode42 = mode;
                                    mode3 = mode2;
                                    mode2 = mode42;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c8 = 0;
                                    Mode mode422 = mode;
                                    mode3 = mode2;
                                    mode2 = mode422;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i10]);
                        }
                        c8 = 0;
                        break;
                    }
                    break;
                case 3:
                    if (i11 < 25) {
                        c8 = MIXED_CHARS[i11];
                        break;
                    } else {
                        if (i11 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i11) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c8 = 0;
                                    Mode mode4222 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4222;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i10]);
                        }
                        c8 = 0;
                        break;
                    }
                case 4:
                    if (i11 < 29) {
                        c8 = PUNCT_CHARS[i11];
                        break;
                    } else {
                        if (i11 == 29) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            sb.append((char) iArr2[i10]);
                        }
                        c8 = 0;
                        break;
                    }
                case 5:
                    if (i11 < 26) {
                        c8 = (char) (i11 + 65);
                    } else if (i11 != 26) {
                        if (i11 == 900) {
                            mode2 = Mode.ALPHA;
                            c8 = 0;
                            break;
                        }
                        mode2 = mode3;
                        c8 = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i11 < 29) {
                        c8 = PUNCT_CHARS[i11];
                        mode2 = mode3;
                        break;
                    } else {
                        if (i11 == 29) {
                            mode2 = Mode.ALPHA;
                        } else if (i11 != 900) {
                            if (i11 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                sb.append((char) iArr2[i10]);
                            }
                            mode2 = mode3;
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c8 = 0;
                        break;
                    }
                default:
                    c8 = 0;
                    break;
            }
            if (c8 != 0) {
                sb.append(c8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int numericCompaction(int[] iArr, int i8, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z7 = false;
        while (true) {
            int i9 = 0;
            while (true) {
                int i10 = iArr[0];
                if (i8 < i10 && !z7) {
                    int i11 = i8 + 1;
                    int i12 = iArr[i8];
                    if (i11 == i10) {
                        z7 = true;
                    }
                    if (i12 < 900) {
                        iArr2[i9] = i12;
                        i9++;
                    } else {
                        if (i12 != 900 && i12 != 901 && i12 != 928) {
                            switch (i12) {
                            }
                            if (i9 % 15 == 0 || i12 == 902 || z7) {
                            }
                        }
                        z7 = true;
                        if (i9 % 15 == 0) {
                        }
                    }
                    i8 = i11;
                    if (i9 % 15 == 0) {
                    }
                }
            }
            sb.append(decodeBase900toBase10(iArr2, i9));
        }
        return i8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0036. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i8, StringBuilder sb) {
        int i9 = iArr[0];
        int[] iArr2 = new int[(i9 - i8) << 1];
        int[] iArr3 = new int[(i9 - i8) << 1];
        boolean z7 = false;
        int i10 = 0;
        while (i8 < iArr[0] && !z7) {
            int i11 = i8 + 1;
            int i12 = iArr[i8];
            if (i12 < 900) {
                iArr2[i10] = i12 / 30;
                iArr2[i10 + 1] = i12 % 30;
                i10 += 2;
            } else if (i12 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i12 != 928) {
                    switch (i12) {
                        case 900:
                            iArr2[i10] = 900;
                            i10++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i12) {
                            }
                    }
                }
                z7 = true;
            } else {
                iArr2[i10] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i8 += 2;
                iArr3[i10] = iArr[i11];
                i10++;
            }
            i8 = i11;
        }
        decodeTextCompaction(iArr2, iArr3, i10, sb);
        return i8;
    }
}
