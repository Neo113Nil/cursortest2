package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    protected static int appendPattern(boolean[] zArr, int i8, int[] iArr, boolean z7) {
        int i9 = 0;
        for (int i10 : iArr) {
            int i11 = 0;
            while (i11 < i10) {
                zArr[i8] = z7;
                i11++;
                i8++;
            }
            i9 += i10;
            z7 = !z7;
        }
        return i9;
    }

    private static BitMatrix renderResult(boolean[] zArr, int i8, int i9, int i10) {
        int length = zArr.length;
        int i11 = i10 + length;
        int max = Math.max(i8, i11);
        int max2 = Math.max(1, i9);
        int i12 = max / i11;
        int i13 = (max - (length * i12)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i14 = 0;
        while (i14 < length) {
            if (zArr[i14]) {
                bitMatrix.setRegion(i13, 0, i12, max2);
            }
            i14++;
            i13 += i12;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9) {
        return encode(str, barcodeFormat, i8, i9, null);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i8 + 'x' + i9);
        }
        int defaultMargin = getDefaultMargin();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                defaultMargin = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return renderResult(encode(str), i8, i9, defaultMargin);
    }
}
