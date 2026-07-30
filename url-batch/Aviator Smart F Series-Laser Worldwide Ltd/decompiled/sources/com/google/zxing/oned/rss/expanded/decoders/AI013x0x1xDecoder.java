package com.google.zxing.oned.rss.expanded.decoders;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
final class AI013x0x1xDecoder extends AI01weightDecoder {
    private static final int DATE_SIZE = 16;
    private static final int HEADER_SIZE = 8;
    private static final int WEIGHT_SIZE = 20;
    private final String dateCode;
    private final String firstAIdigits;

    AI013x0x1xDecoder(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.dateCode = str2;
        this.firstAIdigits = str;
    }

    private void encodeCompressedDate(StringBuilder sb, int i8) {
        int extractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i8, 16);
        if (extractNumericValueFromBitArray == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.dateCode);
        sb.append(')');
        int i9 = extractNumericValueFromBitArray % 32;
        int i10 = extractNumericValueFromBitArray / 32;
        int i11 = (i10 % 12) + 1;
        int i12 = i10 / 12;
        if (i12 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i12);
        if (i11 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i11);
        if (i9 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i9);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    protected void addWeightCode(StringBuilder sb, int i8) {
        sb.append('(');
        sb.append(this.firstAIdigits);
        sb.append(i8 / AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        sb.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    protected int checkWeight(int i8) {
        return i8 % AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        encodeCompressedGtin(sb, 8);
        encodeCompressedWeight(sb, 48, 20);
        encodeCompressedDate(sb, 68);
        return sb.toString();
    }
}
