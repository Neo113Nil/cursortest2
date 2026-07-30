package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
abstract class AI01decoder extends AbstractExpandedDecoder {
    static final int GTIN_SIZE = 40;

    AI01decoder(BitArray bitArray) {
        super(bitArray);
    }

    private static void appendCheckDigit(StringBuilder sb, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < 13; i10++) {
            int charAt = sb.charAt(i10 + i8) - '0';
            if ((i10 & 1) == 0) {
                charAt *= 3;
            }
            i9 += charAt;
        }
        int i11 = 10 - (i9 % 10);
        sb.append(i11 != 10 ? i11 : 0);
    }

    final void encodeCompressedGtin(StringBuilder sb, int i8) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        encodeCompressedGtinWithoutAI(sb, i8, length);
    }

    final void encodeCompressedGtinWithoutAI(StringBuilder sb, int i8, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            int extractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray((i10 * 10) + i8, 10);
            if (extractNumericValueFromBitArray / 100 == 0) {
                sb.append('0');
            }
            if (extractNumericValueFromBitArray / 10 == 0) {
                sb.append('0');
            }
            sb.append(extractNumericValueFromBitArray);
        }
        appendCheckDigit(sb, i9);
    }
}
