package com.google.zxing.oned.rss.expanded.decoders;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
abstract class AI01weightDecoder extends AI01decoder {
    AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    protected abstract void addWeightCode(StringBuilder sb, int i8);

    protected abstract int checkWeight(int i8);

    final void encodeCompressedWeight(StringBuilder sb, int i8, int i9) {
        int extractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i8, i9);
        addWeightCode(sb, extractNumericValueFromBitArray);
        int checkWeight = checkWeight(extractNumericValueFromBitArray);
        int i10 = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
        for (int i11 = 0; i11 < 5; i11++) {
            if (checkWeight / i10 == 0) {
                sb.append('0');
            }
            i10 /= 10;
        }
        sb.append(checkWeight);
    }
}
