package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import java.util.List;

/* loaded from: classes4.dex */
final class BitArrayBuilder {
    private BitArrayBuilder() {
    }

    static BitArray buildBitArray(List<ExpandedPair> list) {
        int size = list.size() << 1;
        int i8 = size - 1;
        if (list.get(list.size() - 1).getRightChar() == null) {
            i8 = size - 2;
        }
        BitArray bitArray = new BitArray(i8 * 12);
        int i9 = 0;
        int value = list.get(0).getRightChar().getValue();
        for (int i10 = 11; i10 >= 0; i10--) {
            if (((1 << i10) & value) != 0) {
                bitArray.set(i9);
            }
            i9++;
        }
        for (int i11 = 1; i11 < list.size(); i11++) {
            ExpandedPair expandedPair = list.get(i11);
            int value2 = expandedPair.getLeftChar().getValue();
            for (int i12 = 11; i12 >= 0; i12--) {
                if (((1 << i12) & value2) != 0) {
                    bitArray.set(i9);
                }
                i9++;
            }
            if (expandedPair.getRightChar() != null) {
                int value3 = expandedPair.getRightChar().getValue();
                for (int i13 = 11; i13 >= 0; i13--) {
                    if (((1 << i13) & value3) != 0) {
                        bitArray.set(i9);
                    }
                    i9++;
                }
            }
        }
        return bitArray;
    }
}
